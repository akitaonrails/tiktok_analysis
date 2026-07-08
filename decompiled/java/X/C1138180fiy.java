package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayStuckRecoverySetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fiy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.tray.animation.EnteringState$onAnimationEnd$1$1", f = "GiftTrayAnimationOrchestrator.kt", l = {393}, m = "invokeSuspend")
public final class C1138180fiy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1138090fip LLILLJJLI;
    public final /* synthetic */ C1138210fj1 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1138180fiy(C1138090fip c1138090fip, C1138210fj1 c1138210fj1, InterfaceC1364105Vn<? super C1138180fiy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1138090fip;
        this.LLILLL = c1138210fj1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1138180fiy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnteringState@e429.onAnimationEnd$1$1");
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
            EnumC1137200fhO enumC1137200fhO = EnumC1137200fhO.RIGHT_TAG;
            this.LL = 1;
            obj = interfaceC1138270fj7.LJII(enumC1137200fhO, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EnteringState@e429.onAnimationEnd$1$1");
                return objLJFF;
            }
        }
        C1138090fip c1138090fip = this.LLILLJJLI;
        final C1138090fip c1138090fip2 = this.LLILLL.LIZ;
        c1138090fip.LIZIZ(new AbstractC1138110fir(c1138090fip2) { // from class: X.0fit
            @Override // X.AbstractC1138110fir
            public final String LIZ() {
                return "PostEnterState";
            }

            @Override // X.AbstractC1138110fir
            public final void LIZJ() {
                C1138090fip c1138090fip3 = this.LIZ;
                c1138090fip3.LIZ.LJFF();
                C1137070fhB c1137070fhB = c1138090fip3.LJ;
                C1135810ff9 c1135810ff9 = c1138090fip3.LJFF;
                c1137070fhB.getClass();
                C1133690fbj.LIZ.getClass();
                if (!(!C1133690fbj.LJ(c1135810ff9))) {
                    c1138090fip3.LIZIZ(new C1138240fj4(this.LIZ));
                    c1138090fip3.LIZIZ.LIZIZ(c1138090fip3.LJFF);
                    return;
                }
                LifecycleCoroutineScope lifecycleCoroutineScope = c1138090fip3.LIZ.getLifecycleCoroutineScope();
                if (lifecycleCoroutineScope == null) {
                    LJI("scope_null:PostEnterState.toCombo");
                } else {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ.LLIILII(), null, new C1138140fiu(c1138090fip3, this, null), 2);
                }
            }

            @Override // X.AbstractC1138110fir
            public final void LIZLLL(C1135810ff9 c1135810ff9) {
                LJII("PostEnterState.onCombo");
            }

            @Override // X.AbstractC1138110fir
            public final void LJ(C1135810ff9 c1135810ff9) {
                LJII("PostEnterState.onEnter");
            }

            @Override // X.AbstractC1138110fir
            public final void LJFF(C1135810ff9 c1135810ff9) {
                LJII("PostEnterState.onExit");
                if (LiveGiftTrayStuckRecoverySetting.INSTANCE.exitOnAllState()) {
                    LIZIZ("PostEnterState.onExit", c1135810ff9, true);
                }
            }
        });
        this.LLILLJJLI.LJ((C1138260fj6) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EnteringState@e429.onAnimationEnd$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
