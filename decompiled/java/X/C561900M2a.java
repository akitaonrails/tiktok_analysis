package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalBadgeItemViewHolder;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxNormalItemViewHolder;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskBadgeItemViewHolder;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftBoxTaskItemViewHolder;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M2a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561900M2a extends AbstractC21673619ry<AbstractC562050M2p<? extends C561950M2f>> {
    public final C561130Lzb LL;
    public final List<C561950M2f> LLILLJJLI = new ArrayList();
    public final Set<String> LLILLL = new LinkedHashSet();
    public DraftBoxFragment LLILZ;
    public C0M1G LLILZIL;
    public boolean LLILZLL;
    public C0M0T LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public final C0M1M LLJIJIL;
    public final C1DFK LLJILJIL;
    public final C054G LLJILJILJ;
    public final List<Function0<Unit>> LLJILLL;
    public int LLJJ;

    public final void LLLIIIIL() {
        ArrayList arrayList = (ArrayList) this.LLILLJJLI;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            if (((C561950M2f) listIterator.previous()).LIZ() == 108) {
                int iNextIndex = listIterator.nextIndex();
                if (iNextIndex >= 0) {
                    ListProtector.remove(this.LLILLJJLI, iNextIndex);
                    notifyItemRemoved(iNextIndex);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLJJLI).size();
    }

    public C561900M2a(C561130Lzb c561130Lzb) {
        C0M1M c0m1m;
        this.LL = c561130Lzb;
        if (C0M1H.LIZ()) {
            c0m1m = new C0M1M(0);
        } else {
            c0m1m = null;
        }
        this.LLJIJIL = c0m1m;
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LLJILJIL = c1dfkLIZ;
        this.LLJILJILJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(c1dfkLIZ));
        this.LLJILLL = new ArrayList();
    }

    public final void LLLFZ(List<? extends C561950M2f> list) {
        boolean z;
        int size;
        C0M0T c0m0t;
        C0M0T c0m0t2;
        if (this.LLILZLL && (c0m0t2 = this.LLIZ) != null) {
            C19719512Dh.LIZ(this.LLILLJJLI).remove(c0m0t2);
        }
        if (this.LLJIJIL != null && Intrinsics.LJFF(C13LP.LJJLIIIJL(this.LLILLJJLI), this.LLJIJIL)) {
            z = true;
            ((ArrayList) this.LLILLJJLI).remove(this.LLJIJIL);
        } else {
            z = false;
        }
        ((ArrayList) this.LLILLJJLI).addAll(list);
        if (this.LLILZLL && (c0m0t = this.LLIZ) != null) {
            ((ArrayList) this.LLILLJJLI).add(c0m0t);
        }
        if (z) {
            ((ArrayList) this.LLILLJJLI).add(this.LLJIJIL);
            size = (((ArrayList) this.LLILLJJLI).size() - list.size()) - 1;
        } else {
            size = ((ArrayList) this.LLILLJJLI).size() - list.size();
        }
        notifyItemRangeInserted(size, list.size());
    }

    public final void LLLIILIL(List<? extends C561950M2f> list) {
        C561950M2f c561950M2f;
        ((ArrayList) this.LLILLJJLI).clear();
        ((ArrayList) this.LLILLJJLI).addAll(list);
        if (this.LLILZLL && (c561950M2f = (C561950M2f) C13LP.LJJLIIIJL(list)) != null && c561950M2f.LIZ() != 108) {
            C0M0T c0m0t = new C0M0T(0);
            this.LLIZ = c0m0t;
            ((ArrayList) this.LLILLJJLI).add(c0m0t);
        }
        C0M1M c0m1m = this.LLJIJIL;
        if (c0m1m != null) {
            ((ArrayList) this.LLILLJJLI).add(c0m1m);
        }
        notifyDataSetChanged();
    }

    public final void LLLIL(C0M0P c0m0p) {
        for (Object obj : (ArrayList) this.LLILLJJLI) {
            C561950M2f c561950M2f = (C561950M2f) obj;
            if ((c561950M2f instanceof C0M0P) && Intrinsics.LJFF(((C0M0P) c561950M2f).LJ, c0m0p.LJ)) {
                if (obj != null) {
                    int iIndexOf = ((ArrayList) this.LLILLJJLI).indexOf(obj);
                    ListProtector.set(this.LLILLJJLI, iIndexOf, c0m0p);
                    notifyItemChanged(iIndexOf);
                    return;
                }
                return;
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C561950M2f c561950M2f = (C561950M2f) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if (c561950M2f != null) {
            return c561950M2f.LIZ();
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LJIJI(new C580770MqB(this, layoutManager, 7));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC562050M2p abstractC562050M2p = (AbstractC562050M2p) viewHolder;
        super.onViewAttachedToWindow(abstractC562050M2p);
        if (abstractC562050M2p instanceof C0M6V) {
            C0M6V c0m6v = (C0M6V) abstractC562050M2p;
            c0m6v.P5("onViewAttachedToWindow: ");
            c0m6v.LLIZ = true;
            if (c0m6v.LLILZIL) {
                c0m6v.T5("attach");
            }
            C0M6O c0m6o = (C0M6O) c0m6v.LLJJIII.getValue();
            if (c0m6o != null && !c0m6v.LLJJIJIL) {
                c0m6v.P5("registerObserver");
                C1DW6 c1dw6 = c0m6v.LLJJJ;
                if (c1dw6 != null) {
                    c0m6o.LJ(c1dw6);
                }
                c0m6v.LLJJJ = c0m6o.LJIIIIZZ(new AwS374S0200000_8(c0m6v, c0m6o, 150));
                InterfaceC866830XzV interfaceC866830XzV = c0m6v.LLJJJIL;
                if (interfaceC866830XzV != null) {
                    c0m6o.LJFF(interfaceC866830XzV);
                }
                c0m6v.LLJJJIL = c0m6o.LJIIJJI(new AwS587S0100000_8(c0m6v, 576), new AwS587S0100000_8(c0m6v, 577));
                c0m6v.LLJJIJIL = true;
            }
            InterfaceC497601wk interfaceC497601wk = c0m6v.LLILLJJLI;
            if (interfaceC497601wk != null) {
                C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C0M6X(c0m6v, null), 2);
            }
            ((ArrayList) this.LLJILLL).add(new C561910M2b(abstractC562050M2p));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        AbstractC562050M2p abstractC562050M2p = (AbstractC562050M2p) viewHolder;
        super.onViewDetachedFromWindow(abstractC562050M2p);
        if (abstractC562050M2p instanceof DraftItemBaseBgViewHolder) {
            ((DraftItemBaseBgViewHolder) abstractC562050M2p).onViewDetachedFromWindow();
        } else {
            if (!(abstractC562050M2p instanceof C0M6V)) {
                return;
            }
            ((C0M6V) abstractC562050M2p).onViewDetachedFromWindow();
            ((ArrayList) this.LLJILLL).remove(new C561920M2c(abstractC562050M2p));
        }
    }

    public final void LLLII(List list, Function2 function2) {
        String str;
        C0M0P c0m0p;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C561950M2f c561950M2f = (C561950M2f) it2.next();
            Iterator it3 = ((ArrayList) this.LLILLJJLI).iterator();
            while (true) {
                if (it3.hasNext()) {
                    Object next = it3.next();
                    if (((Boolean) function2.invoke(next, c561950M2f)).booleanValue()) {
                        if (next != null) {
                            Set<String> set = this.LLILLL;
                            if (!(c561950M2f instanceof C0M0P) || (c0m0p = (C0M0P) c561950M2f) == null || (str = c0m0p.LJ) == null) {
                                str = "";
                            }
                            set.remove(str);
                            int iIndexOf = ((ArrayList) this.LLILLJJLI).indexOf(next);
                            if (iIndexOf >= 0) {
                                ListProtector.remove(this.LLILLJJLI, iIndexOf);
                                notifyItemRemoved(iIndexOf);
                                notifyItemRangeChanged(iIndexOf, ((ArrayList) this.LLILLJJLI).size() - iIndexOf);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LLLI((AbstractC562050M2p) viewHolder, i, true);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c561820M1s;
        C561130Lzb c561130Lzb = this.LL;
        C054G c054g = this.LLJILJILJ;
        DraftBoxFragment draftBoxFragment = this.LLILZ;
        C0M1G c0m1g = this.LLILZIL;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(viewGroup.getContext());
        if (c19egLIZIZ != null) {
            switch (i) {
                case 106:
                    c561820M1s = new DraftBoxNormalItemViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvi, viewGroup, false), c561130Lzb, c054g, draftBoxFragment);
                    break;
                case 107:
                case 109:
                case 110:
                case 116:
                default:
                    throw new RuntimeException("wrong draft type");
                case 108:
                    c561820M1s = new C562500M4i(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvs, viewGroup, false), c0m1g);
                    break;
                case 111:
                case 113:
                    final FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
                    C786410Ut5.a6(frameLayout, new RecyclerView.LayoutParams(0, 0));
                    c561820M1s = new AbstractC562050M2p<C561950M2f>(frameLayout) { // from class: X.0M2e
                        @Override // X.AbstractC562050M2p
                        public final void I5(C561950M2f c561950M2f, int i2) {
                        }
                    };
                    break;
                case 112:
                    c561820M1s = new C561980M2i(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvh, viewGroup, false), draftBoxFragment);
                    break;
                case 114:
                    c561820M1s = new DraftBoxTaskItemViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvi, viewGroup, false), c561130Lzb, c054g, draftBoxFragment);
                    break;
                case 115:
                    final Space space = new Space(c19egLIZIZ);
                    c561820M1s = new AbstractC562050M2p<C561950M2f>(space) { // from class: X.0M1t
                        public final View LL;

                        {
                            super(space);
                            this.LL = space;
                        }

                        @Override // X.AbstractC562050M2p
                        public final void I5(C561950M2f c561950M2f, int i2) {
                            if (c561950M2f instanceof C561190Lzh) {
                                C786410Ut5.W5(this.LL, new RecyclerView.LayoutParams(-1, ((C561190Lzh) c561950M2f).LJ));
                            }
                        }
                    };
                    break;
                case 117:
                    final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvv, viewGroup, false);
                    c561820M1s = new AbstractC562050M2p<C561950M2f>(viewTd) { // from class: X.0M3R
                        public final View LL;

                        {
                            super(viewTd);
                            this.LL = viewTd;
                        }

                        @Override // X.AbstractC562050M2p
                        public final void I5(C561950M2f c561950M2f, int i2) {
                            if (c561950M2f instanceof C0M3S) {
                                C786410Ut5.W5(this.LL, new RecyclerView.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(38))));
                                TextView textView = (TextView) this.LL.findViewById(R.id.xw_);
                                Context context = this.LL.getContext();
                                String string = ((C0M3S) c561950M2f).LJ;
                                if (Intrinsics.LJFF(string, C0M3T.TODAY.getGroupName())) {
                                    string = context.getString(2131832432);
                                } else if (Intrinsics.LJFF(string, C0M3T.THIS_WEEK.getGroupName())) {
                                    string = context.getString(2131832431);
                                }
                                textView.setText(string);
                            }
                        }
                    };
                    break;
                case 118:
                    c561820M1s = new DraftBoxNormalBadgeItemViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvi, viewGroup, false), c561130Lzb, c054g, draftBoxFragment);
                    break;
                case 119:
                    c561820M1s = new DraftBoxTaskBadgeItemViewHolder(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvi, viewGroup, false), c561130Lzb, c054g, draftBoxFragment);
                    break;
                case 120:
                    c561820M1s = new C0M6V(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvc, viewGroup, false), c054g);
                    break;
                case 121:
                    c561820M1s = new C561820M1s(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cvj, viewGroup, false));
                    break;
            }
            if (c561820M1s instanceof DraftItemBaseBgViewHolder) {
                DraftItemBaseBgViewHolder draftItemBaseBgViewHolder = (DraftItemBaseBgViewHolder) c561820M1s;
                try {
                    Integer numS5 = draftItemBaseBgViewHolder.S5();
                    if (numS5 != null) {
                        ((FrameLayout) draftItemBaseBgViewHolder.LLIZLLLIL.getValue()).addView(C786410Ut5.Sd(numS5.intValue(), C786410Ut5.ne(draftItemBaseBgViewHolder.getItemView().getContext()), null));
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            try {
                View view = c561820M1s.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
            c561820M1s.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
            try {
                if (c561820M1s.itemView.getParent() != null) {
                    try {
                        SettingsManager.LIZLLL().getClass();
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(c561820M1s.getClass().getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(viewGroup.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C1AF0.LIZJ(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) c561820M1s.itemView.getParent();
                        if (viewGroup2 != null) {
                            C786410Ut5.LJJJLZIJ(c561820M1s.itemView, viewGroup2);
                        }
                    }
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C2081408Dk.LIZ(e2);
                C2344809Gs.LIZ(e2);
            }
            C20612085q.LIZ = c561820M1s.getClass().getName();
            return c561820M1s;
        }
        throw new RuntimeException("no activity");
    }

    public final void LLLI(AbstractC562050M2p<? extends C561950M2f> abstractC562050M2p, int i, boolean z) {
        C561950M2f c561950M2f = (C561950M2f) C13LP.LJJJLZIJ(i, this.LLILLJJLI);
        if (c561950M2f == null) {
            return;
        }
        int i2 = 0;
        if ((abstractC562050M2p instanceof DraftItemBaseBgViewHolder) && (c561950M2f instanceof C0M0P)) {
            C0M0P c0m0p = (C0M0P) c561950M2f;
            if (this.LLILLL.contains(c0m0p.LJ)) {
                c0m0p.LJJIII = false;
            } else {
                this.LLILLL.add(c0m0p.LJ);
            }
            DraftItemBaseBgViewHolder draftItemBaseBgViewHolder = (DraftItemBaseBgViewHolder) abstractC562050M2p;
            boolean z2 = this.LLIZLLLIL;
            draftItemBaseBgViewHolder.LLJILJIL = z2;
            boolean z3 = this.LLJ;
            draftItemBaseBgViewHolder.LLJILJILJ = z3;
            draftItemBaseBgViewHolder.LLJILLL = this.LLJJ;
            c0m0p.LIZIZ = z2;
            c0m0p.LIZJ = z3;
            draftItemBaseBgViewHolder.V5(c0m0p);
            draftItemBaseBgViewHolder.X5(c0m0p, i);
            if (z) {
                draftItemBaseBgViewHolder.L5(i, c0m0p);
            }
        } else if (abstractC562050M2p instanceof C0M6V) {
            C0M6V c0m6v = (C0M6V) abstractC562050M2p;
            c0m6v.LLILLL = this.LLIZLLLIL;
            c0m6v.LLILZIL = z;
            c0m6v.LLILZ = this.LLJI;
            c0m6v.I5(c561950M2f, i);
        } else {
            abstractC562050M2p.I5(c561950M2f, i);
        }
        C0M1G c0m1g = this.LLILZIL;
        if (c0m1g != null && this.LLILZLL) {
            int itemCount = getItemCount();
            if (c0m1g.LIZ.VR().LLJIJIL != null) {
                i2 = 1;
            }
            if (i == itemCount - (i2 + 1)) {
                DraftBoxFragment draftBoxFragment = c0m1g.LIZ;
                draftBoxFragment.kS("onLoadMore", draftBoxFragment.cS().LJI, c0m1g.LIZIZ, c0m1g.LIZJ, c0m1g.LIZLLL);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C0M0P c0m0p;
        DraftItemBaseBgViewHolder draftItemBaseBgViewHolder;
        AbstractC562050M2p<? extends C561950M2f> abstractC562050M2p = (AbstractC562050M2p) viewHolder;
        if (list.isEmpty()) {
            LLLI(abstractC562050M2p, i, true);
            return;
        }
        if (list.contains("edit_mode_change")) {
            LLLI(abstractC562050M2p, i, false);
            return;
        }
        if (!list.contains("task_progress_change")) {
            return;
        }
        Object obj = ListProtector.get(this.LLILLJJLI, i);
        if (!(obj instanceof C0M0P) || (c0m0p = (C0M0P) obj) == null || !(abstractC562050M2p instanceof DraftItemBaseBgViewHolder) || (draftItemBaseBgViewHolder = (DraftItemBaseBgViewHolder) abstractC562050M2p) == null) {
            return;
        }
        draftItemBaseBgViewHolder.a6(c0m0p);
    }
}
