package X;

import Y.ACListenerS145S0100000_10;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.ecommerce.model.EcFeedSuggestWordList;
import com.ss.android.ugc.aweme.ecommerce.model.EcSuggestWordStruct;
import com.ss.android.ugc.aweme.ecommerce.model.EcWordStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qa2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C672680Qa2 extends ConstraintLayout implements InterfaceC672780QaC {
    public final Aweme LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final long LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public View LLIZLLLIL;
    public LinearLayout LLJ;
    public LinearLayout LLJI;
    public final String LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final EnumC672720Qa6 LLJILLL;

    @Override // X.C0QY2
    public final void Aj() {
    }

    @Override // X.C0QY2
    public final boolean Gc(C0QYL c0qyl, Function1<? super Boolean, Unit> function1) {
        return false;
    }

    @Override // X.C0QY2
    public final void Rm(int i, int i2, int i3, int i4, int i5) {
    }

    @Override // X.C0QY2
    public final void dn(AwS589S0100000_10 awS589S0100000_10) {
    }

    @Override // X.C0QY2
    public final void ei(C0QW4 c0qw4) {
    }

    @Override // X.C0QY2
    public final void f7() {
    }

    @Override // X.C0QY2
    public final void fc(Long l) {
    }

    @Override // X.C0QY2
    public final void gw(EnumC671640QWc enumC671640QWc) {
    }

    @Override // X.C0QY2
    public final void rj() {
    }

    public void setIconBackgroundAlpha(int i) {
    }

    public void setIconTintColorRes(int i) {
    }

    public final void e0() {
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(getContext(), "//search");
        smartRouteBuildRoute.withParam("in_single_stack", true);
        smartRouteBuildRoute.withParam("keyword", this.LLJILJIL);
        smartRouteBuildRoute.withParam("group_id", this.LL.getAid());
        smartRouteBuildRoute.withParam("set_hint_by_sug_word", false);
        smartRouteBuildRoute.withParam("enter_from", this.LLILLJJLI);
        EnumC669620QOi enumC669620QOi = EnumC669620QOi.SHOP;
        smartRouteBuildRoute.withParam("target_tab", enumC669620QOi.getTabName());
        smartRouteBuildRoute.withParam("enter_method", "comment_related_search");
        smartRouteBuildRoute.withParam("root_enter_from_type", C0QXR.COMMENT_TOP_ANCHOR.getValue());
        smartRouteBuildRoute.withParam("single_tab_type", enumC669620QOi.getTabName());
        smartRouteBuildRoute.withParam("back_flag", 1);
        smartRouteBuildRoute.withParam("search_hint_word", this.LLJILJIL);
        int i = C1742080vR0.LIZ;
        smartRouteBuildRoute.withParam("traffic_source_list", C1742080vR0.LJIIIIZZ(this.LL));
        smartRouteBuildRoute.open();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        String imprId;
        super.onAttachedToWindow();
        C672700Qa4 c672700Qa4 = InterfaceC672780QaC.LJJJLZIJ;
        String str = this.LLILLJJLI;
        String str2 = this.LLJILJIL;
        String str3 = this.LLJILJILJ;
        LogPbBean logPbBean = this.LL.getLogPbBean();
        if (logPbBean == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        String groupId = this.LL.getGroupId();
        String str4 = groupId != null ? groupId : "";
        EnumC672720Qa6 enumC672720Qa6 = this.LLJILLL;
        String str5 = (enumC672720Qa6 == null || C672740Qa8.LIZ[enumC672720Qa6.ordinal()] != 1) ? CardStruct.IStatusCode.DEFAULT : "1";
        c672700Qa4.getClass();
        C672700Qa4.LIZIZ("comment_related_search", str2, str, str3, imprId, str4, str5);
    }

    @Override // X.C0QY2
    public EnumC671980QXk getEntranceViewType() {
        return EnumC671980QXk.RELATED;
    }

    public C672680Qa2(Context context, Aweme aweme, String str, String str2, boolean z, long j) {
        List<EcSuggestWordStruct> suggestWords;
        EcWordStruct ecWordStruct;
        String wordId;
        EcWordStruct ecWordStruct2;
        String word;
        super(context);
        this.LL = aweme;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = z;
        this.LLILZIL = j;
        this.LLJIJIL = "";
        this.LLJILJIL = "";
        this.LLJILJILJ = "";
        EcFeedSuggestWordList ecFeedSuggestWordList = aweme.getEcFeedSuggestWordList();
        if (ecFeedSuggestWordList != null && (suggestWords = ecFeedSuggestWordList.getSuggestWords()) != null) {
            for (EcSuggestWordStruct ecSuggestWordStruct : suggestWords) {
                if (ecSuggestWordStruct != null && Intrinsics.LJFF("comment_top", ecSuggestWordStruct.getScene())) {
                    List<EcWordStruct> words = ecSuggestWordStruct.getWords();
                    this.LLJILJIL = (words == null || (ecWordStruct2 = (EcWordStruct) C13LP.LJJJLL(words)) == null || (word = ecWordStruct2.getWord()) == null) ? "" : word;
                    List<EcWordStruct> words2 = ecSuggestWordStruct.getWords();
                    this.LLJILJILJ = (words2 == null || (ecWordStruct = (EcWordStruct) C13LP.LJJJLL(words2)) == null || (wordId = ecWordStruct.getWordId()) == null) ? "" : wordId;
                    String hintText = ecSuggestWordStruct.getHintText();
                    this.LLJIJIL = hintText == null ? "" : hintText;
                    Integer redirectPage = ecSuggestWordStruct.getRedirectPage();
                    if (redirectPage != null) {
                        int iIntValue = redirectPage.intValue();
                        EnumC672720Qa6.Companion.getClass();
                        EnumC672720Qa6 enumC672720Qa6 = EnumC672720Qa6.MAP.get(Integer.valueOf(iIntValue));
                        if (enumC672720Qa6 != null) {
                            this.LLJILLL = enumC672720Qa6;
                        }
                    }
                }
            }
        }
        if (!C0CNZ.LIZIZ() || C20673215v0.LJFF(context, context, R.layout.bqk, this, true) == null) {
            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bqk, this, true);
        }
        this.LLILZLL = (TuxTextView) findViewById(R.id.jhk);
        this.LLIZ = (TuxTextView) findViewById(R.id.m37);
        this.LLIZLLLIL = findViewById(R.id.moq);
        this.LLJ = (LinearLayout) findViewById(R.id.m6p);
        this.LLJI = (LinearLayout) findViewById(R.id.g21);
        SearchSecurityControlConfig.LIZ.getClass();
        if (SearchSecurityControlConfig.LIZIZ().disableSuggestWords) {
            LinearLayout linearLayout = this.LLJ;
            C786410Ut5.LJZL(8, linearLayout != null ? linearLayout : null);
            return;
        }
        TuxTextView tuxTextView = this.LLILZLL;
        C786410Ut5.LLLLZLL(tuxTextView == null ? null : tuxTextView, 0);
        TuxTextView tuxTextView2 = this.LLIZ;
        C786410Ut5.LLLLZLL(tuxTextView2 == null ? null : tuxTextView2, 0);
        TuxTextView tuxTextView3 = this.LLILZLL;
        if ((tuxTextView3 == null ? null : tuxTextView3).getVisibility() == 0) {
            TuxTextView tuxTextView4 = this.LLIZ;
            if ((tuxTextView4 == null ? null : tuxTextView4).getVisibility() == 0) {
                TuxTextView tuxTextView5 = this.LLILZLL;
                tuxTextView5 = tuxTextView5 == null ? null : tuxTextView5;
                C1360520lVa c1360520lVa = new C1360520lVa();
                c1360520lVa.LIZLLL(this.LLJIJIL);
                tuxTextView5.setText(new C444910HcX(c1360520lVa.LIZ));
                TuxTextView tuxTextView6 = this.LLIZ;
                tuxTextView6 = tuxTextView6 == null ? null : tuxTextView6;
                C1360520lVa c1360520lVa2 = new C1360520lVa();
                c1360520lVa2.LIZLLL(this.LLJILJIL);
                tuxTextView6.setText(new C444910HcX(c1360520lVa2.LIZ));
            }
        }
        ACListenerS145S0100000_10 aCListenerS145S0100000_10 = new ACListenerS145S0100000_10(this, 88);
        TuxTextView tuxTextView7 = this.LLIZ;
        C427690Gpr.LJI(tuxTextView7 == null ? null : tuxTextView7, null);
        TuxTextView tuxTextView8 = this.LLIZ;
        C786410Ut5.h9(tuxTextView8 == null ? null : tuxTextView8, aCListenerS145S0100000_10);
        if (!this.LLILZ) {
            return;
        }
        LinearLayout linearLayout2 = this.LLJI;
        C426750GoL.LJIIIZ(linearLayout2 == null ? null : linearLayout2, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(4.5d)))), false, 21);
        View view = this.LLIZLLLIL;
        C786410Ut5.LJLLLLLL(8, view != null ? view : null);
    }
}
