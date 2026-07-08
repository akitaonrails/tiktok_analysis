package X;

import Y.ARunnableS24S0101000_13;
import com.bytedance.pumbaa.app2app.ThirdPartySDKSourceTrafficTagData;
import com.bytedance.pumbaa.app2app.data.App2AppData;
import com.bytedance.pumbaa.app2app.data.App2AppUri;
import com.bytedance.pumbaa.pipeline.EventPipeline;
import com.bytedance.pumbaa.pipeline.PrivacyEvent;
import com.bytedance.pumbaa.utility.dfid.AutoDFIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0WaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825690WaF implements InterfaceC825780WaO {
    public static final C825690WaF LIZ = new C825690WaF();
    public static final Gson LIZIZ = new Gson();
    public static final ExecutorService LIZJ = C807400Vlq.LIZ();

    public static void LIZIZ(int i, App2AppData app2AppData) {
        C0WS7 c0ws7LJFF;
        boolean z;
        C0WS7 c0ws7LJFF2;
        boolean z2;
        String strInvoke;
        App2AppUri app2AppUriLIZ;
        App2AppUri app2AppUriLIZ2;
        try {
            C0WSC c0wsc = app2AppData.LIZ;
            if (c0wsc != null) {
                c0ws7LJFF = c0wsc.LJFF("prepare_event");
            } else {
                c0ws7LJFF = null;
            }
            String str = app2AppData.callSite;
            app2AppData.callSite = null;
            String str2 = app2AppData.dfid;
            boolean z3 = true;
            if (str2 != null && str2.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                EnumC825810WaR enumC825810WaR = EnumC825810WaR.APP2APP;
                if (C825730WaJ.LIZ(enumC825810WaR, app2AppData.codePointTag)) {
                    ThirdPartySDKSourceTrafficTagData thirdPartySDKSourceTrafficTagData = C825740WaK.LIZ;
                    ThirdPartySDKSourceTrafficTagData thirdPartySDKSourceTrafficTagData2 = (ThirdPartySDKSourceTrafficTagData) C308480C7i.LIZLLL(ThirdPartySDKSourceTrafficTagData.class, "pns_enable_3rdSDK_source_traffic_tag", thirdPartySDKSourceTrafficTagData);
                    if (thirdPartySDKSourceTrafficTagData2 != null) {
                        thirdPartySDKSourceTrafficTagData = thirdPartySDKSourceTrafficTagData2;
                    }
                    int i2 = C825800WaQ.LIZ[enumC825810WaR.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    throw new C1954807lC();
                                }
                            } else {
                                z2 = thirdPartySDKSourceTrafficTagData.network;
                            }
                        } else {
                            z2 = thirdPartySDKSourceTrafficTagData.userInput;
                        }
                    } else {
                        z2 = thirdPartySDKSourceTrafficTagData.app2app;
                    }
                    if (z2) {
                        String[] strArr = app2AppData.codePointTag;
                        Function2<? super EnumC825810WaR, ? super String[], String> function2 = C825750WaL.LIZJ;
                        if (function2 != null) {
                            strInvoke = function2.invoke(enumC825810WaR, strArr);
                        } else {
                            strInvoke = null;
                        }
                        app2AppData.dfid = strInvoke;
                        app2AppData.intentExtra = null;
                        App2AppUri app2AppUri = app2AppData.intentDataUri;
                        if (app2AppUri != null) {
                            app2AppUriLIZ = App2AppUri.LIZ(app2AppUri);
                        } else {
                            app2AppUriLIZ = null;
                        }
                        app2AppData.intentDataUri = app2AppUriLIZ;
                        App2AppUri app2AppUri2 = app2AppData.contentProviderUri;
                        if (app2AppUri2 != null) {
                            app2AppUriLIZ2 = App2AppUri.LIZ(app2AppUri2);
                        } else {
                            app2AppUriLIZ2 = null;
                        }
                        app2AppData.contentProviderUri = app2AppUriLIZ2;
                        app2AppData.contentProviderKv = null;
                        app2AppData.broadCastResultExtra = null;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("apiId:");
                        sbLIZ.append(i);
                        sbLIZ.append(" taggedDfid:");
                        sbLIZ.append(app2AppData.dfid);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C790280UzK.LIZ("tagged_dfid");
                    }
                }
            }
            if (!AutoDFIDManager.LIZIZ || !C838990Wvh.LIZ()) {
                z3 = false;
            }
            app2AppData.enableAutoDFID = Boolean.valueOf(z3);
            if (z3 && C825710WaH.LJI) {
                Integer numLIZ = AutoDFIDManager.LIZ(i);
                if (numLIZ != null) {
                    app2AppData.autoDFID = C790280UzK.LIZIZ(numLIZ.intValue());
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("apiId:");
                sbLIZ2.append(i);
                sbLIZ2.append(" autoDFID:");
                sbLIZ2.append(app2AppData.autoDFID);
                C2188811AlT.LIZIZ(sbLIZ2);
                C790280UzK.LIZ("autoDFID");
            }
            String strLJIILL = LIZIZ.LJIILL(app2AppData);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("apiId:");
            sbLIZ3.append(i);
            sbLIZ3.append(" event:");
            sbLIZ3.append(strLJIILL);
            C2188811AlT.LIZIZ(sbLIZ3);
            C790280UzK.LIZ("event");
            if (c0ws7LJFF != null) {
                c0ws7LJFF.stop();
            }
            if (c0wsc == null) {
                c0ws7LJFF2 = null;
            } else {
                c0ws7LJFF2 = c0wsc.LJFF("create_event");
            }
            C0WRC c0wrc = PrivacyEvent.Companion;
            String strValueOf = String.valueOf(i);
            c0wrc.getClass();
            PrivacyEvent privacyEventLIZ = C0WRC.LIZ(strValueOf, "app2app");
            EnumC823400WRu enumC823400WRu = EnumC823400WRu.String;
            privacyEventLIZ.addCallSiteInfo("app2app_params", new C0WQ8(enumC823400WRu, strLJIILL));
            privacyEventLIZ.addCallSiteInfo("call_site", new C0WQ8(enumC823400WRu, str));
            privacyEventLIZ.setPerformanceNode(c0wsc);
            if (c0ws7LJFF2 != null) {
                c0ws7LJFF2.stop();
            }
            for (C0WRN c0wrn : EventPipeline.handleEvent(privacyEventLIZ, null)) {
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                C823280WRi.LIZJ("app2app_error_fact_intercept_fail", "ensure_not_reach_here", th);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("APP2APP_DEBUG_");
                sbLIZ4.append("report_error");
                C2188811AlT.LIZIZ(sbLIZ4);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    }

    @Override // X.InterfaceC825780WaO
    public final boolean LIZ(int i, App2AppData app2AppData) {
        if (C825710WaH.LJFF) {
            LIZJ.execute(new ARunnableS24S0101000_13(i, app2AppData, 12));
            return false;
        }
        LIZIZ(i, app2AppData);
        return false;
    }
}
