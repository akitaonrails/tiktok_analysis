package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AwS38S0010000_26;

/* JADX INFO: renamed from: X.0vu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1760060vu0 implements InterfaceC1760150vu9<C1759970vtr> {
    public final C1757400vpi LIZIZ;
    public final C1760040vty LIZJ;
    public final ViewGroup LIZLLL;
    public final C1759970vtr LJ;
    public final String LJFF = UUID.randomUUID().toString();
    public volatile boolean LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public volatile boolean LJIIIZ;

    public final void LIZJ() {
        this.LJII = true;
        LJ();
        C03DZ.LIZ(this.LIZLLL);
        C786410Ut5.LJJJJI(this.LIZLLL);
        C1755820vnA c1755820vnA = this.LIZIZ.LJ.get();
        if (c1755820vnA != null) {
            c1755820vnA.LJ = false;
            C1755680vmw c1755680vmw = c1755820vnA.LIZ;
            boolean z = c1755820vnA.LIZJ && !c1755820vnA.LIZLLL;
            c1755680vmw.getClass();
            c1755680vmw.LIZ(new AwS38S0010000_26(z, 12));
        }
    }

    public abstract void LIZLLL();

    public abstract View LJ();

    public abstract View LJFF(Context context, InterfaceC1760220vuG interfaceC1760220vuG);

    @Override // X.InterfaceC1760150vu9
    public final /* bridge */ /* synthetic */ C1759970vtr LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1760150vu9
    public final String LJJJ() {
        return this.LJFF;
    }

    public final void LIZIZ(String str, InterfaceC1760140vu8<C1759970vtr> interfaceC1760140vu8) {
        C1741570vQB c1741570vQBLIZIZ;
        if (interfaceC1760140vu8 != null) {
            c1741570vQBLIZIZ = interfaceC1760140vu8.LIZIZ(this.LJ, this.LJFF, new LinkedHashMap());
        } else {
            c1741570vQBLIZIZ = null;
        }
        if (this.LJIIIIZZ) {
            if (c1741570vQBLIZIZ != null) {
                ((C1760090vu3) interfaceC1760140vu8).LIZ(c1741570vQBLIZIZ, false, "has destroyed");
                return;
            }
            return;
        }
        this.LJIIIIZZ = true;
        if (!this.LJII) {
            LIZJ();
        }
        LIZLLL();
        if (!this.LJIIIZ) {
            LJI(this, "dismiss_unfinish", false, str, null, 8);
        }
        if (c1741570vQBLIZIZ != null) {
            interfaceC1760140vu8.LIZ(c1741570vQBLIZIZ, true, null);
        }
    }

    public AbstractC1760060vu0(C1757400vpi c1757400vpi, C1760040vty c1760040vty, ViewGroup viewGroup, C1759970vtr c1759970vtr) {
        this.LIZIZ = c1757400vpi;
        this.LIZJ = c1760040vty;
        this.LIZLLL = viewGroup;
        this.LJ = c1759970vtr;
    }

    public static void LJI(AbstractC1760060vu0 abstractC1760060vu0, String str, boolean z, String str2, Map map, int i) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        abstractC1760060vu0.LJIIIZ = true;
        C1741570vQB c1741570vQB = abstractC1760060vu0.LJ.LJI;
        if (c1741570vQB != null) {
            c1741570vQB.LIZ(str, str2, map, z);
        }
        abstractC1760060vu0.LJ.LJI = null;
    }
}
