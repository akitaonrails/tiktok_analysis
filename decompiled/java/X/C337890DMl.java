package X;

import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem$onCreateView$1$actions$1$1", f = "FindSchoolFriendsPageContainerAssem.kt", l = {346}, m = "invokeSuspend")
public final class C337890DMl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FindSchoolFriendsPageContainerAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C337890DMl(FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem, InterfaceC1364105Vn<? super C337890DMl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = findSchoolFriendsPageContainerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C337890DMl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindSchoolFriendsPageContainerAssem@2e2e.onCreateView$1$actions$1$1");
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
            CampusFlowViewModel campusFlowViewModelKp = this.LLILLJJLI.kp();
            this.LL = 1;
            if (campusFlowViewModelKp.DQ2(this) == objLJFF) {
                C1C7U.LIZIZ("FindSchoolFriendsPageContainerAssem@2e2e.onCreateView$1$actions$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindSchoolFriendsPageContainerAssem@2e2e.onCreateView$1$actions$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
