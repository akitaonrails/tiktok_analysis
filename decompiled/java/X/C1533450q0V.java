package X;

import android.net.Uri;
import java.io.File;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0q0V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533450q0V {
    public static final C1533450q0V LIZ = new C1533450q0V();
    public static final AFwS263S0000000_23 LIZIZ = AFwS263S0000000_23.get$arr$(63);

    /* JADX WARN: Type inference failed for: r1v6, types: [X.0q0U] */
    public static void LIZ(C1532310pyf c1532310pyf, C1533790q13 c1533790q13) {
        long jLongValue;
        String str;
        final int iIntValue;
        if (c1532310pyf == null) {
            c1533790q13.LIZIZ = false;
            C1533810q15 c1533810q15 = c1533790q13.LIZLLL;
            c1533810q15.LIZIZ += 3;
            c1533810q15.LIZ.put("_pipeline", "forestx response is null");
            return;
        }
        c1533790q13.LIZIZ = c1532310pyf.isSuccess();
        c1533790q13.LJJIJIIJI = c1532310pyf.LIZLLL;
        c1533790q13.LJJIJL = c1532310pyf.LJ;
        c1533790q13.LJJIJIIJIL = c1532310pyf.LJFF;
        Long lLJIIIZ = c1532310pyf.LJIIIZ();
        if (lLJIIIZ != null) {
            jLongValue = lLJIIIZ.longValue();
        } else {
            jLongValue = 0;
        }
        c1533790q13.LJIIIZ = jLongValue;
        final Map<String, String> mapLJI = c1532310pyf.LJI();
        String str2 = null;
        if (mapLJI != null) {
            C1534070q1V c1534070q1V = new C1534070q1V(true, c1533790q13, C1534080q1W.LIZ, LIZIZ);
            C1531940py4 c1531940py4 = c1532310pyf.LIZ.LJJIJ;
            if (c1531940py4 != null) {
                str = c1531940py4.LJII;
            } else {
                str = null;
            }
            c1534070q1V.LJI = str;
            c1533790q13.LJIIZILJ = c1534070q1V;
            c1533790q13.LJIILLIIL = mapLJI;
            Integer num = c1532310pyf.LJIIL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C1532720pzK c1532720pzK = c1532310pyf.LIZ.LJJIII;
            final String str3 = c1532720pzK.LIZ;
            final Uri uriLIZLLL = c1532720pzK.LIZLLL();
            if (uriLIZLLL == null) {
                uriLIZLLL = Uri.EMPTY;
            }
            final Map<String, String> map = c1532310pyf.LIZ.LJIILIIL;
            final ?? r1 = new AbstractC1522680pj8(uriLIZLLL, str3, map) { // from class: X.0q0U
                @Override // X.AbstractC1522680pj8
                public final boolean cancel() {
                    return false;
                }
            };
            c1533790q13.LJIILJJIL = new AbstractC1522730pjD(mapLJI, iIntValue, r1) { // from class: X.0q0W
                @Override // X.AbstractC1522730pjD
                public final InputStream LIZIZ() {
                    return null;
                }
            };
        }
        c1533790q13.LJIIJJI = c1532310pyf.LJFF();
        c1533790q13.LJJI = c1532310pyf.LJ();
        c1533790q13.LJJIIZI = c1532310pyf.LIZLLL();
        c1533790q13.LJI = c1532310pyf.LJIIJ;
        String str4 = c1532310pyf.LJIIJJI;
        if (str4 != null && !a0.LJJJIL(str4)) {
            str2 = "gecko";
            if (!u.LJJIIJZLJL(str4, "gecko", false) && !u.LJJIIJZLJL(str4, "gecko_update", false)) {
                if (Intrinsics.LJFF(str4, "assets")) {
                    str2 = "builtin";
                } else {
                    str2 = "cdn";
                    if (!u.LJJIIJZLJL(str4, "cdn", false)) {
                        str2 = str4;
                    }
                }
            }
        }
        c1533790q13.LJ = str2;
        c1533790q13.LJFF = "forestX";
        if (str2 == null) {
            str2 = "";
        }
        c1533790q13.LJIIJ = str2;
        c1533790q13.LJJ = true;
        Integer num2 = c1532310pyf.LJIIL;
        if (num2 != null) {
            c1533790q13.LIZLLL.LIZJ = num2.intValue();
        }
        if (c1533790q13.LIZIZ) {
            c1533790q13.LJIILJJIL(new AbstractC1533800q14(c1532310pyf) { // from class: X.0pyk
                public final C1532310pyf LL;

                @Override // X.AbstractC1533800q14
                public final AbstractC1534220q1k<?> LIZ() {
                    AbstractC1532350pyj<?> abstractC1532350pyjLJII = this.LL.LJII();
                    if (abstractC1532350pyjLJII != null) {
                        return new C1532420pyq(abstractC1532350pyjLJII, this.LL.LIZ);
                    }
                    return null;
                }

                @Override // X.AbstractC1533800q14
                public final Integer LIZIZ() {
                    Integer numLIZJ;
                    C1532310pyf c1532310pyf2 = this.LL;
                    C1532410pyp<? extends Object> c1532410pyp = c1532310pyf2.LJI;
                    if (c1532410pyp != null && (numLIZJ = c1532410pyp.LIZ.LIZJ()) != null) {
                        return numLIZJ;
                    }
                    InterfaceC1532190pyT interfaceC1532190pyT = c1532310pyf2.LJII;
                    if (interfaceC1532190pyT != null) {
                        return interfaceC1532190pyT.getResourceSize();
                    }
                    return null;
                }

                @Override // X.AbstractC1533800q14
                public final boolean LJFF() {
                    return this.LL.LJIIIZ.LIZJ;
                }

                @Override // X.AbstractC1533800q14
                public final boolean LJI() {
                    return this.LL.isSuccess();
                }

                @Override // X.AbstractC1533800q14
                public final byte[] LJII() {
                    return this.LL.LJIIJ();
                }

                @Override // X.AbstractC1533800q14
                public final File LJIILL() {
                    return this.LL.LJIIJJI();
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1533800q14
                public final InputStream LJIILLIIL() {
                    C1532310pyf c1532310pyf2 = this.LL;
                    c1532310pyf2.getClass();
                    AbstractC1532350pyj abstractC1532350pyjLJIIL = c1532310pyf2.LJIIL(InputStream.class);
                    if (abstractC1532350pyjLJIIL != null) {
                        return (InputStream) abstractC1532350pyjLJIIL.LIZ;
                    }
                    return null;
                }

                {
                    this.LL = c1532310pyf;
                }
            });
            return;
        }
        c1533790q13.LIZLLL.LIZIZ = c1532310pyf.LIZJ.LIZ();
        c1533790q13.LIZLLL.LIZ.put("_pipeline", c1532310pyf.LIZJ.LIZJ());
        for (Map.Entry entry : ((LinkedHashMap) c1532310pyf.LIZJ.LIZIZ()).entrySet()) {
            c1533790q13.LIZLLL.LIZ.put((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
