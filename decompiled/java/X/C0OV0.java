package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OV0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OV0 extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ ChoreographerFrameCallbackC620390OUz LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OV0(ChoreographerFrameCallbackC620390OUz choreographerFrameCallbackC620390OUz) {
        super(1);
        this.LL = choreographerFrameCallbackC620390OUz;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        C786410Ut5.v2().removeFrameCallback(this.LL);
        return Unit.LIZ;
    }
}
