package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DLR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DLR {
    public static final Cert LIZ = CertProviderManagerKt.findCert("bpea-search_text_copy", 1476399144);

    public static void LIZ(Context context, String str) {
        try {
            C20145813s8.LIZ("copy_label", str, context, LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
