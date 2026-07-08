package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolCell$onBindItemView$2", f = "CorrectSchoolCell.kt", l = {}, m = "invokeSuspend")
public final class C1844360y5y extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CorrectSchoolCell LLILLJJLI;
    public final /* synthetic */ C331430Cyz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1844360y5y(CorrectSchoolCell correctSchoolCell, C331430Cyz c331430Cyz, InterfaceC1364105Vn<? super C1844360y5y> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = correctSchoolCell;
        this.LLILLL = c331430Cyz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1844360y5y c1844360y5y = new C1844360y5y(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1844360y5y.LL = obj;
        return c1844360y5y;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC332260D0u interfaceC332260D0uIsEnabled;
        InterfaceC332260D0u<C331430Cyz> interfaceC332260D0uHV0;
        C1C7U.LIZ("CorrectSchoolCell@23ac.onBindItemView$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        CorrectSchoolCell correctSchoolCell = this.LLILLJJLI;
        C1864830ycz c1864830ycz = correctSchoolCell.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CorrectSchoolCell.LLIZ;
        InterfaceC1844380y60 interfaceC1844380y60 = (InterfaceC1844380y60) c1864830ycz.getValue(correctSchoolCell, interfaceC2217461BqaArr[0]);
        if (interfaceC1844380y60 != null && (interfaceC332260D0uHV0 = interfaceC1844380y60.hV0()) != null) {
            C09IC.LJJI(interfaceC497601wk, new C861640Xr8(new C1844350y5x(this.LLILLJJLI, this.LLILLL, null), interfaceC332260D0uHV0));
        }
        CorrectSchoolCell correctSchoolCell2 = this.LLILLJJLI;
        InterfaceC1844380y60 interfaceC1844380y602 = (InterfaceC1844380y60) correctSchoolCell2.LL.getValue(correctSchoolCell2, interfaceC2217461BqaArr[0]);
        if (interfaceC1844380y602 != null && (interfaceC332260D0uIsEnabled = interfaceC1844380y602.isEnabled()) != null) {
            C09IC.LJJI(interfaceC497601wk, new C861640Xr8(new C1844340y5w(this.LLILLJJLI, null), interfaceC332260D0uIsEnabled));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CorrectSchoolCell@23ac.onBindItemView$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
