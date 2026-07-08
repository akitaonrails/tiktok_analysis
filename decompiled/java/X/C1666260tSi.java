package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666260tSi extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1666260tSi(float f, long j, int i) {
        super(2);
        this.LL = f;
        this.LLILLJJLI = j;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        float f = this.LL;
        long j = this.LLILLJJLI;
        C1666200tSc.LIZJ(f, C341440Da2.LIZ(this.LLILLL | 1), j, interfaceC1680500tpg);
        return Unit.LIZ;
    }
}
