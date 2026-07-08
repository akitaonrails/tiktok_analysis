package X;

import Y.ARunnableS42S0110000_23;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.watchlive.PadAllPanelAdapterDisableListSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.mt.protector.impl.UriProtector;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.net.URLDecoder;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0qNX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547730qNX {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZJ() {
        return C497740JfY.LJJI(C1057350dcb.LIZ(null));
    }

    public static final void LIZ(SparkContext sparkContext) {
        Context topContext;
        boolean z;
        final boolean zLJIJI;
        Map mapLJ;
        String strValueOf;
        Uri uriBuild;
        int i;
        Resources resources;
        Configuration configuration;
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction != null) {
            topContext = iHostAction.getTopContext();
        } else {
            topContext = null;
        }
        if (topContext != null && (resources = topContext.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        Uri uriLJ = C1946007jm.LJ(sparkContext.LJIJI());
        if (LIZIZ(sparkContext.LJIJI())) {
            Map<String, String> mapLJJJ = sparkContext.LJJJ();
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "gravity");
            String str = mapLJJJ.get("gravity");
            if (str != null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = str;
            }
            zLJIJI = u.LJIJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "center", true);
        } else {
            zLJIJI = false;
        }
        if (LIZIZ(sparkContext.LJIJI())) {
            sparkContext.LJJJJZI(new AbstractC1542200qEc() { // from class: X.0qNZ
                @Override // X.AbstractC1542100qES
                public final void LJLLJ(SparkContext sparkContext2, C1548490qOl c1548490qOl) {
                    LynxView lynxView;
                    if (!zLJIJI) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1548490qOl.LIZ;
                        Object kitView = null;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                            kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView();
                        }
                        if ((kitView instanceof LynxView) && (lynxView = (LynxView) kitView) != null) {
                            lynxView.updateScreenMetrics((int) C497740JfY.LIZIZ(375.0f), (int) C497740JfY.LIZIZ(C1547730qNX.LIZJ()));
                        }
                    }
                    SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c1548490qOl.LIZ;
                    if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                        HandlerHook.viewPost(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, new ARunnableS42S0110000_23(c1548490qOl, zLJIJI, 9));
                    }
                }
            });
            sparkContext.LJJLIIIJJIZ(new InterfaceC1554220qY0() { // from class: X.0qNY
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
                public final void LJIIL(SparkPopup sparkPopup, Configuration configuration2) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILJJIL(SparkPopup sparkPopup) {
                }

                @Override // X.InterfaceC1554220qY0
                public final void LJIILL(SparkPopup sparkPopup, int i2) {
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
                public final boolean LJIJJ(SparkPopup sparkPopup) {
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
                public final void LJJIIZ() {
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
                public final void LJIILIIL(SparkPopup sparkPopup, View view) {
                    View viewFindViewById;
                    C415540GRc c415540GRc = (C415540GRc) view.findViewById(R.id.ri6);
                    if (c415540GRc != null) {
                        c415540GRc.setRadius((int) C497740JfY.LIZIZ(8.0f));
                    }
                    if (zLJIJI) {
                        C1547730qNX.LIZLLL(17, view.findViewById(R.id.ri2));
                    } else {
                        C1547730qNX.LIZLLL(8388693, view.findViewById(R.id.ri2));
                    }
                    if (!zLJIJI && (viewFindViewById = view.findViewById(R.id.ri2)) != null) {
                        viewFindViewById.getLayoutParams().width = (int) C497740JfY.LIZIZ(375.0f);
                        viewFindViewById.getLayoutParams().height = (int) C497740JfY.LIZIZ(C1547730qNX.LIZJ());
                        viewFindViewById.requestLayout();
                    }
                }
            });
            if (LIZIZ(sparkContext.LJIJI()) && !zLJIJI) {
                Pair[] pairArr = new Pair[14];
                pairArr[0] = new Pair("radius", "8.0");
                pairArr[1] = new Pair("gravity", "end");
                pairArr[2] = new Pair("landscape_gravity", "end");
                pairArr[3] = new Pair("transition_animation", "bottom");
                pairArr[4] = new Pair("landscape_transition_animation", "bottom");
                pairArr[5] = new Pair("width", "375.0");
                pairArr[6] = new Pair("landscape_width", "375.0");
                pairArr[7] = new Pair("height", String.valueOf(LIZJ()));
                pairArr[8] = new Pair("landscape_height", String.valueOf(LIZJ()));
                pairArr[9] = new Pair("margin_bottom", "72");
                pairArr[10] = new Pair("margin_top", String.valueOf((int) (C497740JfY.LJJI(C497740JfY.LJIILLIIL()) - ((LIZJ() + 24) + 48))));
                int i2 = 375;
                if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).St()) {
                    i = 375;
                } else {
                    i = 0;
                }
                pairArr[11] = new Pair("margin_right", String.valueOf(i + 24));
                if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).St()) {
                    i2 = 0;
                }
                pairArr[12] = new Pair("margin_left", String.valueOf(i2 + 24));
                pairArr[13] = new Pair("enable_pull_down_close", CardStruct.IStatusCode.DEFAULT);
                mapLJ = C2097608Jq.LJIIIIZZ(pairArr);
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            if (!mapLJ.isEmpty()) {
                Uri.Builder builderBuildUpon = uriLJ.buildUpon();
                if (UriProtector.getQueryParameterNames(uriLJ).contains("url")) {
                    Uri.Builder builderBuildUpon2 = C1946007jm.LJ(URLDecoder.decode(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "url"), "UTF-8")).buildUpon();
                    if (builderBuildUpon2 != null) {
                        for (Map.Entry entry : C2097608Jq.LJIIIIZZ(new Pair("pad_container_width", "375.0"), new Pair("pad_container_height", String.valueOf(LIZJ()))).entrySet()) {
                            builderBuildUpon2.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                        }
                        uriBuild = builderBuildUpon2.build();
                    } else {
                        uriBuild = null;
                    }
                    strValueOf = String.valueOf(uriBuild);
                } else {
                    strValueOf = null;
                }
                builderBuildUpon.clearQuery();
                for (Map.Entry entry2 : mapLJ.entrySet()) {
                    builderBuildUpon.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
                }
                for (String str2 : UriProtector.getQueryParameterNames(uriLJ)) {
                    if (Intrinsics.LJFF(str2, "url") && strValueOf != null) {
                        builderBuildUpon.appendQueryParameter(str2, strValueOf);
                    } else if (!mapLJ.containsKey(str2)) {
                        builderBuildUpon.appendQueryParameter(str2, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, str2));
                    }
                }
                sparkContext.LJJIIZ(builderBuildUpon.build().toString());
                for (Map.Entry entry3 : mapLJ.entrySet()) {
                    sparkContext.LJJJZ((String) entry3.getKey(), (String) entry3.getValue());
                }
                return;
            }
            return;
        }
        if (z) {
            sparkContext.LJJJLZIJ((int) C497740JfY.LJJI(C497740JfY.LJIILLIIL()), "landscape_width");
            sparkContext.LJJJZ("landscape_gravity", "end");
            sparkContext.LJJJZ("landscape_transition_animation", "end");
            sparkContext.LJJJZ("landscape_height", "100%");
        }
    }

    public static boolean LIZIZ(String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            return false;
        }
        if (str != null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(C1946007jm.LJ(str), "url")) != null) {
            for (String str2 : PadAllPanelAdapterDisableListSetting.INSTANCE.getValue()) {
                if (!Intrinsics.LJFF("/falcon/campaign/fusion_cosmic_runtime/pages/", str2) && a0.LJJIIZI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, str2, false)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void LIZLLL(int i, View view) {
        ViewGroup.LayoutParams layoutParams = null;
        if ((view instanceof ViewGroup) && view != null) {
            layoutParams = view.getLayoutParams();
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof C16G1) {
            ((C16G1) layoutParams).LIZJ = i;
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i;
        }
        if (view != null) {
            view.requestLayout();
        }
    }
}
