package X;

import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.y;

/* JADX INFO: renamed from: X.0QyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687780QyO extends y {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(y.b r21, final com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r22) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C687780QyO.LIZJ(y$b, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock):void");
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        y.b bVar = (y.b) xBaseParamModel;
        CertProviderManagerKt.findCert("bpea-search_poi_fetch_location", 1476395008, "nany");
        try {
            LIZJ(bVar, completionBlock);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            throw th;
        }
    }
}
