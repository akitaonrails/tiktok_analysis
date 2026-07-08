package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.selectsheet.TuxSingleSelectionSheet;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747320TTe extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final TuxSingleSelectionSheet LL;
    public final List<C747370TTj> LLILLJJLI;
    public final int LLILLL;
    public final Function1<Integer, Unit> LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        Function1<Integer, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(viewHolder.getAdapterPosition()));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C747370TTj c747370TTj = (C747370TTj) ListProtector.get(this.LLILLJJLI, i);
        C127K c127k = (C127K) viewHolder.itemView;
        C419910GdJ c419910GdJ = c747370TTj.LJ;
        if (c419910GdJ != null) {
            c127k.setIcon(c419910GdJ);
        }
        c127k.setTitle(c747370TTj.LIZ);
        c127k.setSubtitle(c747370TTj.LIZIZ);
        C11GO c11go = (C11GO) c127k.getAccessory();
        if (this.LLILLL == i) {
            z = true;
        } else {
            z = false;
        }
        c11go.LJIILJJIL(z);
        c11go.LJIILLIIL(new C786040UsU(this, c747370TTj, c127k, 1));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final C127K c127k = new C127K(viewGroup.getContext(), null, 6);
        C786410Ut5.Y6(c127k, new ViewGroup.LayoutParams(-1, -2));
        c127k.setAccessory(new AnonymousClass1278(viewGroup.getContext()));
        RecyclerView.ViewHolder viewHolder = new RecyclerView.ViewHolder(c127k) { // from class: X.0TTf
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
                    stringBuffer.append(C747330TTf.class.getName());
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
        C20612085q.LIZ = C747330TTf.class.getName();
        return viewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C747320TTe(TuxSingleSelectionSheet tuxSingleSelectionSheet, List<C747370TTj> list, int i, Function1<? super Integer, Unit> function1) {
        this.LL = tuxSingleSelectionSheet;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = function1;
    }
}
