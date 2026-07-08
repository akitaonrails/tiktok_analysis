package X;

import com.bytedance.android.live.wallet.model.recharge.RecommendStrategyParam;

/* JADX INFO: renamed from: X.0x3Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1804420x3Y {
    public final int LIZ;
    public final InterfaceC1284030jWD LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final boolean LJ;
    public final RecommendStrategyParam LJFF;
    public final boolean LJI;
    public final Long LJII;
    public final EnumC587980N4i LJIIIIZZ;
    public final int LJIIIZ;

    public /* synthetic */ C1804420x3Y(int i, InterfaceC1284030jWD interfaceC1284030jWD, long j, long j2, RecommendStrategyParam recommendStrategyParam, Long l, EnumC587980N4i enumC587980N4i, int i2, int i3) {
        this(i, interfaceC1284030jWD, j, j2, false, (i3 & 32) != 0 ? null : recommendStrategyParam, false, l, (i3 & 256) == 0 ? enumC587980N4i : null, (i3 & 512) != 0 ? 0 : i2);
    }

    public C1804420x3Y(int i, InterfaceC1284030jWD interfaceC1284030jWD, long j, long j2, boolean z, RecommendStrategyParam recommendStrategyParam, boolean z2, Long l, EnumC587980N4i enumC587980N4i, int i2) {
        this.LIZ = i;
        this.LIZIZ = interfaceC1284030jWD;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = z;
        this.LJFF = recommendStrategyParam;
        this.LJI = z2;
        this.LJII = l;
        this.LJIIIIZZ = enumC587980N4i;
        this.LJIIIZ = i2;
    }
}
