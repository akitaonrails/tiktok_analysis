package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger;

/* JADX INFO: renamed from: X.0VGF, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VGF implements IUnsampledTraceLogger {
    public static final C0VGF LIZIZ = new C0VGF();
    public final /* synthetic */ IUnsampledTraceLogger LIZ = (IUnsampledTraceLogger) ServiceManager.get().getService(IUnsampledTraceLogger.class);

    @Override // com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger
    public final void LIZ(Context context, String str) {
        this.LIZ.LIZ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.trace.IUnsampledTraceLogger
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }
}
