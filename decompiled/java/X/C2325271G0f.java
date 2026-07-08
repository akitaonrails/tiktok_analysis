package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.1G0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2325271G0f extends AbstractC468201s0 {
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
            default:
                super.LIZ(bitmap);
                break;
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
            default:
                super.onFailed(th);
                break;
        }
    }

    public C2325271G0f(InterfaceC2281081EQg interfaceC2281081EQg, int i) {
        this.$t = i;
        this.l0 = interfaceC2281081EQg;
    }

    public static final void LIZ$0(C2325271G0f c2325271G0f, Bitmap bitmap) {
        InterfaceC2281081EQg interfaceC2281081EQg = (InterfaceC2281081EQg) c2325271G0f.l0;
        if (interfaceC2281081EQg != null) {
            interfaceC2281081EQg.LIZ(bitmap);
        }
    }

    public static final void LIZ$1(C2325271G0f c2325271G0f, Bitmap bitmap) {
        InterfaceC2281081EQg interfaceC2281081EQg = (InterfaceC2281081EQg) c2325271G0f.l0;
        if (interfaceC2281081EQg != null) {
            interfaceC2281081EQg.LIZ(bitmap);
        }
    }

    public static final void onFailed$0(C2325271G0f c2325271G0f, Throwable th) {
        InterfaceC2281081EQg interfaceC2281081EQg = (InterfaceC2281081EQg) c2325271G0f.l0;
        if (interfaceC2281081EQg != null) {
            interfaceC2281081EQg.onFailed();
        }
    }

    public static final void onFailed$1(C2325271G0f c2325271G0f, Throwable th) {
        InterfaceC2281081EQg interfaceC2281081EQg = (InterfaceC2281081EQg) c2325271G0f.l0;
        if (interfaceC2281081EQg != null) {
            interfaceC2281081EQg.onFailed();
        }
    }
}
