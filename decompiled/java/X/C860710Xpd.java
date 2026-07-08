package X;

import Y.AgS300S0100000_19;
import com.ss.android.ugc.profile.business.ur.school.schoollist.SchoolItemCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xpd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.schoollist.SchoolItemCell$onCreateItemView$1$3$1", f = "SchoolItemCell.kt", l = {70}, m = "invokeSuspend")
public final class C860710Xpd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SchoolItemCell LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860710Xpd(SchoolItemCell schoolItemCell, InterfaceC1364105Vn<? super C860710Xpd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = schoolItemCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860710Xpd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0951 anonymousClass0951EF;
        C1C7U.LIZ("SchoolItemCell@23f8.onCreateItemView$1$3$1");
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
            InterfaceC1217240hmU interfaceC1217240hmUI5 = this.LLILLJJLI.I5();
            if (interfaceC1217240hmUI5 != null && (anonymousClass0951EF = interfaceC1217240hmUI5.eF()) != null) {
                AgS300S0100000_19 agS300S0100000_19 = new AgS300S0100000_19(this.LLILLJJLI, 6);
                this.LL = 1;
                if (anonymousClass0951EF.collect(agS300S0100000_19, this) == objLJFF) {
                    C1C7U.LIZIZ("SchoolItemCell@23f8.onCreateItemView$1$3$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SchoolItemCell@23f8.onCreateItemView$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
