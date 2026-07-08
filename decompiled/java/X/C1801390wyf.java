package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.speech.speechengine.SpeechEngine;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS571S0100000_27;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801390wyf extends AbstractC1506640pJG {
    public boolean LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 1316));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1299));

    public final void LIZJ(int i, Exception exc) {
        C1537480q70 c1537480q70 = (C1537480q70) this.LLILZ.getValue();
        if (c1537480q70 != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("data", exc.getMessage());
            c1537480q70.LJJIIJZLJL(jSONObject, "studio.asrStateChange");
        }
    }

    public final void LIZLLL(boolean z, CompletionBlock<InterfaceC1506650pJH> completionBlock) {
        String containerID;
        C1801350wyb c1801350wyb;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null && (c1801350wyb = (C1801350wyb) c1537480q70LIZIZ.LJFF(C1801350wyb.class)) != null) {
            if (!this.LLILLL || c1801350wyb.LIZIZ == null) {
                c1801350wyb.LIZIZ = this;
                this.LLILLL = true;
            }
            if (z) {
                SpeechEngine speechEngine = c1801350wyb.LIZ;
                if (speechEngine != null) {
                    speechEngine.sendDirective(2001, "");
                    SpeechEngine speechEngine2 = c1801350wyb.LIZ;
                    if (speechEngine2 != null) {
                        speechEngine2.sendDirective(LSPassThroughRecordSizeConfig.DEFAULT, "");
                    }
                }
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1506650pJH.class, null), "");
                return;
            }
            SpeechEngine speechEngine3 = c1801350wyb.LIZ;
            if (speechEngine3 != null) {
                speechEngine3.sendDirective(1100, "");
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1506650pJH.class, null), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "ASR engine is not ready", null, 4);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        if (!((InterfaceC1506630pJF) xBaseParamModel).getEnable()) {
            LIZLLL(false, completionBlock);
            return;
        }
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(C838410Wul.LIZ(contextLIZ, new String[]{"android.permission.RECORD_AUDIO"}[0])));
        int[] iArrLLII = C13LP.LLII(arrayList);
        for (int i : iArrLLII) {
            if (i != 0) {
                AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
                if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                    C19741112Lp.LIZ.getClass();
                    final boolean zLJI = C19741112Lp.LJI(activityLIZ, "android.permission.RECORD_AUDIO", false);
                    if (zLJI) {
                        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1506650pJH.class, null);
                        InterfaceC1506650pJH interfaceC1506650pJH = (InterfaceC1506650pJH) xBaseModelLIZJ;
                        Boolean bool = Boolean.FALSE;
                        interfaceC1506650pJH.setUserDetermined(bool);
                        interfaceC1506650pJH.setGranted(bool);
                        completionBlock.onFailure(-6, "User has already denied the microphone permission request before", (XBaseResultModel) xBaseModelLIZJ);
                        return;
                    }
                    C19514711Wn.LIZIZ.LIZIZ(activityLIZ, TokenCert.Companion.with("bpea-microphone_permission_request")).LIZIZ("android.permission.RECORD_AUDIO").LIZJ(new InterfaceC19515111Wr() { // from class: X.0wyg
                        @Override // X.InterfaceC19515111Wr
                        public final void onCanceled() {
                        }

                        @Override // X.InterfaceC19515111Wr
                        public final void LIZ(C0HWO... c0hwoArr) {
                            if (c0hwoArr.length != 0) {
                                C0HWO c0hwo = c0hwoArr[0];
                                EnumC442280HVy enumC442280HVy = c0hwo.LIZIZ;
                                EnumC442280HVy enumC442280HVy2 = EnumC442280HVy.DENIED_PERMANENT;
                                if (enumC442280HVy == enumC442280HVy2 && zLJI) {
                                    CompletionBlock<InterfaceC1506650pJH> completionBlock2 = completionBlock;
                                    XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(InterfaceC1506650pJH.class);
                                    InterfaceC1506650pJH interfaceC1506650pJH2 = (InterfaceC1506650pJH) xBaseModelLIZ;
                                    Boolean bool2 = Boolean.FALSE;
                                    interfaceC1506650pJH2.setUserDetermined(bool2);
                                    interfaceC1506650pJH2.setGranted(bool2);
                                    completionBlock2.onFailure(-6, "User has already denied the microphone permission request before", (XBaseResultModel) xBaseModelLIZ);
                                    return;
                                }
                                if (enumC442280HVy != enumC442280HVy2 && enumC442280HVy != EnumC442280HVy.THIS_OPERATION_NOT_PERMITTED) {
                                    if (c0hwo.LIZ()) {
                                        CompletionBlock<InterfaceC1506650pJH> completionBlock3 = completionBlock;
                                        XBaseModel xBaseModelLIZ2 = C1549500qQO.LIZ(InterfaceC1506650pJH.class);
                                        InterfaceC1506650pJH interfaceC1506650pJH3 = (InterfaceC1506650pJH) xBaseModelLIZ2;
                                        Boolean bool3 = Boolean.TRUE;
                                        interfaceC1506650pJH3.setUserDetermined(bool3);
                                        interfaceC1506650pJH3.setGranted(bool3);
                                        completionBlock3.onFailure(-6, "User granted the microphone permission request", (XBaseResultModel) xBaseModelLIZ2);
                                        return;
                                    }
                                    return;
                                }
                                CompletionBlock<InterfaceC1506650pJH> completionBlock4 = completionBlock;
                                XBaseModel xBaseModelLIZ3 = C1549500qQO.LIZ(InterfaceC1506650pJH.class);
                                InterfaceC1506650pJH interfaceC1506650pJH4 = (InterfaceC1506650pJH) xBaseModelLIZ3;
                                interfaceC1506650pJH4.setUserDetermined(Boolean.TRUE);
                                interfaceC1506650pJH4.setGranted(Boolean.FALSE);
                                completionBlock4.onFailure(-6, "User denied the microphone permission request", (XBaseResultModel) xBaseModelLIZ3);
                            }
                        }
                    });
                    return;
                }
                C2382909Vj.LIZ(completionBlock, -7, "cannot find valid activity", null, 4);
                return;
            }
        }
        LIZLLL(true, completionBlock);
    }
}
