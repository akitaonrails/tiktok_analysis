package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import com.ss.android.ugc.aweme.feed.model.banner.SignalCodeEnum;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentKey;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentUi;
import com.ss.android.ugc.aweme.feed.model.banner.StandardSignalStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02ri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C721202ri {
    public static final ClientStandardModel LIZ(List<StandardComponentStruct> list) {
        String str;
        FcpUiTemplate fcpUiTemplate;
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        if (list != null) {
            for (StandardComponentStruct standardComponentStruct : list) {
                StandardComponentKey standardComponentKey = standardComponentStruct.key;
                if (standardComponentKey != null && (str = standardComponentKey.componentKey) != null) {
                    linkedHashMap.put(str, LIZIZ(standardComponentStruct));
                    StandardComponentUi standardComponentUi = standardComponentStruct.ui;
                    if (standardComponentUi != null) {
                        fcpUiTemplate = standardComponentUi.template;
                    } else {
                        fcpUiTemplate = null;
                    }
                    linkedHashMap2.put(str, fcpUiTemplate);
                    linkedHashMap3.put(str, LIZLLL(standardComponentStruct));
                    StandardComponentUi standardComponentUi2 = standardComponentStruct.ui;
                    if (standardComponentUi2 != null) {
                        i = standardComponentUi2.uiType;
                    } else {
                        i = -1;
                    }
                    linkedHashMap4.put(str, Integer.valueOf(i));
                    linkedHashMap5.put(str, LIZJ(standardComponentStruct));
                }
            }
        }
        return new ClientStandardModel(linkedHashMap, linkedHashMap4, linkedHashMap2, null, linkedHashMap3, linkedHashMap5);
    }

    public static final ConditionData LIZIZ(StandardComponentStruct standardComponentStruct) {
        boolean z;
        boolean z2;
        StandardSignalStruct standardSignalStruct = standardComponentStruct.signal;
        if (standardSignalStruct == null) {
            standardSignalStruct = new StandardSignalStruct(SignalCodeEnum.NONE.getType(), null, null, null);
        }
        boolean z3 = true;
        if (standardSignalStruct.code == 0) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = standardSignalStruct.autoDisplay;
        if (bool != null && !Intrinsics.LJFF(bool, Boolean.TRUE)) {
            z2 = false;
        } else {
            z2 = true;
        }
        Boolean bool2 = standardSignalStruct.releasable;
        if (bool2 != null && !Intrinsics.LJFF(bool2, Boolean.TRUE)) {
            z3 = false;
        }
        return new ConditionData(standardSignalStruct.timingKeys, 1, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), false, false);
    }

    public static final Map<String, Object> LIZJ(StandardComponentStruct standardComponentStruct) {
        try {
            Gson gsonLIZIZ = C08JS.LIZIZ();
            String str = standardComponentStruct.customizedInfo;
            if (str == null) {
                str = "{}";
            }
            return (Map) gsonLIZIZ.LJIIIIZZ(str, new TypeToken<Map<String, ? extends Object>>() { // from class: X.02rj
            }.getType());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }

    public static final Map<String, String> LIZLLL(StandardComponentStruct standardComponentStruct) {
        String str = standardComponentStruct.traceInfo;
        if (str == null || str.length() == 0) {
            str = "{}";
        }
        return (Map) GsonProtectorUtils.fromJson(C08JS.LIZIZ(), str, new TypeToken<Map<String, ? extends String>>() { // from class: X.02rk
        }.getType());
    }
}
