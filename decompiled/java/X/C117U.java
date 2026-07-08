package X;

import Y.ACallableS154S0000000_29;
import Y.AObjectS372S0100000_29;
import Y.AObjectS403S0100000_29;
import Y.AObserverS178S0200000_14;
import Y.AObserverS231S0100000_29;
import Y.ARunnableS114S0100000_14;
import Y.ARunnableS129S0100000_29;
import Y.ARunnableS44S0300000_11;
import Y.ATListenerS166S0000000_29;
import Y.AfS198S0100000_29;
import Y.AfS60S0110000_29;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.ss.android.ugc.aweme.challenge.recommend.RecommendHashTagViewModel;
import com.ss.android.ugc.aweme.challenge.trending.MusicTrendingHashtagViewModel;
import com.ss.android.ugc.aweme.creative.model.common.LogPbBean;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVSearchChallenge;
import com.ss.android.ugc.aweme.shortvideo.PublishBottomPanelViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.editpost.EditPostedVideoPublishActivity;
import com.ss.android.ugc.aweme.shortvideo.editpost.SceneWrapperFragment;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.ss.android.ugc.aweme.video.hashtag.feedback.KeyboardStateViewModel;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.ss.android.ugc.aweme.video.hashtag.helper.TitleHelper;
import com.ss.android.ugc.gamora.editor.recommendhashtag.SearchRecommendChallengeList;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lth.o;

