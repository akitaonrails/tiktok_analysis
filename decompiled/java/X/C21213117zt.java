package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.settings.ShopBagIconGuidanceAnimConfigSettings;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.settings.EcShopBagBubbleNoImageSetting;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.17zt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21213117zt {
    public static final C21213117zt LIZ = new C21213117zt();
    public static final C01GW<Pair<String, String>> LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(168));

    public static void LIZJ() {
        LIZ(true);
        LIZIZ(true);
        Pair<String, String> value = LIZIZ.getValue();
        if (!C1309630kBV.LIZ(value.getSecond()) && C123100dR.LIZ(value.getFirst()) && C123100dR.LIZ(value.getSecond())) {
            C1309630kBV.LIZIZ(value.getSecond(), value.getFirst());
        }
    }

    public static int LJII() {
        if (!C21200717xt.LIZ() || (!(C21206517yp.LIZIZ() == 1 || C21206517yp.LIZIZ() == 0 || C21206517yp.LIZIZ() == 4) || C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_live_room_animation_timing_type", true) != 0 || C20340514iR.LJ() || (!C20340514iR.LJ() && C212149180l.LLJJIJI && EcShopBagBubbleNoImageSetting.LIZ().enable))) {
            return 0;
        }
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_shop_bag_icon_guidance_animation_type", true);
    }

    public static boolean LIZ(boolean z) {
        String strLJFF;
        String strLJFF2;
        boolean z2 = true;
        if (LJII() == 0) {
            return false;
        }
        boolean zLJIIJJI = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).B4().LJIIJJI();
        int iLJII = LJII();
        String strLJ = LJ(zLJIIJJI, true);
        String strLJ2 = LJ(zLJIIJJI, false);
        if (iLJII == 2 && !C1309630kBV.LIZ(strLJ)) {
            if (z && (strLJFF2 = LJFF(zLJIIJJI, true)) != null) {
                C1309630kBV.LIZIZ(strLJ, strLJFF2);
            }
            z2 = false;
        }
        if (!C1309630kBV.LIZ(strLJ2)) {
            if (z && (strLJFF = LJFF(zLJIIJJI, false)) != null) {
                C1309630kBV.LIZIZ(strLJ2, strLJFF);
            }
            return false;
        }
        return z2;
    }

    public static boolean LIZIZ(boolean z) {
        String strLJIIIZ;
        String strLJIIIZ2;
        boolean z2 = true;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_shop_bag_pin_connection_anim_enable", true) == 1 && (C21206517yp.LIZIZ() == 1 || C21206517yp.LIZIZ() == 0 || C21206517yp.LIZIZ() == 4)) {
            String strLJIIIIZZ = LJIIIIZZ(true);
            String strLJIIIIZZ2 = LJIIIIZZ(false);
            if (!C1309630kBV.LIZ(strLJIIIIZZ)) {
                if (z && (strLJIIIZ2 = LJIIIZ(true)) != null) {
                    C1309630kBV.LIZIZ(strLJIIIIZZ, strLJIIIZ2);
                }
                z2 = false;
            }
            if (!C1309630kBV.LIZ(strLJIIIIZZ2)) {
                if (z && (strLJIIIZ = LJIIIZ(false)) != null) {
                    C1309630kBV.LIZIZ(strLJIIIIZZ2, strLJIIIZ);
                }
            } else {
                return z2;
            }
        }
        return false;
    }

    public static String LIZLLL(int i) {
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "ec_shop_bag_icon_product_num_visible", true) != 0 && i > 0) {
            if (i >= 100) {
                return "99+";
            }
            return String.valueOf(i);
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIIZZ(boolean r4) {
        /*
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "anim_"
            r3.<init>(r0)
            int r1 = X.C21206517yp.LIZIZ()
            r2 = 1
            if (r1 == 0) goto L4f
            if (r1 == r2) goto L49
            r0 = 2
            if (r1 == r0) goto L4f
            r0 = 3
            if (r1 == r0) goto L49
            r0 = 4
            if (r1 != r0) goto L1e
            java.lang.String r0 = "new_bag_"
            r3.append(r0)
        L1e:
            java.lang.String r0 = "for_pin_"
            r3.append(r0)
            if (r4 == 0) goto L46
            java.lang.String r0 = "before"
        L27:
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "dynamic_lottie_file_name_setting"
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r2)
            if (r0 == 0) goto L45
            java.lang.String r0 = LJIIIZ(r4)
            java.lang.String r1 = LJI(r0, r1)
        L45:
            return r1
        L46:
            java.lang.String r0 = "after"
            goto L27
        L49:
            java.lang.String r0 = "cart_"
            r3.append(r0)
            goto L1e
        L4f:
            java.lang.String r0 = "bag_"
            r3.append(r0)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21213117zt.LJIIIIZZ(boolean):java.lang.String");
    }

    public static String LJIIIZ(boolean z) {
        ShopBagIconGuidanceAnimConfigSettings.ECShopBagLottieUrls eCShopBagLottieUrls = ShopBagIconGuidanceAnimConfigSettings.LIZ().lottieUrls;
        if (eCShopBagLottieUrls == null) {
            return null;
        }
        int iLIZIZ = C21206517yp.LIZIZ();
        if (iLIZIZ != 0) {
            if (iLIZIZ != 1) {
                if (iLIZIZ != 2) {
                    if (iLIZIZ != 3) {
                        if (iLIZIZ != 4) {
                            return null;
                        }
                        if (z) {
                            return eCShopBagLottieUrls.animNewBagPinBefore;
                        }
                        return eCShopBagLottieUrls.animNewBagPinAfter;
                    }
                }
            }
            if (z) {
                return eCShopBagLottieUrls.animCartPinBefore;
            }
            return eCShopBagLottieUrls.animCartPinAfter;
        }
        if (z) {
            return eCShopBagLottieUrls.animBagPinBefore;
        }
        return eCShopBagLottieUrls.animBagPinAfter;
    }

    public static String LJ(boolean z, boolean z2) {
        boolean z3;
        String str;
        String str2;
        String str3;
        if (C21206517yp.LIZIZ() != 1 && C21206517yp.LIZIZ() != 3) {
            z3 = false;
        } else {
            z3 = true;
        }
        StringBuilder sb = new StringBuilder("anim_");
        if (z3) {
            str = "cart_";
        } else {
            str = "bag_";
        }
        sb.append(str);
        sb.append("bubble_");
        if (z) {
            str2 = "with_text_";
        } else {
            str2 = "no_text_";
        }
        sb.append(str2);
        if (z2) {
            str3 = "before";
        } else {
            str3 = "after";
        }
        sb.append(str3);
        String string = sb.toString();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("dynamic_lottie_file_name_setting", true)) {
            return LJI(LJFF(z, z2), string);
        }
        return string;
    }

    public static String LJFF(boolean z, boolean z2) {
        boolean z3 = true;
        if (C21206517yp.LIZIZ() != 1 && C21206517yp.LIZIZ() != 3) {
            z3 = false;
        }
        ShopBagIconGuidanceAnimConfigSettings.ECShopBagLottieUrls eCShopBagLottieUrls = ShopBagIconGuidanceAnimConfigSettings.LIZ().lottieUrls;
        if (eCShopBagLottieUrls == null) {
            return null;
        }
        if (z3) {
            if (z) {
                if (z2) {
                    return eCShopBagLottieUrls.animCartBubbleWithTextBefore;
                }
                return eCShopBagLottieUrls.animCartBubbleWithTextAfter;
            }
            if (z2) {
                return eCShopBagLottieUrls.animCartBubbleNoTextBefore;
            }
            return eCShopBagLottieUrls.animCartBubbleNoTextAfter;
        }
        if (z) {
            if (z2) {
                return eCShopBagLottieUrls.animBagBubbleWithTextBefore;
            }
            return eCShopBagLottieUrls.animBagBubbleWithTextAfter;
        }
        if (z2) {
            return eCShopBagLottieUrls.animBagBubbleNoTextBefore;
        }
        return eCShopBagLottieUrls.animBagBubbleNoTextAfter;
    }

    public static String LJI(String str, String str2) {
        String path;
        Integer numValueOf;
        int iIntValue;
        String strSubstring;
        if (str != null && (path = UriProtector.parse(str).getPath()) != null && (iIntValue = (numValueOf = Integer.valueOf(a0.LJJJJ(path, '/', 0, 6))).intValue()) != -1 && path.length() > iIntValue + 1 && 1 != 0) {
            String strSubstring2 = path.substring(numValueOf.intValue() + 1);
            Integer numValueOf2 = Integer.valueOf(a0.LJJJJ(strSubstring2, '.', 0, 6));
            if (numValueOf2.intValue() != -1 && (strSubstring = strSubstring2.substring(0, numValueOf2.intValue())) != null) {
                return strSubstring;
            }
        }
        return str2;
    }
}
