package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS20S0300000_1;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03Dl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C807503Dl extends FrameLayout {
    public final ConstraintLayout LL;
    public final ConstraintLayout LLILLJJLI;
    public final ConstraintLayout LLILLL;
    public final TuxTextView LLILZ;
    public final TuxIconView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxIconView LLIZ;
    public final TuxIconView LLIZLLLIL;
    public final TuxIconView LLJ;
    public final ConstraintLayout LLJI;
    public final TuxTextView LLJIJIL;
    public final TuxIconView LLJILJIL;
    public final TuxIconView LLJILJILJ;
    public final TuxIconView LLJILLL;
    public final TuxIconView LLJJ;
    public final TuxTextView LLJJI;
    public final TuxTextView LLJJIII;
    public final TuxIconView LLJJIJI;
    public boolean LLJJIJIIJIL;

    public C807503Dl(C19EG c19eg) {
        super(c19eg, null);
        C1755600vmo.LIZ.getClass();
        View viewLIZ = C1755600vmo.LIZ(R.layout.avw, c19eg, this, true, true);
        this.LL = (ConstraintLayout) viewLIZ.findViewById(R.id.q71);
        this.LLILLJJLI = (ConstraintLayout) viewLIZ.findViewById(R.id.t5n);
        this.LLILLL = (ConstraintLayout) viewLIZ.findViewById(R.id.q75);
        this.LLILZ = (TuxTextView) viewLIZ.findViewById(R.id.q73);
        this.LLILZIL = (TuxIconView) viewLIZ.findViewById(R.id.q74);
        this.LLILZLL = (TuxTextView) viewLIZ.findViewById(R.id.t5q);
        this.LLIZ = (TuxIconView) viewLIZ.findViewById(R.id.t5o);
        this.LLIZLLLIL = (TuxIconView) viewLIZ.findViewById(R.id.t5p);
        this.LLJ = (TuxIconView) viewLIZ.findViewById(R.id.t5m);
        this.LLJI = (ConstraintLayout) viewLIZ.findViewById(R.id.t5g);
        this.LLJIJIL = (TuxTextView) viewLIZ.findViewById(R.id.t5j);
        this.LLJILJIL = (TuxIconView) viewLIZ.findViewById(R.id.t5h);
        this.LLJILJILJ = (TuxIconView) viewLIZ.findViewById(R.id.t5i);
        this.LLJILLL = (TuxIconView) viewLIZ.findViewById(R.id.t5f);
        this.LLJJ = (TuxIconView) viewLIZ.findViewById(R.id.q72);
        this.LLJJI = (TuxTextView) viewLIZ.findViewById(R.id.yns);
        this.LLJJIII = (TuxTextView) viewLIZ.findViewById(R.id.ynq);
        this.LLJJIJI = (TuxIconView) viewLIZ.findViewById(R.id.ynr);
    }

    public final void LIZIZ(ProductUnavailableInfo productUnavailableInfo, SeaPdpViewModel seaPdpViewModel) {
        int i;
        if (productUnavailableInfo == null) {
            return;
        }
        int i2 = 0;
        C786410Ut5.LJLLLLLL(0, this.LLILLL);
        C786410Ut5.LJLLLLLL(8, this.LL);
        String str = productUnavailableInfo.text;
        if (str != null) {
            this.LLJJI.setText(str);
        }
        Integer num = productUnavailableInfo.unavailableReason;
        if (num != null && num.intValue() == 2) {
            C786410Ut5.LJLLLLLL(0, this.LLJJIII);
            C786410Ut5.LJLLLLLL(0, this.LLJJIJI);
            TuxTextView tuxTextView = this.LLJJIII;
            String string = productUnavailableInfo.actionText;
            if (string == null) {
                string = getResources().getString(2131832649);
            }
            tuxTextView.setText(string);
        } else {
            TuxTextView tuxTextView2 = this.LLJJIII;
            String str2 = productUnavailableInfo.actionText;
            if (str2 != null && !a0.LJJJIL(str2)) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, tuxTextView2);
            TuxIconView tuxIconView = this.LLJJIJI;
            String str3 = productUnavailableInfo.actionText;
            if (str3 == null || a0.LJJJIL(str3)) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, tuxIconView);
            this.LLJJIII.setText(productUnavailableInfo.actionText);
        }
        C786410Ut5.I7(new AjS20S0300000_1(this, seaPdpViewModel, productUnavailableInfo, 15), this.LLJJIII);
        C786410Ut5.I7(new AjS20S0300000_1(this, seaPdpViewModel, productUnavailableInfo, 16), this.LLJJIJI);
        if (!this.LLJJIJIIJIL) {
            C1054104Ah c1054104Ah = seaPdpViewModel.LLJLIL;
            if (c1054104Ah != null) {
                C03FZ c03fz = new C03FZ("tiktokec_module_show");
                c03fz.LIZIZ.putAll(c1054104Ah.LIZIZ);
                c03fz.LIZIZ();
            }
            this.LLJJIJIIJIL = true;
        }
    }

    public static void LIZ(SeaPdpViewModel seaPdpViewModel, View view, ProductUnavailableInfo productUnavailableInfo) {
        ProductPackStruct productPackStruct;
        ProductUnavailableInfo productUnavailableInfo2;
        Integer num;
        Integer num2;
        ProductUnavailableInfo productUnavailableInfo3;
        Integer num3;
        ProductPackStruct productPackStruct2 = seaPdpViewModel.LLJIJIL;
        boolean z = false;
        if ((productPackStruct2 != null && (productUnavailableInfo3 = productPackStruct2.unavailableInfo) != null && (num3 = productUnavailableInfo3.unavailableReason) != null && num3.intValue() == 1) || ((productPackStruct = seaPdpViewModel.LLJIJIL) != null && (productUnavailableInfo2 = productPackStruct.unavailableInfo) != null && (num = productUnavailableInfo2.unavailableReason) != null && num.intValue() == 2)) {
            C1054104Ah c1054104Ah = seaPdpViewModel.LLJLIL;
            if (c1054104Ah != null) {
                C03FZ c03fz = new C03FZ("tiktokec_module_click");
                c03fz.LIZIZ.putAll(c1054104Ah.LIZIZ);
                c03fz.LIZIZ();
            }
            if (productUnavailableInfo != null && (num2 = productUnavailableInfo.actionRedirectType) != null && num2.intValue() == 1) {
                z = true;
            }
            if (z) {
                C952803ny c952803ny = seaPdpViewModel.LLLLLLIL;
                C948503nH.LJFF(c952803ny.LIZ, C23271099x.INSTANCE, new C952503nv(c952803ny, view, null));
            } else {
                C952803ny c952803ny2 = seaPdpViewModel.LLLLLLIL;
                C948503nH.LJFF(c952803ny2.LIZ, C23271099x.INSTANCE, new C952403nu(c952803ny2, view, null));
            }
        }
    }
}
