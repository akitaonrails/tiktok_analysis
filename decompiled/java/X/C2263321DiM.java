package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DiM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2263321DiM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ReusedUISlotAssem<RECEIVER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2263321DiM(ReusedUISlotAssem<RECEIVER> reusedUISlotAssem) {
        super(0);
        this.LL = reusedUISlotAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.onStart();
        return Unit.LIZ;
    }
}
