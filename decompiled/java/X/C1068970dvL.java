package X;

import android.content.Context;
import com.ss.android.ugc.aweme.hybridkit.ttopruntime.experiment.TTOPSparkRuntimeConfigSettings;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0dvL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1068970dvL implements InterfaceC1541510qDV {
    public final C1059160dfW LIZ = new InterfaceC1543050qFz() { // from class: X.0dfW
        @Override // X.InterfaceC1543050qFz
        public final InterfaceC1543270qGL LIZ() {
            return null;
        }

        @Override // X.InterfaceC1543050qFz
        public final InterfaceC1538820q9A LIZIZ(C1537480q70 c1537480q70) {
            C1058970dfD c1058970dfD = new C1058970dfD(null, true, 1 == true ? 1 : 0);
            c1537480q70.LJJ(C1543000qFu.class, c1058970dfD);
            C1542930qFn c1542930qFn = new C1542930qFn() { // from class: X.0dfV
                @Override // X.C1542930qFn, X.InterfaceC1538970q9P
                public final void LJII(Context context) {
                    C1059860dge c1059860dge;
                    super.LJII(context);
                    InterfaceC1541990qEH interfaceC1541990qEHLJIJJLI = LJIJJLI();
                    if (interfaceC1541990qEHLJIJJLI != null && (c1059860dge = (C1059860dge) interfaceC1541990qEHLJIJJLI.getHybridContext().LJFF(C1059860dge.class)) != null) {
                        c1059860dge.LIZLLL(Context.class, context);
                    }
                }
            };
            c1542930qFn.LIZLLL = c1058970dfD;
            c1542930qFn.LJIIZILJ(new AbstractC1544140qHk() { // from class: X.0dfX
                @Override // X.AbstractC1544140qHk
                public final String LIZ() {
                    return "TTOP";
                }

                @Override // X.AbstractC1544140qHk
                public final void LJ(C1543190qGD c1543190qGD, C1543910qHN c1543910qHN) {
                    C1544200qHq.LIZ(c1543190qGD, c1543910qHN);
                }

                @Override // X.AbstractC1544140qHk
                public final C1543280qGM LJIIIZ(C1543190qGD c1543190qGD, C1543910qHN c1543910qHN) {
                    if (!TTOPSparkRuntimeConfigSettings.LIZ().ttopJSBList.contains(c1543910qHN.LJFF)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("The ");
                        sbLIZ.append("TTOP");
                        sbLIZ.append(" runtime does not support this JSB : ");
                        sbLIZ.append(c1543910qHN.LJFF);
                        return new C1543280qGM(false, C2188811AlT.LIZIZ(sbLIZ), "TTOP");
                    }
                    return new C1543280qGM(true, null, "TTOP");
                }
            });
            return c1542930qFn;
        }
    };
    public final C0WTE LIZIZ = new C0WTD() { // from class: X.0WTE
        @Override // X.C0WTD, X.InterfaceC1059260dfg
        public final void LIZ(InterfaceC1541990qEH interfaceC1541990qEH, List<String> list) {
            super.LIZ(interfaceC1541990qEH, list);
        }

        @Override // X.C0WTD, X.InterfaceC1059260dfg
        public final void LIZIZ(InterfaceC1541990qEH interfaceC1541990qEH, Map<String, Object> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (map != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (TTOPSparkRuntimeConfigSettings.LIZ().ttopGPKeys.contains(entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            super.LIZIZ(interfaceC1541990qEH, linkedHashMap);
        }

        @Override // X.C0WTD, X.InterfaceC1059260dfg
        public final void LIZJ(InterfaceC1541990qEH interfaceC1541990qEH, Map<String, Object> map) {
            super.LIZJ(interfaceC1541990qEH, map);
        }
    };
    public InterfaceC1541780qDw LIZJ;

    @Override // X.InterfaceC1541510qDV
    public final InterfaceC1536300q56 LIZ() {
        return null;
    }

    @Override // X.InterfaceC1541510qDV
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.InterfaceC1541510qDV
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC1541510qDV
    public final void LJ() {
        this.LIZJ = null;
    }

    @Override // X.InterfaceC1541510qDV
    public final InterfaceC1541770qDv LJFF() {
        return null;
    }

    @Override // X.InterfaceC1541510qDV
    public final boolean LJII() {
        return true;
    }

    @Override // X.InterfaceC1541510qDV
    public final String name() {
        return "TTOP";
    }

    @Override // X.InterfaceC1541510qDV
    public final InterfaceC1541780qDw LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1541510qDV
    public final InterfaceC1543050qFz LJI() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1541510qDV
    public final InterfaceC1059260dfg LJIIIIZZ() {
        return this.LIZIZ;
    }
}
