package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.exposedcmt.limit.ExposedCommentRemoveOnceData;
import com.ss.android.ugc.aweme.comment.exposedcmt.limit.ExposedCommentUidRemoveData;
import com.ss.android.ugc.aweme.comment.exposedcmt.limit.ExposedCommentUidRemoveMetaData;
import com.ss.android.ugc.aweme.comment.exposedcmt.limit.ExposedCommentUidShowData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sjv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729770Sjv {
    public static final C729770Sjv LIZ = new C729770Sjv();
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final C01GW LJFF;
    public static final C01GW LJI;
    public static final C01GW LJII;
    public static final C01GW LJIIIIZZ;
    public static final C01GW LJIIIZ;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        LIZIZ = C452501pT.LIZ(enumC452301pR, AFwS198S0000000_11.get$arr$(301));
        LIZJ = C452501pT.LIZ(enumC452301pR, AFwS198S0000000_11.get$arr$(302));
        LIZLLL = C452501pT.LIZ(enumC452301pR, AFwS198S0000000_11.get$arr$(304));
        LJ = C452501pT.LIZ(enumC452301pR, AFwS198S0000000_11.get$arr$(299));
        LJFF = C452501pT.LIZ(enumC452301pR, AFwS198S0000000_11.get$arr$(303));
        LJI = C452501pT.LIZ(enumC452301pR, AFwS198S0000000_11.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        LJII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(296));
        LJIIIIZZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(297));
        LJIIIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(298));
    }

    public static HashMap LIZLLL() {
        return (HashMap) LJII.getValue();
    }

    public static HashMap LJ() {
        return (HashMap) LJIIIZ.getValue();
    }

    public static void LIZ() {
        Object c098200Yq;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (LJ().get(curUserId) == null) {
            LJ().clear();
            try {
                C1227904rF c1227904rF = C1227904rF.LIZ;
                LIZ.getClass();
                String string = ((Keva) LJI.getValue()).getString(curUserId, null);
                c1227904rF.getClass();
                c098200Yq = (ExposedCommentUidShowData) C1227904rF.LIZIZ(string, ExposedCommentUidShowData.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) {
                c098200Yq = new ExposedCommentUidShowData(new HashMap());
            }
            LJ().put(curUserId, c098200Yq);
        }
    }

    public static void LIZIZ() {
        Object c098200Yq;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (LIZLLL().get(curUserId) == null) {
            LIZLLL().clear();
            if (((Keva) LIZIZ.getValue()).getBoolean(curUserId, false)) {
                LIZLLL().put(curUserId, new C729750Sjt(null, true));
                return;
            }
            HashMap mapLIZLLL = LIZLLL();
            String string = ((Keva) LIZJ.getValue()).getString(curUserId, null);
            try {
                C1227904rF.LIZ.getClass();
                c098200Yq = (ExposedCommentRemoveOnceData) C1227904rF.LIZIZ(string, ExposedCommentRemoveOnceData.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            mapLIZLLL.put(curUserId, new C729750Sjt((ExposedCommentRemoveOnceData) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq), false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    public static void LIZJ() {
        Object c098200Yq;
        ?? arrayList;
        HashMap<String, Set<String>> map;
        ExposedCommentUidRemoveMetaData exposedCommentUidRemoveMetaData;
        ExposedCommentUidRemoveMetaData next;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C01GW c01gw = LJIIIIZZ;
        if (((HashMap) c01gw.getValue()).get(curUserId) == null) {
            String curUserId2 = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            LIZ();
            if (((HashMap) c01gw.getValue()).get(curUserId2) == null) {
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    LIZ.getClass();
                    String string = ((Keva) LIZLLL.getValue()).getString(curUserId2, null);
                    c1227904rF.getClass();
                    c098200Yq = (ExposedCommentUidRemoveData) C1227904rF.LIZIZ(string, ExposedCommentUidRemoveData.class);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                ExposedCommentUidRemoveData exposedCommentUidRemoveData = (ExposedCommentUidRemoveData) c098200Yq;
                List<ExposedCommentUidRemoveMetaData> list = exposedCommentUidRemoveData != null ? exposedCommentUidRemoveData.removeUidList : null;
                ExposedCommentUidShowData exposedCommentUidShowData = (ExposedCommentUidShowData) LJ().get(curUserId2);
                if (exposedCommentUidShowData == null || (map = exposedCommentUidShowData.unclikedCommentUid) == null) {
                    arrayList = C13BV.INSTANCE;
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
                        if (entry.getValue().size() >= 3) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        String str = (String) entry2.getKey();
                        entry2.getValue();
                        if (list != null) {
                            Iterator<ExposedCommentUidRemoveMetaData> it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.LJFF(next.uid, str)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            exposedCommentUidRemoveMetaData = next;
                        } else {
                            exposedCommentUidRemoveMetaData = null;
                        }
                        arrayList.add(new ExposedCommentUidRemoveMetaData(str, exposedCommentUidRemoveMetaData != null ? exposedCommentUidRemoveMetaData.startLimitTime : System.currentTimeMillis(), 3));
                    }
                }
                ExposedCommentUidRemoveData exposedCommentUidRemoveData2 = new ExposedCommentUidRemoveData(arrayList, 0, 0L, 6, null);
                Keva keva = (Keva) LIZLLL.getValue();
                C1227904rF.LIZ.getClass();
                keva.storeString(curUserId2, C1227904rF.LJI(exposedCommentUidRemoveData2));
                ((HashMap) LJIIIIZZ.getValue()).put(curUserId2, exposedCommentUidRemoveData2);
            }
        }
    }
}
