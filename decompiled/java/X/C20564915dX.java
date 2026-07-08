package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedVideoAdaptionParamsOperator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15dX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20564915dX extends AbstractC20561415cy {
    public final Function0<C20566315dl> LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new C20568215e4(this));
    public final String LLILZLL = "pad_adaption_scene";

    @Override // X.AbstractC20561415cy
    public final InterfaceC1869460ykS LIZ() {
        return (C20566315dl) this.LLILZIL.getValue();
    }

    @Override // X.InterfaceC20562615dA
    public final String getName() {
        return this.LLILZLL;
    }

    public C20564915dX(C20565215da c20565215da) {
        this.LLILZ = c20565215da;
    }

    @Override // X.AbstractC20561415cy
    public final boolean LIZJ(VideoAdaptionParams videoAdaptionParams) {
        FeedVideoAdaptionParamsOperator feedVideoAdaptionParamsOperator;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLJJIJIL()) {
            InterfaceC589490NAd paramsOperator = videoAdaptionParams.getParamsOperator();
            if ((paramsOperator instanceof FeedVideoAdaptionParamsOperator) && (feedVideoAdaptionParamsOperator = (FeedVideoAdaptionParamsOperator) paramsOperator) != null && feedVideoAdaptionParamsOperator.getCropVideoTypeCheck()) {
                return true;
            }
        }
        videoAdaptionParams.getVideoWidth();
        videoAdaptionParams.getVideoHeight();
        videoAdaptionParams.getContainerWidth();
        videoAdaptionParams.getContainerHeight();
        return ((C20566315dl) this.LLILZIL.getValue()).getTabletResizeHelper().LIZLLL();
    }
}
