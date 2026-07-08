package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tUJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1667250tUJ extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1685750ty9 LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1667250tUJ(boolean z, String str, String str2, InterfaceC1685750ty9 interfaceC1685750ty9, int i) {
        super(2);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = interfaceC1685750ty9;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        C1667230tUH.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg, C341440Da2.LIZ(this.LLILZIL | 1));
        return Unit.LIZ;
    }
}
