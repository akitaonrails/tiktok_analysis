package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k1Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303470k1Z extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ InterfaceC1685750ty9 LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303470k1Z(InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.LL = interfaceC1685750ty9;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1684420tw0.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZ | 1));
        return Unit.LIZ;
    }
}
