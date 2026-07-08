package X;

import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData;
import com.bytedance.android.livesdk.chatroom.model.FuncConf;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveUserPostHighlightSetting;
import com.bytedance.android.livesdk.livesetting.highlight.LiveReplayHighlightRecoverSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0xoa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1833580xoa {
    public static final List<String> LIZ = C1697810uHb.LJIILJJIL("auto_post_living", "fans_club", "playlist", "fragment_revert", "share_viewers");
    public static final List<String> LIZIZ = new ArrayList();
    public static final Map<String, Boolean> LIZJ = new LinkedHashMap();
    public static final Map<String, Boolean> LIZLLL = new LinkedHashMap();
    public static C1833520xoU LJ;

    public static void LJI() {
        ((ArrayList) LIZIZ).clear();
        ((LinkedHashMap) LIZJ).clear();
        ((LinkedHashMap) LIZLLL).clear();
        LJ = null;
    }

    public static String LJIIIIZZ() {
        for (String str : ((LinkedHashMap) LIZJ).keySet()) {
            if (Intrinsics.LJFF(((LinkedHashMap) LIZJ).get(str), Boolean.TRUE)) {
                return str;
            }
        }
        return null;
    }

    public static String LJIIIZ() {
        for (String str : ((LinkedHashMap) LIZLLL).keySet()) {
            if (Intrinsics.LJFF(((LinkedHashMap) LIZLLL).get(str), Boolean.TRUE)) {
                return str;
            }
        }
        return null;
    }

    public static String LJIIJ() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date());
    }

    public static C1833590xob LJIIJJI() {
        String str;
        C0JT6<String> c0jt6 = InterfaceC1833600xoc.sa;
        String strLIZ = c0jt6.LIZ();
        if (strLIZ == null || strLIZ.length() == 0) {
            return null;
        }
        String strLJIIJ = LJIIJ();
        new C1833590xob();
        C1833590xob c1833590xobLIZIZ = C1833590xob.LIZIZ(strLIZ);
        if (c1833590xobLIZIZ == null || (str = c1833590xobLIZIZ.LIZ) == null) {
            str = "";
        }
        if (Intrinsics.LJFF(str, strLJIIJ)) {
            return c1833590xobLIZIZ;
        }
        c0jt6.LIZJ("");
        return null;
    }

    public static boolean LJIILJJIL() {
        C1834350xpp.LIZ.getClass();
        Long lLIZ = C1834350xpp.LJIJ.LIZ();
        return lLIZ != null && lLIZ.longValue() > 0 && System.currentTimeMillis() - lLIZ.longValue() < 604800000;
    }

    public static boolean LJIILL() {
        C1834350xpp.LIZ.getClass();
        Long lLIZ = C1834350xpp.LJIILL.LIZ();
        return lLIZ != null && lLIZ.longValue() > 0 && System.currentTimeMillis() - lLIZ.longValue() < 604800000;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(com.bytedance.android.livesdk.chatroom.model.FuncConf r4) {
        /*
            r3 = 0
            java.lang.String r1 = ""
            if (r4 == 0) goto Ld
            com.bytedance.android.livesdk.chatroom.model.VersionRange r0 = r4.versionRange     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto Ld
            java.lang.String r0 = r0.start     // Catch: java.lang.Exception -> L34
            if (r0 != 0) goto Le
        Ld:
            r0 = r1
        Le:
            int r2 = LJII(r0)     // Catch: java.lang.Exception -> L34
            if (r4 == 0) goto L1d
            com.bytedance.android.livesdk.chatroom.model.VersionRange r0 = r4.versionRange     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L1d
            java.lang.String r0 = r0.end     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L1d
            r1 = r0
        L1d:
            int r1 = LJII(r1)     // Catch: java.lang.Exception -> L34
            X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.lang.Exception -> L34
            r0.getClass()     // Catch: java.lang.Exception -> L34
            java.lang.String r0 = X.C844470XAv.LJFF()     // Catch: java.lang.Exception -> L34
            int r0 = LJII(r0)     // Catch: java.lang.Exception -> L34
            if (r0 < r2) goto L33
            if (r0 > r1) goto L33
            r3 = 1
        L33:
            return r3
        L34:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1833580xoa.LIZLLL(com.bytedance.android.livesdk.chatroom.model.FuncConf):boolean");
    }

    public static int LJII(String str) {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{e3.d}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() != 3) {
            return 0;
        }
        return (CastIntegerProtector.parseInt(a0.LJJJJJL('0', 2, (String) ListProtector.get(listLJJLIIIJILLIZJL, 0))) * 10000) + (CastIntegerProtector.parseInt(a0.LJJJJJL('0', 2, (String) ListProtector.get(listLJJLIIIJILLIZJL, 1))) * 100) + CastIntegerProtector.parseInt(a0.LJJJJJL('0', 2, (String) ListProtector.get(listLJJLIIIJILLIZJL, 2)));
    }

    public static boolean LJIILIIL(String str) {
        for (Object obj : (ArrayList) LIZIZ) {
            if (!Intrinsics.LJFF(obj, str)) {
                Object obj2 = ((LinkedHashMap) LIZJ).get(obj);
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(obj2, bool) || Intrinsics.LJFF(((LinkedHashMap) LIZLLL).get(obj), bool)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJIILLIIL(String str) {
        switch (str.hashCode()) {
            case -1627015103:
                if (str.equals("share_viewers")) {
                    C1834350xpp.LIZ.getClass();
                    C1834350xpp.LJIIIZ.LIZJ(Boolean.TRUE);
                }
                break;
            case -774387021:
                if (str.equals("fragment_revert")) {
                    C1834350xpp.LIZ.getClass();
                    C1834350xpp.LJFF.LIZJ(Boolean.TRUE);
                }
                break;
            case -198550059:
                if (str.equals("fans_club")) {
                    C1834350xpp.LIZ.getClass();
                    C1834350xpp.LJIIJJI.LIZJ(Boolean.TRUE);
                }
                break;
            case 1143922840:
                if (str.equals("auto_post_living")) {
                    C1834350xpp.LIZ.getClass();
                    C1834350xpp.LJIILJJIL.LIZJ(Boolean.TRUE);
                    C1834350xpp.LJIILL.LIZJ(Long.valueOf(System.currentTimeMillis()));
                }
                break;
            case 1879474642:
                if (str.equals("playlist")) {
                    InterfaceC1833600xoc.na.LIZJ(Boolean.TRUE);
                    InterfaceC1833600xoc.oa.LIZJ(Long.valueOf(System.currentTimeMillis()));
                }
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJIIZILJ(String str) {
        switch (str.hashCode()) {
            case -1627015103:
                if (str.equals("share_viewers")) {
                    C1834350xpp.LIZ.getClass();
                    C1834350xpp.LJIIJ.LIZJ(Boolean.TRUE);
                }
                break;
            case -774387021:
                if (str.equals("fragment_revert")) {
                    C1834350xpp.LIZ.getClass();
                    C1834350xpp.LIZIZ.LIZJ(Boolean.TRUE);
                }
                break;
            case -198550059:
                if (str.equals("fans_club")) {
                    C1834350xpp.LIZ.getClass();
                    C1834350xpp.LJIIL.LIZJ(Boolean.TRUE);
                }
                break;
            case 1143922840:
                if (str.equals("auto_post_living")) {
                    C1834350xpp.LIZ.getClass();
                    C1834350xpp.LJIILLIIL.LIZJ(Boolean.TRUE);
                }
                break;
            case 1879474642:
                if (str.equals("playlist")) {
                    InterfaceC1833600xoc.pa.LIZJ(Boolean.TRUE);
                    InterfaceC1833600xoc.qa.LIZJ(Long.valueOf(System.currentTimeMillis()));
                }
                break;
        }
    }

    public static void LJIJ(String str) {
        String strLIZ;
        C0JT6<String> c0jt6 = InterfaceC1833600xoc.sa;
        String strLIZ2 = c0jt6.LIZ();
        if (strLIZ2 != null && strLIZ2.length() != 0) {
            new C1833590xob();
            C1833590xob c1833590xobLIZIZ = C1833590xob.LIZIZ(strLIZ2);
            if (c1833590xobLIZIZ == null) {
                c1833590xobLIZIZ = new C1833590xob();
                c1833590xobLIZIZ.LIZ = LJIIJ();
                c1833590xobLIZIZ.LIZIZ = 1;
                c1833590xobLIZIZ.LIZJ = Collections.singleton(str);
            }
            c1833590xobLIZIZ.LIZ = LJIIJ();
            c1833590xobLIZIZ.LIZIZ++;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.addAll(c1833590xobLIZIZ.LIZJ);
            linkedHashSet.add(str);
            c1833590xobLIZIZ.LIZJ = linkedHashSet;
            strLIZ = c1833590xobLIZIZ.LIZ();
        } else {
            C1833590xob c1833590xob = new C1833590xob();
            c1833590xob.LIZ = LJIIJ();
            c1833590xob.LIZIZ = 1;
            c1833590xob.LIZJ = Collections.singleton(str);
            strLIZ = c1833590xob.LIZ();
        }
        c0jt6.LIZJ(strLIZ);
    }

    public static Pair LIZ(AnchorReplayInfoData anchorReplayInfoData, FuncConf funcConf) {
        boolean z;
        if (LJIILIIL("fans_club")) {
            ((ArrayList) LIZIZ).add("fans_club");
            Boolean bool = Boolean.FALSE;
            return new Pair(bool, bool);
        }
        if (!anchorReplayInfoData.supportShareWithFansClub) {
            Boolean bool2 = Boolean.FALSE;
            return new Pair(bool2, bool2);
        }
        if (LJIILIIL("fans_club")) {
            ((ArrayList) LIZIZ).add("fans_club");
            Boolean bool3 = Boolean.FALSE;
            return new Pair(bool3, bool3);
        }
        C1834350xpp.LIZ.getClass();
        boolean zLJJIJIIJIL = C500260Jjc.LJJIJIIJIL(C1834350xpp.LJIIJJI.LIZ());
        boolean z2 = true;
        boolean zLJJIJIIJIL2 = false;
        if (anchorReplayInfoData.shareWithFansClubSwitch == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!zLJJIJIIJIL || !anchorReplayInfoData.shareWithFansClubStrongReach || !z) {
            z2 = false;
            if (LIZLLL(funcConf) && !anchorReplayInfoData.shareWithFansClubStrongReach) {
                if (z) {
                    LJIIZILJ("fans_club");
                } else {
                    zLJJIJIIJIL2 = C500260Jjc.LJJIJIIJIL(C1834350xpp.LJIIL.LIZ());
                }
            }
        }
        ((ArrayList) LIZIZ).add("fans_club");
        return new Pair(Boolean.valueOf(z2), Boolean.valueOf(zLJJIJIIJIL2));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0115 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1833580xoa.LIZIZ(com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoData, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZJ(com.bytedance.android.livesdk.chatroom.model.PlaylistReminderInfo r5, com.bytedance.android.livesdk.chatroom.model.FuncConf r6) {
        /*
            java.lang.String r4 = "playlist"
            boolean r0 = LJIILIIL(r4)
            if (r0 == 0) goto L17
            java.util.List<java.lang.String> r0 = X.C1833580xoa.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r0, r0)
            return r1
        L17:
            X.0JT6<java.lang.Boolean> r0 = X.InterfaceC1833600xoc.na
            java.lang.Object r0 = r0.LIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = X.C500260Jjc.LJJIJIIJIL(r0)
            r1 = 1
            r3 = 0
            if (r0 != 0) goto L6b
            X.0JT6<java.lang.Boolean> r0 = X.InterfaceC1833600xoc.pa
            java.lang.Object r0 = r0.LIZ()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = X.C500260Jjc.LJJIJIIJIL(r0)
            if (r0 != 0) goto L6b
            r2 = 0
        L36:
            if (r5 == 0) goto L69
            int r0 = r5.type
            if (r0 != r1) goto L55
            int r0 = r5.reminderCount
            if (r0 != 0) goto L69
        L40:
            java.util.List<java.lang.String> r0 = X.C1833580xoa.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.<init>(r1, r0)
            return r2
        L55:
            int r1 = r5.type
            r0 = 2
            if (r1 != r0) goto L69
            int r0 = r5.reminderCount
            if (r0 != 0) goto L69
            if (r2 == 0) goto L69
            boolean r0 = LIZLLL(r6)
            if (r0 == 0) goto L69
            r3 = 1
            r1 = 0
            goto L40
        L69:
            r1 = 0
            goto L40
        L6b:
            r2 = 1
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1833580xoa.LIZJ(com.bytedance.android.livesdk.chatroom.model.PlaylistReminderInfo, com.bytedance.android.livesdk.chatroom.model.FuncConf):kotlin.Pair");
    }

    public static Pair LJ(AnchorReplayInfoData anchorReplayInfoData, FuncConf funcConf) {
        boolean z;
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        if (!LiveReplayHighlightRecoverSetting.INSTANCE.enable()) {
            ((ArrayList) LIZIZ).add("fragment_revert");
            return pair;
        }
        if (LJIILIIL("fragment_revert")) {
            ((ArrayList) LIZIZ).add("fragment_revert");
            return pair;
        }
        C1834350xpp.LIZ.getClass();
        boolean zLJJIJIIJIL = false;
        if (C500260Jjc.LJJIJIIJIL(C1834350xpp.LJFF.LIZ()) && anchorReplayInfoData.hasPostedLast7d && anchorReplayInfoData.fragmentRevertSwitch == 0) {
            z = true;
        } else {
            z = false;
            if (LIZLLL(funcConf)) {
                if (anchorReplayInfoData.fragmentRevertSwitch != 0) {
                    LJIIZILJ("fragment_revert");
                } else {
                    zLJJIJIIJIL = C500260Jjc.LJJIJIIJIL(C1834350xpp.LIZIZ.LIZ());
                }
            }
        }
        ((ArrayList) LIZIZ).add("fragment_revert");
        return new Pair(Boolean.valueOf(z), Boolean.valueOf(zLJJIJIIJIL));
    }

    public static Pair LJFF(AnchorReplayInfoData anchorReplayInfoData, FuncConf funcConf) {
        boolean z;
        Boolean bool = Boolean.FALSE;
        Pair pair = new Pair(bool, bool);
        if (!LiveUserPostHighlightSetting.INSTANCE.getValue()) {
            ((ArrayList) LIZIZ).add("share_viewers");
            return pair;
        }
        if (LJIILIIL("share_viewers")) {
            ((ArrayList) LIZIZ).add("share_viewers");
            return pair;
        }
        C1834350xpp.LIZ.getClass();
        boolean zLJJIJIIJIL = false;
        if (C500260Jjc.LJJIJIIJIL(C1834350xpp.LJIIIZ.LIZ()) && anchorReplayInfoData.hasPostedLast7d && anchorReplayInfoData.shareWithViewersSwitch == 0) {
            z = true;
        } else {
            z = false;
            if (LIZLLL(funcConf)) {
                if (anchorReplayInfoData.shareWithViewersSwitch != 0) {
                    LJIIZILJ("share_viewers");
                } else {
                    zLJJIJIIJIL = C500260Jjc.LJJIJIIJIL(C1834350xpp.LJIIJ.LIZ());
                }
            }
        }
        ((ArrayList) LIZIZ).add("share_viewers");
        return new Pair(Boolean.valueOf(z), Boolean.valueOf(zLJJIJIIJIL));
    }

    public static boolean LJIIL(C1833590xob c1833590xob, String str) {
        if ((c1833590xob != null || (c1833590xob = LJIIJJI()) != null) && !c1833590xob.LIZJ.contains(str)) {
            return false;
        }
        return true;
    }

    public static void LJIJI(String str, boolean z) {
        LJ = new C1833520xoU(str, z, !z);
        if (z) {
            LJIILLIIL(str);
        }
    }

    public static void LJIJJ(String str, Pair pair) {
        for (String str2 : LIZ) {
            if (Intrinsics.LJFF(str2, str)) {
                LIZJ.put(str2, (Boolean) pair.getFirst());
                LIZLLL.put(str2, (Boolean) pair.getSecond());
            } else {
                Map<String, Boolean> map = LIZJ;
                Boolean bool = Boolean.FALSE;
                map.put(str2, bool);
                LIZLLL.put(str2, bool);
            }
        }
    }
}
