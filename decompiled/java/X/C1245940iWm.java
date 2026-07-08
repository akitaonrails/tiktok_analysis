package X;

import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListViewModel$onLoadMore$2$1$1", f = "SchoolUsersListViewModel.kt", l = {115}, m = "invokeSuspend")
public final class C1245940iWm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ SchoolUsersListViewModel LLILLL;
    public final /* synthetic */ C346160Dhe LLILZ;
    public final /* synthetic */ InterfaceC20236714Gf<AbstractC316870CbV<C1245920iWk>> LLILZIL;
    public final /* synthetic */ C1245920iWk LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1245940iWm(SchoolUsersListViewModel schoolUsersListViewModel, C346160Dhe c346160Dhe, InterfaceC20236714Gf<? super AbstractC316870CbV<C1245920iWk>> interfaceC20236714Gf, C1245920iWk c1245920iWk, InterfaceC1364105Vn<? super C1245940iWm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = schoolUsersListViewModel;
        this.LLILZ = c346160Dhe;
        this.LLILZIL = interfaceC20236714Gf;
        this.LLILZLL = c1245920iWk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1245940iWm(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1245940iWm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
