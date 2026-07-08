package Y;

import X.AbstractC738140SxQ;
import X.C01GW;
import X.C0RDX;
import X.C0SLX;
import X.C0SM8;
import X.C0SPO;
import X.C0SRL;
import X.C0SZ8;
import X.C1768000w6o;
import X.C1C7U;
import X.C690870R8b;
import X.C692070RCr;
import X.C692090RCt;
import X.C707280Rok;
import X.C711330RvH;
import X.C719660SKu;
import X.C724240Sb0;
import X.InterfaceC691660RBc;
import X.InterfaceC719700SKy;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewCell;
import com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedDataLoadLogicComponent;
import com.ss.android.ugc.aweme.feed.landscape.component.LandscapeFeedViewPagerComponent;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSwipeHintAssem;
import com.ss.android.ugc.aweme.ui.feed.subphoto.holders.PhotosViewHolderV3;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment;
import com.ss.android.ugc.aweme.ui.view.photos.PostModePhotosComponent;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS22S0101000_11 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C0SM8 c0sm8;
        boolean zLJJI = ((PhotosViewHolderV3) this.l0).LJJI();
        if (((PhotosViewHolderV3) this.l0).LJJIII() && (c0sm8 = ((PhotosViewHolderV3) this.l0).LLJ) != null) {
            c0sm8.LIZIZ(this.i1);
        }
        if (zLJJI) {
            C0SM8 c0sm82 = ((PhotosViewHolderV3) this.l0).LLJ;
            if (c0sm82 != null) {
                c0sm82.LJ(this.i1);
                return;
            }
            return;
        }
        C0SM8 c0sm83 = ((PhotosViewHolderV3) this.l0).LLJ;
        if (c0sm83 != null) {
            c0sm83.LIZJ(this.i1);
        }
    }

    public final void LIZ$1() {
        C690870R8b c690870R8bJm;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        VideoViewCell videoViewCell = (VideoViewCell) this.l0;
        int i = this.i1;
        Aweme aweme = videoViewCell.LLJJ;
        C01GW c01gw = C692070RCr.LIZ;
        RootCellComponent rootCellComponent = videoViewCell.LLZZZZ;
        C690870R8b c690870R8bJm2 = rootCellComponent != null ? rootCellComponent.jm() : null;
        int iHashCode = 0;
        C692090RCt c692090RCtLIZLLL = C692070RCr.LIZLLL(String.valueOf(c690870R8bJm2 != null ? c690870R8bJm2.hashCode() : 0), "RootCellComponent", "onHolderSelected");
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(videoViewCell.LLZZZZ);
        if (assemSupervisorLJ != null && (copyOnWriteArrayList = assemSupervisorLJ.LLJILLL) != null) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof InterfaceC691660RBc) {
                    arrayList.add(abstractC738140SxQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0RDX.LIZ((InterfaceC691660RBc) it2.next(), i, aweme);
            }
        }
        C01GW c01gw2 = C692070RCr.LIZ;
        RootCellComponent rootCellComponent2 = videoViewCell.LLZZZZ;
        if (rootCellComponent2 != null && (c690870R8bJm = rootCellComponent2.jm()) != null) {
            iHashCode = c690870R8bJm.hashCode();
        }
        C692070RCr.LIZ(c692090RCtLIZLLL, String.valueOf(iHashCode), null, null);
    }

    public final void LIZ$2() {
        for (CardTypeRequest cardTypeRequest : (List) this.l0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("card_type", Integer.valueOf(cardTypeRequest.cardType));
            linkedHashMap.put("feed_count", Integer.valueOf(this.i1));
            C1768000w6o.LIZ.getClass();
            C1768000w6o.LIZIZ("rd_tiktokec_special_shaped_card_client_send_request", linkedHashMap);
        }
    }

    public static final void run$0(ARunnableS22S0101000_11 aRunnableS22S0101000_11) {
        boolean zLIZ;
        C1C7U.LIZ("PhotosViewHolderV3@b6aa.judgeBlackScreenWithDelay$1");
        try {
            aRunnableS22S0101000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotosViewHolderV3@b6aa.judgeBlackScreenWithDelay$1");
    }

    public static final void run$1(ARunnableS22S0101000_11 aRunnableS22S0101000_11) {
        boolean zLIZ;
        C0SM8 c0sm8;
        C1C7U.LIZ("PhotosViewHolderV3@b6aa.judgeBlackScreenWithDelay$2");
        try {
            if (((PhotosViewHolderV3) aRunnableS22S0101000_11.l0).LJJII() && (c0sm8 = ((PhotosViewHolderV3) aRunnableS22S0101000_11.l0).LLJ) != null) {
                c0sm8.LIZ(aRunnableS22S0101000_11.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotosViewHolderV3@b6aa.judgeBlackScreenWithDelay$2");
    }

    public static final void run$10(ARunnableS22S0101000_11 aRunnableS22S0101000_11) {
        boolean zLIZ;
        C1C7U.LIZ("FeedCollectionProgressBarComponent@a3f6.progressBar$1$1");
        try {
            C707280Rok c707280Rok = (C707280Rok) aRunnableS22S0101000_11.l0;
            if (c707280Rok != null) {
                c707280Rok.setMaxProgressCount(aRunnableS22S0101000_11.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedCollectionProgressBarComponent@a3f6.progressBar$1$1");
    }

    public static final void run$2(ARunnableS22S0101000_11 aRunnableS22S0101000_11) {
        boolean zLIZ;
        C1C7U.LIZ("VideoViewCell@c979.onViewHolderSelected$1");
        try {
            aRunnableS22S0101000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VideoViewCell@c979.onViewHolderSelected$1");
    }

    public static final void run$3(ARunnableS22S0101000_11 aRunnableS22S0101000_11) {
        boolean zLIZ;
        C1C7U.LIZ("LandscapeFeedViewPagerComponent@fbaa.onViewCreated$2$onPageSelected$1");
        try {
            LandscapeFeedViewPagerComponent landscapeFeedViewPagerComponent = (LandscapeFeedViewPagerComponent) aRunnableS22S0101000_11.l0;
            landscapeFeedViewPagerComponent.LLJJ = landscapeFeedViewPagerComponent.LJLIL();
            C0SZ8 c0sz8 = ((LandscapeFeedViewPagerComponent) aRunnableS22S0101000_11.l0).LLJJ;
            if (c0sz8 != null) {
                c0sz8.LJJIJIIJIL(aRunnableS22S0101000_11.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LandscapeFeedViewPagerComponent@fbaa.onViewCreated$2$onPageSelected$1");
    }

    public static final void run$4(ARunnableS22S0101000_11 aRunnableS22S0101000_11) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeDetailPageFragment@e63.tryAttachPlayedListener$1");
        try {
            ((PostModeDetailPageFragment) aRunnableS22S0101000_11.l0).ZR(aRunnableS22S0101000_11.i1 - 1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeDetailPageFragment@e63.tryAttachPlayedListener$1");
    }

    public static final void run$5(ARunnableS22S0101000_11 aRunnableS22S0101000_11) {
        boolean zLIZ;
        C1C7U.LIZ("FeedEcCardLogger@28fe.trackClientAddCardType$1$invoke$$inlined$runOnWorkerThread$1");
        try {
            aRunnableS22S0101000_11.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedEcCardLogger@28fe.trackClientAddCardType$1$invoke$$inlined$runOnWorkerThread$1");
    }

    public static final void run$6(ARunnableS22S0101000_11 aRunnableS22S0101000_11) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoFeedLayoutHooker@f5d7.updateInfoBottomMarginSafe$1");
        try {
            InterfaceC719700SKy interfaceC719700SKy = ((C719660SKu) aRunnableS22S0101000_11.l0).LJJZ;
            if (interfaceC719700SKy != null) {
                interfaceC719700SKy.LIZJ(aRunnableS22S0101000_11.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoFeedLayoutHooker@f5d7.updateInfoBottomMarginSafe$1");
    }

    public static final void run$7(ARunnableS22S0101000_11 aRunnableS22S0101000_11) {
        boolean zLIZ;
        String str;
        C1C7U.LIZ("PostModePhotosComponent@3b97.preloadHorizontalPhotos$1");
        try {
            C0SRL c0srl = ((PostModePhotosComponent) aRunnableS22S0101000_11.l0).LL;
            PostModeDetailParams postModeDetailParams = c0srl.LJII;
            if (postModeDetailParams != null) {
                str = postModeDetailParams.eventType;
            } else {
                str = null;
            }
            C0SPO.LJFF(c0srl.LIZLLL(), ((PostModePhotosComponent) aRunnableS22S0101000_11.l0).LLILLJJLI.getAweme(), str, aRunnableS22S0101000_11.i1, true);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModePhotosComponent@3b97.preloadHorizontalPhotos$1");
    }

    public static final void run$8(ARunnableS22S0101000_11 aRunnableS22S0101000_11) {
        boolean zLIZ;
        int count;
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbilityM196do;
        VerticalViewPager verticalViewPagerSP1;
        C1C7U.LIZ("LandscapeFeedDataLoadLogicComponent@ee72.loadingStatus$1");
        try {
            int i = aRunnableS22S0101000_11.i1;
            C711330RvH c711330RvH = ((LandscapeFeedDataLoadLogicComponent) aRunnableS22S0101000_11.l0).LLJILLL;
            if (c711330RvH != null) {
                count = c711330RvH.getCount();
            } else {
                count = -1;
            }
            if (i < count - 1 && ((LandscapeFeedDataLoadLogicComponent) aRunnableS22S0101000_11.l0).m196do() != null && (landscapeFeedViewPagerAbilityM196do = ((LandscapeFeedDataLoadLogicComponent) aRunnableS22S0101000_11.l0).m196do()) != null && (verticalViewPagerSP1 = landscapeFeedViewPagerAbilityM196do.sP1()) != null) {
                verticalViewPagerSP1.setCurrentItemWithDefaultVelocity(aRunnableS22S0101000_11.i1 + 1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LandscapeFeedDataLoadLogicComponent@ee72.loadingStatus$1");
    }

    public static final void run$9(ARunnableS22S0101000_11 aRunnableS22S0101000_11) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoSwipeHintAssem@e571.showSwipeHintAnimation$2$1$1");
        try {
            C0SLX c0slx = ((PhotoSwipeHintAssem) aRunnableS22S0101000_11.l0).LLJJL;
            if (c0slx != null) {
                c0slx.scrollTo(aRunnableS22S0101000_11.i1, 0);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoSwipeHintAssem@e571.showSwipeHintAnimation$2$1$1");
    }

    public ARunnableS22S0101000_11(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
