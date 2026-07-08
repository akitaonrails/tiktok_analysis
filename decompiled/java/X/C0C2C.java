package X;

import android.os.HandlerThread;
import com.ss.android.ugc.aweme.legoImp.task.assem.ReporterExecutor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C2C, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C2C extends C09AY implements Function0<ReporterExecutor.RunnableHandler> {
    public final /* synthetic */ ReporterExecutor LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0C2C(ReporterExecutor reporterExecutor) {
        super(0);
        this.LL = reporterExecutor;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ ReporterExecutor.RunnableHandler invoke() {
        return new ReporterExecutor.RunnableHandler(C786410Ut5.W2((HandlerThread) this.LL.LL.getValue()));
    }
}
