package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.00yY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C254000yY extends C09AY implements Function1<Function1<? super Boolean, ? extends Unit>, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C254000yY(int i, long j) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function1<? super Boolean, ? extends Unit> function1) {
        C254200ya.LIZ(new C254100yZ(this.LL, this.LLILLJJLI, function1));
        return Unit.LIZ;
    }
}
