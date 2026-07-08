package X;

import android.graphics.Bitmap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C511301yx extends AbstractC468201s0 {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
            case 2:
                LIZ$2(this, bitmap);
                break;
            case 3:
                LIZ$3(this, bitmap);
                break;
            case 4:
                LIZ$4(this, bitmap);
                break;
            case 5:
                LIZ$5(this, bitmap);
                break;
            default:
                super.LIZ(bitmap);
                break;
        }
    }

    @Override // X.AbstractC468201s0, X.InterfaceC1331910klR
    public final void onCanceled() {
        if (5 - this.$t != 0) {
            super.onCanceled();
        } else {
            onCanceled$0(this);
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
            case 2:
                onFailed$2(this, th);
                break;
            case 3:
                onFailed$3(this, th);
                break;
            case 4:
                onFailed$4(this, th);
                break;
            case 5:
                onFailed$5(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public static final void onCanceled$0(C511301yx c511301yx) {
        if (((InterfaceC20236714Gf) c511301yx.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c511301yx.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
        }
    }

    public C511301yx(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C511301yx c511301yx, Bitmap bitmap) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c511301yx.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC1364105Vn.resumeWith(bitmap);
    }

    public static final void LIZ$1(C511301yx c511301yx, Bitmap bitmap) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c511301yx.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC20236714Gf.resumeWith(bitmap);
    }

    public static final void LIZ$2(C511301yx c511301yx, Bitmap bitmap) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c511301yx.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC1364105Vn.resumeWith(bitmap);
    }

    public static final void LIZ$3(C511301yx c511301yx, Bitmap bitmap) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c511301yx.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC1364105Vn.resumeWith(unit);
    }

    public static final void LIZ$4(C511301yx c511301yx, Bitmap bitmap) {
        if (bitmap != null) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c511301yx.l0;
            C189200o6.m2constructorimpl(bitmap);
            interfaceC20236714Gf.resumeWith(bitmap);
        } else {
            InterfaceC20236714Gf interfaceC20236714Gf2 = (InterfaceC20236714Gf) c511301yx.l0;
            C098200Yq c098200Yq = new C098200Yq(new RuntimeException("Failed to load bitmap"));
            C189200o6.m2constructorimpl(c098200Yq);
            interfaceC20236714Gf2.resumeWith(c098200Yq);
        }
    }

    public static final void LIZ$5(C511301yx c511301yx, Bitmap bitmap) {
        if (((InterfaceC20236714Gf) c511301yx.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c511301yx.l0;
            C189200o6.m2constructorimpl(bitmap);
            interfaceC20236714Gf.resumeWith(bitmap);
        }
    }

    public static final void onFailed$0(C511301yx c511301yx, Throwable th) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c511301yx.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFailed$1(C511301yx c511301yx, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c511301yx.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onFailed$2(C511301yx c511301yx, Throwable th) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c511301yx.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void onFailed$3(C511301yx c511301yx, Throwable th) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c511301yx.l0;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC1364105Vn.resumeWith(unit);
    }

    public static final void onFailed$4(C511301yx c511301yx, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Image loading failed with exception: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c511301yx.l0;
        if (th == null) {
            th = new RuntimeException("Loading shared image failed");
        }
        C098200Yq c098200Yq = new C098200Yq(th);
        C189200o6.m2constructorimpl(c098200Yq);
        interfaceC20236714Gf.resumeWith(c098200Yq);
    }

    public static final void onFailed$5(C511301yx c511301yx, Throwable th) {
        if (((InterfaceC20236714Gf) c511301yx.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c511301yx.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
        }
    }
}
