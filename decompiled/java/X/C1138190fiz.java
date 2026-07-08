package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftTrayStuckRecoverySetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fiz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.tray.animation.ComboingState$onAnimationEnd$1$1", f = "GiftTrayAnimationOrchestrator.kt", l = {490}, m = "invokeSuspend")
public final class C1138190fiz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1138090fip LLILLJJLI;
    public final /* synthetic */ C1138200fj0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1138190fiz(C1138090fip c1138090fip, C1138200fj0 c1138200fj0, InterfaceC1364105Vn<? super C1138190fiz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1138090fip;
        this.LLILLL = c1138200fj0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1138190fiz(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComboingState@af4d.onAnimationEnd$1$1");
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
            EnumC1137200fhO enumC1137200fhO = EnumC1137200fhO.RESHOW;
            this.LL = 1;
            obj = interfaceC1138270fj7.LJII(enumC1137200fhO, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ComboingState@af4d.onAnimationEnd$1$1");
                return objLJFF;
            }
        }
        C1138090fip c1138090fip = this.LLILLJJLI;
        final C1138090fip c1138090fip2 = this.LLILLL.LIZ;
        c1138090fip.LIZIZ(new AbstractC1138110fir(c1138090fip2) { // from class: X.0fj2
            @Override // X.AbstractC1138110fir
            public final String LIZ() {
                return "SponsorReshowingState";
            }

            @Override // X.AbstractC1138110fir
            public final void LIZJ() {
                C1138090fip c1138090fip3 = this.LIZ;
                C1135810ff9 c1135810ff9 = c1138090fip3.LJFF;
                if (c1135810ff9 != null) {
                    c1138090fip3.LIZ.LIZIZ(c1135810ff9);
                }
                LifecycleCoroutineScope lifecycleCoroutineScope = c1138090fip3.LIZ.getLifecycleCoroutineScope();
                if (lifecycleCoroutineScope == null) {
                    LJI("scope_null:SponsorReshowingState.reenter");
                } else {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleCoroutineScope, C2107308Nj.LIZ.LLIILII(), null, new C1138170fix(c1138090fip3, this, null), 2);
                }
            }

            @Override // X.AbstractC1138110fir
            public final void LIZLLL(C1135810ff9 c1135810ff9) {
                LJII("SponsorReshowingState.onCombo");
            }

            @Override // X.AbstractC1138110fir
            public final void LJ(C1135810ff9 c1135810ff9) {
                LJII("SponsorReshowingState.onEnter");
            }

            @Override // X.AbstractC1138110fir
            public final void LJFF(C1135810ff9 c1135810ff9) {
                LJII("SponsorReshowingState.onExit");
                if (LiveGiftTrayStuckRecoverySetting.INSTANCE.exitOnAllState()) {
                    LIZIZ("SponsorReshowingState.onExit", c1135810ff9, true);
                }
            }
        });
        this.LLILLJJLI.LJ((C1138260fj6) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComboingState@af4d.onAnimationEnd$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
