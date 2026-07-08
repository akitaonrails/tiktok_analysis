package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jlk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C501580Jlk extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ C941180abE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C501580Jlk(C941180abE c941180abE) {
        super(1);
        this.LL = c941180abE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        C501530Jlf.LIZ(this.LL.LIZ, th2, null);
        C20441214yg.LJFF("GamePlayContentViewHolder", "updatePanelSettingsV2 fail:", th2);
        return Unit.LIZ;
    }
}
