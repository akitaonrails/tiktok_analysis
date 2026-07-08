package X;

import Y.ACListenerS45S0400000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.effectcreatormobile.infrastructure.ui.view.CenterLayoutManager;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0H3W, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public abstract class C0H3W<T, VH extends RecyclerView.ViewHolder> extends RecyclerView {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final List<C0H3X> LLILZ;

    /* JADX INFO: renamed from: X.0H3W$a */
    public final class a extends AbstractC21673619ry<VH> {
        public final List<? extends T> LL = new ArrayList();

        @Override // X.AbstractC21673619ry
        public final int getItemCount() {
            return ((ArrayList) this.LL).size();
        }

        public a() {
        }

        @Override // X.AbstractC21673619ry
        public final void onBindViewHolder(VH vh, int i) {
            C0H3W.this.LIZLLL(vh, ListProtector.get(this.LL, i));
        }

        @Override // X.AbstractC21673619ry
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.ViewHolder viewHolderLJ = C0H3W.this.LJ(viewGroup, i);
            if (viewHolderLJ != null) {
                try {
                    View view = viewHolderLJ.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            viewHolderLJ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
            try {
                if (viewHolderLJ.itemView.getParent() != null) {
                    boolean zLIZ = true;
                    try {
                        SettingsManager.LIZLLL().getClass();
                        zLIZ = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (zLIZ) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(viewHolderLJ.getClass().getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C1AF0.LIZJ(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) viewHolderLJ.itemView.getParent();
                        if (viewGroup2 != null) {
                            C786410Ut5.LJJJLZIJ(viewHolderLJ.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2081408Dk.LIZ(e2);
                C2344809Gs.LIZ(e2);
            }
            C20612085q.LIZ = viewHolderLJ.getClass().getName();
            return viewHolderLJ;
        }
    }

    public abstract VH LJ(ViewGroup viewGroup, int i);

    public void LJFF(RecyclerView.ViewHolder viewHolder, Object obj) {
    }

    private final C0H3W<T, VH>.a getHeaderAdapter() {
        return (a) this.LLILLJJLI.getValue();
    }

    private final CenterLayoutManager getHeaderLayoutManager() {
        return (CenterLayoutManager) this.LLILLL.getValue();
    }

    private final int getOffsetX() {
        return ((Number) this.LL.getValue()).intValue();
    }

    public C0H3W(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        View view;
        int iIndexOf = ((ArrayList) getHeaderAdapter().LL).indexOf(obj);
        if (viewHolder != null && (view = viewHolder.itemView) != null) {
            view.setSelected(true);
        }
        Iterator it2 = ((ArrayList) this.LLILZ).iterator();
        while (it2.hasNext()) {
            ((C0H3X) it2.next()).LIZ();
        }
        LJFF(viewHolder, obj);
        try {
            CenterLayoutManager headerLayoutManager = getHeaderLayoutManager();
            if (headerLayoutManager != null) {
                headerLayoutManager.smoothScrollToPosition(this, new C21673919s1(), iIndexOf);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj) {
        View view = viewHolder.itemView;
        C786410Ut5.I7(new ACListenerS45S0400000_6(view, this, obj, viewHolder, 2), view);
    }

    public C0H3W(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS407S0200000_6((C0H3W) this, context, (Context) 89));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6((C0H3W) this, 1392));
        this.LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1393));
        this.LLILZ = new ArrayList();
        setLayoutManager(getHeaderLayoutManager());
        setAdapter(getHeaderAdapter());
        setOverScrollMode(2);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
