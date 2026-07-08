package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AimeCameraScene;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0uHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698030uHx extends AbstractC2173821A5s {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C1698030uHx c1698030uHx) {
        AimeCameraScene aimeCameraScene = (AimeCameraScene) c1698030uHx.l0;
        Activity activity = aimeCameraScene.mActivity;
        if (activity != null) {
            C341540DaC.LIZ(activity, new AwS569S0100000_25(aimeCameraScene, 34));
        }
    }

    public static final void LIZIZ$1(C1698030uHx c1698030uHx) {
        ((Function0) ((C05P1) c1698030uHx.l0).getValue()).invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698030uHx(AimeCameraScene aimeCameraScene, int i) {
        super(true);
        this.$t = i;
        this.l0 = aimeCameraScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698030uHx(C05P0 c05p0, boolean z, int i) {
        super(z);
        this.$t = i;
        this.l0 = c05p0;
    }
}
