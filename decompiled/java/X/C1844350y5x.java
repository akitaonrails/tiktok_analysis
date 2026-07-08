package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0y5x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolCell$onBindItemView$2$1", f = "CorrectSchoolCell.kt", l = {}, m = "invokeSuspend")
public final class C1844350y5x extends C09AX implements Function2<C331430Cyz, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CorrectSchoolCell LLILLJJLI;
    public final /* synthetic */ C331430Cyz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1844350y5x(CorrectSchoolCell correctSchoolCell, C331430Cyz c331430Cyz, InterfaceC1364105Vn<? super C1844350y5x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = correctSchoolCell;
        this.LLILLL = c331430Cyz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1844350y5x c1844350y5x = new C1844350y5x(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1844350y5x.LL = obj;
        return c1844350y5x;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CorrectSchoolCell@23ac.onBindItemView$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        AnonymousClass1278 anonymousClass1278 = this.LLILLJJLI.LLILLL;
        if (anonymousClass1278 != null) {
            anonymousClass1278.LJIILJJIL(Intrinsics.LJFF(obj2, this.LLILLL));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CorrectSchoolCell@23ac.onBindItemView$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C331430Cyz c331430Cyz, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c331430Cyz, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
