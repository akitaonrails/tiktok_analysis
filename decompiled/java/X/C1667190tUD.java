package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tUD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667190tUD extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667190tUD(String str, float f, float f2, float f3, float f4, InterfaceC1685750ty9 interfaceC1685750ty9, int i, int i2) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
        this.LLILZ = f3;
        this.LLILZIL = f4;
        this.LLILZLL = interfaceC1685750ty9;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1667170tUB.LIZIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZ | 1), this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
