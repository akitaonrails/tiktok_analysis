package X;

import Y.ACListenerS49S0101000_5;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0FNI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FNI extends AbstractC21673619ry<C0FNJ> {
    public final Function1<Integer, Unit> LL;
    public List<C0FNM> LLILLJJLI = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C0FNI(AwS584S0100000_5 awS584S0100000_5) {
        this.LL = awS584S0100000_5;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        C0FNJ c0fnj = (C0FNJ) viewHolder;
        C0FNM c0fnm = (C0FNM) ListProtector.get(this.LLILLJJLI, i);
        c0fnj.LL.setText(c0fnm.LIZ);
        TuxSpinner tuxSpinner = c0fnj.LLILLJJLI;
        if (c0fnm.LIZIZ == 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        C786410Ut5.LLZILL(tuxSpinner, i2);
        C786410Ut5.I7(new ACListenerS49S0101000_5(this, i, 0), c0fnj.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0FNJ c0fnj = new C0FNJ(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cwh, viewGroup, false));
        try {
            View view = c0fnj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0fnj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0fnj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0FNJ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0fnj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0fnj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0FNJ.class.getName();
        return c0fnj;
    }
}
