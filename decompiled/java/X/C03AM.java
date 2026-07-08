package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03AM, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C03AM extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final String LL;

    public abstract int LLLFZ();

    public abstract RecyclerView.ViewHolder LLLI(ViewGroup viewGroup);

    public abstract AbstractC1216180hkm LLLII(ViewGroup viewGroup);

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return LLLFZ() + 1;
    }

    public C03AM(String str) {
        this.LL = str;
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLLLI;
        if (i == 0) {
            viewHolderLLLI = LLLII(viewGroup);
        } else {
            viewHolderLLLI = LLLI(viewGroup);
        }
        if (viewHolderLLLI != null) {
            try {
                View view = viewHolderLLLI.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        viewHolderLLLI.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLLLI.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLLLI.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLLLI.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLLLI.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLLLI.getClass().getName();
        return viewHolderLLLI;
    }
}
