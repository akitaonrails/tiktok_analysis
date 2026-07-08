package X;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.utils.WeakHandler;

/* JADX INFO: renamed from: X.0dQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050060dQq extends AbstractC1050010dQl implements InterfaceC1050080dQs {
    public int LJII;
    public final WeakHandler LJIIIIZZ;

    public C1050060dQq(Context context) {
        super(context);
        this.LJII = 500;
        this.LJIIIIZZ = new WeakHandler(Looper.getMainLooper(), this);
    }

    @Override // X.AbstractC1050010dQl
    public final boolean LJ(Object... objArr) {
        if (objArr.length > 0) {
            MotionEvent motionEvent = (MotionEvent) objArr[0];
            this.LJII = C1050100dQu.LIZIZ(String.valueOf(this.LIZLLL.get("delay")), 500);
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    this.LJIIIIZZ.removeMessages(1101);
                    return false;
                }
            } else {
                C786410Ut5.LJLJJI(1101, this.LJII, this.LJIIIIZZ);
                return false;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1050080dQs
    public final void handleMsg(Message message) {
        if (message.what == 1101) {
            C1049700dQG c1049700dQG = this.LIZ;
            if (c1049700dQG != null) {
                c1049700dQG.LIZIZ(this.LJ, this.LIZJ.LIZIZ);
            }
            WeakHandler weakHandler = this.LJIIIIZZ;
            if (weakHandler != null) {
                weakHandler.removeMessages(1101);
            }
        }
    }
}
