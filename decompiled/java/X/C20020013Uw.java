package X;

import Y.ACallableS21S2100000_20;
import android.content.ContentResolver;
import android.content.Context;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13Uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20020013Uw {
    public static final String LIZ(String str) {
        if (str != null && !a0.LJJJIL(str)) {
            if (!a0.LJJIJIIJIL(str, '/')) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('/');
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return str;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C20019913Uv LIZLLL(X.InterfaceC220300t7 r11, X.InterfaceC1680500tpg r12, int r13) {
        /*
            r0 = -1248473602(0xffffffffb595cdfe, float:-1.1161317E-6)
            r12.LJJIJIIJIL(r0)
            r6 = 0
            java.lang.String r7 = "fonts/"
            java.lang.String r8 = ".ttf"
            java.lang.String r9 = "__LottieInternalDefaultCacheKey__"
            X.01Ld r3 = new X.01Ld
            r3.<init>(r6)
            X.13DR r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.LIZIZ
            java.lang.Object r4 = r12.LJJIL(r0)
            android.content.Context r4 = (android.content.Context) r4
            r0 = 1157296644(0x44faf204, float:2007.563)
            r12.LJJIJIIJIL(r0)
            r5 = r11
            boolean r0 = r12.LJJIIJ(r5)
            java.lang.Object r10 = r12.LJJ()
            if (r0 != 0) goto L34
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r10 != r0) goto L40
        L34:
            X.13Uv r0 = new X.13Uv
            r0.<init>()
            X.05P0 r10 = X.C20028913Yh.LJI(r0)
            r12.LJJIJIIJI(r10)
        L40:
            r12.LJJIJLIJ()
            X.05P0 r10 = (X.C05P0) r10
            r0 = 511388516(0x1e7b2b64, float:1.3296802E-20)
            r12.LJJIJIIJIL(r0)
            boolean r2 = r12.LJJIIJ(r5)
            boolean r0 = r12.LJJIIJ(r9)
            r2 = r2 | r0
            java.lang.Object r1 = r12.LJJ()
            if (r2 != 0) goto L63
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L6b
        L63:
            r0 = 1
            X.0jj7 r0 = LIZJ(r4, r5, r9, r0)
            r12.LJJIJIIJI(r0)
        L6b:
            r12.LJJIJLIJ()
            X.13Up r2 = new X.13Up
            r11 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            X.C1680540tpk.LJ(r5, r9, r2, r12)
            java.lang.Object r0 = r10.getValue()
            X.13Uv r0 = (X.C20019913Uv) r0
            r12.LJJIJLIJ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20020013Uw.LIZLLL(X.00t7, X.0tpg, int):X.13Uv");
    }

    public static final C1292030jj7<C1294720jnS> LIZJ(Context context, InterfaceC220300t7 interfaceC220300t7, String str, boolean z) {
        if (interfaceC220300t7 instanceof C220400t8) {
            if (Intrinsics.LJFF(str, "__LottieInternalDefaultCacheKey__")) {
                interfaceC220300t7.getClass();
                return C1294250jmh.LJIIIIZZ(0, context);
            }
            interfaceC220300t7.getClass();
            return C1294250jmh.LJIIIZ(context, 0, str);
        }
        if (interfaceC220300t7 instanceof C220500t9) {
            if (Intrinsics.LJFF(str, "__LottieInternalDefaultCacheKey__")) {
                return C1294250jmh.LJIIJJI(context, ((C220500t9) interfaceC220300t7).LIZ);
            }
            return C1294250jmh.LJIIL(context, ((C220500t9) interfaceC220300t7).LIZ, str);
        }
        if (interfaceC220300t7 instanceof C220200t6) {
            if (z) {
                return null;
            }
            C220200t6 c220200t6 = (C220200t6) interfaceC220300t7;
            C0VSP c0vsp = new C0VSP(c220200t6.LIZ);
            if (u.LJIIZILJ(c220200t6.LIZ, "zip", false)) {
                ZipInputStream zipInputStream = new ZipInputStream(c0vsp);
                if (Intrinsics.LJFF(str, "__LottieInternalDefaultCacheKey__")) {
                    str = c220200t6.LIZ;
                }
                return C1294250jmh.LJIILIIL(null, zipInputStream, str);
            }
            if (Intrinsics.LJFF(str, "__LottieInternalDefaultCacheKey__")) {
                str = c220200t6.LIZ;
            }
            return C1294250jmh.LJ(c0vsp, str);
        }
        if (interfaceC220300t7 instanceof C220100t5) {
            if (Intrinsics.LJFF(str, "__LottieInternalDefaultCacheKey__")) {
                return C1294250jmh.LIZIZ(context, ((C220100t5) interfaceC220300t7).LIZ);
            }
            return C1294250jmh.LIZ(str, new ACallableS21S2100000_20(C786410Ut5.N3(context), ((C220100t5) interfaceC220300t7).LIZ, str, 1), null);
        }
        if (interfaceC220300t7 instanceof C220000t4) {
            if (!Intrinsics.LJFF(str, "__LottieInternalDefaultCacheKey__")) {
                interfaceC220300t7.getClass();
                return C1294250jmh.LJII(null, str);
            }
            interfaceC220300t7.getClass();
            throw null;
        }
        if (interfaceC220300t7 instanceof C219900t3) {
            ContentResolver contentResolver = context.getContentResolver();
            interfaceC220300t7.getClass();
            InputStream inputStreamLJ = C09NT.LJ(contentResolver, null);
            if (!Intrinsics.LJFF(str, "__LottieInternalDefaultCacheKey__")) {
                return C1294250jmh.LJ(inputStreamLJ, str);
            }
            throw null;
        }
        throw new C1954807lC();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZIZ(android.content.Context r12, X.InterfaceC220300t7 r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, X.InterfaceC1364105Vn<? super X.C1294720jnS> r18) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20020013Uw.LIZIZ(android.content.Context, X.00t7, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}
