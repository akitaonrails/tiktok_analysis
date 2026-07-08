package X;

import com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.TakoRTCAbilityImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xt8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.rtc.ability.TakoRTCAbilityImpl$2", f = "TakoRTCAbilityImpl.kt", l = {71}, m = "invokeSuspend")
public final class C862880Xt8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoRTCAbilityImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C862880Xt8(TakoRTCAbilityImpl takoRTCAbilityImpl, InterfaceC1364105Vn<? super C862880Xt8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = takoRTCAbilityImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C862880Xt8 c862880Xt8 = new C862880Xt8(this.LLILLL, interfaceC1364105Vn);
        c862880Xt8.LLILLJJLI = obj;
        return c862880Xt8;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoRTCAbilityImpl@571a.<init>$2");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            TakoRTCAbilityImpl takoRTCAbilityImpl = this.LLILLL;
            C1279700jPE c1279700jPE = takoRTCAbilityImpl.LL;
            this.LL = 1;
            if (takoRTCAbilityImpl.LJJIJIIJIL(interfaceC497601wk, c1279700jPE, this) == objLJFF) {
                C1C7U.LIZIZ("TakoRTCAbilityImpl@571a.<init>$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoRTCAbilityImpl@571a.<init>$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
