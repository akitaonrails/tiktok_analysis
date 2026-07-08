package X;

import com.bytedance.keva.Keva;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06f7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1662306f7 implements C061D, InterfaceC889970Yvj {
    public static final C1662306f7 LL;
    public static final AtomicReference<Map<String, List<String>>> LLILLJJLI;
    public static final C054G LLILLL;

    @Override // X.InterfaceC889970Yvj
    public final void QH0() {
    }

    static {
        C1662306f7 c1662306f7 = new C1662306f7();
        LL = c1662306f7;
        LLILLJJLI = new AtomicReference<>(C2097608Jq.LJ());
        LLILLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
        LIZJ();
        C19212010Ec.LIZJ.LJJIFFI(c1662306f7);
    }

    public static String LIZIZ() {
        String strLIZIZ = C461720I8s.LIZIZ();
        if (strLIZIZ.length() == 0 || Intrinsics.LJFF(strLIZIZ, "-1")) {
            return null;
        }
        return strLIZIZ;
    }

    public static void LIZJ() {
        String strLIZIZ = LIZIZ();
        if (strLIZIZ == null) {
            return;
        }
        AtomicReference<Map<String, List<String>>> atomicReference = LLILLJJLI;
        Keva keva = (Keva) C1663506fJ.LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("matched_feature_ids:");
        sbLIZ.append(strLIZIZ);
        atomicReference.set(C2097908Jt.LIZJ(new Pair(strLIZIZ, C13LQ.LJJLL(keva.getStringArray(C2188811AlT.LIZIZ(sbLIZ), new String[0])))));
    }

    @Override // X.InterfaceC889970Yvj
    public final void eV0() {
        InterfaceC1662906fD interfaceC1662906fD;
        String strLIZIZ = LIZIZ();
        if (strLIZIZ == null || (interfaceC1662906fD = C1662806fC.LIZ) == null) {
            return;
        }
        C23250099c.LIZLLL(LLILLL, null, null, new C1662406f8(interfaceC1662906fD, strLIZIZ, null), 3);
    }

    @Override // X.C061D
    public final boolean LIZ(C061C c061c) {
        List<String> list;
        String strLIZIZ = LIZIZ();
        if (strLIZIZ == null || (list = LLILLJJLI.get().get(strLIZIZ)) == null || !list.contains(c061c.getValue())) {
            return false;
        }
        return true;
    }
}
