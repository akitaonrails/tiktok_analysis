package X;

import Y.ACListenerS72S0300000_5;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0FOI, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FOI extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Context LL;
    public final C0FOJ LLILLJJLI;
    public List<? extends C0FC7> LLILLL = C13BV.INSTANCE;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LLILLL, i);
        if (obj instanceof C0FC6) {
            return 0;
        }
        if (obj instanceof C0FC8) {
            return 1;
        }
        throw new C1954807lC();
    }

    public C0FOI(Context context, C0FOJ c0foj) {
        this.LL = context;
        this.LLILLJJLI = c0foj;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0FC7 c0fc7 = (C0FC7) ListProtector.get(this.LLILLL, i);
        if (c0fc7 instanceof C0FC6) {
            ((C0FOL) viewHolder).LL.setText(((C0FC6) c0fc7).LIZ);
            return;
        }
        if (c0fc7 instanceof C0FC8) {
            C0FOK c0fok = (C0FOK) viewHolder;
            C0FC8 c0fc8 = (C0FC8) c0fc7;
            c0fok.LL.setText(c0fc8.LIZ);
            c0fok.LLILLJJLI.setChecked(c0fc8.LIZIZ);
            c0fok.LLILLJJLI.setClickable(false);
            C786410Ut5.I7(new ACListenerS72S0300000_5(viewHolder, c0fc7, this, 1), viewHolder.itemView);
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c0fol;
        if (i != 0) {
            if (i == 1) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.bzd, viewGroup, false);
                c0fol = new C0FOK(viewTd, (TuxTextView) viewTd.findViewById(R.id.t8o), (C0HZQ) viewTd.findViewById(R.id.t8j));
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            View viewTd2 = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.bzf, viewGroup, false);
            c0fol = new C0FOL(viewTd2, (TuxTextView) viewTd2.findViewById(R.id.t8o));
        }
        try {
            View view = c0fol.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0fol.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0fol.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c0fol.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0fol.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0fol.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c0fol.getClass().getName();
        return c0fol;
    }
}
