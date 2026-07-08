package Y;

import X.C03ZF;
import X.C10306041g;
import X.C10516049i;
import X.C1748720vbi;
import X.C259800zU;
import X.C719102rN;
import X.C752702wn;
import X.EnumC805503Cr;
import X.InterfaceC1685420txc;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bnpl.PdpPaymentModuleViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import kotlin.jvm.internal.AwS36S0301000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class ACListenerS19S0301000_1 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS19S0301000_1 aCListenerS19S0301000_1, View view) {
        ((InterfaceC1685420txc) aCListenerS19S0301000_1.l0).invoke(Boolean.FALSE, (C752702wn) aCListenerS19S0301000_1.l1, (C719102rN) aCListenerS19S0301000_1.l2, EnumC805503Cr.OTHER, Integer.valueOf(aCListenerS19S0301000_1.i3));
    }

    public static final void onClick$1(ACListenerS19S0301000_1 aCListenerS19S0301000_1, View view) {
        ((InterfaceC1685420txc) aCListenerS19S0301000_1.l0).invoke(Boolean.FALSE, (C752702wn) aCListenerS19S0301000_1.l1, (C719102rN) aCListenerS19S0301000_1.l2, EnumC805503Cr.OTHER, Integer.valueOf(aCListenerS19S0301000_1.i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$2(ACListenerS19S0301000_1 aCListenerS19S0301000_1, View view) {
        T t;
        C259800zU c259800zU = new C259800zU();
        String str = "select";
        c259800zU.element = "select";
        BnplInfo bnplInfo = ((C10306041g) ((PdpPaymentModuleViewHolder) aCListenerS19S0301000_1.l0).LLILLJJLI).LIZ;
        if (bnplInfo != null && Intrinsics.LJFF(bnplInfo.isAuth, Boolean.TRUE)) {
            if (((C03ZF) aCListenerS19S0301000_1.l1).LIZJ()) {
                ((PdpPaymentModuleViewHolder) aCListenerS19S0301000_1.l0).c6();
                ((SeaPdpViewModel) ((PdpPaymentModuleViewHolder) aCListenerS19S0301000_1.l0).LLJJJIL.getValue()).RS2(null);
                t = "cancel";
            } else {
                ((PdpPaymentModuleViewHolder) aCListenerS19S0301000_1.l0).c6();
                ((C03ZF) aCListenerS19S0301000_1.l1).setChecked$ecommerce_transaction_release(true);
                ((SeaPdpViewModel) ((PdpPaymentModuleViewHolder) aCListenerS19S0301000_1.l0).LLJJJIL.getValue()).RS2((InstallmentPlan) aCListenerS19S0301000_1.l2);
                t = str;
            }
            c259800zU.element = t;
        } else {
            ((PdpPaymentModuleViewHolder) aCListenerS19S0301000_1.l0).e6();
        }
        C1748720vbi.LIZLLL(((PdpPaymentModuleViewHolder) aCListenerS19S0301000_1.l0).itemView, new C10516049i(), new AwS36S0301000_1((PdpPaymentModuleViewHolder) aCListenerS19S0301000_1.l0, (PdpPaymentModuleViewHolder) aCListenerS19S0301000_1.i3, (int) aCListenerS19S0301000_1.l2, (InstallmentPlan) c259800zU, (C259800zU<String>) 10));
    }

    public ACListenerS19S0301000_1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.i3 = i;
    }
}
