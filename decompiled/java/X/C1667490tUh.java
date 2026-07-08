package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667490tUh extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1680820tqC LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667490tUh(InterfaceC1680820tqC interfaceC1680820tqC, int i, float f, boolean z, int i2, int i3) {
        super(2);
        this.LL = interfaceC1680820tqC;
        this.LLILLJJLI = i;
        this.LLILLL = f;
        this.LLILZ = z;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668390tW9.LJFF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1), this.LLILZLL);
        return Unit.LIZ;
    }
}
