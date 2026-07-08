package X;

import com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.videoreplay.ECLiveVideoReplayPreloadManager$preload$1$1$state$1", f = "ECLiveVideoReplayPreloadManager.kt", l = {500}, m = "invokeSuspend")
public final class C1568770qvT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1572300r1A>, Object> {
    public int LL;
    public final /* synthetic */ C1568780qvU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568770qvT(C1568780qvU c1568780qvU, InterfaceC1364105Vn<? super C1568770qvT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1568780qvU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568770qvT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECLiveVideoReplayPreloadManager@de08.preload$1$1$state$1");
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
            C188E c188e = ECLiveVideoReplayViewModel.LLILLL;
            C1568780qvU c1568780qvU = this.LLILLJJLI;
            String str = c1568780qvU.LIZ;
            String str2 = c1568780qvU.LIZJ;
            String str3 = c1568780qvU.LIZIZ;
            this.LL = 1;
            obj = c188e.LIZ(str, str2, str3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.preload$1$1$state$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ECLiveVideoReplayPreloadManager@de08.preload$1$1$state$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AbstractC1572300r1A> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
