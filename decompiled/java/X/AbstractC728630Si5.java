package X;

import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0Si5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC728630Si5<T> implements C0R5K, WeakHandler.IHandler {
    public final WeakHandler LL = new WeakHandler(Looper.getMainLooper(), this);
    public T LLILLJJLI;
    public List<InterfaceC1526205yG> LLILLL;

    public final void LIZ(InterfaceC1526205yG interfaceC1526205yG) {
        if (interfaceC1526205yG != null) {
            if (this.LLILLL == null) {
                this.LLILLL = new LinkedList();
            }
            this.LLILLL.add(interfaceC1526205yG);
            return;
        }
        throw new NullPointerException("INotifyListener could not be null");
    }

    public void LIZIZ(T t) {
        this.LLILLJJLI = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        if (HandlerHook.getMessageObj(message.obj) instanceof Exception) {
            HandlerHook.getMessageObj(message.obj);
            List<InterfaceC1526205yG> list = this.LLILLL;
            if (list != null) {
                Iterator<InterfaceC1526205yG> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().onFailed((Exception) HandlerHook.getMessageObj(message.obj));
                }
                return;
            }
            return;
        }
        LIZIZ(HandlerHook.getMessageObj(message.obj));
        List<InterfaceC1526205yG> list2 = this.LLILLL;
        if (list2 != null) {
            Iterator<InterfaceC1526205yG> it3 = list2.iterator();
            while (it3.hasNext()) {
                it3.next().onSuccess();
            }
        }
    }
}
