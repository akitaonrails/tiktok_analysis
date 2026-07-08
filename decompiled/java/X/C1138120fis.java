package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fis, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.tray.animation.GiftTrayAnimationOrchestrator$TrayAnimationState$handleTrayEventExit$1$1", f = "GiftTrayAnimationOrchestrator.kt", l = {105}, m = "invokeSuspend")
public final class C1138120fis extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1138090fip LLILLJJLI;
    public final /* synthetic */ AbstractC1138110fir LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1138120fis(C1138090fip c1138090fip, AbstractC1138110fir abstractC1138110fir, InterfaceC1364105Vn<? super C1138120fis> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1138090fip;
        this.LLILLL = abstractC1138110fir;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1138120fis(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftTrayAnimationOrchestrator$TrayAnimationState@e067.handleTrayEventExit$1$1");
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
            InterfaceC1138270fj7 interfaceC1138270fj7 = this.LLILLJJLI.LIZ;
            EnumC1137200fhO enumC1137200fhO = EnumC1137200fhO.EXIT;
            this.LL = 1;
            obj = interfaceC1138270fj7.LJII(enumC1137200fhO, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GiftTrayAnimationOrchestrator$TrayAnimationState@e067.handleTrayEventExit$1$1");
                return objLJFF;
            }
        }
        C1138090fip c1138090fip = this.LLILLJJLI;
        final C1138090fip c1138090fip2 = this.LLILLL.LIZ;
        c1138090fip.LIZIZ(new AbstractC1138110fir(c1138090fip2) { // from class: X.0fj8
            @Override // X.AbstractC1138110fir
            public final String LIZ() {
                return "ExitingState";
            }

            @Override // X.AbstractC1138110fir
            public final void LIZJ() {
                C1138090fip c1138090fip3 = this.LIZ;
                c1138090fip3.LIZ.LJIIL();
                c1138090fip3.LIZIZ(new C1138250fj5(this.LIZ));
                c1138090fip3.LJFF = null;
                c1138090fip3.LIZIZ.LIZJ();
            }

            @Override // X.AbstractC1138110fir
            public final void LIZLLL(C1135810ff9 c1135810ff9) {
                LJII("ExitingState.onCombo");
            }

            @Override // X.AbstractC1138110fir
            public final void LJ(C1135810ff9 c1135810ff9) {
                LJII("ExitingState.onEnter");
            }

            @Override // X.AbstractC1138110fir
            public final void LJFF(C1135810ff9 c1135810ff9) {
                LJII("ExitingState.onExit");
            }
        });
        this.LLILLJJLI.LJ((C1138260fj6) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GiftTrayAnimationOrchestrator$TrayAnimationState@e067.handleTrayEventExit$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
