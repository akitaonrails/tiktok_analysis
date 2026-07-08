package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.10SX, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10SX implements C0TA0 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final EnumC19241510Pl LIZ;
    public final IPluginService.PluginData LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new C10T5());

    @Override // X.C0TA0
    public final IPluginService.PluginDataWrapper getValue() {
        IPluginService.AutoExposureConfig.ExposureType exposureType;
        int i;
        String str;
        IPluginService.AutoExposureConfig autoExposureConfig = this.LIZIZ.autoExposureConfig;
        if (autoExposureConfig != null && (exposureType = autoExposureConfig.exposureType) != null && ((i = C19250610Sy.LIZ[exposureType.ordinal()]) == 1 || i == 2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ.id);
            sbLIZ.append(':');
            sbLIZ.append(this.LIZIZ.instanceId);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (!((Keva) this.LIZJ.getValue()).getBoolean(strLIZIZ, false)) {
                ((Keva) this.LIZJ.getValue()).storeBoolean(strLIZIZ, true);
                String str2 = this.LIZIZ.abExposeVid;
                if (str2 != null) {
                    C0C5P.LIZJ().getClass();
                    C0C5P.LIZ(str2);
                }
                IPluginService.AutoExposureConfig autoExposureConfig2 = this.LIZIZ.autoExposureConfig;
                if (autoExposureConfig2 == null || (str = autoExposureConfig2.preciseExposureVid) == null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(this.LIZIZ.id, FollowStatusChangeMethod.PARAM_UID);
                    c2344009Gk.LJ(this.LIZIZ.instanceId, "instance");
                    C20684815ws.LJIILLIIL("autoexpose_error", c2344009Gk.LIZ);
                } else {
                    C0C5P.LIZJ().getClass();
                    C0C5P.LIZ(str);
                }
            }
        }
        return this.LIZIZ.configData;
    }

    @Override // X.C0TA0
    public final EnumC19241510Pl getType() {
        return this.LIZ;
    }

    public C10SX(EnumC19241510Pl enumC19241510Pl, IPluginService.PluginData pluginData) {
        this.LIZ = enumC19241510Pl;
        this.LIZIZ = pluginData;
    }
}
