package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.ICrossPlatformFromMainOutService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05s2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.abretrieve.AbRetrieveTask$run$1$1$abMockConfigUri$1", f = "AbRetrieveTask.kt", l = {}, m = "invokeSuspend")
public final class C1487605s2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public C1487605s2(InterfaceC1364105Vn<? super C1487605s2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1487605s2(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZ;
        C1C7U.LIZ("AbRetrieveTask@a2e.run$1$1$abMockConfigUri$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ICrossPlatformFromMainOutService iCrossPlatformFromMainOutService = (ICrossPlatformFromMainOutService) PluggableExtentionKt.pluggableSpi$default(ICrossPlatformFromMainOutService.class, false, false, false, 14, null);
        if (iCrossPlatformFromMainOutService != null) {
            strLIZ = iCrossPlatformFromMainOutService.LIZ();
        } else {
            strLIZ = null;
        }
        C1C7U.LIZIZ("AbRetrieveTask@a2e.run$1$1$abMockConfigUri$1");
        return strLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return new C1487605s2(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
