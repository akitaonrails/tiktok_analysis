package X;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.MallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.diversion.traffic.model.MallExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallentry.manager.StickyDiversionConfigData;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.EcMixMallTrafficSourceConfigModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.BackButtonConfig;
import com.ss.android.ugc.aweme.ecommerce.ug.backbutton.service.IEcUgBackButtonServiceOfficial;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetRes;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetResCfg;
import com.ss.android.ugc.aweme.ecommerce.ug.pay.IEcUgPayToMallService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.service.IEcUgVSAService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.IMainPageFragment;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w63, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767530w63 {
    public static final List<InterfaceC1767700w6K> LIZ = C1697810uHb.LJIIJJI(new InterfaceC1767700w6K() { // from class: X.0w61
        @Override // X.InterfaceC1767700w6K
        public final boolean LIZ(C1767550w65 c1767550w65) {
            return true;
        }

        @Override // X.InterfaceC1767700w6K
        public final void LIZIZ(Context context, C1767550w65 c1767550w65) {
            C1741090vPP c1741090vPP;
            C1741040vPK c1741040vPK;
            C1767790w6T c1767790w6T = C1767980w6m.LJII;
            Map<String, String> map = null;
            if (c1767790w6T != null && (c1741090vPP = c1767790w6T.LIZIZ) != null && (c1741040vPK = c1741090vPP.LIZJ) != null) {
                map = c1741040vPK.LIZLLL;
            }
            c1767550w65.LJJ = new C1767500w60(map);
        }
    }, new InterfaceC1767700w6K() { // from class: X.0w6B
        @Override // X.InterfaceC1767700w6K
        public final boolean LIZ(C1767550w65 c1767550w65) {
            if (c1767550w65.LIZIZ == EnumC1767410w5r.CLICK_TAB) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0078  */
        @Override // X.InterfaceC1767700w6K
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(android.content.Context r13, X.C1767550w65 r14) {
            /*
                r12 = this;
                if (r13 != 0) goto L3
                return
            L3:
                java.util.Map<java.lang.String, java.lang.String> r7 = r14.LJII
                if (r7 != 0) goto L8
                return
            L8:
                java.lang.String r0 = "video_shop_guide_schema"
                java.lang.Object r4 = r7.get(r0)
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L7c
                boolean r0 = kotlin.text.a0.LJJJIL(r4)
                if (r0 != 0) goto L7c
                X.19EG r6 = X.C1388190mED.LIZIZ(r13)
                r11 = 0
                if (r6 == 0) goto L7a
                java.lang.String r0 = r14.LJI
                org.json.JSONObject r0 = X.C1767380w5o.LIZJ(r11, r0, r7)
                java.lang.String r5 = X.C786410Ut5.J3(r0)
            L29:
                java.lang.String r0 = r14.LJFF
                if (r0 != 0) goto L2f
                java.lang.String r0 = ""
            L2f:
                X.0w6N r3 = X.C1767600w6A.LIZLLL(r6, r0, r11, r7)
                if (r6 == 0) goto L78
                X.0w6a r2 = X.C1767860w6a.LIZ
                X.0w6E r0 = r14.LIZJ
                boolean r1 = r0.isMallBottomTab()
                r2.getClass()
                com.bytedance.android.bcm.api.model.BcmParams r0 = X.C1767860w6a.LIZLLL(r11)
                X.0vOc r1 = X.C1767860w6a.LIZ(r6, r1, r7, r11, r0)
                if (r1 == 0) goto L78
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService> r6 = com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService.class
                r7 = 0
                r10 = 14
                r8 = r7
                r9 = r7
                java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
                com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService r0 = (com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService) r0
                if (r0 == 0) goto L78
                java.lang.String r1 = r0.LIZJ(r1)
            L5d:
                X.0g9m r0 = X.EnumC1154800g9m.VSA
                r14.LJIL = r0
                r14.LJIIIZ = r4
                r14.LJIIJ = r4
                r14.LJIILJJIL = r5
                if (r3 == 0) goto L76
                java.lang.String r0 = r3.LIZ
            L6b:
                r14.LJIILL = r0
                if (r3 == 0) goto L71
                java.lang.String r11 = r3.LIZIZ
            L71:
                r14.LJIILLIIL = r11
                r14.LJIIJJI = r1
                return
            L76:
                r0 = r11
                goto L6b
            L78:
                r1 = r11
                goto L5d
            L7a:
                r5 = r11
                goto L29
            L7c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1767610w6B.LIZIZ(android.content.Context, X.0w65):void");
        }
    }, new InterfaceC1767700w6K() { // from class: X.0w69
        public static final /* synthetic */ int LIZ = 0;

        @Override // X.InterfaceC1767700w6K
        public final boolean LIZ(C1767550w65 c1767550w65) {
            if (c1767550w65.LIZIZ == EnumC1767410w5r.CLICK_TAB && c1767550w65.LJIL != EnumC1154800g9m.VSA) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
        @Override // X.InterfaceC1767700w6K
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(android.content.Context r13, X.C1767550w65 r14) {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1767590w69.LIZIZ(android.content.Context, X.0w65):void");
        }
    }, new InterfaceC1767700w6K() { // from class: X.0w67
        @Override // X.InterfaceC1767700w6K
        public final boolean LIZ(C1767550w65 c1767550w65) {
            if (c1767550w65.LIZIZ == EnumC1767410w5r.ROUTE) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC1767700w6K
        public final void LIZIZ(Context context, C1767550w65 c1767550w65) {
            C19EG c19egLIZIZ;
            String strLIZ;
            EnumC1768230w7B enumC1768230w7BNh0;
            EnumC1768240w7C enumC1768240w7CH72;
            String value;
            IMainPageFragment iMainPageFragment;
            Uri uri = c1767550w65.LJIIIIZZ;
            if (uri != null) {
                String strLIZLLL = C1976807ok.LIZLLL(uri, "enter_method");
                if (strLIZLLL != null && !a0.LJJJIL(strLIZLLL)) {
                    value = C1976807ok.LIZLLL(uri, "enter_method");
                } else {
                    value = EnumC1593910ra1.OTHER.getValue();
                }
                c1767550w65.LIZLLL = value;
                String strLIZLLL2 = C1976807ok.LIZLLL(uri, "previous_page");
                if (strLIZLLL2 == null && ((iMainPageFragment = (IMainPageFragment) PluggableExtentionKt.pluggableSpi$default(IMainPageFragment.class, false, false, false, 14, null)) == null || (strLIZLLL2 = iMainPageFragment.LJJLIIIJJI()) == null)) {
                    strLIZLLL2 = "";
                }
                c1767550w65.LJFF = strLIZLLL2;
                c1767550w65.LJIIJJI = C1976807ok.LIZLLL(uri, "source_btm_token");
                c1767550w65.LJIIL = C1976807ok.LIZLLL(uri, "landing_deeplink");
                c1767550w65.LJIILIIL = C1976807ok.LIZLLL(uri, "diversion_config");
                c1767550w65.LJIILJJIL = C1976807ok.LIZLLL(uri, "mall_extra_info");
                c1767550w65.LJIILL = C1976807ok.LIZLLL(uri, "diversion_params");
                c1767550w65.LJIILLIIL = C1976807ok.LIZLLL(uri, "diversion_params_extra_info");
                c1767550w65.LJIIZILJ = C1976807ok.LIZLLL(uri, "back_button_config");
                C1976807ok.LIZLLL(uri, "plp_cache_key");
                c1767550w65.LJIJ = C1976807ok.LIZLLL(uri, "mall_or_landing");
                c1767550w65.LJJIIZ = C1976807ok.LIZLLL(uri, "disable_already_in_mall_enter_page_and_tdi");
                String string = uri.toString();
                c1767550w65.LJIIIZ = string;
                c1767550w65.LJIIJ = string;
            }
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                C1767960w6k c1767960w6k = C1767960w6k.LIZ;
                EnumC1767640w6E enumC1767640w6E = c1767550w65.LIZJ;
                c1767960w6k.getClass();
                if (enumC1767640w6E.isMallTopTab()) {
                    strLIZ = C1767960w6k.LIZ(c19egLIZIZ, "homepage_mall");
                    if (a0.LJJIIZI(strLIZ, "be_null", false)) {
                        strLIZ = C1767960w6k.LIZ(c19egLIZIZ, "homepage_shop_mall");
                    }
                } else {
                    strLIZ = C1767960w6k.LIZ(c19egLIZIZ, "homepage_shop_mall");
                    if (a0.LJJIIZI(strLIZ, "be_null", false)) {
                        strLIZ = C1767960w6k.LIZ(c19egLIZIZ, "homepage_mall");
                    }
                }
                c1767550w65.LJI = strLIZ;
                CustomDotAbilityCommon customDotAbilityCommon = (CustomDotAbilityCommon) C1558520qew.LIZ(C1558360qeg.LJI(c19egLIZIZ, null), CustomDotAbilityCommon.class, null);
                if (customDotAbilityCommon == null || (enumC1768230w7BNh0 = customDotAbilityCommon.nh0()) == null) {
                    enumC1768230w7BNh0 = EnumC1768230w7B.DEFAULT;
                }
                c1767550w65.LJIJI = enumC1768230w7BNh0;
                if (customDotAbilityCommon == null || (enumC1768240w7CH72 = customDotAbilityCommon.H72()) == null) {
                    enumC1768240w7CH72 = EnumC1768240w7C.DEFAULT;
                }
                c1767550w65.LJIJJ = enumC1768240w7CH72;
            }
        }
    });
    public static final List<C1767620w6C> LIZIZ = Collections.singletonList(new InterfaceC1767700w6K() { // from class: X.0w6C
        @Override // X.InterfaceC1767700w6K
        public final boolean LIZ(C1767550w65 c1767550w65) {
            return c1767550w65.LIZ;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        @Override // X.InterfaceC1767700w6K
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(android.content.Context r12, X.C1767550w65 r13) {
            /*
                r11 = this;
                r10 = 0
                if (r12 == 0) goto L5c
                X.19EG r5 = X.C1388190mED.LIZIZ(r12)
                if (r5 == 0) goto L5d
                java.lang.String r0 = r13.LJI
                org.json.JSONObject r0 = X.C1767380w5o.LIZJ(r10, r0, r10)
                java.lang.String r4 = X.C786410Ut5.J3(r0)
            L13:
                java.lang.String r0 = r13.LJFF
                if (r0 != 0) goto L19
                java.lang.String r0 = ""
            L19:
                X.0w6N r3 = X.C1767600w6A.LIZLLL(r5, r0, r10, r10)
                if (r5 == 0) goto L5a
                X.0w6a r2 = X.C1767860w6a.LIZ
                X.0w6E r0 = r13.LIZJ
                boolean r1 = r0.isMallBottomTab()
                r2.getClass()
                com.bytedance.android.bcm.api.model.BcmParams r0 = X.C1767860w6a.LIZLLL(r10)
                X.0vOc r1 = X.C1767860w6a.LIZ(r5, r1, r10, r10, r0)
                if (r1 == 0) goto L5a
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService> r5 = com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService.class
                r6 = 0
                r9 = 14
                r7 = r6
                r8 = r6
                java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r5, r6, r7, r8, r9, r10)
                com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService r0 = (com.ss.android.ugc.aweme.ecommerce.ug.btm.IEcUgBtmService) r0
                if (r0 == 0) goto L5a
                java.lang.String r1 = r0.LIZJ(r1)
            L47:
                r13.LJIILJJIL = r4
                if (r3 == 0) goto L58
                java.lang.String r0 = r3.LIZ
            L4d:
                r13.LJIILL = r0
                if (r3 == 0) goto L53
                java.lang.String r10 = r3.LIZIZ
            L53:
                r13.LJIILLIIL = r10
                r13.LJIIJJI = r1
                return
            L58:
                r0 = r10
                goto L4d
            L5a:
                r1 = r10
                goto L47
            L5c:
                r5 = r10
            L5d:
                r4 = r10
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1767620w6C.LIZIZ(android.content.Context, X.0w65):void");
        }
    });
    public static final List<InterfaceC1767710w6L> LIZJ = C1697810uHb.LJIIJJI(new InterfaceC1767710w6L() { // from class: X.0w5t
        @Override // X.InterfaceC1767710w6L
        public final boolean LIZ(C1767550w65 c1767550w65) {
            if (c1767550w65.LIZIZ == EnumC1767410w5r.ROUTE) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC1767710w6L
        public final void LIZIZ(C1767550w65 c1767550w65) {
            String strValueOf;
            Uri uriBuild;
            Uri.Builder builderLIZ;
            Uri uriBuild2;
            AnonymousClass0317 anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin;
            boolean z;
            String name;
            String str;
            Integer numLJIIJJI;
            boolean zHasMallTab = c1767550w65.LIZJ.hasMallTab();
            Uri uri = c1767550w65.LJIIIIZZ;
            String string = null;
            if (uri != null) {
                strValueOf = C1976807ok.LIZLLL(uri, "init_time");
            } else {
                strValueOf = null;
            }
            if (strValueOf != null) {
                uriBuild = c1767550w65.LJIIIIZZ;
            } else {
                strValueOf = String.valueOf(System.currentTimeMillis());
                Uri uri2 = c1767550w65.LJIIIIZZ;
                if (uri2 != null && (builderLIZ = C1976807ok.LIZ(uri2, new Pair("init_time", strValueOf))) != null) {
                    uriBuild = builderLIZ.build();
                } else {
                    uriBuild = null;
                }
            }
            c1767550w65.LJJIIZI = strValueOf;
            if (uriBuild != null) {
                if (zHasMallTab && (str = c1767550w65.LJIJ) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str)) != null && numLJIIJJI.intValue() == 1) {
                    uriBuild2 = C2011207uI.LIZIZ(uriBuild, "landing_deeplink");
                    if (uriBuild2 == null) {
                        uriBuild2 = uriBuild;
                    }
                    c1767550w65.LJIIL = null;
                } else {
                    uriBuild2 = uriBuild;
                }
                if (C2011207uI.LIZ(uriBuild, "landing_deeplink") == null && C2011207uI.LIZ(uriBuild, "insert_product_id") != null) {
                    Pair[] pairArr = new Pair[1];
                    if (C034S.LIZ()) {
                        C1120604Zw.LIZ.LIZ();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin = MallLandingPerfTrackerDependencyService.createIMallLandingPerfTrackerDependencyServicebyMonsterPlugin(false);
                        if (anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        String name2 = IMallLandingPerfTrackerDependencyService.class.getName();
                        if (anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin != null) {
                            name = anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin.getClass().getName();
                        } else {
                            name = null;
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IMallLandingPerfTrackerDependencyService.class);
                    }
                    pairArr[0] = new Pair("mall_landing_perf_id", ((IMallLandingPerfTrackerDependencyService) anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin).newPerfId());
                    uriBuild2 = C1976807ok.LIZ(uriBuild, pairArr).build();
                }
                uriBuild = uriBuild2;
            }
            c1767550w65.LJIIIIZZ = uriBuild;
            if (uriBuild != null) {
                string = uriBuild.toString();
            }
            c1767550w65.LJIIIZ = string;
            c1767550w65.LJIIJ = string;
        }
    }, new InterfaceC1767710w6L() { // from class: X.0w5p
        @Override // X.InterfaceC1767710w6L
        public final boolean LIZ(C1767550w65 c1767550w65) {
            return true;
        }

        @Override // X.InterfaceC1767710w6L
        public final void LIZIZ(C1767550w65 c1767550w65) {
            JSONObject jSONObject;
            String value;
            String str = "";
            try {
                try {
                    String str2 = c1767550w65.LJIILJJIL;
                    if (str2 != null && !a0.LJJJIL(str2)) {
                        jSONObject = new JSONObject(str2);
                    } else {
                        jSONObject = new JSONObject();
                    }
                    th = null;
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    jSONObject = new JSONObject();
                }
                int i = C1767400w5q.LIZ[c1767550w65.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        value = EnumC587230N1l.ROUTE_TO_SHOP.getValue();
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    value = EnumC587230N1l.CLICK_TO_SHOP.getValue();
                }
                if (jSONObject.optString("mall_homepage_visited_type", "").length() == 0) {
                    jSONObject.put("mall_homepage_visited_type", value);
                }
                c1767550w65.LJIILJJIL = C786410Ut5.J3(jSONObject);
                if (th == null) {
                    return;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
            }
            C1767580w68.LIZ.getClass();
            if (((Boolean) C07ER.LIZ.getValue()).booleanValue()) {
                Pair[] pairArr = new Pair[2];
                String str3 = c1767550w65.LJIILJJIL;
                if (str3 == null) {
                    str3 = "";
                }
                pairArr[0] = new Pair("mall_extra_info", str3);
                String str4 = c1767550w65.LJIIJ;
                if (str4 != null) {
                    str = str4;
                }
                pairArr[1] = new Pair("schema", str);
                C1767580w68.LIZIZ("unexpected mall_extra_info", th, C2097608Jq.LJIIJ(pairArr));
            }
        }
    }, new InterfaceC1767710w6L() { // from class: X.0w5u
        public static Map LIZJ(DiversionTargetRes diversionTargetRes) {
            try {
                Pair[] pairArr = new Pair[4];
                String str = diversionTargetRes.uuid;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                pairArr[0] = new Pair("uuid", str);
                String str3 = diversionTargetRes.name;
                if (str3 == null) {
                    str3 = "";
                }
                pairArr[1] = new Pair("name", str3);
                String str4 = diversionTargetRes.type;
                if (str4 != null) {
                    str2 = str4;
                }
                pairArr[2] = new Pair("type", str2);
                pairArr[3] = C1767460w5w.LIZ;
                return C2097608Jq.LJIIIIZZ(pairArr);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }

        @Override // X.InterfaceC1767710w6L
        public final boolean LIZ(C1767550w65 c1767550w65) {
            String str = c1767550w65.LJIILIIL;
            if ((str == null || a0.LJJJIL(str)) && c1767550w65.LJIIIZ == null) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:110:0x0212  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x023b  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x0262 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[PHI: r5
          0x0040: PHI (r5v1 com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData) = 
          (r5v0 com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData)
          (r5v5 com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData)
          (r5v5 com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData)
          (r5v5 com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData)
         binds: [B:17:0x003c, B:14:0x0038, B:20:0x0044, B:27:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x01a9 A[PHI: r0 r3
          0x01a9: PHI (r0v42 java.lang.String) = (r0v41 java.lang.String), (r0v48 java.lang.String) binds: [B:87:0x019f, B:89:0x01a7] A[DONT_GENERATE, DONT_INLINE]
          0x01a9: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v6 java.lang.String) binds: [B:87:0x019f, B:89:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x01da  */
        @Override // X.InterfaceC1767710w6L
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(X.C1767550w65 r11) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 611
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1767440w5u.LIZIZ(X.0w65):void");
        }
    }, new InterfaceC1767710w6L() { // from class: X.0w5s
        @Override // X.InterfaceC1767710w6L
        public final boolean LIZ(C1767550w65 c1767550w65) {
            String str = c1767550w65.LJIIIZ;
            if (str == null || a0.LJJJIL(str)) {
                String str2 = c1767550w65.LJIIJ;
                if (str2 == null || a0.LJJJIL(str2)) {
                    String str3 = c1767550w65.LJJIFFI;
                    if (str3 == null || a0.LJJJIL(str3)) {
                        C1767960w6k.LIZ.getClass();
                        C1767960w6k.LIZLLL(null);
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
        @Override // X.InterfaceC1767710w6L
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(X.C1767550w65 r18) {
            /*
                Method dump skipped, instruction units count: 361
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1767420w5s.LIZIZ(X.0w65):void");
        }
    }, new InterfaceC1767710w6L() { // from class: X.0w64
        @Override // X.InterfaceC1767710w6L
        public final boolean LIZ(C1767550w65 c1767550w65) {
            if (c1767550w65.LIZIZ == EnumC1767410w5r.ROUTE) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00ed  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01cd  */
        @Override // X.InterfaceC1767710w6L
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(X.C1767550w65 r32) {
            /*
                Method dump skipped, instruction units count: 463
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1767540w64.LIZIZ(X.0w65):void");
        }
    }, new InterfaceC1767710w6L() { // from class: X.0w6P
        @Override // X.InterfaceC1767710w6L
        public final boolean LIZ(C1767550w65 c1767550w65) {
            Uri uri = c1767550w65.LJIIIIZZ;
            if (uri != null && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sticky_diversion_config") != null) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC1767710w6L
        public final void LIZIZ(C1767550w65 c1767550w65) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            Type type;
            Map map;
            Map linkedHashMap;
            C1767760w6Q.LIZ.getClass();
            Uri uri = c1767550w65.LJIIIIZZ;
            if (uri != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "sticky_diversion_config")) != null) {
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        type = C2371409Qy.LIZJ(C13LE.LJII(StickyDiversionConfigData.class));
                    } else {
                        type = new TypeToken<StickyDiversionConfigData>() { // from class: X.0w6S
                        }.getType();
                    }
                    Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, type);
                    if (!(objFromJson instanceof StickyDiversionConfigData)) {
                        objFromJson = null;
                    }
                    StickyDiversionConfigData stickyDiversionConfigData = (StickyDiversionConfigData) objFromJson;
                    if (stickyDiversionConfigData != null && (map = stickyDiversionConfigData.config) != null) {
                        StickyDiversionConfigData stickyDiversionConfigData2 = C1767760w6Q.LIZIZ;
                        if (stickyDiversionConfigData2 == null || (linkedHashMap = stickyDiversionConfigData2.config) == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        String str = stickyDiversionConfigData.mergeAction;
                        if (str != null) {
                            int iHashCode = str.hashCode();
                            if (iHashCode != 103785528) {
                                if (iHashCode != 218317805) {
                                    if (iHashCode != 1094496948 || !str.equals("replace")) {
                                    }
                                } else if (str.equals("replace_if_need")) {
                                    if (!(true ^ C13LP.LJJL(linkedHashMap.keySet(), map.keySet()).isEmpty())) {
                                        linkedHashMap.putAll(map);
                                    }
                                }
                            } else if (str.equals("merge")) {
                                linkedHashMap.putAll(map);
                            }
                            map = linkedHashMap;
                        } else {
                            map = linkedHashMap;
                        }
                        String str2 = c1767550w65.LJIILJJIL;
                        if (str2 != null) {
                            map.put("mall_extra_info", str2);
                        }
                        String str3 = c1767550w65.LJIILL;
                        if (str3 != null) {
                            map.put("diversion_params", str3);
                        }
                        stickyDiversionConfigData.config = map;
                        C1767760w6Q.LIZIZ = stickyDiversionConfigData;
                    }
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }, new InterfaceC1767710w6L() { // from class: X.0w6D
        @Override // X.InterfaceC1767710w6L
        public final boolean LIZ(C1767550w65 c1767550w65) {
            if (c1767550w65.LIZIZ == EnumC1767410w5r.ROUTE) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC1767710w6L
        public final void LIZIZ(C1767550w65 c1767550w65) {
            String strLIZIZ;
            Uri uri = c1767550w65.LJIIIIZZ;
            if (uri != null && (strLIZIZ = C1942307jB.LIZIZ(uri, "landing_strategy")) != null && strLIZIZ.length() > 0 && 1 != 0) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1768400w7S(c1767550w65, strLIZIZ, null), 3);
            }
        }
    });
    public static final List<InterfaceC1767720w6M> LIZLLL = C1697810uHb.LJIIJJI(new InterfaceC1767720w6M() { // from class: X.0w6G
        @Override // X.InterfaceC1767720w6M
        public final boolean LIZ(C1767790w6T c1767790w6T) {
            if (c1767790w6T.LIZ == EnumC1767410w5r.ROUTE) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC1767720w6M
        public final void LIZIZ(C1767790w6T c1767790w6T) {
            IEcUgVSAService iEcUgVSAService;
            if (c1767790w6T.LJ.isMallBottomTab() && (iEcUgVSAService = (IEcUgVSAService) PluggableExtentionKt.pluggableSpi$default(IEcUgVSAService.class, false, false, false, 14, null)) != null) {
                iEcUgVSAService.LJII();
            }
        }
    }, new InterfaceC1767720w6M() { // from class: X.0vPJ
        @Override // X.InterfaceC1767720w6M
        public final boolean LIZ(C1767790w6T c1767790w6T) {
            if (c1767790w6T.LIZ == EnumC1767410w5r.ROUTE) {
                return true;
            }
            return false;
        }

        @Override // X.InterfaceC1767720w6M
        public final void LIZIZ(C1767790w6T c1767790w6T) {
            Map<String, Object> mapLIZLLL;
            Long l;
            IEcUgPayToMallService iEcUgPayToMallService = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
            if (iEcUgPayToMallService != null && (mapLIZLLL = iEcUgPayToMallService.LIZLLL()) != null) {
                IEcUgPayToMallService iEcUgPayToMallService2 = (IEcUgPayToMallService) PluggableExtentionKt.pluggableSpi$default(IEcUgPayToMallService.class, false, false, false, 14, null);
                if (iEcUgPayToMallService2 != null) {
                    iEcUgPayToMallService2.setPayToMallParams(null);
                }
                Object obj = mapLIZLLL.get("start_time");
                if ((obj instanceof Long) && (l = (Long) obj) != null) {
                    long jLongValue = l.longValue();
                    mapLIZLLL.remove("start_time");
                    mapLIZLLL.put("duration", Long.valueOf(System.currentTimeMillis() - jLongValue));
                    C1767950w6j.LIZ.getClass();
                    C1767950w6j.LJIJ("rd_tiktokec_mall_pay_route", mapLIZLLL);
                }
            }
        }
    }, new InterfaceC1767720w6M() { // from class: X.1AoC
        @Override // X.InterfaceC1767720w6M
        public final boolean LIZ(C1767790w6T c1767790w6T) {
            return true;
        }

        @Override // X.InterfaceC1767720w6M
        public final void LIZIZ(C1767790w6T c1767790w6T) {
            boolean z;
            Map<? extends String, ? extends Object> mapLJIIIIZZ;
            String str = c1767790w6T.LJI;
            EcMixMallTrafficSourceConfigModel ecMixMallTrafficSourceConfigModel = (EcMixMallTrafficSourceConfigModel) C2190471Ao9.LIZIZ.getValue();
            if (ecMixMallTrafficSourceConfigModel.enable == 1) {
                if (str != null && !a0.LJJJIL(str)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("rd_primary_mall_out_source", "no_mall_extra_info"), new Pair("rd_secondary_mall_landing_page", "no_mall_extra_info"));
                } else {
                    C1227904rF.LIZ.getClass();
                    MallExtraInfo mallExtraInfo = (MallExtraInfo) C1227904rF.LIZIZ(str, MallExtraInfo.class);
                    mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("rd_primary_mall_out_source", C2190511AoD.LIZ(mallExtraInfo.mallOutSource, ecMixMallTrafficSourceConfigModel.primaryOutSourceConfig)), new Pair("rd_secondary_mall_landing_page", C2190511AoD.LIZ(mallExtraInfo.mallLandingPage, ecMixMallTrafficSourceConfigModel.secondaryLandingPageConfig)));
                }
                if (mapLJIIIIZZ != null) {
                    C2190491AoB.LIZ.putAll(mapLJIIIIZZ);
                }
            }
        }
    }, new InterfaceC1767720w6M() { // from class: X.0vOr
        @Override // X.InterfaceC1767720w6M
        public final boolean LIZ(C1767790w6T c1767790w6T) {
            String str;
            BackButtonConfig backButtonConfig = c1767790w6T.LIZIZ.LIZLLL;
            if (backButtonConfig != null) {
                str = backButtonConfig.logicType;
            } else {
                str = null;
            }
            return Intrinsics.LJFF("live_shopping_bag_to_mall", str);
        }

        @Override // X.InterfaceC1767720w6M
        public final void LIZIZ(C1767790w6T c1767790w6T) {
            String str;
            String strValueOf;
            String btmPageCode;
            Map<String, String> mapR9;
            String strLJJIFFI;
            Map<String, Object> map;
            InterfaceC1740760vOs interfaceC1740760vOs;
            BackButtonConfig backButtonConfig = c1767790w6T.LIZIZ.LIZLLL;
            AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
            int length = abstractC1387200mCcArrLJII.length - 1;
            while (true) {
                if (-1 < length) {
                    Object obj = abstractC1387200mCcArrLJII[length].LIZ;
                    if ((obj instanceof InterfaceC1740760vOs) && (interfaceC1740760vOs = (InterfaceC1740760vOs) obj) != null) {
                        btmPageCode = interfaceC1740760vOs.getBtmPageCode();
                    } else {
                        btmPageCode = null;
                    }
                    if (Intrinsics.LJFF(btmPageCode, EnumC1740810vOx.LIVE_PAGE.getPageCode()) && (mapR9 = ((InterfaceC1740760vOs) obj).r9()) != null) {
                        Uri.Builder builderPath = new Uri.Builder().scheme("aweme").authority("ec").path("webcast_room");
                        C1976807ok.LJFF(builderPath, "room_id", mapR9.get("room_id"));
                        IECommerceMallService iECommerceMallService = (IECommerceMallService) PluggableExtentionKt.pluggableSpi$default(IECommerceMallService.class, false, false, false, 14, null);
                        if (iECommerceMallService != null) {
                            strLJJIFFI = iECommerceMallService.LJJIFFI();
                        } else {
                            strLJJIFFI = null;
                        }
                        C1976807ok.LJFF(builderPath, "enter_from_merge", strLJJIFFI);
                        C1976807ok.LJFF(builderPath, "adLiveJson", mapR9.get("adLiveJson"));
                        if (backButtonConfig != null && (map = backButtonConfig.extraParams) != null) {
                            for (Map.Entry<String, Object> entry : map.entrySet()) {
                                C1976807ok.LJFF(builderPath, entry.getKey(), entry.getValue());
                            }
                        }
                        strValueOf = String.valueOf(builderPath);
                        str = "live";
                    } else {
                        length--;
                    }
                } else {
                    str = "";
                    strValueOf = null;
                    break;
                }
            }
            IEcUgBackButtonServiceOfficial iEcUgBackButtonServiceOfficial = (IEcUgBackButtonServiceOfficial) PluggableExtentionKt.pluggableSpi$default(IEcUgBackButtonServiceOfficial.class, false, false, false, 14, null);
            if (iEcUgBackButtonServiceOfficial != null) {
                iEcUgBackButtonServiceOfficial.prepareBackButton(strValueOf, null, str);
            }
        }
    });

    public static C1767790w6T LIZ(Context context, C1767550w65 c1767550w65) {
        List<InterfaceC1767700w6K> list;
        ReachCfgData reachCfgData;
        BackButtonConfig backButtonConfig;
        String str;
        String string;
        Type type;
        Type type2;
        if (c1767550w65.LIZ) {
            list = LIZIZ;
        } else {
            list = LIZ;
        }
        for (InterfaceC1767700w6K interfaceC1767700w6K : list) {
            if (interfaceC1767700w6K.LIZ(c1767550w65)) {
                interfaceC1767700w6K.LIZIZ(context, c1767550w65);
            }
        }
        for (InterfaceC1767710w6L interfaceC1767710w6L : LIZJ) {
            if (interfaceC1767710w6L.LIZ(c1767550w65)) {
                interfaceC1767710w6L.LIZIZ(c1767550w65);
            }
        }
        C1767680w6I c1767680w6I = new C1767680w6I(new C1767670w6H(c1767550w65.LJIILL, Long.valueOf(System.currentTimeMillis())), c1767550w65.LJIILLIIL);
        EnumC1767410w5r enumC1767410w5r = c1767550w65.LIZIZ;
        EnumC1767640w6E enumC1767640w6E = c1767550w65.LIZJ;
        String str2 = c1767550w65.LJIILIIL;
        boolean z = false;
        C1741040vPK c1741040vPK = null;
        try {
            Gson gsonLJFF = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                type2 = C2371409Qy.LIZJ(C13LE.LJII(ReachCfgData.class));
            } else {
                type2 = new TypeToken<ReachCfgData>() { // from class: X.0w6J
                }.getType();
            }
            Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type2);
            if (!(objFromJson instanceof ReachCfgData)) {
                objFromJson = null;
            }
            reachCfgData = (ReachCfgData) objFromJson;
        } catch (s e) {
            TryCatchGuardChecker.doCheck(e);
            reachCfgData = null;
        }
        String str3 = c1767550w65.LJIIZILJ;
        try {
            Gson gsonLJFF2 = C1741890vQh.LJFF();
            C1120604Zw.LIZ.getClass();
            C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
            if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                type = C2371409Qy.LIZJ(C13LE.LJII(BackButtonConfig.class));
            } else {
                type = new TypeToken<BackButtonConfig>() { // from class: X.0vPC
                }.getType();
            }
            Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str3, type);
            if (!(objFromJson2 instanceof BackButtonConfig)) {
                objFromJson2 = null;
            }
            backButtonConfig = (BackButtonConfig) objFromJson2;
        } catch (s e2) {
            TryCatchGuardChecker.doCheck(e2);
            backButtonConfig = null;
        }
        DiversionTargetResCfg diversionTargetResCfg = c1767550w65.LJJI;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str4 = c1767550w65.LJJIFFI;
        if (str4 != null && !a0.LJJJIL(str4)) {
            String str5 = c1767550w65.LJJIFFI;
            EnumC1155020gA8 enumC1155020gA8 = c1767550w65.LJJII;
            EnumC1741050vPL enumC1741050vPL = c1767550w65.LJJIIJ;
            if (enumC1741050vPL == null) {
                enumC1741050vPL = EnumC1741050vPL.UNKNOWN;
            }
            c1741040vPK = new C1741040vPK(str5, enumC1155020gA8, enumC1741050vPL, c1767550w65.LJJIII);
        }
        C1741090vPP c1741090vPP = new C1741090vPP(str2, reachCfgData, c1741040vPK, backButtonConfig, diversionTargetResCfg, jCurrentTimeMillis);
        C1767670w6H c1767670w6H = c1767680w6I.LIZ;
        String str6 = "";
        if (c1767670w6H != null && (str = c1767670w6H.LIZ) != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("diversion_params", str);
            Long l = c1767680w6I.LIZ.LIZIZ;
            if (l == null || (string = l.toString()) == null) {
                string = "";
            }
            jSONObject2.put("diversion_params_timestamp", string);
            jSONObject.put("basic_info", jSONObject2);
            String str7 = c1767680w6I.LIZIZ;
            if (str7 == null) {
                str7 = "";
            }
            jSONObject.put("extra_info", str7);
            String strJ3 = C786410Ut5.J3(jSONObject);
            if (strJ3 != null) {
                str6 = strJ3;
            }
        }
        C1767790w6T c1767790w6T = new C1767790w6T(enumC1767410w5r, c1741090vPP, c1767680w6I, str6, c1767550w65.LJJIIJZLJL, enumC1767640w6E, c1767550w65.LJIIIZ, c1767550w65.LJIILJJIL, c1767550w65.LIZLLL, c1767550w65.LJ, c1767550w65.LJFF, c1767550w65.LJIIJJI, new C1767830w6X(c1767550w65.LJIJI, c1767550w65.LJIJJ), c1767550w65.LJJIIZ, c1767550w65.LJI, c1767550w65.LJJIJ, c1767550w65.LJJIJIIJI, c1767550w65.LJJIJIIJIL, c1767550w65.LJJIJIL);
        C1767980w6m.LJII = c1767790w6T;
        if (enumC1767410w5r == EnumC1767410w5r.ROUTE) {
            z = true;
        }
        C1767980w6m.LJIIIIZZ = z;
        for (InterfaceC1767720w6M interfaceC1767720w6M : LIZLLL) {
            if (interfaceC1767720w6M.LIZ(c1767790w6T)) {
                interfaceC1767720w6M.LIZIZ(c1767790w6T);
            }
        }
        return c1767790w6T;
    }
}
