package X;

import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0txj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.ui.UserMatchedAssem$UserList$1$1$2$1$1", f = "UserMatchedAssem.kt", l = {}, m = "invokeSuspend")
public final class C1685490txj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UserMatchedAssem LL;
    public final /* synthetic */ C1687730u1L LLILLJJLI;
    public final /* synthetic */ C1685510txl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1685490txj(UserMatchedAssem userMatchedAssem, C1687730u1L c1687730u1L, C1685510txl c1685510txl, InterfaceC1364105Vn<? super C1685490txj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = userMatchedAssem;
        this.LLILLJJLI = c1687730u1L;
        this.LLILLL = c1685510txl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1685490txj(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserMatchedAssem@efc1.UserList$1$1$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1685530txn c1685530txn = C1685530txn.LIZ;
        String str = (String) this.LL.LLJIJIL.getValue();
        String uid = this.LLILLJJLI.LIZ.getUid();
        String str2 = this.LLILLL.LIZIZ;
        Long lLJFF = C2286608xc.LJFF(System.currentTimeMillis() - this.LLILLJJLI.LJ);
        c1685530txn.getClass();
        C1685530txn.LIZJ(lLJFF, str, uid, "show", str2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserMatchedAssem@efc1.UserList$1$1$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
