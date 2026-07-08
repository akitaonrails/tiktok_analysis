package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0OuV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634410OuV extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C634410OuV(int i, int i2, InterfaceC1685750ty9 interfaceC1685750ty9, String str, Function0 function0, boolean z, boolean z2) {
        super(2);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = function0;
        this.LLILZIL = interfaceC1685750ty9;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        String str = this.LL;
        boolean z = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        Function0<Unit> function0 = this.LLILZ;
        InterfaceC1685750ty9 interfaceC1685750ty9 = this.LLILZIL;
        C1665920tSA.LIZ(C341440Da2.LIZ(this.LLILZLL | 1), this.LLIZ, interfaceC1680500tpg, interfaceC1685750ty9, str, function0, z, z2);
        return Unit.LIZ;
    }
}
