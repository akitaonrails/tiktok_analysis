package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMixStreamOptSeparatePart2Included;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRtcRatioOptimize;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiContainerInfo;
import com.bytedance.android.livesdk.sei.SeiDsl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ACJ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACJ {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ() {
        return (LinkMicMixStreamOptSeparatePart2Included.INSTANCE.getValue() && LinkMicRtcRatioOptimize.isAnchorEnable()) ? 1 : 0;
    }

    public static boolean LIZIZ() {
        return LinkCoreModelKt.currentUserIsAnchor() ? LIZ() > 0 : LinkMicRtcRatioOptimize.INSTANCE.getValueFromSEI() > 0;
    }

    public static void LIZLLL() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        if (!LinkCoreModelKt.currentUserIsAnchor() || LIZ() <= 0 || (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null) {
            return;
        }
        interfaceC954180awCLLJLL.LJJIIZI("canvasRatioOpt", C2097608Jq.LJIIJ(new Pair("value", String.valueOf(LIZ()))), true);
    }

    public static void LIZJ(SeiAppData seiAppData) {
        String str;
        Map<String, String> map;
        String str2;
        String str3;
        String str4 = seiAppData.anchorLinkMicId;
        int iIntValue = 0;
        if (str4 != null && str4.length() != 0) {
            SeiDsl seiDsl = seiAppData.dsl;
            String str5 = "";
            if (seiDsl == null || (str = seiDsl.layoutId) == null) {
                str = "";
            }
            SeiContainerInfo seiContainerInfo = seiAppData.linkMicContainer;
            if (seiContainerInfo != null && (str3 = seiContainerInfo.layoutKey) != null) {
                str5 = str3;
            }
            Map<String, Map<String, String>> map2 = seiAppData.businessExtraInfo;
            LinkMicRtcRatioOptimize linkMicRtcRatioOptimize = LinkMicRtcRatioOptimize.INSTANCE;
            if (Intrinsics.LJFF(linkMicRtcRatioOptimize.getCacheAnchorLinkMicId(), str4) && Intrinsics.LJFF(linkMicRtcRatioOptimize.getCacheLayoutKey(), str5) && Intrinsics.LJFF(linkMicRtcRatioOptimize.getCacheLayoutId(), str)) {
                return;
            }
            try {
                C20441214yg.LIZIZ("shared_bg", "LinkMicRtcRatioOptimizeHelper parseSeiForSetting reset value");
                linkMicRtcRatioOptimize.setValueFromSEI(0);
                if (map2 != null && (map = map2.get("canvasRatioOpt")) != null && (str2 = map.get("value")) != null) {
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(str2);
                    if (numLJIIJJI != null) {
                        iIntValue = numLJIIJJI.intValue();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("LinkMicRtcRatioOptimizeHelper parseSeiForSetting set value:");
                    sbLIZ.append(iIntValue);
                    C20441214yg.LIZIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ));
                    linkMicRtcRatioOptimize.setValueFromSEI(iIntValue);
                }
                linkMicRtcRatioOptimize.setCacheAnchorLinkMicId(str4);
                linkMicRtcRatioOptimize.setCacheLayoutId(str);
                linkMicRtcRatioOptimize.setCacheLayoutKey(str5);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("LinkmicRtcRatioOptimizeHelper", e.toString());
            }
        }
    }
}
