package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tPG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664120tPG implements C0FPW {
    public RecyclerView LIZ;
    public AbstractC1664130tPH LIZIZ;
    public InterfaceC1664140tPI LIZJ;

    @Override // X.C0FPW
    public final int LIZIZ() {
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null) {
            return abstractC1664130tPH.LLIZ;
        }
        return -1;
    }

    @Override // X.C0FPW
    public final void LJ() {
        C201955140j.LIZJ(C1664170tPL.LIZIZ, "cancelAllSelectedPosition");
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null) {
            abstractC1664130tPH.LLLI();
        }
    }

    @Override // X.C0FPW
    public final void LJI() {
        C201955140j.LIZJ(C1664170tPL.LIZIZ, "resetInitPosition");
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null) {
            abstractC1664130tPH.LLIZLLLIL = abstractC1664130tPH.LLIZ;
        }
    }

    @Override // X.C0FPW
    public final void LJIIJ() {
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null) {
            abstractC1664130tPH.LLLIL();
        }
    }

    @Override // X.C0FPW
    public final C1664150tPJ LJIIJJI() {
        int i;
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH == null || (i = abstractC1664130tPH.LLIZ) < 0 || i >= abstractC1664130tPH.LLILLL.size()) {
            return null;
        }
        return (C1664150tPJ) ListProtector.get(abstractC1664130tPH.LLILLL, i);
    }

    @Override // X.C0FPW
    public final int LJIILJJIL() {
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null) {
            return abstractC1664130tPH.LLIZLLLIL;
        }
        return -1;
    }

    @Override // X.C0FPW
    public final void LJIILL() {
        int i;
        C201955140j.LIZJ(C1664170tPL.LIZIZ, "cancelSelectedPosition");
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH == null || (i = abstractC1664130tPH.LLIZ) == -1) {
            return;
        }
        ((C1664150tPJ) ListProtector.get(abstractC1664130tPH.LLILLL, i)).LJII = false;
        abstractC1664130tPH.notifyItemChanged(i);
        abstractC1664130tPH.LLIZ = -1;
    }

    @Override // X.C0FPW
    public final boolean LJJIZ() {
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        return (abstractC1664130tPH == null || abstractC1664130tPH.LLIZLLLIL == abstractC1664130tPH.LLIZ) ? false : true;
    }

    @Override // X.C0FPW
    public final void onDestroy() {
        InterfaceC1664140tPI interfaceC1664140tPI = this.LIZJ;
        if (interfaceC1664140tPI != null) {
            interfaceC1664140tPI.onDestroy();
        }
    }

    @Override // X.C0FPW
    public final void LIZ(C1664390tPh c1664390tPh) {
        this.LIZJ = c1664390tPh;
    }

    @Override // X.C0FPW
    public final void LIZJ(int i) {
        C1664170tPL c1664170tPL = C1664170tPL.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSelectedPosition position:");
        sbLIZ.append(i);
        C201955140j.LIZJ(c1664170tPL, C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null) {
            abstractC1664130tPH.LLLILZ(i);
        }
    }

    @Override // X.C0FPW
    public final void LJFF(AbstractC1664130tPH abstractC1664130tPH) {
        this.LIZIZ = abstractC1664130tPH;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView != null) {
            recyclerView.setAdapter(abstractC1664130tPH);
        }
    }

    @Override // X.C0FPW
    public final void LJII(InterfaceC1664180tPM interfaceC1664180tPM) {
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null) {
            abstractC1664130tPH.LLILLJJLI = interfaceC1664180tPM;
        }
    }

    @Override // X.C0FPW
    public final void LJIIL(int i) {
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null) {
            Iterator<C1664150tPJ> it2 = abstractC1664130tPH.LLILLL.iterator();
            while (it2.hasNext()) {
                it2.next().LJ = i;
            }
            abstractC1664130tPH.notifyDataSetChanged();
        }
    }

    @Override // X.C0FPW
    public final C1664150tPJ LJIILIIL(int i) {
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH == null || i < 0 || i >= abstractC1664130tPH.LLILLL.size()) {
            return null;
        }
        return (C1664150tPJ) ListProtector.get(abstractC1664130tPH.LLILLL, i);
    }

    @Override // X.C0FPW
    public final void LJIIZILJ(C19754712Qv c19754712Qv) {
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null && !Intrinsics.LJFF(abstractC1664130tPH.LLILZIL, c19754712Qv)) {
            int i = !c19754712Qv.LIZ ? 1 : 0;
            for (C1664150tPJ c1664150tPJ : abstractC1664130tPH.LLILLL) {
                if (!c1664150tPJ.LIZJ) {
                    c1664150tPJ.LJFF = i;
                }
            }
            abstractC1664130tPH.LLILZIL = c19754712Qv;
            abstractC1664130tPH.notifyDataSetChanged();
        }
    }

    @Override // X.C0FPW
    public final void LJIJ(Effect effect) {
        C1664170tPL c1664170tPL = C1664170tPL.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSelectedPosition selectedEffect:");
        sbLIZ.append(effect.getName());
        C201955140j.LIZJ(c1664170tPL, C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null) {
            boolean z = false;
            int i = 0;
            for (C1664150tPJ c1664150tPJ : abstractC1664130tPH.LLILLL) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (AbstractC1664130tPH.LLLII(effect, c1664150tPJ.LIZ)) {
                        abstractC1664130tPH.LLLILZ(i);
                        z = true;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (!z) {
                abstractC1664130tPH.LLLI();
            }
        }
    }

    public final void LJIJJ(boolean z) {
        boolean z2;
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null) {
            int i = 0;
            for (C1664150tPJ c1664150tPJ : abstractC1664130tPH.LLILLL) {
                int i2 = i + 1;
                if (i >= 0) {
                    C1664150tPJ c1664150tPJ2 = c1664150tPJ;
                    if (abstractC1664130tPH.LLIZ == i && z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c1664150tPJ2.LJIIJ = z2;
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            abstractC1664130tPH.notifyDataSetChanged();
        }
    }

    public final void LJIJJLI(int i) {
        int i2;
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null) {
            int i3 = 0;
            for (C1664150tPJ c1664150tPJ : abstractC1664130tPH.LLILLL) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C1664150tPJ c1664150tPJ2 = c1664150tPJ;
                    if (abstractC1664130tPH.LLIZ == i3) {
                        i2 = i;
                    } else {
                        i2 = -1;
                    }
                    c1664150tPJ2.LJIIIZ = i2;
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            abstractC1664130tPH.notifyDataSetChanged();
        }
    }

    public final void LJIL(int i) {
        int i2;
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null) {
            int i3 = 0;
            for (C1664150tPJ c1664150tPJ : abstractC1664130tPH.LLILLL) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C1664150tPJ c1664150tPJ2 = c1664150tPJ;
                    if (abstractC1664130tPH.LLIZ == i3) {
                        i2 = i;
                    } else {
                        i2 = -1;
                    }
                    c1664150tPJ2.LJIIIIZZ = i2;
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            abstractC1664130tPH.notifyDataSetChanged();
        }
    }

    @Override // X.C0FPW
    public final void LJIIIIZZ(boolean z, InterfaceC1631630sYr<? super List<? extends Effect>, ? super Boolean, ? super Integer, ? super String, Unit> interfaceC1631630sYr) {
        if (this.LIZJ == null) {
            this.LIZJ = new C1664390tPh();
        }
        InterfaceC1664140tPI interfaceC1664140tPI = null;
        if (z) {
            InterfaceC1664140tPI interfaceC1664140tPI2 = this.LIZJ;
            if (interfaceC1664140tPI2 == null) {
                interfaceC1664140tPI2 = null;
            }
            interfaceC1664140tPI2.LIZIZ(new AwS674S0100000_25(interfaceC1631630sYr, (InterfaceC1631630sYr<? super List<? extends Effect>, ? super Boolean, ? super Integer, ? super String, Unit>) 29));
        }
        InterfaceC1664140tPI interfaceC1664140tPI3 = this.LIZJ;
        if (interfaceC1664140tPI3 != null) {
            interfaceC1664140tPI = interfaceC1664140tPI3;
        }
        interfaceC1664140tPI.LIZ(new AwS674S0100000_25(interfaceC1631630sYr, (InterfaceC1631630sYr<? super List<? extends Effect>, ? super Boolean, ? super Integer, ? super String, Unit>) 30));
    }

    @Override // X.C0FPW
    public final void LJIILLIIL(int i, int i2) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        C1664170tPL c1664170tPL = C1664170tPL.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeItemProcessState position:");
        sbLIZ.append(i);
        sbLIZ.append(" state:");
        sbLIZ.append(i2);
        C201955140j.LIZJ(c1664170tPL, C2188811AlT.LIZIZ(sbLIZ));
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null && i >= 0 && i < abstractC1664130tPH.getItemCount()) {
            RecyclerView recyclerView = abstractC1664130tPH.LL;
            if (recyclerView != null) {
                viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolderFindViewHolderForAdapterPosition = null;
            }
            if (viewHolderFindViewHolderForAdapterPosition instanceof C1664300tPY) {
                ((C1664300tPY) viewHolderFindViewHolderForAdapterPosition).P5(i2);
            } else {
                abstractC1664130tPH.notifyItemChanged(i);
            }
        }
    }

    @Override // X.C0FPW
    public final RecyclerView LIZLLL(Context context, LinearLayoutManager linearLayoutManager, C0DXR c0dxr) {
        AbstractC21674919sB abstractC21674919sB;
        if (this.LIZ == null) {
            RecyclerView recyclerView = new RecyclerView(context);
            this.LIZ = recyclerView;
            AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator != null) {
                itemAnimator.LJIJJ(0L);
                itemAnimator.LJIJJLI(0L);
                itemAnimator.LJIL(0L);
                itemAnimator.LJJ(0L);
            }
            AbstractC21673719rz itemAnimator2 = recyclerView.getItemAnimator();
            if ((itemAnimator2 instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator2) != null) {
                abstractC21674919sB.LLIZ = false;
            }
            RecyclerView recyclerView2 = this.LIZ;
            if (recyclerView2 != null) {
                recyclerView2.addItemDecoration(c0dxr);
                recyclerView2.setLayoutManager(linearLayoutManager);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        RecyclerView recyclerView3 = this.LIZ;
        if (recyclerView3 != null) {
            return recyclerView3;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C0FPW
    public final void LJIIIZ(List<? extends Effect> list, C19754712Qv c19754712Qv, Effect effect) {
        AbstractC1664130tPH abstractC1664130tPH = this.LIZIZ;
        if (abstractC1664130tPH != null && list != null) {
            if (Intrinsics.LJFF(abstractC1664130tPH.LLILZ, list) && Intrinsics.LJFF(abstractC1664130tPH.LLILZIL, c19754712Qv) && Intrinsics.LJFF(abstractC1664130tPH.LLILZLL, effect)) {
                return;
            }
            abstractC1664130tPH.LLIZ = -1;
            abstractC1664130tPH.LLIZLLLIL = -1;
            abstractC1664130tPH.LLILZIL = c19754712Qv;
            abstractC1664130tPH.LLILZ = list;
            abstractC1664130tPH.LLILZLL = effect;
            int i = !c19754712Qv.LIZ ? 1 : 0;
            abstractC1664130tPH.LLILLL.clear();
            abstractC1664130tPH.LLLFZ();
            Iterator<? extends Effect> it2 = list.iterator();
            while (it2.hasNext()) {
                abstractC1664130tPH.LLILLL.add(new C1664150tPJ(it2.next(), i, 2014));
            }
            if (effect == null) {
                abstractC1664130tPH.notifyDataSetChanged();
            } else {
                int i2 = 0;
                boolean z = false;
                boolean z2 = false;
                for (C1664150tPJ c1664150tPJ : abstractC1664130tPH.LLILLL) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C1664150tPJ c1664150tPJ2 = c1664150tPJ;
                        if (!z && c1664150tPJ2.LIZJ) {
                            z = true;
                        }
                        if (!z2 && c1664150tPJ2.LIZ != null) {
                            z2 = true;
                        }
                        boolean zLLLII = AbstractC1664130tPH.LLLII(effect, c1664150tPJ2.LIZ);
                        if (zLLLII) {
                            abstractC1664130tPH.LLIZLLLIL = i2;
                            abstractC1664130tPH.LLIZ = i2;
                        }
                        c1664150tPJ2.LJII = zLLLII;
                        i2 = i3;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                abstractC1664130tPH.notifyDataSetChanged();
            }
            abstractC1664130tPH.LLLIL();
        }
    }

    @Override // X.C0FPW
    public final void LJIJI(C19754712Qv c19754712Qv, Effect effect, InterfaceC1631630sYr interfaceC1631630sYr) {
        LJIIIIZZ(true, new C0FPX(this, c19754712Qv, effect, interfaceC1631630sYr));
    }
}
