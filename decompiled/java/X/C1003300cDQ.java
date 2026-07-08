package X;

import Y.ARunnableS27S0101000_16;
import android.content.Context;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ad.feed.adexperience.AutoAdIntroUtils;
import com.ss.android.ugc.aweme.commercialize.model.AdDisclaimer;
import com.ss.android.ugc.aweme.commercialize.model.AutoData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cDQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003300cDQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, Aweme aweme, TuxIconView tuxIconView) {
        String str;
        if (context instanceof InterfaceC723060SXw) {
            MixFlowParam mixFlowParam = AwemeBizExtKt.getMixFlowParam(aweme);
            if (mixFlowParam != null) {
                str = mixFlowParam.from;
            } else {
                str = null;
            }
            if (!Intrinsics.LJFF(str, "from_search_mix")) {
                if (C444960Hcc.LIZIZ()) {
                    if (tuxIconView != null) {
                        C786410Ut5.Fb(tuxIconView, 90.0f);
                    }
                } else {
                    if (tuxIconView == null) {
                        return;
                    }
                    C786410Ut5.Fb(tuxIconView, 270.0f);
                }
            }
        }
    }

    public static final void LIZIZ(final Aweme aweme, final C19EG c19eg, final ViewGroup viewGroup, final String str, final boolean z, final List<Runnable> list) {
        final AwemeRawAd awemeRawAd;
        final AdDisclaimer disclaimer;
        Map<String, AutoData> map;
        final AutoData autoData;
        int iIntValue;
        if (c19eg != null && viewGroup != null && str != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (disclaimer = awemeRawAd.getDisclaimer()) != null && disclaimer.type == 3 && (map = disclaimer.autoDataMap) != null && (autoData = map.get(str)) != null) {
            final TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.hrx);
            TuxIconView tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.hry);
            TuxIconView tuxIconView2 = (TuxIconView) viewGroup.findViewById(R.id.jor);
            tuxIconView.setTintColorRes(R.attr.ee);
            tuxTextView.setTextColorRes(R.attr.ee);
            tuxTextView.setText(autoData.getText());
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zg, c19eg);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            viewGroup.setBackgroundColor(iIntValue);
            if (C1017070cZd.LLJLIL(aweme, str)) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
            if (Intrinsics.LJFF(str, "inventory_product_id")) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                C786410Ut5.K7(viewGroup, null);
            }
            C786410Ut5.y3(tuxTextView.getViewTreeObserver(), new ViewTreeObserver.OnPreDrawListener() { // from class: X.0cDR
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    Layout layout = tuxTextView.getLayout();
                    if (layout != null) {
                        final AdDisclaimer adDisclaimer = disclaimer;
                        List<Runnable> list2 = list;
                        boolean z2 = z;
                        final Aweme aweme2 = aweme;
                        ViewGroup viewGroup2 = viewGroup;
                        final String str2 = str;
                        TuxTextView tuxTextView2 = tuxTextView;
                        final AwemeRawAd awemeRawAd2 = awemeRawAd;
                        final C19EG c19eg2 = c19eg;
                        final AutoData autoData2 = autoData;
                        int lineCount = layout.getLineCount();
                        final boolean z3 = lineCount > 0 && layout.getEllipsisCount(lineCount - 1) > 0;
                        final int i = adDisclaimer.autoDisclaimerType;
                        list2.add(z2 ? new ARunnableS27S0101000_16(i, awemeRawAd2, 20) : null);
                        if (z2 && C1017070cZd.LLLIIL(aweme2)) {
                            C786410Ut5.LJLZ(8, viewGroup2);
                        }
                        if (Intrinsics.LJFF(str2, "inventory_product_id")) {
                            C786410Ut5.D3(tuxTextView2.getViewTreeObserver(), this);
                            return true;
                        }
                        final TuxSheet tuxSheetLIZ = (C1017070cZd.LLJLIL(aweme2, str2) || z3) ? AutoAdIntroUtils.LIZLLL().LIZ(adDisclaimer, str2, i, awemeRawAd2) : null;
                        C786410Ut5.K7(viewGroup2, new View.OnClickListener() { // from class: X.0cDS
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                if (C0OBG.LIZIZ(view)) {
                                    return;
                                }
                                int size = 0;
                                if (C1017070cZd.LLJLIL(aweme2, str2)) {
                                    C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("draw_ad", "otherclick", awemeRawAd2);
                                    c1022820ciuLIZLLL.LIZJ("auto_disclaimer", "refer");
                                    c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(i), "DisclaimerType");
                                    c1022820ciuLIZLLL.LJII();
                                    C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd2);
                                    c1022820ciuLIZLLL2.LIZJ("auto_disclaimer_halfscreen", "refer");
                                    c1022820ciuLIZLLL2.LIZIZ(str2, "product_id");
                                    List<String> list3 = adDisclaimer.pidList;
                                    if (list3 != null) {
                                        size = list3.size();
                                    }
                                    c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(size), "product_counts");
                                    c1022820ciuLIZLLL2.LIZIZ(Integer.valueOf(i), "DisclaimerType");
                                    c1022820ciuLIZLLL2.LJII();
                                    TuxSheet tuxSheet = tuxSheetLIZ;
                                    if (tuxSheet != null) {
                                        tuxSheet.show(c19eg2.getSupportFragmentManager(), "auto_disclaimer");
                                        return;
                                    }
                                    return;
                                }
                                if (z3) {
                                    C1022820ciu c1022820ciuLIZLLL3 = C2184171Adz.LIZLLL("draw_ad", "otherclick", awemeRawAd2);
                                    c1022820ciuLIZLLL3.LIZJ("auto_disclaimer", "refer");
                                    c1022820ciuLIZLLL3.LIZIZ(Integer.valueOf(i), "DisclaimerType");
                                    c1022820ciuLIZLLL3.LJII();
                                    C1022820ciu c1022820ciuLIZLLL4 = C2184171Adz.LIZLLL("draw_ad", "othershow", awemeRawAd2);
                                    c1022820ciuLIZLLL4.LIZJ("auto_disclaimer_halfscreen", "refer");
                                    c1022820ciuLIZLLL4.LIZIZ(str2, "product_id");
                                    List<String> list4 = adDisclaimer.pidList;
                                    if (list4 != null) {
                                        size = list4.size();
                                    }
                                    c1022820ciuLIZLLL4.LIZIZ(Integer.valueOf(size), "product_counts");
                                    c1022820ciuLIZLLL4.LIZIZ(Integer.valueOf(i), "DisclaimerType");
                                    c1022820ciuLIZLLL4.LJII();
                                    TuxSheet tuxSheet2 = tuxSheetLIZ;
                                    if (tuxSheet2 == null) {
                                        return;
                                    }
                                    tuxSheet2.show(c19eg2.getSupportFragmentManager(), "auto_disclaimer");
                                    return;
                                }
                                C1022820ciu c1022820ciuLIZLLL5 = C2184171Adz.LIZLLL("draw_ad", "click", awemeRawAd2);
                                c1022820ciuLIZLLL5.LIZJ("auto_disclaimer", "refer");
                                c1022820ciuLIZLLL5.LIZIZ(Integer.valueOf(i), "DisclaimerType");
                                c1022820ciuLIZLLL5.LJII();
                                AutoAdIntroUtils.LIZLLL().LIZJ(c19eg2, "auto_disclaimer", autoData2.getOpenUrl(), autoData2.getWebUrl(), awemeRawAd2, false);
                            }
                        });
                    }
                    C786410Ut5.D3(tuxTextView.getViewTreeObserver(), this);
                    return true;
                }
            });
        }
    }
}
