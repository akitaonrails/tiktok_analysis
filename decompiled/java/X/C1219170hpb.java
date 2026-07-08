package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hpb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tuc.mask.contentclassification.ContentClassificationMaskConfig$updateAge$1$onFinish$1$aweme$1", f = "ContentClassificationMaskConfig.kt", l = {}, m = "invokeSuspend")
public final class C1219170hpb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Aweme>, Object> {
    public final /* synthetic */ C101N LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219170hpb(C101N c101n, InterfaceC1364105Vn<? super C1219170hpb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c101n;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1219170hpb(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme awemeLJIIJ;
        C1C7U.LIZ("ContentClassificationMaskConfig@bc27.updateAge$1$onFinish$1$aweme$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            awemeLJIIJ = ((DetailFeedService) ServiceManager.get().getService(DetailFeedService.class)).LJIIJ(this.LL.LIZIZ.getAid(), "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            awemeLJIIJ = null;
        }
        C1C7U.LIZIZ("ContentClassificationMaskConfig@bc27.updateAge$1$onFinish$1$aweme$1");
        return awemeLJIIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Aweme> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
