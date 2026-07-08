package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Yd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.MinisPreloadWorkFlow$generateFlow$1$execute$1", f = "MinisPreloadWorkFlow.kt", l = {}, m = "invokeSuspend")
public final class C2390109Yd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C2390209Ye LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2390109Yd(C2390209Ye c2390209Ye, InterfaceC1364105Vn<? super C2390109Yd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2390209Ye;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2390109Yd c2390109Yd = new C2390109Yd(this.LLILLJJLI, interfaceC1364105Vn);
        c2390109Yd.LL = obj;
        return c2390109Yd;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisPreloadWorkFlow@4198.generateFlow$1$execute$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C2390209Ye c2390209Ye = this.LLILLJJLI;
        Iterator it2 = ((ArrayList) c2390209Ye.LIZJ).iterator();
        while (it2.hasNext()) {
            C23250099c.LIZIZ(interfaceC497601wk, null, null, new C2390009Yc((C09YW) it2.next(), c2390209Ye, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisPreloadWorkFlow@4198.generateFlow$1$execute$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
