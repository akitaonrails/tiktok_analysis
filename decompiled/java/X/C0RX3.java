package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RX3, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RX3 extends C09AY implements Function0<IFcpPolicyAbility> {
    public final /* synthetic */ FcpMetaTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RX3(FcpMetaTagContainer fcpMetaTagContainer) {
        super(0);
        this.LL = fcpMetaTagContainer;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IFcpPolicyAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IFcpPolicyAbility.class, null);
    }
}
