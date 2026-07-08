package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel;
import com.ss.android.ugc.aweme.network.model.GetManagementPageSettingsBody;
import com.ss.android.ugc.aweme.network.model.GetManagementPageSettingsResponse;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gR5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.viewmodel.ManageGroupViewModel$refreshGroupManagement$1", f = "ManageGroupViewModel.kt", l = {602}, m = "invokeSuspend")
public final class C1165530gR5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public ManageGroupViewModel LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ ManageGroupViewModel LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165530gR5(ManageGroupViewModel manageGroupViewModel, Context context, InterfaceC1364105Vn<? super C1165530gR5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = manageGroupViewModel;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165530gR5(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ManageGroupViewModel manageGroupViewModel;
        Context context;
        C1C7U.LIZ("ManageGroupViewModel@c59c.refreshGroupManagement$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (i != 0) {
            if (i == 1) {
                context = (Context) this.LLILLJJLI;
                manageGroupViewModel = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Long l = (Long) this.LLILZ.LLILZIL.getValue();
            if (l != null) {
                manageGroupViewModel = this.LLILZ;
                context = this.LLILZIL;
                long jLongValue = l.longValue();
                C2258521Dac c2258521Dac = C2258521Dac.LIZ;
                GetManagementPageSettingsBody getManagementPageSettingsBody = new GetManagementPageSettingsBody(C2286608xc.LJFF(jLongValue));
                this.LL = manageGroupViewModel;
                this.LLILLJJLI = context;
                this.LLILLL = 1;
                obj = c2258521Dac.LJFF(getManagementPageSettingsBody, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ManageGroupViewModel@c59c.refreshGroupManagement$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ManageGroupViewModel@c59c.refreshGroupManagement$1");
            return unit;
        }
        GroupAccessCriteriaCollection groupAccessCriteriaCollection = ((GetManagementPageSettingsResponse) obj).accessCriteriaCollection;
        if (groupAccessCriteriaCollection != null) {
            manageGroupViewModel.BQ2(context, groupAccessCriteriaCollection);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ManageGroupViewModel@c59c.refreshGroupManagement$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
