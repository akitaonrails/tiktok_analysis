package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;

/* JADX INFO: renamed from: X.17yP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21203917yP extends C21204217yS<C21205517yf, AbstractC21204317yT> implements InterfaceC21181817uq {
    @Override // X.InterfaceC21181817uq
    public final boolean LJIIJ() {
        AbstractC21204317yT abstractC21204317yT = (AbstractC21204317yT) this.LL;
        if (abstractC21204317yT != null) {
            return abstractC21204317yT.LJIIJ();
        }
        return false;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZLLL(AbstractC21204317yT abstractC21204317yT) {
        this.LLILLJJLI.put(abstractC21204317yT.getState(), abstractC21204317yT);
        abstractC21204317yT.LL = this;
    }

    @Override // X.InterfaceC21181817uq
    public final void LJFF(boolean z) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshPromotionAndPrice needPromotion = ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        AbstractC21204317yT abstractC21204317yT = (AbstractC21204317yT) this.LL;
        if (abstractC21204317yT != null) {
            abstractC21204317yT.LJFF(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21181817uq
    public final void LJIIL(FlashSaleAtmosphereStock flashSaleAtmosphereStock) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshFlashSaleStockStatus stock = ");
        sbLIZ.append(flashSaleAtmosphereStock.activityStock);
        sbLIZ.append(", currentViewState = ");
        sbLIZ.append(this.LL);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        C21205517yf c21205517yf = (C21205517yf) this.LLILLL;
        if (c21205517yf != null) {
            c21205517yf.LIZIZ = flashSaleAtmosphereStock;
        }
        AbstractC21204317yT abstractC21204317yT = (AbstractC21204317yT) this.LL;
        if (abstractC21204317yT != null) {
            abstractC21204317yT.LJIIL(flashSaleAtmosphereStock);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21181817uq
    public final void LJIILL(FlashSaleAtmosphere flashSaleAtmosphere) {
        Integer numValueOf;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshFlashSaleStatus status = ");
        Integer numValueOf2 = null;
        if (flashSaleAtmosphere != null) {
            numValueOf = Integer.valueOf(flashSaleAtmosphere.status);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", currentViewState = ");
        T t = this.LL;
        if (t != 0) {
            numValueOf2 = Integer.valueOf(t.getState());
        }
        sbLIZ.append(numValueOf2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        C21205517yf c21205517yf = (C21205517yf) this.LLILLL;
        if (c21205517yf != null) {
            c21205517yf.LIZ = flashSaleAtmosphere;
        }
        AbstractC21204317yT abstractC21204317yT = (AbstractC21204317yT) this.LL;
        if (abstractC21204317yT != null) {
            abstractC21204317yT.LJIILL(flashSaleAtmosphere);
        }
    }
}
