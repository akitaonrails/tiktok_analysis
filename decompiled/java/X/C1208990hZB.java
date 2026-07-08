package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: renamed from: X.0hZB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208990hZB implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onProgress$0(C1208990hZB c1208990hZB, float f) {
    }

    public static final void onProgress$1(C1208990hZB c1208990hZB, float f) {
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
        }
    }

    public static final void onCanceled$0(C1208990hZB c1208990hZB) {
        if (((InterfaceC20236714Gf) c1208990hZB.l0).isActive()) {
            ((InterfaceC20236714Gf) c1208990hZB.l0).LJJIIZ(null);
        }
    }

    public static final void onCanceled$1(C1208990hZB c1208990hZB) {
        if (((InterfaceC20236714Gf) c1208990hZB.l0).isActive()) {
            ((InterfaceC20236714Gf) c1208990hZB.l0).LJJIIZ(null);
        }
    }

    public static final void LIZ$0(C1208990hZB c1208990hZB, Bitmap bitmap) {
        C443530HaJ c443530HaJLIZJ;
        if (!((InterfaceC20236714Gf) c1208990hZB.l0).isActive()) {
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1208990hZB.l0;
        if (bitmap != null) {
            c443530HaJLIZJ = C1180680gpW.LIZJ(((C1177390gkD) c1208990hZB.l1).LIZ, bitmap, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C418440Gaw.LIZIZ(8));
        } else {
            c443530HaJLIZJ = null;
        }
        C189200o6.m2constructorimpl(c443530HaJLIZJ);
        interfaceC20236714Gf.resumeWith(c443530HaJLIZJ);
    }

    public static final void LIZ$1(C1208990hZB c1208990hZB, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable;
        if (!((InterfaceC20236714Gf) c1208990hZB.l0).isActive()) {
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1208990hZB.l0;
        if (bitmap != null) {
            bitmapDrawable = new BitmapDrawable(((C1177390gkD) c1208990hZB.l1).LIZ.getResources(), bitmap);
        } else {
            bitmapDrawable = null;
        }
        C189200o6.m2constructorimpl(bitmapDrawable);
        interfaceC20236714Gf.resumeWith(bitmapDrawable);
    }

    public static final void onFailed$0(C1208990hZB c1208990hZB, Throwable th) {
        if (!((InterfaceC20236714Gf) c1208990hZB.l0).isActive()) {
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1208990hZB.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void onFailed$1(C1208990hZB c1208990hZB, Throwable th) {
        if (!((InterfaceC20236714Gf) c1208990hZB.l0).isActive()) {
            return;
        }
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1208990hZB.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public C1208990hZB(C2252611DEt c2252611DEt, C1177390gkD c1177390gkD, int i) {
        this.$t = i;
        this.l0 = c2252611DEt;
        this.l1 = c1177390gkD;
    }
}
