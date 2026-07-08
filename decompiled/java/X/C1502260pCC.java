package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.forestx.net.DefaultNetApi;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pCC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502260pCC implements InterfaceC1529320ptq {
    public final Map<String, String> LIZ;
    public final C0X9S<?> LIZIZ;

    @Override // X.InterfaceC1166350gSP
    public final boolean isValid() {
        Object c098200Yq;
        try {
            C0X9S<?> c0x9s = this.LIZIZ;
            c098200Yq = Boolean.valueOf(c0x9s.isCanceled() || c0x9s.isExecuted());
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return true ^ Intrinsics.LJFF(c098200Yq, Boolean.TRUE);
    }

    @Override // X.InterfaceC1529320ptq
    public final InterfaceC1531800pxq LIZIZ() {
        try {
            C2175508fh c2175508fh = this.LIZIZ.execute().LIZ;
            return new C1502270pCD(c2175508fh.LIZIZ, this, c2175508fh, DefaultNetApi.LIZ.LIZIZ(c2175508fh.LIZLLL), null);
        } catch (C1494430ozZ e) {
            TryCatchGuardChecker.doCheck(e);
            Integer numValueOf = Integer.valueOf(e.getStatusCode());
            iIntValue = numValueOf.intValue() != 0 ? numValueOf.intValue() : 499;
            String errorResponse = e.getErrorResponse();
            if (errorResponse == null) {
                errorResponse = e.getMessage();
            }
            return new C1502270pCD(iIntValue, this, null, null, errorResponse);
        } catch (C1494690ozz e2) {
            TryCatchGuardChecker.doCheck(e2);
            Integer numValueOf2 = Integer.valueOf(e2.getStatusCode());
            if (numValueOf2.intValue() != 0) {
                iIntValue = numValueOf2.intValue();
            } else {
                Integer numValueOf3 = Integer.valueOf(e2.getCronetInternalErrorCode());
                if (numValueOf3.intValue() != 0) {
                    iIntValue = numValueOf3.intValue();
                }
            }
            return new C1502270pCD(iIntValue, this, null, null, e2.getMessage());
        }
    }

    @Override // X.InterfaceC1166350gSP
    public final boolean cancel() {
        if (!isValid()) {
            return false;
        }
        this.LIZIZ.cancel();
        return true;
    }

    public C1502260pCC(Map map, C0X9S c0x9s) {
        this.LIZ = map;
        this.LIZIZ = c0x9s;
    }
}
