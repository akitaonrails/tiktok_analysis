package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TPA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TPA extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1674230tfZ LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0TPA(C1674230tfZ c1674230tfZ, String str, float f, int i) {
        super(2);
        this.LL = c1674230tfZ;
        this.LLILLJJLI = str;
        this.LLILLL = f;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.LIZ(this.LLILLJJLI, this.LLILLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZ | 1));
        return Unit.LIZ;
    }
}
