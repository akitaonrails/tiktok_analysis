package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0TPh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C746310TPh extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final ArrayList<C08E2> LL = new ArrayList<>();
    public int LLILLJJLI = -1;
    public RecyclerView LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLILLL = recyclerView;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C08E2 c08e2 = (C08E2) ListProtector.get(this.LL, i);
        if (viewHolder instanceof C746300TPg) {
            C746300TPg c746300TPg = (C746300TPg) viewHolder;
            if (i == this.LLILLJJLI) {
                z = true;
            } else {
                z = false;
            }
            C746320TPi c746320TPi = c746300TPg.LL;
            TuxTextView tuxTextView = c746320TPi.LLILZLL;
            if (tuxTextView != null) {
                tuxTextView.setText(c08e2.LIZ);
            }
            c746320TPi.LLIZ = z;
            if (z) {
                TuxTextView tuxTextView2 = c746320TPi.LLILZLL;
                if (tuxTextView2 != null) {
                    C786410Ut5.ic(tuxTextView2, 1.0f);
                    C786410Ut5.Dc(tuxTextView2, 1.0f);
                    C786410Ut5.B5(tuxTextView2, 1.0f);
                    return;
                }
                return;
            }
            TuxTextView tuxTextView3 = c746320TPi.LLILZLL;
            if (tuxTextView3 == null) {
                return;
            }
            C786410Ut5.ic(tuxTextView3, 0.85f);
            C786410Ut5.Dc(tuxTextView3, 0.85f);
            C786410Ut5.B5(tuxTextView3, 0.4f);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
        C746320TPi c746320TPi = new C746320TPi(viewGroup.getContext());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c746320TPi);
        c746320TPi.setLayoutParams(layoutParams);
        C746300TPg c746300TPg = new C746300TPg(c746320TPi);
        try {
            View view = c746300TPg.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c746300TPg.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c746300TPg.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C746300TPg.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c746300TPg.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c746300TPg.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C746300TPg.class.getName();
        return c746300TPg;
    }
}
