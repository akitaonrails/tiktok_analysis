package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.PdpSupplementData;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.pdp.dto.UniversalProductDto;

/* JADX INFO: renamed from: X.0Czm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331920Czm {
    public final C331730CzT LIZ() {
        C331730CzT c331730CzT = C331730CzT.LJIIIIZZ;
        if (c331730CzT == null) {
            synchronized (this) {
                try {
                    c331730CzT = C331730CzT.LJIIIIZZ;
                    if (c331730CzT == null) {
                        c331730CzT = new C331730CzT(new C0D0J(), new C0D16(0), new C0D1E(), new C331930Czn(), C0D0E.LJ.LIZ(), new InterfaceC331700CzQ() { // from class: X.0Czl
                            @Override // X.InterfaceC331700CzQ
                            public final C0D3K LIZ(UniversalProductDto universalProductDto, UniversalProductDto universalProductDto2, String str, PdpSupplementData pdpSupplementData) {
                                return C0D30.LIZ(C0D30.LIZ, universalProductDto, universalProductDto2, str, pdpSupplementData, true, null, 128);
                            }
                        });
                        C331730CzT.LJIIIIZZ = c331730CzT;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c331730CzT;
    }
}
