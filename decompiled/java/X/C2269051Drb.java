package X;

import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.IAVMobService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Drb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2269051Drb extends C09AY implements Function0<C1361860lXk> {
    public C2269051Drb() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lXk] */
    @Override // kotlin.jvm.functions.Function0
    public final C1361860lXk invoke() {
        return new IAVMobService() { // from class: X.0lXk
            @Override // com.ss.android.ugc.aweme.services.IAVMobService
            public final <T> T appendCreationParams(T t, Aweme aweme) {
                List<AnchorCommonStruct> anchors;
                try {
                    LIZ(t, "camera_use_function", C0SP9.LIZJ(aweme));
                    if (aweme != null && (anchors = aweme.getAnchors()) != null) {
                        Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (it2.next().getType() == 109) {
                                LIZ(t, "is_visual_poet", "1");
                                break;
                            }
                        }
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                    return t;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                    return t;
                }
            }

            @Override // com.ss.android.ugc.aweme.services.IAVMobService
            public final <T> T appendValues(T t, Map<String, String> map) throws JSONException {
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        LIZ(t, entry.getKey(), entry.getValue());
                    }
                }
                return t;
            }

            @Override // com.ss.android.ugc.aweme.services.IAVMobService
            public final void onEventV3(String str, Map<String, String> map) {
                C2341909Fp.LIZ(str, map);
            }

            @Override // com.ss.android.ugc.aweme.services.IAVMobService
            public final void onEventV3(String str, JSONObject jSONObject) {
                C2341909Fp.LIZIZ(str, jSONObject);
            }

            public static void LIZ(Object obj, String str, Object obj2) throws JSONException {
                if (obj instanceof AbstractC1386130mAt) {
                    if (obj2 instanceof String) {
                        ((AbstractC1386130mAt) obj).LJ(str, (String) obj2);
                        return;
                    }
                    if (obj2 instanceof Integer) {
                        ((AbstractC1386130mAt) obj).LIZLLL(((Number) obj2).intValue(), str);
                        return;
                    } else if (obj2 instanceof Boolean) {
                        ((AbstractC1386130mAt) obj).LJI(str, ((Boolean) obj2).booleanValue());
                        return;
                    } else {
                        ((AbstractC1386130mAt) obj).LJ(str, obj2.toString());
                        return;
                    }
                }
                if (obj instanceof C2241008qG) {
                    if (obj2 instanceof String) {
                        ((C2241008qG) obj).LIZLLL(str, (String) obj2);
                        return;
                    }
                    if (obj2 instanceof Integer) {
                        ((C2241008qG) obj).LIZIZ((Integer) obj2, str);
                        return;
                    } else if (obj2 instanceof Boolean) {
                        ((C2241008qG) obj).LIZ((Boolean) obj2, str);
                        return;
                    } else {
                        ((C2241008qG) obj).LIZLLL(str, obj2.toString());
                        return;
                    }
                }
                if (obj instanceof C2344009Gk) {
                    if (obj2 instanceof String) {
                        ((C2344009Gk) obj).LJFF(str, (String) obj2);
                        return;
                    }
                    if (obj2 instanceof Integer) {
                        ((C2344009Gk) obj).LIZJ(((Number) obj2).intValue(), str);
                        return;
                    } else if (obj2 instanceof Boolean) {
                        ((C2344009Gk) obj).LJ(obj2, str);
                        return;
                    } else {
                        ((C2344009Gk) obj).LJFF(str, obj2.toString());
                        return;
                    }
                }
                if (obj instanceof JSONObject) {
                    if (obj2 instanceof String) {
                        ((JSONObject) obj).put(str, obj2);
                        return;
                    }
                    if (obj2 instanceof Integer) {
                        ((JSONObject) obj).put(str, ((Number) obj2).intValue());
                        return;
                    } else if (obj2 instanceof Boolean) {
                        ((JSONObject) obj).put(str, ((Boolean) obj2).booleanValue());
                        return;
                    } else {
                        ((JSONObject) obj).put(str, obj2.toString());
                        return;
                    }
                }
                if (!(obj instanceof Bundle)) {
                    return;
                }
                if (obj2 instanceof String) {
                    ((BaseBundle) obj).putString(str, (String) obj2);
                } else {
                    if (!(obj2 instanceof Integer)) {
                        return;
                    }
                    ((BaseBundle) obj).putInt(str, ((Number) obj2).intValue());
                }
            }

            @Override // com.ss.android.ugc.aweme.services.IAVMobService
            public final <T> T appendDetailParams(T t, String str, Map<String, String> map) throws JSONException {
                if ((Intrinsics.LJFF(str, "single_song") || Intrinsics.LJFF(str, "prop_page")) && map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        LIZ(t, entry.getKey(), entry.getValue());
                    }
                }
                return t;
            }
        };
    }
}
