package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger$NewPaywallCellOverlayComponent$onViewCreated$19", f = "PaywallComponentTrigger.kt", l = {}, m = "invokeSuspend")
public final class C716210S7n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PaywallComponentTrigger.NewPaywallCellOverlayComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C716210S7n(PaywallComponentTrigger.NewPaywallCellOverlayComponent newPaywallCellOverlayComponent, InterfaceC1364105Vn<? super C716210S7n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = newPaywallCellOverlayComponent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C716210S7n(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaywallComponentTrigger$NewPaywallCellOverlayComponent@8f8d.onViewCreated$19");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL.getContext();
        if (context != null) {
            final PaywallComponentTrigger.NewPaywallCellOverlayComponent newPaywallCellOverlayComponent = this.LL;
            C0SHX.LIZ(context, null).LJIIIZ("comment_panel", new C0T3B() { // from class: X.0S7o
                @Override // X.C0T3B
                public final void LIZ() {
                    newPaywallCellOverlayComponent.Ip(false);
                    View contentView = newPaywallCellOverlayComponent.getContentView();
                    if (contentView != null) {
                        C786410Ut5.LJLLLLLL(0, contentView);
                    }
                }

                @Override // X.C0T3B
                public final void LIZIZ() {
                    newPaywallCellOverlayComponent.Ip(true);
                    View contentView = newPaywallCellOverlayComponent.getContentView();
                    if (contentView != null) {
                        C786410Ut5.LJLLLLLL(8, contentView);
                    }
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaywallComponentTrigger$NewPaywallCellOverlayComponent@8f8d.onViewCreated$19");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
