package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicVEPluginAdapt;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestEnterVEPluginGuardSetting;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;

/* JADX INFO: renamed from: X.0aE2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926800aE2 {
    public static boolean LIZ(String str) {
        IHostCreativeTool iHostCreativeTool;
        boolean zA72 = true;
        if (MultiGuestEnterVEPluginGuardSetting.enable() && LinkMicVEPluginAdapt.enable() && (iHostCreativeTool = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class)) != null && !(zA72 = iHostCreativeTool.a72(C01AB.LIZ(), str))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" blocked: VE plugin not ready, trigger install and abort");
            C20441214yg.LIZIZ("MultiGuestVEPluginGuard", C2188811AlT.LIZIZ(sbLIZ));
        }
        return zA72;
    }
}
