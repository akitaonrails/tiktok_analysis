package X;

import X.C11EV;
import X.C19464111Db;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.11DX, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11DX<VH extends C11EV<?>, M extends C19464111Db<VH>> extends AbstractC21673619ry<VH> implements InterfaceC19464411De<VH, M> {
    public abstract Object LLLFZ(int i, boolean z);

    public abstract void LLLI(C19465311Dn c19465311Dn);

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        return ((C11DW) this).LLILLL.LIZIZ(i);
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        ((C11DW) this).LLILLL.LJ(recyclerView);
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C19464011Da c19464011Da = ((C11DW) this).LLILLL.LIZLLL;
        C11D6 c11d6 = c19464011Da.LIZIZ;
        c11d6.LLILLL = null;
        recyclerView.removeOnAttachStateChangeListener(c11d6);
        c19464011Da.LIZJ = null;
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C11EV c11evLIZ = ((C11DW) this).LLILLL.LIZ(i, viewGroup);
        if (c11evLIZ != null) {
            try {
                View view = c11evLIZ.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        c11evLIZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c11evLIZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c11evLIZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c11evLIZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c11evLIZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c11evLIZ.getClass().getName();
        return c11evLIZ;
    }

    @Override // X.AbstractC21673619ry
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C11EV c11ev = (C11EV) viewHolder;
        C19465311Dn c19465311Dn = ((C11DW) this).LLILLL;
        Object objLLLFZ = LLLFZ(i, true);
        c19465311Dn.getClass();
        if (objLLLFZ != null) {
            c11ev.N5(list, i, objLLLFZ);
        }
    }
}
