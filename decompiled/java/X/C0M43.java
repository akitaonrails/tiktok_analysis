package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M43, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M43 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C0M22 LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ List<C0M0P> LLIZ;
    public final /* synthetic */ InterfaceC1631630sYr<String, String, InterfaceC1680500tpg, Integer, Unit> LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;
    public final /* synthetic */ Function0<Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M43(int i, int i2, int i3, long j, long j2, C0M22 c0m22, List list, Function0 function0, Function0 function02, Function0 function03, InterfaceC1631630sYr interfaceC1631630sYr) {
        super(2);
        this.LL = c0m22;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = i3;
        this.LLIZ = list;
        this.LLIZLLLIL = interfaceC1631630sYr;
        this.LLJ = function0;
        this.LLJI = function02;
        this.LLJIJIL = function03;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1666890tTj.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1680500tpg2, 0, 0);
        }
        return Unit.LIZ;
    }
}
