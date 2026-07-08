package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0taW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671100taW extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1671100taW(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, String str, Function0 function0, boolean z) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = interfaceC1685750ty9;
        this.LLILLL = function0;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        String str = this.LL;
        InterfaceC1685750ty9 interfaceC1685750ty9 = this.LLILLJJLI;
        Function0<Unit> function0 = this.LLILLL;
        boolean z = this.LLILZ;
        C1671080taU.LIZJ(C341440Da2.LIZ(this.LLILZIL | 1), this.LLILZLL, interfaceC1680500tpg, interfaceC1685750ty9, str, function0, z);
        return Unit.LIZ;
    }
}
