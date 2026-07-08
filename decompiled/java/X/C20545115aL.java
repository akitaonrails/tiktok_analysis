package X;

import com.ss.android.ugc.aweme.compliance.api.model.FeedLynxOverlayConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.15aL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.FeedLynxPreloader$updateConfig$1", f = "FeedLynxPreloader.kt", l = {}, m = "invokeSuspend")
public final class C20545115aL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FeedLynxOverlayConfig LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20545115aL(FeedLynxOverlayConfig feedLynxOverlayConfig, InterfaceC1364105Vn<? super C20545115aL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = feedLynxOverlayConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20545115aL(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedLynxPreloader@b814.updateConfig$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FeedLynxOverlayConfig feedLynxOverlayConfig = this.LL;
        if (feedLynxOverlayConfig == null) {
            C20544915aJ.LIZ.getClass();
            C20544915aJ.LIZIZ();
            C20544915aJ.LIZJ(EnumC20545715aR.LL, "config_cleared");
            C20544915aJ.LJII = 0L;
        } else {
            String str = C20544915aJ.LJFF;
            if (str != null && !Intrinsics.LJFF(str, feedLynxOverlayConfig.lynxSchema)) {
                C20544915aJ.LIZ.getClass();
                C20544915aJ.LIZIZ();
                C20544915aJ.LIZJ(EnumC20545715aR.LL, "schema_changed");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedLynxPreloader@b814.updateConfig$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
