package X;

import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.ui.view.UIComponent;

/* JADX INFO: renamed from: X.0kPv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1318570kPv extends RecyclerView.ViewHolder {
    public final C1318540kPs LL;
    public long LLILLJJLI;

    public final void I5() {
        C1318540kPs c1318540kPs = this.LL;
        UIComponent uIComponent = c1318540kPs.LLILLJJLI;
        if (uIComponent != null) {
            String str = uIComponent.LLILLJJLI;
            try {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1318540kPs, null);
                c1318540kPs.removeAllViews();
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ListViewHolder removeUIComponent.the itemKey is ");
                sbLIZ.append(str);
                sbLIZ.append(" errorMessage:");
                sbLIZ.append(e.getMessage());
                LynxLog.e("UIList", C2188811AlT.LIZIZ(sbLIZ));
            }
            this.LL.LLILLJJLI = null;
        }
    }

    public C1318570kPv(C1318540kPs c1318540kPs) {
        super(c1318540kPs);
        this.LL = c1318540kPs;
    }

    public final void L5(UIComponent uIComponent) {
        this.LL.LLILLJJLI = uIComponent;
        this.LL.addView(uIComponent.mView, new FrameLayout.LayoutParams(-1, -2));
        this.LL.LLILLL = getAdapterPosition();
    }
}
