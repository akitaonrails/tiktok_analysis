package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0e4D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM$onRefresh$1", f = "ContactMaFWidgetVM.kt", l = {124}, m = "invokeSuspend")
public final class C1074470e4D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ContactMaFWidgetVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1074470e4D(ContactMaFWidgetVM contactMaFWidgetVM, InterfaceC1364105Vn<? super C1074470e4D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = contactMaFWidgetVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1074470e4D(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("ContactMaFWidgetVM@2ef6.onRefresh$1");
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
                C1074630e4T c1074630e4T = this.LLILLJJLI.LL;
                EnumC1074240e3q enumC1074240e3qLIZ = c1074630e4T.LIZIZ;
                if (enumC1074240e3qLIZ == EnumC1074240e3q.UNKNOWN) {
                    enumC1074240e3qLIZ = C1074230e3p.LIZ(c1074630e4T.LIZJ.LIZ);
                }
                InterfaceC1055970daN interfaceC1055970daN = this.LLILLJJLI.LLILLJJLI;
                this.LL = 1;
                obj = interfaceC1055970daN.LIZ(enumC1074240e3qLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ContactMaFWidgetVM@2ef6.onRefresh$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C1074840e4o) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        ContactMaFWidgetVM contactMaFWidgetVM = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            contactMaFWidgetVM.getClass();
            contactMaFWidgetVM.setState(new AwS382S0200000_16(contactMaFWidgetVM, (C1074840e4o) c098200Yq, 40));
        }
        ContactMaFWidgetVM contactMaFWidgetVM2 = this.LLILLJJLI;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            contactMaFWidgetVM2.getClass();
            contactMaFWidgetVM2.setState(new AwS595S0100000_16(thM5exceptionOrNullimpl, 462));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ContactMaFWidgetVM@2ef6.onRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