/* JADX INFO: renamed from: X.117U, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C117U implements InterfaceC194467116j<AVChallenge>, InterfaceC194462116e, InterfaceC194502117s, Observer<C0RD4>, InterfaceC857400XkI {
    public final ViewGroup LL;
    public final RecyclerView LLILLJJLI;
    public final ViewGroup LLILLL;
    public final ViewGroup LLILZ;
    public final ViewGroup LLILZIL;
    public final C1749280vcc LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public final FrameLayout LLJ;
    public final C856850XjP LLJI;
    public String LLJIJIL;
    public final C111B LLJILJIL;
    public C194496117m LLJILJILJ;
    public C194498117o LLJILLL;
    public C194495117l LLJJ;
    public C194494117k LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public C117X LLJJIJIIJIL;
    public C1445580nim LLJJJ;
    public BaseTitleHelper LLJJJIL;
    public HashTagMobHelper LLJJJJ;
    public final String LLJJJJJIL;
    public int LLJJLIIIJLLLLLLLZ;
    public final KeyboardStateViewModel LLJLIL;
    public final PublishBottomPanelViewModel LLJLILLLLZIIL;
    public final Scene LLJLL;
    public final VideoPublishEditModel LLJLLIL;
    public final ArrayList<C117V> LLJJIJIL = new ArrayList<>();
    public boolean LLJJJJLIIL = false;
    public C20509915Nh LLJJL = null;
    public String LLJL = "";
    public C11JF LLJLLL = null;
    public IAVPublishExtension.IAddHashTagCallback LLJZ = null;
    public boolean LLJZIJLIL = false;
    public boolean LLL = false;
    public boolean LLLF = false;

    public final void LIZJ() {
        LJI(false);
        C786410Ut5.LJLZ(0, this.LLILZ);
        this.LLJJIJIL.clear();
        C117X c117x = this.LLJJIJIIJIL;
        if (c117x != null) {
            c117x.notifyDataSetChanged();
        }
    }

    public final Unit LJIIJ() {
        if (!TextUtils.isEmpty(this.LLJIJIL)) {
            LJIIIZ(this.LLJIJIL.substring(this.LLJIJIL.lastIndexOf(35) + 1), true);
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC194462116e
    public final void M5() {
        if (this.LLJZIJLIL && this.LLL) {
            return;
        }
        LJII(0);
        C786410Ut5.LLIZLLLIL(this.LLILLJJLI, 8);
        this.LLILZLL.LJ();
    }

    @Override // X.InterfaceC194462116e
    public final void LIZ(AVSearchChallengeList aVSearchChallengeList) {
        List<AVSearchChallenge> list;
        String imprId;
        if (this.LLJJIJI) {
            return;
        }
        if (aVSearchChallengeList != null) {
            LJ(aVSearchChallengeList.keyword, aVSearchChallengeList.logPb);
        }
        String queryId = null;
        if (aVSearchChallengeList == null) {
            list = null;
        } else {
            list = aVSearchChallengeList.items;
        }
        this.LLJJIJIL.clear();
        if (this.LLJJIII && !C0IKQ.LIZ(list)) {
            HashTagMobHelper hashTagMobHelper = this.LLJJJJ;
            if (hashTagMobHelper != null) {
                hashTagMobHelper.LLILLJJLI = aVSearchChallengeList.logPb;
                hashTagMobHelper.LLILZ = aVSearchChallengeList.keyword;
                hashTagMobHelper.LLILLL = aVSearchChallengeList.recommendWordMob;
            }
            this.LLJJIJIIJIL.LLIZ = aVSearchChallengeList.keyword;
            for (int i = 0; i < list.size(); i++) {
                this.LLJJIJIL.add(C117V.LIZ((AVSearchChallenge) ListProtector.get(list, i)));
            }
            HashTagMobHelper hashTagMobHelper2 = this.LLJJJJ;
            Integer numValueOf = Integer.valueOf(this.LLJJIJIL.size());
            hashTagMobHelper2.getClass();
            if (numValueOf != null) {
                numValueOf.intValue();
                C736480Suk c736480Suk = new C736480Suk();
                c736480Suk.LIZ("words_num", numValueOf.toString());
                c736480Suk.LIZ("words_source", "sug");
                c736480Suk.LIZ("search_position", "challenge_create");
                c736480Suk.LIZ("raw_query", hashTagMobHelper2.LLILZ);
                c736480Suk.LIZ("rank", "-1");
                RecommendWordMob recommendWordMob = hashTagMobHelper2.LLILLL;
                if (recommendWordMob != null) {
                    queryId = recommendWordMob.getQueryId();
                }
                c736480Suk.LIZ("query_id", queryId);
                LogPbBean logPbBean = hashTagMobHelper2.LLILLJJLI;
                if (logPbBean == null) {
                    imprId = "";
                } else {
                    imprId = logPbBean.getImprId();
                }
                c736480Suk.LIZ("impr_id", imprId);
                C20684815ws.LJIJ("trending_show", c736480Suk.LIZIZ());
            }
            LJII(8);
            C786410Ut5.LLIZLLLIL(this.LLILLJJLI, 0);
            LJI(true);
            C786410Ut5.LJLZ(8, this.LLILZ);
        } else {
            LJII(0);
            C786410Ut5.LLIZLLLIL(this.LLILLJJLI, 8);
            C1749280vcc c1749280vcc = this.LLILZLL;
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            this.LLILZLL.getContext();
            c1722300uv6.LJIIIIZZ = "  ";
            c1749280vcc.setStatus(c1722300uv6);
            LJI(false);
            C786410Ut5.LJLZ(0, this.LLILZ);
        }
        C117X c117x = this.LLJJIJIIJIL;
        if (c117x != null) {
            c117x.notifyDataSetChanged();
        }
    }

    public final void LIZLLL(boolean z) {
        Pair<String, String> pairLIZ = C1626990sRN.LIZ(this.LLILZLL.getContext());
        if (this.LLJJL == null) {
            this.LLJJL = new C20509915Nh(new AObjectS403S0100000_29(this, 4), new AObjectS403S0100000_29(this, 5), true);
        }
        this.LLJJL.LIZ();
        if (z) {
            LJII(8);
            C1626990sRN.LIZIZ(this.LLILZLL.getContext());
            return;
        }
        LJII(0);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_refresh;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        C1749280vcc c1749280vcc = this.LLILZLL;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        int iLIZ = C366700EZg.LIZ(72.0d);
        int iLIZ2 = C366700EZg.LIZ(72.0d);
        c1722300uv6.LIZLLL = iLIZ;
        c1722300uv6.LJ = iLIZ2;
        c1722300uv6.LJI = pairLIZ.getFirst();
        c1722300uv6.LJIIIIZZ = pairLIZ.getSecond();
        c1722300uv6.LJIIJ = new AObjectS372S0100000_29(this, 6);
        c1749280vcc.setStatus(c1722300uv6);
    }

    public final void LJFF(boolean z) {
        M5();
        C11PQ<SearchRecommendChallengeList> c11pq = C112C.LJIIL;
        C19475711Hn c19475711Hn = null;
        if (c11pq != null) {
            C19475711Hn c19475711Hn2 = new C19475711Hn(c11pq);
            if (!z) {
                LIZIZ(c19475711Hn2, true);
                return;
            }
        }
        C112C.LIZ.getClass();
        C112C.LIZIZ();
        C11PQ<SearchRecommendChallengeList> c11pq2 = C112C.LJIIL;
        if (c11pq2 != null) {
            c19475711Hn = new C19475711Hn(c11pq2);
        }
        if (c19475711Hn != null) {
            LIZIZ(c19475711Hn, false);
            return;
        }
        LJII(0);
        C1749280vcc c1749280vcc = this.LLILZLL;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        this.LLILZLL.getContext();
        c1722300uv6.LJIIIIZZ = "  ";
        c1749280vcc.setStatus(c1722300uv6);
        C786410Ut5.LLIZLLLIL(this.LLILLJJLI, 8);
    }

    public final void LJI(boolean z) {
        int i;
        boolean z2;
        int visibility = this.LLILLL.getVisibility();
        ViewGroup viewGroup = this.LLILLL;
        int i2 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLZ(i, viewGroup);
        if (visibility != this.LLILLL.getVisibility()) {
            PublishBottomPanelViewModel publishBottomPanelViewModel = this.LLJLILLLLZIIL;
            C890640Ywo c890640Ywo = new C890640Ywo(EnumC890650Ywp.HASHTAG, z);
            publishBottomPanelViewModel.getClass();
            C01TT.LIZLLL(new AwS415S0200000_14(publishBottomPanelViewModel, c890640Ywo, 53));
        }
        C111B c111b = this.LLJILJIL;
        if (c111b != null) {
            if (this.LL.getVisibility() != 0 && !z) {
                z2 = true;
            } else {
                z2 = false;
            }
            RecyclerView recyclerView = c111b.LIZLLL;
            if (recyclerView == null) {
                recyclerView = null;
            }
            if (z2 && c111b.LIZ().getItemCount() > 0) {
                i2 = 0;
            }
            C786410Ut5.LLIZLLLIL(recyclerView, i2);
        }
    }

    public final void LJII(int i) {
        FrameLayout frameLayout = this.LLJ;
        if (frameLayout != null) {
            C786410Ut5.LJZ(i, frameLayout);
        }
        C1749280vcc c1749280vcc = this.LLILZLL;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e7  */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r16) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117U.LJIIJJI(java.util.List):void");
    }

    @Override // X.InterfaceC194462116e
    public final void d7(Exception exc) {
        boolean z;
        LJII(0);
        if (C298190BmT.LIZ() && !C0XF1.LIZLLL(this.LLILZLL.getContext())) {
            if (this.LLILLJJLI.getAdapter() != null && this.LLILLJJLI.getAdapter().getItemCount() > 0) {
                z = true;
                C786410Ut5.LLIZLLLIL(this.LLILLJJLI, 0);
            } else {
                z = false;
                C786410Ut5.LLIZLLLIL(this.LLILLJJLI, 8);
            }
            this.LLJJJJLIIL = true;
            LIZLLL(z);
            return;
        }
        C786410Ut5.LLIZLLLIL(this.LLILLJJLI, 8);
        C1749280vcc c1749280vcc = this.LLILZLL;
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJIIIIZZ = this.LLILZLL.getContext().getString(R.string.m25);
        c1722300uv6.LJIIJ = new AObjectS372S0100000_29(this, 7);
        c1749280vcc.setStatus(c1722300uv6);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String str;
        C0RD4 c0rd42 = c0rd4;
        if (c0rd42 != null && TextUtils.equals(c0rd42.LIZ, InterfaceC194468116k.LIZ) && (str = this.LLJIJIL) != null && str.endsWith("#")) {
            LJIIIZ("", false);
        }
    }

    public static void LJ(String str, LogPbBean logPbBean) {
        C736480Suk c736480Suk = new C736480Suk();
        String json = "";
        if (str == null) {
            str = "";
        }
        c736480Suk.LIZ("search_keyword", str);
        if (logPbBean != null) {
            json = GsonProtectorUtils.toJson(o.LIZIZ, logPbBean);
        }
        c736480Suk.LIZ("log_pb", json);
        C20684815ws.LJIJJ("search_tag", c736480Suk.LIZIZ());
    }

    public final void LIZIZ(C19475711Hn c19475711Hn, boolean z) {
        C11JF c11jf = this.LLJLLL;
        if (c11jf != null && !c11jf.isDisposed()) {
            this.LLJLLL.dispose();
        }
        this.LLJLLL = (C11JF) c19475711Hn.LJJJLZIJ(C1701940uOG.LIZIZ()).LJL(C11S5.LIZ()).LJJLL(new AfS60S0110000_29(this, z, 0), new AfS198S0100000_29(this, 8));
    }

    public final void LJIIIZ(String str, boolean z) {
        String str2;
        this.LLJJJJLIIL = false;
        if (o.LJIIZILJ.LIZ() || ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLZLI().disableHashtagSearch) {
            return;
        }
        this.LLJI.getClass();
        if (C856850XjP.LJIIJ() && TextUtils.isEmpty(str)) {
            this.LLJI.getClass();
            if (this.LLJI.LJIIIIZZ() >= C856850XjP.LJI()) {
                C201955140j.LIZIZ("HashTagsModule", "updateChallengeList skipped: hashtag is up to limit");
                return;
            }
        }
        C786410Ut5.LJLZ(8, this.LLILZIL);
        LJI(true);
        if (TextUtils.isEmpty(str)) {
            this.LLL = true;
            if (C0BUA.LIZ()) {
                this.LLJJIJI = false;
                LJFF(z);
                return;
            } else {
                this.LLJJIJI = true;
                this.LLJJI.LIZ.LIZJ(1);
                return;
            }
        }
        this.LLL = false;
        this.LLJJIJI = false;
        C194495117l c194495117l = this.LLJJ;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        Fragment fragment = this.LLJI.LIZ.getFragment();
        if (fragment != null && (fragment instanceof SceneWrapperFragment)) {
            str2 = "edit_post";
        } else {
            str2 = "challenge_create";
        }
        objArr[1] = str2;
        c194495117l.LIZ.LIZJ(objArr);
    }

    public C117U(String str, C856850XjP c856850XjP, View view, Scene scene, VideoPublishEditModel videoPublishEditModel) {
        KeyboardStateViewModel keyboardStateViewModel;
        final C0ZI0 c0zi0;
        int i = 0;
        ArrayList arrayList = null;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLLIL = videoPublishEditModel;
        this.LLJLIL = (KeyboardStateViewModel) new ViewModelProvider(scene).get(KeyboardStateViewModel.class);
        this.LLJLILLLLZIIL = (PublishBottomPanelViewModel) new ViewModelProvider(scene).get(PublishBottomPanelViewModel.class);
        this.LLJLL = scene;
        this.LLJJJJJIL = str;
        this.LLJI = c856850XjP;
        c856850XjP.LJIIJJI = o.LJIIZILJ.getCurrentUserID();
        this.LLILLJJLI = (RecyclerView) view.findViewById(R.id.jgo);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.jh0);
        this.LL = (ViewGroup) view.findViewById(R.id.o7j);
        this.LLILZ = (ViewGroup) view.findViewById(R.id.ccd);
        this.LLILZIL = (ViewGroup) view.findViewById(R.id.adj);
        this.LLILZLL = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLIZ = view.findViewById(R.id.y9j);
        if (((Number) C296210BjH.LIZ.getValue()).intValue() != 0 && !(c856850XjP.LJIILL instanceof EditPostedVideoPublishActivity)) {
            VideoPublishEditModel videoPublishEditModel2 = c856850XjP.LJIIL;
            if (videoPublishEditModel2 != null && videoPublishEditModel2.getStructList() != null && c856850XjP.LJIIL.getStructList().size() >= 1) {
                ArrayList arrayList2 = new ArrayList();
                for (AVTextExtraStruct aVTextExtraStruct : c856850XjP.LJIIL.getStructList()) {
                    String str2 = aVTextExtraStruct.hashTagName;
                    if (str2 != null && !str2.isEmpty()) {
                        arrayList2.add(aVTextExtraStruct.hashTagName);
                    }
                }
                if (arrayList2.size() > 0) {
                    arrayList = arrayList2;
                }
            }
            this.LLJILJIL = new C111B(new C111C(view, this, str, arrayList, scene));
        }
        this.LLJ = (FrameLayout) view.findViewById(R.id.w2n);
        this.LLIZLLLIL = view.findViewById(R.id.u1a);
        View[] viewArr = {this.LLILLL, this.LL};
        do {
            View view2 = viewArr[i];
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view2.getLayoutParams();
            layoutParams.topMargin = (int) C11VU.LIZIZ(225, this.LLILLL.getContext());
            C786410Ut5.W5(view2, layoutParams);
            i++;
        } while (i < 2);
        HandlerHook.viewPost(view, new ARunnableS129S0100000_29(this, 86));
        C856850XjP c856850XjP2 = this.LLJI;
        if (c856850XjP2 != null && (keyboardStateViewModel = this.LLJLIL) != null && (c0zi0 = c856850XjP2.LIZIZ) != null) {
            keyboardStateViewModel.runOnUiThread(new ARunnableS44S0300000_11(new AObserverS178S0200000_14(c0zi0, new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: X.0Xjv
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    c0zi0.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                    if (z) {
                        C0ZI0 c0zi02 = c0zi0;
                        HandlerHook.viewPost(c0zi02, new ARunnableS114S0100000_14((Object) c0zi02, 23));
                    }
                }
            }, 3), keyboardStateViewModel, this.LLJLL, 23));
            KeyboardStateViewModel keyboardStateViewModel2 = this.LLJLIL;
            Scene scene2 = this.LLJLL;
            AObserverS231S0100000_29 aObserverS231S0100000_29 = new AObserverS231S0100000_29(c0zi0, 71);
            keyboardStateViewModel2.getClass();
            keyboardStateViewModel2.runOnUiThread(new ARunnableS44S0300000_11(aObserverS231S0100000_29, keyboardStateViewModel2, scene2, 22));
        }
    }

    public final void LJIIIIZZ(Fragment fragment, boolean z, C1445580nim c1445580nim, int i, String str, IAVPublishExtension.IAddHashTagCallback iAddHashTagCallback) {
        Long l;
        this.LLJJJ = c1445580nim;
        this.LLJJLIIIJLLLLLLLZ = i;
        this.LLJL = str;
        this.LLJZ = iAddHashTagCallback;
        Context context = fragment.getContext();
        if (C1388190mED.LIZIZ(context) != null) {
            HashTagMobHelper hashTagMobHelper = (HashTagMobHelper) C1659630tI1.LJFF(this.LLJLL).get(HashTagMobHelper.class);
            this.LLJJJJ = hashTagMobHelper;
            hashTagMobHelper.LL = this.LLJJJJJIL;
            hashTagMobHelper.LLILZLL = this.LLJJIJIL;
            BaseTitleHelper baseTitleHelper = (BaseTitleHelper) C1659630tI1.LJIIIIZZ(this.LLJLL, null, null, 6).get(TitleHelper.class);
            this.LLJJJIL = baseTitleHelper;
            this.LLJJJJ.LLILZIL = baseTitleHelper;
        }
        if (this.LLILLJJLI != null) {
            this.LLJJIJIIJIL = new C117X(this.LLJLL, this.LLJJIJIL, this, this.LLJLLIL, this.LLJLIL, this.LLJZ);
            this.LLILLJJLI.setLayoutManager(new LinearLayoutManager(context));
            this.LLILLJJLI.setAdapter(this.LLJJIJIIJIL);
        }
        FrameLayout frameLayout = this.LLJ;
        if (frameLayout != null) {
            frameLayout.setOnTouchListener(new ATListenerS166S0000000_29(5));
        }
        if (!C0BUA.LIZ()) {
            o.LIZLLL.getClass();
            C1255920ims c1255920ims = new C1255920ims();
            c1255920ims.LJIIJ(new AbstractC1255880imo<Challenge, ChallengeList>() { // from class: X.1167
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1255880imo
                public final List<Challenge> getItems() {
                    T t = this.mData;
                    if (t == 0) {
                        return null;
                    }
                    return ((ChallengeList) t).items;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1255880imo
                public final boolean isHasMore() {
                    T t = this.mData;
                    return t != 0 && ((ChallengeList) t).hasMore;
                }

                @Override // X.AbstractC666100QAu
                public final boolean checkParams(Object... objArr) {
                    if (objArr != null && objArr.length == 1) {
                        return true;
                    }
                    return false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v1, types: [T, com.ss.android.ugc.aweme.challenge.model.ChallengeList] */
                @Override // X.AbstractC666100QAu
                public final void handleData(Object obj) {
                    boolean z2;
                    ?? r6 = (ChallengeList) obj;
                    if (r6 != 0 && !C086I.LIZIZ(r6.items)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    this.mIsNewDataEmpty = z2;
                    if (!z2) {
                        int i2 = this.mListQueryType;
                        if (i2 != 1) {
                            if (i2 == 4) {
                                ((ChallengeList) this.mData).items.addAll(r6.items);
                                ChallengeList challengeList = (ChallengeList) this.mData;
                                challengeList.maxCursor = Math.min(challengeList.maxCursor, r6.maxCursor);
                                ChallengeList challengeList2 = (ChallengeList) this.mData;
                                challengeList2.hasMore = challengeList2.hasMore;
                                return;
                            }
                            return;
                        }
                        this.mData = r6;
                        return;
                    }
                    T t = this.mData;
                    if (t == 0) {
                        return;
                    }
                    ((ChallengeList) t).hasMore = false;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC1255880imo
                public final void loadMoreList(Object... objArr) {
                    long j;
                    if (!C311890CKl.LIZIZ.LIZJ()) {
                        long j2 = 0;
                        if (isDataEmpty()) {
                            j = 0;
                        } else {
                            j = ((ChallengeList) this.mData).maxCursor;
                        }
                        if (!isDataEmpty()) {
                            j2 = ((ChallengeList) this.mData).minCursor;
                        }
                        C1BVK.LIZIZ().LIZ(this.mHandler, new AnonymousClass1164(j, j2), 0);
                    }
                }

                @Override // X.AbstractC1255880imo
                public final void refreshList(Object... objArr) {
                    if (C311890CKl.LIZIZ.LIZJ()) {
                        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS154S0000000_29(0), 0);
                    } else {
                        C1BVK.LIZIZ().LIZ(this.mHandler, new AnonymousClass1164(0L, 0L), 0);
                    }
                }
            });
            c1255920ims.LLILLJJLI = new InterfaceC1212360hec() { // from class: X.116i
                @Override // X.InterfaceC1212360hec
                public final /* synthetic */ void SY() {
                }

                @Override // X.InterfaceC1212360hec
                public final /* synthetic */ void zK() {
                    throw null;
                }

                @Override // X.InterfaceC1212360hec
                public final void Jm() {
                    this.getClass();
                }

                @Override // X.InterfaceC1212360hec
                public final void LJ() {
                    this.getClass();
                }

                @Override // X.InterfaceC1212360hec
                public final void Ng1() {
                    ((C117U) this).LJIIJJI(null);
                }

                @Override // X.InterfaceC1212360hec
                public final void showLoadMoreLoading() {
                    this.getClass();
                }

                @Override // X.InterfaceC1212360hec
                public final void Uq2(Exception exc) {
                    this.getClass();
                }

                @Override // X.InterfaceC1212360hec
                public final void Wi(Exception exc) {
                    this.getClass();
                }

                @Override // X.InterfaceC1212360hec
                public final void bD1(Exception exc) {
                    this.getClass();
                }

                @Override // X.InterfaceC1212360hec
                public final void LLJJJIL(List list, boolean z2) {
                    ((C117U) this).LJIIJJI(C19881612qc.LIZ(C19881612qc.LIZLLL(list, new C194505117v())));
                }

                @Override // X.InterfaceC1212360hec
                public final void Pj(List list, boolean z2) {
                    InterfaceC194467116j interfaceC194467116j = this;
                    C19881612qc.LIZ(C19881612qc.LIZLLL(list, new C194505117v()));
                    interfaceC194467116j.getClass();
                }

                @Override // X.InterfaceC1212360hec
                public final void mE(List list, boolean z2) {
                    InterfaceC194467116j interfaceC194467116j = this;
                    C19881612qc.LIZ(C19881612qc.LIZLLL(list, new C194505117v()));
                    interfaceC194467116j.getClass();
                }
            };
            this.LLJJI = new C194494117k(c1255920ims);
        }
        o.LIZLLL.getClass();
        C194459116b c194459116b = new C194459116b();
        c194459116b.LJIIJ(new C116T());
        c194459116b.LLILLJJLI = new C194461116d(this);
        this.LLJJ = new C194495117l(c194459116b);
        this.LLJI.LJIILIIL(z);
        final C0ZI0 c0zi0 = this.LLJI.LIZIZ;
        c0zi0.addTextChangedListener(new C856950XjZ() { // from class: X.0XkH
            @Override // X.C856950XjZ, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                String strGroup;
                super.afterTextChanged(editable);
                C0ZI0 c0zi02 = c0zi0;
                if (c0zi02.LLLLIL) {
                    c0zi02.LLLLIILLL = false;
                    return;
                }
                String str2 = this.LLILLL.LLJIJIL;
                String strSubstring = "";
                if (str2 != null && str2.endsWith("#")) {
                    this.LLILLL.LJIIIZ("", false);
                } else {
                    C117U c117u = this.LLILLL;
                    String noAdTagText = c0zi0.getNoAdTagText();
                    C0ZI0 c0zi03 = c117u.LLJI.LIZIZ;
                    int iMin = Math.min(c0zi03.getSelectionStart(), noAdTagText.length());
                    if (c0zi03.LLLLIILLL) {
                        c117u.LLLF = true;
                        iMin = Math.min(c0zi03.LLLLILI, noAdTagText.length());
                    }
                    if (!TextUtils.isEmpty(noAdTagText)) {
                        int i2 = iMin - 1;
                        int length = noAdTagText.length();
                        while (i2 >= 0) {
                            char cCharAt = noAdTagText.charAt(i2);
                            if (cCharAt != ' ' && cCharAt != '@' && cCharAt != '\n') {
                                if (cCharAt == '#') {
                                    break;
                                } else {
                                    i2--;
                                }
                            } else {
                                break;
                            }
                        }
                        int i3 = iMin;
                        while (i3 < length) {
                            char cCharAt2 = noAdTagText.charAt(i3);
                            if (cCharAt2 == '#' || cCharAt2 == ' ' || cCharAt2 == '@' || cCharAt2 == '\n') {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i2 >= 0 && i3 <= length && i2 < i3) {
                            Matcher matcher = PatternProtector.compile(C856940XjY.LJ()).matcher(noAdTagText.substring(i2, i3));
                            if (!matcher.find()) {
                                strGroup = "";
                            } else {
                                strGroup = matcher.group();
                            }
                            if (strGroup.length() < iMin - i2) {
                                C201955140j.LIZIZ("HashTagsModule", "selection start is out of hashtag");
                            } else {
                                strSubstring = noAdTagText.substring(i2, i3);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(strSubstring)) {
                        this.LLILLL.LLJJIII = true;
                        this.LLILLL.LJIIIZ(strSubstring.substring(strSubstring.lastIndexOf(35) + 1), false);
                    } else {
                        C117U c117u2 = this.LLILLL;
                        if (c117u2.LLLF) {
                            c117u2.LLLF = false;
                        } else {
                            c117u2.LIZJ();
                        }
                    }
                }
                c0zi0.LLLLIILLL = false;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("HashTagsModule");
            }

            @Override // X.C856950XjZ, android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                super.beforeTextChanged(charSequence, i2, i3, i4);
            }

            @Override // X.C856950XjZ, android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                List<? extends C117V> list;
                String str2;
                super.onTextChanged(charSequence, i2, i3, i4);
                if (C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhtMPWgbgcDunV2Ky5uC0=", null)) != null) {
                    this.LLILLL.LLJIJIL = c0zi0.getNoAdTagText();
                } else {
                    this.LLILLL.LLJIJIL = "";
                }
                C117U c117u = this.LLILLL;
                BaseTitleHelper baseTitleHelper2 = c117u.LLJJJIL;
                if (baseTitleHelper2 != null) {
                    String str3 = c117u.LLJIJIL;
                    baseTitleHelper2.LL = str3;
                    int iLJJJJ = a0.LJJJJ(str3, '#', 0, 6);
                    if (iLJJJJ != -1) {
                        baseTitleHelper2.LLILLJJLI = a0.LJLJJI(str3.substring(0, iLJJJJ), '#');
                    }
                }
                if (C856940XjY.LIZJ(this.LLILLL.LLJIJIL)) {
                    this.LLILLL.LLJJIII = true;
                    return;
                }
                if (this.LLILLL.LLJIJIL.endsWith("#")) {
                    C117U c117u2 = this.LLILLL;
                    c117u2.LLJJIII = true;
                    if (i4 == 0) {
                        str2 = "clear_to_sharp";
                    } else {
                        str2 = "input_sharp";
                    }
                    HashTagMobHelper hashTagMobHelper2 = c117u2.LLJJJJ;
                    if (hashTagMobHelper2 == null) {
                        return;
                    }
                    hashTagMobHelper2.zQ2(str2);
                    return;
                }
                C117U c117u3 = this.LLILLL;
                if (c117u3.LLJJIII && !c117u3.LLJIJIL.isEmpty()) {
                    C117U c117u4 = this.LLILLL;
                    HashTagMobHelper hashTagMobHelper3 = c117u4.LLJJJJ;
                    if (hashTagMobHelper3 != null) {
                        VideoPublishEditModel videoPublishEditModel = c117u4.LLJLLIL;
                        String str4 = c117u4.LLJL;
                        if (hashTagMobHelper3.LLILZ != null && (list = hashTagMobHelper3.LLILZLL) != null && !list.isEmpty()) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= list.size()) {
                                    break;
                                }
                                C117V c117v = (C117V) ListProtector.get(list, i5);
                                if (Intrinsics.LJFF(hashTagMobHelper3.LLILZ, c117v.LIZ.challengeName)) {
                                    hashTagMobHelper3.xQ2("input_sharp", c117v, Integer.valueOf(i5), "input", videoPublishEditModel, str4);
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    C117U c117u5 = this.LLILLL;
                    IAVPublishExtension.IAddHashTagCallback iAddHashTagCallback2 = c117u5.LLJZ;
                    if (iAddHashTagCallback2 != null) {
                        iAddHashTagCallback2.onHashTagUpdate(c117u5.LLJJJIL.LL);
                    }
                }
                C117U c117u6 = this.LLILLL;
                c117u6.LLJJIII = false;
                c117u6.LIZJ();
            }
        });
        if (!C0BUA.LIZ()) {
            this.LLJJJJLIIL = false;
            o.LIZLLL.getClass();
            RecommendHashTagViewModel recommendHashTagViewModel = (RecommendHashTagViewModel) ViewModelProviders.of(fragment).get(RecommendHashTagViewModel.class);
            this.LLJILJILJ = new C194496117m(recommendHashTagViewModel);
            recommendHashTagViewModel.vQ2(this.LLJJJ);
        }
        if (((Number) C273260AnM.LIZ.getValue()).intValue() == 1) {
            o.LIZLLL.getClass();
            MusicTrendingHashtagViewModel musicTrendingHashtagViewModel = (MusicTrendingHashtagViewModel) new ViewModelProvider(fragment).get(MusicTrendingHashtagViewModel.class);
            this.LLJILLL = new C194498117o(musicTrendingHashtagViewModel);
            C1445580nim c1445580nim2 = this.LLJJJ;
            if (c1445580nim2 != null && (l = c1445580nim2.LJ) != null) {
                long jLongValue = l.longValue();
                musicTrendingHashtagViewModel.getClass();
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(musicTrendingHashtagViewModel), C0PEM.LIZJ, null, new C0NRV(jLongValue, musicTrendingHashtagViewModel, null), 2);
            }
        }
    }
}
