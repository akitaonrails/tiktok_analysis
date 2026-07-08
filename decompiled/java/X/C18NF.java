package X;

import Y.ARunnableS101S0200000_32;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.dependency.ad.AdDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilege;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorPrivilegeItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ad.IAdDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.ShopAnchorSellingPointData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS276S0300000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18NF, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18NF {
    public static final C18NF LIZ = new C18NF();
    public static final C1519760peQ<AbstractC21274918Nn> LIZIZ = new C1519760peQ<>();

    public static final boolean LIZ(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getShopAnchorSellingPoints() != null) {
            return true;
        }
        return false;
    }

    public static final Integer LIZIZ(AwemeRawAd awemeRawAd) {
        ShopAnchorSellingPointData shopAnchorSellingPoints;
        if (awemeRawAd != null && (shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints()) != null) {
            return Integer.valueOf(shopAnchorSellingPoints.getSellingPointType());
        }
        return null;
    }

    public static C18OC LIZJ(AbstractC21274918Nn abstractC21274918Nn) {
        Object tag = abstractC21274918Nn.getTag(R.id.aa2);
        if (tag instanceof C18OC) {
            return (C18OC) tag;
        }
        return null;
    }

    public static void LJIIIIZZ(AbstractC21274918Nn abstractC21274918Nn) {
        C18OC c18ocLIZJ;
        if (abstractC21274918Nn != null && (c18ocLIZJ = LIZJ(abstractC21274918Nn)) != null && c18ocLIZJ.LIZLLL != null) {
            HandlerHook.viewRemoveCallbacks(abstractC21274918Nn, c18ocLIZJ.LIZLLL);
            AFwS278S0000000_32 aFwS278S0000000_32 = AFwS278S0000000_32.get$arr$(141);
            C18OC c18ocLIZJ2 = LIZJ(abstractC21274918Nn);
            if (c18ocLIZJ2 != null) {
                aFwS278S0000000_32.invoke(c18ocLIZJ2);
            }
        }
    }

    public static final void LIZLLL(Aweme aweme, String str) {
        AwemeRawAd awemeRawAd;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        String name;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                boolean z = false;
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    z = true;
                }
                String name2 = IAdDependencyService.class.getName();
                if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
            }
            AbstractC1056160dag abstractC1056160dagOnAdEvent = ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("draw_ad", "selling_point_send_fail", awemeRawAd);
            abstractC1056160dagOnAdEvent.LIZIZ.put("fail_reason", str);
            abstractC1056160dagOnAdEvent.LIZIZ();
        }
    }

    public static void LJ(Aweme aweme, AbstractC21274918Nn abstractC21274918Nn) {
        AwemeRawAd awemeRawAd;
        ShopAnchorSellingPointData shopAnchorSellingPoints;
        if (abstractC21274918Nn != null) {
            LJIIIIZZ(abstractC21274918Nn);
            LIZIZ.LJ(abstractC21274918Nn);
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints()) != null) {
            shopAnchorSellingPoints.setEnableQcpxBoost(false);
        }
    }

    public static void LJFF(Aweme aweme, AbstractC21274918Nn abstractC21274918Nn, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel) {
        AwemeRawAd awemeRawAd;
        ShopAnchorSellingPointData shopAnchorSellingPoints;
        if (abstractC21274918Nn != null && aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints()) != null) {
            shopAnchorSellingPoints.setEnableQcpxBoost(false);
            Integer updateMs = shopAnchorSellingPoints.getUpdateMs();
            if (updateMs != null) {
                int iIntValue = updateMs.intValue();
                String updateAnchorInfo = shopAnchorSellingPoints.getUpdateAnchorInfo();
                if (updateAnchorInfo != null && updateAnchorInfo.length() != 0 && Intrinsics.LJFF(shopAnchorSellingPoints.isRealBoost(), Boolean.TRUE)) {
                    Number boostStatus = shopAnchorSellingPoints.getBoostStatus();
                    if (Intrinsics.LJFF(boostStatus, 2)) {
                        LJIIIZ(aweme, abstractC21274918Nn, eCommerceAnchorPanelViewModel, false);
                        return;
                    }
                    if (Intrinsics.LJFF(boostStatus, 1) || !Intrinsics.LJFF(boostStatus, 0)) {
                        return;
                    }
                    C18OC c18ocLIZJ = LIZJ(abstractC21274918Nn);
                    if (c18ocLIZJ != null && !c18ocLIZJ.LIZJ) {
                        LJI(aweme, abstractC21274918Nn, eCommerceAnchorPanelViewModel);
                    }
                    AwS276S0300000_32 awS276S0300000_32 = new AwS276S0300000_32(aweme, abstractC21274918Nn, eCommerceAnchorPanelViewModel, 12);
                    long j = iIntValue;
                    if (!LIZIZ.contains(abstractC21274918Nn)) {
                        LIZIZ.LIZJ(abstractC21274918Nn);
                    }
                    ARunnableS101S0200000_32 aRunnableS101S0200000_32 = new ARunnableS101S0200000_32(abstractC21274918Nn, awS276S0300000_32, 29);
                    HandlerHook.viewPostDelay(abstractC21274918Nn, aRunnableS101S0200000_32, j);
                    AwS611S0100000_32 awS611S0100000_32 = new AwS611S0100000_32(aRunnableS101S0200000_32, 258);
                    C18OC c18ocLIZJ2 = LIZJ(abstractC21274918Nn);
                    if (c18ocLIZJ2 == null) {
                        return;
                    }
                    awS611S0100000_32.invoke(c18ocLIZJ2);
                }
            }
        }
    }

    public static final void LJI(Aweme aweme, AbstractC21274918Nn abstractC21274918Nn, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel) {
        AwemeRawAd awemeRawAd;
        ShopAnchorSellingPointData shopAnchorSellingPoints;
        LIZ.getClass();
        LJIIIIZZ(abstractC21274918Nn);
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints()) != null) {
            shopAnchorSellingPoints.setEnableQcpxBoost(false);
            if (shopAnchorSellingPoints.getType() != 1 && shopAnchorSellingPoints.getType() != 2) {
                return;
            }
            C18OC c18oc = new C18OC(aweme.getAid(), eCommerceAnchorPanelViewModel);
            if (abstractC21274918Nn != null) {
                abstractC21274918Nn.setTag(R.id.aa2, c18oc);
            }
            LJII(aweme, abstractC21274918Nn, eCommerceAnchorPanelViewModel, shopAnchorSellingPoints.getAnchorInfo());
        }
    }

    public static boolean LJII(Aweme aweme, AbstractC21274918Nn abstractC21274918Nn, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel, String str) {
        List<AnchorPrivilegeItem> anchorPrivilegeItems;
        AnchorPrivilegeItem anchorPrivilegeItem;
        String optShowText;
        List<AnchorPrivilegeItem> anchorPrivilegeItems2;
        AnchorPrivilegeItem anchorPrivilegeItem2;
        AnchorPrivilegeItem anchorPrivilegeItem3;
        List<AnchorPrivilegeItem> anchorPrivilegeItems3;
        try {
            AnchorPrivilege anchorPrivilege = (AnchorPrivilege) C293501Bt.LIZ().LJII(str, AnchorPrivilege.class);
            if (anchorPrivilege != null && (anchorPrivilegeItems = anchorPrivilege.getAnchorPrivilegeItems()) != null && (anchorPrivilegeItem = (AnchorPrivilegeItem) C13LP.LJJJLZIJ(0, anchorPrivilegeItems)) != null && (optShowText = anchorPrivilegeItem.getOptShowText()) != null && optShowText.length() != 0) {
                if (anchorPrivilege != null) {
                    anchorPrivilegeItems2 = anchorPrivilege.getAnchorPrivilegeItems();
                } else {
                    anchorPrivilegeItems2 = null;
                }
                if (abstractC21274918Nn != null) {
                    if (anchorPrivilege != null && (anchorPrivilegeItems3 = anchorPrivilege.getAnchorPrivilegeItems()) != null) {
                        anchorPrivilegeItem2 = (AnchorPrivilegeItem) C13LP.LJJJLZIJ(0, anchorPrivilegeItems3);
                    } else {
                        anchorPrivilegeItem2 = null;
                        if (anchorPrivilege != null) {
                        }
                        anchorPrivilegeItem3 = null;
                        abstractC21274918Nn.LIZ(anchorPrivilegeItem2, anchorPrivilegeItem3, null);
                    }
                    List<AnchorPrivilegeItem> anchorPrivilegeItems4 = anchorPrivilege.getAnchorPrivilegeItems();
                    if (anchorPrivilegeItems4 != null) {
                        anchorPrivilegeItem3 = (AnchorPrivilegeItem) C13LP.LJJJLZIJ(1, anchorPrivilegeItems4);
                    } else {
                        anchorPrivilegeItem3 = null;
                    }
                    abstractC21274918Nn.LIZ(anchorPrivilegeItem2, anchorPrivilegeItem3, null);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C21272018Mk.LIZ.getClass();
                linkedHashMap.putAll(C21272018Mk.LJIIJ(anchorPrivilegeItems2));
                linkedHashMap.putAll(C21272018Mk.LJIL(anchorPrivilegeItems2));
                linkedHashMap.put("ad_key_subtitle_text", optShowText);
                eCommerceAnchorPanelViewModel.LLJIJIL = linkedHashMap;
                return true;
            }
            LIZLLL(aweme, "empty selling text");
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parse error: ");
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            sbLIZ.append(message);
            C2188811AlT.LIZIZ(sbLIZ);
            LIZLLL(aweme, "parse fail");
            return false;
        }
    }

    public static final void LJIIIZ(Aweme aweme, AbstractC21274918Nn abstractC21274918Nn, ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel, boolean z) {
        AwemeRawAd awemeRawAd;
        ShopAnchorSellingPointData shopAnchorSellingPoints;
        AwemeRawAd awemeRawAd2;
        AnonymousClass0317 anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin;
        boolean z2;
        String name;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (shopAnchorSellingPoints = awemeRawAd.getShopAnchorSellingPoints()) != null) {
            if (shopAnchorSellingPoints.getType() != 1 && shopAnchorSellingPoints.getType() != 2) {
                return;
            }
            if (abstractC21274918Nn != null) {
                C18NF c18nf = LIZ;
                AFwS278S0000000_32 aFwS278S0000000_32 = AFwS278S0000000_32.get$arr$(142);
                c18nf.getClass();
                C18OC c18ocLIZJ = LIZJ(abstractC21274918Nn);
                if (c18ocLIZJ != null) {
                    aFwS278S0000000_32.invoke(c18ocLIZJ);
                }
            }
            shopAnchorSellingPoints.setEnableQcpxBoost(true);
            C18NF c18nf2 = LIZ;
            String updateAnchorInfo = shopAnchorSellingPoints.getUpdateAnchorInfo();
            c18nf2.getClass();
            if (LJII(aweme, abstractC21274918Nn, eCommerceAnchorPanelViewModel, updateAnchorInfo) && z && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = AdDependencyService.createIAdDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String name2 = IAdDependencyService.class.getName();
                    if (anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAdDependencyService.class);
                }
                ((IAdDependencyService) anonymousClass0317CreateIAdDependencyServicebyMonsterPlugin).onAdEvent("draw_ad", "anchor_boost_coupon", awemeRawAd2).LIZIZ();
            }
        }
    }
}
