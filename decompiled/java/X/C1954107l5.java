package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS128S0100000_28;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07l5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1954107l5 {
    public static final C1954107l5 LIZ = new C1954107l5();
    public static final HashMap<EnumC1980807pO, AbstractC1953807l2> LIZIZ;
    public static final C1953707l1 LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.07l1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.07l0, X.10Xo] */
    static {
        HashMap<EnumC1980807pO, AbstractC1953807l2> map = new HashMap<>();
        LIZIZ = map;
        final ?? r3 = new InterfaceC1953607l0() { // from class: X.10Xo
            @Override // X.InterfaceC1953607l0
            public final void LIZIZ(C1950707kX c1950707kX) {
                C19263710Xz.LIZ.getClass();
                C2241008qG c2241008qG = new C2241008qG();
                c2241008qG.LIZ.put("enter_to", C19263710Xz.LJII);
                c2241008qG.LIZ.put("ugdp_id", C19263710Xz.LJIILJJIL);
                c2241008qG.LIZ.put("jump_url", c1950707kX.LIZIZ.toString());
                ARunnableS103S0100000_3 aRunnableS103S0100000_3 = new ARunnableS103S0100000_3(c2241008qG, 0);
                if (C19266010Yw.LIZ()) {
                    C20684815ws.LJFF().execute(aRunnableS103S0100000_3);
                } else {
                    aRunnableS103S0100000_3.run();
                }
            }

            public static String LIZLLL(Intent intent, String str) {
                try {
                    return intent.getStringExtra(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            @Override // X.InterfaceC1953607l0
            public final void LIZ(Activity activity, Uri uri, C1962707mT c1962707mT) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("open_url", uri.toString());
                    C794420VEi.LIZIZ("service_monitor", "no_matched_deep_link", jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C10SW.LIZ.getClass();
                ARunnableS128S0100000_28 aRunnableS128S0100000_28 = new ARunnableS128S0100000_28(uri, 92);
                if (C19266010Yw.LIZ()) {
                    C20684815ws.LJFF().execute(aRunnableS128S0100000_28);
                } else {
                    aRunnableS128S0100000_28.run();
                }
                C10YR.LIZ(uri.toString(), "abs intent == null", false);
                if (!C19262710Xp.LIZ()) {
                    SmartRouter.buildRoute(activity, "//main").open();
                }
                if (!c1962707mT.LIZ) {
                    activity.finish();
                    return;
                }
                Function0<Unit> function0 = c1962707mT.LIZLLL;
                if (function0 == null) {
                    return;
                }
                function0.invoke();
            }

            @Override // X.InterfaceC1953607l0
            public final void LIZJ(Uri uri, C1950707kX c1950707kX, HashMap<String, Object> map2) {
                String strLJJIJIIJIL;
                String stringExtra;
                String stringExtra2;
                String str;
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                Intent intent = c1950707kX.LIZJ;
                C19261610Xe c19261610Xe = c1950707kX.LJFF;
                Uri uri2 = c1950707kX.LIZIZ;
                HashMap map3 = new HashMap();
                String scheme = uri2.getScheme();
                String host = uri2.getHost();
                String str2 = "";
                if (scheme != null && host != null) {
                    try {
                        stringExtra = intent.getStringExtra("from_token");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    map3.put("from_token", stringExtra);
                    if (TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "enter_from"))) {
                        try {
                            stringExtra2 = intent.getStringExtra("enter_from");
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            stringExtra2 = null;
                        }
                        if (TextUtils.equals("token", stringExtra2)) {
                            map3.put("enter_from", "token");
                        } else {
                            Object obj = c1950707kX.LJ.get("is_from_notification");
                            if (obj != null && ((Boolean) obj).booleanValue()) {
                                str = "push";
                            } else {
                                str = "deeplink";
                            }
                            map3.put("enter_from", str);
                        }
                    }
                    if (intent != null) {
                        if (!C19262710Xp.LIZ() && !intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB")) {
                            String strLIZ = C475430Ikf.LIZ(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "tab_index"));
                            if ((!Intrinsics.LJFF("aweme", host) || !Intrinsics.LJFF("click_push_newvideo", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "gd_label")) || !TextUtils.equals(strLIZ, "DISCOVER")) && !TextUtils.isEmpty(strLIZ)) {
                                map3.put("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", strLIZ);
                            }
                            map3.put("is_from_push", 1);
                        }
                        if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "backurl") != null) {
                            map3.put("backurl", "backUrl");
                        }
                    }
                    C1400380mXs.LIZ().LIZ = false;
                    if (intent != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "trigger_by")) != null) {
                        intent.putExtra("trigger_by", strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, "gd_label");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && u.LJJIIJZLJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2, "click_wap", false)) {
                        map3.put("ads_app_activity_by_wap_click", Boolean.TRUE);
                    }
                    map2.putAll(map3);
                }
                Object obj2 = c1950707kX.LJ.get("is_from_notification");
                if (obj2 != null) {
                    map2.put("from_notification", obj2);
                }
                Object obj3 = c1950707kX.LJ.get("notification_id");
                if (obj3 != null) {
                    map2.put("from_notification_uuid", obj3);
                }
                Object obj4 = c1950707kX.LJ.get("rule_id");
                if (obj4 != null) {
                    map2.put("rule_id", obj4);
                }
                if (LIZLLL(intent, "share_url_user_id") != null) {
                    String strLIZLLL = LIZLLL(intent, "share_url_user_id");
                    if (strLIZLLL == null) {
                        strLIZLLL = "";
                    }
                    c19261610Xe.LJFF = strLIZLLL;
                } else if (LIZLLL(intent, "share_sec_url_user_id") != null) {
                    String strLIZLLL2 = LIZLLL(intent, "share_sec_url_user_id");
                    if (strLIZLLL2 == null) {
                        strLIZLLL2 = "";
                    }
                    c19261610Xe.LJFF = strLIZLLL2;
                }
                if (LIZLLL(intent, "share_url_link_id") != null) {
                    String strLIZLLL3 = LIZLLL(intent, "share_url_link_id");
                    if (strLIZLLL3 != null) {
                        str2 = strLIZLLL3;
                    }
                    c19261610Xe.LJI = str2;
                }
                if (((Boolean) C0BKK.LIZ.getValue()).booleanValue()) {
                    ComponentName component = intent.getComponent();
                    if (component != null && (strLJJIJIIJIL = C2204961BRm.LJJIJIIJIL(component, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6tZo/C1TxW+lSoZL0Ws+KGnuJlNgmy1JSZsWEGLiLF3AH5KxiaF5XBca1UOgM=", null))) != null) {
                        C19262710Xp.LIZJ(uri, strLJJIJIIJIL);
                        return;
                    }
                    return;
                }
                C19262710Xp.LIZJ(uri, C2204961BRm.LJJIJIIJIL(intent.getComponent(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6tZo/C1TxW+lSoZL0Ws+KGnuJlNgmy1JSZsWEGLiLF3AH5KxiaF5XBca1UOgM=", null)));
            }
        };
        ?? r1 = new AbstractC1953807l2(r3) { // from class: X.07l1
            @Override // X.AbstractC1953807l2
            public final Pair<Boolean, String> LIZ(C1950707kX c1950707kX, HashMap<String, Object> map2, C1962707mT c1962707mT) {
                this.LIZ.LIZ(c1950707kX.LIZ, c1950707kX.LIZIZ, c1962707mT);
                return new Pair<>(Boolean.valueOf(this.LIZJ), this.LIZIZ);
            }
        };
        LIZJ = r1;
        AbstractC1953807l2 abstractC1953807l2 = new AbstractC1953807l2(r3) { // from class: X.07l4
            @Override // X.AbstractC1953807l2
            public final Pair<Boolean, String> LIZ(C1950707kX c1950707kX, HashMap<String, Object> map2, C1962707mT c1962707mT) {
                List<AbstractC2420009e2> highLevelCommands;
                C2419909e1 c2419909e1 = new C2419909e1(this.LIZ);
                Activity activity = c1950707kX.LIZ;
                IMainService iMainService = (IMainService) PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
                AbstractC2420009e2 abstractC2420009e2LIZIZ = null;
                if (iMainService != null && (highLevelCommands = iMainService.getHighLevelCommands()) != null) {
                    abstractC2420009e2LIZIZ = C2419909e1.LIZIZ(activity, c1950707kX, highLevelCommands);
                }
                return c2419909e1.LIZJ(c1950707kX, map2, c1962707mT, abstractC2420009e2LIZIZ);
            }
        };
        map.put(EnumC1980807pO.TYPE_NONE, r1);
        map.put(EnumC1980807pO.TYPE_COMMAND, new C2419909e1(r3));
        map.put(EnumC1980807pO.TYPE_ACTION, new C1953907l3(r3) { // from class: X.07kz
            @Override // X.AbstractC1953807l2
            public final Pair<Boolean, String> LIZ(C1950707kX c1950707kX, HashMap<String, Object> map2, C1962707mT c1962707mT) {
                Uri uri = c1950707kX.LIZIZ;
                C1953307kx.LIZ.getClass();
                String str = "";
                AbstractC1950207kS abstractC1950207kSLIZIZ = C1953307kx.LIZIZ("", c1950707kX, c1962707mT);
                this.LIZ.LIZJ(uri, c1950707kX, map2);
                this.LIZ.LIZIZ(c1950707kX);
                C1962607mS c1962607mS = C1962607mS.LIZ;
                Function0<Unit> function0 = c1962707mT.LIZLLL;
                c1962607mS.getClass();
                Function0 function0LIZ = C1962607mS.LIZ(c1962707mT, uri, null, function0);
                boolean z = c1962707mT.LIZ;
                Function0<Boolean> function02 = c1962707mT.LJII;
                if (abstractC1950207kSLIZIZ != null) {
                    Activity activity = c1950707kX.LIZ;
                    String string = uri.toString();
                    abstractC1950207kSLIZIZ.LIZJ = map2;
                    abstractC1950207kSLIZIZ.LIZ = UriProtector.parse(string);
                    abstractC1950207kSLIZIZ.LIZIZ = abstractC1950207kSLIZIZ.LJFF();
                    abstractC1950207kSLIZIZ.LIZJ();
                    if (string != null) {
                        abstractC1950207kSLIZIZ.LJII(string, activity, c1950707kX);
                    }
                    Activity activityLIZ = C085T.LIZ(activity);
                    if (!z) {
                        if (activityLIZ != null && (function02 == null || !function02.invoke().booleanValue())) {
                            activityLIZ.finish();
                        }
                    } else if (function0LIZ != null) {
                        function0LIZ.invoke();
                    }
                    String strLJI = abstractC1950207kSLIZIZ.LJI();
                    if (strLJI != null) {
                        str = strLJI;
                    }
                }
                this.LIZIZ = str;
                this.LIZJ = true;
                return new Pair<>(Boolean.TRUE, str);
            }
        });
        map.put(EnumC1980807pO.TYPE_HIGH_LEVEL, abstractC1953807l2);
    }

    public static boolean LIZ(Uri uri, List list) {
        if (list == null) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC2420009e2 abstractC2420009e2 = (AbstractC2420009e2) it2.next();
            if (abstractC2420009e2 != null) {
                String scheme = uri.getScheme();
                String str = "";
                if (scheme == null) {
                    scheme = "";
                }
                String host = uri.getHost();
                if (host == null) {
                    host = "";
                }
                String path = uri.getPath();
                if (path != null) {
                    str = path;
                }
                if (abstractC2420009e2.LJI(uri, scheme, host, str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
