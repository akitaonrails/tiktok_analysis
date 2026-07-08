package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0TQI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0TQI<VH extends RecyclerView.ViewHolder, DATA> extends AbstractC21673619ry<VH> {
    public long LL;
    public List<DATA> LLILLJJLI = new ArrayList();
    public C0TQR<DATA> LLILLL;

    public abstract RecyclerView.ViewHolder LLLFZ(View view);

    public int LLLI() {
        return 0;
    }

    public abstract int LLLIILIL(int i);

    public final boolean LLLIIIIL() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LL < 500) {
            return true;
        }
        this.LL = jCurrentTimeMillis;
        return false;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return LLLI() + this.LLILLJJLI.size();
    }

    public DATA LLLII(int i) {
        return (DATA) ListProtector.get(this.LLILLJJLI, i);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolderLLLFZ = LLLFZ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), LLLIILIL(i), viewGroup, false));
        if (viewHolderLLLFZ != null) {
            try {
                View view = viewHolderLLLFZ.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        viewHolderLLLFZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolderLLLFZ.itemView.getParent() != null) {
                boolean zLIZ = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (zLIZ) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolderLLLFZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolderLLLFZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolderLLLFZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolderLLLFZ.getClass().getName();
        return viewHolderLLLFZ;
    }
}
