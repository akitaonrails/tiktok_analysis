package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.aweme.feed.model.banner.FcpUiTemplate;
import com.ss.android.ugc.aweme.feed.model.banner.SignalCodeEnum;
import com.ss.android.ugc.aweme.feed.model.banner.StandardSignalStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagKey;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagUi;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagUiWrapper;
import com.ss.android.ugc.aweme.feed.model.banner.UIData;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C721102rh {
    public static final ClientStandardModel LIZ(StandardTagContainerStruct standardTagContainerStruct) {
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        Integer numValueOf;
        StandardTagUi standardTagUi;
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        List<StandardTagStruct> list = standardTagContainerStruct.tags;
        if (list != null) {
            for (StandardTagStruct standardTagStruct : list) {
                StandardTagKey standardTagKey = standardTagStruct.key;
                if (standardTagKey != null && (str = standardTagKey.componentKey) != null) {
                    StandardSignalStruct standardSignalStruct = standardTagStruct.signal;
                    if (standardSignalStruct == null) {
                        standardSignalStruct = new StandardSignalStruct(SignalCodeEnum.NONE.getType(), null, null, null);
                    }
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
                    } else {
                        z3 = true;
                    }
                    linkedHashMap.put(str, new ConditionData(standardSignalStruct.timingKeys, 1, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), false, false));
                    StandardTagUiWrapper standardTagUiWrapper = standardTagStruct.ui;
                    FcpUiTemplate fcpUiTemplate = null;
                    if (standardTagUiWrapper != null) {
                        numValueOf = Integer.valueOf(standardTagUiWrapper.uiType);
                    } else {
                        numValueOf = null;
                    }
                    StandardTagUiWrapper standardTagUiWrapper2 = standardTagStruct.ui;
                    if (standardTagUiWrapper2 != null) {
                        standardTagUi = standardTagUiWrapper2.standardUi;
                    } else {
                        standardTagUi = null;
                    }
                    linkedHashMap2.put(str, new UIData(numValueOf, null, standardTagUi));
                    String str2 = standardTagStruct.traceInfo;
                    if (str2 == null || str2.length() == 0) {
                        str2 = "{}";
                    }
                    linkedHashMap3.put(str, GsonProtectorUtils.fromJson(C08JS.LIZIZ(), str2, new TypeToken<Map<String, ? extends String>>() { // from class: X.02rm
                    }.getType()));
                    StandardTagUiWrapper standardTagUiWrapper3 = standardTagStruct.ui;
                    if (standardTagUiWrapper3 != null) {
                        i = standardTagUiWrapper3.uiType;
                    } else {
                        i = -1;
                    }
                    linkedHashMap4.put(str, Integer.valueOf(i));
                    StandardTagUiWrapper standardTagUiWrapper4 = standardTagStruct.ui;
                    if (standardTagUiWrapper4 != null) {
                        fcpUiTemplate = standardTagUiWrapper4.template;
                    }
                    linkedHashMap5.put(str, fcpUiTemplate);
                }
            }
        }
        return new ClientStandardModel(linkedHashMap, linkedHashMap4, linkedHashMap5, linkedHashMap2, linkedHashMap3, null);
    }
}
