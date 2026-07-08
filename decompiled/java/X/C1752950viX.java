package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.ArrayList;
import java.util.List;
import t2b.c;
import t2b.m;

/* JADX INFO: renamed from: X.0viX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752950viX extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final ECBaseFragment LL;
    public final c LLILLJJLI;
    public final PdpViewModel LLILLL;
    public List<Feed> LLILZ = new ArrayList();
    public String LLILZIL = "";

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILZ.size() + 1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i == getItemCount() - 1) {
            return 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x045b A[PHI: r1
      0x045b: PHI (r1v28 java.lang.String) = (r1v27 java.lang.String), (r1v31 java.lang.String) binds: [B:158:0x0458, B:145:0x0417] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05a3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0743  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r31, final int r32) {
        /*
            Method dump skipped, instruction units count: 1864
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1752950viX.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1752920viU;
        if (i == 1) {
            C01GW c01gw = C954703oH.LIZ;
            final View viewLIZ = C954703oH.LIZ(viewGroup.getContext(), R.layout.ayl, viewGroup, false);
            c1752920viU = new RecyclerView.ViewHolder(viewLIZ, this) { // from class: X.0viY
                {
                    C786410Ut5.I7(new AjS44S0200000_26(this, this, 44), this.itemView);
                }
            };
        } else {
            c1752920viU = new C1752920viU(viewGroup, this.LLILLL, this.LLILZIL, this.LL, this.LLILLJJLI);
        }
        try {
            View view = c1752920viU.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1752920viU.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1752920viU.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1752920viU.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1752920viU.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1752920viU.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1752920viU.getClass().getName();
        return c1752920viU;
    }

    public C1752950viX(PdpViewModel pdpViewModel, ECBaseFragment eCBaseFragment, m mVar) {
        this.LL = eCBaseFragment;
        this.LLILLJJLI = mVar;
        this.LLILLL = pdpViewModel;
    }
}
