package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.config.SearchUserFeedbackSettings;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S4400000_10;
import kotlin.jvm.internal.AwS0S4500000_10;
import kotlin.jvm.internal.AwS219S0300000_10;
import kotlin.jvm.internal.AwS411S0200000_10;

/* JADX INFO: renamed from: X.0QSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C670730QSp {
    public static final C670730QSp LIZ = new C670730QSp();

    public static void LJFF(Context context, View view) {
        if (C654380Plc.LIZ().fixRecommendWordsFeedbackToastWindow) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131845834);
            c1389890mGx.LJIIJJI();
        } else {
            Activity activityLIZ = C06MM.LIZ(context);
            if (activityLIZ == null) {
                return;
            }
            C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
            c1389890mGx2.LJIIIZ(2131845834);
            c1389890mGx2.LJIIJJI();
        }
    }

    public static void LJ(View view, boolean z, C19EG c19eg) {
        ((SearchStateViewModel) C679340Qkm.LIZ(view, c19eg).get(SearchStateViewModel.class)).setShouldBlockMediaPlay(z);
        if (C288510BSn.LIZ()) {
            C0Q3E.LJI().Ph1().LIZ(new C641690PEx(false));
        }
    }

    public static void LIZ(final View view, final Context context, Word word, C653660PkS c653660PkS, String str, String str2, String str3) {
        SearchUserFeedbackSettings.Feedback feedbackLIZ;
        String schema;
        String str4;
        String word2;
        Integer numValueOf;
        String str5;
        String id;
        String str6;
        String str7;
        String str8;
        if (C1388190mED.LIZIZ(context) != null && (feedbackLIZ = SearchUserFeedbackSettings.LIZ("textual_mistakes_feedback")) != null && (schema = feedbackLIZ.getSchema()) != null && schema.length() > 0) {
            String string = null;
            if (1 != 0) {
                String str9 = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLJJLI;
                if (str9.length() == 0 && (c653660PkS == null || (str9 = c653660PkS.LJI) == null)) {
                    str9 = "";
                }
                Pair[] pairArr = new Pair[12];
                pairArr[0] = new Pair("feedback_id", str2);
                pairArr[1] = new Pair("search_type", "textual_mistakes_feedback");
                if (c653660PkS != null) {
                    str4 = c653660PkS.LJFF;
                } else {
                    str4 = null;
                }
                pairArr[2] = new Pair("raw_query", String.valueOf(str4));
                if (word != null) {
                    word2 = word.getWord();
                } else {
                    word2 = null;
                }
                pairArr[3] = new Pair("words_content", String.valueOf(word2));
                if (word != null) {
                    numValueOf = Integer.valueOf(word.getWordPosition());
                } else {
                    numValueOf = null;
                }
                pairArr[4] = new Pair("words_position", String.valueOf(numValueOf));
                if (c653660PkS != null) {
                    str5 = c653660PkS.LJIIJJI;
                } else {
                    str5 = null;
                }
                pairArr[5] = new Pair("impr_id", String.valueOf(str5));
                if (word != null) {
                    id = word.getId();
                } else {
                    id = null;
                }
                pairArr[6] = new Pair("group_id", String.valueOf(id));
                if (c653660PkS != null) {
                    str6 = c653660PkS.LJJJJLI;
                } else {
                    str6 = null;
                }
                pairArr[7] = new Pair("enter_group_id", String.valueOf(str6));
                pairArr[8] = new Pair("words_source", str);
                pairArr[9] = new Pair("search_position", str9);
                if (c653660PkS != null) {
                    str7 = c653660PkS.LJII;
                } else {
                    str7 = null;
                }
                pairArr[10] = new Pair("sug_type", String.valueOf(str7));
                if (c653660PkS != null) {
                    str8 = c653660PkS.LJJJZ;
                } else {
                    str8 = null;
                }
                pairArr[11] = new Pair("query_recommend", String.valueOf(str8));
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                if (str3 != null) {
                    mapLJIIJ.put("words_label", str3);
                }
                Uri uri = UriProtector.parse(schema);
                if (uri != null) {
                    Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    if (builderBuildUpon != null) {
                        for (Map.Entry entry : ((LinkedHashMap) mapLJIIJ).entrySet()) {
                            if (!queryParameterNames.contains(entry.getKey())) {
                                builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        Uri uriBuild = builderBuildUpon.build();
                        if (uriBuild != null) {
                            string = uriBuild.toString();
                        }
                    }
                }
                String string2 = UriProtector.parse("aweme://webview_popup").buildUpon().appendQueryParameter("url", string).build().toString();
                C1546210qL5.LIZ.getClass();
                int iLJIILIIL = (int) (C1546210qL5.LJIILIIL(C1546210qL5.LJIIL(C1546210qL5.LJII(r3), r3), r3) * 0.95f);
                C1537900q7g c1537900q7g = C1541950qED.LIZJ;
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJLIIJ(string2);
                sparkContext.LJJJZ("gravity", "bottom");
                sparkContext.LJJJZ("height", String.valueOf(iLJIILIIL));
                sparkContext.LJJJZ("use_spark", "1");
                sparkContext.LJJJZ("enable_pull_down_close", "1");
                sparkContext.LJJJZ("show_mask", "1");
                sparkContext.LJJJZ("mask_bg_color", "00000080");
                sparkContext.LJJJZ("radius", "8");
                sparkContext.LJJJLZIJ(1, "ignore_keyboard_status_change");
                sparkContext.LJJJJLL(new AbstractC1542100qES() { // from class: X.0QSs
                    @Override // X.AbstractC1537870q7d
                    public final void onDestroy() {
                        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                        if (c19egLIZIZ != null) {
                            View view2 = view;
                            C670730QSp.LIZ.getClass();
                            C670730QSp.LJ(view2, false, c19egLIZIZ);
                        }
                    }
                });
                c1537900q7g.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.content.Context r8, com.ss.android.ugc.aweme.discover.model.suggest.Word r9, X.C653660PkS r10, java.lang.String r11, X.C0QN9 r12, java.lang.String r13, java.lang.String r14, kotlin.jvm.functions.Function1 r15) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C670730QSp.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.discover.model.suggest.Word, X.0PkS, java.lang.String, X.0QN9, java.lang.String, java.lang.String, kotlin.jvm.functions.Function1):void");
    }

    public static final void LIZIZ(View view, Context context, final C653660PkS c653660PkS, final Word word, final String str, Function0<Unit> function0, C0QN9 c0qn9, final String str2, final String str3, Function1<? super String, Unit> function1) {
        String word2;
        Integer numValueOf;
        final String strValueOf = String.valueOf(System.currentTimeMillis());
        C0QEB.LIZ.getClass();
        C670690QSl c670690QSl = new C670690QSl();
        c670690QSl.LJIIZILJ("raw_query", c653660PkS.LJFF);
        String id = null;
        if (word != null) {
            word2 = word.getWord();
        } else {
            word2 = null;
        }
        c670690QSl.LJIIZILJ("words_content", word2);
        if (word != null) {
            numValueOf = Integer.valueOf(word.getWordPosition());
        } else {
            numValueOf = null;
        }
        c670690QSl.LJJJJL(numValueOf);
        c670690QSl.LJIIZILJ("impr_id", c653660PkS.LJIIJJI);
        if (word != null) {
            id = word.getId();
        }
        c670690QSl.LJIIZILJ("group_id", id);
        c670690QSl.LJJIJLIJ(c653660PkS.LJJJJLI);
        c670690QSl.LJIIZILJ("words_source", str);
        c670690QSl.LJIIZILJ("sug_type", c653660PkS.LJII);
        if (str2 != null) {
            c670690QSl.LJ("words_label", str2);
        }
        String str4 = ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLJJLI;
        if (str4.length() == 0 && (str4 = c653660PkS.LJI) == null) {
            str4 = "";
        }
        c670690QSl.LJJJJ(str4);
        Map<String, String> mapLLLLLZ = C1ER1.LIZIZ.LLLLLZ(str3);
        if (mapLLLLLZ != null) {
            for (Map.Entry<String, String> entry : mapLLLLLZ.entrySet()) {
                String value = entry.getValue();
                if (C123100dR.LIZ(value) && value != null) {
                    c670690QSl.LJIIZILJ(entry.getKey(), entry.getValue());
                }
            }
        }
        String str5 = c653660PkS.LJJJZ;
        if (str5 != null) {
            c670690QSl.LJIIZILJ("query_recommend", str5);
        }
        C0QEB.LIZIZ(c670690QSl, c653660PkS);
        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
        c670690QSl.LJFF("feedback_id", strValueOf, c2082308Dt);
        c670690QSl.LJFF("design_type", c653660PkS.LJJIJ, c2082308Dt);
        c670690QSl.LJIILJJIL();
        new C0ZDN(context).LIZ(1);
        if (C0BQ8.LIZ()) {
            LIZ.getClass();
            SAFHelper sAFHelper = SAFHelper.LIZ;
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            sAFHelper.getClass();
            FragmentManager fragmentManagerLJIILIIL = SAFHelper.LJIILIIL(view, c19egLIZIZ);
            if (fragmentManagerLJIILIIL != null) {
                List listLJIIJJI = C1697810uHb.LJIIJJI(new C0QCC(R.raw.icon_flag, 2131849334, new AwS0S4500000_10(word, c653660PkS, str, strValueOf, str2, str3, context, c0qn9, function1, 1)), new C0QCC(R.raw.icon_heart_broken, 2131845832, new AwS0S4400000_10(word, c653660PkS, str, strValueOf, str2, str3, view, context, 2)), new C0QCC(R.raw.icon_text_stroke, 2131845833, new AwS0S4400000_10(word, c653660PkS, str, strValueOf, str2, str3, view, context, 3)));
                C0QCA c0qca = C0QCA.LIZ;
                AwS411S0200000_10 awS411S0200000_10 = new AwS411S0200000_10(context, view, 116);
                C670770QSt c670770QSt = new C670770QSt(word, c653660PkS, str, strValueOf, str2, str3);
                AwS219S0300000_10 awS219S0300000_10 = new AwS219S0300000_10(context, view, function0, 29);
                c0qca.getClass();
                C0QCA.LIZ(fragmentManagerLJIILIIL, listLJIIJJI, awS411S0200000_10, c670770QSt, awS219S0300000_10);
                return;
            }
            return;
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247530iZL c1247530iZL = new C1247530iZL();
        c1247530iZL.LIZJ(R.raw.icon_flag);
        c1247530iZL.LIZIZ(2131849334);
        c1247530iZL.LIZ(new AwS0S4500000_10(word, c653660PkS, str, strValueOf, str2, str3, context, c0qn9, function1, 0));
        C1247530iZL c1247530iZL2 = new C1247530iZL();
        c1247530iZL2.LIZJ(R.raw.icon_heart_broken);
        c1247530iZL2.LIZIZ(2131845832);
        c1247530iZL2.LIZ(new AwS0S4400000_10(word, c653660PkS, str, strValueOf, str2, str3, view, context, 0));
        C1247530iZL c1247530iZL3 = new C1247530iZL();
        c1247530iZL3.LIZJ(R.raw.icon_text_stroke);
        c1247530iZL3.LIZIZ(2131845833);
        c1247530iZL3.LIZ(new AwS0S4400000_10(word, c653660PkS, str, strValueOf, str2, str3, view, context, 1));
        c1390850mIV.LIZ(c1247530iZL, c1247530iZL2, c1247530iZL3);
        DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: X.0QSr
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C0QEB c0qeb = C0QEB.LIZ;
                Word word3 = word;
                C653660PkS c653660PkS2 = c653660PkS;
                String value2 = EnumC670740QSq.CANCEL.getValue();
                String str6 = str;
                String str7 = strValueOf;
                String str8 = str2;
                String str9 = str3;
                c0qeb.getClass();
                C0QEB.LIZJ(word3, c653660PkS2, value2, str6, str7, str8, str9);
            }
        };
        TuxActionSheet tuxActionSheet = c1390850mIV.LIZ;
        tuxActionSheet.LL = onCancelListener;
        tuxActionSheet.LLILLJJLI = new C0R4B(context, view, function0, 0);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        SAFHelper sAFHelper2 = SAFHelper.LIZ;
        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
        sAFHelper2.getClass();
        FragmentManager fragmentManagerLJIILIIL2 = SAFHelper.LJIILIIL(view, c19egLIZIZ2);
        if (fragmentManagerLJIILIIL2 != null) {
            tuxActionSheetLIZJ.show(fragmentManagerLJIILIIL2, "RecommendWordsFeedbackSheet");
        }
        C19EG c19egLIZIZ3 = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ3 != null) {
            LIZ.getClass();
            LJ(view, true, c19egLIZIZ3);
        }
    }
}
