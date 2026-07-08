package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fiq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.tray.animation.GiftTrayAnimationOrchestrator$TrayAnimationState$onMultiHostExit$1$1$1", f = "GiftTrayAnimationOrchestrator.kt", l = {75}, m = "invokeSuspend")
public final class C1138100fiq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1138090fip LLILLJJLI;
    public final /* synthetic */ AbstractC1138110fir LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1138100fiq(C1138090fip c1138090fip, AbstractC1138110fir abstractC1138110fir, Function0<Unit> function0, InterfaceC1364105Vn<? super C1138100fiq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1138090fip;
        this.LLILLL = abstractC1138110fir;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1138100fiq(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftTrayAnimationOrchestrator$TrayAnimationState@e067.onMultiHostExit$1$1$1");
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
            this.LLILLJJLI.LIZJ("onMultiHostExit scope!=null, start EXIT animation");
            InterfaceC1138270fj7 interfaceC1138270fj7 = this.LLILLJJLI.LIZ;
            EnumC1137200fhO enumC1137200fhO = EnumC1137200fhO.EXIT;
            this.LL = 1;
            obj = interfaceC1138270fj7.LJII(enumC1137200fhO, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GiftTrayAnimationOrchestrator$TrayAnimationState@e067.onMultiHostExit$1$1$1");
                return objLJFF;
            }
        }
        C1138260fj6 c1138260fj6 = (C1138260fj6) obj;
        this.LLILLJJLI.LIZIZ(new C1138250fj5(this.LLILLL.LIZ));
        this.LLILLJJLI.LJ(new C1138260fj6(c1138260fj6.LIZ, c1138260fj6.LIZIZ, this.LLILZ, 4));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftTrayAnimationOrchestrator$TrayAnimationState@e067.onMultiHostExit$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
