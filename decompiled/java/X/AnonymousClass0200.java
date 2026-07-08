package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0200, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class AnonymousClass0200 implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onProgress$0(AnonymousClass0200 anonymousClass0200, float f) {
    }

    public static final void onProgress$1(AnonymousClass0200 anonymousClass0200, float f) {
    }

    public static final void onProgress$2(AnonymousClass0200 anonymousClass0200, float f) {
    }

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
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
            case 2:
                onCanceled$2(this);
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
            case 2:
                onFailed$2(this, th);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onProgress(float f) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, f);
                break;
            case 1:
                onProgress$1(this, f);
                break;
            case 2:
                onProgress$2(this, f);
                break;
        }
    }

    public static final void onCanceled$0(AnonymousClass0200 anonymousClass0200) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) anonymousClass0200.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onCanceled$1(AnonymousClass0200 anonymousClass0200) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) anonymousClass0200.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onCanceled$2(AnonymousClass0200 anonymousClass0200) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) anonymousClass0200.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public AnonymousClass0200(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AnonymousClass0200 anonymousClass0200, Bitmap bitmap) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) anonymousClass0200.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC20236714Gf.resumeWith(bitmap);
    }

    public static final void LIZ$1(AnonymousClass0200 anonymousClass0200, Bitmap bitmap) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) anonymousClass0200.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC20236714Gf.resumeWith(bitmap);
    }

    public static final void LIZ$2(AnonymousClass0200 anonymousClass0200, Bitmap bitmap) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) anonymousClass0200.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC1364105Vn.resumeWith(bitmap);
    }

    public static final void onFailed$0(AnonymousClass0200 anonymousClass0200, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) anonymousClass0200.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onFailed$1(AnonymousClass0200 anonymousClass0200, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) anonymousClass0200.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onFailed$2(AnonymousClass0200 anonymousClass0200, Throwable th) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) anonymousClass0200.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }
}
