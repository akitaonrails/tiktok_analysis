package X;

import Y.ACListenerS145S0100000_10;
import Y.AObserverS214S0100000_10;
import Y.ATListenerS444S0100000_10;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import avg.f;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomGeneralSearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchPreloadLayoutOptConfig;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS589S0100000_10;
import mf.a;

/* JADX INFO: renamed from: X.0PUE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PUE extends AbstractC645560PTu {
    public final ClickSearchViewModel LJII;
    public final C0PUC LJIIIIZZ;
    public final ViewStub LJIIIZ;
    public C653660PkS LJIIJ;
    public C0PX3 LJIIJJI;
    public List<? extends View> LJIIL;

    public final C0PX3 LJIIIZ() {
        View viewLJLLLL;
        C0PX3 c0px3;
        C0PX3 c0px32;
        ViewGroup viewGroup;
        if (this.LJIIJJI == null && this.LJIIIZ.getParent() != null) {
            this.LJIIIZ.setLayoutResource(R.layout.evg);
            ViewStub viewStub = this.LJIIIZ;
            C0PUQ.LIZ.getClass();
            if (((SearchPreloadLayoutOptConfig) C0PUQ.LIZJ.getValue()).enableViewStubPreload) {
                ViewParent parent = viewStub.getParent();
                if (!(parent instanceof ViewGroup) || (viewGroup = (ViewGroup) parent) == null) {
                    viewLJLLLL = null;
                } else {
                    int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                    C650520PfO c650520PfO = C650520PfO.LIZ;
                    Context context = viewGroup.getContext();
                    c650520PfO.getClass();
                    viewLJLLLL = C650520PfO.LIZIZ(context, R.layout.evg, viewGroup, false);
                    C786410Ut5.LJJLJLI(viewStub, viewGroup);
                    ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                    if (layoutParams != null) {
                        viewGroup.addView(viewLJLLLL, iIndexOfChild, layoutParams);
                    } else {
                        viewGroup.addView(viewLJLLLL, iIndexOfChild);
                    }
                }
            } else {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            }
            if (!(viewLJLLLL instanceof C0PX3) || (c0px3 = (C0PX3) viewLJLLLL) == null) {
                return null;
            }
            this.LJIIJJI = c0px3;
            int visibility = c0px3.getVisibility();
            c0px3.setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, c0px3);
            c0px3.setAlwaysShowingViews(this.LJIIL);
            c0px3.setOnCloseClickListener(new AwS589S0100000_10(this, 21));
            View.OnClickListener aCListenerS145S0100000_10 = new ACListenerS145S0100000_10(this, 5);
            if (C1848410yCV.LIZ) {
                aCListenerS145S0100000_10 = new f(aCListenerS145S0100000_10);
            }
            a aVar = new a(aCListenerS145S0100000_10);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c0px3);
            }
            c0px3.setOnClickListener(aVar);
            if (C0BRL.LIZ() && (c0px32 = this.LJIIJJI) != null) {
                c0px32.setOnTouchListener(new ATListenerS444S0100000_10(this, 0));
            }
        }
        return this.LJIIJJI;
    }

    @Override // X.AbstractC645560PTu
    public final ClickSearchViewModel LJ() {
        return this.LJII;
    }

    @Override // X.AbstractC645560PTu
    public final void LIZJ(Aweme aweme) {
        if (C1202104n5.LIZ().LJII()) {
            String aid = null;
            C1202104n5.LIZ().LJIILIIL("begin", null, null);
            if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJJZ(aweme)) {
                IEcomGeneralSearchService iEcomGeneralSearchServiceLIZ = C1202104n5.LIZ();
                String message = C0PQG.AWEME_HAS_ANCHOR.getMessage();
                if (aweme != null) {
                    aid = aweme.getAid();
                }
                iEcomGeneralSearchServiceLIZ.LJIILIIL("fail", message, aid);
                return;
            }
            IEcomGeneralSearchService iEcomGeneralSearchServiceLIZ2 = C1202104n5.LIZ();
            String message2 = C0PQG.WATCH_DURATION_LESS_THAN_THRESHOLD.getMessage();
            if (aweme != null) {
                aid = aweme.getAid();
            }
            iEcomGeneralSearchServiceLIZ2.LJIILIIL("fail", message2, aid);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    public final void LJIIJ(String str, EnumC1999307sN enumC1999307sN) {
        EnumC645590PTx enumC645590PTxLIZLLL;
        String uid;
        C13LG<Long> c13lg;
        InterfaceC644900PRg interfaceC644900PRgLJFF;
        Aweme awemeLJIIIIZZ = this.LJIIIIZZ.LJIIIIZZ();
        if (awemeLJIIIIZZ == null) {
            return;
        }
        ISearchSurvey iSearchSurveyLIZ = C0QF5.LIZ();
        if (iSearchSurveyLIZ != null && (interfaceC644900PRgLJFF = iSearchSurveyLIZ.LJFF()) != null && interfaceC644900PRgLJFF.LIZ(awemeLJIIIIZZ)) {
            return;
        }
        if (awemeLJIIIIZZ.isAd()) {
            C1202104n5.LIZ().LJJ(this.LIZ, awemeLJIIIIZZ.getAid(), "fail", "aweme is ad", Boolean.TRUE);
            return;
        }
        SearchResultParam searchResultParamI = this.LJIIIIZZ.I();
        if (searchResultParamI != null) {
            ClickSearchViewModel clickSearchViewModel = this.LJII;
            EnumC645610PTz enumC645610PTz = this.LIZ;
            clickSearchViewModel.getClass();
            if (ClickSearchViewModel.AQ2(enumC645610PTz)) {
                C0PX3 c0px3LJIIIZ = LJIIIZ();
                if (c0px3LJIIIZ != null) {
                    c0px3LJIIIZ.LIZ();
                }
                this.LJII.DQ2(this.LJIIIIZZ.k2());
                if (enumC1999307sN == EnumC1999307sN.AUTO_PLAY) {
                    enumC645590PTxLIZLLL = EnumC645590PTx.GENERAL;
                } else {
                    enumC645590PTxLIZLLL = LIZLLL(this.LIZ, awemeLJIIIIZZ);
                }
                if (enumC645590PTxLIZLLL == EnumC645590PTx.ECOM) {
                    RelatedProductInfo relatedProductInfoLJLLI = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLLI(awemeLJIIIIZZ.getAid(), AwemeExtKt.getAuthorUid(awemeLJIIIIZZ));
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = new Pair("video_id", awemeLJIIIIZZ.getAid());
                    User author = awemeLJIIIIZZ.getAuthor();
                    Object arrayList = "";
                    if (author == null || (uid = author.getUid()) == null) {
                        uid = "";
                    }
                    pairArr[1] = new Pair("author_id", uid);
                    pairArr[2] = new Pair("timestamp", Integer.valueOf((int) (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))));
                    pairArr[3] = new Pair("is_src", Boolean.TRUE);
                    if (relatedProductInfoLJLLI != null && (c13lg = relatedProductInfoLJLLI.productIdList) != null) {
                        arrayList = new ArrayList(C15438062q.LJIJJ(c13lg, 10));
                        Iterator<Long> it2 = c13lg.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(String.valueOf(it2.next().longValue()));
                        }
                    }
                    pairArr[4] = new Pair("product_id_list", arrayList);
                    LJII(searchResultParamI.getKeyword(), awemeLJIIIIZZ.getAid(), this.LJIIIIZZ.k2(), C2097608Jq.LJIIJ(pairArr), enumC645590PTxLIZLLL, null);
                    return;
                }
                LJII(searchResultParamI.getKeyword(), awemeLJIIIIZZ.getAid(), this.LJIIIIZZ.k2(), null, enumC645590PTxLIZLLL, new C0PUB("mix", "video", enumC1999307sN.getValue()));
            }
        }
    }

    public C0PUE(ClickSearchViewModel clickSearchViewModel, C0PUC c0puc, ViewStub viewStub) {
        Fragment fragment;
        super(EnumC645610PTz.VIDEO_IN_MIX_FEED, clickSearchViewModel);
        this.LJII = clickSearchViewModel;
        this.LJIIIIZZ = c0puc;
        this.LJIIIZ = viewStub;
        this.LJII.BQ2(new AObserverS214S0100000_10(this, 0));
        AObserverS214S0100000_10 aObserverS214S0100000_10 = new AObserverS214S0100000_10(this, 1);
        WeakReference<Fragment> weakReference = clickSearchViewModel.LL;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            C325901Of.LIZJ(clickSearchViewModel.xQ2(), fragment, aObserverS214S0100000_10);
        }
    }
}
