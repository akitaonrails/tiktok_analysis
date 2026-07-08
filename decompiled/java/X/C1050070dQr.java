package X;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import com.bytedance.adsdk.ugeno.utils.WeakHandler;
import java.util.Map;

/* JADX INFO: renamed from: X.0dQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050070dQr extends AbstractC1050010dQl implements InterfaceC1050080dQs {
    public int LJII;
    public final WeakHandler LJIIIIZZ;
    public int LJIIIZ;

    public C1050070dQr(Context context) {
        super(context);
        this.LJIIIIZZ = new WeakHandler(Looper.getMainLooper(), this);
        this.LJIIIZ = 0;
    }

    @Override // X.AbstractC1050010dQl
    public final boolean LJ(Object... objArr) {
        Map<String, Object> map = this.LIZLLL;
        if (map != null) {
            int iLIZIZ = C1050100dQu.LIZIZ(String.valueOf(map.get("loop")), 0);
            if (iLIZIZ <= 0) {
                this.LJIIIZ = -1;
            } else {
                this.LJIIIZ = iLIZIZ;
            }
            this.LJII = C1050100dQu.LIZIZ(String.valueOf(this.LIZLLL.get("duration")), 0);
        }
        C786410Ut5.LJLJJI(1001, this.LJII, this.LJIIIIZZ);
        return true;
    }

    @Override // X.InterfaceC1050080dQs
    public final void handleMsg(Message message) {
        int i;
        if (message.what == 1001) {
            this.LIZ.LIZIZ(this.LJ, this.LIZJ.LIZIZ);
            int i2 = this.LJIIIZ - 1;
            this.LJIIIZ = i2;
            if (i2 < 0) {
                int i3 = this.LJII;
                if (i3 != 0) {
                    C786410Ut5.LJLJJI(1001, i3, this.LJIIIIZZ);
                    return;
                }
            } else if (i2 > 0 && (i = this.LJII) != 0) {
                C786410Ut5.LJLJJI(1001, i, this.LJIIIIZZ);
                return;
            }
            this.LJIIIIZZ.removeMessages(1001);
        }
    }
}
