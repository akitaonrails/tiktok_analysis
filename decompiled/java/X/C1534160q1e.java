package X;

import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534160q1e implements InterfaceC1534830q2j {
    public final LinkedList<String> LIZ;
    public volatile boolean LIZIZ;

    @Override // X.InterfaceC1534830q2j
    public final boolean cancel() {
        if (this.LIZIZ) {
            return true;
        }
        this.LIZIZ = true;
        return true;
    }

    public C1534160q1e(List<String> list) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(list);
        this.LIZ = linkedList;
    }

    @Override // X.InterfaceC1534830q2j
    public final boolean LIZ(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetch, request = ");
        sbLIZ.append(c1533490q0Z);
        sbLIZ.append('}');
        C1534250q1n.LIZ(c1534250q1n, "ResourceFetcherChain", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZ.isEmpty()) {
            function1.invoke(c1533790q13);
            return true;
        }
        if (c1533490q0Z.LJJJJJL) {
            LIZIZ(c1533490q0Z, c1533790q13, function1);
            return true;
        }
        LIZJ(c1533490q0Z, c1533790q13, function1);
        return true;
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a8: INVOKE (r5v0 ?? I:X.0q1e), (r11 I:X.0q0Z), (r6 I:X.0q13), (r7 I:kotlin.jvm.functions.Function1) VIRTUAL call: X.0q1e.LIZIZ(X.0q0Z, X.0q13, kotlin.jvm.functions.Function1):void A[MD:(X.0q0Z, X.0q13, kotlin.jvm.functions.Function1<? super X.0q13, kotlin.Unit>):void (m)] (LINE:50331816), block:B:21:0x009d */
    public final void LIZIZ(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
        String message;
        C1533490q0Z c1533490q0ZLIZIZ;
        if (this.LIZ.isEmpty()) {
            function1.invoke(c1533790q13);
            return;
        }
        String strPop = this.LIZ.pop();
        try {
            ResourceFetcher resourceFetcherLIZIZ = C1533950q1J.LIZIZ(c1533490q0Z.LJJJJJ, strPop, c1533790q13);
            if (resourceFetcherLIZIZ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetcher is null at ");
                sbLIZ.append(strPop);
                C1534250q1n.LJFF("ResourceFetcherChain", "fetchSync", C2188811AlT.LIZIZ(sbLIZ), null, false);
                LIZIZ(c1533490q0Z, c1533790q13, function1);
                return;
            }
            if (this.LIZIZ) {
                c1533790q13.LJIIL = true;
                c1533790q13.LIZLLL.LJ(2, "ResourceLoaderChain# on cancel load");
                C1534250q1n.LIZ(C1534250q1n.LIZ, "ResourceFetcherChain", "ResourceLoaderChain# on cancel load");
                function1.invoke(c1533790q13);
                return;
            }
            Thread threadU3 = C786410Ut5.u3();
            resourceFetcherLIZIZ.getTimer().LJ();
            c1533790q13.LJIJJ = resourceFetcherLIZIZ;
            resourceFetcherLIZIZ.fetchAsync(c1533490q0Z, c1533790q13, new C1534280q1q(this, c1533790q13, function1, resourceFetcherLIZIZ, strPop, threadU3, c1533490q0Z));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1534250q1n.LIZIZ("ResourceFetcherChain", " onException ", th);
            C1533810q15 c1533810q15 = c1533790q13.LIZLLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("catch error on ");
            sbLIZ2.append(strPop);
            sbLIZ2.append(", error:");
            sbLIZ2.append(th.getMessage());
            sbLIZ2.append(' ');
            Throwable cause = th.getCause();
            if (cause != null) {
                message = cause.getMessage();
            } else {
                message = null;
            }
            sbLIZ2.append(message);
            c1533810q15.LIZIZ(4, strPop, C2188811AlT.LIZIZ(sbLIZ2));
            LIZIZ(c1533490q0ZLIZIZ, c1533790q13, function1);
        }
    }

    public final void LIZJ(C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
        String message;
        while (!this.LIZ.isEmpty()) {
            String strPop = this.LIZ.pop();
            if (this.LIZIZ) {
                c1533790q13.LJIIL = true;
                c1533790q13.LIZLLL.LJ(2, "ResourceLoaderChain# on cancel load");
                C1534250q1n.LIZ(C1534250q1n.LIZ, "ResourceFetcherChain", "ResourceLoaderChain# on cancel load");
                function1.invoke(c1533790q13);
                return;
            }
            try {
                ResourceFetcher resourceFetcherLIZIZ = C1533950q1J.LIZIZ(c1533490q0Z.LJJJJJ, strPop, c1533790q13);
                if (resourceFetcherLIZIZ == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cannot get fetcher instance at ");
                    sbLIZ.append(strPop);
                    C1534250q1n.LJFF("ResourceFetcherChain", "fetchSync", C2188811AlT.LIZIZ(sbLIZ), null, false);
                    C1533810q15 c1533810q15 = c1533790q13.LIZLLL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strPop);
                    sbLIZ2.append(" fetcher not registered");
                    c1533810q15.LIZIZ(5, strPop, C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    resourceFetcherLIZIZ.getTimer().LJ();
                    c1533790q13.LJIJJ = resourceFetcherLIZIZ;
                    resourceFetcherLIZIZ.fetchSync(c1533490q0Z, c1533790q13);
                    resourceFetcherLIZIZ.getTimer().LIZIZ();
                    if (c1533790q13.LIZIZ) {
                        c1533790q13.LJIIJ = strPop;
                        function1.invoke(c1533790q13);
                        return;
                    }
                    continue;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1533810q15 c1533810q152 = c1533790q13.LIZLLL;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("catch error on ");
                sbLIZ3.append(strPop);
                sbLIZ3.append(", error:");
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(' ');
                Throwable cause = th.getCause();
                if (cause != null) {
                    message = cause.getMessage();
                } else {
                    message = null;
                }
                sbLIZ3.append(message);
                c1533810q152.LIZIZ(4, strPop, C2188811AlT.LIZIZ(sbLIZ3));
                C1534250q1n.LIZIZ("ResourceFetcherChain", "fetchSync catch error", th);
            }
        }
        function1.invoke(c1533790q13);
    }
}
