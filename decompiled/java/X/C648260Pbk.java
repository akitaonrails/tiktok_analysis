package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Pbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648260Pbk extends C652600Pik {
    public final View LJIILIIL;
    public final ArrayList<InterfaceC648270Pbl> LJIILJJIL = new ArrayList<>();
    public AnonymousClass0956 LJIILL;

    @Override // X.C652600Pik
    public final void LJIIJJI(RecyclerView recyclerView, int i, int i2) {
    }

    @Override // X.C652600Pik
    public final void LJIIIIZZ() {
        InterfaceC648270Pbl next;
        Iterator<InterfaceC648270Pbl> it2 = this.LJIILJJIL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            InterfaceC648270Pbl interfaceC648270Pbl = next;
            Boolean boolZ3 = interfaceC648270Pbl.z3();
            if (boolZ3 != null ? boolZ3.booleanValue() : interfaceC648270Pbl.isPlaying()) {
                break;
            }
        }
        LJIIL(next);
        super.LJIIIIZZ();
        this.LJIILJJIL.clear();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(this.LJIILIIL);
        while (!arrayDeque.isEmpty()) {
            View view = (View) arrayDeque.getFirst();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (viewGroup.getChildAt(i).getVisibility() == 0) {
                        if (viewGroup.getChildAt(i) instanceof C658550PsL) {
                            View childAt = viewGroup.getChildAt(i);
                            if ((childAt instanceof C658550PsL) && childAt != null) {
                                this.LJIILJJIL.add(childAt);
                            }
                        }
                        if (viewGroup.getChildAt(i) instanceof C661440Px0) {
                            View childAt2 = viewGroup.getChildAt(i);
                            if ((childAt2 instanceof C661440Px0) && childAt2 != null) {
                                this.LJIILJJIL.add(childAt2);
                            }
                        }
                        arrayDeque.addLast(viewGroup.getChildAt(i));
                    }
                }
            }
            arrayDeque.pollFirst();
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIILL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIILL = null;
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIILL = C948503nH.LJII(this.LJIILIIL, new C648250Pbj(this, null));
    }

    @Override // X.C652600Pik, X.InterfaceC648720PcU
    public final void LJFF() {
        super.LJFF();
        int i = 0;
        for (InterfaceC648270Pbl interfaceC648270Pbl : this.LJIILJJIL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            LJIIL(interfaceC648270Pbl);
            i = i2;
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIILL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJIILL = null;
    }

    public C648260Pbk(View view) {
        this.LJIILIIL = view;
    }

    public static void LJIIL(InterfaceC648270Pbl interfaceC648270Pbl) {
        if (interfaceC648270Pbl == null) {
            return;
        }
        if (interfaceC648270Pbl instanceof C661440Px0) {
            C661440Px0 c661440Px0 = (C661440Px0) interfaceC648270Pbl;
            if (c661440Px0 != null) {
                c661440Px0.LJJIII();
                return;
            }
            return;
        }
        interfaceC648270Pbl.LJJJJ();
    }
}
