package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.log.IAdWebEventLogger;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0d9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1039420d9g implements InterfaceC1038710d8X, InterfaceC1039570d9v {
    public long LL;
    public final C1039460d9k LLILLJJLI;

    @Override // X.InterfaceC1039570d9v
    public final void C1(Long l, int i, List list) {
    }

    @Override // X.InterfaceC1039570d9v
    public final void I1(String str, boolean z) {
    }

    @Override // X.InterfaceC1029330ctP
    public final void LJI(int i, String str, boolean z, boolean z2) {
    }

    @Override // X.InterfaceC1029330ctP
    public final void LJIILLIIL(C1023960ckk c1023960ckk) {
    }

    @Override // X.InterfaceC1029330ctP
    public final void LJJIJIIJI(String str) {
    }

    @Override // X.InterfaceC1029330ctP
    public final void LJJJJIZL(String str, boolean z, Boolean bool) {
    }

    @Override // X.InterfaceC1039570d9v
    public final void ze(long j) {
    }

    @Override // X.InterfaceC1038710d8X
    public final void LJIILJJIL() {
        if (this.LL == 0) {
            return;
        }
        System.currentTimeMillis();
        long j = this.LL;
        this.LLILLJJLI.LIZLLL += System.currentTimeMillis() - j;
    }

    public C1039420d9g() {
        System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        System.currentTimeMillis();
        new ArrayList();
        C1039460d9k c1039460d9k = new C1039460d9k();
        this.LLILLJJLI = c1039460d9k;
        c1039460d9k.LIZIZ.add(this);
    }

    @Override // X.InterfaceC1038710d8X
    public final void LIZIZ() {
        this.LL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1038710d8X
    public final void LJJJLIIL() {
        InterfaceC1009950cO9 interfaceC1009950cO9 = (InterfaceC1009950cO9) ServiceManager.get().getService(IAdWebEventLogger.class);
        C1043510dGH.LIZ.getClass();
        interfaceC1009950cO9.logAd(C1043510dGH.LJFF, "1782187361828866", "test", null, new AwS595S0100000_16(this, 343));
    }
}
