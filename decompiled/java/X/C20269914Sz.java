package X;

import Y.ACListenerS164S0100000_30;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.TakoStruct;
import com.ss.android.ugc.aweme.feed.model.TakoSugWordList;
import com.ss.android.ugc.aweme.tako.detail.related.TakoRelatedWordExtPassInfo;
import com.ss.android.ugc.aweme.tako.model.FeedEnterAwemeInfo;
import com.ss.android.ugc.aweme.tako.model.SuggestionWordInfo;
import com.ss.android.ugc.aweme.tako.otherpage.feed.banner.TakoAITemplates;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS265S0300000_21;
import kotlin.jvm.internal.AwS574S0100000_30;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wh6.AbS709S0100000_30;

/* JADX INFO: renamed from: X.14Sz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20269914Sz extends ConstraintLayout {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxIconView LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxIconView LLJ;
    public final String LLJI;
    public final String LLJIJIL;
    public final C01GW LLJILJIL;

    public final TakoRelatedWordExtPassInfo getExtPassInfo() {
        return (TakoRelatedWordExtPassInfo) this.LLJILJIL.getValue();
    }

    public C20269914Sz(Context context, Aweme aweme, String str, String str2, AwS265S0300000_21 awS265S0300000_21) throws JSONException {
        String strLJII;
        TakoRelatedWordExtPassInfo extPassInfo;
        TakoRelatedWordExtPassInfo extPassInfo2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        List<TakoAITemplates> list;
        int iIntValue;
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        TakoStruct tako;
        ContentModel contentModel2;
        StandardBusinessModel standardBusinessModel2;
        TakoStruct tako2;
        StandardBusinessModel standardBusinessModel3;
        TakoStruct tako3;
        List<TakoSugWordList> list2;
        TakoSugWordList takoSugWordList;
        String str9;
        StandardBusinessModel standardBusinessModel4;
        TakoStruct tako4;
        List<TakoSugWordList> list3;
        TakoSugWordList takoSugWordList2;
        super(context);
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = awS265S0300000_21;
        this.LLJI = "";
        this.LLJIJIL = "";
        this.LLJILJIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 450));
        ContentModel contentModel3 = aweme.getContentModel();
        String str10 = (contentModel3 == null || (standardBusinessModel4 = contentModel3.standardBusinessModel) == null || (tako4 = standardBusinessModel4.getTako()) == null || (list3 = tako4.sugWordList) == null || (takoSugWordList2 = (TakoSugWordList) C13LP.LJJJLL(list3)) == null || (str10 = takoSugWordList2.word) == null) ? "" : str10;
        this.LLJI = str10;
        ContentModel contentModel4 = aweme.getContentModel();
        this.LLJIJIL = (contentModel4 == null || (standardBusinessModel3 = contentModel4.standardBusinessModel) == null || (tako3 = standardBusinessModel3.getTako()) == null || (list2 = tako3.sugWordList) == null || (takoSugWordList = (TakoSugWordList) C13LP.LJJJLL(list2)) == null || (str9 = takoSugWordList.extPass) == null) ? "" : str9;
        if (!C0CNZ.LIZIZ() || C20673215v0.LJFF(context, context, R.layout.fnw, this, true) == null) {
            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fnw, this, true);
        }
        this.LLILZIL = (TuxTextView) findViewById(R.id.jhk);
        this.LLILZLL = (TuxTextView) findViewById(R.id.m37);
        this.LLIZ = (TuxIconView) findViewById(R.id.jws);
        findViewById(R.id.m6p);
        this.LLIZLLLIL = (TuxIconView) findViewById(R.id.jwr);
        findViewById(R.id.g21);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.jx4);
        this.LLJ = tuxIconView;
        if (tuxIconView != null && C0QSF.LIZ() && !((Boolean) C07EL.LIZ.getValue()).booleanValue()) {
            tuxIconView.setTuxIcon(C14TF.LIZIZ.LJJLIIIJ().LIZ(Integer.valueOf(R.attr.a1k), null, null, null, ((Boolean) C04WE.LIZ.getValue()).booleanValue()));
        }
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        int iLIZ = C07IL.LIZ();
        if (iLIZ != 1 && iLIZ != 2) {
            strLJII = "";
        } else {
            strLJII = C1857750yRZ.LJII(2131849646);
            TuxIconView tuxIconView2 = this.LLJ;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
            }
            TuxIconView tuxIconView3 = this.LLIZLLLIL;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
            }
            TuxIconView tuxIconView4 = this.LLIZ;
            if (tuxIconView4 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
            }
        }
        if (((Boolean) C0AXH.LIZ.getValue()).booleanValue() && ((contentModel2 = aweme.getContentModel()) == null || (standardBusinessModel2 = contentModel2.standardBusinessModel) == null || (tako2 = standardBusinessModel2.getTako()) == null || (strLJII = tako2.wordHint) == null || strLJII.length() <= 0)) {
            strLJII = C1857750yRZ.LJII(2131849640);
        }
        TakoRelatedWordExtPassInfo extPassInfo3 = getExtPassInfo();
        if (((extPassInfo3 != null && extPassInfo3.LJ()) || ((extPassInfo = getExtPassInfo()) != null && extPassInfo.LJFF())) && ((contentModel = aweme.getContentModel()) == null || (standardBusinessModel = contentModel.standardBusinessModel) == null || (tako = standardBusinessModel.getTako()) == null || (strLJII = tako.wordHint) == null || strLJII.length() <= 0)) {
            strLJII = C1857750yRZ.LJII(2131822451);
        }
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 0);
            C1360520lVa c1360520lVa = new C1360520lVa();
            c1360520lVa.LIZLLL(strLJII);
            C444910HcX c444910HcX = new C444910HcX(c1360520lVa.LIZ);
            c444910HcX.LIZ(52);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1k, tuxTextView2.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            C786410Ut5.s2(c444910HcX, new ForegroundColorSpan(iIntValue), 0, c444910HcX.length(), 33);
            tuxTextView2.setText(c444910HcX);
        }
        TuxTextView tuxTextView3 = this.LLILZLL;
        if (tuxTextView3 != null) {
            C1360520lVa c1360520lVa2 = new C1360520lVa();
            c1360520lVa2.LIZLLL(str10);
            tuxTextView3.setText(new C444910HcX(c1360520lVa2.LIZ));
            tuxTextView3.setTuxFont(52);
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1n, getContext());
        if (numLIZJ2 != null) {
            int iIntValue2 = numLIZJ2.intValue();
            TuxTextView tuxTextView4 = this.LLILZLL;
            if (tuxTextView4 != null) {
                tuxTextView4.setTextColor(iIntValue2);
            }
            TuxIconView tuxIconView5 = this.LLIZLLLIL;
            if (tuxIconView5 != null) {
                tuxIconView5.setTintColor(iIntValue2);
            }
            TuxIconView tuxIconView6 = this.LLIZ;
            if (tuxIconView6 != null) {
                tuxIconView6.setTintColor(iIntValue2);
            }
        }
        JSONArray jSONArray = new JSONArray();
        TakoRelatedWordExtPassInfo extPassInfo4 = getExtPassInfo();
        if (extPassInfo4 != null && (list = extPassInfo4.aiTemplates) != null) {
            for (TakoAITemplates takoAITemplates : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", takoAITemplates.templateId);
                jSONObject.put("mode", "create_image");
                jSONObject.put("template_type", "image_2_image");
                jSONArray.put(jSONObject);
            }
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String strLJIJJLI = C14TF.LIZIZ.LJIJJLI(this.LLILLJJLI);
        TakoRelatedWordExtPassInfo extPassInfo5 = getExtPassInfo();
        if ((extPassInfo5 != null && extPassInfo5.LJ()) || ((extPassInfo2 = getExtPassInfo()) != null && extPassInfo2.LJFF())) {
            str3 = "comment_related_word_generate";
        } else {
            str3 = "comment_related_word";
        }
        String aid = this.LL.getAid();
        String str11 = aid != null ? aid : "";
        String str12 = this.LLILLL;
        String str13 = this.LLJI;
        String str14 = this.LLJIJIL;
        TakoRelatedWordExtPassInfo extPassInfo6 = getExtPassInfo();
        if (extPassInfo6 != null) {
            str4 = extPassInfo6.wordId;
        } else {
            str4 = null;
        }
        TakoRelatedWordExtPassInfo extPassInfo7 = getExtPassInfo();
        if (extPassInfo7 != null) {
            str5 = extPassInfo7.imprId;
        } else {
            str5 = null;
        }
        TakoRelatedWordExtPassInfo extPassInfo8 = getExtPassInfo();
        if (extPassInfo8 != null) {
            str6 = extPassInfo8.recallInfo;
        } else {
            str6 = null;
        }
        TakoRelatedWordExtPassInfo extPassInfo9 = getExtPassInfo();
        if (extPassInfo9 != null) {
            str7 = extPassInfo9.searchIntent;
        } else {
            str7 = null;
        }
        TakoRelatedWordExtPassInfo extPassInfo10 = getExtPassInfo();
        if (extPassInfo10 != null) {
            str8 = extPassInfo10.takoIntent;
        } else {
            str8 = null;
        }
        SuggestionWordInfo suggestionWordInfo = new SuggestionWordInfo(null, null, null, null, str4, str5, str6, str7, str8);
        FeedEnterAwemeInfo feedEnterAwemeInfo = new FeedEnterAwemeInfo(this.LL.getAid(), String.valueOf(this.LL.getAwemeType()), null, null);
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("template_info", jSONArray);
        TakoRelatedWordExtPassInfo extPassInfo11 = getExtPassInfo();
        pairArr[1] = new Pair("qrec_json_info", extPassInfo11 != null ? extPassInfo11.qrecJsonInfo : null);
        c1862330yYx.mobTikbotEntranceShow(strLJIJJLI, str3, str11, str12, false, null, null, null, str13, null, str14, null, null, suggestionWordInfo, feedEnterAwemeInfo, null, null, null, null, null, null, C2097608Jq.LJIIJ(pairArr), false);
        ACListenerS164S0100000_30 aCListenerS164S0100000_30 = new ACListenerS164S0100000_30(this, 48);
        if (((Boolean) C0B1B.LIZ.getValue()).booleanValue()) {
            TuxTextView tuxTextView5 = this.LLILZLL;
            if (tuxTextView5 != null) {
                C786410Ut5.I7(new AbS709S0100000_30(aCListenerS164S0100000_30, 6), tuxTextView5);
            }
            TuxIconView tuxIconView7 = this.LLIZLLLIL;
            if (tuxIconView7 != null) {
                C786410Ut5.I7(new AbS709S0100000_30(aCListenerS164S0100000_30, 7), tuxIconView7);
            }
            TuxTextView tuxTextView6 = this.LLILZIL;
            if (tuxTextView6 != null) {
                C786410Ut5.I7(new AbS709S0100000_30(aCListenerS164S0100000_30, 8), tuxTextView6);
            }
            TuxIconView tuxIconView8 = this.LLIZ;
            if (tuxIconView8 != null) {
                C786410Ut5.I7(new AbS709S0100000_30(aCListenerS164S0100000_30, 9), tuxIconView8);
                return;
            }
            return;
        }
        TuxTextView tuxTextView7 = this.LLILZLL;
        if (tuxTextView7 != null) {
            C786410Ut5.h9(tuxTextView7, aCListenerS164S0100000_30);
        }
        TuxIconView tuxIconView9 = this.LLIZLLLIL;
        if (tuxIconView9 != null) {
            C786410Ut5.a9(tuxIconView9, aCListenerS164S0100000_30);
        }
        TuxTextView tuxTextView8 = this.LLILZIL;
        if (tuxTextView8 != null) {
            C786410Ut5.h9(tuxTextView8, aCListenerS164S0100000_30);
        }
        TuxIconView tuxIconView10 = this.LLIZ;
        if (tuxIconView10 == null) {
            return;
        }
        C786410Ut5.a9(tuxIconView10, aCListenerS164S0100000_30);
    }
}
