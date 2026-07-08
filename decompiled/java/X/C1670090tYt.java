package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670090tYt extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1670090tYt(float f, float f2, int i) {
        super(2);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1670080tYs.LIZIZ(this.LL, this.LLILLJJLI, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILLL | 1));
        return Unit.LIZ;
    }
}
