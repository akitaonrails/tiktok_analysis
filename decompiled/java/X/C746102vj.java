package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.banner.StandardButtonContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentKey;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentStruct;
import com.ss.android.ugc.aweme.poi.anchor.sensor.CustomizedInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C746102vj {
    public static final boolean LIZ(VideoItemParams videoItemParams) {
        Aweme aweme;
        StandardComponentInfo standardComponentInfo;
        StandardButtonContainerStruct standardButtonContainerStruct;
        List<StandardComponentStruct> list;
        StandardComponentStruct next;
        String str;
        Integer num;
        String str2;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (standardComponentInfo = aweme.getStandardComponentInfo()) != null && (standardButtonContainerStruct = standardComponentInfo.buttonContainer) != null && (list = standardButtonContainerStruct.buttons) != null) {
            Iterator<StandardComponentStruct> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    StandardComponentKey standardComponentKey = next.key;
                    if (standardComponentKey != null) {
                        str2 = standardComponentKey.componentKey;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, "bottom_button_local_alliance_post_earn")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            StandardComponentStruct standardComponentStruct = next;
            if (standardComponentStruct != null && (str = standardComponentStruct.customizedInfo) != null) {
                try {
                    Object objFromJson = GsonProtectorUtils.fromJson(C2365509Or.LIZ(), str, C2371409Qy.LIZJ(C13LE.LJII(CustomizedInfo.class)));
                    if (!(objFromJson instanceof CustomizedInfo)) {
                        objFromJson = null;
                    }
                    CustomizedInfo customizedInfo = (CustomizedInfo) objFromJson;
                    if (customizedInfo != null && (num = customizedInfo.regStatus) != null && num.intValue() == 1) {
                        return true;
                    }
                    return false;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }
            return false;
        }
        return false;
    }
}
