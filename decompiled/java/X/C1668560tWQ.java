package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tWQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668560tWQ extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C1690080u58 LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function2<int[], Boolean, Unit> LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1668560tWQ(C1690080u58 c1690080u58, float f, boolean z, Function2<? super int[], ? super Boolean, Unit> function2, int i) {
        super(2);
        this.LL = c1690080u58;
        this.LLILLJJLI = f;
        this.LLILLL = z;
        this.LLILZ = function2;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1668490tWJ.LJIIJJI(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1));
        return Unit.LIZ;
    }
}
