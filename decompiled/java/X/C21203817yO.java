package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphere;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.FlashSaleAtmosphereStock;

/* JADX INFO: renamed from: X.17yO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21203817yO extends C21204117yR<C21205417ye, AbstractC21204017yQ> implements InterfaceC21181717up {
    @Override // X.InterfaceC21181717up
    public final boolean LJIIJ() {
        AbstractC21204017yQ abstractC21204017yQ = (AbstractC21204017yQ) this.LL;
        if (abstractC21204017yQ != null) {
            return abstractC21204017yQ.LJIIJ();
        }
        return false;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZLLL(AbstractC21204017yQ abstractC21204017yQ) {
        this.LLILLJJLI.put(abstractC21204017yQ.getState(), abstractC21204017yQ);
        abstractC21204017yQ.LL = this;
    }

    @Override // X.InterfaceC21181717up
    public final void LJFF(boolean z) {
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshPromotionAndPrice needPromotion = ");
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        AbstractC21204017yQ abstractC21204017yQ = (AbstractC21204017yQ) this.LL;
        if (abstractC21204017yQ != null) {
            abstractC21204017yQ.LJFF(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21181717up
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
        C21205417ye c21205417ye = (C21205417ye) this.LLILLL;
        if (c21205417ye != null) {
            c21205417ye.LIZIZ = flashSaleAtmosphereStock;
        }
        AbstractC21204017yQ abstractC21204017yQ = (AbstractC21204017yQ) this.LL;
        if (abstractC21204017yQ != null) {
            abstractC21204017yQ.LJIIL(flashSaleAtmosphereStock);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC21181717up
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
        C21205417ye c21205417ye = (C21205417ye) this.LLILLL;
        if (c21205417ye != null) {
            c21205417ye.LIZ = flashSaleAtmosphere;
        }
        AbstractC21204017yQ abstractC21204017yQ = (AbstractC21204017yQ) this.LL;
        if (abstractC21204017yQ != null) {
            abstractC21204017yQ.LJIILL(flashSaleAtmosphere);
        }
    }
}
