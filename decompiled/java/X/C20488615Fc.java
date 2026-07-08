package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ComponentTypeResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MatchComponentTypeInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15Fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@InterfaceC1294060jmO
public final class C20488615Fc {
    public static final ConcurrentHashMap<String, MatchComponentTypeInfo> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();
    public static final C20488715Fd LIZJ = new InterfaceC914420Zu4() { // from class: X.15Fd
        @Override // X.InterfaceC914420Zu4
        public final void LIZ(String str) {
        }

        @Override // X.InterfaceC914420Zu4
        public final void LIZIZ(String str, Map<String, String> map) {
            ComponentTypeResult componentTypeResult;
            if (Intrinsics.LJFF(str, "component_type")) {
                ConcurrentHashMap<String, MatchComponentTypeInfo> concurrentHashMap = C20488615Fc.LIZ;
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    MatchComponentTypeInfo matchComponentTypeInfo = concurrentHashMap.get(entry.getKey());
                    if (matchComponentTypeInfo == null || !matchComponentTypeInfo.isReported()) {
                        if (concurrentHashMap.containsKey(entry.getKey())) {
                            MatchComponentTypeInfo matchComponentTypeInfo2 = concurrentHashMap.get(entry.getKey());
                            if (matchComponentTypeInfo2 != null) {
                                componentTypeResult = matchComponentTypeInfo2.result;
                            } else {
                                componentTypeResult = null;
                            }
                            if (componentTypeResult == ComponentTypeResult.SHOW && !Intrinsics.LJFF(entry.getValue(), CardStruct.IStatusCode.DEFAULT)) {
                                MatchComponentTypeInfo matchComponentTypeInfo3 = concurrentHashMap.get(entry.getKey());
                                if (matchComponentTypeInfo3 != null) {
                                    matchComponentTypeInfo3.setResult(ComponentTypeResult.SUCCESS);
                                    matchComponentTypeInfo3.setReported(true);
                                    matchComponentTypeInfo3.setStartShowTime(entry.getValue());
                                }
                                C20488615Fc.LIZLLL(entry.getKey(), ComponentTypeResult.SUCCESS.getValue());
                            }
                        }
                        if (!concurrentHashMap.containsKey(entry.getKey())) {
                            concurrentHashMap.put(entry.getKey(), new MatchComponentTypeInfo(entry.getValue(), 0L, ComponentTypeResult.SEI, false));
                        }
                    }
                }
            }
        }
    };

    public static void LIZIZ(String str, boolean z) {
        ComponentTypeResult componentTypeResult;
        if (z) {
            return;
        }
        ConcurrentHashMap<String, MatchComponentTypeInfo> concurrentHashMap = LIZ;
        MatchComponentTypeInfo matchComponentTypeInfo = concurrentHashMap.get(str);
        if (matchComponentTypeInfo != null && matchComponentTypeInfo.isReported()) {
            return;
        }
        long jLIZ = C158B.LIZ();
        if (concurrentHashMap.containsKey(str)) {
            MatchComponentTypeInfo matchComponentTypeInfo2 = concurrentHashMap.get(str);
            if (matchComponentTypeInfo2 != null) {
                componentTypeResult = matchComponentTypeInfo2.result;
            } else {
                componentTypeResult = null;
            }
            if (componentTypeResult == ComponentTypeResult.SEI) {
                MatchComponentTypeInfo matchComponentTypeInfo3 = concurrentHashMap.get(str);
                if (matchComponentTypeInfo3 != null) {
                    matchComponentTypeInfo3.setResult(ComponentTypeResult.SUCCESS);
                    matchComponentTypeInfo3.setStartShowTime(String.valueOf(jLIZ));
                    matchComponentTypeInfo3.setReported(true);
                }
                LIZLLL(str, ComponentTypeResult.SUCCESS.getValue());
                return;
            }
        }
        if (concurrentHashMap.containsKey(str)) {
            return;
        }
        concurrentHashMap.put(str, new MatchComponentTypeInfo(String.valueOf(jLIZ), 0L, ComponentTypeResult.SHOW, false));
    }

    public static void LIZJ(String str, boolean z) {
        MatchComponentTypeInfo matchComponentTypeInfo;
        if (z) {
            return;
        }
        ConcurrentHashMap<String, MatchComponentTypeInfo> concurrentHashMap = LIZ;
        if (concurrentHashMap.containsKey(str) && (matchComponentTypeInfo = concurrentHashMap.get(str)) != null) {
            if (!matchComponentTypeInfo.isReported() && matchComponentTypeInfo.result != ComponentTypeResult.SUCCESS && !Intrinsics.LJFF(matchComponentTypeInfo.startShowTime, CardStruct.IStatusCode.DEFAULT)) {
                LIZLLL(str, matchComponentTypeInfo.result.getValue());
            }
            concurrentHashMap.remove(str);
        }
    }

    public static void LIZLLL(String str, String str2) {
        boolean zLLFZ = C915980Zwa.LJI().LIZJ().LLFZ();
        C974450bSt c974450bSt = C973890bRz.LIZ;
        C974480bSw c974480bSw = C974480bSw.LIZ;
        Boolean boolValueOf = Boolean.valueOf(zLLFZ);
        JSONObject jSONObject = new JSONObject();
        C0K04.LJFF(str, str2, jSONObject);
        C0K04.LIZLLL(Intrinsics.LJFF(boolValueOf, Boolean.TRUE) ? 1 : 0, "is_first_sei", jSONObject);
        c974480bSw.LJJIIJ(0, "battle_component_show", jSONObject);
    }

    public static void LJ(String str, boolean z) {
        if (z) {
            ConcurrentHashMap<String, String> concurrentHashMap = LIZIZ;
            concurrentHashMap.remove(str);
            C914770Zud.LIZ("component_type", concurrentHashMap, true);
        }
    }

    public static void LIZ(EnumC20488515Fb enumC20488515Fb, long j, boolean z) {
        if (z) {
            for (Map.Entry<String, String> entry : LIZIZ.entrySet()) {
                if (!Intrinsics.LJFF(entry.getKey(), EnumC20488515Fb.SMOKE_CARD.getValue()) && !Intrinsics.LJFF(entry.getKey(), EnumC20488515Fb.STRIKE_CARD.getValue())) {
                    LIZIZ.remove(entry.getKey());
                }
            }
            if (j != 0) {
                LIZIZ.put(enumC20488515Fb.getValue(), String.valueOf(j));
            }
            C915980Zwa.LIZLLL().We1("component_type", LIZIZ);
        }
    }
}
