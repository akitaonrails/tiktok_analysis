package X;

import com.ss.android.ugc.aweme.filter.FilterBean;

/* JADX INFO: renamed from: X.0nuv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453110nuv implements InterfaceC1452660nuC {
    public final /* synthetic */ InterfaceC358220E2q LIZ;
    public final /* synthetic */ InterfaceC1453220nv6 LIZIZ;

    @Override // X.InterfaceC1452660nuC
    public final InterfaceC1453220nv6 LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1452660nuC
    public final float LIZIZ(FilterBean filterBean) {
        return C1453210nv5.LIZLLL(filterBean, this.LIZ.LIZ(filterBean, this.LIZIZ), this.LIZIZ);
    }

    @Override // X.InterfaceC1452660nuC
    public final float LIZLLL(FilterBean filterBean) {
        return C1453210nv5.LIZIZ(filterBean, this.LIZIZ);
    }

    public C1453110nuv(InterfaceC358220E2q interfaceC358220E2q, InterfaceC1453220nv6 interfaceC1453220nv6) {
        this.LIZ = interfaceC358220E2q;
        this.LIZIZ = interfaceC1453220nv6;
    }

    @Override // X.InterfaceC1452660nuC
    public final void LIZJ(FilterBean filterBean, float f) {
        this.LIZ.LIZIZ(filterBean, C1453210nv5.LIZJ(filterBean, f, this.LIZIZ));
    }
}
