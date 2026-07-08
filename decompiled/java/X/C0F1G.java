package X;

import Y.ACListenerS109S0200000_5;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F1G, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F1G extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final C378700Et2 LLILZ = new C378700Et2(-1001, 6);
    public final List<C378700Et2> LL = new ArrayList();
    public boolean LLILLJJLI;
    public AwS371S0200000_5 LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LL).size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i == ((ArrayList) this.LL).size() - 1 && Intrinsics.LJFF(C13LP.LJJJLZIJ(i, this.LL), LLILZ)) {
            return -1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        C378700Et2 c378700Et2 = (C378700Et2) C13LP.LJJJLZIJ(i, this.LL);
        if (c378700Et2 == null) {
            return;
        }
        if (viewHolder instanceof C0F1I) {
            ((C0F1I) viewHolder).LL = LLILZ;
            return;
        }
        if (viewHolder instanceof C0F1H) {
            C0F1H c0f1h = (C0F1H) viewHolder;
            TuxTextView tuxTextView = c0f1h.LL;
            if (tuxTextView != null) {
                tuxTextView.setText(c378700Et2.LIZJ);
            }
            C20627315nb c20627315nb = c0f1h.LLILLJJLI;
            if (c20627315nb != null) {
                c20627315nb.setLoading(this.LLILLJJLI);
            }
            if (this.LLILLJJLI) {
                TuxTextView tuxTextView2 = c0f1h.LL;
                if (tuxTextView2 != null && (layoutParams2 = tuxTextView2.getLayoutParams()) != null) {
                    layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(108));
                }
            } else {
                TuxTextView tuxTextView3 = c0f1h.LL;
                if (tuxTextView3 != null && (layoutParams = tuxTextView3.getLayoutParams()) != null) {
                    layoutParams.width = -2;
                }
            }
            c0f1h.LLILLL = c378700Et2;
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        if (i == -1) {
            C0F1I c0f1i = new C0F1I(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ek2, viewGroup, false));
            C786410Ut5.I7(new ACListenerS109S0200000_5(this, c0f1i, 20), c0f1i.itemView);
            viewHolder = c0f1i;
        } else {
            C0F1H c0f1h = new C0F1H(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ml, viewGroup, false));
            TuxTextView tuxTextView = c0f1h.LL;
            viewHolder = c0f1h;
            if (tuxTextView != null) {
                C786410Ut5.h9(tuxTextView, new ACListenerS109S0200000_5(this, c0f1h, 21));
                viewHolder = c0f1h;
            }
        }
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }
}
