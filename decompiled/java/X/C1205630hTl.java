package X;

import com.bytedance.assem.arch.viewModel.AssemViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import njp.a;

/* JADX INFO: renamed from: X.0hTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssemKt$selectSubscribeToFlow$1", f = "SelectSchoolPageAssem.kt", l = {581}, m = "invokeSuspend")
public final class C1205630hTl extends C09AX implements Function2<C094D<? super C443120HZe<Object, Object, Object>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC725030ScH<Object> LLILLL;
    public final /* synthetic */ AssemViewModel<Object> LLILZ;
    public final /* synthetic */ InterfaceC2217241BqE<Object, Object> LLILZIL;
    public final /* synthetic */ InterfaceC2217241BqE<Object, Object> LLILZLL;
    public final /* synthetic */ InterfaceC2217241BqE<Object, Object> LLIZ;
    public final /* synthetic */ C1770850wBP<C11H7<Object, Object, Object>> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1205630hTl(InterfaceC725030ScH<Object> interfaceC725030ScH, AssemViewModel<Object> assemViewModel, InterfaceC2217241BqE<Object, Object> interfaceC2217241BqE, InterfaceC2217241BqE<Object, Object> interfaceC2217241BqE2, InterfaceC2217241BqE<Object, Object> interfaceC2217241BqE3, C1770850wBP<C11H7<Object, Object, Object>> c1770850wBP, InterfaceC1364105Vn<? super C1205630hTl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC725030ScH;
        this.LLILZ = assemViewModel;
        this.LLILZIL = interfaceC2217241BqE;
        this.LLILZLL = interfaceC2217241BqE2;
        this.LLIZ = interfaceC2217241BqE3;
        this.LLIZLLLIL = c1770850wBP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1205630hTl c1205630hTl = new C1205630hTl(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1205630hTl.LLILLJJLI = obj;
        return c1205630hTl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectSchoolPageAssemKt@d9cf.selectSubscribeToFlow$1");
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
            C094D c094d = (C094D) this.LLILLJJLI;
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(this.LLILLL.selectSubscribe(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, new AwS597S0100000_18(c094d, (C094D<? super C443120HZe<Object, Object, Object>>) 26), new C1209070hZJ(c094d, (C094D<? super C443120HZe<Object, Object, Object>>) 0)), 38);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS562S0100000_18, this) == objLJFF) {
                C1C7U.LIZIZ("SelectSchoolPageAssemKt@d9cf.selectSubscribeToFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SelectSchoolPageAssemKt@d9cf.selectSubscribeToFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C443120HZe<Object, Object, Object>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
