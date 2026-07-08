package X;

import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0QAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC666100QAu<T> implements WeakHandler.IHandler {
    public T mData;
    public WeakHandler mHandler = new WeakHandler(Looper.getMainLooper(), this);
    public boolean mIsLoading;
    public List<InterfaceC1526205yG> mNotifyListeners;

    public abstract boolean checkParams(Object... objArr);

    public T getData() {
        return this.mData;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public void addNotifyListener(InterfaceC1526205yG interfaceC1526205yG) {
        if (interfaceC1526205yG != null) {
            if (this.mNotifyListeners == null) {
                this.mNotifyListeners = new LinkedList();
            }
            this.mNotifyListeners.add(interfaceC1526205yG);
            return;
        }
        throw new NullPointerException("INotifyListener could not be null");
    }

    public void clearNotifyListener(InterfaceC1526205yG interfaceC1526205yG) {
        List<InterfaceC1526205yG> list;
        if (interfaceC1526205yG != null && (list = this.mNotifyListeners) != null) {
            list.remove(interfaceC1526205yG);
        }
    }

    public void handleData(T t) {
        this.mData = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        resetLoadingStatus(message);
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            HandlerHook.getMessageObj(message.obj);
            List<InterfaceC1526205yG> list = this.mNotifyListeners;
            if (list != null) {
                Iterator<InterfaceC1526205yG> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().onFailed((Exception) HandlerHook.getMessageObj(message.obj));
                }
                return;
            }
            return;
        }
        handleData(HandlerHook.getMessageObj(message.obj));
        List<InterfaceC1526205yG> list2 = this.mNotifyListeners;
        if (list2 != null) {
            Iterator<InterfaceC1526205yG> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().onSuccess();
            }
        }
    }

    public void resetLoadingStatus(Message message) {
        this.mIsLoading = false;
    }

    public boolean sendRequest(Object... objArr) {
        if (checkParams(objArr)) {
            this.mIsLoading = true;
            return true;
        }
        return false;
    }
}
