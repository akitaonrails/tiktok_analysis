package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLayoutBizConfigSetting;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0IMi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465260IMi {
    public static String LIZ() throws Throwable {
        IHostResource iHostResource = (IHostResource) C1161920gLG.LIZJ(IHostResource.class);
        String str = null;
        File fileHX = iHostResource != null ? iHostResource.HX("tiktok_live_link_mic_layout_key", "layout_biz_config.json") : null;
        if (fileHX != null && fileHX.exists() && fileHX.isFile()) {
            try {
                String strLJI = C09BH.LJI(fileHX, Charsets.UTF_8);
                C20441214yg.LIZIZ("LayoutBizConfigJsonObjectReader", "from gecko");
                str = strLJI;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("LayoutBizConfigJsonObjectReader", "getLayoutBizConfigJsonStrFromGecko error", e);
            }
        }
        if (str != null) {
            return str;
        }
        C20441214yg.LIZIZ("LayoutBizConfigJsonObjectReader", "from dolphin");
        return MultiGuestLayoutBizConfigSetting.INSTANCE.getSettingValue();
    }
}
