package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0fVa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129880fVa extends C09AY implements Function2<Long, Integer, Unit> {
    public final /* synthetic */ C1128710fTh LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129880fVa(long j, C1128710fTh c1128710fTh) {
        super(2);
        this.LL = c1128710fTh;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Long l, Integer num) {
        l.longValue();
        num.intValue();
        this.LL.LJLJI(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
