package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolGroupsAPI;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolGroupsResponse;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS30S0001000_16;
import kotlin.jvm.internal.AwS31S0010000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0cJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageViewModel$fetchGroupsCountAndRedDot$1", f = "FindSchoolFriendsPageViewModel.kt", l = {38}, m = "invokeSuspend")
public final class C1007360cJy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ FindSchoolFriendsPageViewModel LLILLJJLI;
    public final /* synthetic */ EnumC1007380cK0 LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007360cJy(FindSchoolFriendsPageViewModel findSchoolFriendsPageViewModel, EnumC1007380cK0 enumC1007380cK0, String str, InterfaceC1364105Vn<? super C1007360cJy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = findSchoolFriendsPageViewModel;
        this.LLILLL = enumC1007380cK0;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007360cJy(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SchoolGroupsResponse schoolGroupsResponse;
        Boolean hasNew;
        Integer total;
        C1C7U.LIZ("FindSchoolFriendsPageViewModel@2872.fetchGroupsCountAndRedDot$1");
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
                SchoolGroupsAPI schoolGroupsAPI = (SchoolGroupsAPI) this.LLILLJJLI.LL.getValue();
                if (schoolGroupsAPI != null) {
                    int value = this.LLILLL.getValue();
                    String str = this.LLILZ;
                    C1007370cJz.LIZ.getClass();
                    Long lLJFF = C2286608xc.LJFF(C1007370cJz.LIZ().getLong("timestamp_of_enter_group_chat", 0L));
                    this.LL = 1;
                    obj = schoolGroupsAPI.getSchoolGroups(value, str, null, null, lLJFF, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("FindSchoolFriendsPageViewModel@2872.fetchGroupsCountAndRedDot$1");
                        return objLJFF;
                    }
                } else {
                    schoolGroupsResponse = null;
                    if (schoolGroupsResponse != null && (total = schoolGroupsResponse.getTotal()) != null) {
                        this.LLILLJJLI.setState(new AwS30S0001000_16(total.intValue(), 10));
                    }
                    if (schoolGroupsResponse != null && (hasNew = schoolGroupsResponse.getHasNew()) != null) {
                        this.LLILLJJLI.setState(new AwS31S0010000_16(hasNew.booleanValue(), 5));
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FindSchoolFriendsPageViewModel@2872.fetchGroupsCountAndRedDot$1");
                    return unit;
                }
            }
            schoolGroupsResponse = (SchoolGroupsResponse) obj;
            if (schoolGroupsResponse != null) {
                this.LLILLJJLI.setState(new AwS30S0001000_16(total.intValue(), 10));
            }
            if (schoolGroupsResponse != null) {
                this.LLILLJJLI.setState(new AwS31S0010000_16(hasNew.booleanValue(), 5));
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("FindSchoolFriendsPageViewModel@2872.fetchGroupsCountAndRedDot$1");
            return unit2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((C1910890zpH) this.LLILLJJLI.LLILLL.getValue()).LJ(e);
            this.LLILLJJLI.setState(new AwS595S0100000_16(e, 189));
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("FindSchoolFriendsPageViewModel@2872.fetchGroupsCountAndRedDot$1");
            return unit3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
