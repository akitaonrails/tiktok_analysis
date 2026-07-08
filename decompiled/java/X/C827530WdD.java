package X;

import com.ss.android.ugc.aweme.feedlog.ILogWriter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0WdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827530WdD implements ILogWriter {
    public static final C827530WdD LIZ = new C827530WdD();
    public static final boolean LIZIZ = C294900BhA.LIZ();

    @Override // com.ss.android.ugc.aweme.feedlog.ILogWriter
    public final void LIZJ(String str, int i, String str2, String str3) {
        if (LIZIZ) {
            C827300Wcq.LIZ.LIZJ(str, i, str2, str3);
            return;
        }
        ILogWriter iLogWriter = (ILogWriter) PluggableExtentionKt.pluggableSpi$default(ILogWriter.class, false, false, false, 14, null);
        if (iLogWriter == null) {
            return;
        }
        iLogWriter.LIZJ(str, i, str2, str3);
    }
}
