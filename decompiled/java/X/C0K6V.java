package X;

import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0K6V, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage$onViewCreated$4", f = "SubPrivilegeDetailFullPage.kt", l = {}, m = "invokeSuspend")
public final class C0K6V extends C09AX implements Function2<C221400tI, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SubPrivilegeDetailFullPage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K6V(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage, InterfaceC1364105Vn<? super C0K6V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = subPrivilegeDetailFullPage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0K6V c0k6v = new C0K6V(this.LLILLJJLI, interfaceC1364105Vn);
        c0k6v.LL = obj;
        return c0k6v;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubPrivilegeDetailFullPage@8e7b.onViewCreated$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        if (Intrinsics.LJFF(null, this.LLILLJJLI.LLJJJJJIL)) {
            C0K51.LIZJ(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubPrivilegeDetailFullPage@8e7b.onViewCreated$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C221400tI c221400tI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c221400tI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
