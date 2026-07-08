package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0HbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444070HbB extends AbstractC21673619ry<C444090HbD<InterfaceC444050Hb9>> {
    public final C449530Hjz LL;
    public final Function2<View, Integer, Boolean> LLILLJJLI = null;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL.LLILZIL.LIZJ).size();
    }

    public C444070HbB(C449530Hjz c449530Hjz) {
        this.LL = c449530Hjz;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        InterfaceC444050Hb9 interfaceC444050Hb9LIZ = this.LL.LLILZIL.LIZ(i);
        if (interfaceC444050Hb9LIZ != null) {
            return interfaceC444050Hb9LIZ.LIZJ();
        }
        return 5;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C444090HbD c444090HbD = (C444090HbD) viewHolder;
        InterfaceC444050Hb9 interfaceC444050Hb9LIZ = this.LL.LLILZIL.LIZ(i);
        if (interfaceC444050Hb9LIZ != null) {
            c444090HbD.I5(i, interfaceC444050Hb9LIZ);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c444060HbA;
        if (i == 5) {
            c444060HbA = new C444080HbC(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c3t, viewGroup, false));
        } else {
            c444060HbA = new C444060HbA(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c3s, viewGroup, false));
        }
        try {
            View view = c444060HbA.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c444060HbA.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c444060HbA.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c444060HbA.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c444060HbA.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c444060HbA.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c444060HbA.getClass().getName();
        return c444060HbA;
    }
}
