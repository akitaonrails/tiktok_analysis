package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Zaw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902560Zaw {
    public static final void LIZ(Context context, String str) {
        Cert certFindCert = CertProviderManagerKt.findCert("bpea-219", 1476399118);
        try {
            if (C06W7.LIZIZ(context)) {
                C20145813s8.LIZ("copy_im_label", str, context, certFindCert);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
