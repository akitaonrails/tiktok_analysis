package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.MinisPreloadWorkFlow$generateFlow$1$execute$2", f = "MinisPreloadWorkFlow.kt", l = {47}, m = "invokeSuspend")
public final class C2389909Yb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C2390209Ye LLILLL;
    public final /* synthetic */ C09YZ LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2389909Yb(C2390209Ye c2390209Ye, C09YZ c09yz, InterfaceC1364105Vn<? super C2389909Yb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c2390209Ye;
        this.LLILZ = c09yz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2389909Yb(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator it2;
        C1C7U.LIZ("MinisPreloadWorkFlow@4198.generateFlow$1$execute$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            it2 = ((ArrayList) this.LLILLL.LIZIZ).iterator();
        }
        while (it2.hasNext()) {
            List<? extends C09YW> list = (List) it2.next();
            C09YZ c09yz = this.LLILZ;
            C2390309Yf c2390309Yf = this.LLILLL.LIZ;
            this.LL = it2;
            this.LLILLJJLI = 1;
            if (c09yz.LIZ(c2390309Yf, list, this) == objLJFF) {
                C1C7U.LIZIZ("MinisPreloadWorkFlow@4198.generateFlow$1$execute$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisPreloadWorkFlow@4198.generateFlow$1$execute$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
