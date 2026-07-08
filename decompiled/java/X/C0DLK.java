package X;

import com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DLK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.modifyschool.CampusFlowViewModel$doNextBehavior$2$1$1", f = "CampusFlowViewModel.kt", l = {328}, m = "invokeSuspend")
public final class C0DLK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CampusFlowViewModel LLILLJJLI;
    public final /* synthetic */ AbstractC337970DMt LLILLL;
    public final /* synthetic */ InterfaceC20236714Gf<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0DLK(CampusFlowViewModel campusFlowViewModel, AbstractC337970DMt abstractC337970DMt, InterfaceC20236714Gf<? super Unit> interfaceC20236714Gf, InterfaceC1364105Vn<? super C0DLK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = campusFlowViewModel;
        this.LLILLL = abstractC337970DMt;
        this.LLILZ = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DLK(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CampusFlowViewModel@b7a5.doNextBehavior$2$1$1");
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
            CampusFlowViewModel campusFlowViewModel = this.LLILLJJLI;
            AbstractC337970DMt abstractC337970DMt = this.LLILLL;
            this.LL = 1;
            if (campusFlowViewModel.FQ2(abstractC337970DMt, this) == objLJFF) {
                C1C7U.LIZIZ("CampusFlowViewModel@b7a5.doNextBehavior$2$1$1");
                return objLJFF;
            }
        }
        InterfaceC20236714Gf<Unit> interfaceC20236714Gf = this.LLILZ;
        Unit unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        interfaceC20236714Gf.resumeWith(unit);
        C1C7U.LIZIZ("CampusFlowViewModel@b7a5.doNextBehavior$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
