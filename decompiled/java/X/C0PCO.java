package X;

import Y.ARunnableS110S0100000_10;
import Y.AsS30S0200000_10;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0PCO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PCO implements C0PBY {
    public final /* synthetic */ C640700PBc LL = new C640700PBc();
    public final RecyclerView LLILLJJLI;

    @Override // X.C0PBY
    public final void Q1(List<? extends InterfaceC648350Pbt> list, C587060N0u c587060N0u) {
        this.LL.Q1(list, c587060N0u);
    }

    public final int LIZJ() {
        if (this.LLILLJJLI.getAdapter() instanceof C0PVB) {
            return ((ArrayList) ((C0PVB) this.LLILLJJLI.getAdapter()).LLLI()).size();
        }
        return 0;
    }

    @Override // X.C0P74
    public final void LJL() {
        this.LL.LL = null;
    }

    public final void LJFF() {
        C644070POb.LIZ();
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            List<Integer> listLIZ = C641510PEf.LIZ(recyclerView);
            if (!listLIZ.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                Iterator<Integer> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(it2.next().intValue());
                    if ((viewHolderFindViewHolderForAdapterPosition instanceof RecyclerView.ViewHolder) && viewHolderFindViewHolderForAdapterPosition != null) {
                        arrayList.add(viewHolderFindViewHolderForAdapterPosition);
                    }
                }
            }
        }
        HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS110S0100000_10(this, 119));
    }

    public C0PCO(RecyclerView recyclerView) {
        this.LLILLJJLI = recyclerView;
        final C013C c013c = new C013C();
        recyclerView.addOnChildAttachStateChangeListener(new InterfaceC21676519sR() { // from class: X.0PCP
            @Override // X.InterfaceC21676519sR
            public final void m3(View view) {
            }

            @Override // X.InterfaceC21676519sR
            public final void g5(View view) {
                boolean z;
                RecyclerView.ViewHolder childViewHolder = this.LL.LLILLJJLI.getChildViewHolder(view);
                if (childViewHolder != null) {
                    C0PCO c0pco = this.LL;
                    C013C c013c2 = c013c;
                    if (childViewHolder.getBindingAdapterPosition() - c0pco.LIZJ() == 0) {
                        if (childViewHolder.itemView.getHeight() > c0pco.LLILLJJLI.getHeight()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c013c2.element = z;
                    }
                }
            }
        });
        recyclerView.addOnScrollListener(new AsS30S0200000_10(this, c013c, 3));
    }

    public static InterfaceC648350Pbt LIZLLL(List list) {
        Object next;
        C0PCQ priority;
        C0PCQ priority2;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Pair pair = (Pair) next;
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) pair.getFirst();
                InterfaceC648350Pbt interfaceC648350Pbt = (InterfaceC648350Pbt) pair.getSecond();
                if (viewHolder.itemView.isAttachedToWindow() && viewHolder.getBindingAdapterPosition() >= 0 && C0PCV.LIZ(viewHolder) && (priority = interfaceC648350Pbt.getPriority()) != null && priority.R1() && (priority2 = interfaceC648350Pbt.getPriority()) != null && priority2.LLFZ() >= 0.5d) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Pair pair2 = (Pair) next;
        if (pair2 == null) {
            return null;
        }
        return (InterfaceC648350Pbt) pair2.getSecond();
    }

    public final List<InterfaceC648350Pbt> LIZ(List<? extends Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt>> list) {
        int iLIZJ = LIZJ();
        ArrayList arrayList = new ArrayList();
        for (Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt> pair : list) {
            Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt> pair2 = pair;
            RecyclerView.ViewHolder first = pair2.getFirst();
            InterfaceC648350Pbt second = pair2.getSecond();
            if (first.itemView.isAttachedToWindow() && (first.getBindingAdapterPosition() - iLIZJ == 0 || first.getBindingAdapterPosition() - iLIZJ == 1)) {
                if (!C0PCV.LIZ(first) && second.N1()) {
                    arrayList.add(pair);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Pair) it2.next()).getSecond());
        }
        return arrayList2;
    }

    public final InterfaceC648350Pbt LIZIZ(List<? extends Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt>> list) {
        Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt> next;
        Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt> next2;
        Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt> next3;
        RecyclerView.ViewHolder first;
        RecyclerView.ViewHolder first2;
        Integer numValueOf;
        if (((Boolean) C285500BGy.LIZ.getValue()).booleanValue()) {
            Iterator<? extends Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt>> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt> pair = next2;
                    RecyclerView.ViewHolder first3 = pair.getFirst();
                    InterfaceC648350Pbt second = pair.getSecond();
                    if (first3.itemView.isAttachedToWindow() && C0PCV.LIZ(first3) && second.N1()) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt> pair2 = next2;
            Iterator<? extends Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt>> it3 = list.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next3 = it3.next();
                    Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt> pair3 = next3;
                    RecyclerView.ViewHolder first4 = pair3.getFirst();
                    InterfaceC648350Pbt second2 = pair3.getSecond();
                    if (first4.itemView.isAttachedToWindow() && second2.N1() && !C0PCV.LIZ(first4)) {
                        break;
                    }
                } else {
                    next3 = null;
                    break;
                }
            }
            Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt> pair4 = next3;
            if (pair2 != null && (first = pair2.getFirst()) != null) {
                int bindingAdapterPosition = first.getBindingAdapterPosition();
                if (pair4 == null || (first2 = pair4.getFirst()) == null || (numValueOf = Integer.valueOf(first2.getBindingAdapterPosition())) == null || bindingAdapterPosition < numValueOf.intValue()) {
                    return pair2.getSecond();
                }
            }
            return null;
        }
        Iterator<? extends Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt>> it4 = list.iterator();
        while (true) {
            if (it4.hasNext()) {
                next = it4.next();
                Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt> pair5 = next;
                RecyclerView.ViewHolder first5 = pair5.getFirst();
                InterfaceC648350Pbt second3 = pair5.getSecond();
                if (first5.itemView.isAttachedToWindow() && first5.getBindingAdapterPosition() - LIZJ() == 0 && C0PCV.LIZ(first5) && second3.N1()) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt> pair6 = next;
        if (pair6 == null) {
            return null;
        }
        return pair6.getSecond();
    }

    public final void LJ(List<? extends Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt>> list) {
        HashSet hashSet = new HashSet();
        int i = 0;
        for (Pair<? extends RecyclerView.ViewHolder, ? extends InterfaceC648350Pbt> pair : list) {
            C21681919tJ c21681919tJ = (C21681919tJ) pair.getFirst().itemView.getLayoutParams();
            if (c21681919tJ.LL == 0) {
                i++;
            }
            hashSet.add(new C650660Pfc(pair.getSecond(), i, c21681919tJ.LL));
        }
        this.LL.LJFF(hashSet);
    }

    @Override // X.C0P74
    public final void z1(C588600N6s c588600N6s) {
        this.LL.LL = c588600N6s;
    }
}
