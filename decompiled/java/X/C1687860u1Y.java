package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0u1Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687860u1Y extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1693430uAX LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1693430uAX LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687860u1Y(String str, C1693430uAX c1693430uAX, String str2, C1693430uAX c1693430uAX2, boolean z, int i) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = c1693430uAX;
        this.LLILLL = str2;
        this.LLILZ = c1693430uAX2;
        this.LLILZIL = z;
        this.LLILZLL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1687820u1U.LJFF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1));
        return Unit.LIZ;
    }
}
