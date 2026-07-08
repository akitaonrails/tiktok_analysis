package X;

import Y.ARunnableS102S0100000_2;
import Y.ARunnableS110S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.search.model.RichHisInfo;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.pages.middlepage.config.NewPostLimitConfig;
import com.ss.android.ugc.aweme.search.pages.middlepage.historytag.ui.HistoryLiveLottieDrawable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.AwS78S1300000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C668360QJm extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJJJ = 0;
    public final int LL;
    public String LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public final TuxTextView LLILZLL;
    public final C21415018rM LLIZ;
    public final TuxIconView LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final TuxIconDrawable LLJILJILJ;
    public final TuxIconDrawable LLJILLL;
    public final HistoryLiveLottieDrawable LLJJ;
    public final C0QF6 LLJJI;
    public SearchHistory LLJJIII;
    public long LLJJIJI;
    public String LLJJIJIIJIL;
    public AnonymousClass0956 LLJJIJIL;

    public final int L5() {
        return ((Number) this.LLJI.getValue()).intValue();
    }

    public final void P5() throws Throwable {
        String str;
        Map<String, Integer> map = C0QGT.LIZ;
        SearchHistory searchHistory = this.LLJJIII;
        if (searchHistory == null || (str = searchHistory.keyword) == null) {
            str = "";
        }
        C0QGT.LIZIZ(Integer.valueOf(getLayoutPosition()), str);
        SearchHistory searchHistory2 = this.LLJJIII;
        if (searchHistory2 == null) {
            return;
        }
        String str2 = searchHistory2.musicId;
        if (str2 == null || str2.length() == 0) {
            C1ER1.LIZIZ.LLJJJJJIL(this.LLJJIJI, "search_history", false);
        }
        String string = UUID.randomUUID().toString();
        if (!C123100dR.LIZ(str2)) {
            N5(string, searchHistory2.keyword, false);
        } else if (Intrinsics.LJFF(str2, this.LLILZ)) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
            C19EG c19egLIZ = C657990PrR.LIZ(this.itemView);
            sAFHelper.getClass();
            SAFHelper.LIZJ(fragmentLIZ, c19egLIZ);
        } else {
            String string2 = UUID.randomUUID().toString();
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.itemView.getContext(), "//music/detail");
            smartRouteBuildRoute.withParam(FollowStatusChangeMethod.PARAM_UID, str2);
            smartRouteBuildRoute.withParam("extra_music_from", "search_keyword_page");
            smartRouteBuildRoute.withParam("enter_method", "click_search_history");
            String str3 = searchHistory2.keyword;
            if (str3 == null) {
                str3 = "";
            }
            smartRouteBuildRoute.withParam("previous_search_query", str3);
            smartRouteBuildRoute.withParam("process_id", string2);
            smartRouteBuildRoute.withParam("send_enter_mob", true);
            smartRouteBuildRoute.open(0, new OnActivityResultCallback() { // from class: X.0QK6
                @Override // com.bytedance.router.OnActivityResultCallback
                public final void onActivityResult(int i, int i2, Intent intent) {
                    C1440005kM.LIZ(new C0QKC());
                }
            });
        }
        String str4 = this.LLILLJJLI;
        String str5 = this.LLILLL;
        String str6 = searchHistory2.keyword;
        if (str6 == null) {
            str6 = "";
        }
        Integer numValueOf = Integer.valueOf(getLayoutPosition());
        String strLIZ = C668490QJz.LIZ(searchHistory2, this.itemView);
        String str7 = searchHistory2.enterMethod;
        Long lValueOf = Long.valueOf(searchHistory2.timestamp);
        boolean z = searchHistory2.musicId != null;
        getLayoutPosition();
        String str8 = searchHistory2.musicId;
        C668020QIe.LIZIZ(str4, str5, "click", str6, numValueOf, string, strLIZ, str7, lValueOf, z, str8 != null ? str8 : "", searchHistory2.isOriginalMusic ? "1" : CardStruct.IStatusCode.DEFAULT, false, !searchHistory2.LIZIZ(), this.LLJJIJIIJIL, searchHistory2.LIZJ(Integer.valueOf(L5())), 8192);
        if (C07IU.LIZ()) {
            String str9 = searchHistory2.keyword;
            if (str9 != null) {
                C668120QIo.LIZJ.add(str9);
            } else {
                NewPostLimitConfig newPostLimitConfig = C668120QIo.LIZ;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C668360QJm(final android.view.View r6) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C668360QJm.<init>(android.view.View):void");
    }

    public final void N5(String str, String str2, boolean z) throws Throwable {
        HashMap<String, String> map;
        String strLIZ;
        SearchHistory searchHistory;
        Integer numLIZ;
        SearchHistory searchHistory2;
        int iIntValue;
        HashMap<Integer, Boolean> map2;
        Boolean bool;
        RichHisInfo richHisInfo;
        String str3;
        C0Q3W c0q3w = C0Q3W.LIZ;
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        Context context = this.itemView.getContext();
        int iIntValue2 = 0;
        String strLIZJ = null;
        if (C301310BrV.LIZ() && (searchHistory2 = this.LLJJIII) != null) {
            SAFHelper sAFHelper = SAFHelper.LIZ;
            View view = this.itemView;
            Activity activityLIZ = C1388190mED.LIZ(view.getContext());
            sAFHelper.getClass();
            Integer numLJJIJIIJIL = SAFHelper.LJJIJIIJIL(activityLIZ, view);
            if (numLJJIJIIJIL != null) {
                iIntValue = numLJJIJIIJIL.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (C07IV.LIZ && (map2 = searchHistory2.LIZIZ) != null && searchHistory2.LIZJ != null && (((bool = map2.get(numValueOf)) != null && bool.booleanValue()) || ((richHisInfo = searchHistory2.LIZJ.get(numValueOf)) != null && (!Objects.equals(richHisInfo.iconType, searchHistory2.historySearchIntentType) || (C668120QIo.LIZ(searchHistory2.keyword) && (str3 = richHisInfo.subTitle) != null && !str3.isEmpty()))))) {
                map = null;
            } else {
                map = searchHistory2.searchExtraParams;
            }
        } else {
            map = null;
        }
        if (C301310BrV.LIZ()) {
            SearchHistory searchHistory3 = this.LLJJIII;
            View view2 = this.itemView;
            if (searchHistory3 != null) {
                SAFHelper sAFHelper2 = SAFHelper.LIZ;
                Activity activityLIZ2 = C1388190mED.LIZ(view2.getContext());
                sAFHelper2.getClass();
                Integer numLJJIJIIJIL2 = SAFHelper.LJJIJIIJIL(activityLIZ2, view2);
                if (numLJJIJIIJIL2 != null) {
                    iIntValue2 = numLJJIJIIJIL2.intValue();
                }
                numLIZ = searchHistory3.LIZ(Integer.valueOf(iIntValue2));
            } else {
                numLIZ = null;
            }
            strLIZ = C668460QJw.LIZ(numLIZ);
        } else {
            strLIZ = null;
        }
        if (C07IU.LIZ() && (searchHistory = this.LLJJIII) != null) {
            strLIZJ = searchHistory.LIZJ(Integer.valueOf(L5()));
        }
        C0Q3W.LIZIZ(c0q3w, fragmentLIZ, context, str, str2, z, false, map, strLIZ, strLIZJ, 32);
    }

    public final void I5(SearchHistory searchHistory, String str, String str2, String str3, String str4) {
        String str5;
        C437310HCv c437310HCv;
        int iIntValue;
        int value;
        C437310HCv c437310HCv2;
        C419910GdJ c419910GdJ;
        TuxIconDrawable tuxIconDrawable;
        AnonymousClass0956 anonymousClass0956LIZLLL;
        LifecycleCoroutineScope lifecycleScope;
        this.LLJJIII = searchHistory;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLJJIJIIJIL = str4;
        if (searchHistory == null || (str5 = searchHistory.keyword) == null) {
            str5 = "";
        }
        SpannableString spannableString = new SpannableString(str5);
        String str6 = null;
        if (C0BRA.LIZJ()) {
            AwS78S1300000_10 awS78S1300000_10 = new AwS78S1300000_10(searchHistory, this, str5, spannableString, 2);
            if (C07IV.LIZ) {
                AnonymousClass0956 anonymousClass0956 = this.LLJJIJIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                Fragment fragmentLIZ = C0PHE.LIZ(this.itemView);
                if (fragmentLIZ != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentLIZ)) != null) {
                    anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, C0PEM.LIZJ, null, new C1312705Bt(awS78S1300000_10, null), 2);
                } else {
                    anonymousClass0956LIZLLL = null;
                }
                this.LLJJIJIL = anonymousClass0956LIZLLL;
            } else {
                C823050WQl.LIZLLL().execute(new ARunnableS102S0100000_2(awS78S1300000_10, 69));
            }
        } else if (!C301310BrV.LIZ() && !C07IV.LIZ) {
            TuxTextView tuxTextView = this.LLILZLL;
            if (tuxTextView != null) {
                tuxTextView.setText(spannableString);
            }
        } else if (C668410QJr.LIZ(searchHistory, this.itemView)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            C426490Gnv.LIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), spannableStringBuilder);
            SAFHelper sAFHelper = SAFHelper.LIZ;
            View view = this.itemView;
            Activity activityLIZ = C1388190mED.LIZ(view.getContext());
            sAFHelper.getClass();
            Integer numLJJIJIIJIL = SAFHelper.LJJIJIIJIL(activityLIZ, view);
            if (numLJJIJIIJIL != null) {
                iIntValue = numLJJIJIIJIL.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLIZ = searchHistory.LIZ(Integer.valueOf(iIntValue));
            if (numLIZ != null) {
                value = numLIZ.intValue();
            } else {
                value = EnumC644330PPb.NONE.getValue();
            }
            if (((Number) C07IT.LIZ.getValue()).intValue() == 2 && value == EnumC644330PPb.LIVE.getValue()) {
                HistoryLiveLottieDrawable historyLiveLottieDrawable = this.LLJJ;
                if (!(historyLiveLottieDrawable instanceof Drawable)) {
                    historyLiveLottieDrawable = null;
                }
                C668370QJn.LIZ(spannableStringBuilder, historyLiveLottieDrawable, this.itemView.getContext());
                HistoryLiveLottieDrawable historyLiveLottieDrawable2 = this.LLJJ;
                if (historyLiveLottieDrawable2 != null) {
                    historyLiveLottieDrawable2.onVisibilityChanged(true);
                }
            } else {
                C668370QJn.LIZIZ(spannableStringBuilder, C668370QJn.LJI(value), this.itemView.getContext());
            }
            TuxTextView tuxTextView2 = this.LLILZLL;
            if ((tuxTextView2 instanceof C437310HCv) && (c437310HCv2 = (C437310HCv) tuxTextView2) != null) {
                C437310HCv.LJJJJLL(c437310HCv2, spannableString, spannableStringBuilder, true, 2);
            }
        } else {
            TuxTextView tuxTextView3 = this.LLILZLL;
            if ((tuxTextView3 instanceof C437310HCv) && (c437310HCv = (C437310HCv) tuxTextView3) != null) {
                C437310HCv.LJJJJLL(c437310HCv, spannableString, null, false, 6);
            }
        }
        if (C0BRA.LIZIZ()) {
            SearchHistory searchHistory2 = this.LLJJIII;
            if (searchHistory2 != null) {
                str6 = searchHistory2.musicId;
            }
            if (C123100dR.LIZ(str6)) {
                tuxIconDrawable = this.LLJILJILJ;
            } else {
                tuxIconDrawable = this.LLJILLL;
            }
            TuxIconView tuxIconView = this.LLIZLLLIL;
            if (tuxIconView != null) {
                tuxIconView.setImageDrawable(tuxIconDrawable);
            }
        } else {
            SearchHistory searchHistory3 = this.LLJJIII;
            if (searchHistory3 != null) {
                str6 = searchHistory3.musicId;
            }
            if (C123100dR.LIZ(str6)) {
                c419910GdJ = (C419910GdJ) this.LLJIJIL.getValue();
            } else {
                c419910GdJ = (C419910GdJ) this.LLJILJIL.getValue();
            }
            TuxIconView tuxIconView2 = this.LLIZLLLIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setTuxIcon(c419910GdJ);
            }
        }
        if (!this.LLILZIL) {
            this.LLILZIL = true;
            HandlerHook.viewPost(this.itemView, new ARunnableS110S0100000_10(this, 141));
        }
    }
}
