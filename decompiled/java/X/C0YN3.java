package X;

import Y.AComparatorS33S0000000_14;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YN3, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YN3 implements InterfaceC862620Xsi {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final C0YNF LIZ;
    public final C0VS9 LIZIZ;
    public final InterfaceC863970Xut LIZJ;
    public final InterfaceC869780YAe LIZLLL;
    public final C0Y91 LJ;
    public final C868200Y4c LJFF;
    public final C871190YFp LJI;
    public final Function0<C0YJ9> LJII;
    public final boolean LJIIIIZZ;
    public final C868780Y6i LJIIIZ;
    public final C0YNE LJIIJ = new C0YNE();
    public final C0YN9 LJIIJJI;
    public final C0YL7 LJIIL;
    public final C0YN4 LJIILIIL;
    public final C0YN2 LJIILJJIL;
    public final C0YRG LJIILL;

    @Override // X.InterfaceC862620Xsi
    public final void LIZLLL() {
        ((ConcurrentHashMap) this.LJIIJ.LIZ).clear();
    }

    @Override // X.InterfaceC862620Xsi
    public final void stop() {
        C0YRG c0yrg = this.LJIILL;
        C1DEK c1dek = c0yrg.LIZJ;
        if (c1dek != null) {
            c1dek.LJIIJJI(null);
        }
        c0yrg.LIZJ = null;
        ((ConcurrentHashMap) this.LJIIJ.LIZ).clear();
    }

    @Override // X.InterfaceC862620Xsi
    public final Object LIZ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        ((ConcurrentHashMap) this.LJIIJ.LIZ).clear();
        Object objLIZIZ = this.LJIILL.LIZIZ(interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }

    public final void LJFF(C0YN8 c0yn8) {
        long j;
        long j2;
        int i;
        String str;
        C0YJ9 c0yj9Invoke = this.LJII.invoke();
        c0yj9Invoke.LIZJ("imsdk_msg_resolve_gap");
        long j3 = c0yn8.LJIILL;
        if (j3 > 0) {
            j = j3;
        } else {
            j = c0yn8.LJIILJJIL;
            if (j <= 0) {
                j = c0yn8.LJIILIIL;
            }
        }
        long j4 = c0yn8.LJIIL;
        long j5 = j - j4;
        long j6 = c0yn8.LJIILIIL;
        long j7 = j6 - j4;
        long j8 = c0yn8.LJIILJJIL;
        long j9 = -1;
        if (j8 > 0) {
            j2 = j8 - j6;
        } else {
            j2 = -1;
        }
        if (j3 > 0) {
            j9 = j3 - j8;
        }
        if (j3 > 0) {
            if (c0yn8.LJII <= 0) {
                i = 0;
            } else {
                i = 3;
            }
        } else if (j8 > 0) {
            i = 2;
        } else {
            i = 1;
        }
        int i2 = C873110YMz.LIZ[c0yn8.LIZLLL.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                str = "-1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
        } else {
            str = "1";
        }
        c0yj9Invoke.LIZIZ(C2097608Jq.LJIIIIZZ(new Pair("inbox_type", String.valueOf(c0yn8.LIZ)), new Pair("conversation_id", c0yn8.LIZIZ), new Pair("conversation_short_id", String.valueOf(c0yn8.LIZJ)), new Pair("total_duration", String.valueOf(j5)), new Pair("check_duration", String.valueOf(j7)), new Pair("response_duration", String.valueOf(j2)), new Pair("resolution_duration", String.valueOf(j9)), new Pair("gap_count", String.valueOf(c0yn8.LJ)), new Pair("page_size", String.valueOf(c0yn8.LJIIJJI)), new Pair("msg_return_count", String.valueOf(c0yn8.LJFF)), new Pair("msg_repair_success_count", String.valueOf(c0yn8.LJI)), new Pair("msg_repair_failure_count", String.valueOf(c0yn8.LJII)), new Pair("result", String.valueOf(i)), new Pair("error_code", String.valueOf(c0yn8.LJIIIIZZ)), new Pair("error_msg", c0yn8.LJIIIZ), new Pair("log_id", c0yn8.LJIIJ), new Pair("direction", str)));
        c0yj9Invoke.LIZLLL();
    }

    @Override // X.InterfaceC862620Xsi
    public final List<C0YNC> LIZIZ(String str, List<? extends C869590Y9l> list) {
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            if (c869590Y9l.getPrevIndex() != 0) {
                arrayList.add(c869590Y9l);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            C869590Y9l c869590Y9l2 = (C869590Y9l) obj;
            if (c869590Y9l2.getIndex() > 0 && c869590Y9l2.getMsgId() > 0 && c869590Y9l2.getMsgStatus() != 6) {
                arrayList2.add(obj);
            }
        }
        List<? extends C869590Y9l> listLJLLLL = C13LP.LJLLLL(new AComparatorS33S0000000_14(9), arrayList2);
        C868780Y6i c868780Y6i = this.LJIIIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildSegmentsAndDetectGaps with prev message list size ");
        sbLIZ.append(listLJLLLL.size());
        C868780Y6i.LJIILJJIL(c868780Y6i, "ResolveMessageInConvGapWorkManagerV2", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (listLJLLLL.isEmpty()) {
            return C13BV.INSTANCE;
        }
        this.LJIIJJI.getClass();
        return this.LJIIL.LIZ(this.LJIILIIL.LIZ(str, listLJLLLL, C0YN9.LIZ(list), false));
    }

    @Override // X.InterfaceC862620Xsi
    public final Object LIZJ(C0YL9 c0yl9, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = this.LJIILL.LIZ(c0yl9, interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C0YL9 r36, X.InterfaceC1364105Vn<? super kotlin.Unit> r37) {
        /*
            Method dump skipped, instruction units count: 1712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YN3.LJ(X.0YL9, X.05Vn):java.lang.Object");
    }

    public C0YN3(C0YNF c0ynf, C873000YMo c873000YMo, C0VS9 c0vs9, InterfaceC863970Xut interfaceC863970Xut, InterfaceC869780YAe interfaceC869780YAe, C0Y91 c0y91, C868200Y4c c868200Y4c, C871190YFp c871190YFp, AwS558S0100000_14 awS558S0100000_14, boolean z, boolean z2, C868780Y6i c868780Y6i) {
        this.LIZ = c0ynf;
        this.LIZIZ = c0vs9;
        this.LIZJ = interfaceC863970Xut;
        this.LIZLLL = interfaceC869780YAe;
        this.LJ = c0y91;
        this.LJFF = c868200Y4c;
        this.LJI = c871190YFp;
        this.LJII = awS558S0100000_14;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = c868780Y6i;
        this.LJIIJJI = new C0YN9(interfaceC869780YAe, c868780Y6i, z2);
        this.LJIIL = new C0YL7(c868780Y6i, z);
        C0YN4 c0yn4 = new C0YN4(c0ynf, interfaceC863970Xut, c868780Y6i, z2, z2);
        this.LJIILIIL = c0yn4;
        this.LJIILJJIL = new C0YN2(c873000YMo, interfaceC863970Xut, c0yn4, c868780Y6i);
        this.LJIILL = new C0YRG(c868780Y6i, new C0YNA(this));
    }
}
