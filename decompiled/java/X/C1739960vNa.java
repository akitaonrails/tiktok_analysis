package X;

import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vNa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.prefetch.manager.NativePrefetchNetworkManager", f = "NativePrefetchNetworkManager.kt", l = {LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT}, m = "prefetchRequest")
public final class C1739960vNa extends AbstractC23140094w {
    public C1739980vNc LL;
    public C1739860vNQ LLILLJJLI;
    public Function1 LLILLL;
    public int LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C1739930vNX LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739960vNa(C1739930vNX c1739930vNX, InterfaceC1364105Vn<? super C1739960vNa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c1739930vNX;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NativePrefetchNetworkManager@869.prefetchRequest$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZ.LIZ(null, null, 0, null, this);
        C1C7U.LIZIZ("NativePrefetchNetworkManager@869.prefetchRequest$1");
        return objLIZ;
    }
}
