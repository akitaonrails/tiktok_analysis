package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.minis.debug.data.M10nMockDebugErrorInfo;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Avv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2195291Avv extends AbstractC2194881AvG {
    public final boolean LLILLL;

    public C2195291Avv() {
        this(false);
    }

    public C2195291Avv(boolean z) {
        this.LLILLL = z;
    }

    public final void LIZJ(final InterfaceC2194871AvF interfaceC2194871AvF, final CompletionBlock completionBlock) {
        Activity activityLIZIZ;
        Activity activityLIZ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle, start, params:");
        sbLIZ.append(interfaceC2194871AvF);
        C2188811AlT.LIZIZ(sbLIZ);
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
            new JSONObject().put("adInstanceUniqueId", interfaceC2194871AvF.getAdId());
            final C1B0K c1b0k = new C1B0K();
            if (c1b0k.LIZ()) {
                C1B0R c1b0r = new C1B0R() { // from class: X.1Avu
                    @Override // X.C1B0R
                    public final void LIZ() {
                        int i2 = C2187451AjH.LIZ;
                        C1B0K c1b0k2 = c1b0k;
                        InterfaceC2194871AvF interfaceC2194871AvF2 = interfaceC2194871AvF;
                        CompletionBlock<InterfaceC2194851AvD> completionBlock2 = completionBlock;
                        c1b0k2.getClass();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onSelectCancel, params:");
                        sbLIZ2.append(interfaceC2194871AvF2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        InterfaceC2194851AvD interfaceC2194851AvD = (InterfaceC2194851AvD) C1909107dp.LIZJ(InterfaceC2194851AvD.class, null);
                        interfaceC2194851AvD.setSuccess(Boolean.TRUE);
                        interfaceC2194851AvD.setErrorCode(0);
                        completionBlock2.onSuccess(interfaceC2194851AvD, "");
                        String adId = interfaceC2194871AvF2.getAdId();
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII = C2195221Avo.LJII();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("isEnded", false);
                            jSONObject.put("adId", adId);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        C2195251Avr.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII, C2195221Avo.LJI(), jSONObject);
                    }

                    @Override // X.C1B0R
                    public final void LIZJ() {
                        int i2 = C2187451AjH.LIZ;
                        C2196101AxE c2196101AxE = C2196101AxE.LIZ;
                        String adId = interfaceC2194871AvF.getAdId();
                        CompletionBlock<InterfaceC2194851AvD> completionBlock2 = completionBlock;
                        boolean z = this.LLILLL;
                        c2196101AxE.getClass();
                        C2196101AxE.LIZLLL(completionBlock2, adId, z);
                    }

                    @Override // X.C1B0R
                    public final void LIZIZ(M10nMockDebugErrorInfo m10nMockDebugErrorInfo) {
                        int i2 = C2187451AjH.LIZ;
                        C1B0K c1b0k2 = c1b0k;
                        InterfaceC2194871AvF interfaceC2194871AvF2 = interfaceC2194871AvF;
                        CompletionBlock<InterfaceC2194851AvD> completionBlock2 = completionBlock;
                        c1b0k2.getClass();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onSelectFail, debugErrorInfo:");
                        sbLIZ2.append(m10nMockDebugErrorInfo);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (m10nMockDebugErrorInfo.isIaaSDKInnerError) {
                            InterfaceC2194851AvD interfaceC2194851AvD = (InterfaceC2194851AvD) C1909107dp.LIZJ(InterfaceC2194851AvD.class, null);
                            interfaceC2194851AvD.setSuccess(Boolean.TRUE);
                            interfaceC2194851AvD.setErrorCode(0);
                            completionBlock2.onSuccess(interfaceC2194851AvD, "");
                            String adId = interfaceC2194871AvF2.getAdId();
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII = C2195221Avo.LJII();
                            C1232850iBf c1232850iBf = C2196131AxH.LJIJ;
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("error_code", c1232850iBf.LIZ);
                                jSONObject.put("error_msg", c1232850iBf.LIZIZ);
                                jSONObject.put("adId", adId);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            C2195251Avr.LIZIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLJII, C2195221Avo.LJI(), jSONObject);
                            return;
                        }
                        InterfaceC2194851AvD interfaceC2194851AvD2 = (InterfaceC2194851AvD) C1909107dp.LIZJ(InterfaceC2194851AvD.class, null);
                        interfaceC2194851AvD2.setSuccess(Boolean.FALSE);
                        interfaceC2194851AvD2.setErrorCode(m10nMockDebugErrorInfo.errorCode);
                        interfaceC2194851AvD2.setErrorMsg(m10nMockDebugErrorInfo.errorMsg);
                        completionBlock2.onFailure(1, "iaa error", interfaceC2194851AvD2);
                    }
                };
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("setSelectResultCallback, selectResultCallback:");
                sbLIZ2.append(c1b0r);
                C2188811AlT.LIZIZ(sbLIZ2);
                c1b0k.LIZIZ = c1b0r;
                c1b0k.LIZIZ(activityLIZ);
                return;
            }
        }
        C2196101AxE c2196101AxE = C2196101AxE.LIZ;
        String adId = interfaceC2194871AvF.getAdId();
        boolean z = this.LLILLL;
        c2196101AxE.getClass();
        C2196101AxE.LIZLLL(completionBlock, adId, z);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("handle, finish, params:");
        sbLIZ3.append(interfaceC2194871AvF);
        C2188811AlT.LIZIZ(sbLIZ3);
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LIZJ((InterfaceC2194871AvF) xBaseParamModel, completionBlock);
    }
}
