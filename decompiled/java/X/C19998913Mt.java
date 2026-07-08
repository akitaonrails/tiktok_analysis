package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS179S1100000_30;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19998913Mt extends C13NN<C13NR> {
    public final C13NQ LJ;
    public final C13N5 LJFF;
    public final C13RD LJI;
    public String LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public final Effect LJIIL;
    public C19999213Mw LJIILIIL;
    public C13N2 LJIILJJIL;
    public boolean LJIILL;
    public String LJIIJJI = "";
    public String LJIILLIIL = "";

    @Override // X.C13NN
    public final void LIZ() {
        C13NJ c13nj;
        C13N5 c13n5;
        C13N1 c13n1;
        this.LIZIZ = true;
        String str = this.LJII;
        if (str == null || (c13nj = this.LJ.LIZLLL) == null || !c13nj.LIZ(this.LJIIL) || (c13n5 = this.LJFF) == null) {
            return;
        }
        C13NB c13nb = c13n5.LIZ;
        if (!(c13nb instanceof C13N1) || (c13n1 = (C13N1) c13nb) == null) {
            return;
        }
        c13n1.LJJIIJ(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0823  */
    @Override // X.C13NN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 2398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19998913Mt.LIZIZ():void");
    }

    @Override // X.C13NN
    public final void LJIIIZ(boolean z) {
        C13NJ c13nj;
        C13N5 c13n5;
        C13N1 c13n1;
        super.LJIIIZ(z);
        String str = this.LJII;
        if (str != null && (c13nj = this.LJ.LIZLLL) != null && c13nj.LIZ(this.LJIIL) && (c13n5 = this.LJFF) != null) {
            C13NB c13nb = c13n5.LIZ;
            if ((c13nb instanceof C13N1) && (c13n1 = (C13N1) c13nb) != null) {
                c13n1.pause(str);
            }
        }
    }

    public final boolean LJIIJJI(String str) {
        Exception exc;
        C13NJ c13nj = this.LJ.LIZLLL;
        if (c13nj != null && c13nj.LIZIZ(this.LJIIL)) {
            C19999213Mw c19999213Mw = this.LJIILIIL;
            if (c19999213Mw != null) {
                AwS179S1100000_30 awS179S1100000_30 = new AwS179S1100000_30(str, this, 7);
                if (!c19999213Mw.LIZ.LIZIZ()) {
                    awS179S1100000_30.invoke();
                    C19999413My c19999413My = c19999213Mw.LIZIZ;
                    synchronized (c19999413My.LIZ) {
                        try {
                            c19999413My.LIZ.wait();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
            C13N2 c13n2 = this.LJIILJJIL;
            if (c13n2 != null && (exc = c13n2.LIZ) != null) {
                LIZLLL(this, new C1662010tLr(10018, exc));
                return true;
            }
        }
        return false;
    }

    @Override // X.C13NN
    public final void LIZLLL(C13NN<C13NR> c13nn, C1662010tLr c1662010tLr) {
        C13RD c13rd;
        InterfaceC1633730scF interfaceC1633730scF;
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download effect: ");
        sbLIZ.append(this.LJIIL.getEffect_id());
        sbLIZ.append(", name: ");
        sbLIZ.append(this.LJIIL.getName());
        sbLIZ.append(" failed!, error msg: ");
        sbLIZ.append(c1662010tLr.LIZIZ);
        sbLIZ.append(", error code: ");
        sbLIZ.append(c1662010tLr.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZIZ("EffectFetcherTask", strLIZIZ, null);
        super.LIZLLL(c13nn, c1662010tLr);
        Effect effect = this.LJIIL;
        int i = c1662010tLr.LIZ;
        if (i != 10001 && i != 10020) {
            if ((effect != null && i == 10003 && effect.getEffect_type() == 1) || (interfaceC1633730scF = (c13rd = this.LJI).LJIJJLI) == null) {
                return;
            }
            Effect effect2 = this.LJIIL;
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("is_diff", Boolean.valueOf(this.LJIILL));
            pairArr[1] = new Pair("error_code", Integer.valueOf(c1662010tLr.LIZ));
            String str = this.LJII;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            pairArr[2] = new Pair("download_url", str);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            String str3 = c1662010tLr.LIZIZ;
            if (str3 != null) {
                str2 = str3;
            }
            C19997513Mf.LIZJ(effect2, c13rd, interfaceC1633730scF, str2, mapLJIIIIZZ, false);
        }
    }

    @Override // X.C13NN
    /* JADX INFO: renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public final void LJII(C13NN<C13NR> c13nn, C13NR c13nr) {
        int iIntValue;
        super.LJII(c13nn, c13nr);
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download effect: ");
        sbLIZ.append(this.LJIIL.getEffect_id());
        sbLIZ.append(", name: ");
        sbLIZ.append(this.LJIIL.getName());
        sbLIZ.append(" success");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("EffectFetcherTask", strLIZIZ);
        if (C13QU.LIZIZ.LIZIZ()) {
            String unzipPath = this.LJIIL.getUnzipPath();
            if (!a0.LJJJIL(unzipPath)) {
                ((ConcurrentHashMap) C13NE.LIZ.getValue()).put(unzipPath, Long.valueOf(System.currentTimeMillis()));
            }
        }
        C13RD c13rd = this.LJI;
        InterfaceC1633730scF interfaceC1633730scF = c13rd.LJIJJLI;
        if (interfaceC1633730scF != null) {
            Effect effect = this.LJIIL;
            Pair[] pairArr = new Pair[9];
            pairArr[0] = new Pair("is_diff", Boolean.valueOf(this.LJIILL));
            pairArr[1] = new Pair("duration", Long.valueOf(this.LJIIIIZZ));
            pairArr[2] = new Pair("translate_time", 0L);
            pairArr[3] = new Pair("unzip_time", Long.valueOf(this.LJIIIZ));
            pairArr[4] = new Pair("size", Long.valueOf(this.LJIIJ));
            String str = this.LJII;
            if (str == null) {
                str = "";
            }
            pairArr[5] = new Pair("download_url", str);
            pairArr[6] = new Pair("compress_format", this.LJIIJJI);
            pairArr[7] = new Pair("gradekey", this.LJIILLIIL);
            Integer num = C23067092b.LIZ.get(this.LJIIJJI);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            pairArr[8] = new Pair("compress_type", Integer.valueOf(iIntValue));
            C19997513Mf.LIZJ(effect, c13rd, interfaceC1633730scF, "", C2097608Jq.LJIIIIZZ(pairArr), true);
        }
    }

    public C19998913Mt(C13NQ c13nq, C13N5 c13n5, C13RD c13rd) {
        this.LJ = c13nq;
        this.LJFF = c13n5;
        this.LJI = c13rd;
        this.LJIIL = c13nq.LIZ;
    }
}
