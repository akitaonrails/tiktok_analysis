package X;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS431S0200000_30;

/* JADX INFO: renamed from: X.13mP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20110313mP implements InterfaceC20111513mb {
    public final InterfaceC20110713mT LIZ;
    public final InterfaceC20110513mR LIZIZ;
    public final InterfaceC20108913mB LIZJ;
    public final Map<String, Function0<Boolean>> LIZLLL = null;
    public final List<InterfaceC20112413mk> LJ = null;

    @Override // X.InterfaceC20111513mb
    public final C20108713m9 LIZ(C20109413mG c20109413mG) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20108713m9 c20108713m9LIZ = this.LIZ.LIZ(c20109413mG);
        c20108713m9LIZ.LIZLLL = jCurrentTimeMillis;
        c20108713m9LIZ.LIZIZ = this.LIZJ;
        return c20108713m9LIZ;
    }

    @Override // X.InterfaceC20111513mb
    public final C20108713m9 LIZIZ(C20109413mG c20109413mG) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C20108713m9 c20108713m9LIZIZ = this.LIZ.LIZIZ(c20109413mG);
        c20108713m9LIZIZ.LIZLLL = jCurrentTimeMillis;
        c20108713m9LIZIZ.LIZIZ = this.LIZJ;
        return c20108713m9LIZIZ;
    }

    @Override // X.InterfaceC20111513mb
    public final void LIZJ(String str) {
        List<String> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Start prefetch, page scheme: ");
        sbLIZ.append(str);
        C20111613mc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        List<InterfaceC20112413mk> list2 = this.LJ;
        if (list2 != null) {
            C08QT c08qt = new C08QT(C09RB.LJIIIZ(new C1939607ik(list2), new C20111413ma(str)));
            String strConvert = str;
            while (c08qt.hasNext()) {
                strConvert = ((InterfaceC20112413mk) c08qt.next()).convert();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Scheme convert to [schema:");
                sbLIZ2.append(strConvert);
                sbLIZ2.append("], origin_scheme:");
                sbLIZ2.append(str);
                C20111613mc.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
            str = strConvert;
        }
        C20110413mQ c20110413mQ = new C20110413mQ(str);
        Pair<Collection<C20109313mF>, SortedMap<String, String>> pairLIZ = this.LIZIZ.LIZ(c20110413mQ);
        if (pairLIZ != null) {
            Collection<C20109313mF> first = pairLIZ.getFirst();
            SortedMap<String, String> second = pairLIZ.getSecond();
            C01GW c01gw = c20110413mQ.LIZJ;
            InterfaceC2217461Bqa[] interfaceC2217461BqaArr = C20110413mQ.LJFF;
            SortedMap sortedMap = (SortedMap) c01gw.getValue();
            this.LIZ.LIZLLL();
            for (C20109313mF c20109313mF : first) {
                if (this.LIZLLL != null && (list = c20109313mF.LIZJ) != null) {
                    for (String str2 : list) {
                        Function0<Boolean> function0 = this.LIZLLL.get(str2);
                        if (function0 == null || !function0.invoke().booleanValue()) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Condition ");
                            sbLIZ3.append(str2);
                            sbLIZ3.append(" returned false, skipping this page.");
                            C20111613mc.LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                            break;
                        }
                    }
                }
                this.LIZ.LIZJ(str, second, sortedMap, c20109313mF);
            }
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("No config found for page ");
        sbLIZ4.append(str);
        sbLIZ4.append(", skipping...");
        C2188811AlT.LIZIZ(sbLIZ4);
        C20111613mc.LIZ.LIZ();
    }

    public C20110313mP(C20109113mD c20109113mD, C20110013mM c20110013mM, InterfaceC20108913mB interfaceC20108913mB) {
        this.LIZ = c20109113mD;
        this.LIZIZ = c20110013mM;
        this.LIZJ = interfaceC20108913mB;
        c20110013mM.LIZIZ(new AwS431S0200000_30(this, 56));
    }
}
