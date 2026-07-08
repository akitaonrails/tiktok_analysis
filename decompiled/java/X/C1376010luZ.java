package X;

import android.os.Bundle;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0luZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1376010luZ extends AbstractC1375080lt4 {
    public static boolean LIZIZ;
    public static int LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static Aweme LJI;
    public static C1376050lud LJII;
    public static int LJIIIIZZ;
    public static int LJIIIZ;
    public static C1376330lv5 LJIJ;
    public static C1374320lrq LJIJI;
    public static boolean LJJI;
    public static String LJJII;
    public static final C1376010luZ LIZ = new C1376010luZ();
    public static String LIZJ = "";
    public static final Set<Integer> LJIIJ = new HashSet();
    public static Set<C1376050lud> LJIIJJI = new HashSet();
    public static Set<String> LJIIL = new HashSet();
    public static Set<C1376050lud> LJIILIIL = new HashSet();
    public static Set<String> LJIILJJIL = new HashSet();
    public static Map<String, Boolean> LJIILL = new HashMap();
    public static final Map<String, Integer> LJIILLIIL = new HashMap();
    public static final Map<String, String> LJIIZILJ = new HashMap();
    public static int LJIJJ = -1;
    public static int LJIJJLI = -1;
    public static String LJIL = "";
    public static String LJJ = "";
    public static Bundle LJJIFFI = new Bundle();
    public static int LJJIII = 1;

    public static void LJIIIZ() {
        LIZIZ = false;
        C1376270luz.LIZ.getClass();
        C1376270luz.LIZJ = false;
        LJ = false;
        LJFF = false;
        LJI = null;
        LJIIIZ = ((HashSet) LJIILIIL).size();
        LJIIJJI = new HashSet();
        LJIIL = new HashSet();
        LJIILJJIL = new HashSet();
        LJIILL = new HashMap();
        LJII = null;
        LJIIIIZZ = 0;
    }

    @Override // X.AbstractC1375080lt4
    public final void LIZLLL() {
        LJIILLIIL(null);
    }

    public static void LJIILL() {
        C1376050lud c1376050lud = LJII;
        if (c1376050lud != null && c1376050lud.LIZ.length() > 0) {
            ((HashSet) LJIILIIL).add(c1376050lud);
        }
        if (!LJIIJJI.isEmpty()) {
            LJIJ();
            return;
        }
        Aweme aweme = LJI;
        if (aweme != null) {
            C1376010luZ c1376010luZ = LIZ;
            C0SU5 c0su5LIZ = C0SU5.LIZ(5, aweme, 0, 0, 12);
            c1376010luZ.getClass();
            LJIILIIL(c0su5LIZ, true);
            LJIIL(0);
            C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
            Aweme aweme2 = LJI;
            int i = LJIIIZ;
            Set<Integer> set = LJIIJ;
            c1375670lu1.getClass();
            C1375670lu1.LIZLLL(aweme2, i, set);
        }
        LJIIIZ();
    }

    public static void LJIJ() {
        C1374320lrq c1374320lrq;
        if (LJI == null || (c1374320lrq = LJIJI) == null) {
            return;
        }
        if (!LJIIJJI.isEmpty()) {
            LIZIZ = true;
            C1376050lud c1376050lud = (C1376050lud) C13LP.LJJJJZ(LJIIJJI);
            String str = c1376050lud.LIZ;
            C1376010luZ c1376010luZ = LIZ;
            int i = c1376050lud.LIZIZ;
            Aweme aweme = LJI;
            if (aweme != null) {
                C0ST8.LIZJ(aweme);
            }
            boolean z = c1376050lud.LIZJ;
            c1376010luZ.getClass();
            boolean z2 = false;
            if (z) {
                z2 = i > 0;
            }
            LJII = c1376050lud;
            LJIIJJI.remove(c1376050lud);
            C1376330lv5 c1376330lv5 = LJIJ;
            if (c1376330lv5 != null) {
                c1376330lv5.LIZ(str, c1376010luZ, c1374320lrq, z2);
            }
        }
    }

    public static void LJIIIIZZ() {
        LJIIIZ();
        LJIJ = null;
        LJIJI = null;
        LJIILIIL = new HashSet();
        LJIIIZ = 0;
    }

    public static boolean LJIIJ(Aweme aweme) {
        if (((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().enableSaveOwnVideoWithoutWatermask() && Intrinsics.LJFF(AwemeExtKt.getAuthorUid(aweme), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
            return true;
        }
        return false;
    }

    public static void LJIIL(int i) {
        if (!LIZIZ) {
            return;
        }
        String str = null;
        if (Intrinsics.LJFF(LJJ, "long_press_download")) {
            Aweme aweme = LJI;
            C1376050lud c1376050lud = LJII;
            if (c1376050lud != null) {
                str = c1376050lud.LIZ;
            }
            C1379790m0f.LIZIZ(LJIIIZ, aweme, "mask", str);
        } else {
            Aweme aweme2 = LJI;
            C1376270luz.LIZ.getClass();
            String str2 = C1376270luz.LJIIIIZZ;
            C1376050lud c1376050lud2 = LJII;
            if (c1376050lud2 != null) {
                str = c1376050lud2.LIZ;
            }
            C1379790m0f.LIZIZ(LJIIIZ, aweme2, str2, str);
        }
        C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
        String str3 = LJIL;
        Aweme aweme3 = LJI;
        int i2 = LJIIIZ;
        int i3 = LJJIII;
        String str4 = LJJII;
        c1375670lu1.getClass();
        C1375670lu1.LIZIZ(i2, i3, i, aweme3, str3, str4);
        Aweme aweme4 = LJI;
        if (aweme4 != null) {
            C621180OYa.LIZIZ.LJJLJLI(aweme4, LJIL, LIZLLL, LJIIIZ);
        }
    }

    public static void LJIILJJIL(int i) {
        if (LJFF) {
            return;
        }
        int size = ((100 / LJIIIZ) * ((HashSet) LJIIL).size()) + (i / LJIIIZ);
        Aweme aweme = LJI;
        if (aweme != null) {
            C1376010luZ c1376010luZ = LIZ;
            C0SU5 c0su5LIZ = C0SU5.LIZ(2, aweme, size, 0, 8);
            c1376010luZ.getClass();
            LJIILIIL(c0su5LIZ, true);
        }
    }

    public static void LJIILLIIL(DownloadInfo downloadInfo) {
        if (!LJ) {
            LJ = true;
            Aweme aweme = LJI;
            if (aweme != null) {
                if (downloadInfo != null) {
                    LJIIIIZZ = downloadInfo.getId();
                }
                C1376010luZ c1376010luZ = LIZ;
                C0SU5 c0su5LIZ = C0SU5.LIZ(1, aweme, 0, 0, 12);
                c1376010luZ.getClass();
                LJIILIIL(c0su5LIZ, true);
            }
        }
    }

    @Override // X.AbstractC1375080lt4
    public final void LIZ(String str) {
        LJIIL(0);
        C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
        Aweme aweme = LJI;
        int i = LJIIIZ;
        Set<Integer> set = LJIIJ;
        c1375670lu1.getClass();
        C1375670lu1.LIZLLL(aweme, i, set);
        LJIIIIZZ();
    }

    @Override // X.AbstractC1375080lt4
    public final void LIZIZ(int i) {
        LJIILJJIL(i);
    }

    @Override // X.AbstractC1375080lt4
    public final void LIZJ(String str) {
        LJIILL();
    }

    @Override // X.AbstractC1375080lt4
    public final void LJ(DownloadInfo downloadInfo) {
        LJIILLIIL(downloadInfo);
    }

    public static void LJII(String str, String str2) {
        if (Intrinsics.LJFF(str, str2)) {
            return;
        }
        if (((HashSet) LJIILJJIL).remove(str)) {
            ((HashSet) LJIILJJIL).add(str2);
        }
        Boolean bool = (Boolean) ((HashMap) LJIILL).remove(str);
        if (bool != null) {
            ((HashMap) LJIILL).put(str2, Boolean.valueOf(bool.booleanValue()));
        }
        HashMap map = (HashMap) LJIIZILJ;
        Object objRemove = map.remove(str);
        if (objRemove != null) {
            map.put(str2, objRemove);
        }
    }

    public static void LJIILIIL(C0SU5 c0su5, boolean z) {
        if (z) {
            C707370Rot.LIZ.LIZIZ("video_download_status").postValue(c0su5);
        }
    }

    @Override // X.AbstractC1375080lt4
    public final void LJFF(String str, String str2, boolean z) {
        LJIIZILJ(this, str, z, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIZILJ(X.C1376010luZ r7, java.lang.String r8, boolean r9, int r10) {
        /*
            r0 = r10 & 4
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L17
            r6 = 1
        L7:
            r0 = r10 & 16
            if (r0 == 0) goto Lc
            r9 = 0
        Lc:
            boolean r0 = X.C1376010luZ.LJFF
            if (r0 == 0) goto L19
            r7.getClass()
            LJIIIIZZ()
            return
        L17:
            r6 = 0
            goto L7
        L19:
            r7.getClass()
            X.0lud r2 = X.C1376010luZ.LJII
            if (r2 == 0) goto L62
            java.lang.String r0 = r2.LIZ
            int r0 = r0.length()
            if (r0 <= 0) goto L62
            java.util.Set<java.lang.String> r1 = X.C1376010luZ.LJIIL
            java.lang.String r0 = r2.LIZ
            java.util.HashSet r1 = (java.util.HashSet) r1
            r1.add(r0)
            if (r8 == 0) goto L54
            java.util.Map<java.lang.String, java.lang.String> r1 = X.C1376010luZ.LJIIZILJ
            java.lang.String r0 = r2.LIZ
            java.util.HashMap r1 = (java.util.HashMap) r1
            r1.put(r8, r0)
        L3c:
            int r0 = r8.length()
            if (r0 <= 0) goto L54
            java.util.Set<java.lang.String> r0 = X.C1376010luZ.LJIILJJIL
            java.util.HashSet r0 = (java.util.HashSet) r0
            r0.add(r8)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = X.C1376010luZ.LJIILL
            java.util.HashMap r0 = (java.util.HashMap) r0
            r0.put(r8, r1)
        L54:
            java.util.Set<X.0lud> r0 = X.C1376010luZ.LJIIJJI
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L65
            LJIJ()
            return
        L62:
            if (r8 == 0) goto L54
            goto L3c
        L65:
            java.util.Set<X.0lud> r0 = X.C1376010luZ.LJIILIIL
            java.util.HashSet r0 = (java.util.HashSet) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L99
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = X.C1376010luZ.LJI
            if (r3 == 0) goto L84
            X.0luZ r2 = X.C1376010luZ.LIZ
            r1 = 5
            r0 = 12
            X.0SU5 r0 = X.C0SU5.LIZ(r1, r3, r4, r4, r0)
            r2.getClass()
            LJIILIIL(r0, r5)
        L84:
            LJIIL(r4)
            X.0lu1 r3 = X.C1375670lu1.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = X.C1376010luZ.LJI
            int r1 = X.C1376010luZ.LJIIIZ
            java.util.Set<java.lang.Integer> r0 = X.C1376010luZ.LJIIJ
            r3.getClass()
            X.C1375670lu1.LIZLLL(r2, r1, r0)
            LJIIIZ()
            return
        L99:
            LJIIL(r5)
            X.03Hh r4 = X.C817503Hh.LL
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0RoS r2 = new X.0RoS
            r1 = 0
            r2.<init>(r6, r5, r1)
            r0 = 2
            X.C23250099c.LIZLLL(r4, r3, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1376010luZ.LJIIZILJ(X.0luZ, java.lang.String, boolean, int):void");
    }

    public static void LJIIJJI(C1376010luZ c1376010luZ, String str, String str2, C1376330lv5 c1376330lv5, Aweme aweme, Set set, C1374320lrq c1374320lrq, boolean z, Function1 function1, int i) {
        String strLIZIZ;
        C1374320lrq c1374320lrq2;
        ACLCommonShare aCLCommonShare;
        Function1 function12 = function1;
        boolean z2 = z;
        int i2 = 0;
        if ((i & 128) != 0) {
            z2 = false;
        }
        Boolean boolValueOf = null;
        if ((i & 256) != 0) {
            function12 = null;
        }
        c1376010luZ.getClass();
        if (!C1376270luz.LIZIZ()) {
            C1376270luz.LIZ.getClass();
            C1376270luz.LIZJ = true;
            C1376270luz.LJI = aweme;
            LJIIIIZZ();
            LJIL = str;
            LJJ = str2;
            LJI = aweme;
            LJIJ = c1376330lv5;
            LJIJI = c1374320lrq;
            if (LJIIJ(aweme) && (c1374320lrq2 = LJIJI) != null && (aCLCommonShare = c1374320lrq2.LIZ) != null) {
                aCLCommonShare.setTranscode(1);
            }
            ((HashMap) LJIILLIIL).clear();
            ((HashMap) LJIIZILJ).clear();
            LJJII = C721220SQu.LIZJ(aweme, set);
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                C1376330lv5 c1376330lv52 = LJIJ;
                if (c1376330lv52 != null && (strLIZIZ = c1376330lv52.LIZIZ(aweme, iIntValue, c1374320lrq, z2)) != null && strLIZIZ.length() > 0) {
                    ((HashMap) LJIILLIIL).put(strLIZIZ, Integer.valueOf(iIntValue));
                    LJIIJJI.add(new C1376050lud(strLIZIZ, C721220SQu.LJII(iIntValue, aweme), z2));
                }
                Set<Integer> set2 = LJIIJ;
                if (set2 != null) {
                    ((HashSet) set2).add(Integer.valueOf(iIntValue + 1));
                }
            }
            int iLIZJ = C0ST8.LIZJ(aweme);
            C1376050lud c1376050lud = (C1376050lud) C13LP.LJJJLIIL(LJIIJJI);
            if (c1376050lud != null) {
                boolValueOf = Boolean.valueOf(c1376050lud.LIZJ);
            }
            if (iLIZJ == 1 && Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                i2 = 1;
            }
            LJJIII = 1 ^ i2;
            LJIIIZ = LJIIJJI.size();
            LJIJ();
            C1374320lrq c1374320lrq3 = LJIJI;
            if (c1374320lrq3 != null && function12 != null) {
                function12.invoke(c1374320lrq3);
            }
            if (LIZIZ) {
                C1375670lu1 c1375670lu1 = C1375670lu1.LIZ;
                Aweme aweme2 = LJI;
                int i3 = LJIIIZ;
                int i4 = LJJIII;
                c1375670lu1.getClass();
                C1375670lu1.LJ(i3, i4, aweme2);
            }
        }
    }
}
