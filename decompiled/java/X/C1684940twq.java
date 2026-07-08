package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AFwS301S0000000_17;
import kotlin.jvm.internal.AwS184S0400000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0twq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684940twq extends C09AY implements Function1<C0MAX, Unit> {
    public final /* synthetic */ C1146430fwH LL;
    public final /* synthetic */ C1684960tws LLILLJJLI;
    public final /* synthetic */ Function0<C1092560eXO> LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILZIL;
    public final /* synthetic */ Function1<AbstractC1146640fwc, Unit> LLILZLL;
    public final /* synthetic */ C1693430uAX LLIZ;
    public final /* synthetic */ C1693430uAX LLIZLLLIL;
    public final /* synthetic */ Function0<AbstractC1676270tir> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1684940twq(C1146430fwH c1146430fwH, C1684960tws c1684960tws, Function0<C1092560eXO> function0, C05P0<Boolean> c05p0, C1677480tko<Float, C1677280tkU> c1677480tko, Function1<? super AbstractC1146640fwc, Unit> function1, C1693430uAX c1693430uAX, C1693430uAX c1693430uAX2, Function0<? extends AbstractC1676270tir> function02) {
        super(1);
        this.LL = c1146430fwH;
        this.LLILLJJLI = c1684960tws;
        this.LLILLL = function0;
        this.LLILZ = c05p0;
        this.LLILZIL = c1677480tko;
        this.LLILZLL = function1;
        this.LLIZ = c1693430uAX;
        this.LLIZLLLIL = c1693430uAX2;
        this.LLJ = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAX c0max) {
        C0MAX c0max2 = c0max;
        if (this.LL.LIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LL.LIZ.LLILLJJLI);
            sbLIZ.append("_event");
            c0max2.LIZ(C2188811AlT.LIZIZ(sbLIZ), AFwS266S0000000_25.get$arr$(71), new Object() { // from class: X.0tx1
            }, new C19719212De(-60307796, new AwS184S0400000_25(this.LLILLJJLI, (C1684960tws) this.LLILLL, (Function0<C1092560eXO>) this.LL, (C1146430fwH) this.LLILZ, (C05P0<Boolean>) 2), true));
        }
        InterfaceC1665500tRU<C1146350fw9> interfaceC1665500tRU = this.LL.LIZIZ;
        c0max2.LJ(interfaceC1665500tRU.size(), new C020W(AFwS301S0000000_17.get$arr$(9), interfaceC1665500tRU, 5), null, new AwS604S0100000_25((List) interfaceC1665500tRU, (List<? extends AbstractC1686530tzP>) 53), new C19719212De(1229287273, new C1682820ttQ(interfaceC1665500tRU, this.LLILLJJLI, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ), true));
        return Unit.LIZ;
    }
}
