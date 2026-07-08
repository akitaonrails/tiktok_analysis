package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y5z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolCell$onBindItemView$1$1", f = "CorrectSchoolCell.kt", l = {75}, m = "invokeSuspend")
public final class C1844370y5z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CorrectSchoolCell LLILLJJLI;
    public final /* synthetic */ C331430Cyz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1844370y5z(CorrectSchoolCell correctSchoolCell, C331430Cyz c331430Cyz, InterfaceC1364105Vn<? super C1844370y5z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = correctSchoolCell;
        this.LLILLL = c331430Cyz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1844370y5z(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC332260D0u<C331430Cyz> interfaceC332260D0uHV0;
        C1C7U.LIZ("CorrectSchoolCell@23ac.onBindItemView$1$1");
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
            CorrectSchoolCell correctSchoolCell = this.LLILLJJLI;
            InterfaceC1844380y60 interfaceC1844380y60 = (InterfaceC1844380y60) correctSchoolCell.LL.getValue(correctSchoolCell, CorrectSchoolCell.LLIZ[0]);
            if (interfaceC1844380y60 != null && (interfaceC332260D0uHV0 = interfaceC1844380y60.hV0()) != null) {
                C331430Cyz c331430Cyz = this.LLILLL;
                this.LL = 1;
                if (interfaceC332260D0uHV0.emit(c331430Cyz, this) == objLJFF) {
                    C1C7U.LIZIZ("CorrectSchoolCell@23ac.onBindItemView$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CorrectSchoolCell@23ac.onBindItemView$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
