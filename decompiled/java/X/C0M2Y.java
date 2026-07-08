package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M2Y, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M2Y extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C0M2A LL;
    public final /* synthetic */ C0M22 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M2Y(C0M2A c0m2a, C0M22 c0m22, boolean z, float f, boolean z2, Function0<Unit> function0, int i) {
        super(2);
        this.LL = c0m2a;
        this.LLILLJJLI = c0m22;
        this.LLILLL = z;
        this.LLILZ = f;
        this.LLILZIL = z2;
        this.LLILZLL = function0;
        this.LLIZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1666710tTR.LJFF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLIZ | 1));
        return Unit.LIZ;
    }
}
