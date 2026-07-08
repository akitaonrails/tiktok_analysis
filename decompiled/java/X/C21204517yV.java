package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;

/* JADX INFO: renamed from: X.17yV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21204517yV extends AbstractC21204317yT {
    public final InterfaceC21204817yY LLILLL;

    @Override // X.InterfaceC21181817uq
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.InterfaceC21181817uq
    public final void LJIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock) {
    }

    @Override // X.InterfaceC21205317yd
    public final void destroy() {
    }

    @Override // X.InterfaceC21205317yd
    public final int getState() {
        return 0;
    }

    public C21204517yV(InterfaceC21204817yY interfaceC21204817yY) {
        this.LLILLL = interfaceC21204817yY;
    }

    @Override // X.InterfaceC21181817uq
    public final void LJFF(boolean z) {
        this.LLILLL.LJJIIJ(0, z);
    }

    @Override // X.InterfaceC21181817uq
    public final void LJIILL(FlashSaleAtmosphere flashSaleAtmosphere) {
        if (flashSaleAtmosphere == null) {
            return;
        }
        int i = flashSaleAtmosphere.status;
        if (i != 2) {
            if (i == 3) {
                LIZJ().LIZ(2);
                return;
            }
            return;
        }
        LIZJ().LIZ(1);
    }

    @Override // X.AbstractC21204317yT, X.InterfaceC21205317yd
    public final /* bridge */ /* synthetic */ void LIZ(Integer num, C21205517yf c21205517yf) {
        LIZ(num, c21205517yf);
    }

    @Override // X.AbstractC21204317yT
    /* JADX INFO: renamed from: LIZLLL */
    public final void LIZ(Integer num, C21205517yf c21205517yf) {
        super.LIZ(num, c21205517yf);
        this.LLILLL.LJJJLZIJ(0, num);
    }
}
