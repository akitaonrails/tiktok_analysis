package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18hQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21353418hQ {
    public final C1568780qvU LIZ;
    public final C1488750oqP LIZIZ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIIZILJ;
    public InterfaceC1482530ogN LJIJ;
    public C09AE LJIJI;
    public AnonymousClass0956 LJIJJ;
    public FrameLayout LJIJJLI;
    public ViewOnLayoutChangeListenerC21354418ha LJIL;
    public final long LIZJ = System.currentTimeMillis();
    public EnumC1569640qws LIZLLL = EnumC1569640qws.LOADING;
    public AbstractC1572300r1A LJ = C1572310r1B.LIZ;
    public int LJIIJJI = -1;
    public long LJIIL = -1;
    public int LJIILIIL = -1;
    public long LJIILLIIL = -1;
    public final Set<Function1<AbstractC1572300r1A, Unit>> LJJ = new LinkedHashSet();

    public final void LIZ() {
        ViewOnLayoutChangeListenerC21354418ha viewOnLayoutChangeListenerC21354418ha = this.LJIL;
        if (viewOnLayoutChangeListenerC21354418ha != null) {
            FrameLayout frameLayout = this.LJIJJLI;
            if (frameLayout != null) {
                frameLayout.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC21354418ha);
            }
            this.LJIL = null;
        }
    }

    public final int LIZIZ() {
        int i = this.LJIILIIL;
        if (i >= 0) {
            return i;
        }
        Long lValueOf = Long.valueOf(this.LJIIL);
        if (lValueOf.longValue() <= 0) {
            return -1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - lValueOf.longValue();
        return (int) (jCurrentTimeMillis >= 0 ? jCurrentTimeMillis : 0L);
    }

    public final void LIZLLL() {
        Iterator it2 = C13LP.LLIIII(this.LJJ).iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(this.LJ);
        }
    }

    public final void LIZJ() {
        ViewGroup viewGroup;
        LIZ();
        FrameLayout frameLayout = this.LJIJJLI;
        if (frameLayout == null) {
            return;
        }
        if (this.LIZIZ.getParent() == frameLayout) {
            C786410Ut5.LJJJZ(this.LIZIZ, frameLayout);
        }
        ViewParent parent = frameLayout.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C786410Ut5.LJJJLZIJ(frameLayout, viewGroup);
        }
        this.LJIJJLI = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void LJ(String str) {
        int i = 1;
        switch (str.hashCode()) {
            case -1825190442:
                if (str.equals("pre_render_ready")) {
                    this.LIZLLL = EnumC1569640qws.NORMAL;
                    this.LJIIJ = true;
                    this.LJIILL = 2;
                }
                break;
            case -1279552451:
                if (str.equals("prepared")) {
                    this.LIZLLL = EnumC1569640qws.NORMAL;
                    this.LJIILJJIL = 2;
                    this.LJIILL = 2;
                }
                break;
            case -934426579:
                if (str.equals("resume")) {
                    this.LJIILJJIL = 1;
                }
                break;
            case -702473442:
                if (str.equals("first_frame")) {
                    this.LIZLLL = EnumC1569640qws.NORMAL;
                    this.LJIIIZ = true;
                    boolean z = this.LJII;
                    if (!z) {
                        i = 2;
                    }
                    this.LJIILJJIL = i;
                    this.LJIILL = 2;
                    if (!z) {
                        this.LIZIZ.LJ();
                    }
                }
                break;
            case -231564456:
                if (str.equals("loading_end")) {
                    this.LJIILL = 2;
                }
                break;
            case 3443508:
                if (str.equals("play")) {
                    if (!this.LJII) {
                        i = 2;
                    }
                    this.LJIILJJIL = i;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    this.LIZLLL = EnumC1569640qws.INVALID;
                    this.LJIILJJIL = 3;
                }
                break;
            case 96651962:
                if (str.equals("ended")) {
                    this.LJIILJJIL = 4;
                }
                break;
            case 106440182:
                if (str.equals("pause")) {
                    this.LJIILJJIL = 2;
                }
                break;
            case 817965983:
                if (str.equals("loading_start")) {
                    this.LJIILL = 1;
                }
                break;
        }
    }

    public C21353418hQ(C1568780qvU c1568780qvU, C1488750oqP c1488750oqP) {
        this.LIZ = c1568780qvU;
        this.LIZIZ = c1488750oqP;
    }
}
