package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0H1H, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H1H {
    public static final /* synthetic */ int LIZ = 0;

    public static Object LIZ(final String str, Integer num, Integer num2, final String str2, EnumC1769850w9n enumC1769850w9n, AbstractC23140094w abstractC23140094w) {
        C1331670kl3 c1331670kl3LJIIIZ;
        String str3;
        final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(abstractC23140094w));
        c2252611DEt.LJIJJ();
        try {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (enumC1769850w9n != null) {
                C1326790kdB c1326790kdB = C1326790kdB.LIZ;
                C1334210kp9.LIZIZ(str, enumC1769850w9n, null, null, false, false, null, null);
                c1326790kdB.getClass();
                c1331670kl3LJIIIZ = C1326790kdB.LIZLLL(str);
            } else {
                c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            }
            if (str2 != null) {
                str3 = str2;
            } else {
                str3 = "shop_image";
            }
            c1331670kl3LJIIIZ.LIZLLL(str3);
            if (num != null && num2 != null) {
                int iIntValue = num.intValue();
                int iIntValue2 = num2.intValue();
                c1331670kl3LJIIIZ.LJIIJJI = iIntValue;
                c1331670kl3LJIIIZ.LJIIL = iIntValue2;
            }
            c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0() { // from class: X.09m2
                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    if (!c2252611DEt.isActive()) {
                        return;
                    }
                    String str4 = "";
                    if (bitmap == null) {
                        C1767950w6j c1767950w6j = C1767950w6j.LIZ;
                        String str5 = str2;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        String str6 = str;
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        c1767950w6j.getClass();
                        C1767950w6j.LJJIII(jCurrentTimeMillis2, str4, str6, false);
                        InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf = c2252611DEt;
                        C098200Yq c098200Yq = new C098200Yq(new RuntimeException("image download fail with null result"));
                        C189200o6.m2constructorimpl(c098200Yq);
                        interfaceC20236714Gf.resumeWith(c098200Yq);
                        return;
                    }
                    C1767950w6j c1767950w6j2 = C1767950w6j.LIZ;
                    String str7 = str2;
                    if (str7 != null) {
                        str4 = str7;
                    }
                    String str8 = str;
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis;
                    c1767950w6j2.getClass();
                    C1767950w6j.LJJIII(jCurrentTimeMillis3, str4, str8, true);
                    InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf2 = c2252611DEt;
                    C189200o6.m2constructorimpl(bitmap);
                    interfaceC20236714Gf2.resumeWith(bitmap);
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    if (!c2252611DEt.isActive()) {
                        return;
                    }
                    C1767950w6j c1767950w6j = C1767950w6j.LIZ;
                    String str4 = str2;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = str;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    c1767950w6j.getClass();
                    C1767950w6j.LJJIII(jCurrentTimeMillis2, str4, str5, false);
                    InterfaceC20236714Gf<Bitmap> interfaceC20236714Gf = c2252611DEt;
                    if (th == null) {
                        th = new RuntimeException("image download fail with unknown exception");
                    }
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    interfaceC20236714Gf.resumeWith(c098200Yq);
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            c2252611DEt.resumeWith(c098200Yq);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(abstractC23140094w);
        }
        return objLJIJ;
    }
}
