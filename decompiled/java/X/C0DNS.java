package X;

import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DNS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem$showChooseGraduationYearPopup$1$1$1", f = "FindSchoolFriendsPageContainerAssem.kt", l = {1766}, m = "invokeSuspend")
public final class C0DNS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FindSchoolFriendsPageContainerAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DNS(FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem, InterfaceC1364105Vn<? super C0DNS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = findSchoolFriendsPageContainerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DNS(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindSchoolFriendsPageContainerAssem@2e2e.showChooseGraduationYearPopup$1$1$1");
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
            obj = campusFlowViewModelKp.AQ2(true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FindSchoolFriendsPageContainerAssem@2e2e.showChooseGraduationYearPopup$1$1$1");
                return objLJFF;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            C0DOO c0doo = C0DOO.LIZ;
            C0DNU c0dnu = C0DNU.EDIT_SCHOOL_FAIL;
            C0DNV c0dnv = C0DNV.FIND_SCHOOL_FRIENDS_PAGE;
            c0doo.getClass();
            C0DOO.LJII(c0dnu, c0dnv);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindSchoolFriendsPageContainerAssem@2e2e.showChooseGraduationYearPopup$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
