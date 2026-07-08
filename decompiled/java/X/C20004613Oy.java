package X;

import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.13Oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20004613Oy implements InterfaceC20004513Ox {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final long LIZLLL;
    public final C13SP LJ;
    public final boolean LJFF;
    public final Pair<Boolean, C13SO> LJI;
    public final String LJII;
    public final C01GW LJIIIIZZ;

    public final InterfaceC20004513Ox LJIIZILJ() {
        return (InterfaceC20004513Ox) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC20004513Ox
    public final Set<String> LIZJ() {
        return LJIIZILJ().LIZJ();
    }

    @Override // X.InterfaceC20004513Ox
    public final Pair<Long, Long> LJIILLIIL() {
        return LJIIZILJ().LJIILLIIL();
    }

    @Override // X.InterfaceC20004513Ox
    public void clear() {
        LJIIZILJ().clear();
    }

    @Override // X.InterfaceC20004513Ox
    public final void LIZ(long j) {
        LJIIZILJ().LIZ(j);
    }

    @Override // X.InterfaceC20004513Ox
    public final Pair<Integer, Long> LIZIZ(long j) {
        return LJIIZILJ().LIZIZ(j);
    }

    @Override // X.InterfaceC20004513Ox
    public final void LJ(InterfaceC20004913Pb interfaceC20004913Pb) {
        LJIIZILJ().LJ(interfaceC20004913Pb);
    }

    @Override // X.InterfaceC20004513Ox
    public final String LJFF(String str) {
        return LJIIZILJ().LJFF(str);
    }

    @Override // X.InterfaceC20004513Ox
    public String LJIIJJI(String str) {
        return LJIIZILJ().LJIIJJI(str);
    }

    @Override // X.InterfaceC20004513Ox
    public void LJIIL(List<String> list) {
        LJIIZILJ().LJIIL(list);
    }

    @Override // X.InterfaceC20004513Ox
    public final C20008813Qo LJIILIIL(String str) {
        return LJIIZILJ().LJIILIIL(str);
    }

    @Override // X.InterfaceC20004513Ox
    public final boolean LJIILJJIL(String str) {
        return LJIIZILJ().LJIILJJIL(str);
    }

    @Override // X.InterfaceC20004513Ox
    public final void LJIILL(String str) {
        LJIIZILJ().LJIILL(str);
    }

    @Override // X.InterfaceC20004513Ox
    public final boolean remove(String str) {
        return LJIIZILJ().remove(str);
    }

    @Override // X.InterfaceC20004513Ox
    public void LIZLLL(String str, String str2) {
        LJIIZILJ().LIZLLL(str, str2);
    }

    @Override // X.InterfaceC20004513Ox
    public final void LJI(String str, String str2) {
        LJIIZILJ().LJI(str, str2);
    }

    @Override // X.InterfaceC20004513Ox
    public final long LJII(String str, C20008713Qn c20008713Qn, String str2) {
        return LJIIZILJ().LJII(str, c20008713Qn, str2);
    }

    @Override // X.InterfaceC20004513Ox
    public final long LJIIJ(String str, String str2, String str3) {
        return LJIIZILJ().LJIIJ(str, str2, str3);
    }

    @Override // X.InterfaceC20004513Ox
    public final Pair LJIIIIZZ(String str, C20008713Qn c20008713Qn, String str2, long j, String str3, Function2 function2) {
        return LJIIZILJ().LJIIIIZZ(str, c20008713Qn, str2, j, str3, function2);
    }

    @Override // X.InterfaceC20004513Ox
    public final Pair<String, Boolean> LJIIIZ(String str, C20008813Qo c20008813Qo, String str2, long j, String str3, Function2<? super Integer, ? super Long, Unit> function2) {
        return LJIIZILJ().LJIIIZ(str, c20008813Qo, str2, j, str3, function2);
    }

    public C20004613Oy(String str, int i, long j, C13SP c13sp, boolean z, Pair pair, String str2, int i2) {
        int i3;
        i = (i2 & 2) != 0 ? 0 : i;
        if ((i2 & 4) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c13sp = (i2 & 16) != 0 ? null : c13sp;
        z = (i2 & 32) != 0 ? false : z;
        pair = (i2 & 64) != 0 ? null : pair;
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i3;
        this.LIZLLL = j;
        this.LJ = c13sp;
        this.LJFF = z;
        this.LJI = pair;
        this.LJII = str2;
        this.LJIIIIZZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 297));
    }
}
