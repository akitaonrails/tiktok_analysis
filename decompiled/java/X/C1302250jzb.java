package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0jzb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSessionLegacy$switchStartingCallEndpointOnCallStart$1", f = "CallSessionLegacy.kt", l = {240}, m = "invokeSuspend")
public final class C1302250jzb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<C1302410jzr> LLILLJJLI;
    public final /* synthetic */ C1302260jzc LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302250jzb(List<C1302410jzr> list, C1302260jzc c1302260jzc, InterfaceC1364105Vn<? super C1302250jzb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c1302260jzc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1302250jzb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            List<C1302410jzr> list = this.LLILLJJLI;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<C1302410jzr> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (it2.next().LIZJ()) {
                        this.LL = 1;
                        if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                            return objLJFF;
                        }
                    }
                }
            }
        }
        C1302260jzc c1302260jzc = this.LLILLL;
        c1302260jzc.LJI(c1302260jzc.LLJILJIL);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
