package X;

import Y.ACListenerS110S0200000_6;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import mf.a;

/* JADX INFO: renamed from: X.0I2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460100I2m extends AbstractC21673619ry<C460120I2o> {
    public final Context LL;
    public List<C460110I2n> LLILLJJLI = new ArrayList();
    public Set<Integer> LLILLL = new LinkedHashSet();
    public InterfaceC460160I2s LLILZ;
    public InterfaceC460130I2p LLILZIL;
    public RecyclerView LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C460100I2m(Context context) {
        this.LL = context;
    }

    public final void LLLFZ(int i) {
        if (i >= 0 && i < this.LLILLJJLI.size()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("No chip at position ");
        sbLIZ.append(i);
        sbLIZ.append('.');
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.LLILZLL = recyclerView;
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.LLILZLL = null;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int width;
        View.OnClickListener aVar;
        C460120I2o c460120I2o = (C460120I2o) viewHolder;
        C460070I2j c460070I2j = c460120I2o.LL;
        RecyclerView recyclerView = this.LLILZLL;
        if (recyclerView != null) {
            width = recyclerView.getWidth();
        } else {
            width = 0;
        }
        c460070I2j.setParentWidth$profile_release(width);
        C460110I2n c460110I2n = (C460110I2n) ListProtector.get(this.LLILLJJLI, i);
        if (c460110I2n instanceof C460110I2n) {
            C460070I2j c460070I2j2 = c460120I2o.LL;
            c460070I2j2.LIZJ(c460110I2n.LIZ, c460110I2n.LIZIZ, c460110I2n.LIZJ);
            c460070I2j2.setEnabled(c460110I2n.LIZLLL);
            if (c460110I2n.LIZLLL) {
                aVar = new ACListenerS110S0200000_6(this, c460120I2o, 36);
            } else {
                aVar = null;
            }
            if (C1848410yCV.LIZ) {
                if (aVar != null) {
                    aVar = new f(aVar);
                    aVar = new a(aVar);
                }
            } else if (aVar != null) {
                aVar = new a(aVar);
            }
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c460070I2j2);
            }
            c460070I2j2.setOnClickListener(aVar);
            c460070I2j2.setSelected(this.LLILLL.contains(Integer.valueOf(i)));
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C460120I2o c460120I2o = new C460120I2o(new C460070I2j(this.LL));
        try {
            View view = c460120I2o.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c460120I2o.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c460120I2o.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C460120I2o.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c460120I2o.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c460120I2o.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C460120I2o.class.getName();
        return c460120I2o;
    }

    public final void LLLI(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
        RecyclerView recyclerView;
        if (i >= 0 && i < this.LLILLJJLI.size()) {
            notifyItemChanged(i);
            if (z && (recyclerView = this.LLILZLL) != null) {
                recyclerView.scrollToPosition(i);
            }
            InterfaceC460160I2s interfaceC460160I2s = this.LLILZ;
            if (interfaceC460160I2s != null) {
                interfaceC460160I2s.LIZ(i, z);
            }
        }
    }

    public final void LLLII(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
        if (z) {
            Set<Integer> set = this.LLILLL;
            this.LLILLL = C093Y.LJ(Integer.valueOf(i));
            Iterator<Integer> it2 = set.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                if (iIntValue != i) {
                    LLLI(iIntValue, false, abstractC1203190hPp);
                }
            }
            if (!set.contains(Integer.valueOf(i))) {
                LLLI(i, true, abstractC1203190hPp);
                return;
            }
            if (i < 0 || i >= this.LLILLJJLI.size()) {
                return;
            }
            RecyclerView recyclerView = this.LLILZLL;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(i);
            }
            InterfaceC460130I2p interfaceC460130I2p = this.LLILZIL;
            if (interfaceC460130I2p == null) {
                return;
            }
            interfaceC460130I2p.LIZ(i);
            return;
        }
        if (this.LLILLL.remove(Integer.valueOf(i))) {
            LLLI(i, false, abstractC1203190hPp);
        }
    }
}
