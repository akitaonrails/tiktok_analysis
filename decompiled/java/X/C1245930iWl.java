package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolFriendsAPI;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolFriendsResponse;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iWl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListViewModel$onLoadMore$2$1$1$schoolFriendsResponse$1", f = "SchoolUsersListViewModel.kt", l = {116}, m = "invokeSuspend")
public final class C1245930iWl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SchoolFriendsResponse>, Object> {
    public int LL;
    public final /* synthetic */ SchoolUsersListViewModel LLILLJJLI;
    public final /* synthetic */ C1245920iWk LLILLL;
    public final /* synthetic */ C346160Dhe LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1245930iWl(SchoolUsersListViewModel schoolUsersListViewModel, C1245920iWk c1245920iWk, C346160Dhe c346160Dhe, InterfaceC1364105Vn<? super C1245930iWl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = schoolUsersListViewModel;
        this.LLILLL = c1245920iWk;
        this.LLILZ = c346160Dhe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1245930iWl(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object schoolFriends = obj;
        C1C7U.LIZ("SchoolUsersListViewModel@bdc3.onLoadMore$2$1$1$schoolFriendsResponse$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(schoolFriends);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(schoolFriends);
            SchoolFriendsAPI schoolFriendsAPI = (SchoolFriendsAPI) this.LLILLJJLI.LLILLJJLI.getValue();
            String str = this.LLILLL.LIZ;
            Integer second = null;
            Integer first = null;
            String strLJJLIIIJ = C13LP.LJJLIIIJ(this.LLILLJJLI.LLILZ, ",", null, null, 0, null, null, 62);
            Long l = this.LLILLJJLI.LLILZIL;
            Pair<Integer, Integer> pair = this.LLILZ.LLILLL;
            if (pair != null) {
                first = pair.getFirst();
            }
            Pair<Integer, Integer> pair2 = this.LLILZ.LLILLL;
            if (pair2 != null) {
                second = pair2.getSecond();
            }
            C346160Dhe c346160Dhe = this.LLILZ;
            boolean z = c346160Dhe.LL;
            boolean z2 = this.LLILLJJLI.LLILLL;
            boolean z3 = c346160Dhe.LLILLJJLI;
            Integer numLJ = C2286608xc.LJ(20);
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z3);
            Integer numLJ2 = C2286608xc.LJ(z2 ? 1 : 0);
            this.LL = 1;
            schoolFriends = schoolFriendsAPI.getSchoolFriends(904000, numLJ, str, strLJJLIIIJ, l, first, second, boolValueOf, boolValueOf2, numLJ2, this);
            if (schoolFriends == objLJFF) {
                C1C7U.LIZIZ("SchoolUsersListViewModel@bdc3.onLoadMore$2$1$1$schoolFriendsResponse$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SchoolUsersListViewModel@bdc3.onLoadMore$2$1$1$schoolFriendsResponse$1");
        return schoolFriends;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SchoolFriendsResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
