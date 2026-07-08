package X;

import com.bytedance.keva.Keva;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.personalized.ReportHybridABApi;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.plugin.personalizednuj.PersonalizedNUJV2Data;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10SH, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10SH {
    public static final C10SH LIZ = new C10SH();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(159));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(321));

    public static void LIZIZ() {
        if (((Keva) LIZJ.getValue()).getBoolean("keva_key_is_report_success", false)) {
            return;
        }
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.10Q7
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Boolean> c09aj) {
                boolean z;
                IPluginService.PluginData next;
                IPluginService.PluginDataWrapper pluginDataWrapper;
                PersonalizedNUJV2Data personalizedNUJV2Data;
                C1C7U.LIZ("PersonalizedNUJReportService@1e0c.checkDidAndHybridAB$1");
                C10SH.LIZ.getClass();
                Integer numLIZIZ = ((IHybridABInfoService) ServiceManager.get().getService(IHybridABInfoService.class)).LIZIZ();
                if ((numLIZIZ != null && numLIZIZ.intValue() == 1) || !C1514430pVp.LIZLLL().booleanValue()) {
                    z = true;
                    IPluginService.PluginData pluginDataLIZ = C10SH.LIZ();
                    if (pluginDataLIZ == null || !Intrinsics.LJFF(pluginDataLIZ.showConfig.shouldShow, Boolean.TRUE)) {
                        c09aj.onNext(Boolean.FALSE);
                        c09aj.onComplete();
                        C1C7U.LIZIZ("PersonalizedNUJReportService@1e0c.checkDidAndHybridAB$1");
                        return;
                    }
                } else {
                    z = false;
                }
                if (C10SH.LIZ() != null) {
                    C19241810Po.LIZ.getClass();
                    Iterator<IPluginService.PluginData> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginListPluginData().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.id == EnumC19241510Pl.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    IPluginService.PluginData pluginData = next;
                    if (pluginData == null || (pluginDataWrapper = pluginData.configData) == null || (personalizedNUJV2Data = pluginDataWrapper.personalizedNUJV2Data) == null || personalizedNUJV2Data.personalizedNUJLabel < 1) {
                        c09aj.onNext(Boolean.FALSE);
                        c09aj.onComplete();
                        C1C7U.LIZIZ("PersonalizedNUJReportService@1e0c.checkDidAndHybridAB$1");
                        return;
                    }
                }
                String strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();
                if (z && C123100dR.LIZ(strCom_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId)) {
                    c09aj.onNext(Boolean.TRUE);
                    c09aj.onComplete();
                } else {
                    c09aj.onError(new IllegalStateException("did or Hybrid AB Response is not ready"));
                }
                C1C7U.LIZIZ("PersonalizedNUJReportService@1e0c.checkDidAndHybridAB$1");
            }
        }).LJJJ(new InterfaceC1487280oo2() { // from class: X.10SK
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                String str;
                Boolean bool = (Boolean) obj;
                C10SH.LIZ.getClass();
                IPluginService.PluginData pluginDataLIZ = C10SH.LIZ();
                if (pluginDataLIZ != null) {
                    str = pluginDataLIZ.abExposeVid;
                } else {
                    str = null;
                }
                if (bool.booleanValue() && str != null && C123100dR.LIZ(str)) {
                    C323760Cmc.LIZ.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZJ(C1514430pVp.LIZLLL().booleanValue() ? 1 : 0, "is_cold_start_first_launch");
                    C20684815ws.LJIILLIIL("did_vid_info_upload", c2344009Gk.LIZ);
                    if (((Boolean) C282440B5e.LIZ.getValue()).booleanValue()) {
                        return C11NZ.LJJJJZ(new ReportHybridABApi.ReportHybridABResponse(null, -110119120, "did or vid is null"));
                    }
                    return ((ReportHybridABApi) C10SH.LIZIZ.getValue()).reportHybridAB(new ReportHybridABApi.ReportHybridABRequest(Collections.singletonList(new ReportHybridABApi.HybridABExperimentInfo(1, str))));
                }
                return C11NZ.LJJJJZ(new ReportHybridABApi.ReportHybridABResponse(null, -110119120, "did or vid is null"));
            }
        }, false).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLIIIJLJLI(new C1088100eQC()).LJJLL(new C09JN() { // from class: X.10SL
            /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
            @Override // X.C09JN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void accept(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.String r7 = "PersonalizedNUJReportService@1e0c.tryReportPersonalizedNUJ$2"
                    X.C1C7U.LIZ(r7)
                    com.ss.android.ugc.aweme.personalized.ReportHybridABApi$ReportHybridABResponse r9 = (com.ss.android.ugc.aweme.personalized.ReportHybridABApi.ReportHybridABResponse) r9
                    com.ss.android.ugc.aweme.personalized.ReportHybridABApi$HybridABExperimentInfoHandleResult[] r6 = r9.result
                    r3 = 1
                    r4 = 0
                    if (r6 == 0) goto L3e
                    int r2 = r6.length
                    r1 = 0
                Lf:
                    if (r1 >= r2) goto L3e
                    r5 = r6[r1]
                    int r0 = r5.experimentNameId
                    if (r0 != r3) goto L3b
                    boolean r0 = r5.isSuccessful
                    if (r0 == 0) goto L3f
                    X.10SH r0 = X.C10SH.LIZ
                    r0.getClass()
                    X.01GW r0 = X.C10SH.LIZJ
                    java.lang.Object r1 = r0.getValue()
                    com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1
                    java.lang.String r0 = "keva_key_is_report_success"
                    r1.storeBoolean(r0, r3)
                    X.0Cmc r0 = X.C323760Cmc.LIZ
                    r0.getClass()
                    java.lang.String r0 = "success"
                    X.C323760Cmc.LIZ(r4, r0, r3)
                L37:
                    X.C1C7U.LIZIZ(r7)
                    return
                L3b:
                    int r1 = r1 + 1
                    goto Lf
                L3e:
                    r5 = 0
                L3f:
                    int r3 = r9.statusCode
                    r0 = -110119120(0xfffffffff96fb730, float:-7.779215E34)
                    if (r3 == r0) goto L37
                    java.lang.String r2 = r9.statusMessage
                    java.lang.String r1 = "no reason"
                    if (r2 != 0) goto L4d
                    r2 = r1
                L4d:
                    if (r5 != 0) goto L58
                    X.0Cmc r0 = X.C323760Cmc.LIZ
                    r0.getClass()
                    X.C323760Cmc.LIZ(r3, r2, r4)
                    goto L37
                L58:
                    java.lang.String r0 = r5.failureReason
                    if (r0 == 0) goto L5d
                    r1 = r0
                L5d:
                    X.0Cmc r0 = X.C323760Cmc.LIZ
                    r0.getClass()
                    r0 = -10086(0xffffffffffffd89a, float:NaN)
                    X.C323760Cmc.LIZ(r0, r1, r4)
                    goto L37
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C10SL.accept(java.lang.Object):void");
            }
        }, new C09JN() { // from class: X.10SJ
            @Override // X.C09JN
            public final void accept(Object obj) {
                String string;
                C1C7U.LIZ("PersonalizedNUJReportService@1e0c.tryReportPersonalizedNUJ$3");
                Throwable th = (Throwable) obj;
                if (th == null || (string = th.toString()) == null) {
                    string = "no reason";
                }
                C323760Cmc.LIZ.getClass();
                C323760Cmc.LIZ(-10010, string, false);
                C1C7U.LIZIZ("PersonalizedNUJReportService@1e0c.tryReportPersonalizedNUJ$3");
            }
        });
    }

    public static IPluginService.PluginData LIZ() {
        IPluginService.PluginData next;
        Iterator<IPluginService.PluginData> it2 = ((IPluginService) ServiceManager.get().getService(IPluginService.class)).getCurrentPluginListPluginData().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.id == EnumC19241510Pl.PERSONALIZED_NUJ_V2_DATA.getValue()) {
                break;
            }
        }
        return next;
    }
}
