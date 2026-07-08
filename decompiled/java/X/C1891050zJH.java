package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.check.IAutoSoundCheckService;
import com.ss.android.ugc.aweme.creatorcenter.settings.AiStudioApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zJH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891050zJH extends AbstractC1891010zJD {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        Context context;
        String str;
        int i;
        String str2;
        InterfaceC1891000zJC interfaceC1891000zJC = (InterfaceC1891000zJC) xBaseParamModel;
        String settingsName = interfaceC1891000zJC.getSettingsName();
        final boolean enable = interfaceC1891000zJC.getEnable();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            int i2 = 2;
            switch (settingsName.hashCode()) {
                case -1858977613:
                    if (settingsName.equals("VideoSoundCopyright")) {
                        if (!enable) {
                            C1891090zJL.LIZ.getClass();
                            C1891090zJL.LIZ();
                        } else {
                            C1891090zJL.LIZ.getClass();
                            C1891090zJL.LIZIZ();
                        }
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJIIIIZZ("enter_from", "privacy_and_safety_settings");
                        if (enable) {
                            str = "on";
                        } else {
                            str = "off";
                        }
                        c2344009Gk.LJIIIIZZ("to_status", str);
                        C20684815ws.LJIILLIIL("sound_copyright_check_click", c2344009Gk.LIZ);
                        ((IAutoSoundCheckService) ServiceManager.get().getService(IAutoSoundCheckService.class)).LJ(new AwS607S0100000_28(completionBlock, (CompletionBlock<InterfaceC1874320ysI>) 303), enable);
                        return;
                    }
                    break;
                case -719890761:
                    if (settingsName.equals("AutoDubbingAuthorization")) {
                        C746760TRa.LIZ().LJII(new AwS572S0100000_28(completionBlock, (CompletionBlock<InterfaceC1887020zCm>) 890), enable);
                        return;
                    }
                    break;
                case -466038540:
                    if (settingsName.equals("AIStudioEntrance")) {
                        C501801xQ c501801xQ = C501801xQ.LIZ;
                        if (!enable) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        C501801xQ.LIZIZ.storeInt("ai_studio_status", i);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("is_on", enable ? 1 : 0);
                        C1548820qPI.LIZIZ(new C397901gf(jCurrentTimeMillis, new C1323820kYO(jSONObject), "creatorAIStudioEtranceToggleSwitched"));
                        C2344009Gk c2344009Gk2 = new C2344009Gk();
                        if (enable) {
                            str2 = "turn_on";
                        } else {
                            str2 = "turn_off";
                        }
                        c2344009Gk2.LJIIIIZZ("button_status", str2);
                        C20684815ws.LJIILLIIL("ai_assistant_studio_toggle_click", c2344009Gk2.LIZ);
                        if (enable) {
                            i2 = 1;
                        }
                        C0TGK c0tgk = new C0TGK() { // from class: X.0zJG
                            @Override // X.C0TGK
                            public final void onFailed() {
                                CompletionBlock<InterfaceC1891030zJF> completionBlock2 = completionBlock;
                                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1891030zJF.class, null);
                                InterfaceC1891030zJF interfaceC1891030zJF = (InterfaceC1891030zJF) xBaseModelLIZJ;
                                interfaceC1891030zJF.setErrorMessage("");
                                interfaceC1891030zJF.setErrorCode(0);
                                interfaceC1891030zJF.setStatus(0);
                                C2382909Vj.LIZ(completionBlock2, 0, null, (XBaseResultModel) xBaseModelLIZJ, 2);
                            }

                            @Override // X.C0TGK
                            public final void LIZIZ(int i3) {
                                CompletionBlock<InterfaceC1891030zJF> completionBlock2 = completionBlock;
                                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1891030zJF.class, null);
                                ((InterfaceC1891030zJF) xBaseModelLIZJ).setStatus(1);
                                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                            }
                        };
                        AiStudioApi.LIZ.getClass();
                        C501901xR.LIZIZ.updateAiStudioSetting(1, i2).enqueue(new C786260Usq(c0tgk, 15));
                        return;
                    }
                    break;
                case -396243722:
                    if (settingsName.equals("AdAuthorization")) {
                        if (!enable) {
                            C1891090zJL.LIZ.getClass();
                            C1891090zJL.LIZ();
                        } else {
                            C1891090zJL.LIZ.getClass();
                            C1891090zJL.LIZIZ();
                        }
                        C0TGH.LIZIZ(context, enable, new C0TGI() { // from class: X.0zJI
                            @Override // X.C0TGI
                            public final void onFailed() {
                            }

                            @Override // X.C0TGI
                            public final void onLoading() {
                            }

                            @Override // X.C0TGI
                            public final void onSuccess() {
                                C1891090zJL c1891090zJL = C1891090zJL.LIZ;
                                boolean z = enable;
                                c1891090zJL.getClass();
                                C1891090zJL.LIZJ(z);
                                CompletionBlock<InterfaceC1891030zJF> completionBlock2 = completionBlock;
                                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1891030zJF.class, null);
                                ((InterfaceC1891030zJF) xBaseModelLIZJ).setStatus(1);
                                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                            }
                        }, false);
                        return;
                    }
                    break;
                case 1088763791:
                    if (settingsName.equals("VideoInspiration")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("inspiration_setting_");
                        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
                        C1891120zJO c1891120zJO = C1891120zJO.LIZ;
                        AwS394S0200000_28 awS394S0200000_28 = new AwS394S0200000_28(repo, (Keva) completionBlock, (CompletionBlock<InterfaceC1891030zJF>) 80);
                        c1891120zJO.getClass();
                        C1891120zJO.LIZ(awS394S0200000_28, enable);
                        return;
                    }
                    break;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1891030zJF.class, null);
            InterfaceC1891030zJF interfaceC1891030zJF = (InterfaceC1891030zJF) xBaseModelLIZJ;
            interfaceC1891030zJF.setErrorMessage("settingsName doesn't match any action");
            interfaceC1891030zJF.setErrorCode(0);
            interfaceC1891030zJF.setStatus(0);
            C2382909Vj.LIZ(completionBlock, 0, null, (XBaseResultModel) xBaseModelLIZJ, 2);
            return;
        }
        C2382909Vj.LIZ(completionBlock, -7, "cannot find context", null, 4);
    }
}
