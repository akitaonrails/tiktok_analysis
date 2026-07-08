package X;

import Y.AgS293S0100000_12;
import com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment$onCreateView$1$1", f = "OrgAccountsListFragment.kt", l = {107}, m = "invokeSuspend")
public final class C752260Tf6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ OrgAccountsListFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752260Tf6(OrgAccountsListFragment orgAccountsListFragment, InterfaceC1364105Vn<? super C752260Tf6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = orgAccountsListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752260Tf6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrgAccountsListFragment@120.onCreateView$1$1");
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
            InterfaceC346201Wa<AbstractC752290Tf9> interfaceC346201Wa = this.LLILLJJLI.aS().LLILLJJLI;
            AgS293S0100000_12 agS293S0100000_12 = new AgS293S0100000_12(this.LLILLJJLI, 4);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS293S0100000_12, this) == objLJFF) {
                C1C7U.LIZIZ("OrgAccountsListFragment@120.onCreateView$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrgAccountsListFragment@120.onCreateView$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
