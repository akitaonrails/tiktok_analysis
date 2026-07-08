package X;

import com.ss.android.ugc.feed.platform.cell.pinch.PinchComponent;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1A2N, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A2N extends C09AY implements Function0<IFeedCleanAbility> {
    public final /* synthetic */ PinchComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A2N(PinchComponent pinchComponent) {
        super(0);
        this.LL = pinchComponent;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IFeedCleanAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IFeedCleanAbility.class, null);
    }
}
