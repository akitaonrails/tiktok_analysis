package X;

import Y.ACListenerS128S0200000_26;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0vbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748570vbT extends AbstractC21673619ry<C1748580vbU> {
    public final List<C2280601EOk> LL;
    public final int LLILLJJLI = R.layout.yo;
    public Context LLILLL;
    public InterfaceC1748590vbV LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C1748570vbT(List list) {
        this.LL = list;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1748580vbU c1748580vbU = (C1748580vbU) viewHolder;
        C2280601EOk c2280601EOk = (C2280601EOk) ListProtector.get(this.LL, i);
        if (i != 0 && TextUtils.equals(((C2280601EOk) ListProtector.get(this.LL, i - 1)).LIZIZ, c2280601EOk.LIZIZ)) {
            C786410Ut5.LLIL(c1748580vbU.LL, 8);
        } else {
            C786410Ut5.LLIL(c1748580vbU.LL, 0);
            c1748580vbU.LL.setText(c2280601EOk.LIZIZ);
        }
        if (!TextUtils.isEmpty(c2280601EOk.LJ)) {
            c1748580vbU.LLILLJJLI.setText(c2280601EOk.LJ);
        } else {
            Context context = this.LLILLL;
            if (context != null && !TextUtils.isEmpty(context.getResources().getString(c2280601EOk.LIZ))) {
                c1748580vbU.LLILLJJLI.setText(this.LLILLL.getResources().getString(c2280601EOk.LIZ));
            }
        }
        c1748580vbU.LLILLL.setText(c2280601EOk.LIZLLL);
        C786410Ut5.I7(new ACListenerS128S0200000_26(this, c2280601EOk, 38), c1748580vbU.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewSd = C786410Ut5.Sd(this.LLILLJJLI, C786410Ut5.ne(viewGroup.getContext()), null);
        this.LLILLL = viewGroup.getContext();
        C1748580vbU c1748580vbU = new C1748580vbU(viewSd);
        try {
            View view = c1748580vbU.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1748580vbU.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1748580vbU.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1748580vbU.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1748580vbU.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1748580vbU.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1748580vbU.class.getName();
        return c1748580vbU;
    }
}
