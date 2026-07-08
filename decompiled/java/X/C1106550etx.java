package X;

import com.ss.android.ugc.aweme.ab.SmartLivePreviewCTADisplayConfig;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0etx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager$onHostSetup$1", f = "LivePreviewCTASmartDisplayManager.kt", l = {138}, m = "invokeSuspend")
public final class C1106550etx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1106550etx(InterfaceC1364105Vn<? super C1106550etx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1106550etx(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LivePreviewCTASmartDisplayManager@2b80.onHostSetup$1");
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
            long j = ((SmartLivePreviewCTADisplayConfig) C1106560ety.LIZIZ.getValue()).delayCallEngine;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("LivePreviewCTASmartDisplayManager@2b80.onHostSetup$1");
                return objLJFF;
            }
        }
        LivePreviewCTASmartDisplayManager.INSTANCE.runAsync();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LivePreviewCTASmartDisplayManager@2b80.onHostSetup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1106550etx(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
