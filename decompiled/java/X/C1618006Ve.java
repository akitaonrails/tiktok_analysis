package X;

import com.ss.android.ugc.aweme.detailpage.manageadmin.assem.ManageAdminListAssem;
import com.ss.android.ugc.aweme.detailpage.manageadmin.viewmodel.ManageAdminViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Ve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detailpage.manageadmin.assem.ManageAdminListAssem$onResume$1", f = "ManageAdminListAssem.kt", l = {56}, m = "invokeSuspend")
public final class C1618006Ve extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ManageAdminListAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1618006Ve(ManageAdminListAssem manageAdminListAssem, InterfaceC1364105Vn<? super C1618006Ve> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = manageAdminListAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1618006Ve(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ManageAdminListAssem@f0b8.onResume$1");
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
            ManageAdminViewModel manageAdminViewModelGo = this.LLILLJJLI.Go();
            this.LL = 1;
            ((AbstractC879060Ye8) manageAdminViewModelGo.LLILLJJLI.getValue()).LJIIIZ(new C1769306wN(manageAdminViewModelGo, 8));
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("ManageAdminListAssem@f0b8.onResume$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ManageAdminListAssem@f0b8.onResume$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
