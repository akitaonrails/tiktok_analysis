package X;

import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.jvm.internal.AwS111S0110000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t47, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1651010t47 {
    public InterfaceC1650230t2r LIZIZ;
    public InterfaceC1648570t0B LIZJ;
    public InterfaceC1621970sJH LIZLLL;
    public ShortVideoContext LJ;
    public boolean LJFF;
    public SafeHandler LJI;
    public List<? extends CharSequence> LJIIIIZZ;
    public String LJIIIZ;
    public final C1650990t45 LIZ = new C1650990t45();
    public final C01GW LJII = C452501pT.LIZIZ(new AwS569S0100000_25(this, 470));

    public static void LIZIZ(C1DRG c1drg, List list, List list2) {
        if (C343070Dcf.LIZ()) {
            ((C0ETY) c1drg.LJII(C0ETY.class, null)).Sd(InterfaceC1651080t4E.class, new AwS391S0200000_25(list, list2, 157));
            return;
        }
        C05YF c05yf = (C05YF) c1drg.LJIIL(null, InterfaceC1651080t4E.class);
        if (c05yf == null) {
            return;
        }
        InterfaceC1651080t4E interfaceC1651080t4E = (InterfaceC1651080t4E) c05yf;
        interfaceC1651080t4E.XI0().LLLZ(list);
        interfaceC1651080t4E.XI0().Cl(list2);
        interfaceC1651080t4E.XI0().notifyDataSetChanged();
    }

    public static void LIZLLL(C1DRG c1drg, C1650980t44 c1650980t44, boolean z) {
        if (C343070Dcf.LIZ()) {
            ((C0ETY) c1drg.LJII(C0ETY.class, null)).Sd(InterfaceC1651080t4E.class, new AwS111S0110000_25(c1650980t44, z, 11));
            return;
        }
        C05YF c05yf = (C05YF) c1drg.LJIIL(null, InterfaceC1651080t4E.class);
        if (c05yf == null) {
            return;
        }
        ((InterfaceC1651080t4E) c05yf).XI0().LIZ(c1650980t44, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1651720t5G LIZ(X.C19A3 r22, X.C1DRG r23, X.InterfaceC1651020t48 r24) {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1651010t47.LIZ(X.19A3, X.1DRG, X.0t48):X.0t5G");
    }

    public final void LIZJ(C1DRG c1drg, C1650560t3O c1650560t3O, boolean z) {
        if (C1651000t46.LIZ(this.LIZ)) {
            C1650980t44 c1650980t44LJIIIIZZ = c1650560t3O.LJIIIIZZ();
            if (z) {
                c1650980t44LJIIIIZZ.LLILLL = C577500Mku.LIZJ(1);
                c1650980t44LJIIIIZZ.LLJJJ = c1650560t3O.LIZ(2131824459);
            } else {
                c1650980t44LJIIIIZZ.LLILLL = C577500Mku.LIZJ(0);
                c1650980t44LJIIIIZZ.LLJJJ = c1650560t3O.LIZ(2131824458);
            }
            LIZLLL(c1drg, c1650980t44LJIIIIZZ, true);
        }
    }
}
