package X;

import com.ss.android.ugc.aweme.minidrama.common.component.api.MiniDramaCacheService;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0s3U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612180s3U implements InterfaceC736910SvR<InterfaceC1611890s31> {
    public final Long LL;
    public final String LLILLJJLI;
    public int LLILZLL;
    public int LLIZLLLIL;
    public int LLJ;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(596));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(594));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(595));
    public int LLIZ = -1;
    public final C1612140s3Q LLJI = new C1612140s3Q(this);

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    public final boolean LIZ() {
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ == null || (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(this.LL)) == null) {
            return false;
        }
        return interfaceC1612220s3YLIZLLL.LJIJ();
    }

    public final Pair<C1612360s3m, Integer> LIZIZ() {
        InterfaceC1612220s3Y interfaceC1612220s3YLIZLLL;
        MiniDramaCacheService.LIZ.getClass();
        MiniDramaCacheService miniDramaCacheServiceLIZ = C1606610ruV.LIZ();
        if (miniDramaCacheServiceLIZ == null || (interfaceC1612220s3YLIZLLL = miniDramaCacheServiceLIZ.LIZLLL(this.LL)) == null) {
            return null;
        }
        return interfaceC1612220s3YLIZLLL.LJII();
    }

    @Override // X.InterfaceC736910SvR
    public final /* bridge */ /* synthetic */ InterfaceC149400hg getOperator() {
        return this.LLJI;
    }

    public C1612180s3U(Long l, String str) {
        this.LL = l;
        this.LLILLJJLI = str;
    }
}
