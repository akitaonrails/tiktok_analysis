package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiDetailGPSConfigModel;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiDetailGPSFrequency;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiStarlingModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hMz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201430hMz {
    public static final PoiDetailGPSConfigModel LIZ = new PoiDetailGPSConfigModel(false, new ArrayList(), new ArrayList(), new PoiStarlingModel("", "", "", "", "", ""), new PoiDetailGPSFrequency(false, 0, 0, null, null, null), false, "");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(812));

    public static PoiDetailGPSConfigModel LIZIZ() {
        return (PoiDetailGPSConfigModel) LIZIZ.getValue();
    }

    public static C1201450hN1 LIZLLL() {
        C1201450hN1 c1201450hN1 = new C1201450hN1();
        c1201450hN1.LIZ = LIZIZ().frequency.popupShowOnce;
        c1201450hN1.LIZIZ = LIZIZ().frequency.popupFrequencyDays;
        c1201450hN1.LIZJ = LIZIZ().frequency.popupMaxCloseCount;
        return c1201450hN1;
    }

    public static EnumC1201570hND LJ() {
        String str = LIZIZ().openSettingsStyle;
        return Intrinsics.LJFF(str, "popup") ? EnumC1201570hND.POPUP : Intrinsics.LJFF(str, "intro") ? EnumC1201570hND.INTRO : EnumC1201570hND.POPUP;
    }

    public static C1201440hN0 LIZ(Context context) {
        C1201440hN0 c1201440hN0 = new C1201440hN0();
        c1201440hN0.LIZ = LIZJ(context, LIZIZ().starlingKey.openSettingsTitleStarlingKey);
        c1201440hN0.LIZIZ = LIZJ(context, LIZIZ().starlingKey.openSettingsContentStarlingKey);
        c1201440hN0.LIZJ = LIZJ(context, LIZIZ().starlingKey.openSettingsContentBoldStarlingKey);
        return c1201440hN0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZJ(Context context, String str) {
        boolean z;
        if (context != null) {
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z && str != null) {
                try {
                    switch (str.hashCode()) {
                        case -2128753148:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp3_header")) {
                                return context.getResources().getString(2131836192);
                            }
                            return "";
                        case -1319406522:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp1_header")) {
                                return context.getResources().getString(2131836188);
                            }
                            return "";
                        case -980877193:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp10_body")) {
                                return context.getResources().getString(2131836186);
                            }
                            return "";
                        case -868759511:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp_btn1")) {
                                return context.getResources().getString(2131836199);
                            }
                            return "";
                        case -868759510:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp_btn2")) {
                                return context.getResources().getString(2131836200);
                            }
                            return "";
                        case -180766539:
                            if (str.equals("integrateGPSPopup_poiDetailPage_bottomToast_desc")) {
                                return context.getResources().getString(2131836185);
                            }
                            return "";
                        case -144379976:
                            if (str.equals("integrateGPSPopup_poiDetailPage_bottomToast_btn")) {
                                return context.getResources().getString(2131836184);
                            }
                            return "";
                        case 768222937:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp2_bodyPlaceholder")) {
                                return context.getResources().getString(2131836190);
                            }
                            return "";
                        case 1812981147:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp1_body")) {
                                return context.getResources().getString(2131836187);
                            }
                            return "";
                        case 1841610298:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp2_body")) {
                                return context.getResources().getString(2131836189);
                            }
                            return "";
                        case 1870239449:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp3_body")) {
                                return context.getResources().getString(2131836191);
                            }
                            return "";
                        case 1898868600:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp4_body")) {
                                return context.getResources().getString(2131836193);
                            }
                            return "";
                        case 1927497751:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp5_body")) {
                                return context.getResources().getString(2131836194);
                            }
                            return "";
                        case 1956126902:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp6_body")) {
                                return context.getResources().getString(2131836195);
                            }
                            return "";
                        case 1984756053:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp7_body")) {
                                return context.getResources().getString(2131836196);
                            }
                            return "";
                        case 2013385204:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp8_body")) {
                                return context.getResources().getString(2131836197);
                            }
                            return "";
                        case 2042014355:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp9_body")) {
                                return context.getResources().getString(2131836198);
                            }
                            return "";
                        case 2094310513:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp_graphicLabel1")) {
                                return context.getResources().getString(2131836201);
                            }
                            return "";
                        case 2094310514:
                            if (str.equals("integrateGPSPopup_poiDetailPage_popUp_graphicLabel2")) {
                                return context.getResources().getString(2131836202);
                            }
                            return "";
                        default:
                            return "";
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return "";
                }
            }
            return "";
        }
        return "";
    }
}
