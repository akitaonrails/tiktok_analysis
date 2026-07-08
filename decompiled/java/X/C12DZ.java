package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.12DZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12DZ extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C19719212De LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Object LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12DZ(C19719212De c19719212De, Object obj, Object obj2, int i) {
        super(2);
        this.LL = c19719212De;
        this.LLILLJJLI = obj;
        this.LLILLL = obj2;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.LIZJ(this.LLILLJJLI, this.LLILLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZ) | 1);
        return Unit.LIZ;
    }
}
