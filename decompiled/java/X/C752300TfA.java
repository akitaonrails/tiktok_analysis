package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.org.create.OrgAccountsListFragment$OrganizationAccountsScreen$1$1", f = "OrgAccountsListFragment.kt", l = {}, m = "invokeSuspend")
public final class C752300TfA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ OrgAccountsListFragment LL;
    public final /* synthetic */ C05P1<AbstractC1682580tt2> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C752300TfA(OrgAccountsListFragment orgAccountsListFragment, C05P1<? extends AbstractC1682580tt2> c05p1, InterfaceC1364105Vn<? super C752300TfA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = orgAccountsListFragment;
        this.LLILLJJLI = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752300TfA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OrgAccountsListFragment@120.OrganizationAccountsScreen$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C05P1<AbstractC1682580tt2> c05p1 = this.LLILLJJLI;
        String str = OrgAccountsListFragment._pnsPageId;
        if (c05p1.getValue() instanceof C1682600tt4) {
            DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) this.LL.LLJI.getValue();
            if (dialogC1389620mGW != null) {
                C786410Ut5.J4(dialogC1389620mGW);
            }
        } else {
            Dialog dialog = (Dialog) this.LL.LLJI.getValue();
            if (dialog != null) {
                C0FNV.LIZ(dialog);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OrgAccountsListFragment@120.OrganizationAccountsScreen$1$1");
        return unit;
    }
}
