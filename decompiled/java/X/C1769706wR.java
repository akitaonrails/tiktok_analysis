package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06wR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1769706wR implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onCanceled$0(C1769706wR c1769706wR) {
    }

    public static final void onProgress$0(C1769706wR c1769706wR, float f) {
    }

    public static final void onProgress$1(C1769706wR c1769706wR, float f) {
    }

    public static final void onProgress$2(C1769706wR c1769706wR, float f) {
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

    public static final void onCanceled$1(C1769706wR c1769706wR) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769706wR.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onCanceled$2(C1769706wR c1769706wR) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769706wR.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1769706wR(Object obj, Function1<? super Bitmap, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1769706wR c1769706wR, Bitmap bitmap) {
        ((Function1) c1769706wR.l0).invoke(bitmap);
    }

    public static final void LIZ$1(C1769706wR c1769706wR, Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCopy = bitmap.copy(config, false);
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769706wR.l0;
        C189200o6.m2constructorimpl(bitmapCopy);
        interfaceC20236714Gf.resumeWith(bitmapCopy);
    }

    public static final void LIZ$2(C1769706wR c1769706wR, Bitmap bitmap) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769706wR.l0;
        C189200o6.m2constructorimpl(bitmap);
        interfaceC20236714Gf.resumeWith(bitmap);
    }

    public static final void onFailed$0(C1769706wR c1769706wR, Throwable th) {
        ((Function1) c1769706wR.l0).invoke(null);
    }

    public static final void onFailed$1(C1769706wR c1769706wR, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769706wR.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onFailed$2(C1769706wR c1769706wR, Throwable th) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769706wR.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }
}
