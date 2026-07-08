package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.services.IInternalAVService;
import com.ss.android.ugc.aweme.services.ISDKService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tNr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663250tNr {
    public final LifecycleOwner LIZ;
    public final CreativeInfo LIZIZ;
    public final Effect LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final void LIZ(Function0<Unit> function0, final InterfaceC1631620sYq<? super Boolean, ? super String, ? super String, Unit> interfaceC1631620sYq) throws Throwable {
        JSONObject jSONObjectOptJSONObject;
        function0.invoke();
        String strLIZIZ = "";
        String strLJJJIL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJIL(this.LIZIZ, "");
        if (!C2286708xd.LIZJ(strLJJJIL)) {
            C2286708xd.LJIIIIZZ(strLJJJIL, false);
        }
        try {
            C1446130njf c1446130njf = C1446130njf.LIZ;
            Effect effect = this.LIZJ;
            c1446130njf.getClass();
            JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
            String strOptString = null;
            if (jSONObjectLJIIIZ != null) {
                jSONObjectOptJSONObject = jSONObjectLJIIIZ.optJSONObject("vl");
            } else {
                jSONObjectOptJSONObject = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZJ.getUnzipPath());
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("vPath");
            }
            sbLIZ.append(strOptString);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("BackgroundVideo, parse sticker extra fail, ");
            sbLIZ2.append(this.LIZJ);
            sbLIZ2.append(".sdkExtra");
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (C2286708xd.LIZJ(this.LIZLLL) && C2286708xd.LIZJ(this.LJ) && C2286708xd.LIZJ(this.LJFF) && VEUtils.getVideoFileInfo(this.LJ) != null && VEUtils.getAudioFileInfo(this.LJFF) != null) {
            C2471909mP.LIZJ(this.LJ, this.LJI);
            C2286708xd.LJFF(this.LJFF, this.LJII);
            interfaceC1631620sYq.invoke(Boolean.TRUE, this.LJI, this.LJII);
            return;
        }
        if (!C2286708xd.LIZJ(this.LIZLLL)) {
            C2286708xd.LJIIIIZZ(this.LIZLLL, false);
            if (!C2286708xd.LIZJ(this.LIZLLL)) {
                C201955140j.LJ("BackgroundVideo, splitDir create fail");
                interfaceC1631620sYq.invoke(Boolean.FALSE, this.LJI, this.LJII);
                return;
            }
        }
        if (!C2286708xd.LIZJ(strLIZIZ)) {
            C201955140j.LJ("BackgroundVideo, default video not exist");
            interfaceC1631620sYq.invoke(Boolean.FALSE, this.LJI, this.LJII);
        } else {
            if (!C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_ve_effects_video_path_upload_settings", true, false)) {
                ISDKService sDKService = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).getSDKService();
                if (sDKService != null) {
                    sDKService.split(C786410Ut5.M3(C0CHQ.LIZ), LSPassThroughRecordSizeConfig.DEFAULT, this.LIZLLL, strLIZIZ, this.LJFF, this.LJ, new ISDKService.SplitCallback() { // from class: X.0tNt
                        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
                        public final void onFail() {
                            InterfaceC1631620sYq<Boolean, String, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                            Boolean bool = Boolean.FALSE;
                            C1663250tNr c1663250tNr = this.LIZ;
                            interfaceC1631620sYq2.invoke(bool, c1663250tNr.LJI, c1663250tNr.LJII);
                        }

                        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
                        public final boolean checkIsCanceled() {
                            return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
                        }

                        @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
                        public final void onSuccess(int i, int i2) throws Throwable {
                            C1663250tNr c1663250tNr = this.LIZ;
                            C2471909mP.LIZJ(c1663250tNr.LJ, c1663250tNr.LJI);
                            C1663250tNr c1663250tNr2 = this.LIZ;
                            C2286708xd.LJFF(c1663250tNr2.LJFF, c1663250tNr2.LJII);
                            InterfaceC1631620sYq<Boolean, String, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                            Boolean bool = Boolean.TRUE;
                            C1663250tNr c1663250tNr3 = this.LIZ;
                            interfaceC1631620sYq2.invoke(bool, c1663250tNr3.LJI, c1663250tNr3.LJII);
                        }
                    });
                    return;
                }
                return;
            }
            interfaceC1631620sYq.invoke(Boolean.TRUE, strLIZIZ, strLIZIZ);
        }
    }

    public C1663250tNr(C19EG c19eg, CreativeInfo creativeInfo, Effect effect) {
        this.LIZ = c19eg;
        this.LIZIZ = creativeInfo;
        this.LIZJ = effect;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(effect.getUnzipPath());
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("res_split");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZLLL = strLIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(str);
        sbLIZ2.append("background_v");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        this.LJ = strLIZIZ2;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(str);
        sbLIZ3.append("background_a");
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        this.LJFF = strLIZIZ3;
        InterfaceC1460960o7a pathAdapter = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("background_v_");
        sbLIZ4.append(C08F1.LIZIZ(strLIZIZ2));
        this.LJI = pathAdapter.LJJJIL(creativeInfo, C2188811AlT.LIZIZ(sbLIZ4));
        InterfaceC1460960o7a pathAdapter2 = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("background_a_");
        sbLIZ5.append(C08F1.LIZIZ(strLIZIZ3));
        this.LJII = pathAdapter2.LJJJIL(creativeInfo, C2188811AlT.LIZIZ(sbLIZ5));
    }
}
