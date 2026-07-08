package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.scene.Scene;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.geoblocking.api.IGeoBlockingService;
import com.ss.android.ugc.aweme.kids.api.common.IKidsPolicyNoticeService;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupMeta;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupResponse;
import com.ss.android.ugc.aweme.pns.usercommunication.api.PolicyNoticeUPSdk;
import com.ss.android.ugc.aweme.pns.webcontainer.PNSWebContainerService;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pdP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519130pdP implements InterfaceC1524005xu<NetworkUniversalPopupDispatchResponse> {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1519160pdS());

    @Override // X.InterfaceC1524005xu
    public final String LIZ() {
        return "PopupShowProcessorLocal";
    }

    public static InterfaceC1518910pd3 LJ(Integer num) {
        return ((TTKUserCommunicationService) ServiceManager.get().getService(TTKUserCommunicationService.class)).LJIIL().get(num);
    }

    @Override // X.InterfaceC1524005xu
    public final void LIZIZ(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse, Integer num, Map map) {
        LIZLLL(networkUniversalPopupDispatchResponse, map, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [T, android.app.Activity] */
    public final void LIZLLL(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse, Map map, boolean z) {
        Object obj;
        Integer num;
        Object obj2;
        int iIntValue;
        String str;
        PolicyNoticeUPSdk policyNoticeUPSdk;
        String str2;
        PolicyNoticeUPSdk policyNoticeUPSdk2;
        int iIntValue2;
        String str3;
        final String strLIZIZ;
        Activity activityLIZIZ;
        String string;
        String string2;
        NetworkUniversalPopupResponse networkUniversalPopupResponse;
        NetworkUniversalPopupMeta networkUniversalPopupMeta;
        NetworkUniversalPopupResponse networkUniversalPopupResponse2;
        NetworkUniversalPopupMeta networkUniversalPopupMeta2;
        InterfaceC1519250pdb interfaceC1519250pdbLIZ;
        InterfaceC1519200pdW interfaceC1519200pdWLIZ;
        Integer num2;
        if (map != null) {
            obj = map.get(Scene.SCENE_SERVICE);
        } else {
            obj = null;
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        if (map != null) {
            obj2 = map.get("on_nuj_or_login");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof Integer) && (num2 = (Integer) obj2) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        if (networkUniversalPopupDispatchResponse != null) {
            if (!C1519120pdO.LIZJ(networkUniversalPopupDispatchResponse)) {
                InterfaceC1518910pd3 interfaceC1518910pd3LJ = LJ(num);
                if (interfaceC1518910pd3LJ != null && (interfaceC1519250pdbLIZ = interfaceC1518910pd3LJ.LIZ()) != null && (interfaceC1519200pdWLIZ = interfaceC1519250pdbLIZ.LIZ()) != null) {
                    interfaceC1519200pdWLIZ.LIZ();
                    return;
                }
                return;
            }
            List<NetworkUniversalPopupResponse> list = networkUniversalPopupDispatchResponse.popupResponses;
            if (list == null || (networkUniversalPopupResponse2 = (NetworkUniversalPopupResponse) C13LP.LJJJLL(list)) == null || (networkUniversalPopupMeta2 = networkUniversalPopupResponse2.popupMeta) == null || (str = networkUniversalPopupMeta2.business) == null) {
                List<PolicyNoticeUPSdk> list2 = networkUniversalPopupDispatchResponse.policyNotices;
                if (list2 != null && (policyNoticeUPSdk = (PolicyNoticeUPSdk) C13LP.LJJJLL(list2)) != null) {
                    str = policyNoticeUPSdk.business;
                } else {
                    str = null;
                }
            }
            List<NetworkUniversalPopupResponse> list3 = networkUniversalPopupDispatchResponse.popupResponses;
            if (list3 == null || (networkUniversalPopupResponse = (NetworkUniversalPopupResponse) C13LP.LJJJLL(list3)) == null || (networkUniversalPopupMeta = networkUniversalPopupResponse.popupMeta) == null || (str2 = networkUniversalPopupMeta.version) == null) {
                List<PolicyNoticeUPSdk> list4 = networkUniversalPopupDispatchResponse.policyNotices;
                if (list4 != null && (policyNoticeUPSdk2 = (PolicyNoticeUPSdk) C13LP.LJJJLL(list4)) != null) {
                    str2 = policyNoticeUPSdk2.policyVersion;
                } else {
                    str2 = null;
                }
            }
            if (num != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = -1;
            }
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(iIntValue2), bundle);
            C786410Ut5.LJJJI("business", str, bundle);
            bundle.putInt("on_nuj_or_login", iIntValue);
            AppLogNewUtils.LJ("pns_uc_popup_show_action", bundle);
            if ((iIntValue2 == 0 || iIntValue2 == 1) && !z) {
                C054G c054g = C1518590pcX.LIZ;
                AwS602S0100000_23 awS602S0100000_23 = new AwS602S0100000_23(this, 49);
                if (C1518590pcX.LJ.contains(Integer.valueOf(iIntValue2))) {
                    long jLJIJJ = C0C64.LJIILLIIL().LJIJJ(31744, 1, true, "uc_retry_time", -1L);
                    if (jLJIJJ > 0) {
                        C1518590pcX.LIZJ = new C1518310pc5(networkUniversalPopupDispatchResponse, iIntValue2, map);
                        AnonymousClass0956 anonymousClass0956 = C1518590pcX.LIZLLL;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        C1518590pcX.LIZLLL = C23250099c.LIZLLL(C1518590pcX.LIZ, null, null, new C328301Pd(jLJIJJ, awS602S0100000_23, null), 3);
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str4 = "";
            if (str == null) {
                str3 = "";
            } else {
                str3 = str;
            }
            sbLIZ.append(str3);
            sbLIZ.append('_');
            if (str2 == null) {
                str2 = "";
            }
            sbLIZ.append(str2);
            final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            final IGeoBlockingService iGeoBlockingService = (IGeoBlockingService) PluggableExtentionKt.pluggableSpi$default(IGeoBlockingService.class, false, false, false, 14, null);
            if (C10EU.LJIILIIL()) {
                Bundle bundle2 = new Bundle();
                C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(iIntValue2), bundle2);
                C786410Ut5.LJJJI("business", str, bundle2);
                C786410Ut5.LJJJI("reason", "kids_mode", bundle2);
                bundle2.putInt("on_nuj_or_login", iIntValue);
                AppLogNewUtils.LJ("pns_uc_popup_block", bundle2);
                if (iGeoBlockingService != null && iGeoBlockingService.LJIILIIL(strLIZIZ2) != null && iGeoBlockingService.LJIIIZ(strLIZIZ2)) {
                    if (str != null) {
                        if (num != null && (string2 = num.toString()) != null) {
                            str4 = string2;
                        }
                        iGeoBlockingService.LJI(1, str4, str, "uc_popup_show_action");
                        return;
                    }
                    return;
                }
                String strLIZIZ3 = C1519120pdO.LIZIZ(networkUniversalPopupDispatchResponse);
                if (strLIZIZ3 != null) {
                    ((PNSWebContainerService) this.LIZ.getValue()).LIZIZ(strLIZIZ3, null);
                    return;
                }
                IKidsPolicyNoticeService iKidsPolicyNoticeService = (IKidsPolicyNoticeService) PluggableExtentionKt.pluggableSpi$default(IKidsPolicyNoticeService.class, false, false, false, 14, null);
                if (iKidsPolicyNoticeService != null && iKidsPolicyNoticeService.LIZ() != null) {
                    C1914320zuo c1914320zuo = new C1914320zuo(networkUniversalPopupDispatchResponse, Integer.valueOf(iIntValue2));
                    C844470XAv.LIZ.getClass();
                    C1914170zuZ.LIZJ(c1914320zuo, C844470XAv.LIZ(), new C1519220pdY(this, Integer.valueOf(iIntValue2), iIntValue));
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(PolicyNoticeServiceImpl.LJIILIIL, strLIZIZ2)) {
                Bundle bundle3 = new Bundle();
                C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(iIntValue2), bundle3);
                C786410Ut5.LJJJI("business", str, bundle3);
                AppLogNewUtils.LJ("pns_show_action_error", bundle3);
                if (str != null && iGeoBlockingService != null && iGeoBlockingService.LJIILIIL(str) != null) {
                    if (num != null && (string = num.toString()) != null) {
                        str4 = string;
                    }
                    iGeoBlockingService.LJI(1, str4, str, "uc_popup_show_action");
                    return;
                }
                return;
            }
            PolicyNoticeServiceImpl.LJIILIIL = strLIZIZ2;
            final C259800zU c259800zU = new C259800zU();
            final int i = iIntValue2;
            final C742280T9u c742280T9u = new C742280T9u(c259800zU, this, networkUniversalPopupDispatchResponse, iIntValue2, str, strLIZIZ2, iGeoBlockingService, iIntValue);
            if (((Boolean) C276240AsA.LIZ.getValue()).booleanValue()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("pns_compliance_universal_popup_");
                sbLIZ2.append(iIntValue2);
                sbLIZ2.append('_');
                sbLIZ2.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                strLIZIZ = "compliance_universal";
            }
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
            if (abstractC1387200mCcLIZIZ != null) {
                activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
            } else {
                activityLIZIZ = null;
            }
            ?? LIZ = C06MM.LIZ(activityLIZIZ);
            c259800zU.element = LIZ;
            if (LIZ != 0) {
                Bundle bundle4 = new Bundle();
                C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(iIntValue2), bundle4);
                C786410Ut5.LJJJI("business", str, bundle4);
                bundle4.putInt("entry", 0);
                bundle4.putInt("on_nuj_or_login", iIntValue);
                AppLogNewUtils.LJ("pns_uc_popup_get_activity", bundle4);
                LJFF((Activity) c259800zU.element, strLIZIZ2, iGeoBlockingService, c742280T9u, strLIZIZ, Integer.valueOf(iIntValue2), str, iIntValue);
                return;
            }
            Bundle bundle5 = new Bundle();
            C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(iIntValue2), bundle5);
            C786410Ut5.LJJJI("business", str, bundle5);
            bundle5.putInt("entry", 1);
            bundle5.putInt("on_nuj_or_login", iIntValue);
            AppLogNewUtils.LJ("pns_uc_popup_get_activity", bundle5);
            final String str5 = str;
            final int i2 = iIntValue;
            C1906580ziK.LIZJ().LJIIJ().LJL(C11S5.LIZIZ).LJLIIL(1L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0T5r
                /* JADX WARN: Type inference failed for: r4v0, types: [T, android.app.Activity] */
                @Override // X.C09JN
                public final void accept(Object obj3) {
                    ?? r4;
                    C1C7U.LIZ("PopupShowAction@1ee6.executeInternal$1$10");
                    Activity activityLIZIZ2 = ((AbstractC1387200mCc) obj3).LIZIZ();
                    if (activityLIZIZ2 != null && (r4 = (T) C1388190mED.LIZ(activityLIZIZ2)) != 0) {
                        C259800zU<Activity> c259800zU2 = c259800zU;
                        C1519130pdP c1519130pdP = this;
                        String str6 = strLIZIZ2;
                        IGeoBlockingService iGeoBlockingService2 = iGeoBlockingService;
                        Function0<Unit> function0 = c742280T9u;
                        String str7 = strLIZIZ;
                        int i3 = i;
                        String str8 = str5;
                        int i4 = i2;
                        c259800zU2.element = r4;
                        Integer numValueOf = Integer.valueOf(i3);
                        c1519130pdP.getClass();
                        C1519130pdP.LJFF(r4, str6, iGeoBlockingService2, function0, str7, numValueOf, str8, i4);
                    }
                    C1C7U.LIZIZ("PopupShowAction@1ee6.executeInternal$1$10");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(android.app.Activity r11, com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse r12, int r13, java.lang.String r14, final java.lang.String r15, int r16) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1519130pdP.LIZJ(android.app.Activity, com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse, int, java.lang.String, java.lang.String, int):void");
    }

    public static void LJFF(final Activity activity, String str, IGeoBlockingService iGeoBlockingService, final Function0 function0, String str2, Integer num, String str3, int i) {
        int iIntValue;
        AbstractC20656215sG c1852080yIQ;
        Bundle bundle = new Bundle();
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -999;
        }
        C786410Ut5.LJJJI(Scene.SCENE_SERVICE, String.valueOf(iIntValue), bundle);
        C786410Ut5.LJJJI("business", str3, bundle);
        bundle.putInt("on_nuj_or_login", i);
        AppLogNewUtils.LJ("pns_uc_popup_center", bundle);
        if (iGeoBlockingService != null && iGeoBlockingService.LJIILIIL(str) != null) {
            c1852080yIQ = new C10GR(activity, function0) { // from class: X.0yIO
                public final Activity LL;
                public final Function0<Unit> LLILLJJLI;
                public final EnumC1202290hON LLILLL = EnumC1202290hON.CONTAINER;
                public final int LLILZ = 5;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC20660415sw
                public final C688120Qyw i2() {
                    Activity activity2 = this.LL;
                    if (activity2 instanceof LifecycleOwner) {
                        return new C688120Qyw(activity2, (LifecycleOwner) activity2, null);
                    }
                    return null;
                }

                @Override // X.AbstractC20656215sG
                public final EnumC1202290hON getPopupType() {
                    return this.LLILLL;
                }

                @Override // X.InterfaceC20660515sx
                public final int getPriority() {
                    return this.LLILZ;
                }

                {
                    this.LL = activity;
                    this.LLILLJJLI = function0;
                }

                @Override // X.InterfaceC20659015si
                public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
                    Function0<Unit> function02 = this.LLILLJJLI;
                    if (function02 != null) {
                        function02.invoke();
                    } else {
                        c20656615sK.LIZ();
                    }
                }
            };
        } else {
            c1852080yIQ = new C1852080yIQ(function0, activity, str);
        }
        if (C294570Bgd.LIZ()) {
            PopupManager.LJIJ(c1852080yIQ, str2, new C1668306g5("pns_compliance_communication_service_trigger"));
        } else {
            PopupManager.LJIJI(c1852080yIQ, true);
        }
    }
}
