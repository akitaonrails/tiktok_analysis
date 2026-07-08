package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937750aVh {
    public static String LIZ;
    public static int LIZIZ;

    public static boolean LIZ() {
        if (!LinkCoreModelKt.currentUserIsAnchor()) {
            int iIntValue = LIZIZ;
            if (iIntValue == 0) {
                Integer numLJ = C931820aM8.LJ("linkmic_mic_pos_loading_optimize");
                if (numLJ == null) {
                    return false;
                }
                iIntValue = numLJ.intValue();
            }
            if ((iIntValue & 2) == 0) {
                return false;
            }
        } else if ((LiveAbLabelSetting.INSTANCE.getIntValue("linkmic_mic_pos_loading_optimize") & 2) == 0) {
            return false;
        }
        return true;
    }

    public static void LIZJ() {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        if (LinkCoreModelKt.currentUserIsAnchor()) {
            LiveAbLabelSetting liveAbLabelSetting = LiveAbLabelSetting.INSTANCE;
            if (liveAbLabelSetting.getIntValue("linkmic_mic_pos_loading_optimize") <= 0 || (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null) {
                return;
            }
            interfaceC954180awCLLJLL.LJJIIZI("loadingOpt", C2097608Jq.LJIIJ(new Pair("value", String.valueOf(liveAbLabelSetting.getIntValue("linkmic_mic_pos_loading_optimize")))), true);
        }
    }

    public static void LIZIZ(SeiAppData seiAppData) {
        Map<String, String> map;
        String str;
        Map<String, Map<String, String>> map2 = seiAppData.businessExtraInfo;
        String str2 = seiAppData.anchorLinkMicId;
        if (!Intrinsics.LJFF(LIZ, str2)) {
            int iIntValue = 0;
            try {
                LIZIZ = 0;
                if (map2 != null && (map = map2.get("loadingOpt")) != null && (str = map.get("value")) != null) {
                    Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
                    if (numLJIIJJI != null) {
                        iIntValue = numLJIIJJI.intValue();
                    }
                    LIZIZ = iIntValue;
                }
                LIZ = str2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("LinkMicMicPosLoadingOptimizeSettingHelper", e.toString());
            }
        }
    }
}
