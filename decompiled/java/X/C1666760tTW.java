package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tTW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666760tTW extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C0M22 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1666760tTW(C0M22 c0m22, int i, long j, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, int i3, int i4) {
        super(2);
        this.LL = c0m22;
        this.LLILLJJLI = i;
        this.LLILLL = j;
        this.LLILZ = i2;
        this.LLILZIL = interfaceC1685750ty9;
        this.LLILZLL = i3;
        this.LLIZ = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666890tTj.LIZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZLL | 1), this.LLIZ);
        return Unit.LIZ;
    }
}
