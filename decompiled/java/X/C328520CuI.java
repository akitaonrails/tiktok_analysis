package X;

import Y.ARunnableS104S0100000_4;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C328520CuI {
    public static final /* synthetic */ int LJIL = 0;
    public Message LIZIZ;
    public Map<String, Object> LIZJ;
    public int LJFF;
    public boolean LJI;
    public ARunnableS104S0100000_4 LJII;
    public C328660CuW LJIIIIZZ;
    public C21419418s4 LJIIIZ;
    public C328490CuF LJIIJ;
    public final C01GW LJIIJJI;
    public Long LJIIL;
    public Integer LJIILIIL;
    public int LJIILJJIL;
    public InterfaceC342000Daw LJIILL;
    public int LJIILLIIL;
    public C21419418s4 LJIIZILJ;
    public String LJIJ;
    public final C328530CuJ LJIJI;
    public final Map<String, InterfaceC342000Daw> LJIJJ;
    public final ARunnableS104S0100000_4 LJIJJLI;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public String LIZLLL = "";
    public String LJ = "";

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0CuJ] */
    public C328520CuI() {
        new ConcurrentHashMap();
        this.LJIIJJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5953));
        this.LJIJI = new C603820NmG<String, InterfaceC342000Daw>() { // from class: X.0CuJ
            @Override // X.C603820NmG
            public final /* bridge */ /* synthetic */ int LJII(String str, InterfaceC342000Daw interfaceC342000Daw) {
                return 1;
            }
        };
        this.LJIJJ = new ConcurrentHashMap();
        this.LJIJJLI = new ARunnableS104S0100000_4(this, 153);
    }

    public static void LIZJ(C328520CuI c328520CuI) {
        ARunnableS104S0100000_4 aRunnableS104S0100000_4 = c328520CuI.LJIJJLI;
        c328520CuI.LJII = aRunnableS104S0100000_4;
        if (aRunnableS104S0100000_4 != null) {
            C786410Ut5.LJLIIL(100L, c328520CuI.LIZ, aRunnableS104S0100000_4);
        }
    }

    public final void LIZIZ(C328660CuW c328660CuW) {
        this.LIZLLL = "";
        LJ(0);
        this.LJIILJJIL = 0;
        c328660CuW.setText("");
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJIIJ = null;
        this.LJIILL = null;
        this.LJIILLIIL = 0;
        this.LJIIZILJ = null;
        this.LJIJ = null;
    }

    public final void LJ(int i) {
        String str;
        Message message = this.LIZIZ;
        if (message != null) {
            str = message.uuid;
        } else {
            str = null;
        }
        C321220CiW c321220CiWLIZ = C321740CjM.LIZ(str);
        if (c321220CiWLIZ != null) {
            C321220CiW c321220CiWLIZ2 = C321220CiW.LIZ(c321220CiWLIZ, false, false, i, 0, 23);
            if (str != null) {
                C321740CjM.LIZ.LIZLLL(str, c321220CiWLIZ2);
            }
        }
        this.LJFF = i;
    }

    public final void LJFF(String str) {
        String str2;
        Message message = this.LIZIZ;
        if (message != null) {
            str2 = message.uuid;
        } else {
            str2 = null;
        }
        int length = str.length();
        C321220CiW c321220CiWLIZ = C321740CjM.LIZ(str2);
        if (c321220CiWLIZ != null) {
            C321220CiW c321220CiWLIZ2 = C321220CiW.LIZ(c321220CiWLIZ, false, false, 0, length, 15);
            if (str2 != null) {
                C321740CjM.LIZ.LIZLLL(str2, c321220CiWLIZ2);
            }
        }
        this.LJ = str;
    }

    public final InterfaceC342000Daw LIZ(C328660CuW c328660CuW, C21419418s4 c21419418s4, String str) {
        C1860140yVQ c1860140yVQLIZIZ = null;
        if (c328660CuW == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c21419418s4.hashCode());
        sbLIZ.append('#');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC342000Daw interfaceC342000Daw = (InterfaceC342000Daw) ((ConcurrentHashMap) this.LJIJJ).remove(strLIZIZ);
        if (interfaceC342000Daw != null) {
            return interfaceC342000Daw;
        }
        InterfaceC342000Daw interfaceC342000DawLIZJ = LIZJ(strLIZIZ);
        if (interfaceC342000DawLIZJ != null) {
            return interfaceC342000DawLIZJ;
        }
        if (this.LJIILL != null && this.LJIILLIIL == str.length() && Intrinsics.LJFF(this.LJIIZILJ, c21419418s4) && Intrinsics.LJFF(this.LJIJ, str)) {
            return this.LJIILL;
        }
        InterfaceC328690CuZ.LIZ.getClass();
        InterfaceC328690CuZ interfaceC328690CuZLIZ = C330610Cxf.LIZ();
        if (interfaceC328690CuZLIZ != null && (c1860140yVQLIZIZ = interfaceC328690CuZLIZ.LIZIZ(c328660CuW, str, c21419418s4, null)) != null) {
            this.LJIILL = c1860140yVQLIZIZ;
            this.LJIILLIIL = str.length();
            this.LJIIZILJ = c21419418s4;
            this.LJIJ = str;
            LIZLLL(strLIZIZ, c1860140yVQLIZIZ);
        }
        return c1860140yVQLIZIZ;
    }

    public final void LJI(C328660CuW c328660CuW, C21419418s4 c21419418s4, C328490CuF c328490CuF) {
        this.LJIIIIZZ = c328660CuW;
        this.LJIIIZ = c21419418s4;
        this.LJIIJ = c328490CuF;
        this.LJI = true;
        ARunnableS104S0100000_4 aRunnableS104S0100000_4 = this.LJIJJLI;
        this.LJII = aRunnableS104S0100000_4;
        if (aRunnableS104S0100000_4 != null) {
            C786410Ut5.LJLIIL(100L, this.LIZ, aRunnableS104S0100000_4);
        }
    }

    public static void LIZLLL(final C328660CuW c328660CuW, InterfaceC342000Daw interfaceC342000Daw, final InterfaceC328600CuQ interfaceC328600CuQ, InterfaceC328600CuQ interfaceC328600CuQ2, C0R20 c0r20, final InterfaceC328580CuO interfaceC328580CuO, C0GV2 c0gv2, C0GV3 c0gv3) {
        interfaceC342000Daw.LIZIZ(c328660CuW, new InterfaceC328600CuQ() { // from class: X.0CuP
            @Override // X.InterfaceC328600CuQ
            public final void LIZ(View view, InterfaceC431020GvE interfaceC431020GvE, CharSequence charSequence, CharSequence charSequence2) {
                c328660CuW.LLJJIJIIJIL = true;
                InterfaceC328600CuQ interfaceC328600CuQ3 = interfaceC328600CuQ;
                if (interfaceC328600CuQ3 != null) {
                    interfaceC328600CuQ3.LIZ(view, interfaceC431020GvE, charSequence, null);
                }
            }

            @Override // X.InterfaceC328600CuQ
            public final void LIZIZ(View view, InterfaceC431020GvE interfaceC431020GvE, List<? extends CharSequence> list, Map<String, ? extends Object> map) {
                c328660CuW.LLJJIJIIJIL = true;
                InterfaceC328600CuQ interfaceC328600CuQ3 = interfaceC328600CuQ;
                if (interfaceC328600CuQ3 != null) {
                    interfaceC328600CuQ3.LIZIZ(view, interfaceC431020GvE, list, map);
                }
            }
        });
        interfaceC342000Daw.LJ(interfaceC328600CuQ2, c0r20);
        interfaceC342000Daw.LJII(c328660CuW, new InterfaceC328580CuO() { // from class: X.0CuN
            @Override // X.InterfaceC328580CuO
            public final void LIZ(InterfaceC342000Daw interfaceC342000Daw2, View view, C1860910yWf c1860910yWf) {
                c328660CuW.LLJJIJIIJIL = true;
                InterfaceC328580CuO interfaceC328580CuO2 = interfaceC328580CuO;
                if (interfaceC328580CuO2 != null) {
                    interfaceC328580CuO2.LIZ(interfaceC342000Daw2, view, c1860910yWf);
                }
            }
        });
        interfaceC342000Daw.LIZ(c0gv2);
        interfaceC342000Daw.LIZJ(c0gv3);
        c328660CuW.LJJJJJ(interfaceC342000Daw, null);
    }
}
