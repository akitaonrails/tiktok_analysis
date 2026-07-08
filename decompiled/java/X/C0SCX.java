package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SCX, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SCX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ReusedUISlotAssem<RECEIVER> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SCX(ReusedUISlotAssem<RECEIVER> reusedUISlotAssem) {
        super(0);
        this.LL = reusedUISlotAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.onResume();
        return Unit.LIZ;
    }
}
