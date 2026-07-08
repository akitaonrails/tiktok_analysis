package X;

import com.ss.android.ugc.aweme.legoImp.task.PitayaPreInitTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.145I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C145I extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PitayaPreInitTask LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C145I(PitayaPreInitTask pitayaPreInitTask) {
        super(0);
        this.LL = pitayaPreInitTask;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZ();
        return Unit.LIZ;
    }
}
