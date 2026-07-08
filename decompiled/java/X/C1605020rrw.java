package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolInfoStruct;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsAPI;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsRequest;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsResponse;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rrw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostsListViewModel$fetchSchoolPosts$2$1$1$response$1", f = "SchoolPostsListViewModel.kt", l = {149}, m = "invokeSuspend")
public final class C1605020rrw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SchoolPostsResponse>, Object> {
    public int LL;
    public final /* synthetic */ SchoolPostsListViewModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1579330rCV LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605020rrw(SchoolPostsListViewModel schoolPostsListViewModel, boolean z, C1579330rCV c1579330rCV, String str, InterfaceC1364105Vn<? super C1605020rrw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = schoolPostsListViewModel;
        this.LLILLL = z;
        this.LLILZ = c1579330rCV;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1605020rrw(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int value;
        String str;
        Long lLJFF;
        Object schoolPosts = obj;
        C1C7U.LIZ("SchoolPostsListViewModel@540f.fetchSchoolPosts$2$1$1$response$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(schoolPosts);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(schoolPosts);
            SchoolPostsAPI schoolPostsAPI = (SchoolPostsAPI) this.LLILLJJLI.LLILLJJLI.getValue();
            schoolPosts = null;
            Integer numLJ = null;
            if (schoolPostsAPI != null) {
                int value2 = EnumC992980bwm.PROFILE_SELF.getValue();
                if (this.LLILLJJLI.LLILZ) {
                    value = EnumC1605030rrx.INITIAL.getValue();
                } else if (this.LLILLL) {
                    value = EnumC1605030rrx.REFRESH.getValue();
                } else {
                    value = EnumC1605030rrx.LOAD_MORE.getValue();
                }
                if (this.LLILLJJLI.LLILZ) {
                    str = this.LLILZ.LLILZLL;
                } else {
                    str = null;
                }
                String str2 = this.LLILZIL;
                C1579330rCV c1579330rCV = this.LLILZ;
                String str3 = c1579330rCV.LLILLJJLI.LIZ;
                if (c1579330rCV.LLILLL != null) {
                    lLJFF = C2286608xc.LJFF(r0.intValue());
                } else {
                    lLJFF = null;
                }
                EnumC1579340rCW enumC1579340rCW = this.LLILZ.LLILZ;
                if (enumC1579340rCW != null) {
                    numLJ = C2286608xc.LJ(enumC1579340rCW.getValue());
                }
                SchoolInfoStruct schoolInfoStruct = new SchoolInfoStruct(str2, str3, lLJFF, numLJ);
                C1DC6 c1dc6 = new C1DC6();
                C0R16 c0r16 = C0R16.LIZ;
                Long lLJFF2 = C2286608xc.LJFF(3600L);
                c0r16.getClass();
                c1dc6.LJII = C0R16.LIZIZ(lLJFF2);
                C1DC5.LIZ.getClass();
                c1dc6.LIZLLL = C1DCC.LIZJ();
                SchoolPostsRequest schoolPostsRequest = new SchoolPostsRequest(10, str, false, value2, value, schoolInfoStruct, c1dc6.build());
                this.LL = 1;
                schoolPosts = schoolPostsAPI.getSchoolPosts(schoolPostsRequest, this);
                if (schoolPosts == objLJFF) {
                    C1C7U.LIZIZ("SchoolPostsListViewModel@540f.fetchSchoolPosts$2$1$1$response$1");
                    return objLJFF;
                }
            }
        }
        this.LLILLJJLI.LLILZ = false;
        C1C7U.LIZIZ("SchoolPostsListViewModel@540f.fetchSchoolPosts$2$1$1$response$1");
        return schoolPosts;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SchoolPostsResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
