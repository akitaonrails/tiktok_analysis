package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.RelatedAwemeInfo;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolInfoStruct;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsAPI;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsRelatedRequest;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsRelatedResponse;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rs0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostInnerListModel$fetchRelated$1$response$1$1", f = "SchoolPostInnerListModel.kt", l = {107}, m = "invokeSuspend")
public final class C1605060rs0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SchoolPostsRelatedResponse>, Object> {
    public int LL;
    public final /* synthetic */ SchoolPostsAPI LLILLJJLI;
    public final /* synthetic */ C1605090rs3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605060rs0(SchoolPostsAPI schoolPostsAPI, C1605090rs3 c1605090rs3, InterfaceC1364105Vn<? super C1605060rs0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = schoolPostsAPI;
        this.LLILLL = c1605090rs3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1605060rs0(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SchoolPostInnerListModel@25fb.fetchRelated$1$response$1$1");
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
            SchoolPostsAPI schoolPostsAPI = this.LLILLJJLI;
            String aid = this.LLILLL.LL.getAid();
            if (aid == null) {
                aid = "";
            }
            List listSingletonList = Collections.singletonList(new RelatedAwemeInfo(aid, C2286608xc.LJ(this.LLILLL.LL.getAwemeType()), C2286608xc.LJ(10)));
            SchoolInfoStruct schoolInfoStruct = this.LLILLL.LLILLJJLI;
            C1DC6 c1dc6 = new C1DC6();
            C0R16 c0r16 = C0R16.LIZ;
            Long lLJFF = C2286608xc.LJFF(3600L);
            c0r16.getClass();
            c1dc6.LJII = C0R16.LIZIZ(lLJFF);
            C1DC5.LIZ.getClass();
            c1dc6.LIZLLL = C1DCC.LIZJ();
            SchoolPostsRelatedRequest schoolPostsRelatedRequest = new SchoolPostsRelatedRequest(listSingletonList, false, schoolInfoStruct, c1dc6.build());
            this.LL = 1;
            obj = schoolPostsAPI.getSchoolPostsRelated(schoolPostsRelatedRequest, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SchoolPostInnerListModel@25fb.fetchRelated$1$response$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SchoolPostInnerListModel@25fb.fetchRelated$1$response$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SchoolPostsRelatedResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
