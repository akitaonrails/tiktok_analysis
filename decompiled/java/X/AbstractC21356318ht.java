package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18ht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21356318ht {
    public boolean LIZ;
    public View LIZIZ;
    public InterfaceC21358118iB LIZJ;
    public InterfaceC212356188k LIZLLL;
    public ViewGroup LJ;
    public View LJFF;
    public View LJI;
    public View LJII;
    public ViewGroup LJIIIIZZ;
    public C21356518hv LJIIIZ;
    public RecyclerView LJIIJ;
    public Activity LJIIJJI;
    public View LJIIL;
    public View LJIILIIL;
    public C21355718hn LJIILJJIL;
    public Function0<Boolean> LJIILL;
    public View LJIILLIIL;
    public C1624230sMv LJIIZILJ;

    public void LIZJ() {
    }

    public void LIZLLL() {
    }

    public void LJ() {
    }

    public void LJI(List<C1621190sI1> list) {
    }

    public void LJII() {
    }

    public void LJIIIIZZ(String str) {
    }

    public void LJIIIZ(int i) {
    }

    public void LJIIJ(Effect effect, boolean z) {
    }

    public void LJIIJJI(boolean z) {
    }

    public final View LIZ() {
        C21356518hv c21356518hv = this.LJIIIZ;
        return (c21356518hv == null || true != c21356518hv.LIZ) ? this.LJFF : true == c21356518hv.LIZJ ? this.LJI : this.LJII;
    }

    public InterfaceC212356188k LIZIZ() {
        return new InterfaceC212356188k() { // from class: X.188l
            @Override // X.InterfaceC212356188k
            public final void LIZ() {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LIZ();
                }
            }

            @Override // X.InterfaceC212356188k
            public final void LIZIZ() {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LIZIZ();
                }
            }

            @Override // X.InterfaceC212356188k
            public final void LIZLLL() {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LIZLLL();
                }
            }

            @Override // X.InterfaceC212356188k
            public final void LJI() {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LJI();
                }
            }

            @Override // X.InterfaceC212356188k
            public final void LJIIL() {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LJIIL();
                }
            }

            @Override // X.InterfaceC212356188k
            public final void LJFF(List<C1621190sI1> list) {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LJFF(list);
                }
            }

            @Override // X.InterfaceC212356188k
            public final void LIZJ(C21356918hz c21356918hz, C21355818ho c21355818ho) {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LIZJ(c21356918hz, c21355818ho);
                }
            }

            @Override // X.InterfaceC212356188k
            public final void LJ(List<C1621190sI1> list, Map<C21356918hz, Integer> map) {
                InterfaceC212356188k interfaceC212356188k = this.LIZ.LIZLLL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LJ(list, map);
                }
            }
        };
    }

    public void LJFF(C21356918hz c21356918hz, List list, Map map) {
        int i;
        View viewLIZ = LIZ();
        if (viewLIZ != null) {
            int size = map.size();
            C1624230sMv c1624230sMv = this.LJIIZILJ;
            if (c1624230sMv != null) {
                i = c1624230sMv.LIZJ;
            } else {
                i = 0;
            }
            if (size >= i) {
                C786410Ut5.T4(viewLIZ, 1.0f);
            } else {
                C786410Ut5.T4(viewLIZ, 0.4f);
            }
            InterfaceC21358118iB interfaceC21358118iB = this.LIZJ;
            if (interfaceC21358118iB != null) {
                interfaceC21358118iB.LJIIJ(c21356918hz.LIZ, c21356918hz.LIZLLL, "media_tray");
            }
            InterfaceC212356188k interfaceC212356188k = this.LIZLLL;
            if (interfaceC212356188k != null) {
                interfaceC212356188k.LJ(list, map);
            }
        }
    }
}
