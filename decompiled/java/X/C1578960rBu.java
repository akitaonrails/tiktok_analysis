package X;

import Y.ACListenerS126S0200000_24;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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

/* JADX INFO: renamed from: X.0rBu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578960rBu extends AbstractC21673619ry<C1579020rC0> {
    public final Context LL;
    public InterfaceC1573860r3g LLILZ;
    public InterfaceC1578620rBM LLILZIL;
    public Integer LLJ;
    public RecyclerView LLJI;
    public List<InterfaceC1203250hPv> LLILLJJLI = new ArrayList();
    public Set<Integer> LLILLL = new LinkedHashSet();
    public EnumC1579060rC4 LLILZLL = EnumC1579060rC4.CAPSULE;
    public InterfaceC1579040rC2 LLIZ = new C1573990r3t(0);
    public InterfaceC1579050rC3 LLIZLLLIL = new C1582470rHZ(null, null, null, null);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C1578960rBu(Context context) {
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

    public final void LLLII(int i, AbstractC1573810r3b abstractC1573810r3b) {
        Set<Integer> set = this.LLILLL;
        this.LLILLL = C093Y.LJ(Integer.valueOf(i));
        Iterator<Integer> it2 = set.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            if (iIntValue != i) {
                LLLFZ(iIntValue, false, abstractC1573810r3b);
            }
        }
        if (!set.contains(Integer.valueOf(i))) {
            LLLFZ(i, true, abstractC1573810r3b);
            return;
        }
        if (i < 0 || i >= this.LLILLJJLI.size()) {
            return;
        }
        RecyclerView recyclerView = this.LLJI;
        if (recyclerView != null) {
            recyclerView.scrollToPosition(i);
        }
        InterfaceC1578620rBM interfaceC1578620rBM = this.LLILZIL;
        if (interfaceC1578620rBM == null) {
            return;
        }
        interfaceC1578620rBM.B3();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int width;
        C1579020rC0 c1579020rC0 = (C1579020rC0) viewHolder;
        C1582510rHd c1582510rHd = c1579020rC0.LL;
        RecyclerView recyclerView = this.LLJI;
        if (recyclerView != null) {
            width = recyclerView.getWidth();
        } else {
            width = 0;
        }
        c1582510rHd.setParentWidth$common_mini_drama_release(width);
        c1582510rHd.setVariant(this.LLILZLL);
        c1582510rHd.setWidthRule(this.LLIZ);
        c1582510rHd.setSelectionStyle(this.LLIZLLLIL);
        c1582510rHd.setFont(this.LLJ);
        InterfaceC1203250hPv interfaceC1203250hPv = (InterfaceC1203250hPv) ListProtector.get(this.LLILLJJLI, i);
        ACListenerS126S0200000_24 aCListenerS126S0200000_24 = null;
        if (interfaceC1203250hPv instanceof C1578990rBx) {
            C1582510rHd c1582510rHd2 = c1579020rC0.LL;
            C1578990rBx c1578990rBx = (C1578990rBx) interfaceC1203250hPv;
            c1582510rHd2.LJ(c1578990rBx.LIZ, c1578990rBx.LIZIZ, c1578990rBx.LIZJ);
            c1582510rHd2.setEnabled(c1578990rBx.LIZLLL);
            if (c1578990rBx.LIZLLL) {
                aCListenerS126S0200000_24 = new ACListenerS126S0200000_24(this, c1579020rC0, 5);
            }
            C786410Ut5.ba(c1582510rHd2, aCListenerS126S0200000_24);
            c1582510rHd2.setSelected(this.LLILLL.contains(Integer.valueOf(i)));
            return;
        }
        if (interfaceC1203250hPv instanceof C1203240hPu) {
            C1582510rHd c1582510rHd3 = c1579020rC0.LL;
            interfaceC1203250hPv.getClass();
            c1582510rHd3.LIZLLL();
            c1582510rHd3.setEnabled(false);
            C786410Ut5.ba(c1582510rHd3, null);
            c1582510rHd3.setSelected(this.LLILLL.contains(Integer.valueOf(i)));
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1579020rC0 c1579020rC0 = new C1579020rC0(new C1582510rHd(this.LL));
        try {
            View view = c1579020rC0.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1579020rC0.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1579020rC0.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1579020rC0.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1579020rC0.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1579020rC0.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1579020rC0.class.getName();
        return c1579020rC0;
    }

    public final void LLLFZ(int i, boolean z, AbstractC1573810r3b abstractC1573810r3b) {
        RecyclerView recyclerView;
        if (i >= 0 && i < this.LLILLJJLI.size()) {
            notifyItemChanged(i);
            if (z && (recyclerView = this.LLJI) != null) {
                recyclerView.scrollToPosition(i);
            }
            InterfaceC1573860r3g interfaceC1573860r3g = this.LLILZ;
            if (interfaceC1573860r3g != null) {
                interfaceC1573860r3g.LIZ(i, z, abstractC1573810r3b);
            }
        }
    }

    public final void LLLI(int i, boolean z, AbstractC1573810r3b abstractC1573810r3b) {
        if (z) {
            if (this.LLILLL.add(Integer.valueOf(i))) {
                LLLFZ(i, true, abstractC1573810r3b);
            }
        } else {
            if (!this.LLILLL.remove(Integer.valueOf(i))) {
                return;
            }
            LLLFZ(i, false, abstractC1573810r3b);
        }
    }
}
