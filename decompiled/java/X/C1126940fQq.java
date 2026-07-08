package X;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;
import u4.q0;

/* JADX INFO: renamed from: X.0fQq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126940fQq extends AbstractC1126560fQE {
    public final View LLLILZ;
    public final String LLLILZJ;
    public final String LLLILZLLLI;
    public boolean LLLIZZ;
    public String LLLJ;
    public String LLLJIL;

    @Override // X.AbstractC1126560fQE
    public final void h6() {
        q0.LJIJ(this.LLLILZ, new C1151960g5C(this, 3));
    }

    @Override // X.AbstractC1126560fQE
    public final String R5() {
        return this.LLLILZJ;
    }

    public C1126940fQq(View view) {
        super(view);
        this.LLLILZ = view;
        this.LLLILZJ = "LiveGiftFirstRechargeViewHolderV3";
        this.LLLILZLLLI = C497740JfY.LJIJI(2131840820);
        this.LLLIZZ = true;
        this.itemView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1151620g4e(this, 2));
        String strLJIJI = C497740JfY.LJIJI(2131850980);
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(strLJIJI, new String[]{"\\n"}, 0, 6);
        if (listLJJLIIIJILLIZJL.size() != 2 && 0 == 0) {
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL(strLJIJI, new String[]{"\n"}, 0, 6);
            if (listLJJLIIIJILLIZJL2.size() == 2) {
                this.LLLJ = (String) ListProtector.get(listLJJLIIIJILLIZJL2, 0);
                this.LLLJIL = (String) ListProtector.get(listLJJLIIIJILLIZJL2, 1);
                return;
            }
            return;
        }
        this.LLLJ = (String) ListProtector.get(listLJJLIIIJILLIZJL, 0);
        this.LLLJIL = (String) ListProtector.get(listLJJLIIIJILLIZJL, 1);
    }

    @Override // X.AbstractC1126560fQE
    public final void N5(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, DataChannel dataChannel, int i) {
        Boolean boolValueOf;
        super.N5(abstractC1126600fQI, dataChannel, i);
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 != null) {
            boolValueOf = Boolean.valueOf(abstractC1126600fQI2.LIZJ);
        } else {
            boolValueOf = null;
        }
        boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
        InterfaceC1133710fbl.LIZ.getClass();
        C1120710fGn.LIZ();
        ImageModel imageModelLJ = C1133940fc8.LJ();
        if (zLJJJI) {
            C500260Jjc.LJIILIIL(this.LLJILLL);
            C500260Jjc.LLFFF(this.LLJJI);
            C0JSS.LIZLLL(this.LLJJI, imageModelLJ);
        } else {
            C500260Jjc.LLFFF(this.LLJILLL);
            C500260Jjc.LJIILIIL(this.LLJJI);
            C0JSS.LIZLLL(this.LLJILLL, imageModelLJ);
        }
        C16F5 c16f5 = this.LLJJIII;
        if (c16f5 != null) {
            C500260Jjc.LLFFF(c16f5);
        }
        if (zLJJJI) {
            C16F5 c16f52 = this.LLJJIII;
            if (c16f52 != null) {
                c16f52.setTextColor(C497740JfY.LIZLLL(R.attr.c9k, this.LLLILZ.getContext()));
            }
            C16F5 c16f53 = this.LLJJIII;
            if (c16f53 != null) {
                c16f53.setText(C497740JfY.LJIJI(2131850981));
            }
        } else {
            C16F5 c16f54 = this.LLJJIII;
            if (c16f54 != null) {
                c16f54.setText(this.LLLJIL);
            }
        }
        C16F5 c16f55 = this.LLJIJIL;
        if (c16f55 != null) {
            c16f55.setText(this.LLLJ);
        }
        C16F5 c16f56 = this.LLJJJJ;
        if (c16f56 != null) {
            c16f56.setText(C497740JfY.LJIJI(2131850982));
        }
        C1125760fOw.LIZIZ(this.LLJJIJI, this.LLJIJIL);
    }
}
