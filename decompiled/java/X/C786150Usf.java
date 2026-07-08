package X;

import android.content.Intent;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.verify.pin.PinVerifyViewAssem;

/* JADX INFO: renamed from: X.0Usf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786150Usf implements OnActivityResultCallback {
    public final int $t;
    public Object l0;

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (this.$t) {
            case 0:
                onActivityResult$0(this, i, i2, intent);
                break;
            case 1:
                onActivityResult$1(this, i, i2, intent);
                break;
            case 2:
                onActivityResult$2(this, i, i2, intent);
                break;
        }
    }

    public C786150Usf(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onActivityResult$0(C786150Usf c786150Usf, int i, int i2, Intent intent) {
        ((PinVerifyViewAssem) c786150Usf.l0).Ho("CANCEL", null);
    }

    public static final void onActivityResult$1(C786150Usf c786150Usf, int i, int i2, Intent intent) {
        C19EG c19eg = ((C0TAV) c786150Usf.l0).LIZJ;
        if (c19eg != null && !c19eg.isFinishing() && !((C0TAV) c786150Usf.l0).LIZJ.isDestroyed()) {
            ((C0TAV) c786150Usf.l0).LIZ().vQ2();
        }
    }

    public static final void onActivityResult$2(C786150Usf c786150Usf, int i, int i2, Intent intent) {
        if (!((C0TAV) c786150Usf.l0).LIZJ.isFinishing() && !((C0TAV) c786150Usf.l0).LIZJ.isDestroyed()) {
            ((C0TAV) c786150Usf.l0).LIZ().vQ2();
        }
    }
}
