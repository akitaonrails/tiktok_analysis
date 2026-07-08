package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS422S0200000_21;

/* JADX INFO: renamed from: X.0mLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392780mLc extends AbstractC1066890drz implements InterfaceC1393740mNA {
    public final InterfaceC1392790mLd LLJ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLILLLLZI();

    @Override // X.InterfaceC1393740mNA
    public final void LJIIIZ(long j) {
    }

    @Override // X.AbstractC1066910ds1
    public final boolean LJIIL() {
        return true;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final String LIZLLL() {
        String strLJIIL = this.LLJ.LJIIL();
        return strLJIIL == null ? "" : strLJIIL;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final CharSequence LJJIZ() {
        this.LLJ.LJIIIIZZ();
        return "";
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final InterfaceC1392590mLJ LJJJJJL() {
        return new InterfaceC1392590mLJ() { // from class: X.0mLe
            @Override // X.InterfaceC1392590mLJ
            public final String LIZ() {
                return this.LIZ.LLJ.LJIIIZ();
            }

            @Override // X.InterfaceC1392590mLJ
            public final String LIZIZ() {
                return this.LIZ.LLJ.LJIIJ();
            }

            @Override // X.InterfaceC1392590mLJ
            public final String LIZJ() {
                return this.LIZ.LLJ.LJIIZILJ();
            }

            @Override // X.InterfaceC1392590mLJ
            public final C2344009Gk LIZLLL() {
                return new C2344009Gk();
            }

            @Override // X.InterfaceC1392590mLJ
            public final String LJ() {
                return this.LIZ.LLJ.LJIIZILJ();
            }

            @Override // X.InterfaceC1392590mLJ
            public final String LJFF() {
                return this.LIZ.LLJ.LJIIIZ();
            }

            @Override // X.InterfaceC1392590mLJ
            public final String LJI() {
                return this.LIZ.LLJ.LJIIJ();
            }
        };
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final int LJJLI() {
        return this.LLJ.LJFF();
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1392780mLc();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.ANCHOR_SHOWCASE.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJFF(C2344009Gk c2344009Gk) {
        LJJIIJ(c2344009Gk);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393690mN5
    public final void LJIIJJI(C2344009Gk c2344009Gk) {
        this.LLJ.LIZJ(c2344009Gk);
    }

    @Override // X.AbstractC1066890drz
    public final void LJJIFFI(AnchorCommonStruct anchorCommonStruct) {
        InterfaceC1392790mLd interfaceC1392790mLd = this.LLJ;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        interfaceC1392790mLd.LJIILJJIL(interfaceC1392640mLO, anchorCommonStruct);
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LJJJI(SmartImageView smartImageView) {
        LJJIIZI(smartImageView, new AwS422S0200000_21(smartImageView, this, 84));
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        if (AwemeExtKt.isPhotoMode(LJIIZILJ()) && !((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIII(LJIIZILJ())) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                list.remove(it2.next());
            }
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct2);
        LJJIFFI(anchorCommonStruct2);
        LJIILIIL(anchorCommonStruct2);
        this.LLIZ = anchorCommonStruct2;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void LLLIZZ(Aweme aweme) {
        this.LLJ.LJI();
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        this.LLJ.LIZJ(c2344009Gk);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLZIJ(C2344009Gk c2344009Gk, boolean z) {
        this.LLJ.LJ(c2344009Gk);
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void yg(Activity activity, Dialog dialog) {
        this.LLJ.LIZIZ();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final void It(View view, Aweme aweme, boolean z) {
        this.LLJ.LIZLLL();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393690mN5
    public final View LJI(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        View viewLJIILLIIL = this.LLJ.LJIILLIIL(viewGroup);
        viewGroup.addView(viewLJIILLIIL);
        return viewLJIILLIIL;
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        View viewLJIILLIIL = this.LLJ.LJIILLIIL(viewGroup);
        viewGroup.addView(viewLJIILLIIL);
        return viewLJIILLIIL;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLIIL(C712520RxC c712520RxC, Dialog dialog, boolean z, boolean z2, boolean z3) {
        this.LLJ.LIZ();
    }
}
