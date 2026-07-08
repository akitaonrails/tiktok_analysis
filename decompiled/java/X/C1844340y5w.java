package X;

import com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0y5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolCell$onBindItemView$2$2", f = "CorrectSchoolCell.kt", l = {}, m = "invokeSuspend")
public final class C1844340y5w extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public final /* synthetic */ CorrectSchoolCell LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1844340y5w(CorrectSchoolCell correctSchoolCell, InterfaceC1364105Vn<? super C1844340y5w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = correctSchoolCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1844340y5w c1844340y5w = new C1844340y5w(this.LLILLJJLI, interfaceC1364105Vn);
        c1844340y5w.LL = ((Boolean) obj).booleanValue();
        return c1844340y5w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CorrectSchoolCell@23ac.onBindItemView$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z = this.LL;
        C127K c127k = this.LLILLJJLI.LLILLJJLI;
        if (c127k != null) {
            c127k.setCellEnabled(z);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CorrectSchoolCell@23ac.onBindItemView$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
