package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0z12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879740z12 extends C09AY implements Function2<Boolean, Throwable, Unit> {
    public final /* synthetic */ C1881590z41 LL;
    public final /* synthetic */ C760370TsB LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879740z12(C1881590z41 c1881590z41, C760370TsB c760370TsB) {
        super(2);
        this.LL = c1881590z41;
        this.LLILLJJLI = c760370TsB;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Throwable th) {
        Throwable th2 = th;
        if (bool.booleanValue()) {
            C1879750z13.LIZ(this.LL.LJIIIZ(), this.LLILLJJLI, null);
        } else {
            C20441214yg.LJFF("GameDetailMixPageHost", "openRewardDetailPage checkLogin failed", th2);
        }
        return Unit.LIZ;
    }
}
