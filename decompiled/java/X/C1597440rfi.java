package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: renamed from: X.0rfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597440rfi {
    public final C1597620rg0 LIZ;
    public final C1597340rfY LIZIZ;
    public final C1597330rfX LIZJ;
    public final Map<EnumC1597060rf6, Function1<InterfaceC1891350zJl, String>> LIZLLL;
    public final C1596490reB LJ;
    public final List<InterfaceC1597500rfo> LJFF;
    public Map<EnumC1597060rf6, ? extends List<? extends InterfaceC1891350zJl>> LJI = C2097608Jq.LJ();
    public final C1597480rfm LJII = new C1597480rfm();
    public Map<EnumC1597060rf6, ? extends Map<String, ? extends Object>> LJIIIIZZ = C2097608Jq.LJ();
    public volatile boolean LJIIIZ;
    public AwS638S0100000_24 LJIIJ;

    public final void LIZ(InterfaceC1597430rfh interfaceC1597430rfh) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dispatchIntent: intent=");
        sbLIZ.append(C13LE.LIZ(interfaceC1597430rfh.getClass()).LJI());
        C1720106oR.LJI("SkylightDataPipeline", C2188811AlT.LIZIZ(sbLIZ));
        C1597330rfX c1597330rfX = this.LIZJ;
        ((ArrayList) c1597330rfX.LIZJ).add(interfaceC1597430rfh);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dispatch: queued intent=");
        sbLIZ2.append(C13LE.LIZ(interfaceC1597430rfh.getClass()).LJI());
        sbLIZ2.append(", mode=");
        sbLIZ2.append(interfaceC1597430rfh.getMode());
        sbLIZ2.append(", queueSize=");
        sbLIZ2.append(((ArrayList) c1597330rfX.LIZJ).size());
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1596730reZ r20, X.InterfaceC1364105Vn<? super X.C1158320gFS> r21) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1597440rfi.LIZJ(X.0reZ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.EnumC1597060rf6 r9, X.C1596730reZ r10, X.InterfaceC1364105Vn<? super java.util.List<? extends X.InterfaceC1891350zJl>> r11) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1597440rfi.LIZIZ(X.0rf6, X.0reZ, X.05Vn):java.lang.Object");
    }

    public final List<InterfaceC1891350zJl> LIZLLL(Map<EnumC1597060rf6, ? extends List<? extends InterfaceC1891350zJl>> map, EnumC1597050rf5 enumC1597050rf5, Map<EnumC1597060rf6, ? extends List<? extends InterfaceC1891350zJl>> map2, Map<EnumC1597060rf6, ? extends Map<String, ? extends Object>> map3) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("runPipeline start, refreshType=");
        sbLIZ.append(enumC1597050rf5);
        sbLIZ.append(", bizTypes=");
        sbLIZ.append(map.keySet());
        C2188811AlT.LIZIZ(sbLIZ);
        List<? extends InterfaceC1891350zJl> list = this.LJII.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i2 = C1597490rfn.LIZJ;
        C1597350rfZ c1597350rfZ = new C1597350rfZ(C1975207oU.LIZ(map, this.LIZLLL), enumC1597050rf5, map2, map3, this.LJ);
        List<InterfaceC1891350zJl> listLIZ = this.LIZJ.LIZ(this.LIZIZ.LIZ(c1597350rfZ, this.LIZJ.LIZIZ(c1597350rfZ, map)), c1597350rfZ, list);
        this.LJII.LIZ = listLIZ;
        Pair pair = new Pair(listLIZ, Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        List<InterfaceC1891350zJl> list2 = (List) pair.getFirst();
        long jLongValue = ((Number) pair.getSecond()).longValue();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("runPipeline done, resultSize=");
        sbLIZ2.append(list2.size());
        sbLIZ2.append(", displaySize=");
        sbLIZ2.append(this.LJII.LIZ.size());
        sbLIZ2.append(", elapsed=");
        sbLIZ2.append(jLongValue);
        sbLIZ2.append("ms");
        C2188811AlT.LIZIZ(sbLIZ2);
        return list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1597440rfi(C1597620rg0 c1597620rg0, C1597340rfY c1597340rfY, C1597330rfX c1597330rfX, Map<EnumC1597060rf6, ? extends Function1<? super InterfaceC1891350zJl, String>> map, C1596490reB c1596490reB, List<? extends InterfaceC1597500rfo> list) {
        this.LIZ = c1597620rg0;
        this.LIZIZ = c1597340rfY;
        this.LIZJ = c1597330rfX;
        this.LIZLLL = map;
        this.LJ = c1596490reB;
        this.LJFF = list;
    }
}
