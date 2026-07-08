package X;

import Y.ARunnableS104S0100000_4;
import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.tako.experiment.TakoChatStreamTypeConfigExperiment;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C339070DQz {
    public static final /* synthetic */ int LJIJJ = 0;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public ARunnableS104S0100000_4 LJI;
    public C688690Qzr LJII;
    public C21419418s4 LJIIIIZZ;
    public C0DR0 LJIIIZ;
    public C1263404wy LJIIJ;
    public int LJIIL;
    public InterfaceC342000Daw LJIILIIL;
    public int LJIILJJIL;
    public C21419418s4 LJIILL;
    public String LJIILLIIL;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public String LIZIZ = "";
    public String LIZJ = "";
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(5589));
    public final C339060DQy LJIIZILJ = new C603820NmG<String, InterfaceC342000Daw>() { // from class: X.0DQy
        @Override // X.C603820NmG
        public final /* bridge */ /* synthetic */ int LJII(String str, InterfaceC342000Daw interfaceC342000Daw) {
            return 1;
        }
    };
    public final Map<String, InterfaceC342000Daw> LJIJ = new ConcurrentHashMap();
    public final ARunnableS104S0100000_4 LJIJI = new ARunnableS104S0100000_4(this, 148);

    public static void LIZIZ(C339070DQz c339070DQz) {
        long j = TakoChatStreamTypeConfigExperiment.LIZ().intervalTime;
        if (j < 16) {
            j = 16;
        }
        ARunnableS104S0100000_4 aRunnableS104S0100000_4 = c339070DQz.LJIJI;
        c339070DQz.LJI = aRunnableS104S0100000_4;
        if (aRunnableS104S0100000_4 != null) {
            C786410Ut5.LJLIIL(j, c339070DQz.LIZ, aRunnableS104S0100000_4);
        }
    }

    public final InterfaceC342000Daw LIZ(C688690Qzr c688690Qzr, C21419418s4 c21419418s4, String str) {
        String strLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c21419418s4.hashCode());
        sbLIZ.append('#');
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC342000Daw interfaceC342000Daw = (InterfaceC342000Daw) ((ConcurrentHashMap) this.LJIJ).remove(strLIZIZ);
        if (interfaceC342000Daw != null) {
            return interfaceC342000Daw;
        }
        InterfaceC342000Daw interfaceC342000DawLIZJ = LIZJ(strLIZIZ);
        if (interfaceC342000DawLIZJ != null) {
            return interfaceC342000DawLIZJ;
        }
        if (this.LJIILIIL != null && this.LJIILJJIL == str.length() && Intrinsics.LJFF(this.LJIILL, c21419418s4) && Intrinsics.LJFF(this.LJIILLIIL, str)) {
            return this.LJIILIIL;
        }
        if (!c21419418s4.LJJIJIL || (strLIZ = C1529010ptL.LIZ(str)) == null) {
            strLIZ = str;
        }
        InterfaceC328690CuZ.LIZ.getClass();
        InterfaceC328690CuZ interfaceC328690CuZLIZ = C330610Cxf.LIZ();
        C1860140yVQ c1860140yVQLIZIZ = null;
        if (interfaceC328690CuZLIZ != null && (c1860140yVQLIZIZ = interfaceC328690CuZLIZ.LIZIZ(c688690Qzr, strLIZ, c21419418s4, null)) != null) {
            this.LJIILIIL = c1860140yVQLIZIZ;
            this.LJIILJJIL = str.length();
            this.LJIILL = c21419418s4;
            this.LJIILLIIL = str;
            LIZLLL(strLIZIZ, c1860140yVQLIZIZ);
        }
        return c1860140yVQLIZIZ;
    }

    public final void LIZLLL(C688690Qzr c688690Qzr, C21419418s4 c21419418s4, C0DR0 c0dr0) {
        this.LJII = c688690Qzr;
        this.LJIIIIZZ = c21419418s4;
        this.LJIIIZ = c0dr0;
        this.LJ = true;
        ARunnableS104S0100000_4 aRunnableS104S0100000_4 = this.LJIJI;
        this.LJI = aRunnableS104S0100000_4;
        if (aRunnableS104S0100000_4 != null) {
            C786410Ut5.LJLIIL(TakoChatStreamTypeConfigExperiment.LIZ().intervalTime, this.LIZ, aRunnableS104S0100000_4);
        }
    }

    public static void LIZJ(final C688690Qzr c688690Qzr, InterfaceC342000Daw interfaceC342000Daw, final InterfaceC328600CuQ interfaceC328600CuQ, InterfaceC328600CuQ interfaceC328600CuQ2, C0R20 c0r20, final InterfaceC328580CuO interfaceC328580CuO, C0GV2 c0gv2, C0GV3 c0gv3) {
        interfaceC342000Daw.LIZIZ(c688690Qzr, new InterfaceC328600CuQ() { // from class: X.0DM4
            @Override // X.InterfaceC328600CuQ
            public final void LIZ(View view, InterfaceC431020GvE interfaceC431020GvE, CharSequence charSequence, CharSequence charSequence2) {
                c688690Qzr.LLJJIJIIJIL = true;
                InterfaceC328600CuQ interfaceC328600CuQ3 = interfaceC328600CuQ;
                if (interfaceC328600CuQ3 != null) {
                    interfaceC328600CuQ3.LIZ(view, interfaceC431020GvE, charSequence, null);
                }
            }

            @Override // X.InterfaceC328600CuQ
            public final void LIZIZ(View view, InterfaceC431020GvE interfaceC431020GvE, List<? extends CharSequence> list, Map<String, ? extends Object> map) {
                c688690Qzr.LLJJIJIIJIL = true;
                InterfaceC328600CuQ interfaceC328600CuQ3 = interfaceC328600CuQ;
                if (interfaceC328600CuQ3 != null) {
                    interfaceC328600CuQ3.LIZIZ(view, interfaceC431020GvE, list, map);
                }
            }
        });
        interfaceC342000Daw.LJ(interfaceC328600CuQ2, c0r20);
        interfaceC342000Daw.LJII(c688690Qzr, new InterfaceC328580CuO() { // from class: X.0DM5
            @Override // X.InterfaceC328580CuO
            public final void LIZ(InterfaceC342000Daw interfaceC342000Daw2, View view, C1860910yWf c1860910yWf) {
                c688690Qzr.LLJJIJIIJIL = true;
                InterfaceC328580CuO interfaceC328580CuO2 = interfaceC328580CuO;
                if (interfaceC328580CuO2 != null) {
                    interfaceC328580CuO2.LIZ(interfaceC342000Daw2, view, c1860910yWf);
                }
            }
        });
        interfaceC342000Daw.LIZ(c0gv2);
        interfaceC342000Daw.LIZJ(c0gv3);
        c688690Qzr.LJJJJJ(interfaceC342000Daw, null);
    }
}
