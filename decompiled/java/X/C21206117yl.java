package X;

import Y.AObjectS538S0100000_32;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.17yl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21206117yl extends AbstractC21204317yT {
    public final InterfaceC21204817yY LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(345));

    @Override // X.InterfaceC21181817uq
    public final boolean LJIIJ() {
        return true;
    }

    @Override // X.InterfaceC21205317yd
    public final int getState() {
        return 2;
    }

    @Override // X.InterfaceC21205317yd
    public final void destroy() {
        ((C0NOH) this.LLILZ.getValue()).LIZJ();
    }

    public C21206117yl(InterfaceC21204817yY interfaceC21204817yY) {
        this.LLILLL = interfaceC21204817yY;
    }

    @Override // X.InterfaceC21181817uq
    public final void LJFF(boolean z) {
        this.LLILLL.LJJIIJ(2, z);
    }

    @Override // X.InterfaceC21181817uq
    public final void LJIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock) {
        boolean z;
        InterfaceC21204817yY interfaceC21204817yY = this.LLILLL;
        C21205517yf c21205517yf = this.LLILLJJLI;
        if (c21205517yf == null) {
            c21205517yf = null;
        }
        FlashSaleAtmosphereStock flashSaleAtmosphereStock2 = c21205517yf.LIZIZ;
        if (flashSaleAtmosphereStock2 != null && flashSaleAtmosphereStock2.activityStockStatus == 3) {
            z = true;
        } else {
            z = false;
        }
        interfaceC21204817yY.LJJJLIIL(flashSaleAtmosphereStock, z, true);
    }

    @Override // X.InterfaceC21181817uq
    public final void LJIILL(FlashSaleAtmosphere flashSaleAtmosphere) {
        if (flashSaleAtmosphere == null) {
            LIZJ().LIZ(0);
            return;
        }
        int i = flashSaleAtmosphere.status;
        if (i == 5 || i == 4) {
            LIZJ().LIZ(0);
        }
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
            C0NOI c0noiLIZ = C0NOL.LIZ(flashSaleAtmosphere.startTime, flashSaleAtmosphere.endTime, c21205517yf.LIZJ, c21205517yf.LIZLLL);
            if (c0noiLIZ != null) {
                ((C0NOH) this.LLILZ.getValue()).LIZLLL(c0noiLIZ);
                ((C0NOH) this.LLILZ.getValue()).LIZ(new AObjectS538S0100000_32(this, 2));
                C0NOH.LJ((C0NOH) this.LLILZ.getValue());
                this.LLILLL.LJJJLZIJ(2, num);
                this.LLILLL.LJJI(2, ((C0NOH) this.LLILZ.getValue()).LIZ);
            }
        }
        FlashSaleAtmosphereStock flashSaleAtmosphereStock = c21205517yf.LIZIZ;
        if (flashSaleAtmosphereStock != null) {
            InterfaceC21204817yY interfaceC21204817yY = this.LLILLL;
            C21205517yf c21205517yf2 = this.LLILLJJLI;
            if (c21205517yf2 == null) {
                c21205517yf2 = null;
            }
            FlashSaleAtmosphereStock flashSaleAtmosphereStock2 = c21205517yf2.LIZIZ;
            if (flashSaleAtmosphereStock2 != null && flashSaleAtmosphereStock2.activityStockStatus == 3) {
                z = true;
            } else {
                z = false;
            }
            interfaceC21204817yY.LJJJLIIL(flashSaleAtmosphereStock, z, false);
        }
    }
}
