package X;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.utils.WeakHandler;

/* JADX INFO: renamed from: X.0dQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050050dQp extends AbstractC1050010dQl implements InterfaceC1050080dQs {
    public int LJII;
    public boolean LJIIIIZZ;
    public final WeakHandler LJIIIZ;

    public C1050050dQp(Context context) {
        super(context);
        this.LJII = 500;
        this.LJIIIZ = new WeakHandler(Looper.getMainLooper(), this);
    }

    @Override // X.AbstractC1050010dQl
    public final boolean LJ(Object... objArr) {
        C1049700dQG c1049700dQG;
        if (objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        this.LJII = C1050100dQu.LIZIZ(String.valueOf(this.LIZLLL.get("delay")), 500);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    WeakHandler weakHandler = this.LJIIIZ;
                    if (weakHandler != null) {
                        weakHandler.removeMessages(1102);
                    }
                    this.LJIIIIZZ = false;
                }
            } else if (this.LJIIIIZZ && (c1049700dQG = this.LIZ) != null) {
                c1049700dQG.LIZIZ(this.LJ, this.LIZJ.LIZIZ);
                this.LJIIIIZZ = false;
                WeakHandler weakHandler2 = this.LJIIIZ;
                if (weakHandler2 != null) {
                    weakHandler2.removeMessages(1102);
                }
            } else {
                WeakHandler weakHandler3 = this.LJIIIZ;
                if (weakHandler3 != null) {
                    weakHandler3.removeMessages(1102);
                }
                this.LJIIIIZZ = false;
                return false;
            }
        } else {
            C786410Ut5.LJLJJI(1102, this.LJII, this.LJIIIZ);
        }
        return true;
    }

    @Override // X.InterfaceC1050080dQs
    public final void handleMsg(Message message) {
        if (message.what == 1102) {
            this.LJIIIIZZ = true;
            WeakHandler weakHandler = this.LJIIIZ;
            if (weakHandler != null) {
                weakHandler.removeMessages(1102);
            }
        }
    }
}
