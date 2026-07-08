package X;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17q1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21151917q1 extends AbstractC1701460uNU {
    public final void LIZIZ() {
        synchronized (this.LLILLJJLI) {
            try {
                if (this.LLILLL.size() > 0) {
                    String strRemove = this.LLILLL.remove(0);
                    ArrayList<Function0<Unit>> arrayList = this.LLILLJJLI.get(strRemove);
                    if (arrayList != null) {
                        if (arrayList.size() > 0) {
                            arrayList.remove(0).invoke();
                        } else {
                            this.LLILLJJLI.remove(strRemove);
                        }
                    }
                    if (this.LLILLJJLI.size() > 0 && !this.LL.hasMessages(1)) {
                        Message messageObtainMessage = this.LL.obtainMessage();
                        messageObtainMessage.what = 1;
                        messageObtainMessage.obj = null;
                        this.LL.removeMessages(1);
                        C786410Ut5.LJLJLJ(this.LL, messageObtainMessage, Mp4ScreenVideoLoadTimeout.CONTROL);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C21151917q1() {
        C786410Ut5.f3(new MessageQueue.IdleHandler() { // from class: X.17q2
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                this.LL.LIZIZ();
                return true;
            }
        }, Looper.getMainLooper().getQueue());
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        LIZIZ();
        return true;
    }

    @Override // X.InterfaceC21264518Jn
    public final void LIZ(int i, Context context, InterfaceC21263418Jc interfaceC21263418Jc) {
        synchronized (this.LLILLJJLI) {
            try {
                if (this.LLILLJJLI.get(interfaceC21263418Jc.LJIIIZ()) == null) {
                    this.LLILLJJLI.put(interfaceC21263418Jc.LJIIIZ(), new ArrayList<>());
                }
                ArrayList<Function0<Unit>> arrayList = this.LLILLJJLI.get(interfaceC21263418Jc.LJIIIZ());
                if (arrayList == null) {
                    Intrinsics.LJIIL();
                }
                arrayList.add(new C21151617py(context, interfaceC21263418Jc, new C21263218Ja(i, context, interfaceC21263418Jc)));
                this.LLILLL.add(interfaceC21263418Jc.LJIIIZ());
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (this.LLILLJJLI.size() != 0 && !this.LL.hasMessages(1)) {
            Message messageObtainMessage = this.LL.obtainMessage();
            messageObtainMessage.what = 1;
            messageObtainMessage.obj = null;
            this.LL.removeMessages(1);
            C786410Ut5.LJLJLJ(this.LL, messageObtainMessage, Mp4ScreenVideoLoadTimeout.CONTROL);
        }
    }
}
