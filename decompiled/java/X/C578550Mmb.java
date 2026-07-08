package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Mmb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578550Mmb extends C09AY implements Function1<C1780100wQK, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578550Mmb(int i, int i2, boolean z) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1780100wQK c1780100wQK) {
        C1780100wQK c1780100wQK2 = c1780100wQK;
        c1780100wQK2.LJIIJ(this.LL, this.LLILLJJLI);
        c1780100wQK2.LIZIZ.mRecordingMp4 = this.LLILLL;
        return Unit.LIZ;
    }
}
