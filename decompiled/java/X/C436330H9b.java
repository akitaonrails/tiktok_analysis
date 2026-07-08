package X;

import android.view.View;
import com.ss.android.ugc.aweme.api.component.videoshrink.CommerceLandingPageVideoShrinkComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.videoshrink.CommerceLandingPageVideoShrinkComponent$tryShowBackIconView$5", f = "CommerceLandingPageVideoShrinkComponent.kt", l = {559}, m = "invokeSuspend")
public final class C436330H9b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommerceLandingPageVideoShrinkComponent LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436330H9b(CommerceLandingPageVideoShrinkComponent commerceLandingPageVideoShrinkComponent, InterfaceC1364105Vn<? super C436330H9b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commerceLandingPageVideoShrinkComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436330H9b(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommerceLandingPageVideoShrinkComponent@dd67.tryShowBackIconView$5");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(200L, this) == objLJFF) {
                C1C7U.LIZIZ("CommerceLandingPageVideoShrinkComponent@dd67.tryShowBackIconView$5");
                return objLJFF;
            }
        }
        View viewBo = this.LLILLJJLI.Bo();
        if (viewBo != null) {
            C786410Ut5.LJLLLLLL(0, viewBo);
        }
        C1022620cia.LIZ("CommerceLandingPageVideoShrinkComponent", "[showBackIconView] backIcon show");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommerceLandingPageVideoShrinkComponent@dd67.tryShowBackIconView$5");
        return unit;
    }
}
