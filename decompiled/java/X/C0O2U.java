package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;

/* JADX INFO: renamed from: X.0O2U, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public abstract class C0O2U implements C0NUU {
    public final int LIZ;
    public final C0O2S LIZIZ;

    public C0O2U() {
        C1697570uHD c1697570uHD = new C0O2S() { // from class: X.0uHD
            @Override // X.C0O2S
            public final void LIZIZ() {
            }

            @Override // X.C0O2S
            public final Typeface LIZ(Context context, C0O2U c0o2u) {
                C1695870uET c1695870uET;
                String str;
                Typeface typefaceLIZ;
                if (!(c0o2u instanceof C1695870uET) || (c1695870uET = (C1695870uET) c0o2u) == null) {
                    return null;
                }
                if (!c1695870uET.LJII && c1695870uET.LJIIIIZZ == null) {
                    if (!C1301050jxf.LIZ().isInitialized()) {
                        C1301050jxf.LIZ().init(context);
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        boolean z = false;
                        FontVariationAxis[] fontVariationAxisArr = {C1696210uF1.LIZIZ(c1695870uET.LJ, "DRKM"), C1696210uF1.LIZIZ(c1695870uET.LIZLLL.LL, "wght"), C1696210uF1.LIZIZ(C1682440tso.LIZLLL(c1695870uET.LIZJ), "opsz"), C1696210uF1.LIZIZ(c1695870uET.LJFF, "slnt"), C1696210uF1.LIZIZ(c1695870uET.LJI, "wdth")};
                        int i = c1695870uET.LIZLLL.LL;
                        if (c1695870uET.LJFF == 0.0f) {
                            z = true;
                        }
                        typefaceLIZ = C1301050jxf.LIZ().LIZLLL(fontVariationAxisArr, i, !z);
                    } else {
                        float fLIZLLL = C1682440tso.LIZLLL(c1695870uET.LIZJ);
                        int i2 = c1695870uET.LIZLLL.LL;
                        if (fLIZLLL > 17.0f) {
                            if (i2 < 450) {
                                str = "font/TikTok-Display-Regular.otf";
                            } else if (i2 > 600) {
                                str = "font/TikTok-Display-Bold.otf";
                            } else {
                                str = "font/TikTok-Display-Medium.otf";
                            }
                        } else if (i2 < 450) {
                            str = "font/TikTok-Text-Regular.otf";
                        } else if (i2 > 600) {
                            str = "font/TikTok-Text-Bold.otf";
                        } else {
                            str = "font/TikTok-Text-Medium.otf";
                        }
                        typefaceLIZ = C1301050jxf.LIZ().LIZ(str);
                    }
                    c1695870uET.LJIIIIZZ = typefaceLIZ;
                }
                c1695870uET.LJII = true;
                return c1695870uET.LJIIIIZZ;
            }
        };
        this.LIZ = 0;
        this.LIZIZ = c1697570uHD;
    }

    @Override // X.C0NUU
    public final int LIZIZ() {
        return this.LIZ;
    }
}
