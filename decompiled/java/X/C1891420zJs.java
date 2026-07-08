package X;

import android.os.Handler;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1891420zJs extends C09AY implements Function0<Executor> {
    public final /* synthetic */ C1891380zJo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891420zJs(C1891380zJo c1891380zJo) {
        super(0);
        this.LL = c1891380zJo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Executor invoke() {
        final C1891380zJo c1891380zJo = this.LL;
        return new Executor() { // from class: X.0T6N
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                C786410Ut5.LJL((Handler) c1891380zJo.LJIIJJI.getValue(), runnable);
            }
        };
    }
}
