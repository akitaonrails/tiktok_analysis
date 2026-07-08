package X;

import com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApiV2;
import com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTimeoutInterceptor;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LuZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558010LuZ extends C09AY implements Function0<AIGCTaskNetApiV2> {
    public C558010LuZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.aigc.asynctask.net.AIGCTaskNetApiV2, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final AIGCTaskNetApiV2 invoke() {
        return C0CHQ.LIZ().getNetworkService().createRetrofitWithInterceptors(C557860LuK.LIZIZ, true, AIGCTaskNetApiV2.class, Collections.singletonList(new AIGCTimeoutInterceptor()));
    }
}
