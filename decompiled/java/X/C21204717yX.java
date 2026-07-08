package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;

/* JADX INFO: renamed from: X.17yX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21204717yX extends AbstractC21204317yT {
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
        return -1;
    }

    public C21204717yX(InterfaceC21204817yY interfaceC21204817yY) {
        this.LLILLL = interfaceC21204817yY;
    }

    @Override // X.InterfaceC21181817uq
    public final void LJFF(boolean z) {
        this.LLILLL.LJJIIJ(-1, z);
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
}
