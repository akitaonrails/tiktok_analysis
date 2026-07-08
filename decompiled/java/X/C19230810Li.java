package X;

import Y.AObjectS402S0100000_28;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.feed.guide.EmptyGuideV2;
import com.ss.android.ugc.aweme.feed.guide.GalleryLayoutManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.panel.FollowFeedFragmentPanelMT;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFollowFragment;
import com.ss.android.ugc.aweme.friends.model.SuperAccountList;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeGalleryLayoutManager;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePanelComponentTempHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.10Li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19230810Li extends C728670Si9<C19231110Ll, EmptyGuideV2> implements InterfaceC1526205yG {
    public boolean LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1526205yG
    public final void onSuccess() {
        List<Aweme> listLLZZZIL;
        this.LLILLL = false;
        EmptyGuideV2 emptyGuideV2 = (EmptyGuideV2) this.LLILLJJLI;
        SuperAccountList superAccountList = (SuperAccountList) ((AbstractC728630Si5) this.LL).LLILLJJLI;
        C1749280vcc c1749280vcc = emptyGuideV2.LLILZ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        if (superAccountList == null || superAccountList.getUserList() == null || superAccountList.getUserList().size() < 1) {
            InterfaceC1581880rGc interfaceC1581880rGc = emptyGuideV2.LLJILJIL;
            if (interfaceC1581880rGc != null) {
                interfaceC1581880rGc.setRefreshing(false);
            }
            C10LZ c10lz = emptyGuideV2.LLILZIL;
            if (c10lz != null) {
                c10lz.LLJJIJIL = false;
                C786410Ut5.T(c10lz, 8);
                emptyGuideV2.LLILZIL.LJ();
            }
            C786410Ut5.U(emptyGuideV2.LLILLL, 8);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.ng;
            C1749280vcc c1749280vccLJIIIIZZ = emptyGuideV2.LJIIIIZZ();
            C1749280vcc c1749280vccLJIIIIZZ2 = emptyGuideV2.LJIIIIZZ();
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            Drawable drawableLIZ = c0hti.LIZ(c1749280vccLJIIIIZZ.getContext());
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            c1722300uv6.LJI = c1749280vccLJIIIIZZ.getContext().getString(R.string.jq2);
            c1722300uv6.LJIIIIZZ = c1749280vccLJIIIIZZ.getContext().getString(2131834842);
            c1749280vccLJIIIIZZ2.setStatus(c1722300uv6);
            C786410Ut5.LLLZLZ(c1749280vccLJIIIIZZ, 0);
            return;
        }
        LogPbBean logPbBean = superAccountList.logPb;
        emptyGuideV2.LLIZLLLIL = logPbBean == null ? "" : logPbBean.getImprId();
        ArrayList arrayList = new ArrayList();
        if (C296570Bjr.LIZIZ()) {
            for (UserWithAweme userWithAweme : superAccountList.getUserList()) {
                if (userWithAweme != null && userWithAweme.getUser() != null) {
                    arrayList.add(userWithAweme);
                }
            }
        } else {
            for (UserWithAweme userWithAweme2 : superAccountList.getUserList()) {
                if (userWithAweme2 != null && userWithAweme2.getUser() != null && userWithAweme2.getAweme() != null) {
                    arrayList.add(userWithAweme2);
                }
            }
        }
        C10LZ c10lzLJII = emptyGuideV2.LJII();
        if (c10lzLJII.LLILZIL) {
            RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager = c10lzLJII.LLJ;
            if (recSwipeGalleryLayoutManager != null) {
                recSwipeGalleryLayoutManager.LLILZIL = 0;
            }
        } else {
            GalleryLayoutManager galleryLayoutManager = c10lzLJII.LLIZ;
            if (galleryLayoutManager != null) {
                galleryLayoutManager.LLILZ = 0;
            }
        }
        emptyGuideV2.LJII().setData(arrayList);
        emptyGuideV2.LJII().setOnItemOperationListener(new C10LY(emptyGuideV2));
        InterfaceC1581880rGc interfaceC1581880rGc2 = emptyGuideV2.LLJILJIL;
        if (interfaceC1581880rGc2 != null) {
            interfaceC1581880rGc2.setRefreshing(false);
        }
        emptyGuideV2.LLJI.getClass();
        FollowFeedFragmentPanelMT followFeedFragmentPanelMT = ((FeedFollowFragment) emptyGuideV2.LLJI).LLJJJ;
        if (followFeedFragmentPanelMT != null && (listLLZZZIL = followFeedFragmentPanelMT.LLZZZIL()) != null && !listLLZZZIL.isEmpty()) {
            emptyGuideV2.LIZIZ();
            return;
        }
        emptyGuideV2.LJIIJJI();
        C786410Ut5.U(emptyGuideV2.LLILLL, 0);
        C10LZ c10lzLJII2 = emptyGuideV2.LJII();
        if (c10lzLJII2.getPendingFirstLayout()) {
            C786410Ut5.T(c10lzLJII2, 4);
        } else {
            C786410Ut5.T(c10lzLJII2, 0);
        }
        c10lzLJII2.setOnViewFirstShowListener(emptyGuideV2);
        BaseFeedListFragment baseFeedListFragment = (BaseFeedListFragment) emptyGuideV2.LLJI;
        if (baseFeedListFragment.Ew0() != null) {
            ((LoadMorePanelComponentTempHelper) baseFeedListFragment.Ew0()).DR0();
        }
        C1440005kM.LIZ(new C487960JBq(true));
    }

    @Override // X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        this.LLILLL = false;
        EmptyGuideV2 emptyGuideV2 = (EmptyGuideV2) this.LLILLJJLI;
        C1749280vcc c1749280vcc = emptyGuideV2.LLILZ;
        if (c1749280vcc != null) {
            C786410Ut5.LLLZLZ(c1749280vcc, 8);
        }
        InterfaceC1581880rGc interfaceC1581880rGc = emptyGuideV2.LLJILJIL;
        if (interfaceC1581880rGc != null) {
            interfaceC1581880rGc.setRefreshing(false);
        }
        if (exc instanceof C0XIO) {
            emptyGuideV2.LIZIZ();
            return;
        }
        if (C1354920lMY.LIZJ(emptyGuideV2.LLIZ, exc)) {
            return;
        }
        InterfaceC1581880rGc interfaceC1581880rGc2 = emptyGuideV2.LLJILJIL;
        if (interfaceC1581880rGc2 != null) {
            interfaceC1581880rGc2.setRefreshing(false);
        }
        C10LZ c10lz = emptyGuideV2.LLILZIL;
        if (c10lz != null) {
            c10lz.LLJJIJIL = false;
            C786410Ut5.T(c10lz, 8);
            emptyGuideV2.LLILZIL.LJ();
        }
        C786410Ut5.U(emptyGuideV2.LLILLL, 8);
        C1749280vcc c1749280vccLJIIIIZZ = emptyGuideV2.LJIIIIZZ();
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        C1893080zMY.LJFF(c1722300uv6, new AObjectS402S0100000_28(emptyGuideV2, 5));
        c1749280vccLJIIIIZZ.setStatus(c1722300uv6);
        C786410Ut5.LLLZLZ(c1749280vccLJIIIIZZ, 0);
    }

    public C19230810Li(C19231110Ll c19231110Ll, EmptyGuideV2 emptyGuideV2) {
        super(c19231110Ll, emptyGuideV2);
        ((AbstractC728630Si5) this.LL).LIZ(this);
    }
}
