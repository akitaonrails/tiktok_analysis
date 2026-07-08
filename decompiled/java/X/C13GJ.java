package X;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.13GJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13GJ {
    public final String LIZ;
    public List<? extends Annotation> LIZIZ = C13BV.INSTANCE;
    public final List<String> LIZJ = new ArrayList();
    public final Set<String> LIZLLL = new HashSet();
    public final List<InterfaceC19983313Gt> LJ = new ArrayList();
    public final List<List<Annotation>> LJFF = new ArrayList();
    public final List<Boolean> LJI = new ArrayList();

    public C13GJ(String str) {
        this.LIZ = str;
    }

    public static void LIZ(C13GJ c13gj, String str, InterfaceC19983313Gt interfaceC19983313Gt) {
        C13BV c13bv = C13BV.INSTANCE;
        if (((HashSet) c13gj.LIZLLL).add(str)) {
            ((ArrayList) c13gj.LIZJ).add(str);
            ((ArrayList) c13gj.LJ).add(interfaceC19983313Gt);
            ((ArrayList) c13gj.LJFF).add(c13bv);
            ((ArrayList) c13gj.LJI).add(false);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Element with name '");
        sbLIZ.append(str);
        sbLIZ.append("' is already registered in ");
        sbLIZ.append(c13gj.LIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
