package X;

import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.web.jsbridge.IESJsBridge;
import com.ss.android.ugc.aweme.bridge.JSBAIMigrationMonetizationSettings;
import com.ss.android.ugc.aweme.bridge.idlshelling.JSBAIMigrationALLJSBSSettings;
import com.ss.android.ugc.aweme.bridge.idlshelling.JSBAIMigrationALLJSBSTWOSettings;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdFollowButtonFollowActionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdLynxCardStatusMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdLynxStickerStatusMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdLynxSuperLikeStatusMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdMakePhoneCallMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.CloseAdLynxCardMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.CloseLynxFeedMaskMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.ClosePopUpWindow;
import com.ss.android.ugc.aweme.bullet.bridge.ad.CollapseAdLynxCardMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DidGetGameCodeClickMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DidSelectScoreMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DidSelectVoteCardOptionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DownloadAppClickMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DynamicAdReadyMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DynamicAdStatusMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DynamicAdViewSizeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.GetNativeSiteCustomDataMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdLandPageLinksMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenLightLandingPageMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.RegisterProgressObserverMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.SwipeUpVideoMethod;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0cen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020270cen extends C1020370cex {
    public static final List<InterfaceC1051730dTX> LIZ(C1051660dTQ c1051660dTQ) {
        ILiveOuterService iLiveOuterService;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        Map<String, InterfaceC1051760dTa> liveWalletJSB;
        Set<Map.Entry<String, InterfaceC1051760dTa>> setEntrySet;
        C1075770e6J c1075770e6J;
        C1543410qGZ c1543410qGZLJIIJ;
        C1543410qGZ c1543410qGZLJIIJ2;
        C1543410qGZ c1543410qGZLJIIJ3;
        C1543410qGZ c1543410qGZLJIIJ4;
        C1543410qGZ c1543410qGZLJIIJ5;
        C1543410qGZ c1543410qGZLJIIJ6;
        C1543410qGZ c1543410qGZLJIIJ7;
        C1543410qGZ c1543410qGZLJIIJ8;
        C1543410qGZ c1543410qGZLJIIJ9;
        C1543410qGZ c1543410qGZLJIIJ10;
        C1543410qGZ c1543410qGZLJIIJ11;
        C1543410qGZ c1543410qGZLJIIJ12;
        C1543410qGZ c1543410qGZLJIIJ13;
        C1543410qGZ c1543410qGZLJIIJ14;
        C1543410qGZ c1543410qGZLJIIJ15;
        boolean z = C1544000qHW.LJIIZILJ;
        C1537480q70 c1537480q70 = c1051660dTQ.LIZIZ;
        if (c1537480q70 != null && (c1075770e6J = (C1075770e6J) c1537480q70.LJFF(C1075770e6J.class)) != null) {
            c1075770e6J.LJIILIIL("|adPackageBundle");
            if (z) {
                C1543410qGZ c1543410qGZLJIIJ16 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ16 != null) {
                    c1543410qGZLJIIJ16.LJFF(C1027690cql.class, EnumC1063300dmC.ALL);
                }
                C1543410qGZ c1543410qGZLJIIJ17 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ17 != null) {
                    c1543410qGZLJIIJ17.LJFF(C1020120ceY.class, EnumC1063300dmC.ALL);
                }
                C1543410qGZ c1543410qGZLJIIJ18 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ18 != null) {
                    c1543410qGZLJIIJ18.LJFF(C1018670ccD.class, EnumC1063300dmC.ALL);
                }
                C1543410qGZ c1543410qGZLJIIJ19 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ19 != null) {
                    c1543410qGZLJIIJ19.LJFF(C1018720ccI.class, EnumC1063300dmC.ALL);
                }
                C1543410qGZ c1543410qGZLJIIJ20 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ20 != null) {
                    c1543410qGZLJIIJ20.LJFF(C0QBV.class, EnumC1063300dmC.ALL);
                }
                C1543410qGZ c1543410qGZLJIIJ21 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ21 != null) {
                    c1543410qGZLJIIJ21.LJFF(C1019970ceJ.class, EnumC1063300dmC.ALL);
                }
                C1543410qGZ c1543410qGZLJIIJ22 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ22 != null) {
                    c1543410qGZLJIIJ22.LJFF(C1019870ce9.class, EnumC1063300dmC.ALL);
                }
                C988570bpf.LIZ.getClass();
                if (C1041070dCL.LIZ() != null && (c1543410qGZLJIIJ15 = c1075770e6J.LJIIJ()) != null) {
                    c1543410qGZLJIIJ15.LJFF(C1018620cc8.class, EnumC1063300dmC.ALL);
                }
                C1543410qGZ c1543410qGZLJIIJ23 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ23 != null) {
                    c1543410qGZLJIIJ23.LJFF(C1019920ceE.class, EnumC1063300dmC.ALL);
                }
                C1543410qGZ c1543410qGZLJIIJ24 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ24 != null) {
                    c1543410qGZLJIIJ24.LJFF(C1021950chV.class, EnumC1063300dmC.ALL);
                }
                C1543410qGZ c1543410qGZLJIIJ25 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ25 != null) {
                    c1543410qGZLJIIJ25.LJFF(C1018790ccP.class, EnumC1063300dmC.ALL);
                }
                C1543410qGZ c1543410qGZLJIIJ26 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ26 != null) {
                    c1543410qGZLJIIJ26.LJFF(C1020290cep.class, EnumC1063300dmC.ALL);
                }
                C1543410qGZ c1543410qGZLJIIJ27 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ27 != null) {
                    c1543410qGZLJIIJ27.LJFF(C1020330cet.class, EnumC1063300dmC.ALL);
                }
                C1543410qGZ c1543410qGZLJIIJ28 = c1075770e6J.LJIIJ();
                if (c1543410qGZLJIIJ28 != null) {
                    c1543410qGZLJIIJ28.LJFF(C1020310cer.class, EnumC1063300dmC.ALL);
                }
            } else {
                JSBAIMigrationMonetizationSettings.JSBAIMigrationMonetizationModel jSBAIMigrationMonetizationModelLIZ = JSBAIMigrationMonetizationSettings.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("|Monetization");
                sbLIZ.append(JSBAIMigrationMonetizationSettings.LIZIZ(jSBAIMigrationMonetizationModelLIZ));
                c1075770e6J.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
                if (jSBAIMigrationMonetizationModelLIZ.enable) {
                    if (jSBAIMigrationMonetizationModelLIZ.openAdLandPageLinks && (c1543410qGZLJIIJ14 = c1075770e6J.LJIIJ()) != null) {
                        c1543410qGZLJIIJ14.LJFF(C1027690cql.class, EnumC1063300dmC.ALL);
                    }
                    if (jSBAIMigrationMonetizationModelLIZ.downloadAppClick && (c1543410qGZLJIIJ13 = c1075770e6J.LJIIJ()) != null) {
                        c1543410qGZLJIIJ13.LJFF(C1020120ceY.class, EnumC1063300dmC.ALL);
                    }
                    if (jSBAIMigrationMonetizationModelLIZ.closeAdLynxCard && (c1543410qGZLJIIJ12 = c1075770e6J.LJIIJ()) != null) {
                        c1543410qGZLJIIJ12.LJFF(C1018670ccD.class, EnumC1063300dmC.ALL);
                    }
                    if (jSBAIMigrationMonetizationModelLIZ.closePopUpWindow && (c1543410qGZLJIIJ11 = c1075770e6J.LJIIJ()) != null) {
                        c1543410qGZLJIIJ11.LJFF(C1018720ccI.class, EnumC1063300dmC.ALL);
                    }
                    if (jSBAIMigrationMonetizationModelLIZ.collapseAdLynxCard && (c1543410qGZLJIIJ10 = c1075770e6J.LJIIJ()) != null) {
                        c1543410qGZLJIIJ10.LJFF(C0QBV.class, EnumC1063300dmC.ALL);
                    }
                    if (jSBAIMigrationMonetizationModelLIZ.adLynxCardStatus && (c1543410qGZLJIIJ9 = c1075770e6J.LJIIJ()) != null) {
                        c1543410qGZLJIIJ9.LJFF(C1019970ceJ.class, EnumC1063300dmC.ALL);
                    }
                    if (jSBAIMigrationMonetizationModelLIZ.adLynxSuperLikeStatus && (c1543410qGZLJIIJ8 = c1075770e6J.LJIIJ()) != null) {
                        c1543410qGZLJIIJ8.LJFF(C1019870ce9.class, EnumC1063300dmC.ALL);
                    }
                    if (jSBAIMigrationMonetizationModelLIZ.downloadClick) {
                        C988570bpf.LIZ.getClass();
                        if (C1041070dCL.LIZ() != null && (c1543410qGZLJIIJ7 = c1075770e6J.LJIIJ()) != null) {
                            c1543410qGZLJIIJ7.LJFF(C1018620cc8.class, EnumC1063300dmC.ALL);
                        }
                    }
                    if (jSBAIMigrationMonetizationModelLIZ.adLynxStickerStatus && (c1543410qGZLJIIJ6 = c1075770e6J.LJIIJ()) != null) {
                        c1543410qGZLJIIJ6.LJFF(C1019920ceE.class, EnumC1063300dmC.ALL);
                    }
                    if (jSBAIMigrationMonetizationModelLIZ.adMakePhoneCall && (c1543410qGZLJIIJ5 = c1075770e6J.LJIIJ()) != null) {
                        c1543410qGZLJIIJ5.LJFF(C1021950chV.class, EnumC1063300dmC.ALL);
                    }
                    if (jSBAIMigrationMonetizationModelLIZ.didSelectScore && (c1543410qGZLJIIJ4 = c1075770e6J.LJIIJ()) != null) {
                        c1543410qGZLJIIJ4.LJFF(C1018790ccP.class, EnumC1063300dmC.ALL);
                    }
                }
                JSBAIMigrationALLJSBSSettings.JSBAIMigrationALLJSBSModel jSBAIMigrationALLJSBSModelLIZ = JSBAIMigrationALLJSBSSettings.LIZ();
                if (jSBAIMigrationALLJSBSModelLIZ.enable && jSBAIMigrationALLJSBSModelLIZ.closeLynxFeedMask && (c1543410qGZLJIIJ3 = c1075770e6J.LJIIJ()) != null) {
                    c1543410qGZLJIIJ3.LJFF(C1020290cep.class, EnumC1063300dmC.ALL);
                }
                JSBAIMigrationALLJSBSTWOSettings.JSBAIMigrationALLJSBSTWOModel jSBAIMigrationALLJSBSTWOModelLIZ = JSBAIMigrationALLJSBSTWOSettings.LIZ();
                if (jSBAIMigrationALLJSBSTWOModelLIZ.enable) {
                    if (jSBAIMigrationALLJSBSTWOModelLIZ.followAction && (c1543410qGZLJIIJ2 = c1075770e6J.LJIIJ()) != null) {
                        c1543410qGZLJIIJ2.LJFF(C1020330cet.class, EnumC1063300dmC.ALL);
                    }
                    if (jSBAIMigrationALLJSBSTWOModelLIZ.adInfo && (c1543410qGZLJIIJ = c1075770e6J.LJIIJ()) != null) {
                        c1543410qGZLJIIJ.LJFF(C1020310cer.class, EnumC1063300dmC.ALL);
                    }
                }
            }
            c1075770e6J.LJIILIIL("|adPackageBundle_finish");
        }
        if (z) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        IESJsBridge iESJsBridge = (IESJsBridge) c1051660dTQ.LIZIZ(IESJsBridge.class);
        Object objLIZIZ = c1051660dTQ.LIZIZ(Context.class);
        if (iESJsBridge != null && objLIZIZ != null && (iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)) != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (liveWalletJSB = interfaceC20673515v3K4.getLiveWalletJSB(new WeakReference<>(objLIZIZ), iESJsBridge)) != null && (setEntrySet = liveWalletJSB.entrySet()) != null && (r3 = setEntrySet.iterator()) != null) {
            for (Map.Entry<String, InterfaceC1051760dTa> entry : setEntrySet) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    arrayList.add(C1047190dMD.LIZ(c1051660dTQ, entry.getKey(), entry.getValue()));
                }
            }
        }
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(new AdInfoMethod(c1051660dTQ), new OpenAdLandPageLinksMethod(c1051660dTQ), new DownloadAppClickMethod(c1051660dTQ), new SwipeUpVideoMethod(c1051660dTQ), new CloseLynxFeedMaskMethod(c1051660dTQ), new DidGetGameCodeClickMethod(c1051660dTQ), new DidSelectVoteCardOptionMethod(c1051660dTQ), new OpenLightLandingPageMethod(c1051660dTQ), new DidSelectScoreMethod(c1051660dTQ), new DynamicAdViewSizeMethod(c1051660dTQ), new DynamicAdReadyMethod(c1051660dTQ), new DynamicAdStatusMethod(c1051660dTQ), new AdLynxSuperLikeStatusMethod(c1051660dTQ), new AdMakePhoneCallMethod(c1051660dTQ), new AdFollowButtonFollowActionMethod(c1051660dTQ), new ClosePopUpWindow(c1051660dTQ), new RegisterProgressObserverMethod(c1051660dTQ), new AdLynxStickerStatusMethod(c1051660dTQ));
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("get_native_site_custom_data_idl_switch", true)) {
            listLJIILJJIL.add(new GetNativeSiteCustomDataMethod(c1051660dTQ));
        }
        List listLJLIL = C13LP.LJLIL(C13LP.LLIIII(listLJIILJJIL), arrayList);
        Iterable arrayList2 = new ArrayList();
        C988570bpf.LIZ.getClass();
        if (C1041070dCL.LIZ() != null) {
            arrayList2 = C1028210crb.LJIL(c1051660dTQ);
        }
        List listLJLIL2 = C13LP.LJLIL(arrayList2, listLJLIL);
        Iterable arrayList3 = new ArrayList();
        if (C1041070dCL.LIZ() != null) {
            arrayList3 = C1028210crb.LJJ(c1051660dTQ);
        }
        List listLJLIL3 = C13LP.LJLIL(arrayList3, listLJLIL2);
        ArrayList arrayList4 = new ArrayList();
        if (C1041070dCL.LIZ() != null) {
            arrayList4 = new ArrayList();
        }
        return C13LP.LJLIL(C1697810uHb.LJIILJJIL(new CloseAdLynxCardMethod(c1051660dTQ), new AdLynxCardStatusMethod(c1051660dTQ), new CollapseAdLynxCardMethod(c1051660dTQ)), C13LP.LJLIL(new ArrayList(), C13LP.LJLIL(arrayList4, listLJLIL3)));
    }
}
