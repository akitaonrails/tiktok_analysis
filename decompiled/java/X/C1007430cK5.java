package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolGroupsAPI;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolGroupsResponse;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListViewModel;
import com.ss.android.ugc.profile.platform.exp.CampusGroupChatConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cK5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListViewModel$fetchSchoolGroupsAPI$2$1$1$schoolGroupsResponse$1", f = "SchoolGroupsListViewModel.kt", l = {169}, m = "invokeSuspend")
public final class C1007430cK5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SchoolGroupsResponse>, Object> {
    public int LL;
    public final /* synthetic */ SchoolGroupsListViewModel LLILLJJLI;
    public final /* synthetic */ C1236480iHW LLILLL;
    public final /* synthetic */ C1007450cK7 LLILZ;
    public final /* synthetic */ Long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007430cK5(SchoolGroupsListViewModel schoolGroupsListViewModel, C1236480iHW c1236480iHW, C1007450cK7 c1007450cK7, Long l, InterfaceC1364105Vn<? super C1007430cK5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = schoolGroupsListViewModel;
        this.LLILLL = c1236480iHW;
        this.LLILZ = c1007450cK7;
        this.LLILZIL = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007430cK5(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SchoolGroupsListViewModel@6c2.fetchSchoolGroupsAPI$2$1$1$schoolGroupsResponse$1");
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
            SchoolGroupsAPI schoolGroupsAPI = (SchoolGroupsAPI) this.LLILLJJLI.LLILLJJLI.getValue();
            if (schoolGroupsAPI != null) {
                int value = this.LLILLL.LLILLL.getValue();
                String str = this.LLILLL.LLILZ;
                String str2 = this.LLILZ.LIZ;
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                CampusGroupChatConfig campusGroupChatConfig = C1007440cK6.LIZ;
                CampusGroupChatConfig campusGroupChatConfig2 = (CampusGroupChatConfig) settingsManagerLIZLLL.LJIIIIZZ("campus_group_chat", CampusGroupChatConfig.class, campusGroupChatConfig);
                if (campusGroupChatConfig2 != null) {
                    campusGroupChatConfig = campusGroupChatConfig2;
                }
                Integer numLJ = C2286608xc.LJ(campusGroupChatConfig.fetchCount);
                Long l = this.LLILZIL;
                this.LL = 1;
                obj = schoolGroupsAPI.getSchoolGroups(value, str, str2, numLJ, l, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SchoolGroupsListViewModel@6c2.fetchSchoolGroupsAPI$2$1$1$schoolGroupsResponse$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("SchoolGroupsListViewModel@6c2.fetchSchoolGroupsAPI$2$1$1$schoolGroupsResponse$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SchoolGroupsResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
