package X;

import Y.ACListenerS121S0200000_18;
import Y.ARunnableS4S0301000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0hDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195710hDl extends AbstractC21673619ry<C1195760hDq> {
    public final Context LL;
    public List<C789130UxT> LLILLJJLI = new ArrayList();
    public Set<Integer> LLILLL = new LinkedHashSet();
    public AbstractC1195750hDp LLILZ = C1195810hDv.LIZ;
    public EnumC1195650hDf LLILZIL = EnumC1195650hDf.MEDIUM;
    public EnumC1175460gh6 LLILZLL = EnumC1175460gh6.CAPSULE;
    public EnumC1195670hDh LLIZ = EnumC1195670hDh.STROKED;
    public InterfaceC1195790hDt LLIZLLLIL;
    public InterfaceC1195850hDz LLJ;
    public RecyclerView LLJI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C1195710hDl(Context context) {
        this.LL = context;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.LLJI = recyclerView;
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.LLJI = null;
    }

    public final void LLLI(int i, boolean z) {
        LinearLayoutManager linearLayoutManager;
        if (z) {
            RecyclerView recyclerView = this.LLJI;
            if (recyclerView != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null) {
                    C1208660hYe c1208660hYe = new C1208660hYe(recyclerView.getContext(), 1);
                    c1208660hYe.LIZ = i;
                    layoutManager.startSmoothScroll(c1208660hYe);
                    return;
                }
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = this.LLJI;
        if (recyclerView2 == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager2 = recyclerView2.getLayoutManager();
        if (!(layoutManager2 instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager2) == null) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(recyclerView2, new ARunnableS4S0301000_1(recyclerView2, i, linearLayoutManager, recyclerView2, 0));
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1195760hDq c1195760hDq = (C1195760hDq) viewHolder;
        C789130UxT c789130UxT = (C789130UxT) ListProtector.get(this.LLILLJJLI, i);
        C1195640hDe c1195640hDe = c1195760hDq.LL;
        c1195640hDe.setStyle(new C1194900hCS(this.LLILZIL, this.LLILZLL, this.LLIZ));
        c1195640hDe.setLabel(c789130UxT.LIZ);
        c1195640hDe.setLeading(c789130UxT.LIZIZ);
        c1195640hDe.setTrailing(c789130UxT.LIZJ);
        c1195640hDe.setSelected(this.LLILLL.contains(Integer.valueOf(i)));
        C786410Ut5.Ga(c1195640hDe, new ACListenerS121S0200000_18(c1195760hDq, this, 33));
        c1195640hDe.setSuppressShowReport(true);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1195760hDq c1195760hDq = new C1195760hDq(new C1195640hDe(this.LL));
        try {
            View view = c1195760hDq.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1195760hDq.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1195760hDq.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1195760hDq.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1195760hDq.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1195760hDq.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1195760hDq.class.getName();
        return c1195760hDq;
    }

    public final void LLLIIIIL(int i, AbstractC1195770hDr abstractC1195770hDr, boolean z) {
        Set<Integer> set = this.LLILLL;
        this.LLILLL = C093Y.LJ(Integer.valueOf(i));
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (iIntValue != i) {
                LLLFZ(iIntValue, false, abstractC1195770hDr, false);
            }
        }
        if (!set.contains(Integer.valueOf(i))) {
            LLLFZ(i, true, abstractC1195770hDr, z);
            return;
        }
        if (i < 0 || i >= this.LLILLJJLI.size()) {
            return;
        }
        if (!(abstractC1195770hDr instanceof C1195840hDy)) {
            LLLI(i, z);
        }
        InterfaceC1195850hDz interfaceC1195850hDz = this.LLJ;
        if (interfaceC1195850hDz == null) {
            return;
        }
        interfaceC1195850hDz.B3();
    }

    public final void LLLFZ(int i, boolean z, AbstractC1195770hDr abstractC1195770hDr, boolean z2) {
        if (i >= 0 && i < this.LLILLJJLI.size()) {
            notifyItemChanged(i);
            if (z && !(abstractC1195770hDr instanceof C1195840hDy)) {
                LLLI(i, z2);
            }
            InterfaceC1195790hDt interfaceC1195790hDt = this.LLIZLLLIL;
            if (interfaceC1195790hDt != null) {
                interfaceC1195790hDt.LIZ(i, abstractC1195770hDr, z);
            }
        }
    }

    public final void LLLII(int i, boolean z, AbstractC1195770hDr abstractC1195770hDr, boolean z2) {
        if (z) {
            if (this.LLILLL.add(Integer.valueOf(i))) {
                LLLFZ(i, true, abstractC1195770hDr, z2);
            }
        } else {
            if (!this.LLILLL.remove(Integer.valueOf(i))) {
                return;
            }
            LLLFZ(i, false, abstractC1195770hDr, false);
        }
    }
}
