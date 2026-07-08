package X;

import com.lynx.tasm.LynxBackgroundRuntime;
import com.lynx.tasm.LynxView;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543190qGD {
    public static final /* synthetic */ int LJIJI = 0;
    public C1543410qGZ LIZ;
    public C1543200qGE LIZIZ;
    public InterfaceC1544190qHp LJ;
    public LynxView LJFF;
    public LynxBackgroundRuntime LJI;
    public InterfaceC1543690qH1 LJII;
    public C1543110qG5 LJIIIIZZ;
    public C1543390qGX LJIILIIL;
    public volatile boolean LJIILL;
    public C1165930gRj LJIILLIIL;
    public boolean LJIIZILJ;
    public final C1543180qGC LIZJ = new C1543180qGC();
    public final C1543830qHF LIZLLL = new C1543830qHF();
    public String LJIIIZ = "";
    public final List<AbstractC1543580qGq> LJIIJ = new ArrayList();
    public final Set<InterfaceC1522340pia> LJIIJJI = new LinkedHashSet();
    public final C1543420qGa LJIIL = new C1543420qGa();
    public EnumC1063300dmC LJIILJJIL = EnumC1063300dmC.ALL;
    public final C1543930qHP LJIJ = new C1543930qHP();

    public final String LIZ() {
        C1543390qGX c1543390qGX = this.LJIILIIL;
        if (c1543390qGX != null) {
            return c1543390qGX.LIZ;
        }
        return null;
    }

    public final void LIZIZ(AbstractC1543580qGq abstractC1543580qGq) {
        ((ArrayList) this.LJIIJ).add(abstractC1543580qGq);
    }

    public final boolean LIZJ(C1543910qHN c1543910qHN) {
        C1543390qGX c1543390qGX;
        if (this.LJIILIIL == null) {
            return false;
        }
        if ((!Intrinsics.LJFF(c1543910qHN.LJIIJ, LIZ()) && c1543910qHN.LJIIJ.length() != 0) || (c1543390qGX = this.LJIILIIL) == null || c1543390qGX.LIZIZ(this, c1543910qHN.LJFF) == null) {
            return false;
        }
        return true;
    }
}
