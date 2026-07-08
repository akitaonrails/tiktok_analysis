package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.videoadaption.adaptioncontext.VideoAdaptionManagerContext;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionParams;
import com.ss.android.ugc.feed.platform.cell.component.adaption.strategy.FeedVideoAdaptionStrategyFactory;
import kotlin.jvm.internal.AwS432S0200000_31;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15d4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20562015d4 extends C20564615dU {
    public final String LIZ;
    public final Bundle LIZIZ;
    public final InterfaceC20561915d3 LIZJ;
    public final transient C01GW LIZLLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 896));
    public final transient C01GW LJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 895));

    @Override // X.C20564615dU, X.InterfaceC20561915d3
    public final AbstractC20561415cy getAdaptionStrategy(VideoAdaptionManagerContext videoAdaptionManagerContext, VideoAdaptionParams videoAdaptionParams) {
        if (Intrinsics.LJFF(videoAdaptionParams.getVideoId(), this.LIZ) && this.LIZIZ != null) {
            return new C20566515dn(new AwS432S0200000_31(videoAdaptionManagerContext, this, 118));
        }
        if (!C301300BrU.LIZ()) {
            return this.LIZJ.getAdaptionStrategy(videoAdaptionManagerContext, videoAdaptionParams);
        }
        return new C20566415dm(new AwS432S0200000_31(videoAdaptionManagerContext, this, 119));
    }

    public C20562015d4(String str, Bundle bundle, FeedVideoAdaptionStrategyFactory feedVideoAdaptionStrategyFactory) {
        this.LIZ = str;
        this.LIZIZ = bundle;
        this.LIZJ = feedVideoAdaptionStrategyFactory;
    }
}
