package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RW7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RW7 extends C09AY implements Function0<IFcpPolicyAbility> {
    public final /* synthetic */ VideoTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RW7(VideoTagContainer videoTagContainer) {
        super(0);
        this.LL = videoTagContainer;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IFcpPolicyAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IFcpPolicyAbility.class, null);
    }
}
