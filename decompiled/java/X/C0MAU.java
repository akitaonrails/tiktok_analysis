package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0MAU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MAU extends C09AY implements Function1<C0MAE, Unit> {
    public final /* synthetic */ InterfaceC1665500tRU<T> LL;
    public final /* synthetic */ Function2<T, Integer, Object> LLILLJJLI;
    public final /* synthetic */ InterfaceC1631630sYr<T, InterfaceC1685750ty9, InterfaceC1680500tpg, Integer, Unit> LLILLL;
    public final /* synthetic */ float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0MAU(InterfaceC1665500tRU<? extends T> interfaceC1665500tRU, Function2<? super T, ? super Integer, ? extends Object> function2, InterfaceC1631630sYr<? super T, ? super InterfaceC1685750ty9, ? super InterfaceC1680500tpg, ? super Integer, Unit> interfaceC1631630sYr, float f) {
        super(1);
        this.LL = interfaceC1665500tRU;
        this.LLILLJJLI = function2;
        this.LLILLL = interfaceC1631630sYr;
        this.LLILZ = f;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAE c0mae) {
        C0MAE c0mae2 = c0mae;
        InterfaceC1665500tRU<T> interfaceC1665500tRU = this.LL;
        Function2<T, Integer, Object> function2 = this.LLILLJJLI;
        InterfaceC1631630sYr<T, InterfaceC1685750ty9, InterfaceC1680500tpg, Integer, Unit> interfaceC1631630sYr = this.LLILLL;
        float f = this.LLILZ;
        int i = 0;
        for (Object obj : interfaceC1665500tRU) {
            int i2 = i + 1;
            if (i >= 0) {
                c0mae2.LIZIZ(function2.invoke((T) obj, Integer.valueOf(i)), null, new C19719212De(-625715098, new C0M9Y(interfaceC1631630sYr, obj, f), true));
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        return Unit.LIZ;
    }
}
