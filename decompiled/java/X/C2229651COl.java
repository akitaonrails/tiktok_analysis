package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.AwS578S0100000_34;

/* JADX INFO: renamed from: X.1COl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2229651COl implements InterfaceC669780QOy {
    public final InterfaceC1541990qEH LIZ;
    public RecyclerView LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 171));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS578S0100000_34(this, 172));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 169));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS578S0100000_34(this, 170));
    public final int[] LJI = new int[2];

    @Override // X.InterfaceC669780QOy
    public final RecyclerView LIZIZ() {
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            return recyclerView;
        }
        try {
            View viewE1 = this.LIZ.e1();
            LynxView lynxView = viewE1 instanceof LynxView ? (LynxView) viewE1 : null;
            View viewFindViewByIdSelector = lynxView != null ? lynxView.findViewByIdSelector("search-live-tab") : null;
            RecyclerView recyclerViewLIZJ = viewFindViewByIdSelector instanceof RecyclerView ? (RecyclerView) viewFindViewByIdSelector : null;
            if (recyclerViewLIZJ == null) {
                recyclerViewLIZJ = LIZJ();
            }
            this.LIZIZ = recyclerViewLIZJ;
            return recyclerViewLIZJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public final RecyclerView LIZJ() {
        View viewE1 = this.LIZ.e1();
        if (!(viewE1 instanceof ViewGroup) || viewE1 == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Rect rect = new Rect();
        linkedList.add(viewE1);
        while (!linkedList.isEmpty()) {
            ViewGroup viewGroup = (ViewGroup) linkedList.poll();
            if (viewGroup != null) {
                for (View view : new C2500209qy(viewGroup, 8)) {
                    if (view.getGlobalVisibleRect(rect) && view.isAttachedToWindow()) {
                        if (view instanceof RecyclerView) {
                            linkedList.clear();
                            return (RecyclerView) view;
                        }
                        if (view instanceof ViewGroup) {
                            linkedList.add(view);
                        }
                    } else if (view instanceof ViewGroup) {
                        linkedList.add(view);
                    }
                }
            }
        }
        return null;
    }

    public final void LIZLLL() {
        Iterator it2 = ((List) this.LJ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2229661COm) it2.next()).LJFF();
        }
    }

    public C2229651COl(InterfaceC1541990qEH interfaceC1541990qEH) {
        this.LIZ = interfaceC1541990qEH;
    }

    @Override // X.InterfaceC669780QOy
    public final boolean LIZ(int i, int i2, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
        int[] iArr2 = this.LJI;
        iArr2[0] = i;
        iArr2[1] = i2;
        if (i2 > 0) {
            for (InterfaceC2229661COm interfaceC2229661COm : (List) this.LJ.getValue()) {
                if (this.LJI[1] > 0) {
                    Iterator it2 = ((List) this.LJ.getValue()).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (((InterfaceC2229661COm) it2.next()).LIZJ()) {
                            interfaceC2229661COm.LIZ(this.LJI[1], iArr);
                            int[] iArr3 = this.LJI;
                            iArr3[1] = iArr3[1] - iArr[1];
                            break;
                        }
                    }
                }
            }
        } else {
            for (InterfaceC2229661COm interfaceC2229661COm2 : (List) this.LJFF.getValue()) {
                if (this.LJI[1] < 0) {
                    Iterator it3 = ((List) this.LJ.getValue()).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (((InterfaceC2229661COm) it3.next()).LJ()) {
                            interfaceC2229661COm2.LIZIZ(i2, iArr);
                            int[] iArr4 = this.LJI;
                            iArr4[1] = iArr4[1] - iArr[1];
                            break;
                        }
                    }
                }
            }
        }
        int[] iArr5 = this.LJI;
        if (iArr5[0] == i && iArr5[1] == i2) {
            return false;
        }
        return true;
    }
}
