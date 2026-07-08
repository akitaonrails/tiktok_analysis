package X;

import com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Luk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558120Luk extends C09AY implements Function0<AIGCTaskNetApi> {
    public C558120Luk() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApi, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AIGCTaskNetApi invoke() {
        return C0CHQ.LIZ().getNetworkService().createRetrofit(C558070Luf.LIZIZ, true, AIGCTaskNetApi.class);
    }
}
