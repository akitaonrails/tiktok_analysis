package X;

import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
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
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0tNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663260tNs {
    public final LifecycleOwner LIZ;
    public final CreativeInfo LIZIZ;
    public final Effect LIZJ;
    public final String LIZLLL;
    public String LJ;
    public String LJFF;
    public final String LJI;
    public final String LJII;

    public final void LIZ(Function0<Unit> function0, final InterfaceC1631620sYq<? super Boolean, ? super String, ? super String, Unit> interfaceC1631620sYq) throws Throwable {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        function0.invoke();
        String strLJJJIL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJIL(this.LIZIZ, "");
        if (!C2286708xd.LIZJ(strLJJJIL)) {
            C2286708xd.LJIIIIZZ(strLJJJIL, false);
        }
        String[] strArr = {"", ""};
        try {
            C1446130njf c1446130njf = C1446130njf.LIZ;
            Effect effect = this.LIZJ;
            c1446130njf.getClass();
            JSONObject jSONObjectLJIIIZ = C1446130njf.LJIIIZ(effect);
            if (jSONObjectLJIIIZ != null && (jSONObjectOptJSONObject = jSONObjectLJIIIZ.optJSONObject("vl")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("multi_vPath")) != null && jSONArrayOptJSONArray.length() > 0) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("multi_aPath");
                int iLJIIJ = C13LZ.LJIIJ(AbstractC19994813Le.Default, C13LZ.LJIILJJIL(0, jSONArrayOptJSONArray.length()));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZJ.getUnzipPath());
                sbLIZ.append(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray, iLJIIJ));
                strArr[0] = C2188811AlT.LIZIZ(sbLIZ);
                if (jSONArrayOptJSONArray2 != null && iLJIIJ < jSONArrayOptJSONArray2.length()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(this.LIZJ.getUnzipPath());
                    sbLIZ2.append(JSONArrayProtectorUtils.getString(jSONArrayOptJSONArray2, iLJIIJ));
                    strArr[1] = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("BackgroundVideo, parse sticker extra fail, ");
            sbLIZ3.append(this.LIZJ);
            sbLIZ3.append(".sdkExtra");
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        String str = strArr[0];
        String str2 = strArr[1];
        if (C2286708xd.LIZJ(str2)) {
            this.LJ = str;
            this.LJFF = str2;
        } else if (!TextUtils.isEmpty(str)) {
            String strLIZIZ = C08F1.LIZIZ(str);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(this.LIZLLL);
            String str3 = File.separator;
            sbLIZ4.append(str3);
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append("_background_v");
            this.LJ = C2188811AlT.LIZIZ(sbLIZ4);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(this.LIZLLL);
            sbLIZ5.append(str3);
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append("_background_a");
            this.LJFF = C2188811AlT.LIZIZ(sbLIZ5);
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
        if (!C2286708xd.LIZJ(str)) {
            C201955140j.LJ("BackgroundVideo, default video not exist");
            interfaceC1631620sYq.invoke(Boolean.FALSE, this.LJI, this.LJII);
        } else {
            ISDKService sDKService = ((IFoundationAVService) ServiceManager.get().getService(IInternalAVService.class)).getSDKService();
            if (sDKService != null) {
                sDKService.split(C786410Ut5.M3(C0CHQ.LIZ), LSPassThroughRecordSizeConfig.DEFAULT, this.LIZLLL, str, this.LJFF, this.LJ, new ISDKService.SplitCallback() { // from class: X.0tNu
                    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
                    public final void onFail() {
                        InterfaceC1631620sYq<Boolean, String, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                        Boolean bool = Boolean.FALSE;
                        C1663260tNs c1663260tNs = this.LIZ;
                        interfaceC1631620sYq2.invoke(bool, c1663260tNs.LJI, c1663260tNs.LJII);
                    }

                    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
                    public final boolean checkIsCanceled() {
                        return ISDKService.SplitCallback.DefaultImpls.checkIsCanceled(this);
                    }

                    @Override // com.ss.android.ugc.aweme.services.ISDKService.SplitCallback
                    public final void onSuccess(int i, int i2) throws Throwable {
                        C1663260tNs c1663260tNs = this.LIZ;
                        C2471909mP.LIZJ(c1663260tNs.LJ, c1663260tNs.LJI);
                        C1663260tNs c1663260tNs2 = this.LIZ;
                        C2286708xd.LJFF(c1663260tNs2.LJFF, c1663260tNs2.LJII);
                        InterfaceC1631620sYq<Boolean, String, String, Unit> interfaceC1631620sYq2 = interfaceC1631620sYq;
                        Boolean bool = Boolean.TRUE;
                        C1663260tNs c1663260tNs3 = this.LIZ;
                        interfaceC1631620sYq2.invoke(bool, c1663260tNs3.LJI, c1663260tNs3.LJII);
                    }
                });
            }
        }
    }

    public C1663260tNs(C19EG c19eg, CreativeInfo creativeInfo, Effect effect) {
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
        this.LJ = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(str);
        sbLIZ3.append("background_a");
        this.LJFF = C2188811AlT.LIZIZ(sbLIZ3);
        this.LJI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJIL(creativeInfo, "background_v");
        this.LJII = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJIL(creativeInfo, "background_a");
    }
}
