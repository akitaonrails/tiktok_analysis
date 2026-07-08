package X;

import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0SC1, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.subonlyvideos.views.SubOnlyPaywallOverlayViewHolder$getView$1$1$4$1", f = "SubOnlyPaywallOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C0SC1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0SC0 LL;
    public final /* synthetic */ ComposeView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SC1(C0SC0 c0sc0, ComposeView composeView, InterfaceC1364105Vn<? super C0SC1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0sc0;
        this.LLILLJJLI = composeView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0SC1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubOnlyPaywallOverlayViewHolder@208b.getView$1$1$4$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!C290690BaN.LIZ()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SubOnlyPaywallOverlayViewHolder@208b.getView$1$1$4$1");
            return unit;
        }
        boolean z = false;
        if (!Intrinsics.LJFF(this.LL.LJIIJJI(), false)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("SubOnlyPaywallOverlayViewHolder@208b.getView$1$1$4$1");
            return unit2;
        }
        Aweme awemeLJI = this.LL.LJI();
        if ((awemeLJI == null || !awemeLJI.getIsTikTokStory()) && !((Boolean) ((C13FE) this.LL.LJJIIJZLJL).getValue()).booleanValue()) {
            z = true;
        }
        if (this.LL.LJII() && !z && ((Boolean) ((C13FE) this.LL.LJJIIZ).getValue()).booleanValue() && !((Boolean) ((C13FE) this.LL.LJJIIZI).getValue()).booleanValue()) {
            ((C13FE) this.LL.LJJIIZI).setValue(Boolean.TRUE);
            AwS447S0200000_11 awS447S0200000_11 = this.LL.LJJIJIL;
            if (awS447S0200000_11 != null) {
                awS447S0200000_11.invoke(this.LLILLJJLI.getContext(), true);
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SubOnlyPaywallOverlayViewHolder@208b.getView$1$1$4$1");
            return unit3;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyPaywallOverlayViewHolder@208b.getView$1$1$4$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
