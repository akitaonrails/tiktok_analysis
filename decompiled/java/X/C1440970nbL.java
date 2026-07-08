package X;

import com.bytedance.ies.nle.editor_jni.INLEHTTPClientDelegateWrapper;
import com.bytedance.ies.nle.editor_jni.NLENetworkClientDelegateWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0nbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440970nbL {
    public static final C1440970nbL LIZ = new C1440970nbL();
    public static boolean LIZIZ;
    public static INLEHTTPClientDelegateWrapper LIZJ;

    public final void LIZ(C1441000nbO c1441000nbO) {
        synchronized (this) {
            try {
                LIZJ = c1441000nbO;
                if (LIZIZ) {
                    NLENetworkClientDelegateWrapper.setHttpClientWrapper(c1441000nbO);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
