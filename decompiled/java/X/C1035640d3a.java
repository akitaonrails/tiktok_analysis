package X;

import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1035640d3a extends LynxViewClient {
    public final InterfaceC1039110d9B LL;

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILIIL(String str) {
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIILJJIL() {
    }

    public C1035640d3a(InterfaceC1039110d9B interfaceC1039110d9B) {
        this.LL = interfaceC1039110d9B;
    }

    @Override // com.lynx.tasm.LynxViewClient
    public final void LJIIZILJ(String str) {
        C1028030crJ c1028030crJ;
        AdLynxStatBusiness adLynxStatBusiness = (AdLynxStatBusiness) this.LL.LIZIZ(AdLynxStatBusiness.class);
        if (adLynxStatBusiness != null) {
            adLynxStatBusiness.LIZIZ = false;
            adLynxStatBusiness.LIZJ = false;
            adLynxStatBusiness.LJIIIZ = 0L;
            adLynxStatBusiness.LJIIJ = System.currentTimeMillis();
            ((ArrayList) adLynxStatBusiness.LJFF).clear();
            adLynxStatBusiness.LJI = false;
            adLynxStatBusiness.LJII = System.currentTimeMillis();
            adLynxStatBusiness.LJ = System.currentTimeMillis();
            C1027760cqs c1027760cqsLIZ = adLynxStatBusiness.LIZ();
            if (c1027760cqsLIZ != null && (c1028030crJ = c1027760cqsLIZ.LJJJJI) != null) {
                Intrinsics.LJFF(c1028030crJ.LIZJ(), Boolean.TRUE);
            }
        }
    }
}
