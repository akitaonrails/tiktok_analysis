package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ad.feed.dialog.FeedAdDislikeSubReasonDialog;
import com.ss.android.ugc.aweme.commercialize.model.AdDislikeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0dnx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1064390dnx {
    public static final C1064390dnx LIZ = new C1064390dnx();

    public static void LIZ(InterfaceC1064430do1 interfaceC1064430do1, Function0 function0) {
        C19EG c19egLIZIZ;
        String str;
        String str2;
        Object c098200Yq;
        Map map;
        String str3;
        String str4;
        boolean z;
        Context contextLIZ = interfaceC1064430do1.LIZ();
        if (contextLIZ != null) {
            c19egLIZIZ = C1388190mED.LIZIZ(contextLIZ);
        } else {
            c19egLIZIZ = null;
        }
        AdDislikeInfo adDislikeInfoLIZIZ = interfaceC1064430do1.LIZIZ();
        if (adDislikeInfoLIZIZ != null && adDislikeInfoLIZIZ.enable == 1) {
            AdDislikeInfo adDislikeInfoLIZIZ2 = interfaceC1064430do1.LIZIZ();
            if (adDislikeInfoLIZIZ2 != null && adDislikeInfoLIZIZ2.dislikeStyle == 0) {
                if (c19egLIZIZ != null) {
                    C1064970dot c1064970dot = new C1064970dot(interfaceC1064430do1.getAid(), interfaceC1064430do1.getAdId(), interfaceC1064430do1.getRoomId(), interfaceC1064430do1.getCreativeId(), interfaceC1064430do1.getLogExtra(), interfaceC1064430do1.LIZIZ(), interfaceC1064430do1.LIZJ());
                    FeedAdDislikeSubReasonDialog feedAdDislikeSubReasonDialog = new FeedAdDislikeSubReasonDialog();
                    Bundle bundle = new Bundle();
                    C786410Ut5.LJJIZ(bundle, "subReason_depend", c1064970dot);
                    feedAdDislikeSubReasonDialog.setArguments(bundle);
                    feedAdDislikeSubReasonDialog.setCancelable(true);
                    feedAdDislikeSubReasonDialog.show(c19egLIZIZ.getSupportFragmentManager(), "feed_ad_dislike_sub_reason_dialog");
                    return;
                }
                return;
            }
            Context contextLIZ2 = interfaceC1064430do1.LIZ();
            AdDislikeInfo adDislikeInfoLIZIZ3 = interfaceC1064430do1.LIZIZ();
            if (adDislikeInfoLIZIZ3 == null || adDislikeInfoLIZIZ3.enable != 1 || contextLIZ2 == null) {
                if (function0 == null) {
                    return;
                }
                function0.invoke();
                return;
            }
            try {
                Aweme awemeLJII = C1022030chd.LJII(interfaceC1064430do1.getAid());
                String enterFrom = interfaceC1064430do1.getEnterFrom();
                if (enterFrom == null) {
                    enterFrom = "homepage";
                }
                C1064400dny c1064400dny = new C1064400dny(awemeLJII, enterFrom);
                Aweme aweme = c1064400dny.LIZ;
                if (aweme != null && aweme.isAd()) {
                    try {
                        c1064400dny.logAd(C1064410dnz.LIZ, c1064400dny.LIZ.getAwemeRawAd());
                        z = true;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        z = false;
                    }
                    C189200o6.m2constructorimpl(Boolean.valueOf(z));
                } else {
                    z = false;
                    C189200o6.m2constructorimpl(Boolean.valueOf(z));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            AdDislikeInfo adDislikeInfoLIZIZ4 = interfaceC1064430do1.LIZIZ();
            if (adDislikeInfoLIZIZ4 == null || (str = adDislikeInfoLIZIZ4.lynxSchema) == null) {
                str = "aweme://lynxview?use_spark=1&surl=https%3A%2F%2Fsf-teko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-internal-sg%2F75%2Fteko%2Fresource%2Fads_dislike_page%2Ftemplate.js&channel=ads_dislike_page&bundle=template.js%26channel%3Dads_dislike_page%26bundle%3Dtemplate.js%26container_bg_color%3D00000000%26loading_bg_color%3D00000000%26hide_nav_bar%3D1%26show_mask%3D0";
            }
            String strLJJIFFI = u.LJJIFFI(str, "://lynxview", "://lynxview_popup", false);
            if (contextLIZ2.getResources().getConfiguration().getLayoutDirection() == 1) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            if (!a0.LJJIIZI(strLJJIFFI, "is_rtl=", false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJJIFFI);
                String str5 = "?";
                if (a0.LJJIIZI(strLJJIFFI, "?", false)) {
                    str5 = "&";
                }
                sbLIZ.append(str5);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append("is_rtl=");
                sbLIZ2.append(str2);
                strLJJIFFI = C2188811AlT.LIZIZ(sbLIZ2);
            }
            final SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(strLJJIFFI);
            LIZ.getClass();
            sparkContext.LJJ(C1543000qFu.class, new C1543000qFu() { // from class: X.0OeU
                @Override // X.C1543000qFu
                public final List<Class<? extends InterfaceC1063710dmr>> LJFF() {
                    return Collections.singletonList(C519930KaF.class);
                }

                @Override // X.C1543000qFu
                public final List<Class<? extends InterfaceC1063710dmr>> LJI() {
                    return Collections.singletonList(C519930KaF.class);
                }
            });
            String aid = interfaceC1064430do1.getAid();
            if (aid != null) {
                sparkContext.LJJJZ("aweme_id", aid);
                String enterFrom2 = interfaceC1064430do1.getEnterFrom();
                String str6 = "";
                if (enterFrom2 == null) {
                    enterFrom2 = "";
                }
                sparkContext.LJJJZ("enter_from", enterFrom2);
                sparkContext.LJJJZ("enter_method", "");
                sparkContext.LJJJZ("height_percent", "100");
                sparkContext.LJJJZ("height", "90%");
                sparkContext.LJJL("hide_nav_bar", true);
                sparkContext.LJJL("hide_back_button", true);
                sparkContext.LJJJZ("container_bg_color", "00000000");
                sparkContext.LJJJZ("loading_bg_color", "00000000");
                sparkContext.LJJL("show_mask", true);
                sparkContext.LJJL("disable_outside_click_close", false);
                sparkContext.LJJL("enable_pull_down_close", true);
                sparkContext.LJJL("drag_by_gesture", true);
                sparkContext.LJJL("mask_close_until_loaded", false);
                Aweme awemeLJII2 = C1022030chd.LJII(interfaceC1064430do1.getAid());
                if (awemeLJII2 != null) {
                    sparkContext.LJJ(Aweme.class, awemeLJII2);
                }
                AdDislikeInfo adDislikeInfoLIZIZ5 = interfaceC1064430do1.LIZIZ();
                if (adDislikeInfoLIZIZ5 != null) {
                    try {
                        Gson gson = C7740030o.LIZ().getGson();
                        Map mapLJ = (Map) gson.LJIIIIZZ(gson.LJIILL(adDislikeInfoLIZIZ5), new TypeToken<Map<String, ? extends Object>>() { // from class: X.00W1
                        }.getType());
                        if (mapLJ == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        Object obj = sparkContext.extraRuntimeInfo.get((Object) "initialData");
                        if (obj == null) {
                            obj = sparkContext.runtimeInfo.get((Object) "initialData");
                        }
                        if (obj instanceof Map) {
                            map = (Map) obj;
                        } else {
                            map = null;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (map != null) {
                            for (Map.Entry entry : map.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                if ((key instanceof String) && value != null) {
                                    linkedHashMap.put(key, value);
                                }
                            }
                        }
                        linkedHashMap.put("dislike_info", mapLJ);
                        sparkContext.LJJLIIIJ(linkedHashMap, "initialData");
                        Object obj2 = mapLJ.get("toast_text");
                        if ((obj2 instanceof String) && (str4 = (String) obj2) != null) {
                            str6 = str4;
                        } else {
                            Object obj3 = mapLJ.get("toastText");
                            if ((obj3 instanceof String) && (str3 = (String) obj3) != null) {
                                str6 = str3;
                            }
                        }
                        sparkContext.LJJLIIIJ(str6, "ad_dislike_toast_text");
                        C189200o6.m2constructorimpl(sparkContext);
                        c098200Yq = sparkContext;
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        c098200Yq = new C098200Yq(th2);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m1boximpl(c098200Yq);
                }
                sparkContext.LJJJJZI(new C1077550e9B(sparkContext, 3));
                sparkContext.LJJJZ("gravity", "bottom");
                sparkContext.LJJJZ("transition_animation", "bottom");
                sparkContext.LJJJLIIL(new InterfaceC1542790qFZ() { // from class: X.0do2
                    @Override // X.InterfaceC1163130gND
                    public final void release() {
                    }

                    @Override // X.InterfaceC1542790qFZ
                    public final C1725480v0E LJJJJI() {
                        return new C1725480v0E(R.anim.j_, 0);
                    }

                    @Override // X.InterfaceC1542790qFZ
                    public final C1725480v0E LJJLI() {
                        return new C1725480v0E(0, R.anim.j9);
                    }
                });
                sparkContext.LJJLIIIJJI(new InterfaceC2217701Bqy() { // from class: X.0KaH
                    @Override // X.InterfaceC2217701Bqy
                    public final Context LIZJ(Context context) {
                        return context;
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJIILLIIL(boolean z2) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJIL(Activity activity, Context context) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIII(SparkActivity sparkActivity, boolean z2) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIJIIJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIL(SparkActivity sparkActivity, Bundle bundle2) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJJ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJLL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJJJZI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle2) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle2) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLJLI(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJLL(SparkActivity sparkActivity) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void finish() {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void onActivityResult(int i, int i2, Intent intent) {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void onRestoreInstanceState(Bundle bundle2) {
                    }

                    @Override // X.InterfaceC1163130gND
                    public final void release() {
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                        sparkContext.LJJLIIIJ("back", "ad_dislike_close_path");
                        return false;
                    }

                    @Override // X.InterfaceC2217701Bqy
                    public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle2) {
                        View decorView;
                        Window window = sparkActivity.getWindow();
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            decorView.setBackgroundColor(0);
                        }
                        View viewFindViewById = sparkActivity.findViewById(R.id.trr);
                        if (viewFindViewById != null) {
                            viewFindViewById.setBackgroundColor(0);
                        }
                        View viewFindViewById2 = sparkActivity.findViewById(R.id.oc4);
                        if (viewFindViewById2 != null) {
                            viewFindViewById2.setBackgroundColor(0);
                        }
                        View viewFindViewById3 = sparkActivity.findViewById(R.id.a5n);
                        if (viewFindViewById3 != null) {
                            viewFindViewById3.setBackgroundColor(0);
                        }
                    }
                });
            }
            final C259800zU c259800zU = new C259800zU();
            sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0KaG
                @Override // X.InterfaceC1554220qY0
                public final void LIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIIZZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIIZ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIJJI(SparkPopup sparkPopup, LayoutInflater layoutInflater) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIL(SparkPopup sparkPopup, Configuration configuration) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILJJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILLIIL() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIIZILJ(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJI(SparkPopup sparkPopup) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIJJLI(SparkPopup sparkPopup, float f) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJ() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJI(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIFFI(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJII() {
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJJIII(SparkPopup sparkPopup, SparkContext sparkContext2) {
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJ(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIJZLJL(SparkPopup sparkPopup, boolean z2) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZI() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewAttachedToWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void onViewDetachedFromWindow() {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJJIIZ() {
                    String str7;
                    Object obj4 = sparkContext.runtimeInfo.get((Object) "ad_dislike_close_path");
                    if (!(obj4 instanceof String) || (str7 = (String) obj4) == null || str7.length() == 0) {
                        sparkContext.LJJLIIIJ("blank", "ad_dislike_close_path");
                    }
                }

                @Override // X.InterfaceC1554220qY0
                public final boolean LJIJJ(SparkPopup sparkPopup) {
                    sparkContext.LJJLIIIJ("back", "ad_dislike_close_path");
                    return false;
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILL(SparkPopup sparkPopup, int i) {
                    if (i == 1) {
                        c259800zU.element = null;
                        sparkContext.LJJLIIIJ("slide", "ad_dislike_close_path");
                    }
                }
            });
            C1541950qED.LIZJ.getClass();
            new C1541950qED(contextLIZ2, sparkContext).LIZIZ();
            return;
        }
        if (function0 == null) {
            return;
        }
        function0.invoke();
    }
}
