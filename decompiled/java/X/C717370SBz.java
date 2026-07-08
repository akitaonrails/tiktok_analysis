package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0SBz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.subscription.subonlyvideos.views.SubOnlyPaywallOverlayViewHolder$getView$1$1$2$1", f = "SubOnlyPaywallOverlayViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C717370SBz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0SC0 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C717370SBz(C0SC0 c0sc0, InterfaceC1364105Vn<? super C717370SBz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0sc0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C717370SBz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SubOnlyPaywallOverlayViewHolder@208b.getView$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme awemeLJI = this.LL.LJI();
        if (awemeLJI != null && AwemeExtKt.isPhotoMode(awemeLJI) && Intrinsics.LJFF(this.LL.LJIIJJI(), false) && ((C13FE) this.LL.LJIIZILJ).getValue() != null) {
            C0SC0 c0sc0 = this.LL;
            c0sc0.LJIIL(c0sc0.LJI());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyPaywallOverlayViewHolder@208b.getView$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
