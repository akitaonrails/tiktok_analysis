package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676180tii extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C05P1<C1396005dG> LLILLJJLI;
    public final /* synthetic */ C1693430uAX LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1676180tii(String str, C05P1<C1396005dG> c05p1, C1693430uAX c1693430uAX, int i, float f, InterfaceC1685750ty9 interfaceC1685750ty9, int i2, int i3) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = c05p1;
        this.LLILLL = c1693430uAX;
        this.LLILZ = i;
        this.LLILZIL = f;
        this.LLILZLL = interfaceC1685750ty9;
        this.LLIZ = i2;
        this.LLIZLLLIL = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1676150tif.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZ | 1), this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
