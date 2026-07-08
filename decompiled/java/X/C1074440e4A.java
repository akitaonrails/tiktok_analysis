package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.auth.widget.fb.FacebookMaFWidgetVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0e4A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.widget.fb.FacebookMaFWidgetVM$onRefresh$1", f = "FacebookMaFWidgetVM.kt", l = {89}, m = "invokeSuspend")
public final class C1074440e4A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FacebookMaFWidgetVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1074440e4A(FacebookMaFWidgetVM facebookMaFWidgetVM, InterfaceC1364105Vn<? super C1074440e4A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = facebookMaFWidgetVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1074440e4A(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("FacebookMaFWidgetVM@e5b3.onRefresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1074450e4B c1074450e4B = this.LLILLJJLI.LL;
                EnumC1074240e3q enumC1074240e3qLIZ = c1074450e4B.LIZIZ;
                if (enumC1074240e3qLIZ == EnumC1074240e3q.UNKNOWN) {
                    enumC1074240e3qLIZ = C1074230e3p.LIZ(c1074450e4B.LIZJ.LIZ);
                }
                InterfaceC1004520cFO interfaceC1004520cFO = this.LLILLJJLI.LLILLJJLI;
                this.LL = 1;
                obj = interfaceC1004520cFO.LIZ(enumC1074240e3qLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("FacebookMaFWidgetVM@e5b3.onRefresh$1");
                    return objLJFF;
                }
            }
            c098200Yq = (List) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        FacebookMaFWidgetVM facebookMaFWidgetVM = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            facebookMaFWidgetVM.setState(new AwS382S0200000_16(facebookMaFWidgetVM, (FacebookMaFWidgetVM) c098200Yq, (List<? extends User>) 2));
        }
        FacebookMaFWidgetVM facebookMaFWidgetVM2 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            facebookMaFWidgetVM2.setState(new AwS595S0100000_16(thM5exceptionOrNullimpl, 0));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FacebookMaFWidgetVM@e5b3.onRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
