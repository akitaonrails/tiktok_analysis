package X;

import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0M4Z, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M4Z extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ List<C0M2A> LLILLJJLI;
    public final /* synthetic */ Set<String> LLILLL;
    public final /* synthetic */ C0M22 LLILZ;
    public final /* synthetic */ InterfaceC1631630sYr<String, String, InterfaceC1680500tpg, Integer, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function1<String, Unit> LLIZ;
    public final /* synthetic */ Function1<C0M2A, Unit> LLIZLLLIL;
    public final /* synthetic */ Function1<C0M0P, Unit> LLJ;
    public final /* synthetic */ Function1<Set<String>, Unit> LLJI;
    public final /* synthetic */ Function1<String, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0M4Z(float f, List<C0M2A> list, Set<String> set, C0M22 c0m22, InterfaceC1631630sYr<? super String, ? super String, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, Function0<Unit> function0, Function1<? super String, Unit> function1, Function1<? super C0M2A, Unit> function12, Function1<? super C0M0P, Unit> function13, Function1<? super Set<String>, Unit> function14, Function1<? super String, Unit> function15) {
        super(2);
        this.LL = f;
        this.LLILLJJLI = list;
        this.LLILLL = set;
        this.LLILZ = c0m22;
        this.LLILZIL = interfaceC1631630sYr;
        this.LLILZLL = function0;
        this.LLIZ = function1;
        this.LLIZLLLIL = function12;
        this.LLJ = function13;
        this.LLJI = function14;
        this.LLJIJIL = function15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1666710tTR.LIZLLL(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1680500tpg2, 0, 0);
        }
        return Unit.LIZ;
    }
}
