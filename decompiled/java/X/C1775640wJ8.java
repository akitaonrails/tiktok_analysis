package X;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: X.0wJ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775640wJ8 extends AbstractC468201s0 {
    public final int $t;
    public Object l0;

    public static final void onFailed$0(C1775640wJ8 c1775640wJ8, Throwable th) {
    }

    public static final void onFailed$1(C1775640wJ8 c1775640wJ8, Throwable th) {
    }

    public static final void onFailed$2(C1775640wJ8 c1775640wJ8, Throwable th) {
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
            case 2:
                onFailed$2(this, th);
                break;
            default:
                super.onFailed(th);
                break;
        }
    }

    public C1775640wJ8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C1775640wJ8 c1775640wJ8, Bitmap bitmap) {
        C1765830w3J c1765830w3J = (C1765830w3J) c1775640wJ8.l0;
        C1752030vh3 c1752030vh3 = c1765830w3J.LJI;
        if (c1752030vh3 != null) {
            c1752030vh3.LJFF = bitmap;
        }
        C1765720w38 c1765720w38 = c1765830w3J.LIZIZ;
        if (c1765720w38 != null) {
            c1765720w38.setParams(c1752030vh3);
        }
    }

    public static final void LIZ$1(C1775640wJ8 c1775640wJ8, Bitmap bitmap) {
        ((C1762660vyC) c1775640wJ8.l0).LLILLJJLI.setCoverImage(bitmap);
    }

    public static final void LIZ$2(C1775640wJ8 c1775640wJ8, Bitmap bitmap) {
        C1763130vyx c1763130vyx = (C1763130vyx) c1775640wJ8.l0;
        C1752030vh3 c1752030vh3 = c1763130vyx.LLILZLL;
        if (c1752030vh3 != null) {
            c1752030vh3.LJFF = bitmap;
        }
        c1763130vyx.LLILLL.setParams(c1752030vh3);
    }
}
