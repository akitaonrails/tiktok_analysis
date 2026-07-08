package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.governance.tool.api.IControlService;
import com.bytedance.pumbaa.governance.tool.model.ControlStrategy;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.qrcode.settings.Qrcode3pH5WhitelistModel;
import java.util.Locale;
import kotlin.Unit;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WOD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WOD {
    public static final C0WOD LIZ = new C0WOD();
    public static ControlStrategy LIZIZ;

    public static IControlService LIZ() {
        if (PluggableExtentionKt.pluggableSpi$default(IControlService.class, false, false, false, 14, null) == null) {
            return null;
        }
        return C821970WMh.LIZ();
    }

    public static void LIZIZ(String str) {
        if (str == null) {
            return;
        }
        try {
            Uri uri = UriProtector.parse(str);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Scene.SCENE_SERVICE, "qrcode");
            jSONObject.put("host", uri.getHost());
            jSONObject.put("path", uri.getPath());
            C793770VBv.LJII("pns_hybrid_dm_shutdown", jSONObject, null, null);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static boolean LIZJ(String str) {
        IControlService iControlServiceLIZ;
        ControlStrategy controlStrategyLIZ;
        ControlStrategy controlStrategy;
        String lowerCase;
        if (str != null && (iControlServiceLIZ = LIZ()) != null && (controlStrategyLIZ = iControlServiceLIZ.LIZ()) != null) {
            LIZIZ = controlStrategyLIZ;
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            Qrcode3pH5WhitelistModel qrcode3pH5WhitelistModel = C0WOE.LIZ;
            Qrcode3pH5WhitelistModel qrcode3pH5WhitelistModel2 = (Qrcode3pH5WhitelistModel) settingsManagerLIZLLL.LJIIIIZZ("qrcode_3p_h5_whitelist", Qrcode3pH5WhitelistModel.class, qrcode3pH5WhitelistModel);
            if (qrcode3pH5WhitelistModel2 == null) {
                qrcode3pH5WhitelistModel2 = qrcode3pH5WhitelistModel;
            }
            if (qrcode3pH5WhitelistModel2.enable) {
                if (!TextUtils.isEmpty(str)) {
                    Uri uri = UriProtector.parse(str);
                    Qrcode3pH5WhitelistModel qrcode3pH5WhitelistModel3 = (Qrcode3pH5WhitelistModel) SettingsManager.LIZLLL().LJIIIIZZ("qrcode_3p_h5_whitelist", Qrcode3pH5WhitelistModel.class, qrcode3pH5WhitelistModel);
                    if (qrcode3pH5WhitelistModel3 != null) {
                        qrcode3pH5WhitelistModel = qrcode3pH5WhitelistModel3;
                    }
                    for (String str2 : qrcode3pH5WhitelistModel.allowList) {
                        String host = uri.getHost();
                        if (host != null && (lowerCase = host.toLowerCase(Locale.ROOT)) != null && u.LJIIZILJ(lowerCase, str2, false)) {
                            break;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('.');
                        sbLIZ.append(host);
                        if (u.LJIIZILJ(C2188811AlT.LIZIZ(sbLIZ).toLowerCase(Locale.ROOT), str2, false)) {
                            return false;
                        }
                    }
                    if (!C0WR3.LIZIZ(str) && ((IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class)).LIZLLL(str) && !((IComplianceBusinessService) ServiceManager.get().getService(IComplianceBusinessService.class)).LJIIIIZZ(str) && (controlStrategy = LIZIZ) != null) {
                        controlStrategy.LIZ(true);
                        return true;
                    }
                } else if (!C0WR3.LIZIZ(str)) {
                    controlStrategy.LIZ(true);
                    return true;
                }
            }
        }
        return false;
    }
}
