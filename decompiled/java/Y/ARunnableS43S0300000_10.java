package Y;

import X.AbstractC21673619ry;
import X.AbstractC21673719rz;
import X.AbstractC641380PDs;
import X.AbstractC661100PwS;
import X.AnonymousClass0956;
import X.C013C;
import X.C01GW;
import X.C07IV;
import X.C098200Yq;
import X.C09RD;
import X.C09RE;
import X.C0BCE;
import X.C0BCS;
import X.C0BRN;
import X.C0BYI;
import X.C0BYJ;
import X.C0P6H;
import X.C0PEM;
import X.C0PH2;
import X.C0PHT;
import X.C0PL3;
import X.C0PNY;
import X.C0PQZ;
import X.C0Q3W;
import X.C0Q45;
import X.C0QF6;
import X.C0QGT;
import X.C0QPJ;
import X.C0QQ8;
import X.C0QW9;
import X.C118300cf;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13DA;
import X.C1487550ooT;
import X.C1537720q7O;
import X.C1558520qew;
import X.C15O7;
import X.C1697810uHb;
import X.C1840907Ix;
import X.C1848530yCh;
import X.C189200o6;
import X.C19EG;
import X.C1C7U;
import X.C1DFH;
import X.C1ER1;
import X.C20600815jK;
import X.C2107308Nj;
import X.C21415018rM;
import X.C2188811AlT;
import X.C23250099c;
import X.C291001Au;
import X.C293280BeY;
import X.C301180BrI;
import X.C301520Brq;
import X.C301540Brs;
import X.C302000Bsc;
import X.C419910GdJ;
import X.C422830Gi1;
import X.C427870Gq9;
import X.C438710HIf;
import X.C449250HjX;
import X.C594290NSp;
import X.C640790PBl;
import X.C641370PDr;
import X.C642420PHs;
import X.C643810PNb;
import X.C644060POa;
import X.C645920PVe;
import X.C645930PVf;
import X.C645940PVg;
import X.C648330Pbr;
import X.C649090Pd5;
import X.C651950Phh;
import X.C652310PiH;
import X.C653450Pk7;
import X.C653660PkS;
import X.C654760PmE;
import X.C656970Ppn;
import X.C664370Q4d;
import X.C667590QGn;
import X.C669090QMh;
import X.C669810QPb;
import X.C680740Qn2;
import X.C684750QtV;
import X.C687740QyK;
import X.C687890QyZ;
import X.C687920Qyc;
import X.C724240Sb0;
import X.C823050WQl;
import X.EnumC1334360kpO;
import X.EnumC642470PHx;
import X.EnumC657070Ppx;
import X.EnumC664420Q4i;
import X.EnumC682580Qq0;
import X.EnumC714850S2h;
import X.InterfaceC1541990qEH;
import X.InterfaceC1891350zJl;
import X.InterfaceC435460H5s;
import X.InterfaceC497601wk;
import X.InterfaceC658750Psf;
import X.InterfaceC680770Qn5;
import X.InterfaceC714040Rze;
import X.RunnableC2335209Da;
import X.RunnableC448090Hhf;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.crash.Npth;
import com.bytedance.i18n.location.api.LocationData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.business.story.assem.FeedSkylightRerankAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.mediaplayer.components.common.ui.SearchMediaExtraSpaceAssem;
import com.ss.android.ugc.aweme.search.common.utils.SearchLocationCacheData;
import com.ss.android.ugc.aweme.search.middle.DynamicSingleIntermediateFragmentNew;
import com.ss.android.ugc.aweme.search.middle.SearchStartViewModel;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.common.theme.activitybg.ActivityCardThemeViewModel;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment;
import com.ss.android.ugc.aweme.search.pages.middlepage.historytag.viewmodel.SearchHistoryIconManagerVM;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.IAdjustAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.anchor.ui.SearchBestMatchLabelAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.pov.ui.multisummary.SearchTextWithMultiDocAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.refactor.SearchCommentTopRelatedImpl;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.ui.TakoContentAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS118S0101000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ARunnableS43S0300000_10 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
            case 22:
                run$22(this);
                break;
            case 23:
                run$23(this);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                run$24(this);
                break;
            case 25:
                run$25(this);
                break;
            case 26:
                run$26(this);
                break;
            case 27:
                run$27(this);
                break;
            case 28:
                run$28(this);
                break;
            case 29:
                run$29(this);
                break;
            case 30:
                run$30(this);
                break;
            case 31:
                run$31(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Activity activity = ((C687920Qyc) this.l0).LJIIJJI.get();
        C19EG c19eg = activity instanceof C19EG ? (C19EG) activity : null;
        try {
            SearchLocationCacheData.LIZ.LJII((LocationData) this.l2, c19eg, 0);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (((C687920Qyc) this.l0).LIZ == EnumC682580Qq0.NATIVE_BANNER && c19eg != null) {
            try {
                int i = C651950Phh.LLILLL;
                C640790PBl.LIZ(c19eg, SAFExtensionKt.LJIILLIIL(c19eg), "place_change");
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
        }
        C687890QyZ c687890QyZ = (C687890QyZ) this.l1;
        C687920Qyc c687920Qyc = (C687920Qyc) this.l0;
        c687890QyZ.getClass();
        C687890QyZ.LIZJ(c687920Qyc);
    }

    public final void LIZ$1() throws Throwable {
        SearchHistoryIconManagerVM searchHistoryIconManagerVM;
        if (!((DynamicSingleIntermediateFragmentNew) this.l0).LLLJIL) {
            SearchMiddleMonitor searchMiddleMonitor = SearchMiddleMonitor.INSTANCE;
            searchMiddleMonitor.updateHistoryEnd();
            searchMiddleMonitor.historyEnd();
            DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew = (DynamicSingleIntermediateFragmentNew) this.l0;
            dynamicSingleIntermediateFragmentNew.getClass();
            LifecycleOwnerExtensionsKt.LIZ(dynamicSingleIntermediateFragmentNew, new ARunnableS110S0100000_10(dynamicSingleIntermediateFragmentNew, 220));
            C01GW c01gw = C301180BrI.LIZ;
            if (((Number) c01gw.getValue()).intValue() == 1 || (((Number) c01gw.getValue()).intValue() == 2 && ((DynamicSingleIntermediateFragmentNew) this.l0).yS())) {
                DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew2 = (DynamicSingleIntermediateFragmentNew) this.l0;
                LifecycleOwnerExtensionsKt.LIZ(dynamicSingleIntermediateFragmentNew2, new ARunnableS106S0100000_6(dynamicSingleIntermediateFragmentNew2, 106));
            } else {
                C01GW c01gw2 = C301540Brs.LIZ;
                if (((((Number) c01gw2.getValue()).intValue() == 1 && ((DynamicSingleIntermediateFragmentNew) this.l0).LLLLIILL) || (((Number) C301520Brq.LIZ.getValue()).intValue() == 1 && ((DynamicSingleIntermediateFragmentNew) this.l0).LLLLIIL)) && ((DynamicSingleIntermediateFragmentNew) this.l0).yS()) {
                    LifecycleOwnerExtensionsKt.LIZIZ((DynamicSingleIntermediateFragmentNew) this.l0, C0BYI.LIZ(), new RunnableC448090Hhf(new WeakReference((DynamicSingleIntermediateFragmentNew) this.l0)));
                } else if ((((Number) c01gw2.getValue()).intValue() == 2 && ((DynamicSingleIntermediateFragmentNew) this.l0).LLLLIILL) || (((Number) C301520Brq.LIZ.getValue()).intValue() == 2 && ((DynamicSingleIntermediateFragmentNew) this.l0).LLLLIIL)) {
                    DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew3 = (DynamicSingleIntermediateFragmentNew) this.l0;
                    LifecycleOwnerExtensionsKt.LIZ(dynamicSingleIntermediateFragmentNew3, new ARunnableS110S0100000_10(dynamicSingleIntermediateFragmentNew3, 45));
                }
            }
        }
        C667590QGn.LIZ.getClass();
        if (C667590QGn.LIZ() && C0BYJ.LIZ() == 1 && !C0BYJ.LIZ) {
            C0BYJ.LIZ = true;
            C823050WQl.LIZJ().execute(RunnableC2335209Da.LL);
        }
        DynamicSingleIntermediateFragmentNew dynamicSingleIntermediateFragmentNew4 = (DynamicSingleIntermediateFragmentNew) this.l0;
        dynamicSingleIntermediateFragmentNew4.LLLJIL = false;
        Map<String, Integer> map = C0QGT.LIZ;
        int i = 0;
        for (SearchHistory searchHistory : dynamicSingleIntermediateFragmentNew4.cS()) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            SearchHistory searchHistory2 = searchHistory;
            Number number = (Number) ((LinkedHashMap) C0QGT.LIZ).get(searchHistory2.keyword);
            C1487550ooT c1487550ooT = C1487550ooT.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("history_search_keyword_cnt_");
            sbLIZ.append(i);
            c1487550ooT.setFeature(C2188811AlT.LIZIZ(sbLIZ), number, false);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("history_show_source_");
            sbLIZ2.append(i);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            String str = searchHistory2.enterMethod;
            c1487550ooT.setFeature(strLIZIZ, str == null ? "unknown" : C649090Pd5.LIZ(str) ? "normal" : "passive");
            i = i2;
        }
        boolean z = C293280BeY.LIZ;
        if (!z) {
            ((DynamicSingleIntermediateFragmentNew) this.l0).VS();
            ((DynamicSingleIntermediateFragmentNew) this.l0).FS();
            ((DynamicSingleIntermediateFragmentNew) this.l0).US();
        }
        ((DynamicSingleIntermediateFragmentNew) this.l0).LLLILZ = true;
        if (z) {
            ((DynamicSingleIntermediateFragmentNew) this.l0).RS((SearchStartViewModel) this.l1, (Boolean) this.l2);
        }
        if (C07IV.LIZ && (searchHistoryIconManagerVM = (SearchHistoryIconManagerVM) ((DynamicSingleIntermediateFragmentNew) this.l0).LLJLILLLLZIIL.getValue()) != null) {
            C0QF6 c0qf6NR = ((DynamicSingleIntermediateFragmentNew) this.l0).NR();
            ((DynamicSingleIntermediateFragmentNew) this.l0).getClass();
            List<SearchHistory> listLJIIL = c0qf6NR.LJIIL(C0QPJ.LJIJJLI());
            if (!searchHistoryIconManagerVM.LLILZ && searchHistoryIconManagerVM.LLILLL && !listLJIIL.isEmpty()) {
                searchHistoryIconManagerVM.LLILLL = false;
                searchHistoryIconManagerVM.LLILZ = true;
                AnonymousClass0956 anonymousClass0956 = searchHistoryIconManagerVM.LLILZIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(searchHistoryIconManagerVM);
                C1DFH c1dfh = C0PEM.LIZ;
                searchHistoryIconManagerVM.LLILZIL = C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ.LLIILII(), null, new C594290NSp(searchHistoryIconManagerVM, listLJIIL, null), 2);
            }
        }
        C669810QPb.LIZ.getClass();
        if (C669810QPb.LIZIZ() && ((DynamicSingleIntermediateFragmentNew) this.l0).getActivity() != null) {
            KeyboardUtils.LJ(4, ((DynamicSingleIntermediateFragmentNew) this.l0).getActivity(), 15);
        }
        if (((Boolean) C0BCS.LIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((DynamicSingleIntermediateFragmentNew) this.l0), null, null, new C449250HjX(null), 3);
        } else {
            C669810QPb.LIZIZ = false;
        }
    }

    public final void LIZ$10() {
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(((User) this.l0).getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LJJIJ(C422830Gi1.LIZ(100));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIIZZ.LJIL(c419910GdJ.LIZ((Context) this.l1));
        c1331670kl3LJIIIIZZ.LIZLLL("AbsCellViewHolder");
        c1331670kl3LJIIIIZZ.LJJ(((SearchMediaExtraSpaceAssem) this.l2).LLJJJJJIL);
        if (C302000Bsc.LIZIZ()) {
            c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
        }
        if (C302000Bsc.LIZ()) {
            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
            c1331670kl3LJIIIIZZ.LJJJJJ = "search_cache";
        }
        c1331670kl3LJIIIIZZ.LJIIJJI();
    }

    public final void LIZ$11() {
        FeedSkylightRerankAssem feedSkylightRerankAssem = (FeedSkylightRerankAssem) this.l0;
        AbstractC641380PDs abstractC641380PDs = (AbstractC641380PDs) this.l1;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.l2;
        feedSkylightRerankAssem.getClass();
        if (abstractC641380PDs instanceof C641370PDr) {
            String str = ((C641370PDr) abstractC641380PDs).LIZ;
            AbstractC21673719rz itemAnimator = viewOnAttachStateChangeListenerC20604515jv.getItemAnimator();
            C20600815jK<InterfaceC1891350zJl> state = viewOnAttachStateChangeListenerC20604515jv.getState();
            int i = 0;
            if (state != null) {
                Iterator it2 = ((ArrayList) state.LJII()).iterator();
                i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    }
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                    if ((interfaceC1891350zJl instanceof InterfaceC714040Rze) && Intrinsics.LJFF(AwemeExtKt.getAuthorUid(((InterfaceC714040Rze) interfaceC1891350zJl).getStoryCollection()), str)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS17S0201000_10(i, viewOnAttachStateChangeListenerC20604515jv, itemAnimator, 14));
        }
    }

    public final void LIZ$3() {
        List<String> urlList;
        Object obj;
        UrlModel avatarThumb;
        UrlModel cover;
        int i = ((C0P6H) this.l0).LJI + 1;
        int i2 = ((C118300cf) this.l1).element;
        if (i > i2) {
            return;
        }
        while (true) {
            List list = (List) this.l2;
            synchronized (list) {
                try {
                    urlList = null;
                    obj = (!(list.isEmpty() ^ true) || i >= list.size()) ? null : list.get(i);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (obj != null) {
                C0P6H c0p6h = (C0P6H) this.l0;
                Aweme aweme = (Aweme) obj;
                Video video = aweme.getVideo();
                List<String> urlList2 = (video == null || (cover = video.getCover()) == null) ? null : cover.getUrlList();
                c0p6h.getClass();
                String strLIZIZ = C0P6H.LIZIZ(urlList2);
                C0PQZ c0pqz = C0PQZ.LIZ;
                c0pqz.getClass();
                C0PQZ.LIZJ(strLIZIZ, null, "", -1, -1);
                C0P6H c0p6h2 = (C0P6H) this.l0;
                User author = aweme.getAuthor();
                if (author != null && (avatarThumb = author.getAvatarThumb()) != null) {
                    urlList = avatarThumb.getUrlList();
                }
                c0p6h2.getClass();
                String strLIZIZ2 = C0P6H.LIZIZ(urlList);
                c0pqz.getClass();
                C0PQZ.LIZJ(strLIZIZ2, null, "", -1, -1);
            }
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void LIZ$4() {
        int height;
        View view;
        if (((View) this.l0).getParent() != null) {
            ActivityCardThemeViewModel activityCardThemeViewModel = (ActivityCardThemeViewModel) this.l1;
            View view2 = (View) this.l0;
            Fragment parentFragment = ((Fragment) this.l2).getParentFragment();
            while (parentFragment != null && !(parentFragment instanceof SearchRootFragment)) {
                parentFragment = parentFragment.getParentFragment();
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            int i = iArr[1];
            if (parentFragment == null || (view = parentFragment.getView()) == null) {
                height = view2.getHeight();
            } else {
                view.getLocationOnScreen(iArr);
                i -= iArr[1];
                height = view2.getHeight();
            }
            activityCardThemeViewModel.LL = i + height;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$5() {
        /*
            Method dump skipped, instruction units count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS43S0300000_10.LIZ$5():void");
    }

    public final void LIZ$6() throws JSONException {
        Map map = (Map) this.l0;
        C664370Q4d c664370Q4d = (C664370Q4d) this.l1;
        Set<C664370Q4d> set = (Set) this.l2;
        if (set == null) {
            Exception exc = c664370Q4d.LJIIJJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("player occur crosstalk, player size:");
            sbLIZ.append(c664370Q4d.LJIIJ.size());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C13DA c13da = new C13DA();
            c13da.putAll(map);
            C0Q45 c0q45 = C0Q45.COMMON;
            c13da.put("biz_catalog", c0q45.getCatalog());
            c13da.put("biz_subcategory", c0q45.getSubcategory());
            EnumC664420Q4i enumC664420Q4i = EnumC664420Q4i.PLAYER;
            c13da.put("tech_catalog", enumC664420Q4i.getCatalog());
            c13da.put("tech_subcategory", enumC664420Q4i.getSubcategory());
            Exception exc2 = c664370Q4d.LJIIJJI;
            c13da.put("exception_class_name", exc2 != null ? exc2.getClass().getSimpleName() : "");
            Npth.reportBizException("search_player", exc, strLIZIZ, (Map<String, String>) c13da.build(), c664370Q4d.LIZ());
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (C664370Q4d c664370Q4d2 : set) {
            c664370Q4d2.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("crosstalk_id", c664370Q4d2.LIZ);
            jSONObject.put("search_session_id", c664370Q4d2.LIZIZ);
            jSONObject.put("search_id", c664370Q4d2.LIZJ);
            jSONObject.put("enter_from", c664370Q4d2.LIZLLL);
            jSONObject.put("search_type", c664370Q4d2.LJ);
            jSONObject.put("card_type", c664370Q4d2.LJFF);
            jSONObject.put("rank", c664370Q4d2.LJI);
            jSONObject.put("aweme_id", c664370Q4d2.LJII);
            jSONObject.put("play_timestamp", c664370Q4d2.LJIIIIZZ);
            jSONObject.put("operation_events", c664370Q4d2.LJIIIZ.toString());
            jSONObject.put("all_player_infos", c664370Q4d2.LJIIJ.toString());
            String stackTraceString = c664370Q4d2.LJIIL;
            if (stackTraceString == null) {
                stackTraceString = Log.getStackTraceString(c664370Q4d2.LJIIJJI);
                c664370Q4d2.LJIIL = stackTraceString;
            }
            jSONObject.put("call_stack", stackTraceString);
            jSONArray.put(jSONObject);
        }
        Map<String, String> mapLIZ = c664370Q4d.LIZ();
        mapLIZ.put("other_crosstalk", jSONArray.toString());
        Exception exc3 = c664370Q4d.LJIIJJI;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("player occur crosstalk, player size:");
        sbLIZ2.append(c664370Q4d.LJIIJ.size());
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C13DA c13da2 = new C13DA();
        c13da2.putAll(map);
        C0Q45 c0q452 = C0Q45.COMMON;
        c13da2.put("biz_catalog", c0q452.getCatalog());
        c13da2.put("biz_subcategory", c0q452.getSubcategory());
        EnumC664420Q4i enumC664420Q4i2 = EnumC664420Q4i.PLAYER;
        c13da2.put("tech_catalog", enumC664420Q4i2.getCatalog());
        c13da2.put("tech_subcategory", enumC664420Q4i2.getSubcategory());
        Exception exc4 = c664370Q4d.LJIIJJI;
        c13da2.put("exception_class_name", exc4 != null ? exc4.getClass().getSimpleName() : "");
        Npth.reportBizException("search_player", exc3, strLIZIZ2, c13da2.build(), mapLIZ, true);
    }

    public final void LIZ$7() {
        String alasrc;
        C654760PmE c654760PmELIZIZ = C645940PVg.LIZIZ((C653660PkS) this.l0);
        c654760PmELIZIZ.LJIJI("search_result_id", ((C653660PkS) this.l0).LJIJI);
        C652310PiH c652310PiH = (C652310PiH) this.l2;
        C653660PkS c653660PkS = (C653660PkS) this.l0;
        String alasrc2 = null;
        if (C0BRN.LIZ()) {
            C645920PVe.LIZIZ(c654760PmELIZIZ, c652310PiH.itemView, c653660PkS.LJIJI, null);
        }
        C645930PVf.LIZ(c654760PmELIZIZ);
        SearchCardInfo searchCardInfo = ((SearchMixFeed) this.l1).getSearchCardInfo();
        if (searchCardInfo == null || (alasrc = searchCardInfo.getAlasrc()) == null || alasrc.length() == 0) {
            alasrc2 = "live_card";
        } else {
            SearchCardInfo searchCardInfo2 = ((SearchMixFeed) this.l1).getSearchCardInfo();
            if (searchCardInfo2 != null) {
                alasrc2 = searchCardInfo2.getAlasrc();
            }
        }
        c654760PmELIZIZ.LJIIZILJ("token_type", alasrc2);
        c654760PmELIZIZ.LJIILJJIL();
    }

    public final void LIZ$8() {
        View viewE1;
        C1537720q7O c1537720q7O;
        InterfaceC1541990qEH interfaceC1541990qEH = (InterfaceC1541990qEH) this.l0;
        if (interfaceC1541990qEH == null || (viewE1 = interfaceC1541990qEH.e1()) == null) {
            return;
        }
        InterfaceC1541990qEH interfaceC1541990qEH2 = (InterfaceC1541990qEH) this.l1;
        C648330Pbr c648330Pbr = (C648330Pbr) this.l2;
        if (interfaceC1541990qEH2 == null) {
            c648330Pbr.addView(viewE1);
            return;
        }
        if (((Number) C0BCE.LIZ.getValue()).intValue() == 0) {
            Iterator<View> it2 = new C09RD(c648330Pbr).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (!c09re.hasNext()) {
                    break;
                }
                View view = (View) c09re.next();
                if ((view instanceof C1537720q7O) && (c1537720q7O = (C1537720q7O) view) != null) {
                    c1537720q7O.LLD(true);
                }
            }
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c648330Pbr, null);
        c648330Pbr.removeAllViews();
        c648330Pbr.addView(viewE1);
    }

    public final void LIZ$9() {
        String aid;
        C653450Pk7 c653450Pk7 = (C653450Pk7) this.l0;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList((List) this.l1);
        Function1 function1 = (Function1) this.l2;
        c653450Pk7.getClass();
        int i = 0;
        for (Object obj : copyOnWriteArrayList) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            Aweme aweme = (Aweme) function1.invoke(obj);
            if (aweme != null && (aid = aweme.getAid()) != null) {
                ((ConcurrentHashMap) c653450Pk7.LIZIZ).put(aid, new Pair(Integer.valueOf(i), aweme));
                ((IAwemeService) c653450Pk7.LJ.getValue()).LLILLL(aweme);
            }
            i = i2;
        }
    }

    public final void LIZ$2() {
        C427870Gq9 c427870Gq9;
        if (!C1840907Ix.LIZIZ()) {
            SearchVideoHolder.J6((C427870Gq9) this.l0, (User) this.l1, (SearchVideoHolder) this.l2);
            return;
        }
        long jLIZ = C1840907Ix.LIZ();
        if (((C427870Gq9) this.l0) == null || (c427870Gq9 = (C427870Gq9) this.l0) == null) {
            return;
        }
        HandlerHook.viewPostDelay(c427870Gq9, new ARunnableS43S0300000_10(c427870Gq9, (User) this.l1, (SearchVideoHolder) this.l2, 4), jLIZ);
    }

    public static final void run$0(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchGpsPopupCoordinator@3b75.refreshLocationAndPage$3$1$onLocationChanged$$inlined$runOnMain$1");
        try {
            aRunnableS43S0300000_10.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchGpsPopupCoordinator@3b75.refreshLocationAndPage$3$1$onLocationChanged$$inlined$runOnMain$1");
    }

    public static final void run$1(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SAFPlaceholderOverlayManager@6e7e.registerFirstDrawCallback$listener$1$onDraw$1");
        try {
            if (((View) aRunnableS43S0300000_10.l0).getParent() != null) {
                ((C680740Qn2) aRunnableS43S0300000_10.l1).LIZIZ();
                ((InterfaceC680770Qn5) aRunnableS43S0300000_10.l2).LIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SAFPlaceholderOverlayManager@6e7e.registerFirstDrawCallback$listener$1$onDraw$1");
    }

    public static final void run$10(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchViewInScreenPositionUtils@7c0a.setupActivityCardBgIn7SMode$1");
        try {
            aRunnableS43S0300000_10.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchViewInScreenPositionUtils@7c0a.setupActivityCardBgIn7SMode$1");
    }

    public static final void run$11(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("MixShopContainerVerticalAssem@ab0.runAfterNextFrame$1");
        try {
            HandlerHook.viewPost((View) aRunnableS43S0300000_10.l0, new ARunnableS79S0200000_10((C013C) aRunnableS43S0300000_10.l1, (Function0) aRunnableS43S0300000_10.l2, 50));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixShopContainerVerticalAssem@ab0.runAfterNextFrame$1");
    }

    public static final void run$12(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchLazyExtensionsKt@99f9.triggerAllSearchLazy$1");
        try {
            AFwS241S0000000_10 aFwS241S0000000_10 = C0PH2.LIZIZ;
            if (aFwS241S0000000_10 != null) {
                aFwS241S0000000_10.invoke((CopyOnWriteArrayList) aRunnableS43S0300000_10.l0);
            }
            AFwS241S0000000_10 aFwS241S0000000_102 = C0PH2.LIZLLL;
            if (aFwS241S0000000_102 != null) {
                aFwS241S0000000_102.invoke((CopyOnWriteArrayList) aRunnableS43S0300000_10.l1);
            }
            AFwS241S0000000_10 aFwS241S0000000_103 = C0PH2.LIZJ;
            if (aFwS241S0000000_103 != null) {
                aFwS241S0000000_103.invoke((CopyOnWriteArrayList) aRunnableS43S0300000_10.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchLazyExtensionsKt@99f9.triggerAllSearchLazy$1");
    }

    public static final void run$13(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SugTextUtils@7a47.bindLiteSug$1$1");
        try {
            C669090QMh c669090QMh = C669090QMh.LIZ;
            LinearLayout linearLayout = (LinearLayout) aRunnableS43S0300000_10.l0;
            c669090QMh.getClass();
            C669090QMh.LJII(linearLayout);
            ((C21415018rM) aRunnableS43S0300000_10.l1).setTextLayout((Layout) aRunnableS43S0300000_10.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SugTextUtils@7a47.bindLiteSug$1$1");
    }

    public static final void run$14(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        Bundle bundleLJFF;
        C1C7U.LIZ("SearchCommentTopRelatedImpl@ddee.doPrefetch$1");
        try {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            C19EG c19eg = (C19EG) aRunnableS43S0300000_10.l0;
            C0QQ8 c0qq8 = ((SearchCommentTopRelatedImpl) aRunnableS43S0300000_10.l1).LJIILJJIL;
            if (c0qq8 != null) {
                bundleLJFF = c0qq8.LJFF(c19eg, (Aweme) aRunnableS43S0300000_10.l2, false);
            } else {
                bundleLJFF = null;
            }
            c1er1.v(c19eg, ((SearchCommentTopRelatedImpl) aRunnableS43S0300000_10.l1).LJIILIIL, bundleLJFF);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchCommentTopRelatedImpl@ddee.doPrefetch$1");
    }

    public static final void run$15(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchJediMixFeedFragment@aa43.afterFirstScreenContentDetermined$1$1$2");
        try {
            C644060POa c644060POa = C644060POa.LIZ;
            SearchResultParam searchResultParam = (SearchResultParam) aRunnableS43S0300000_10.l0;
            c644060POa.getClass();
            int i = C644060POa.LJII(searchResultParam).LJIJJLI;
            if (i > 0) {
                C1848530yCh.LJ(new AwS118S0101000_10(i, (SearchJediMixFeedFragment) aRunnableS43S0300000_10.l2, 4), (ViewGroup) aRunnableS43S0300000_10.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchJediMixFeedFragment@aa43.afterFirstScreenContentDetermined$1$1$2");
    }

    public static final void run$16(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("TopFeedDataLoader@f482.load$1");
        try {
            aRunnableS43S0300000_10.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TopFeedDataLoader@f482.load$1");
    }

    public static final void run$17(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("BaseSearchPageSkeleton@63b1.initPageOperations$1$3$1");
        try {
            if (((View) aRunnableS43S0300000_10.l0).getParent() != null) {
                ((C0QW9) aRunnableS43S0300000_10.l1).LLIILII((SearchResultParam) aRunnableS43S0300000_10.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseSearchPageSkeleton@63b1.initPageOperations$1$3$1");
    }

    public static final void run$18(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        AbstractC661100PwS abstractC661100PwS = (AbstractC661100PwS) aRunnableS43S0300000_10.l0;
        Video video = (Video) aRunnableS43S0300000_10.l1;
        InterfaceC658750Psf interfaceC658750Psf = (InterfaceC658750Psf) aRunnableS43S0300000_10.l2;
        abstractC661100PwS.getClass();
        C1C7U.LIZ("AbsCellViewHolder@870.bindCover$2L");
        C823050WQl.LIZJ().execute(new ARunnableS43S0300000_10(interfaceC658750Psf, video, abstractC661100PwS, 20));
        C1C7U.LIZIZ("AbsCellViewHolder@870.bindCover$2L");
    }

    public static final void run$19(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        AbstractC661100PwS abstractC661100PwS = (AbstractC661100PwS) aRunnableS43S0300000_10.l0;
        Video video = (Video) aRunnableS43S0300000_10.l1;
        InterfaceC658750Psf interfaceC658750Psf = (InterfaceC658750Psf) aRunnableS43S0300000_10.l2;
        abstractC661100PwS.getClass();
        C1C7U.LIZ("AbsCellViewHolder@870.bindCover$3L");
        abstractC661100PwS.f6(video.getCover(), interfaceC658750Psf, null);
        C1C7U.LIZIZ("AbsCellViewHolder@870.bindCover$3L");
    }

    public static final void run$2(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("DynamicSingleIntermediateFragmentNew@4e1a.openSearchSquare$1");
        try {
            aRunnableS43S0300000_10.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DynamicSingleIntermediateFragmentNew@4e1a.openSearchSquare$1");
    }

    public static final void run$20(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        AbstractC661100PwS abstractC661100PwS = (AbstractC661100PwS) aRunnableS43S0300000_10.l0;
        Video video = (Video) aRunnableS43S0300000_10.l1;
        InterfaceC658750Psf interfaceC658750Psf = (InterfaceC658750Psf) aRunnableS43S0300000_10.l2;
        abstractC661100PwS.getClass();
        C1C7U.LIZ("AbsCellViewHolder@870.bindCover$2L$1L");
        abstractC661100PwS.f6(video.getCover(), interfaceC658750Psf, null);
        C1C7U.LIZIZ("AbsCellViewHolder@870.bindCover$2L$1L");
    }

    public static final void run$21(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchCrosstalkMonitor@eeb1.report$1");
        try {
            aRunnableS43S0300000_10.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchCrosstalkMonitor@eeb1.report$1");
    }

    public static final void run$22(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchLiveWithVideoViewHolder@11e6.mobShow$1");
        try {
            aRunnableS43S0300000_10.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchLiveWithVideoViewHolder@11e6.mobShow$1");
    }

    public static final void run$23(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchAdGapModel@407f.recordOuterFlowExposedItemIdAsync$1");
        try {
            ((C0PL3) aRunnableS43S0300000_10.l0).LIZLLL(aRunnableS43S0300000_10.l1, (AbstractC21673619ry) aRunnableS43S0300000_10.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchAdGapModel@407f.recordOuterFlowExposedItemIdAsync$1");
    }

    public static final void run$24(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchAdGapModel@407f.recordOuterFlowExposedItemsAsync$1");
        try {
            Iterator it2 = ((List) aRunnableS43S0300000_10.l0).iterator();
            while (it2.hasNext()) {
                ((C0PL3) aRunnableS43S0300000_10.l1).LIZLLL(it2.next(), (AbstractC21673619ry) aRunnableS43S0300000_10.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchAdGapModel@407f.recordOuterFlowExposedItemsAsync$1");
    }

    public static final void run$25(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SparkLoader@74bf.loadBySparkLitePure$runnable$1$2$3$1");
        try {
            aRunnableS43S0300000_10.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkLoader@74bf.loadBySparkLitePure$runnable$1$2$3$1");
    }

    public static final void run$26(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchAwemeVideoEventHelper@439f.setAwemes$1");
        try {
            aRunnableS43S0300000_10.LIZ$9();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchAwemeVideoEventHelper@439f.setAwemes$1");
    }

    public static final void run$27(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        C0PNY c0pny = (C0PNY) aRunnableS43S0300000_10.l0;
        Exception excLJIIJJI = (Exception) aRunnableS43S0300000_10.l1;
        C15O7 c15o7 = (C15O7) aRunnableS43S0300000_10.l2;
        c0pny.mIsLoading = false;
        c0pny.LLJI = false;
        C643810PNb c643810PNb = c0pny.LLLLIILLL;
        if (excLJIIJJI == null) {
            excLJIIJJI = c15o7.LJIIJJI();
        }
        c643810PNb.LJIJJLI(1, excLJIIJJI);
    }

    public static final void run$28(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        C0PNY c0pny = (C0PNY) aRunnableS43S0300000_10.l0;
        Exception excLJIIJJI = (Exception) aRunnableS43S0300000_10.l1;
        C15O7 c15o7 = (C15O7) aRunnableS43S0300000_10.l2;
        c0pny.mIsLoading = false;
        c0pny.LLJI = false;
        C643810PNb c643810PNb = c0pny.LLLLIILLL;
        if (excLJIIJJI == null) {
            excLJIIJJI = c15o7.LJIIJJI();
        }
        c643810PNb.LJIJJLI(1, excLJIIJJI);
    }

    public static final void run$29(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchHistorySmartPrefetchHelp@20e6.doPrefetch$1$1");
        try {
            C0Q3W.LIZIZ(C0Q3W.LIZ, (Fragment) aRunnableS43S0300000_10.l0, (Context) aRunnableS43S0300000_10.l1, "", ((SearchHistory) aRunnableS43S0300000_10.l2).keyword, false, true, null, null, null, 448);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchHistorySmartPrefetchHelp@20e6.doPrefetch$1$1");
    }

    public static final void run$3(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        IAdjustAbility iAdjustAbility;
        C1C7U.LIZ("SearchBestMatchLabelAssem@ea4d.onBind$1");
        try {
            SearchBestMatchLabelAssem searchBestMatchLabelAssem = (SearchBestMatchLabelAssem) aRunnableS43S0300000_10.l0;
            if (searchBestMatchLabelAssem.LLJJIII && Intrinsics.LJFF(searchBestMatchLabelAssem.bo(), (InterfaceC435460H5s) aRunnableS43S0300000_10.l1) && (iAdjustAbility = (IAdjustAbility) C1558520qew.LIZ(C1558520qew.LJIIL((SearchBestMatchLabelAssem) aRunnableS43S0300000_10.l0), IAdjustAbility.class, null)) != null) {
                iAdjustAbility.qw1(EnumC657070Ppx.BEST_MATCH_TAG, (C656970Ppn) aRunnableS43S0300000_10.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchBestMatchLabelAssem@ea4d.onBind$1");
    }

    public static final void run$30(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchMediaExtraSpaceAssem@1937.bindAuthorAvatar$1");
        try {
            aRunnableS43S0300000_10.LIZ$10();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchMediaExtraSpaceAssem@1937.bindAuthorAvatar$1");
    }

    public static final void run$31(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("FeedSkylightRerankAssem@3a3b.subscribe$1$1");
        try {
            aRunnableS43S0300000_10.LIZ$11();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedSkylightRerankAssem@3a3b.subscribe$1$1");
    }

    public static final void run$4(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchVideoHolder@6f53.bindAuthorAvatar$1$1");
        try {
            SearchVideoHolder.J6((C427870Gq9) aRunnableS43S0300000_10.l2, (User) aRunnableS43S0300000_10.l0, (SearchVideoHolder) aRunnableS43S0300000_10.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchVideoHolder@6f53.bindAuthorAvatar$1$1");
    }

    public static final void run$5(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchVideoHolder@6f53.bindAuthorAvatar$1");
        try {
            aRunnableS43S0300000_10.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchVideoHolder@6f53.bindAuthorAvatar$1");
    }

    public static final void run$6(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C684750QtV c684750QtV;
        C1C7U.LIZ("SearchTextWithMultiDocAssem@cc56.onBind$1$1");
        try {
            if (((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS43S0300000_10.l0).getParent() != null && (c684750QtV = ((SearchTextWithMultiDocAssem) aRunnableS43S0300000_10.l1).LLJLLL) != null && c684750QtV.areItemTheSame((C684750QtV) aRunnableS43S0300000_10.l2)) {
                ((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS43S0300000_10.l0).animate().alpha(1.0f).setDuration(300L).setInterpolator(new LinearInterpolator()).start();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchTextWithMultiDocAssem@cc56.onBind$1$1");
    }

    public static final void run$7(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        Bundle bundleLJFF;
        C1C7U.LIZ("SearchCommentTopRelatedImpl@ddee.realPrefetch$1");
        try {
            C1ER1 c1er1 = C1ER1.LIZIZ;
            C19EG c19eg = (C19EG) aRunnableS43S0300000_10.l0;
            C0QQ8 c0qq8 = ((SearchCommentTopRelatedImpl) aRunnableS43S0300000_10.l1).LJIILJJIL;
            if (c0qq8 != null) {
                bundleLJFF = c0qq8.LJFF(c19eg, (Aweme) aRunnableS43S0300000_10.l2, false);
            } else {
                bundleLJFF = null;
            }
            c1er1.v(c19eg, ((SearchCommentTopRelatedImpl) aRunnableS43S0300000_10.l1).LJIILIIL, bundleLJFF);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchCommentTopRelatedImpl@ddee.realPrefetch$1");
    }

    public static final void run$8(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("TakoContentAssem@bd9.handleMessages$$inlined$postDelayed$1");
        try {
            C642420PHs.LIZ((C0PHT) aRunnableS43S0300000_10.l0, (List) ((C291001Au) aRunnableS43S0300000_10.l1).LIZ, EnumC642470PHx.REBIND, C724240Sb0.LJI((TakoContentAssem) aRunnableS43S0300000_10.l2), ((TakoContentAssem) aRunnableS43S0300000_10.l2).getContext());
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoContentAssem@bd9.handleMessages$$inlined$postDelayed$1");
    }

    public static final void run$9(ARunnableS43S0300000_10 aRunnableS43S0300000_10) {
        boolean zLIZ;
        C1C7U.LIZ("SearchImagePreloader@5679.prefetchImageForEachCard$1");
        try {
            aRunnableS43S0300000_10.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchImagePreloader@5679.prefetchImageForEachCard$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS43S0300000_10(X.C427870Gq9 r2, com.ss.android.ugc.aweme.profile.model.User r3, com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 4 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS43S0300000_10.<init>(X.0Gq9, com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder, int):void");
    }

    public ARunnableS43S0300000_10(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj2;
        this.l2 = obj;
    }

    public ARunnableS43S0300000_10(C687920Qyc c687920Qyc, C687740QyK c687740QyK, C687890QyZ c687890QyZ, LocationData locationData, int i) {
        this.$t = i;
        this.l0 = c687920Qyc;
        this.l1 = c687890QyZ;
        this.l2 = locationData;
    }
}
