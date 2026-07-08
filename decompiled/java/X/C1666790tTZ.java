package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666790tTZ extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1666790tTZ(boolean z, int i) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666770tTX.LIZIZ(this.LL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILLJJLI | 1));
        return Unit.LIZ;
    }
}
