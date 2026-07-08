package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;

/* JADX INFO: renamed from: X.1Bem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210141Bem implements Handler.Callback {
    public final C2209901BeO LL;
    public final BPEAHandler LLILLJJLI;
    public boolean LLILLL = true;
    public int LLILZ;
    public boolean LLILZIL;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 9999) {
            this.LLILZIL = true;
            boolean zLJI = MethodIDManager.LJI(71645);
            this.LL.LJJZZI.LJIIIIZZ("App enter to background...", new Object[0]);
            if (this.LL.LJ() != null) {
                this.LL.LJ().getClass();
            }
            if (this.LL.LJ() != null) {
                this.LL.LJ().getClass();
            }
            C2209921BeQ c2209921BeQ = this.LL.LJJJJLI;
            if (c2209921BeQ.LLIZLLLIL != null) {
                C2209791BeD.LJIJJ().LJIIIZ(8, C2209921BeQ.LLJILJILJ, "monitor flush...", new Object[0]);
                c2209921BeQ.LLIZLLLIL.removeMessages(1);
                C786410Ut5.LJLJJI(1, 500L, c2209921BeQ.LLIZLLLIL);
            }
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
        return false;
    }

    public C2210141Bem(C2209901BeO c2209901BeO, Looper looper) {
        this.LL = c2209901BeO;
        this.LLILLJJLI = new BPEAHandler(looper, this);
    }
}
