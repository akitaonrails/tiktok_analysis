package X;

import com.appsflyer.AFLogger;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.13o6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final /* synthetic */ class RunnableC20120813o6 implements Runnable {
    public final /* synthetic */ Function1 LL;

    public /* synthetic */ RunnableC20120813o6(Function1 function1) {
        this.LL = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.lambda$semisugar$AFInAppEventType$1(this.LL);
    }
}
