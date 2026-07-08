package X;

import android.os.Message;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsAPI;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsRelatedResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rs2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostInnerListModel$fetchRelated$1", f = "SchoolPostInnerListModel.kt", l = {105}, m = "invokeSuspend")
public final class C1605080rs2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1605090rs3 LLILLJJLI;
    public final /* synthetic */ SchoolPostsAPI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605080rs2(SchoolPostsAPI schoolPostsAPI, C1605090rs3 c1605090rs3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1605090rs3;
        this.LLILLL = schoolPostsAPI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1605080rs2(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SchoolPostInnerListModel@25fb.fetchRelated$1");
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
                C1DFB c1dfb = C0PEM.LIZJ;
                C1605070rs1 c1605070rs1 = new C1605070rs1(this.LLILLL, this.LLILLJJLI, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c1605070rs1);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SchoolPostInnerListModel@25fb.fetchRelated$1");
                    return objLJFF;
                }
            }
            C1605160rsA c1605160rsALJIIJ = this.LLILLJJLI.LJIIJ((SchoolPostsRelatedResponse) obj);
            C1605090rs3 c1605090rs3 = this.LLILLJJLI;
            Message messageObtain = Message.obtain();
            messageObtain.obj = c1605160rsALJIIJ;
            c1605090rs3.handleMsg(messageObtain);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1605090rs3 c1605090rs32 = this.LLILLJJLI;
            c1605090rs32.getClass();
            Message messageObtain2 = Message.obtain();
            messageObtain2.obj = e;
            c1605090rs32.handleMsg(messageObtain2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SchoolPostInnerListModel@25fb.fetchRelated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
