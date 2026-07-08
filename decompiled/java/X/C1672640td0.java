package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0td0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1672640td0 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C05P1<Float> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZ;
    public final /* synthetic */ C1ETK LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672640td0(String str, C05P1<Float> c05p1, String str2, InterfaceC1685750ty9 interfaceC1685750ty9, C1ETK c1etk, int i, int i2) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = c05p1;
        this.LLILLL = str2;
        this.LLILZ = interfaceC1685750ty9;
        this.LLILZIL = c1etk;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1672620tcy.LJI(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1), this.LLIZ);
        return Unit.LIZ;
    }
}
