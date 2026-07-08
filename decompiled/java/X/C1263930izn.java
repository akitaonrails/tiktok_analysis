package X;

import Y.ARunnableS113S0100000_13;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;

/* JADX INFO: renamed from: X.0izn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263930izn implements InterfaceC1263400iyw {
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public C1704320uS6 LJ;
    public C1704320uS6 LJFF;
    public EnumC325100Com LJI;
    public boolean LJII;
    public long LJIIIIZZ = -1;

    @Override // X.InterfaceC1263400iyw
    public final void LIZIZ() {
        if (this.LJII) {
            return;
        }
        this.LJFF = C1704330uS7.LIZ();
    }

    @Override // X.InterfaceC1263400iyw
    public final void LIZJ() {
        if (this.LJII) {
            return;
        }
        this.LJ = C1704330uS7.LIZ();
        this.LJI = ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getNetworkStatus();
    }

    @Override // X.InterfaceC1263400iyw
    public final void LIZ(AbstractC1264080j02<?> abstractC1264080j02) {
        if (this.LJII) {
            return;
        }
        this.LJII = true;
        C1704320uS6 c1704320uS6 = this.LJ;
        if (c1704320uS6 != null) {
            c1704320uS6.stop();
            long j = c1704320uS6.LIZJ - c1704320uS6.LIZIZ;
            C1704320uS6 c1704320uS62 = this.LJFF;
            if (c1704320uS62 != null) {
                c1704320uS62.stop();
                C823050WQl.LIZJ().execute(new ARunnableS113S0100000_13(new C1263920izm(abstractC1264080j02, this, j, c1704320uS62.LIZJ - c1704320uS62.LIZIZ), 270));
            }
        }
    }

    @Override // X.InterfaceC1263400iyw
    public final void LIZLLL(long j) {
        if (this.LJII) {
            return;
        }
        this.LJIIIIZZ = j;
    }

    public C1263930izn(String str, String str2, String str3) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
