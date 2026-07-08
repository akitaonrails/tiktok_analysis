package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JAG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0JAG extends AbstractC21673619ry {
    public final AbstractC21673619ry LL;
    public final /* synthetic */ C784220UpY LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.getItemCount() + 2;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i != 0 && i != getItemCount() - 1) {
            return this.LL.getItemViewType(i);
        }
        return -1;
    }

    public C0JAG(C784220UpY c784220UpY, AbstractC21673619ry abstractC21673619ry) {
        this.LLILLJJLI = c784220UpY;
        this.LL = abstractC21673619ry;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.LL.onBindViewHolder(viewHolder, i - 1);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderOnCreateViewHolder;
        if (i == -1) {
            final Space space = new Space(viewGroup.getContext());
            C786410Ut5.f6(space, new ViewGroup.LayoutParams(this.LLILLJJLI.getHalfScreenWidth(), -2));
            viewHolderOnCreateViewHolder = new RecyclerView.ViewHolder(space) { // from class: X.0JAH
            };
        } else {
            viewHolderOnCreateViewHolder = this.LL.onCreateViewHolder(viewGroup, i);
        }
        if (viewHolderOnCreateViewHolder != null) {
            try {
                View view = viewHolderOnCreateViewHolder.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        viewHolderOnCreateViewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderOnCreateViewHolder.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderOnCreateViewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderOnCreateViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderOnCreateViewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderOnCreateViewHolder.getClass().getName();
        return viewHolderOnCreateViewHolder;
    }
}
