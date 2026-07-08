package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303530k1f extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1684430tw1 LLILLJJLI;
    public final /* synthetic */ C1684510tw9 LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303530k1f(boolean z, C1684430tw1 c1684430tw1, C1684510tw9 c1684510tw9, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = c1684430tw1;
        this.LLILLL = c1684510tw9;
        this.LLILZ = function0;
        this.LLILZIL = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else if (this.LL) {
            C1684420tw0.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1680500tpg2, 0);
        }
        return Unit.LIZ;
    }
}
