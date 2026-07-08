package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.discover.model.FeedbackContents;
import com.ss.android.ugc.aweme.discover.model.FeedbackMultipleChoice;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalDetailFragment;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.ui.SearchFeedbackOptionalFragment;
import com.ss.android.ugc.aweme.search.pages.result.core.model.SearchDislikeAdLogRequest;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS169S0400000_10;
import kotlin.jvm.internal.AwS45S0500000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684120QsU {
    public static List LIZLLL(String str) {
        FeedbackContents[] feedbackContentsArr;
        String feedbackType;
        if (str == null || (feedbackContentsArr = (FeedbackContents[]) SettingsManager.LIZLLL().LJIIIIZZ("search_single_feedback_survey", FeedbackContents[].class, null)) == null) {
            return null;
        }
        for (FeedbackContents feedbackContents : feedbackContentsArr) {
            if (feedbackContents != null) {
                feedbackType = feedbackContents.getFeedbackType();
            } else {
                feedbackType = null;
            }
            if (Intrinsics.LJFF(feedbackType, str)) {
                if (feedbackContents == null) {
                    return null;
                }
                return feedbackContents.getMultipleChoices();
            }
        }
        return null;
    }

    public static Map LIZJ(C683220Qr2 c683220Qr2, ISearchContextAbility iSearchContextAbility) {
        String str;
        String str2;
        String str3;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        C0PCY<C0PRC> c0pcyPh12;
        C0PRC c0prc2;
        Map<String, String> map;
        Map<String, String> map2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c683220Qr2 != null && (map2 = c683220Qr2.LJ) != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                if (!Intrinsics.LJFF(entry.getKey(), "enter_from")) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        String str4 = null;
        if (c683220Qr2 != null && (map = c683220Qr2.LJ) != null) {
            str = map.get("enter_from");
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "general_search")) {
            str2 = "general_search_list";
        } else if (Intrinsics.LJFF(str, "search_result")) {
            str2 = "search_result_list";
        } else {
            str2 = "";
        }
        linkedHashMap.put("enter_from", str2);
        boolean z = C0Q9J.LIZ;
        if (iSearchContextAbility != null && (c0pcyPh12 = iSearchContextAbility.Ph1()) != null && (c0prc2 = (C0PRC) c0pcyPh12.LIZJ()) != null) {
            str3 = c0prc2.LLILLL;
        } else {
            str3 = null;
        }
        if (C123100dR.LIZ(str3)) {
            linkedHashMap.put("search_id", str3);
        }
        if (iSearchContextAbility != null && (c0pcyPh1 = iSearchContextAbility.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
            str4 = c0prc.LLIZLLLIL;
        }
        if (C123100dR.LIZ(str4)) {
            linkedHashMap.put("search_keyword", str4);
        }
        return linkedHashMap;
    }

    public static void LJ(C683220Qr2 c683220Qr2, ISearchContextAbility iSearchContextAbility, String str) {
        String str2;
        C0PCY<C0PRC> c0pcyPh1;
        C0PRC c0prc;
        C0PCY<C0PRC> c0pcyPh12;
        C0PRC c0prc2;
        Map<String, String> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (c683220Qr2 != null && (map = c683220Qr2.LJ) != null) {
            linkedHashMap.putAll(map);
        }
        boolean z = C0Q9J.LIZ;
        String str3 = null;
        if (iSearchContextAbility != null && (c0pcyPh12 = iSearchContextAbility.Ph1()) != null && (c0prc2 = (C0PRC) c0pcyPh12.LIZJ()) != null) {
            str2 = c0prc2.LLILLL;
        } else {
            str2 = null;
        }
        if (C123100dR.LIZ(str2)) {
            linkedHashMap.put("search_id", str2);
        }
        if (iSearchContextAbility != null && (c0pcyPh1 = iSearchContextAbility.Ph1()) != null && (c0prc = (C0PRC) c0pcyPh1.LIZJ()) != null) {
            str3 = c0prc.LLIZLLLIL;
        }
        if (C123100dR.LIZ(str3)) {
            linkedHashMap.put("search_keyword", str3);
        }
        linkedHashMap.put("action_type", str);
        C20684815ws.LJIILLIIL("search_result_feedback", linkedHashMap);
    }

    public static void LJI(View view, Fragment fragment, boolean z) {
        C19EG c19egLIZIZ = C640260P9k.LIZIZ(view);
        if (c19egLIZIZ == null) {
            return;
        }
        ((SearchStateViewModel) C679340Qkm.LIZIZ(fragment, c19egLIZIZ).get(SearchStateViewModel.class)).setShouldBlockMediaPlay(z);
    }

    public static void LIZIZ(final View view, C683220Qr2 c683220Qr2, boolean z, Function2 function2, Function0 function0, int i) {
        Function0 function02 = function0;
        Function2 function22 = function2;
        boolean z2 = z;
        final C683220Qr2 c683220Qr22 = c683220Qr2;
        boolean z3 = C0Q9J.LIZ;
        if ((i & 2) != 0) {
            c683220Qr22 = null;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            function22 = null;
        }
        if ((i & 16) != 0) {
            function02 = null;
        }
        if (((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
            Context context = view.getContext();
            Fragment fragmentLIZLLL = C651580Ph6.LIZLLL(view);
            if (c683220Qr22 != null) {
                LJ(c683220Qr22, C0Q3E.LJI(), "open");
                view.performHapticFeedback(0, 2);
                LJI(view, fragmentLIZLLL, true);
                SearchFeedbackOptionalFragment searchFeedbackOptionalFragment = new SearchFeedbackOptionalFragment();
                searchFeedbackOptionalFragment.LL = c683220Qr22;
                searchFeedbackOptionalFragment.LLJJ = new C684150QsX(z2, c683220Qr22, view, searchFeedbackOptionalFragment, function22);
                searchFeedbackOptionalFragment.LLJJI = new AwS169S0400000_10(view, (View) searchFeedbackOptionalFragment, (SearchFeedbackOptionalFragment) c683220Qr22, (C683220Qr2) function22, (Function2<? super C683220Qr2, ? super FeedbackMultipleChoice, Unit>) 0);
                searchFeedbackOptionalFragment.LLJJIII = function02;
                final Context context2 = view.getContext();
                final Fragment fragmentLIZLLL2 = C651580Ph6.LIZLLL(view);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LJIIIIZZ(1);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJI = searchFeedbackOptionalFragment;
                tuxSheet.LLJLILLLLZIIL = false;
                c1390920mIc.LJI(16);
                DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.0QsV
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        Activity activityLIZ = C1388190mED.LIZ(context2);
                        if (activityLIZ != null) {
                            KeyboardUtils.LJ(3, activityLIZ, 15);
                        }
                        String str = TuxSheet._pnsPageId;
                        AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
                        if (!Intrinsics.LJFF(abstractC343940De4LJIIJJI, C684060QsO.LIZ) || !Intrinsics.LJFF(abstractC343940De4LJIIJJI, C684170QsZ.LIZ)) {
                            boolean z4 = C0Q9J.LIZ;
                            C684120QsU.LJI(view, fragmentLIZLLL2, false);
                            if (C0Q9J.LIZ) {
                                C0Q3E.LJI().Ph1().LIZ(new C641690PEx(false));
                            }
                            if (!Intrinsics.LJFF(abstractC343940De4LJIIJJI, C684180Qsa.LIZ)) {
                                C684120QsU.LJ(c683220Qr22, C0Q3E.LJI(), "close");
                            }
                        }
                    }
                };
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                tuxSheet2.LLILLJJLI = onDismissListener;
                SAFHelper sAFHelper = SAFHelper.LIZ;
                C19EG c19eg = (C19EG) C1388190mED.LIZ(context);
                sAFHelper.getClass();
                tuxSheet2.show(SAFHelper.LJJIIJ(view, c19eg), "searchFeedbackOption");
                if (C0Q9J.LIZ) {
                    C0Q3E.LJI().Ph1().LIZ(new C641690PEx(true));
                }
            }
        }
    }

    public static void LJFF(View view, Fragment fragment, C683220Qr2 c683220Qr2, FeedbackMultipleChoice feedbackMultipleChoice, String str, Function1 function1) {
        Aweme aweme;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        Object c098200Yq;
        String str2 = str;
        if (fragment != null) {
            String str3 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(fragment, C684180Qsa.LIZ);
        }
        if (c683220Qr2 != null && function1 != null) {
            function1.invoke(c683220Qr2);
        }
        Context context = view.getContext();
        String string = context.getResources().getString(2131832595);
        if (c683220Qr2 != null && (aweme = c683220Qr2.LJIILIIL) != null && aweme.isAd() && (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) != null && feedbackMultipleChoice != null) {
            String reqId = awemeRawAdLJJIJLIJ.getReqId();
            if (reqId == null || reqId.length() <= 0) {
                reqId = aweme.getRequestId();
            }
            String string2 = awemeRawAdLJJIJLIJ.getAdId().toString();
            String logExtra = awemeRawAdLJJIJLIJ.getLogExtra();
            try {
                JSONObject jSONObject = new JSONObject(logExtra);
                jSONObject.put("dislike_reason", feedbackMultipleChoice.getKey());
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("dislike_reason_text", str2);
                c098200Yq = C786410Ut5.J3(jSONObject);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str4 = (String) c098200Yq;
            if (str4 != null) {
                logExtra = str4;
            }
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C324590Cnx(new SearchDislikeAdLogRequest(reqId, string2, logExtra, awemeRawAdLJJIJLIJ.getCreativeIdStr(), feedbackMultipleChoice.getKey(), 0, AwemeExtKt.getAuthorUid(aweme)), null), 2);
        }
        if (C654380Plc.LIZ().fixRecommendWordsFeedbackToastWindow) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LIZLLL(3000L);
            c1389890mGx.LJIIJJI();
            return;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ == null) {
            return;
        }
        C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
        c1389890mGx2.LJIIJ(string);
        c1389890mGx2.LIZLLL(3000L);
        c1389890mGx2.LJIIJJI();
    }

    public static void LIZ(View view, SearchFeedbackOptionalFragment searchFeedbackOptionalFragment, C683220Qr2 c683220Qr2, FeedbackMultipleChoice feedbackMultipleChoice, int i, boolean z, Function1 function1) {
        Map<String, String> map;
        SearchFeedbackOptionalDetailFragment searchFeedbackOptionalDetailFragment = new SearchFeedbackOptionalDetailFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "param_feedback_choice", feedbackMultipleChoice);
        bundle.putInt("param_feedback_rank", i);
        bundle.putBoolean("param_feedback_require_content", z);
        searchFeedbackOptionalDetailFragment.setArguments(bundle);
        View view2 = searchFeedbackOptionalFragment.LLILLJJLI;
        if (view2 == null) {
            view2 = null;
        }
        searchFeedbackOptionalDetailFragment.LLILZLL = view2.getMeasuredHeight();
        if (c683220Qr2 != null) {
            map = c683220Qr2.LJ;
        } else {
            map = null;
        }
        searchFeedbackOptionalDetailFragment.LLJI = map;
        searchFeedbackOptionalDetailFragment.LLJILJILJ = new AwS45S0500000_10(view, (View) searchFeedbackOptionalDetailFragment, (SearchFeedbackOptionalDetailFragment) c683220Qr2, (C683220Qr2) feedbackMultipleChoice, (FeedbackMultipleChoice) function1, (Function1<? super C683220Qr2, Unit>) 0);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIJI(searchFeedbackOptionalFragment, searchFeedbackOptionalDetailFragment, false, null, 12);
    }
}
