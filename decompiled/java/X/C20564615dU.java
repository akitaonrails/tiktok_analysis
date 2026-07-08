package X;

import com.ss.android.ugc.aweme.videoadaption.adaptioncontext.VideoAdaptionManagerContext;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedVideoAdaptionParamsOperator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.15dU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20564615dU implements InterfaceC20561915d3 {
    public transient List<? extends AbstractC20561415cy> adaptionStrategies;
    public static final C20568615e8 Companion = new Object() { // from class: X.15e8
    };
    public static final int $stable = 8;
    public static final transient C01GW<C0RG7> tabletResizeHelper$delegate = C452501pT.LIZIZ(new C20562215d6());
    public final transient C01GW feedHandlerFactory$delegate = C452501pT.LIZIZ(new C20567415dw(this));
    public final transient C01GW tabletHandlerFactory$delegate = C452501pT.LIZIZ(new C20567515dx(this));
    public final transient C01GW feedDefaultHandlerFactory$delegate = C452501pT.LIZIZ(new C20567315dv(this));
    public final transient C01GW feedSpotlightHandlerFactory$delegate = C452501pT.LIZIZ(new C1869510ykX(this));

    public C20566715dp getFeedMultiContainerThresholdStrategy(VideoAdaptionManagerContext videoAdaptionManagerContext) {
        return null;
    }

    public final C20565815dg getFeedDefaultHandlerFactory() {
        return (C20565815dg) this.feedDefaultHandlerFactory$delegate.getValue();
    }

    public final C20565715df getFeedHandlerFactory() {
        return (C20565715df) this.feedHandlerFactory$delegate.getValue();
    }

    public final C1869500ykW getFeedSpotlightHandlerFactory() {
        return (C1869500ykW) this.feedSpotlightHandlerFactory$delegate.getValue();
    }

    public final C20565915dh getTabletHandlerFactory() {
        return (C20565915dh) this.tabletHandlerFactory$delegate.getValue();
    }

    public float getWidthThreshold() {
        return C0RG1.LIZIZ();
    }

    private final C20566615do getFeedVideoAdaptionStrategy(VideoAdaptionManagerContext videoAdaptionManagerContext) {
        return new C20566615do(new C20565315db(videoAdaptionManagerContext, this));
    }

    private final List<AbstractC20561415cy> getStrategies(VideoAdaptionManagerContext videoAdaptionManagerContext) {
        C20566715dp feedMultiContainerThresholdStrategy;
        ArrayList arrayList = new ArrayList();
        arrayList.add(getSpotLightAdaptionStrategy(videoAdaptionManagerContext));
        arrayList.add(getTabletAdaptionStrategy(videoAdaptionManagerContext));
        if (C293910BfZ.LIZIZ && (feedMultiContainerThresholdStrategy = getFeedMultiContainerThresholdStrategy(videoAdaptionManagerContext)) != null) {
            arrayList.add(feedMultiContainerThresholdStrategy);
        }
        arrayList.add(getFeedVideoAdaptionStrategy(videoAdaptionManagerContext));
        arrayList.add(getDefaultAdaptionStrategy(videoAdaptionManagerContext));
        return arrayList;
    }

    private final C20564915dX getTabletAdaptionStrategy(VideoAdaptionManagerContext videoAdaptionManagerContext) {
        return new C20564915dX(new C20565215da(videoAdaptionManagerContext, this));
    }

    public final C20565615de getDefaultAdaptionStrategy(VideoAdaptionManagerContext videoAdaptionManagerContext) {
        return new C20565615de(new C20562315d7(videoAdaptionManagerContext, this));
    }

    public final C20564815dW getSmartCropHandler(C1869440ykQ c1869440ykQ) {
        C20568515e7 c20568515e7 = C20564815dW.LLILZ;
        C01GW c01gw = C20556615cC.LIZ;
        C20566115dj c20566115dj = new C20566115dj(C20556615cC.LIZJ, C20556615cC.LJ, C20556615cC.LIZLLL, C20556615cC.LJFF, c1869440ykQ);
        c20568515e7.getClass();
        C20564815dW c20564815dW = C20564815dW.LLILZIL;
        if (c20564815dW == null) {
            C20564815dW c20564815dW2 = new C20564815dW(c20566115dj);
            C20564815dW.LLILZIL = c20564815dW2;
            return c20564815dW2;
        }
        return c20564815dW;
    }

    public final C20564015dO getSpotLightAdaptionStrategy(VideoAdaptionManagerContext videoAdaptionManagerContext) {
        return new C20564015dO(new C20564515dT(videoAdaptionManagerContext, this));
    }

    public final C20563315dH getSpotLightTopviewHandler(C1869440ykQ c1869440ykQ) {
        C20566215dk c20566215dk = new C20566215dk(getWidthThreshold(), Float.MAX_VALUE, c1869440ykQ);
        C20563315dH c20563315dH = C20563315dH.LLILZ;
        if (c20563315dH == null) {
            C20563315dH c20563315dH2 = new C20563315dH(c20566215dk);
            C20563315dH.LLILZ = c20563315dH2;
            return c20563315dH2;
        }
        return c20563315dH;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.15dV] */
    public final C20564715dV getTableAdaptionHandler(C20566315dl c20566315dl) {
        final C20567115dt c20567115dt = new C20567115dt(c20566315dl);
        return new AbstractC20562115d5(c20567115dt) { // from class: X.15dV
            public final C20567115dt LLILLJJLI;
            public final String LLILLL = "tablet_handler";

            @Override // X.InterfaceC20562615dA
            public final String getName() {
                return this.LLILLL;
            }

            {
                this.LLILLJJLI = c20567115dt;
            }

            @Override // X.AbstractC20562115d5
            public final VideoAdaptionResult LIZ(VideoAdaptionParams videoAdaptionParams, VideoAdaptionResult videoAdaptionResult) {
                FeedVideoAdaptionParamsOperator feedVideoAdaptionParamsOperator;
                Pair pair;
                C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
                C1869607Ty c1869607Ty = null;
                if (c19252910Tv.LIZLLL().LJIJI().LLJJIJIL()) {
                    InterfaceC589490NAd paramsOperator = videoAdaptionParams.getParamsOperator();
                    if ((paramsOperator instanceof FeedVideoAdaptionParamsOperator) && (feedVideoAdaptionParamsOperator = (FeedVideoAdaptionParamsOperator) paramsOperator) != null && feedVideoAdaptionParamsOperator.getCropVideoTypeCheck()) {
                        float videoHeight = videoAdaptionParams.getVideoHeight() / videoAdaptionParams.getVideoWidth();
                        float containerHeight = videoAdaptionParams.getContainerHeight() / videoAdaptionParams.getContainerWidth();
                        if (containerHeight < 1.0d) {
                            pair = new Pair(null, new C1869607Ty(0.0f, false));
                        } else {
                            float fLJJJ = c19252910Tv.LIZLLL().LJIJI().LJJJ();
                            if (videoHeight > containerHeight) {
                                int containerWidth = videoAdaptionParams.getContainerWidth();
                                float containerWidth2 = (videoAdaptionParams.getContainerWidth() / videoAdaptionParams.getVideoWidth()) * videoAdaptionParams.getVideoHeight();
                                float containerHeight2 = (containerWidth2 - videoAdaptionParams.getContainerHeight()) / containerWidth2;
                                if (containerHeight2 > 0.0f && fLJJJ >= containerHeight2) {
                                    C1869607Ty c1869607Ty2 = new C1869607Ty(containerHeight2, true);
                                    Float fValueOf = Float.valueOf(0.0f);
                                    pair = new Pair(new VideoAdaptionResult(containerWidth, (int) containerWidth2, fValueOf, fValueOf, c1869607Ty2), null);
                                } else {
                                    pair = new Pair(null, new C1869607Ty(containerHeight2, false));
                                }
                            } else {
                                float containerHeight3 = (videoAdaptionParams.getContainerHeight() / videoAdaptionParams.getVideoHeight()) * videoAdaptionParams.getVideoWidth();
                                pair = new Pair(null, new C1869607Ty((containerHeight3 - videoAdaptionParams.getContainerWidth()) / containerHeight3, false));
                            }
                        }
                        if (pair.getFirst() != null) {
                            VideoAdaptionResult videoAdaptionResult2 = (VideoAdaptionResult) pair.getFirst();
                            if (videoAdaptionResult2 != null) {
                                videoAdaptionResult2.getWidth();
                            }
                            VideoAdaptionResult videoAdaptionResult3 = (VideoAdaptionResult) pair.getFirst();
                            if (videoAdaptionResult3 != null) {
                                videoAdaptionResult3.getHeight();
                            }
                            return (VideoAdaptionResult) pair.getFirst();
                        }
                        c1869607Ty = (C1869607Ty) pair.getSecond();
                    }
                }
                C533990Kwv c533990KwvLIZIZ = this.LLILLJJLI.getStrategyContext().getTabletResizeHelper().LIZIZ(new C533990Kwv(videoAdaptionParams.getVideoWidth(), videoAdaptionParams.getVideoHeight(), videoAdaptionParams.getContainerWidth(), videoAdaptionParams.getContainerHeight()));
                int i = c533990KwvLIZIZ.LIZJ;
                int i2 = c533990KwvLIZIZ.LIZLLL;
                Float fValueOf2 = Float.valueOf(0.0f);
                return new VideoAdaptionResult(i, i2, fValueOf2, fValueOf2, c1869607Ty);
            }
        };
    }

    public final C20563215dG getThresholdHandler(C1869440ykQ c1869440ykQ) {
        C20566215dk c20566215dk = new C20566215dk(getWidthThreshold(), Float.MAX_VALUE, c1869440ykQ);
        C20563215dG c20563215dG = C20563215dG.LLILZ;
        if (c20563215dG == null) {
            C20563215dG c20563215dG2 = new C20563215dG(c20566215dk);
            C20563215dG.LLILZ = c20563215dG2;
            return c20563215dG2;
        }
        return c20563215dG;
    }

    @Override // X.InterfaceC20561915d3
    public AbstractC20561415cy getAdaptionStrategy(VideoAdaptionManagerContext videoAdaptionManagerContext, VideoAdaptionParams videoAdaptionParams) {
        if (this.adaptionStrategies == null) {
            this.adaptionStrategies = getStrategies(videoAdaptionManagerContext);
        }
        List<? extends AbstractC20561415cy> list = this.adaptionStrategies;
        AbstractC20561415cy abstractC20561415cy = null;
        if (list == null) {
            return null;
        }
        Iterator<? extends AbstractC20561415cy> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AbstractC20561415cy next = it2.next();
            if (next.LIZJ(videoAdaptionParams)) {
                abstractC20561415cy = next;
                break;
            }
        }
        return abstractC20561415cy;
    }
}
