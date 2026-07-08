package X;

import android.os.Looper;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.experiment.TakoChatStreamTypeConfigExperiment;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yUF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1859410yUF {
    public static final /* synthetic */ int LJJIFFI = 0;
    public Message LIZIZ;
    public Map<String, TakoPlaceholderSource> LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJII;
    public boolean LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public RunnableC1859420yUG LJIIJ;
    public C1859370yUB LJIIJJI;
    public C21419418s4 LJIIL;
    public C1859490yUN LJIILIIL;
    public final C01GW LJIILJJIL;
    public Long LJIILL;
    public Integer LJIILLIIL;
    public int LJIIZILJ;
    public InterfaceC342000Daw LJIJ;
    public int LJIJI;
    public C21419418s4 LJIJJ;
    public String LJIJJLI;
    public final C339050DQx LJIL;
    public final Map<String, InterfaceC342000Daw> LJJ;
    public final RunnableC1859420yUG LJJI;
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public String LJFF = "";
    public String LJI = "";

    public final void LIZIZ() {
        C1859370yUB c1859370yUB;
        C21419418s4 c21419418s4;
        C1859490yUN c1859490yUN;
        String str;
        Function2<String, Integer, Unit> function2;
        if (this.LJI.length() == 0 || (c1859370yUB = this.LJIIJJI) == null || (c21419418s4 = this.LJIIL) == null || (c1859490yUN = this.LJIILIIL) == null) {
            return;
        }
        RunnableC1859420yUG runnableC1859420yUG = this.LJIIJ;
        if (runnableC1859420yUG != null) {
            this.LIZ.removeCallbacks(runnableC1859420yUG);
        }
        InterfaceC342000Daw interfaceC342000DawLIZ = LIZ(c1859370yUB, c21419418s4, this.LJI);
        if (interfaceC342000DawLIZ == null) {
            return;
        }
        LJIIIZ(this.LJI.length());
        LJIIIIZZ(c1859370yUB, interfaceC342000DawLIZ, c1859490yUN.LIZ, c1859490yUN.LIZIZ, c1859490yUN.LIZJ, c1859490yUN.LIZLLL, c1859490yUN.LJ, c1859490yUN.LJFF);
        CharSequence text = c1859370yUB.getText();
        if (text != null) {
            text.length();
        }
        c1859370yUB.LJJJJL();
        Function0<Unit> function0 = c1859490yUN.LJIIIIZZ;
        if (function0 != null) {
            function0.invoke();
        }
        if (this.LIZLLL) {
            Message message = this.LIZIZ;
            C1785140wYS.LJIIIIZZ(this.LJ, message != null ? message.uuid : null, true);
        } else {
            Message message2 = this.LIZIZ;
            C1785140wYS.LJIIIZ(message2 != null ? message2.uuid : null, true);
        }
        Message message3 = this.LIZIZ;
        if (message3 == null || (str = message3.uuid) == null || str.length() <= 0 || (function2 = c1859490yUN.LJIIIZ) == null) {
            return;
        }
        function2.invoke(str, Integer.valueOf(this.LJ));
    }

    public final void LIZLLL() {
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        RunnableC1859420yUG runnableC1859420yUG = this.LJIIJ;
        if (runnableC1859420yUG != null) {
            this.LIZ.removeCallbacks(runnableC1859420yUG);
        }
    }

    public final void LJI() {
        if (this.LJIIIZ) {
            this.LJIIIZ = false;
            if (!this.LJIIIIZZ || this.LJIIJJI == null || this.LJIIL == null || this.LJIILIIL == null) {
                return;
            }
            BPEAHandler bPEAHandler = this.LIZ;
            RunnableC1859420yUG runnableC1859420yUG = this.LJJI;
            long j = TakoChatStreamTypeConfigExperiment.LIZ().intervalTime;
            if (j < 16) {
                j = 16;
            }
            C786410Ut5.LJLIIL(j, bPEAHandler, runnableC1859420yUG);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0DQx] */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0yUG] */
    public C1859410yUF() {
        new ConcurrentHashMap();
        this.LJIILJJIL = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(3632));
        final int i = ((Boolean) C1E7C.LJ.getValue()).booleanValue() ? 32 : 6;
        this.LJIL = new C603820NmG<String, InterfaceC342000Daw>(i) { // from class: X.0DQx
            @Override // X.C603820NmG
            public final /* bridge */ /* synthetic */ int LJII(String str, InterfaceC342000Daw interfaceC342000Daw) {
                return 1;
            }
        };
        this.LJJ = new ConcurrentHashMap();
        this.LJJI = new Runnable() { // from class: X.0yUG
            /* JADX WARN: Code restructure failed: missing block: B:417:0x05a3, code lost:
            
                if (r2 < 7936) goto L418;
             */
            /* JADX WARN: Removed duplicated region for block: B:100:0x018c A[PHI: r1
              0x018c: PHI (r1v18 int) = (r1v11 int), (r1v79 int) binds: [B:93:0x0179, B:99:0x018a] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:103:0x0191  */
            /* JADX WARN: Removed duplicated region for block: B:106:0x0196  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x019b  */
            /* JADX WARN: Removed duplicated region for block: B:112:0x01a0  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x01a9  */
            /* JADX WARN: Removed duplicated region for block: B:118:0x01ae  */
            /* JADX WARN: Removed duplicated region for block: B:121:0x01c1  */
            /* JADX WARN: Removed duplicated region for block: B:144:0x020a  */
            /* JADX WARN: Removed duplicated region for block: B:146:0x020d  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x0229  */
            /* JADX WARN: Removed duplicated region for block: B:254:0x0371  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
            /* JADX WARN: Removed duplicated region for block: B:333:0x049c  */
            /* JADX WARN: Removed duplicated region for block: B:381:0x054c  */
            /* JADX WARN: Removed duplicated region for block: B:384:0x055e  */
            /* JADX WARN: Removed duplicated region for block: B:395:0x0577  */
            /* JADX WARN: Removed duplicated region for block: B:399:0x057e  */
            /* JADX WARN: Removed duplicated region for block: B:418:0x05a5  */
            /* JADX WARN: Removed duplicated region for block: B:441:0x05d8  */
            /* JADX WARN: Removed duplicated region for block: B:455:0x05fa  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x00c8  */
            /* JADX WARN: Removed duplicated region for block: B:70:0x00df  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 2078
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1859420yUG.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("IncrementalTypewriterManager@8a9f.typeRunnableReusable$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("IncrementalTypewriterManager@8a9f.typeRunnableReusable$1");
            }
        };
    }

    public final boolean LIZJ() {
        if (!C07IH.LIZ()) {
            return false;
        }
        Message message = this.LIZIZ;
        C1785120wYQ c1785120wYQLIZIZ = C1785140wYS.LIZIZ(message != null ? message.uuid : null);
        return c1785120wYQLIZIZ != null && c1785120wYQLIZIZ.LJFF;
    }

    public static void LJII(C1859410yUF c1859410yUF) {
        long j = TakoChatStreamTypeConfigExperiment.LIZ().intervalTime;
        if (j < 16) {
            j = 16;
        }
        RunnableC1859420yUG runnableC1859420yUG = c1859410yUF.LJJI;
        c1859410yUF.LJIIJ = runnableC1859420yUG;
        if (runnableC1859420yUG != null) {
            C786410Ut5.LJLIIL(j, c1859410yUF.LIZ, runnableC1859420yUG);
        }
    }

    public final void LJFF(C1859370yUB c1859370yUB) {
        String str;
        int i;
        String str2;
        this.LJFF = "";
        if (this.LIZLLL) {
            Message message = this.LIZIZ;
            if (message != null) {
                str2 = message.uuid;
            } else {
                str2 = null;
            }
            C1785120wYQ c1785120wYQLIZIZ = C1785140wYS.LIZIZ(C1785140wYS.LIZ(this.LJ, str2));
            if (c1785120wYQLIZIZ != null) {
                i = c1785120wYQLIZIZ.LIZLLL;
                if (i <= 0) {
                }
            }
            i = 0;
        } else {
            Message message2 = this.LIZIZ;
            if (message2 != null) {
                str = message2.uuid;
            } else {
                str = null;
            }
            C1785120wYQ c1785120wYQLIZIZ2 = C1785140wYS.LIZIZ(str);
            if (c1785120wYQLIZIZ2 != null) {
                i = c1785120wYQLIZIZ2.LIZLLL;
                if (i <= 0) {
                }
            }
            i = 0;
        }
        LJIIIZ(i);
        this.LJIIZILJ = 0;
        if (C07IH.LIZ()) {
            this.LJIIIZ = false;
            RunnableC1859420yUG runnableC1859420yUG = this.LJIIJ;
            if (runnableC1859420yUG != null) {
                this.LIZ.removeCallbacks(runnableC1859420yUG);
            }
            this.LJIIJ = null;
            this.LJIIIIZZ = false;
            LJIIJ("");
        }
        c1859370yUB.setText("");
        this.LJIIJJI = null;
        this.LJIIL = null;
        this.LJIILIIL = null;
        this.LJIJ = null;
        this.LJIJI = 0;
        this.LJIJJ = null;
        this.LJIJJLI = null;
    }

    public final void LJIIIZ(int i) {
        String str = null;
        if (this.LIZLLL) {
            Message message = this.LIZIZ;
            if (message != null) {
                str = message.uuid;
            }
            String strLIZ = C1785140wYS.LIZ(this.LJ, str);
            C1785120wYQ c1785120wYQLIZIZ = C1785140wYS.LIZIZ(strLIZ);
            if (c1785120wYQLIZIZ != null) {
                C1785140wYS.LJIIJ(strLIZ, C1785120wYQ.LIZ(c1785120wYQLIZIZ, false, false, i, 0, false, 55));
            }
        } else {
            Message message2 = this.LIZIZ;
            if (message2 != null) {
                str = message2.uuid;
            }
            C1785120wYQ c1785120wYQLIZIZ2 = C1785140wYS.LIZIZ(str);
            if (c1785120wYQLIZIZ2 != null) {
                C1785140wYS.LJIIJ(str, C1785120wYQ.LIZ(c1785120wYQLIZIZ2, false, false, i, 0, false, 55));
            }
        }
        this.LJII = i;
    }

    public final void LJIIJ(String str) {
        String str2 = null;
        if (this.LIZLLL) {
            Message message = this.LIZIZ;
            if (message != null) {
                str2 = message.uuid;
            }
            int i = this.LJ;
            int length = str.length();
            String strLIZ = C1785140wYS.LIZ(i, str2);
            C1785120wYQ c1785120wYQLIZIZ = C1785140wYS.LIZIZ(strLIZ);
            if (c1785120wYQLIZIZ != null) {
                C1785140wYS.LJIIJ(strLIZ, C1785120wYQ.LIZ(c1785120wYQLIZIZ, false, false, 0, length, false, 47));
            }
        } else {
            Message message2 = this.LIZIZ;
            if (message2 != null) {
                str2 = message2.uuid;
            }
            int length2 = str.length();
            C1785120wYQ c1785120wYQLIZIZ2 = C1785140wYS.LIZIZ(str2);
            if (c1785120wYQLIZIZ2 != null) {
                C1785140wYS.LJIIJ(str2, C1785120wYQ.LIZ(c1785120wYQLIZIZ2, false, false, 0, length2, false, 47));
            }
        }
        this.LJI = str;
    }

    public final InterfaceC342000Daw LIZ(C1859370yUB c1859370yUB, C21419418s4 c21419418s4, String str) {
        String strLIZIZ;
        String strLIZIZ2;
        String strLIZIZ3;
        if (((Boolean) C1E7C.LJ.getValue()).booleanValue()) {
            Message message = this.LIZIZ;
            if (message == null || (strLIZIZ3 = message.uuid) == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("null@");
                sbLIZ.append(System.identityHashCode(this));
                strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZIZ3);
            sbLIZ2.append('#');
            sbLIZ2.append(c21419418s4.hashCode());
            sbLIZ2.append('#');
            sbLIZ2.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c21419418s4.hashCode());
            sbLIZ3.append('#');
            sbLIZ3.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        InterfaceC342000Daw interfaceC342000Daw = (InterfaceC342000Daw) ((ConcurrentHashMap) this.LJJ).remove(strLIZIZ);
        if (interfaceC342000Daw != null) {
            return interfaceC342000Daw;
        }
        InterfaceC342000Daw interfaceC342000DawLIZJ = LIZJ(strLIZIZ);
        if (interfaceC342000DawLIZJ != null) {
            return interfaceC342000DawLIZJ;
        }
        if (this.LJIJ != null && this.LJIJI == str.length() && Intrinsics.LJFF(this.LJIJJ, c21419418s4) && Intrinsics.LJFF(this.LJIJJLI, str)) {
            return this.LJIJ;
        }
        if (!c21419418s4.LJJIJIL || (strLIZIZ2 = C1859900yV2.LIZIZ.LIZIZ(str)) == null) {
            strLIZIZ2 = str;
        }
        InterfaceC328690CuZ.LIZ.getClass();
        InterfaceC328690CuZ interfaceC328690CuZLIZ = C330610Cxf.LIZ();
        C1860140yVQ c1860140yVQLIZIZ = null;
        if (interfaceC328690CuZLIZ != null && (c1860140yVQLIZIZ = interfaceC328690CuZLIZ.LIZIZ(c1859370yUB, strLIZIZ2, c21419418s4, null)) != null) {
            this.LJIJ = c1860140yVQLIZIZ;
            this.LJIJI = str.length();
            this.LJIJJ = c21419418s4;
            this.LJIJJLI = str;
            LIZLLL(strLIZIZ, c1860140yVQLIZIZ);
        }
        return c1860140yVQLIZIZ;
    }

    public final void LJIIJJI(C1859370yUB c1859370yUB, C21419418s4 c21419418s4, C1859490yUN c1859490yUN) {
        this.LJIIJJI = c1859370yUB;
        this.LJIIL = c21419418s4;
        this.LJIILIIL = c1859490yUN;
        this.LJIIIIZZ = true;
        if (!this.LJIIIZ && !LIZJ()) {
            RunnableC1859420yUG runnableC1859420yUG = this.LJJI;
            this.LJIIJ = runnableC1859420yUG;
            if (runnableC1859420yUG != null) {
                C786410Ut5.LJLIIL(TakoChatStreamTypeConfigExperiment.LIZ().intervalTime, this.LIZ, runnableC1859420yUG);
            }
        }
    }

    public final void LJ(C1859370yUB c1859370yUB, C21419418s4 c21419418s4, C1859490yUN c1859490yUN, int i) {
        String str = this.LJI;
        int length = str.length();
        if (i > length) {
            i = length;
        }
        InterfaceC342000Daw interfaceC342000DawLIZ = LIZ(c1859370yUB, c21419418s4, C13LN.LJZL(i, str));
        if (interfaceC342000DawLIZ == null) {
            return;
        }
        LJIIIIZZ(c1859370yUB, interfaceC342000DawLIZ, c1859490yUN.LIZ, c1859490yUN.LIZIZ, c1859490yUN.LIZJ, c1859490yUN.LIZLLL, c1859490yUN.LJ, c1859490yUN.LJFF);
        CharSequence text = c1859370yUB.getText();
        if (text != null) {
            text.length();
        }
    }

    public static void LJIIIIZZ(final C1859370yUB c1859370yUB, InterfaceC342000Daw interfaceC342000Daw, final InterfaceC328600CuQ interfaceC328600CuQ, InterfaceC328600CuQ interfaceC328600CuQ2, C0R20 c0r20, final InterfaceC328580CuO interfaceC328580CuO, C0GV2 c0gv2, C0GV3 c0gv3) {
        interfaceC342000Daw.LIZIZ(c1859370yUB, new InterfaceC328600CuQ() { // from class: X.0DM1
            @Override // X.InterfaceC328600CuQ
            public final void LIZ(View view, InterfaceC431020GvE interfaceC431020GvE, CharSequence charSequence, CharSequence charSequence2) {
                c1859370yUB.LLJJIJIIJIL = true;
                InterfaceC328600CuQ interfaceC328600CuQ3 = interfaceC328600CuQ;
                if (interfaceC328600CuQ3 != null) {
                    interfaceC328600CuQ3.LIZ(view, interfaceC431020GvE, charSequence, null);
                }
            }

            @Override // X.InterfaceC328600CuQ
            public final void LIZIZ(View view, InterfaceC431020GvE interfaceC431020GvE, List<? extends CharSequence> list, Map<String, ? extends Object> map) {
                c1859370yUB.LLJJIJIIJIL = true;
                InterfaceC328600CuQ interfaceC328600CuQ3 = interfaceC328600CuQ;
                if (interfaceC328600CuQ3 != null) {
                    interfaceC328600CuQ3.LIZIZ(view, interfaceC431020GvE, list, map);
                }
            }
        });
        interfaceC342000Daw.LJ(interfaceC328600CuQ2, c0r20);
        interfaceC342000Daw.LJII(c1859370yUB, new InterfaceC328580CuO() { // from class: X.0DM2
            @Override // X.InterfaceC328580CuO
            public final void LIZ(InterfaceC342000Daw interfaceC342000Daw2, View view, C1860910yWf c1860910yWf) {
                c1859370yUB.LLJJIJIIJIL = true;
                InterfaceC328580CuO interfaceC328580CuO2 = interfaceC328580CuO;
                if (interfaceC328580CuO2 != null) {
                    interfaceC328580CuO2.LIZ(interfaceC342000Daw2, view, c1860910yWf);
                }
            }
        });
        interfaceC342000Daw.LIZ(c0gv2);
        interfaceC342000Daw.LIZJ(c0gv3);
        c1859370yUB.LJJJJJ(interfaceC342000Daw, null);
    }
}
