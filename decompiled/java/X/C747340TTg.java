package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0TTg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747340TTg extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<C747370TTj> LL;
    public final Function2<Integer, C747370TTj, Unit> LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C747340TTg(List<C747370TTj> list, Function2<? super Integer, ? super C747370TTj, Unit> function2) {
        this.LL = list;
        this.LLILLJJLI = function2;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        final C747370TTj c747370TTj = (C747370TTj) ListProtector.get(this.LL, i);
        C127K c127k = (C127K) viewHolder.itemView;
        C419910GdJ c419910GdJ = c747370TTj.LJ;
        if (c419910GdJ != null) {
            c127k.setIcon(c419910GdJ);
        }
        c127k.setTitle(c747370TTj.LIZ);
        c127k.setSubtitle(c747370TTj.LIZIZ);
        C11GO c11go = (C11GO) c127k.getAccessory();
        c11go.LJIILJJIL(c747370TTj.LIZJ);
        c11go.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.0TTh
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                c747370TTj.LIZJ = z;
                Function2<Integer, C747370TTj, Unit> function2 = this.LLILLJJLI;
                if (function2 != null) {
                    function2.invoke(Integer.valueOf(i), c747370TTj);
                }
            }
        });
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final C127K c127k = new C127K(viewGroup.getContext(), null, 6);
        C786410Ut5.Y6(c127k, new ViewGroup.LayoutParams(-1, -2));
        c127k.setAccessory(new AnonymousClass1276(viewGroup.getContext()));
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(c127k) { // from class: X.0TTi
        };
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
                    stringBuffer.append(C747360TTi.class.getName());
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
        C20612085q.LIZ = C747360TTi.class.getName();
        return viewHolder;
    }
}
