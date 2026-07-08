package X;

import Y.ARunnableS131S0100000_31;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20603415jk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PowerAdapter LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20603415jk(PowerAdapter powerAdapter) {
        super(0);
        this.LL = powerAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PowerAdapter powerAdapter = this.LL;
        HandlerHook.viewPost(powerAdapter.LL, new ARunnableS131S0100000_31(powerAdapter, 38));
        return Unit.LIZ;
    }
}
