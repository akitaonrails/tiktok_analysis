package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.sellingpoint.SeaHeadSellingPointPendantVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.header.SeaPdpHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsGroup;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.sellingpoints.model.SeaPdpSellingPointsItem;
import java.util.List;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764020w0O extends AbstractC1764240w0k<C1764030w0P, SeaHeadSellingPointPendantVO> implements InterfaceC1764620w1M, InterfaceC1764690w1T, InterfaceC1755830vnB, InterfaceC1764710w1V {
    public boolean LLJI;
    public Integer LLJIJIL;
    public boolean LLJILJIL;
    public volatile boolean LLJILJILJ;

    @Override // X.InterfaceC1764620w1M
    public final void LJFF() {
    }

    @Override // X.InterfaceC1755830vnB
    public final void LJJLIIIJJIZ() {
    }

    @Override // X.InterfaceC1755830vnB
    public final void R4() {
    }

    @Override // X.InterfaceC1764620w1M
    public final void LIZ() {
        C1764030w0P.LJ((C1764030w0P) this.LL, false, false, 3);
    }

    @Override // X.InterfaceC1764710w1V
    public final void LIZIZ() {
        C1764030w0P.LJ((C1764030w0P) this.LL, true, false, 2);
    }

    @Override // X.InterfaceC1764620w1M
    public final void LIZLLL() {
        if (this.LLJI && this.LLJILJILJ) {
            ISeaListHelper iSeaListHelperLJIIL = LJIIL();
            if (iSeaListHelperLJIIL == null || !iSeaListHelperLJIIL.tN1()) {
                ((C1764030w0P) this.LL).LIZLLL();
            }
        }
    }

    @Override // X.InterfaceC1764710w1V
    public final void LJ() {
        ((C1764030w0P) this.LL).LIZLLL();
    }

    @Override // X.InterfaceC1764620w1M
    public final void LJI() {
        ISeaHeadContainerHelper iSeaHeadContainerHelper = (ISeaHeadContainerHelper) this.LLJ.getValue();
        if (iSeaHeadContainerHelper != null) {
            iSeaHeadContainerHelper.dw0(this);
        }
        ((C1764030w0P) this.LL).LIZJ();
    }

    @Override // X.InterfaceC1764620w1M
    public final void LJII() {
        C1764030w0P.LJ((C1764030w0P) this.LL, false, false, 3);
    }

    @Override // X.InterfaceC1764620w1M
    public final void LJIIIIZZ() {
        if (this.LLJI && this.LLJILJILJ) {
            ISeaListHelper iSeaListHelperLJIIL = LJIIL();
            if (iSeaListHelperLJIIL == null || !iSeaListHelperLJIIL.tN1()) {
                ((C1764030w0P) this.LL).LIZLLL();
            }
        }
    }

    @Override // X.InterfaceC1764620w1M
    public final void LJIIJ() {
        C1764030w0P.LJ((C1764030w0P) this.LL, false, false, 3);
    }

    @Override // X.AbstractC1764240w0k
    public final FrameLayout.LayoutParams LJIIJJI() {
        PageStateContext pageStateContext = (PageStateContext) this.LLILZLL.getValue();
        Intrinsics.LJFF(pageStateContext != null ? PageStateContext.LIZ(pageStateContext, "page_show_type") : null, 2);
        return null;
    }

    @Override // X.AbstractC1764240w0k
    public final void LJIILL() {
        ISeaHeadContainerHelper iSeaHeadContainerHelper = (ISeaHeadContainerHelper) this.LLJ.getValue();
        if (iSeaHeadContainerHelper != null) {
            iSeaHeadContainerHelper.dw0(this);
        }
        ((C1764030w0P) this.LL).LIZJ();
    }

    @Override // X.InterfaceC1755830vnB
    public final void F0(boolean z) {
        this.LLJILJILJ = z;
        if (this.LLJI) {
            if (!z) {
                C1764030w0P.LJ((C1764030w0P) this.LL, true, false, 2);
                return;
            }
            ISeaListHelper iSeaListHelperLJIIL = LJIIL();
            if (iSeaListHelperLJIIL != null && iSeaListHelperLJIIL.tN1()) {
                return;
            }
            ((C1764030w0P) this.LL).LIZLLL();
        }
    }

    @Override // X.InterfaceC1764690w1T
    public final void LIZJ(float f) {
        boolean z;
        int i;
        if (f >= 0.6f) {
            z = true;
        } else {
            z = false;
        }
        Integer num = this.LLJIJIL;
        if (num != null) {
            int iIntValue = num.intValue();
            T t = this.LL;
            if (z) {
                i = SeaPdpHeadViewHolder.LLLIILIL;
            } else {
                i = SeaPdpHeadViewHolder.LLLIL;
            }
            C0H9H.LJI(i - iIntValue, t);
        }
    }

    @Override // X.AbstractC1764240w0k
    public final boolean LJIILIIL(SeaHeadSellingPointPendantVO seaHeadSellingPointPendantVO) {
        List listLJJJJLI;
        SeaPdpSellingPointsGroup seaPdpSellingPointsGroup = seaHeadSellingPointPendantVO.sellingPoints;
        boolean z = false;
        if (seaPdpSellingPointsGroup == null) {
            return false;
        }
        if (!this.LLJILJIL) {
            ((C1764030w0P) this.LL).LL = new C042G() { // from class: X.0w0M
                @Override // X.C042G
                public final void LIZ(View view, int i, SeaPdpSellingPointsItem seaPdpSellingPointsItem) {
                    Object objLIZ;
                    PageStateContext pageStateContext = (PageStateContext) this.LIZ.LLILZLL.getValue();
                    String strVM = null;
                    if (pageStateContext != null) {
                        objLIZ = PageStateContext.LIZ(pageStateContext, "page_show_type");
                    } else {
                        objLIZ = null;
                    }
                    Boolean boolValueOf = Boolean.valueOf(Intrinsics.LJFF(objLIZ, 2));
                    ISeaHeadContainerHelper iSeaHeadContainerHelper = (ISeaHeadContainerHelper) this.LIZ.LLJ.getValue();
                    if (iSeaHeadContainerHelper != null) {
                        strVM = iSeaHeadContainerHelper.VM(i);
                    }
                    AnonymousClass0421.LIZ(view, i, seaPdpSellingPointsItem, "pdp_top", boolValueOf, strVM);
                }
            };
            this.LLJI = true;
            ISeaHeadContainerHelper iSeaHeadContainerHelper = (ISeaHeadContainerHelper) this.LLJ.getValue();
            if (iSeaHeadContainerHelper != null) {
                iSeaHeadContainerHelper.ea1(this);
            }
            this.LLJILJIL = true;
        }
        List<SeaPdpSellingPointsItem> list = seaPdpSellingPointsGroup.sellingPoints;
        Object objLIZ = null;
        if (list == null || (listLJJJJLI = C13LP.LJJJJLI(list)) == null || listLJJJJLI.isEmpty()) {
            return false;
        }
        PageStateContext pageStateContext = (PageStateContext) this.LLILZLL.getValue();
        if (pageStateContext != null) {
            objLIZ = PageStateContext.LIZ(pageStateContext, "page_show_type");
        }
        C1764030w0P c1764030w0P = (C1764030w0P) this.LL;
        ISeaListHelper iSeaListHelperLJIIL = LJIIL();
        if ((iSeaListHelperLJIIL == null || !iSeaListHelperLJIIL.tN1()) && this.LLJILJILJ) {
            z = true;
        }
        c1764030w0P.LJFF(seaPdpSellingPointsGroup, z, new AwS392S0200000_26(this, objLIZ, 142));
        return true;
    }

    public C1764020w0O(C1764190w0f c1764190w0f, InterfaceC665370Q7z interfaceC665370Q7z) {
        super(new C1764030w0P(c1764190w0f.getContext()), interfaceC665370Q7z);
        this.LLJILJILJ = true;
    }

    @Override // X.InterfaceC1764690w1T
    public final void LJIIIZ(int i, int i2) {
        if (i + i2 < 0) {
            boolean z = this.LLJI;
            this.LLJI = false;
            if (z) {
                C1764030w0P.LJ((C1764030w0P) this.LL, false, false, 3);
                return;
            }
            return;
        }
        boolean z2 = !this.LLJI;
        this.LLJI = true;
        ISeaListHelper iSeaListHelperLJIIL = LJIIL();
        if ((iSeaListHelperLJIIL != null && iSeaListHelperLJIIL.tN1()) || !z2 || !this.LLJILJILJ) {
            return;
        }
        ((C1764030w0P) this.LL).LIZLLL();
    }
}
