package X;

import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0K6U, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage$observeSubscriptionStatusChanges$1", f = "SubPrivilegeDetailFullPage.kt", l = {}, m = "invokeSuspend")
public final class C0K6U extends C09AX implements Function2<C512130K6p, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SubPrivilegeDetailFullPage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K6U(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage, InterfaceC1364105Vn<? super C0K6U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = subPrivilegeDetailFullPage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0K6U c0k6u = new C0K6U(this.LLILLJJLI, interfaceC1364105Vn);
        c0k6u.LL = obj;
        return c0k6u;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubPrivilegeDetailFullPage@8e7b.observeSubscriptionStatusChanges$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (Intrinsics.LJFF(((C512130K6p) this.LL).LIZ, this.LLILLJJLI.LLJJJJJIL)) {
            SubPrivilegeDetailFullPage subPrivilegeDetailFullPage = this.LLILLJJLI;
            subPrivilegeDetailFullPage.LLJLILLLLZIIL = true;
            subPrivilegeDetailFullPage.RR();
            C0K51.LIZJ(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubPrivilegeDetailFullPage@8e7b.observeSubscriptionStatusChanges$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C512130K6p c512130K6p, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c512130K6p, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
