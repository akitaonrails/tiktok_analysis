package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV3Service;
import com.ss.android.ugc.aweme.preload.smart.v3.exp.SmartPreloadControlConfig;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214851BmN {
    public static Aweme LIZ;
    public static String LIZIZ;
    public static long LIZJ = -1;
    public static final Map<String, Boolean> LIZLLL = new ConcurrentHashMap();
    public static final List<InterfaceC2214871BmP> LJ;
    public static final Map<String, InterfaceC2214871BmP> LJFF;
    public static boolean LJI;
    public static final C0T07 LJII;
    public static boolean LJIIIIZZ;
    public static long LJIIIZ;
    public static final ConcurrentHashSet LJIIJ;
    public static boolean LJIIJJI;
    public static float LJIIL;
    public static WeakReference<Activity> LJIILIIL;
    public static WeakReference<Fragment> LJIILJJIL;
    public static Integer LJIILL;

    static {
        ArrayList arrayList = new ArrayList();
        LJ = arrayList;
        LJFF = new ConcurrentHashMap();
        LJII = new C0T07();
        LJIIJ = new ConcurrentHashSet();
        LJIIL = -1.0f;
        arrayList.add(new InterfaceC2214871BmP() { // from class: X.1BmU
            public final Map<String, InterfaceC2214931BmV> LIZ = new LinkedHashMap();
            public int LIZIZ = -1;

            @Override // X.InterfaceC2214871BmP
            public final void getType() {
            }

            @Override // X.InterfaceC2214871BmP
            public final int getSceneId() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC2214871BmP
            public final void LJFF(String str) {
                C2214941BmW c2214941BmW;
                ISmartPreloadCommentV3Service iSmartPreloadCommentV3ServiceLJII;
                if (this.LIZ.containsKey(str)) {
                    return;
                }
                if (C1511590pRF.LIZ(str)) {
                    c2214941BmW = new C2214941BmW();
                } else {
                    c2214941BmW = null;
                }
                this.LIZ.put(str, c2214941BmW);
                if (c2214941BmW != null && C1511590pRF.LIZ(str) && (iSmartPreloadCommentV3ServiceLJII = c2214941BmW.LJII()) != null) {
                    iSmartPreloadCommentV3ServiceLJII.LJFF(str);
                }
            }

            @Override // X.InterfaceC2214871BmP
            public final void LJI(int i) {
                this.LIZIZ = i;
            }

            @Override // X.InterfaceC2214871BmP
            public final Integer LIZ(int i, String str) {
                InterfaceC2214931BmV interfaceC2214931BmV = (InterfaceC2214931BmV) ((LinkedHashMap) this.LIZ).get(str);
                if (interfaceC2214931BmV != null) {
                    return interfaceC2214931BmV.LIZ(i, str);
                }
                return null;
            }

            @Override // X.InterfaceC2214871BmP
            public final Integer LIZIZ(int i, String str) {
                InterfaceC2214931BmV interfaceC2214931BmV = (InterfaceC2214931BmV) ((LinkedHashMap) this.LIZ).get(str);
                if (interfaceC2214931BmV != null) {
                    return interfaceC2214931BmV.LIZIZ(i, str);
                }
                return null;
            }

            @Override // X.InterfaceC2214871BmP
            public final int LIZLLL(int i, String str) {
                InterfaceC2214931BmV interfaceC2214931BmV = (InterfaceC2214931BmV) ((LinkedHashMap) this.LIZ).get(str);
                if (interfaceC2214931BmV != null) {
                    return interfaceC2214931BmV.LIZLLL(i, str);
                }
                return EnumC993940byK.ONLY_WIFI.getValue();
            }

            @Override // X.InterfaceC2214871BmP
            public final boolean LJ(Aweme aweme, String str) {
                InterfaceC2214931BmV interfaceC2214931BmV = (InterfaceC2214931BmV) ((LinkedHashMap) this.LIZ).get(str);
                if (interfaceC2214931BmV != null) {
                    return interfaceC2214931BmV.LJ(aweme, str);
                }
                return true;
            }

            @Override // X.InterfaceC2214871BmP
            public final boolean LIZJ(int i, Aweme aweme, String str, C0T07 c0t07) {
                InterfaceC2214931BmV interfaceC2214931BmV = (InterfaceC2214931BmV) ((LinkedHashMap) this.LIZ).get(str);
                if (interfaceC2214931BmV == null) {
                    if (C1511590pRF.LIZ(str)) {
                        C2214861BmO.LIZ.getClass();
                        C2214861BmO.LIZJ(12, "comment_preload");
                        return false;
                    }
                    return false;
                }
                return interfaceC2214931BmV.LIZJ(i, aweme, str, c0t07);
            }

            @Override // X.InterfaceC2214871BmP
            public final void LJII(int i, Aweme aweme, String str, C0T07 c0t07, C2214971BmZ c2214971BmZ) {
                this.LIZIZ = i;
                InterfaceC2214931BmV interfaceC2214931BmV = (InterfaceC2214931BmV) ((LinkedHashMap) this.LIZ).get(str);
                if (interfaceC2214931BmV != null) {
                    interfaceC2214931BmV.LJFF(i, aweme, str, c2214971BmZ);
                }
            }
        });
    }

    public static void LIZJ() throws JSONException {
        LJII.LIZ = false;
        C2214861BmO.LIZ.getClass();
        if (C2214861BmO.LIZ()) {
            for (InterfaceC2214871BmP interfaceC2214871BmP : (ArrayList) LJ) {
                C2214861BmO c2214861BmO = C2214861BmO.LIZ;
                interfaceC2214871BmP.getType();
                Long lValueOf = Long.valueOf(LIZJ);
                c2214861BmO.getClass();
                C2214861BmO.LIZIZ(lValueOf, "comment_preload", "play_position");
                interfaceC2214871BmP.getType();
                C2214861BmO.LIZIZ(Integer.valueOf(LJI ? 1 : 0), "comment_preload", "is_complete_loaded");
                interfaceC2214871BmP.getType();
                ConcurrentHashSet concurrentHashSet = LJIIJ;
                C2214861BmO.LIZIZ(Integer.valueOf(concurrentHashSet.contains(3) ? 1 : 0), "comment_preload", "is_play_finished");
                interfaceC2214871BmP.getType();
                C2214861BmO.LIZIZ(Integer.valueOf(concurrentHashSet.contains(4) ? 1 : 0), "comment_preload", "is_like");
                interfaceC2214871BmP.getType();
                C2214861BmO.LIZIZ(Integer.valueOf(concurrentHashSet.contains(5) ? 1 : 0), "comment_preload", "is_favorite");
            }
            C2214861BmO.LIZ.getClass();
            if (C2214861BmO.LIZ() && AbstractC19994813Le.Default.nextFloat() < ((Number) C2214861BmO.LIZLLL.getValue()).floatValue()) {
                for (Map.Entry entry : ((LinkedHashMap) C2214861BmO.LIZIZ).entrySet()) {
                    C2214861BmO c2214861BmO2 = C2214861BmO.LIZ;
                    C2214881BmQ c2214881BmQ = (C2214881BmQ) entry.getValue();
                    c2214861BmO2.getClass();
                    if (!c2214881BmQ.LIZLLL) {
                        int i = c2214881BmQ.LIZIZ;
                        c2214881BmQ.LIZ = i > 0 ? 0 : i == 0 ? 1 : -1;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("is_success", c2214881BmQ.LIZ);
                        jSONObject.put("error_code", c2214881BmQ.LIZIZ);
                        jSONObject.put("enter_from", c2214881BmQ.LJFF);
                        jSONObject.put("type", c2214881BmQ.LJ);
                        for (Map.Entry<String, Object> entry2 : c2214881BmQ.LIZJ.entrySet()) {
                            jSONObject.put(entry2.getKey(), entry2.getValue());
                        }
                        C20684815ws.LJIJ("smart_preload_v3_monitor", jSONObject);
                    }
                }
            }
        }
        ((ConcurrentHashMap) LIZLLL).clear();
        ((ConcurrentHashMap) LJFF).clear();
        LJIIJ.clear();
        LJI = false;
        LIZ = null;
        LIZJ = -1L;
        LJIIJJI = false;
        LJIIL = -1.0f;
        LJIILIIL = null;
        LJIILJJIL = null;
    }

    public static void LIZLLL() {
        if (true != LJI) {
            LJI = true;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LJFF;
            if (true ^ concurrentHashMap.isEmpty()) {
                for (Map.Entry entry : concurrentHashMap.entrySet()) {
                    LJ(((InterfaceC2214871BmP) entry.getValue()).getSceneId(), (InterfaceC2214871BmP) entry.getValue());
                }
                ((ConcurrentHashMap) LJFF).clear();
            }
        }
    }

    public static void LJFF(int i) {
        Iterator it2 = ((ArrayList) LJ).iterator();
        while (it2.hasNext()) {
            LJ(i, (InterfaceC2214871BmP) it2.next());
        }
        LJIIJ.add(Integer.valueOf(i));
    }

    public static void LJ(final int i, final InterfaceC2214871BmP interfaceC2214871BmP) {
        String aid;
        SmartPreloadControlConfig smartPreloadControlConfig;
        final String str = LIZIZ;
        if (str != null) {
            Map<String, Boolean> map = LIZLLL;
            interfaceC2214871BmP.getType();
            if (Intrinsics.LJFF(((ConcurrentHashMap) map).get("comment_preload"), Boolean.TRUE)) {
                return;
            }
            interfaceC2214871BmP.getType();
            if (Intrinsics.LJFF("comment_preload", "comment_preload") && Intrinsics.LJFF(str, "homepage_friends") && LJII.LIZIZ) {
                return;
            }
            C2214861BmO c2214861BmO = C2214861BmO.LIZ;
            interfaceC2214871BmP.getType();
            c2214861BmO.getClass();
            final int iLIZ = 0;
            if (C2214861BmO.LIZ()) {
                Map<String, C2214881BmQ> map2 = C2214861BmO.LIZIZ;
                if (map2.containsKey("comment_preload")) {
                    C2214881BmQ c2214881BmQ = (C2214881BmQ) ((LinkedHashMap) map2).get("comment_preload");
                    if (c2214881BmQ != null) {
                        c2214881BmQ.LJFF = str;
                        c2214881BmQ.LIZ = -1;
                        c2214881BmQ.LIZIZ = -1;
                        c2214881BmQ.LIZLLL = false;
                    }
                } else {
                    map2.put("comment_preload", new C2214881BmQ("comment_preload", str));
                }
            }
            Aweme aweme = LIZ;
            if (aweme != null) {
                iLIZ = C1387940mDo.LIZ(aweme);
            }
            interfaceC2214871BmP.getType();
            if (!Intrinsics.LJFF("comment_preload", "comment_preload") && (smartPreloadControlConfig = (SmartPreloadControlConfig) C2214911BmT.LIZ.getValue()) != null && !smartPreloadControlConfig.getOnlyInWifi()) {
                LIZIZ(i, interfaceC2214871BmP, str, true);
                return;
            }
            C0CRP c0crp = new C0CRP() { // from class: X.0CS3
                @Override // X.C0CRP
                public final void LIZ() {
                    C2214861BmO c2214861BmO2 = C2214861BmO.LIZ;
                    interfaceC2214871BmP.getType();
                    c2214861BmO2.getClass();
                    C2214861BmO.LIZJ(10, "comment_preload");
                }

                @Override // X.C0CRP
                public final void LIZIZ(boolean z) {
                    Aweme aweme2 = C2214851BmN.LIZ;
                    InterfaceC2214871BmP interfaceC2214871BmP2 = interfaceC2214871BmP;
                    String str2 = str;
                    int i2 = i;
                    int i3 = iLIZ;
                    if (interfaceC2214871BmP2.LIZJ(i2, C2214851BmN.LIZ, str2, C2214851BmN.LJII)) {
                        if (((Number) C261660ANg.LIZ.getValue()).intValue() == 1) {
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0CS1(interfaceC2214871BmP2, i3, str2, z, i2, null), 3);
                            return;
                        }
                        Boolean boolLIZ = C2214851BmN.LIZ(i3, interfaceC2214871BmP2, str2, z);
                        if (boolLIZ == null) {
                            return;
                        }
                        if (boolLIZ.booleanValue()) {
                            C2214851BmN.LIZIZ(i2, interfaceC2214871BmP2, str2, z);
                            return;
                        }
                        C2214861BmO c2214861BmO2 = C2214861BmO.LIZ;
                        interfaceC2214871BmP2.getType();
                        c2214861BmO2.getClass();
                        C2214861BmO.LIZJ(21, "comment_preload");
                    }
                }
            };
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkIsWifiStateAsync aid: ");
            Aweme aweme2 = LIZ;
            if (aweme2 != null) {
                aid = aweme2.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
            if (Math.abs(System.currentTimeMillis() - LJIIIZ) > 300000) {
                LJIIIZ = System.currentTimeMillis();
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C0CRM(c0crp, null), 3);
            } else {
                c0crp.LIZIZ(LJIIIIZZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean LIZ(int r6, X.InterfaceC2214871BmP r7, java.lang.String r8, boolean r9) {
        /*
            int r5 = r7.LIZLLL(r6, r8)
            java.lang.Integer r4 = r7.LIZIZ(r6, r8)
            java.lang.Integer r3 = r7.LIZ(r6, r8)
            int r2 = com.bytedance.ttnet.TTNetInit.getEffectiveConnectionType()
            X.0byK r0 = X.EnumC993940byK.ALL
            int r0 = r0.getValue()
            r1 = 1
            if (r5 != r0) goto L31
            if (r9 == 0) goto L28
            if (r4 == 0) goto L23
            int r0 = r4.intValue()
            if (r2 < r0) goto L44
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L28:
            if (r3 == 0) goto L23
            int r0 = r3.intValue()
            if (r2 < r0) goto L44
            goto L23
        L31:
            X.0byK r0 = X.EnumC993940byK.ONLY_WIFI
            int r0 = r0.getValue()
            if (r5 != r0) goto L44
            if (r9 == 0) goto L46
            if (r4 == 0) goto L23
            int r0 = r4.intValue()
            if (r2 < r0) goto L46
            goto L23
        L44:
            r1 = 0
            goto L23
        L46:
            X.1BmO r0 = X.C2214861BmO.LIZ
            r7.getType()
            r0.getClass()
            java.lang.String r0 = "comment_preload"
            X.C2214861BmO.LIZJ(r1, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2214851BmN.LIZ(int, X.1BmP, java.lang.String, boolean):java.lang.Boolean");
    }

    public static void LIZIZ(int i, InterfaceC2214871BmP interfaceC2214871BmP, String str, boolean z) {
        Aweme aweme = LIZ;
        C0T07 c0t07 = LJII;
        if (!interfaceC2214871BmP.LIZJ(i, aweme, str, c0t07)) {
            return;
        }
        String aid = null;
        if (!LJI && interfaceC2214871BmP.LJ(LIZ, str)) {
            Map<String, InterfaceC2214871BmP> map = LJFF;
            interfaceC2214871BmP.getType();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
            if (!concurrentHashMap.containsKey("comment_preload")) {
                interfaceC2214871BmP.LJI(i);
                interfaceC2214871BmP.getType();
                concurrentHashMap.put("comment_preload", interfaceC2214871BmP);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("triggerOneTask: save pending task:");
                interfaceC2214871BmP.getType();
                sbLIZ.append("comment_preload");
                sbLIZ.append(" sceneId: ");
                sbLIZ.append(i);
                sbLIZ.append(" aid: ");
                Aweme aweme2 = LIZ;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                }
                sbLIZ.append(aid);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C2214861BmO c2214861BmO = C2214861BmO.LIZ;
            interfaceC2214871BmP.getType();
            c2214861BmO.getClass();
            C2214861BmO.LIZJ(11, "comment_preload");
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("triggerOneTask: sceneId: ");
        sbLIZ2.append(i);
        sbLIZ2.append(" aid: ");
        Aweme aweme3 = LIZ;
        if (aweme3 != null) {
            aid = aweme3.getAid();
        }
        sbLIZ2.append(aid);
        C2188811AlT.LIZIZ(sbLIZ2);
        interfaceC2214871BmP.LJII(i, LIZ, str, c0t07, new C2214971BmZ(LJIILIIL, LJIILJJIL, LJIILL, z));
        Map<String, Boolean> map2 = LIZLLL;
        interfaceC2214871BmP.getType();
        ((ConcurrentHashMap) map2).put("comment_preload", Boolean.TRUE);
    }
}
