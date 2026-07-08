package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ur.psp.api.center.IPSPCenter;
import com.tiktok.ttm.TTMParamData;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17vP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21185317vP extends AbstractC21185517vR {
    public final String LIZ = "social_avatar_monitor";

    @Override // X.AbstractC21185517vR
    public final TTMParamData LIZ(String str) {
        AbstractC21185217vO abstractC21185217vOLIZJ;
        List list;
        C21184517vH c21184517vH;
        if (!Intrinsics.LJFF(str, "social_avatar_generation_monitor_consumer")) {
            return null;
        }
        IPSPCenter iPSPCenter = (IPSPCenter) PluggableExtentionKt.pluggableSpi$default(IPSPCenter.class, false, false, false, 14, null);
        if (iPSPCenter != null) {
            abstractC21185217vOLIZJ = iPSPCenter.LIZJ();
        } else {
            abstractC21185217vOLIZJ = null;
        }
        if ((abstractC21185217vOLIZJ instanceof C21184517vH) && (c21184517vH = (C21184517vH) abstractC21185217vOLIZJ) != null) {
            list = (List) ((Map) c21184517vH.LIZIZ.getValue()).get("social_avatar");
        } else {
            list = null;
        }
        if (!C19719512Dh.LJI(list) || list == null) {
            return null;
        }
        return new TTMParamData((List<Object>) list);
    }
}
