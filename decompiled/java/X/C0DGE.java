package X;

import Y.ACListenerS139S0100000_4;
import Y.ARunnableS104S0100000_4;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DGE, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DGE {
    public final C0DD8 LIZ;
    public final C0DGC LIZIZ;
    public final Function0<Unit> LIZJ;
    public View LJII;
    public boolean LJIIIZ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 486));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 487));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS548S0100000_4(this, 488));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS548S0100000_4(this, 489));
    public final C0DH0 LJIIIIZZ = C0DH0.LL;
    public final C0DGQ LJIIJ = new InterfaceC21676019sM() { // from class: X.0DGQ
        @Override // X.InterfaceC21676019sM
        public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
        }

        @Override // X.InterfaceC21676019sM
        public final void LJIIZILJ(boolean z) {
        }

        @Override // X.InterfaceC21676019sM
        public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
            List<T> list = this.LL.LIZIZ.LL.LJFF;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (T t : list) {
                    if (!(t instanceof C08LM) || !((C08LM) t).isAnimating()) {
                        return false;
                    }
                }
            }
            return true;
        }
    };

    public final void LIZJ() {
        View view;
        View view2 = (View) this.LIZLLL.getValue();
        if (view2 == null) {
            return;
        }
        view2.requestLayout();
        RecyclerView recyclerView = (RecyclerView) this.LJ.getValue();
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
        Object parent = view2.getParent();
        if (!(parent instanceof View) || (view = (View) parent) == null) {
            return;
        }
        view.requestLayout();
    }

    public final void LIZ(boolean z) {
        RecyclerView recyclerView = (RecyclerView) this.LJ.getValue();
        if (recyclerView == null) {
            return;
        }
        if (z) {
            recyclerView.setOnTouchListener(this.LJIIIIZZ);
            if (!this.LJIIIZ) {
                recyclerView.addOnItemTouchListener(this.LJIIJ);
                this.LJIIIZ = true;
                return;
            }
            return;
        }
        recyclerView.setOnTouchListener(null);
        if (!this.LJIIIZ) {
            return;
        }
        recyclerView.removeOnItemTouchListener(this.LJIIJ);
        this.LJIIIZ = false;
    }

    public final void LIZIZ(InterfaceC332200D0o interfaceC332200D0o) {
        View viewFindViewById;
        View view = (View) this.LIZLLL.getValue();
        RecyclerView recyclerView = (RecyclerView) this.LJ.getValue();
        C1749280vcc c1749280vcc = (C1749280vcc) this.LJFF.getValue();
        ViewStub viewStub = (ViewStub) this.LJI.getValue();
        if (view == null) {
            return;
        }
        boolean z = true;
        if (Intrinsics.LJFF(interfaceC332200D0o, C332190D0n.INSTANCE)) {
            C786410Ut5.LJLLLLLL(0, view);
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 0);
            }
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            View view2 = this.LJII;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            AbstractC331870Czh.Companion.getClass();
            List listLIZ = C331820Czc.LIZ();
            LIZJ();
            this.LIZIZ.LLLII(listLIZ, new ARunnableS104S0100000_4(this, 102));
            LIZ(true);
            return;
        }
        if (interfaceC332200D0o instanceof C0D0Z) {
            C786410Ut5.LJLLLLLL(0, view);
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 0);
            }
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            View view3 = this.LJII;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            List<AbstractC331870Czh> listLIZ2 = C332090D0d.LIZ(((C0D0Z) interfaceC332200D0o).getSlots());
            LIZJ();
            this.LIZIZ.LLLII(listLIZ2, new ARunnableS104S0100000_4(this, 103));
            ArrayList<AbstractC331870Czh> arrayList = (ArrayList) listLIZ2;
            if (!arrayList.isEmpty()) {
                for (AbstractC331870Czh abstractC331870Czh : arrayList) {
                    if (!(abstractC331870Czh instanceof C08LM) || !((C08LM) abstractC331870Czh).isAnimating()) {
                        z = false;
                        break;
                    }
                }
            }
            LIZ(z);
            return;
        }
        if (interfaceC332200D0o instanceof C332100D0e) {
            C786410Ut5.LJLLLLLL(0, view);
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 8);
            }
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 8);
            }
            if (this.LJII == null && viewStub != null) {
                View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                this.LJII = viewLJLLLL;
                if (viewLJLLLL != null && (viewFindViewById = viewLJLLLL.findViewById(R.id.cmd)) != null) {
                    C786410Ut5.I7(new ACListenerS139S0100000_4(this, 86), viewFindViewById);
                }
            }
            View view4 = this.LJII;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
            }
            LIZJ();
            this.LIZIZ.LLLII(C13BV.INSTANCE, new ARunnableS104S0100000_4(this, 104));
            LIZ(false);
            return;
        }
        if (Intrinsics.LJFF(interfaceC332200D0o, C332110D0f.INSTANCE)) {
            C786410Ut5.LJLLLLLL(0, view);
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 8);
            }
            View view5 = this.LJII;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
            LIZJ();
            this.LIZIZ.LLLII(C13BV.INSTANCE, new ARunnableS104S0100000_4(this, 105));
            if (c1749280vcc != null) {
                c1749280vcc.setLayoutVariant(0);
                C1722300uv6 c1722300uv6 = new C1722300uv6();
                C844470XAv c844470XAv = C844470XAv.LIZ;
                c844470XAv.getClass();
                c1722300uv6.LJI = C844470XAv.LIZ().getString(2131857587);
                c844470XAv.getClass();
                c1722300uv6.LJIIIIZZ = C844470XAv.LIZ().getString(2131857588);
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.mw;
                Drawable drawableLIZ = c0hti.LIZ(c1749280vcc.getContext());
                c1722300uv6.LIZJ = 2;
                c1722300uv6.LIZ = drawableLIZ;
                c1749280vcc.setStatus(c1722300uv6);
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
            LIZ(false);
            return;
        }
        if (Intrinsics.LJFF(interfaceC332200D0o, C333260D4q.INSTANCE)) {
            C786410Ut5.LJLLLLLL(8, view);
            LIZJ();
            LIZ(false);
        } else {
            if (interfaceC332200D0o == null) {
                C786410Ut5.LJLLLLLL(8, view);
                LIZJ();
                LIZ(false);
                return;
            }
            throw new C1954807lC();
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0DGQ] */
    public C0DGE(C0DD8 c0dd8, C0DGC c0dgc, AwS548S0100000_4 awS548S0100000_4) {
        this.LIZ = c0dd8;
        this.LIZIZ = c0dgc;
        this.LIZJ = awS548S0100000_4;
    }
}
