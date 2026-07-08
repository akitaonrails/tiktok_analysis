package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsAPI;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsRelatedResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rs1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostInnerListModel$fetchRelated$1$response$1", f = "SchoolPostInnerListModel.kt", l = {106}, m = "invokeSuspend")
public final class C1605070rs1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SchoolPostsRelatedResponse>, Object> {
    public int LL;
    public final /* synthetic */ SchoolPostsAPI LLILLJJLI;
    public final /* synthetic */ C1605090rs3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605070rs1(SchoolPostsAPI schoolPostsAPI, C1605090rs3 c1605090rs3, InterfaceC1364105Vn<? super C1605070rs1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = schoolPostsAPI;
        this.LLILLL = c1605090rs3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1605070rs1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SchoolPostInnerListModel@25fb.fetchRelated$1$response$1");
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
            C1605060rs0 c1605060rs0 = new C1605060rs0(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            obj = C099A.LIZIZ(10000L, c1605060rs0, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SchoolPostInnerListModel@25fb.fetchRelated$1$response$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SchoolPostInnerListModel@25fb.fetchRelated$1$response$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SchoolPostsRelatedResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
