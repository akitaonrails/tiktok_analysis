package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;

/* JADX INFO: renamed from: X.17yW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21204617yW extends AbstractC21204017yQ {
    public final InterfaceC21204917yZ LLILLL;

    @Override // X.InterfaceC21181717up
    public final boolean LJIIJ() {
        return false;
    }

    @Override // X.InterfaceC21181717up
    public final void LJIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock) {
    }

    @Override // X.InterfaceC21205217yc
    public final void destroy() {
    }

    @Override // X.InterfaceC21205217yc
    public final int getState() {
        return -1;
    }

    public C21204617yW(InterfaceC21204917yZ interfaceC21204917yZ) {
        this.LLILLL = interfaceC21204917yZ;
    }

    @Override // X.InterfaceC21181717up
    public final void LJFF(boolean z) {
        this.LLILLL.LJJIIJ(-1, z);
    }

    @Override // X.InterfaceC21181717up
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
