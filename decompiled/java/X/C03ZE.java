package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.payment.USPaymentInfoCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonStyle;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ZE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZE extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<Object> LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final /* synthetic */ USPaymentInfoCell LLILZIL;

    public C03ZE() {
        throw null;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C03ZE(USPaymentInfoCell uSPaymentInfoCell) {
        ArrayList arrayList = new ArrayList();
        this.LLILZIL = uSPaymentInfoCell;
        this.LL = arrayList;
        this.LLILLJJLI = 1;
        this.LLILLL = 2;
        this.LLILZ = 3;
    }

    public final boolean LLLFZ(int i) {
        return C1697810uHb.LJIIJJI(Integer.valueOf(this.LLILLJJLI), Integer.valueOf(this.LLILZ)).contains(Integer.valueOf(i));
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LL, i);
        if (obj instanceof PaymentMethod) {
            String str = null;
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            if (paymentMethod != null) {
                str = paymentMethod.id;
            }
            if (Intrinsics.LJFF(str, "pm_pi_ins_pipobnpl_c_d")) {
                return this.LLILZ;
            }
            return this.LLILLJJLI;
        }
        return this.LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00aa  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r29, int r30) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03ZE.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c866503a3;
        C7768031q c7768031q;
        PaymentMethodsData paymentMethodsData;
        boolean zLJFF = false;
        if (LLLFZ(i)) {
            C03ZC c03zc = new C03ZC(viewGroup.getContext());
            USPaymentInfoCell uSPaymentInfoCell = this.LLILZIL;
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c03zc);
            c03zc.setLayoutParams(layoutParams);
            BillInfoData billInfoData = uSPaymentInfoCell.T5().LLJJI;
            ButtonStyle buttonStyleLJIIZILJ = null;
            if (billInfoData != null && (paymentMethodsData = billInfoData.paymentMethods) != null) {
                buttonStyleLJIIZILJ = paymentMethodsData.LJIIZILJ(null);
            }
            c03zc.setStyle(buttonStyleLJIIZILJ);
            C031A c031a = (C031A) uSPaymentInfoCell.getItem();
            if (c031a != null && (c7768031q = c031a.LLILZLL) != null) {
                zLJFF = Intrinsics.LJFF(c7768031q.LLJJIJIL, Boolean.TRUE);
            }
            c03zc.setForceSelectIconToArrow(zLJFF);
            if (uSPaymentInfoCell.V5()) {
                c03zc.setInExpressCheckout(true);
                View viewFindViewById = c03zc.findViewById(R.id.n_p);
                if (viewFindViewById != null) {
                    C426750GoL.LJIIL(viewFindViewById, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 16);
                }
            }
            c866503a3 = new C866603a4(c03zc);
        } else {
            C03ZK c03zk = new C03ZK(viewGroup.getContext());
            RecyclerView.LayoutParams layoutParams2 = new RecyclerView.LayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c03zk);
            c03zk.setLayoutParams(layoutParams2);
            C426750GoL.LJIIL(c03zk, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 0, 16);
            c866503a3 = new C866503a3(c03zk);
        }
        try {
            View view = c866503a3.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c866503a3.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c866503a3.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c866503a3.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c866503a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c866503a3.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c866503a3.getClass().getName();
        return c866503a3;
    }
}
