package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017800cao implements InterfaceC1034560d1q {
    public Aweme LL;
    public Context LLILLJJLI;
    public ViewGroup LLILLL;
    public C1017780cam LLILZ;
    public C1017840cas LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(402));
    public final AwS595S0100000_16 LLIZ = new AwS595S0100000_16(this, 260);

    @Override // X.InterfaceC1034560d1q
    public final void LJ() {
    }

    @Override // X.InterfaceC1034560d1q
    public final void LJIIJ() {
    }

    public final InterfaceC1017820caq LJIIJJI() {
        return (InterfaceC1017820caq) this.LLILZLL.getValue();
    }

    public final void LJIIL() {
        Aweme aweme;
        AwemeRawAd awemeRawAdLJJIJLIJ;
        String packageName;
        InterfaceC1017820caq interfaceC1017820caqLJIIJJI = LJIIJJI();
        if (interfaceC1017820caqLJIIJJI == null || (aweme = this.LL) == null || (awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme)) == null || (packageName = awemeRawAdLJJIJLIJ.getPackageName()) == null) {
            return;
        }
        if (!interfaceC1017820caqLJIIJJI.LJIIIZ(awemeRawAdLJJIJLIJ)) {
            C1017780cam c1017780cam = this.LLILZ;
            if (c1017780cam != null) {
                c1017780cam.LIZ();
                return;
            }
            return;
        }
        interfaceC1017820caqLJIIJJI.LJIIIIZZ(awemeRawAdLJJIJLIJ).LJJIIZI(null, "homepage_ad", null, C2162308dZ.LJFF(this.LLILLJJLI, packageName) ? "cip_open" : "cip_download");
        switch (C1017970cb5.LIZ[interfaceC1017820caqLJIIJJI.LJIIZILJ(packageName).ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                C1017780cam c1017780cam2 = this.LLILZ;
                if (c1017780cam2 != null) {
                    c1017780cam2.LIZ();
                    return;
                }
                return;
            case 5:
            case 6:
            case 7:
                return;
            default:
                throw new C1954807lC();
        }
    }

    @Override // X.InterfaceC1034560d1q
    public final void unBind() {
        InterfaceC1017820caq interfaceC1017820caqLJIIJJI = LJIIJJI();
        if (interfaceC1017820caqLJIIJJI != null) {
            interfaceC1017820caqLJIIJJI.LJIILLIIL(this.LLIZ);
        }
    }

    @Override // X.InterfaceC1034560d1q
    public final void LJIIIZ(C1017730cah c1017730cah) {
        this.LL = c1017730cah.LIZIZ;
        this.LLILLJJLI = c1017730cah.LIZ;
        this.LLILZ = c1017730cah.LIZJ;
        this.LLILLL = c1017730cah.LJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0144  */
    @Override // X.InterfaceC1034560d1q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(boolean r15, boolean r16) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1017800cao.LIZJ(boolean, boolean):void");
    }

    @Override // X.InterfaceC1034560d1q
    public final void LJII(int i, boolean z) {
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1017820caq interfaceC1017820caqLJIILIIL;
        C1018030cbB c1018030cbB;
        if (!z) {
            C1017840cas c1017840cas = this.LLILZIL;
            if (c1017840cas != null && (c1018030cbB = c1017840cas.LIZLLL) != null) {
                c1018030cbB.LJIJJLI(3);
            }
            ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
            if (iCommerceService != null && (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) != null && (interfaceC1017820caqLJIILIIL = iFeedServiceLIZIZ.LJIILIIL()) != null) {
                interfaceC1017820caqLJIILIIL.LJIILLIIL(this.LLIZ);
            }
        }
    }
}
