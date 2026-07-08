package X;

import Y.AgS283S0100000_2;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.ChatLongPressVM;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Kh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem$onViewCreated$3", f = "StreakPetWidgetAssem.kt", l = {246}, m = "invokeSuspend")
public final class C1589706Kh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ StreakPetWidgetAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589706Kh(StreakPetWidgetAssem streakPetWidgetAssem, InterfaceC1364105Vn<? super C1589706Kh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = streakPetWidgetAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1589706Kh(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetWidgetAssem@8027.onViewCreated$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AssemVMLazy assemVMLazy = this.LLILLJJLI.LLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = StreakPetWidgetAssem.LLLII;
            C2252321DDq c2252321DDq = ((ChatLongPressVM) assemVMLazy.getValue()).LLILLJJLI;
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(this.LLILLJJLI, 34);
            this.LL = 1;
            if (c2252321DDq.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("StreakPetWidgetAssem@8027.onViewCreated$3");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
