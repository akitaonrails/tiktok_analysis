package X;

import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ifB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251150ifB extends AbstractC1250290idn {
    public C419910GdJ LJ;
    public Function1<? super TuxIconView, Unit> LJFF;
    public Integer LJII;
    public CharSequence LJIIIIZZ;
    public int LIZJ = -1;
    public boolean LIZLLL = true;
    public boolean LJI = true;

    public final void LIZLLL() {
        this.LIZJ = -1;
        this.LJ = null;
        this.LJFF = null;
    }

    public final void LIZ(int i) {
        LIZLLL();
        this.LIZJ = i;
    }

    public final void LIZIZ(C419910GdJ c419910GdJ) {
        LIZLLL();
        this.LJ = c419910GdJ;
    }

    public final void LIZJ(final Function0 function0) {
        this.LIZ = new InterfaceC197023126r() { // from class: X.0ifC
            @Override // X.InterfaceC197023126r
            public final void LIZ() {
                function0.invoke();
            }
        };
    }
}
