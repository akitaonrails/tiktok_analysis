package X;

import Y.AObjectS538S0100000_32;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.17yn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21206317yn extends AbstractC21204317yT {
    public final InterfaceC21204817yY LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(346));

    @Override // X.InterfaceC21181817uq
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.InterfaceC21181817uq
    public final void LJIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock) {
    }

    @Override // X.InterfaceC21205317yd
    public final int getState() {
        return 1;
    }

    @Override // X.InterfaceC21205317yd
    public final void destroy() {
        ((C0NOH) this.LLILZ.getValue()).LIZJ();
    }

    public C21206317yn(InterfaceC21204817yY interfaceC21204817yY) {
        this.LLILLL = interfaceC21204817yY;
    }

    @Override // X.InterfaceC21181817uq
    public final void LJFF(boolean z) {
        this.LLILLL.LJJIIJ(1, z);
    }

    @Override // X.InterfaceC21181817uq
    public final void LJIILL(FlashSaleAtmosphere flashSaleAtmosphere) {
        if (flashSaleAtmosphere == null) {
            LIZJ().LIZ(0);
            return;
        }
        int i = flashSaleAtmosphere.status;
        if (i != 3) {
            if (i != 4 && i != 5) {
                return;
            }
            LIZJ().LIZ(0);
            return;
        }
        LIZJ().LIZ(2);
    }

    @Override // X.AbstractC21204317yT, X.InterfaceC21205317yd
    public final /* bridge */ /* synthetic */ void LIZ(Integer num, C21205517yf c21205517yf) {
        LIZ(num, c21205517yf);
    }

    @Override // X.AbstractC21204317yT
    /* JADX INFO: renamed from: LIZLLL */
    public final void LIZ(Integer num, C21205517yf c21205517yf) {
        boolean z;
        super.LIZ(num, c21205517yf);
        FlashSaleAtmosphere flashSaleAtmosphere = c21205517yf.LIZ;
        if (flashSaleAtmosphere != null) {
            C0NOI c0noiLIZ = C0NOL.LIZ(flashSaleAtmosphere.preheatTime, flashSaleAtmosphere.startTime, c21205517yf.LIZJ, c21205517yf.LIZLLL);
            if (c0noiLIZ != null) {
                ((C0NOH) this.LLILZ.getValue()).LIZLLL(c0noiLIZ);
                ((C0NOH) this.LLILZ.getValue()).LIZ(new AObjectS538S0100000_32(this, 3));
                C0NOH.LJ((C0NOH) this.LLILZ.getValue());
                this.LLILLL.LJJJLZIJ(1, num);
                this.LLILLL.LJJI(1, ((C0NOH) this.LLILZ.getValue()).LIZ);
            }
        }
        InterfaceC21204817yY interfaceC21204817yY = this.LLILLL;
        FlashSaleAtmosphereStock flashSaleAtmosphereStock = c21205517yf.LIZIZ;
        if (flashSaleAtmosphereStock != null && flashSaleAtmosphereStock.activityStockStatus == 3) {
            z = true;
        } else {
            z = false;
        }
        interfaceC21204817yY.LJJJLIIL(null, z, true);
    }
}
