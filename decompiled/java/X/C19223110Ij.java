package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.10Ij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19223110Ij {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public boolean LJ;
    public Function2<? super C127K, ? super Boolean, Unit> LJFF;
    public CharSequence LJI;
    public C09AY LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public C09AY LJIIJ;
    public Pair<Class<Object>, Class<Object>> LJIIJJI;
    public Pair<? extends C1664690tQB<Object>, ? extends Object> LJIIL;
    public InterfaceC1738600vLO LJIILIIL;
    public InterfaceC19223310Il LJIILJJIL;
    public String LJIILL;
    public Integer LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;

    public C19223110Ij() {
        this(0, null, 63);
    }

    public /* synthetic */ C19223110Ij(int i, String str, int i2) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) == 0 ? null : "", (i2 & 8) == 0 ? 0 : -1, false, null);
    }

    public C19223110Ij(int i, String str, String str2, int i2, boolean z, Function2<? super C127K, ? super Boolean, Unit> function2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i2;
        this.LJ = z;
        this.LJFF = function2;
        this.LJIIIIZZ = true;
        this.LJIIIZ = true;
        this.LJIILIIL = new InterfaceC1738600vLO() { // from class: X.10In
            @Override // X.InterfaceC1738600vLO
            public final String getKey() {
                return "dummy";
            }
        };
        this.LJIILJJIL = C19223210Ik.LIZ;
        this.LJIILL = "";
    }
}
