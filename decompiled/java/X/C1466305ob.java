package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.05ob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1466305ob extends AbstractC1466005oY {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        String host;
        try {
            c098200Yq = UriProtector.parse(getHybridUrl(EnumC1063300dmC.WEB));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Uri uri = (Uri) c098200Yq;
        if (uri != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        C1022620cia.LIZ("GetGAID", "onHandle: host -> " + host);
        if (!C13LQ.LJIILLIIL(host, (Object[]) C1466505od.LIZIZ.getValue())) {
            C2382909Vj.LIZ(completionBlock, 0, "host isn't in whitelist", null, 4);
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.plus(C23118094a.LIZ())), null, null, new C1465805oW(this, completionBlock, null), 3);
        }
    }
}
