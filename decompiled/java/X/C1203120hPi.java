package X;

import Y.ACListenerS121S0200000_18;
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

/* JADX INFO: renamed from: X.0hPi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203120hPi extends AbstractC21673619ry<C1203160hPm> {
    public final Context LL;
    public InterfaceC1203170hPn LLILZ;
    public InterfaceC1195450hDL LLILZIL;
    public Integer LLJ;
    public RecyclerView LLJI;
    public List<InterfaceC1203220hPs> LLILLJJLI = new ArrayList();
    public Set<Integer> LLILLL = new LinkedHashSet();
    public EnumC1166860gTE LLILZLL = EnumC1166860gTE.CAPSULE;
    public InterfaceC1170390gYv LLIZ = new C1582580rHk(0, 0, 7);
    public InterfaceC1203260hPw LLIZLLLIL = new C1582480rHa(null, null, null, null);

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C1203120hPi(Context context) {
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

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int width;
        C1203160hPm c1203160hPm = (C1203160hPm) viewHolder;
        C1582570rHj c1582570rHj = c1203160hPm.LL;
        RecyclerView recyclerView = this.LLJI;
        if (recyclerView != null) {
            width = recyclerView.getWidth();
        } else {
            width = 0;
        }
        c1582570rHj.setParentWidth$tux_theme_release(width);
        c1582570rHj.setVariant(this.LLILZLL);
        c1582570rHj.setWidthRule(this.LLIZ);
        c1582570rHj.setSelectionStyle(this.LLIZLLLIL);
        c1582570rHj.setFont(this.LLJ);
        InterfaceC1203220hPs interfaceC1203220hPs = (InterfaceC1203220hPs) ListProtector.get(this.LLILLJJLI, i);
        ACListenerS121S0200000_18 aCListenerS121S0200000_18 = null;
        if (interfaceC1203220hPs instanceof C1203140hPk) {
            C1582570rHj c1582570rHj2 = c1203160hPm.LL;
            C1203140hPk c1203140hPk = (C1203140hPk) interfaceC1203220hPs;
            c1582570rHj2.LJ(c1203140hPk.LIZ, c1203140hPk.LIZIZ, c1203140hPk.LIZJ);
            c1582570rHj2.setEnabled(c1203140hPk.LIZLLL);
            if (c1203140hPk.LIZLLL) {
                aCListenerS121S0200000_18 = new ACListenerS121S0200000_18(this, c1203160hPm, 0);
            }
            C786410Ut5.V8(c1582570rHj2, aCListenerS121S0200000_18);
            c1582570rHj2.setSelected(this.LLILLL.contains(Integer.valueOf(i)));
            return;
        }
        if (interfaceC1203220hPs instanceof C1203150hPl) {
            C1582570rHj c1582570rHj3 = c1203160hPm.LL;
            C1203150hPl c1203150hPl = (C1203150hPl) interfaceC1203220hPs;
            c1582570rHj3.LIZLLL(c1203150hPl.LIZ, c1203150hPl.LIZIZ);
            c1582570rHj3.setEnabled(c1203150hPl.LIZJ);
            if (c1203150hPl.LIZJ) {
                aCListenerS121S0200000_18 = new ACListenerS121S0200000_18(this, c1203160hPm, 0);
            }
            C786410Ut5.V8(c1582570rHj3, aCListenerS121S0200000_18);
            c1582570rHj3.setSelected(this.LLILLL.contains(Integer.valueOf(i)));
            return;
        }
        throw new C1954807lC();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1203160hPm c1203160hPm = new C1203160hPm(new C1582570rHj(this.LL, null, 6));
        try {
            View view = c1203160hPm.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1203160hPm.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1203160hPm.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1203160hPm.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1203160hPm.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1203160hPm.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1203160hPm.class.getName();
        return c1203160hPm;
    }

    public final void LLLFZ(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
        RecyclerView recyclerView;
        if (i >= 0 && i < this.LLILLJJLI.size()) {
            notifyItemChanged(i);
            if (z && (recyclerView = this.LLJI) != null) {
                recyclerView.scrollToPosition(i);
            }
            InterfaceC1203170hPn interfaceC1203170hPn = this.LLILZ;
            if (interfaceC1203170hPn != null) {
                interfaceC1203170hPn.LIZ(i, z, abstractC1203190hPp);
            }
        }
    }

    public final void LLLI(int i, boolean z, AbstractC1203190hPp abstractC1203190hPp) {
        if (z) {
            if (this.LLILLL.add(Integer.valueOf(i))) {
                LLLFZ(i, true, abstractC1203190hPp);
            }
        } else {
            if (!this.LLILLL.remove(Integer.valueOf(i))) {
                return;
            }
            LLLFZ(i, false, abstractC1203190hPp);
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
                    LLLFZ(iIntValue, false, abstractC1203190hPp);
                }
            }
            if (!set.contains(Integer.valueOf(i))) {
                LLLFZ(i, true, abstractC1203190hPp);
                return;
            }
            if (i < 0 || i >= this.LLILLJJLI.size()) {
                return;
            }
            RecyclerView recyclerView = this.LLJI;
            if (recyclerView != null) {
                recyclerView.scrollToPosition(i);
            }
            InterfaceC1195450hDL interfaceC1195450hDL = this.LLILZIL;
            if (interfaceC1195450hDL == null) {
                return;
            }
            interfaceC1195450hDL.LIZ(i, abstractC1203190hPp);
            return;
        }
        if (this.LLILLL.remove(Integer.valueOf(i))) {
            LLLFZ(i, false, abstractC1203190hPp);
        }
    }
}
