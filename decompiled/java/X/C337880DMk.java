package X;

import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS370S0200000_4;
import njp.a;

/* JADX INFO: renamed from: X.0DMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem$onSearchClick$1", f = "FindSchoolFriendsPageContainerAssem.kt", l = {}, m = "invokeSuspend")
public final class C337880DMk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FindSchoolFriendsPageContainerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C337880DMk(FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem, InterfaceC1364105Vn<? super C337880DMk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = findSchoolFriendsPageContainerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C337880DMk(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindSchoolFriendsPageContainerAssem@2e2e.onSearchClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CampusFlowViewModel campusFlowViewModelKp = this.LL.kp();
        campusFlowViewModelKp.withState(new AwS370S0200000_4(EnumC337870DMj.SEARCH_SCHOOL_FRIENDS, campusFlowViewModelKp, 97));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindSchoolFriendsPageContainerAssem@2e2e.onSearchClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
