package X;

import com.bytedance.helios.network.SandboxBridge;
import com.bytedance.helios.network.pipeline.recognize.NetworkDomainRecognize;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.orbu.core.api.IDomainTypeIdentifier;

/* JADX INFO: renamed from: X.0Wzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841470Wzh implements IDomainTypeIdentifier {
    public static final C841470Wzh LIZ = new C841470Wzh();

    @Override // com.orbu.core.api.IDomainTypeIdentifier
    public final String identify(String str) {
        String strDomainIdentityRecognize = null;
        if (str == null) {
            return null;
        }
        try {
            strDomainIdentityRecognize = NetworkDomainRecognize.domainIdentityRecognize(str);
            return strDomainIdentityRecognize;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return strDomainIdentityRecognize;
        }
    }

    @Override // com.orbu.core.api.IDomainTypeIdentifier
    public final boolean matchAgSchema(String str) {
        if (str == null) {
            return false;
        }
        return SandboxBridge.matchAgSchema(str);
    }
}
