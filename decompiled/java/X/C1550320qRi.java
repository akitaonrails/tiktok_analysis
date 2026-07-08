package X;

import Y.ARunnableS27S1200000_23;
import com.bytedance.hybrid.spark.roma.config.FallbackServer;
import com.bytedance.hybrid.spark.roma.config.ShortLinkConfig;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qRi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public /* synthetic */ class C1550320qRi extends C2217421BqW implements Function2<String, Function1<? super C189200o6<? extends ShortLinkConfig>, ? extends Unit>, Unit> {
    public C1550320qRi(FallbackServer fallbackServer) {
        super(2, fallbackServer, FallbackServer.class, "getSparkConfigInternal", "getSparkConfigInternal(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, Function1<? super C189200o6<? extends ShortLinkConfig>, ? extends Unit> function1) {
        String str2 = str;
        Function1<? super C189200o6<? extends ShortLinkConfig>, ? extends Unit> function12 = function1;
        this.receiver.getClass();
        if (FallbackServer.LIZIZ == null) {
            C098200Yq c098200Yq = new C098200Yq(new FallbackServer.ServerError(0, "Server instance is null!", null));
            C189200o6.m2constructorimpl(c098200Yq);
            function12.invoke(C189200o6.m1boximpl(c098200Yq));
        } else {
            C1550330qRj c1550330qRjLJIIJJI = C1550300qRg.LIZIZ.LJIIJJI();
            ExecutorService executorService = C2281108wj.LIZ;
            C2281108wj.LIZIZ(EnumC2281308wl.Blocked, true, new ARunnableS27S1200000_23(c1550330qRjLJIIJJI, function12, str2, 3));
        }
        return Unit.LIZ;
    }
}
