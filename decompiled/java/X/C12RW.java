package X;

import android.content.Context;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS18S0002000_29;
import kotlin.jvm.internal.AwS41S0001000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12RW, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12RW implements C0FPW {
    public final C20632315oP LIZ;
    public int LIZIZ;
    public final Map<Integer, C0FPW> LIZJ = new LinkedHashMap();
    public C19754712Qv LIZLLL;

    @Override // X.C0FPW
    public final void LIZ(C1664390tPh c1664390tPh) {
    }

    @Override // X.C0FPW
    public final void LJFF(AbstractC1664130tPH abstractC1664130tPH) {
    }

    @Override // X.C0FPW
    public final void LJIIIIZZ(boolean z, InterfaceC1631630sYr<? super List<? extends Effect>, ? super Boolean, ? super Integer, ? super String, Unit> interfaceC1631630sYr) {
    }

    @Override // X.C0FPW
    public final void LJIIIZ(List<? extends Effect> list, C19754712Qv c19754712Qv, Effect effect) {
    }

    @Override // X.C0FPW
    public final void LJIJI(C19754712Qv c19754712Qv, Effect effect, InterfaceC1631630sYr interfaceC1631630sYr) {
    }

    @Override // X.C0FPW
    public final void LJ() {
        LJIJJLI(AFwS273S0000000_29.get$arr$(283));
    }

    @Override // X.C0FPW
    public final void LJIIJ() {
        LJIJJLI(AFwS273S0000000_29.get$arr$(286));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FPW
    public final C1664150tPJ LJIIJJI() {
        C259800zU c259800zU = new C259800zU();
        LJIJJLI(new AwS608S0100000_29(c259800zU, (C259800zU<FocusTargetNode>) 543));
        return (C1664150tPJ) c259800zU.element;
    }

    @Override // X.C0FPW
    public final void LJIILL() {
        LJIJJLI(AFwS273S0000000_29.get$arr$(284));
    }

    public final C0FPW LJIJJ() {
        return (C0FPW) ((LinkedHashMap) this.LIZJ).get(Integer.valueOf(this.LIZIZ));
    }

    @Override // X.C0FPW
    public final boolean LJJIZ() {
        C013C c013c = new C013C();
        LJIJJLI(new AwS608S0100000_29(c013c, 544));
        return c013c.element;
    }

    @Override // X.C0FPW
    public final void onDestroy() {
        LJIJJLI(AFwS273S0000000_29.get$arr$(285));
        ((LinkedHashMap) this.LIZJ).clear();
        this.LIZLLL = null;
    }

    @Override // X.C0FPW
    public final int LIZIZ() {
        C0FPW c0fpwLJIJJ = LJIJJ();
        if (c0fpwLJIJJ != null) {
            return c0fpwLJIJJ.LIZIZ();
        }
        return -1;
    }

    @Override // X.C0FPW
    public final void LJI() {
        C0FPW c0fpwLJIJJ = LJIJJ();
        if (c0fpwLJIJJ != null) {
            c0fpwLJIJJ.LJI();
        }
    }

    @Override // X.C0FPW
    public final int LJIILJJIL() {
        C0FPW c0fpwLJIJJ = LJIJJ();
        if (c0fpwLJIJJ != null) {
            return c0fpwLJIJJ.LJIILJJIL();
        }
        return 0;
    }

    public C12RW(C20632315oP c20632315oP) {
        this.LIZ = c20632315oP;
    }

    @Override // X.C0FPW
    public final void LIZJ(int i) {
        LJIJJLI(new AwS41S0001000_29(i, 30));
    }

    @Override // X.C0FPW
    public final void LJII(InterfaceC1664180tPM interfaceC1664180tPM) {
        LJIJJLI(new AwS608S0100000_29(interfaceC1664180tPM, 545));
    }

    @Override // X.C0FPW
    public final void LJIIL(int i) {
        LJIJJLI(new AwS41S0001000_29(i, 31));
    }

    @Override // X.C0FPW
    public final C1664150tPJ LJIILIIL(int i) {
        C0FPW c0fpwLJIJJ = LJIJJ();
        if (c0fpwLJIJJ != null) {
            return c0fpwLJIJJ.LJIILIIL(i);
        }
        return null;
    }

    @Override // X.C0FPW
    public final void LJIIZILJ(C19754712Qv c19754712Qv) {
        this.LIZLLL = c19754712Qv;
        LJIJJLI(new AwS608S0100000_29(c19754712Qv, 547));
    }

    @Override // X.C0FPW
    public final void LJIJ(Effect effect) {
        LJIJJLI(new AwS608S0100000_29(effect, 546));
    }

    public final void LJIJJLI(Function1<? super C0FPW, Unit> function1) {
        AbstractC21673619ry adapter;
        Iterator it2 = ((LinkedHashMap) this.LIZJ).keySet().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Object obj = ((LinkedHashMap) this.LIZJ).get(Integer.valueOf(((Number) it2.next()).intValue()));
            if (obj != 0) {
                function1.invoke(obj);
                z = true;
            }
        }
        if (!z || (adapter = this.LIZ.getAdapter()) == null || adapter.getItemCount() == 0) {
            return;
        }
        this.LIZ.getLayoutParams().height = this.LIZ.getMeasuredHeight();
    }

    @Override // X.C0FPW
    public final void LJIILLIIL(int i, int i2) {
        LJIJJLI(new AwS18S0002000_29(i, i2, 2));
    }

    @Override // X.C0FPW
    public final RecyclerView LIZLLL(Context context, LinearLayoutManager linearLayoutManager, C0DXR c0dxr) {
        RecyclerView recyclerViewLIZLLL;
        C0FPW c0fpwLJIJJ = LJIJJ();
        if (c0fpwLJIJJ != null && (recyclerViewLIZLLL = c0fpwLJIJJ.LIZLLL(context, linearLayoutManager, c0dxr)) != null) {
            return recyclerViewLIZLLL;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
