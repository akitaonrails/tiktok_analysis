package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0HZl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C443190HZl extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Function0<Unit> LL;
    public int LLILLJJLI = -1;
    public List<Integer> LLILLL = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    public C443190HZl(AwS559S0100000_15 awS559S0100000_15) {
        this.LL = awS559S0100000_15;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i < this.LLILLL.size()) {
            C935240aRe c935240aRe = (C935240aRe) viewHolder;
            boolean z = true;
            String strLJIJJ = C497740JfY.LJIJJ(2131854002, ListProtector.get(this.LLILLL, i));
            if (((Number) ListProtector.get(this.LLILLL, i)).intValue() != this.LLILLJJLI) {
                z = false;
            }
            c935240aRe.LL.setText(strLJIJJ);
            c935240aRe.LLILLJJLI.setChecked(z);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C935240aRe c935240aRe = new C935240aRe(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dph, viewGroup, false));
        try {
            View view = c935240aRe.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c935240aRe.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c935240aRe.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C935240aRe.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c935240aRe.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c935240aRe.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C935240aRe.class.getName();
        return c935240aRe;
    }
}
