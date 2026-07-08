package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageViewModel;
import com.ss.android.ugc.ur.school.api.UserCampusInfoAPI;
import com.ss.android.ugc.ur.school.api.UserSchoolInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS31S0000100_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0cJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageViewModel$fetchMembersCount$1", f = "FindSchoolFriendsPageViewModel.kt", l = {78}, m = "invokeSuspend")
public final class C1007260cJo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FindSchoolFriendsPageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007260cJo(FindSchoolFriendsPageViewModel findSchoolFriendsPageViewModel, InterfaceC1364105Vn<? super C1007260cJo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = findSchoolFriendsPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007260cJo(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindSchoolFriendsPageViewModel@2872.fetchMembersCount$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                UserCampusInfoAPI userCampusInfoAPI = (UserCampusInfoAPI) this.LLILLJJLI.LLILLJJLI.getValue();
                this.LL = 1;
                obj = userCampusInfoAPI.getUserCampusInfo(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("FindSchoolFriendsPageViewModel@2872.fetchMembersCount$1");
                    return objLJFF;
                }
            }
            Long l = ((UserSchoolInfoResponse) obj).memberCount;
            if (l != null) {
                this.LLILLJJLI.setState(new AwS31S0000100_16(l.longValue(), 11));
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FindSchoolFriendsPageViewModel@2872.fetchMembersCount$1");
            return unit;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((C1910890zpH) this.LLILLJJLI.LLILLL.getValue()).LJ(e);
            this.LLILLJJLI.setState(new AwS595S0100000_16(e, 190));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("FindSchoolFriendsPageViewModel@2872.fetchMembersCount$1");
            return unit2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
