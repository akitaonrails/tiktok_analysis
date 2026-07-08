package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676990tk1 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1676980tk0 LL;
    public final /* synthetic */ EnumC1677000tk2 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ InterfaceC1631620sYq<EnumC1677000tk2, InterfaceC1680500tpg, Integer, C1685910tyP> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ InterfaceC1685430txd<Float, C1685910tyP, C1685910tyP, Float, InterfaceC1680500tpg, Integer, Unit> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1676990tk1(C1676980tk0 c1676980tk0, EnumC1677000tk2 enumC1677000tk2, long j, long j2, InterfaceC1631620sYq<? super EnumC1677000tk2, ? super InterfaceC1680500tpg, ? super Integer, C1685910tyP> interfaceC1631620sYq, boolean z, InterfaceC1685430txd<? super Float, ? super C1685910tyP, ? super C1685910tyP, ? super Float, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1685430txd, int i) {
        super(2);
        this.LL = c1676980tk0;
        this.LLILLJJLI = enumC1677000tk2;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = interfaceC1631620sYq;
        this.LLILZLL = z;
        this.LLIZ = interfaceC1685430txd;
        this.LLIZLLLIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.LIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZLLLIL | 1));
        return Unit.LIZ;
    }
}
