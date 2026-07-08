package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0kxT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339370kxT implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;

    public static final void onProgress$0(C1339370kxT c1339370kxT, float f) {
    }

    public static final void onProgress$1(C1339370kxT c1339370kxT, float f) {
    }

    public static final void onProgress$2(C1339370kxT c1339370kxT, float f) {
    }

    public static final void onProgress$3(C1339370kxT c1339370kxT, float f) {
    }

    public static final void onProgress$4(C1339370kxT c1339370kxT, float f) {
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
            case 3:
                LIZ$3(this, bitmap);
                break;
            case 4:
                LIZ$4(this, bitmap);
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
            case 3:
                onCanceled$3(this);
                break;
            case 4:
                onCanceled$4(this);
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
            case 3:
                onFailed$3(this, th);
                break;
            case 4:
                onFailed$4(this, th);
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
            case 3:
                onProgress$3(this, f);
                break;
            case 4:
                onProgress$4(this, f);
                break;
        }
    }

    public static final void onCanceled$0(C1339370kxT c1339370kxT) {
        ((Function1) c1339370kxT.l0).invoke(null);
    }

    public static final void onCanceled$1(C1339370kxT c1339370kxT) {
        C742060T8y.LIZ(new ARunnableS120S0100000_20((InterfaceC1338120kvS) c1339370kxT.l0, 264));
    }

    public static final void onCanceled$2(C1339370kxT c1339370kxT) {
        ((Function1) c1339370kxT.l0).invoke(null);
    }

    public static final void onCanceled$3(C1339370kxT c1339370kxT) {
        ((Function1) c1339370kxT.l0).invoke(null);
    }

    public static final void onCanceled$4(C1339370kxT c1339370kxT) {
        C742060T8y.LIZ(new ARunnableS120S0100000_20((C1325330kap) c1339370kxT.l0, 455));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1339370kxT(Object obj, Function1<? super Bitmap, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1339370kxT c1339370kxT, Bitmap bitmap) {
        ((Function1) c1339370kxT.l0).invoke(bitmap);
    }

    public static final void LIZ$1(C1339370kxT c1339370kxT, Bitmap bitmap) {
        C742060T8y.LIZ(new ARunnableS89S0200000_20(bitmap, (InterfaceC1338120kvS) c1339370kxT.l0, 166));
    }

    public static final void LIZ$2(C1339370kxT c1339370kxT, Bitmap bitmap) {
        ((Function1) c1339370kxT.l0).invoke(bitmap);
    }

    public static final void LIZ$3(C1339370kxT c1339370kxT, Bitmap bitmap) {
        ((Function1) c1339370kxT.l0).invoke(bitmap);
    }

    public static final void LIZ$4(C1339370kxT c1339370kxT, Bitmap bitmap) {
        C742060T8y.LIZ(new ARunnableS89S0200000_20(bitmap, (C1325330kap) c1339370kxT.l0, 243));
    }

    public static final void onFailed$0(C1339370kxT c1339370kxT, Throwable th) {
        ((Function1) c1339370kxT.l0).invoke(null);
    }

    public static final void onFailed$1(C1339370kxT c1339370kxT, Throwable th) {
        C742060T8y.LIZ(new ARunnableS120S0100000_20((InterfaceC1338120kvS) c1339370kxT.l0, th, 265));
    }

    public static final void onFailed$2(C1339370kxT c1339370kxT, Throwable th) {
        ((Function1) c1339370kxT.l0).invoke(null);
    }

    public static final void onFailed$3(C1339370kxT c1339370kxT, Throwable th) {
        ((Function1) c1339370kxT.l0).invoke(null);
    }

    public static final void onFailed$4(C1339370kxT c1339370kxT, Throwable th) {
        C742060T8y.LIZ(new ARunnableS120S0100000_20((C1325330kap) c1339370kxT.l0, th, 456));
    }
}
