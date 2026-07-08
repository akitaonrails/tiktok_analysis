package X;

import com.bytedance.ies.ugc.statisticloggerapi.IAwemeCommonLogger;
import com.ss.android.ugc.aweme.legoImp.task.ubtrace.AwemeCommonLoggerImpl;

/* JADX INFO: renamed from: X.1E8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276471E8n implements IAwemeCommonLogger {
    public static final C2276471E8n LIZIZ = new C2276471E8n();
    public final /* synthetic */ IAwemeCommonLogger LIZ;

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCommonLogger
    public final void LIZ(String str, String str2, String str3) {
        this.LIZ.LIZ(str, str2, str3);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCommonLogger
    public final void LIZIZ(String str, String str2, String str3) {
        this.LIZ.LIZIZ(str, str2, str3);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCommonLogger
    public final void LIZJ(String str, Throwable th, String str2, String str3) {
        this.LIZ.LIZJ(str, th, str2, str3);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCommonLogger
    public final void d(String str, String str2) {
        this.LIZ.d(str, str2);
    }

    @Override // com.bytedance.ies.ugc.statisticloggerapi.IAwemeCommonLogger
    public final void e(String str, String str2, Throwable th) {
        this.LIZ.e(str, str2, th);
    }

    public C2276471E8n() {
        IAwemeCommonLogger iAwemeCommonLogger;
        Object objLIZ = C04TD.LIZ(IAwemeCommonLogger.class, false);
        if (objLIZ != null) {
            iAwemeCommonLogger = (IAwemeCommonLogger) objLIZ;
        } else {
            if (C04TD.T1 == null) {
                synchronized (IAwemeCommonLogger.class) {
                    if (C04TD.T1 == null) {
                        C04TD.T1 = new AwemeCommonLoggerImpl();
                    }
                }
            }
            iAwemeCommonLogger = C04TD.T1;
        }
        this.LIZ = iAwemeCommonLogger;
    }
}
