package X;

import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0K5B, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.AbsPrivilegeDetailBaseFragment$onViewCreated$2", f = "AbsPrivilegeDetailBaseFragment.kt", l = {}, m = "invokeSuspend")
public final class C0K5B extends C09AX implements Function2<C0K49, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AbsPrivilegeDetailBaseFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0K5B(AbsPrivilegeDetailBaseFragment absPrivilegeDetailBaseFragment, InterfaceC1364105Vn<? super C0K5B> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = absPrivilegeDetailBaseFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0K5B c0k5b = new C0K5B(this.LLILLJJLI, interfaceC1364105Vn);
        c0k5b.LL = obj;
        return c0k5b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C197039127h c197039127h;
        C1C7U.LIZ("AbsPrivilegeDetailBaseFragment@9a2e.onViewCreated$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0K49 c0k49 = (C0K49) this.LL;
        C0K57 c0k57 = C0K57.LIZ;
        String str = c0k49.LIZ;
        String str2 = this.LLILLJJLI.LLILZLL;
        if (str2 == null) {
            str2 = "";
        }
        c0k57.getClass();
        C511970K5z c511970K5z = new C511970K5z("livesdk_subscription_privilege_sub_page_click");
        c511970K5z.LIZIZ(str, "page_type");
        c511970K5z.LIZIZ(str2, "show_entrance");
        C0K61.LIZ(c511970K5z, null);
        c511970K5z.LIZLLL();
        AbsPrivilegeDetailBaseFragment absPrivilegeDetailBaseFragment = this.LLILLJJLI;
        if (absPrivilegeDetailBaseFragment.LLILZ == EnumC510710K1d.POPUP) {
            c197039127h = absPrivilegeDetailBaseFragment.LLJJJJLIIL;
        } else {
            c197039127h = absPrivilegeDetailBaseFragment.LLJJLIIIJLLLLLLLZ;
        }
        if (c197039127h != null) {
            Boolean.valueOf(c197039127h.performClick());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsPrivilegeDetailBaseFragment@9a2e.onViewCreated$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0K49 c0k49, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c0k49, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
