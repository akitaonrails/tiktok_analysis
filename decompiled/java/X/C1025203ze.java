package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS86S0210000_1;

/* JADX INFO: renamed from: X.03ze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1025203ze {
    public static final C1025203ze LIZ = new C1025203ze();

    public static String LIZ(Integer num, Map map) {
        Object obj;
        String str;
        if (map != null && (obj = map.get("cart_form")) != null) {
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (C770702zh.LIZIZ(str)) {
                return (String) obj;
            }
        }
        if (num != null) {
            if (num.intValue() == 2 || num.intValue() == 3) {
                return "confirm";
            }
            if (num.intValue() != 8 && num.intValue() != 0) {
                if (num.intValue() == 7) {
                    return "cart_picture";
                }
                if (num.intValue() == 10) {
                    return "replace";
                }
                if (num.intValue() == 13) {
                    return "free_shipping_addon";
                }
            } else {
                return "add_to_cart";
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025 A[PHI: r1
      0x0025: PHI (r1v1 java.util.HashMap) = (r1v0 java.util.HashMap), (r1v4 java.util.HashMap) binds: [B:14:0x0022, B:8:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.content.Context r8, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter.PdpEnterParam r9, java.lang.String r10, java.lang.String r11, boolean r12, java.lang.String r13) {
        /*
            r3 = 0
            if (r9 == 0) goto L21
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.trackParams
            if (r0 == 0) goto L21
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r0)
        Lc:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.requestParams
            if (r0 == 0) goto L25
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r0)
        L15:
            java.lang.String r3 = r9.chainKey
        L17:
            r6 = r12
            r5 = r11
            r4 = r10
            r7 = r13
            r0 = r8
            java.lang.String r0 = LIZJ(r0, r1, r2, r3, r4, r5, r6, r7)
            return r0
        L21:
            r1 = r3
            if (r9 == 0) goto L25
            goto Lc
        L25:
            r2 = r3
            if (r9 == 0) goto L17
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1025203ze.LIZIZ(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter$PdpEnterParam, java.lang.String, java.lang.String, boolean, java.lang.String):java.lang.String");
    }

    public static String LIZJ(Context context, HashMap map, HashMap map2, String str, String str2, String str3, boolean z, String str4) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        String name;
        if (context != null) {
            boolean z2 = false;
            if (str3 != null && str3.length() != 0) {
                C1742190vRB.LIZ.getClass();
                AnonymousClass0956 anonymousClass0956 = C1742190vRB.LIZLLL;
                if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
                    AnonymousClass0956 anonymousClass09562 = C1742190vRB.LIZLLL;
                    if (anonymousClass09562 != null) {
                        anonymousClass09562.LIZIZ(null);
                    }
                    C1742190vRB.LIZLLL = null;
                }
                if (!z) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
                    if (str2 != null) {
                        linkedHashMap.put("page_name", str2);
                    }
                    linkedHashMap.put("entrance_name", "cart");
                    linkedHashMap.put("entrance_link", str3);
                    C1018703yb.LIZIZ("rd_page_entrance_click", linkedHashMap);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (map != null) {
                    map.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
                }
                if (str2 != null) {
                    if (map != null) {
                        map.put("previous_page", str2);
                    }
                    linkedHashMap2.put("previous_page", str2);
                }
                if (map != null) {
                    linkedHashMap2.put("trackParams", map);
                }
                if (map2 != null) {
                    linkedHashMap2.put("requestParams", map2);
                }
                if (str != null) {
                    linkedHashMap2.put("chainKey", str);
                }
                if (str4 != null) {
                    linkedHashMap2.put("source_btm_token", str4);
                }
                Uri.Builder builderLIZJ = C919503ib.LIZJ(str3, linkedHashMap2);
                AwS86S0210000_1 awS86S0210000_1 = new AwS86S0210000_1(z, context, builderLIZJ, 1);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                        z2 = true;
                    }
                    String name2 = IAccountDependencyService.class.getName();
                    if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
                }
                IAccountDependencyService iAccountDependencyService = (IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
                if (!iAccountDependencyService.isLogin()) {
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if (activityLIZ != null) {
                        iAccountDependencyService.showLoginAndRegisterView(activityLIZ, null, new AwS580S0100000_1(awS86S0210000_1, 375), null);
                    }
                } else {
                    awS86S0210000_1.invoke();
                }
                return builderLIZJ.toString();
            }
        }
        return null;
    }
}
