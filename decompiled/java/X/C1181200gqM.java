package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gqM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181200gqM {
    public final C1180920gpu LIZ;
    public final String LIZIZ;
    public final C1181200gqM LIZJ;
    public final List<C1181200gqM> LIZLLL;

    public final boolean LIZ() {
        if (this.LIZ.LIZJ == EnumC1181250gqR.GROUP && Intrinsics.LJFF(this.LIZIZ, "feed")) {
            return true;
        }
        InterfaceC1173960geg interfaceC1173960geg = C1180170goh.LIZ;
        InterfaceC1180970gpz interfaceC1180970gpz = C1180170goh.LIZIZ.get(this.LIZ.LIZIZ);
        if (interfaceC1180970gpz != null && interfaceC1180970gpz.LIZ()) {
            return true;
        }
        C1181200gqM c1181200gqM = this.LIZJ;
        if (c1181200gqM == null) {
            return false;
        }
        return c1181200gqM.LIZ();
    }

    public final boolean LIZIZ() {
        if (this.LIZ.LIZJ == EnumC1181250gqR.GROUP && Intrinsics.LJFF(this.LIZIZ, "info")) {
            return true;
        }
        C1181200gqM c1181200gqM = this.LIZJ;
        if (c1181200gqM == null) {
            return false;
        }
        return c1181200gqM.LIZIZ();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{ instanceId:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nodeData:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" }");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1181200gqM(C1180920gpu c1180920gpu, String str, C1181200gqM c1181200gqM) {
        this(c1180920gpu, str, c1181200gqM, new ArrayList());
    }

    public C1181200gqM(C1180920gpu c1180920gpu, String str, C1181200gqM c1181200gqM, List<C1181200gqM> list) {
        this.LIZ = c1180920gpu;
        this.LIZIZ = str;
        this.LIZJ = c1181200gqM;
        this.LIZLLL = list;
    }

    public static C1181200gqM LIZJ(C1181200gqM c1181200gqM, C1180920gpu c1180920gpu, List list, int i) {
        String str;
        if ((i & 1) != 0) {
            c1180920gpu = c1181200gqM.LIZ;
        }
        C1181200gqM c1181200gqM2 = null;
        if ((i & 2) != 0) {
            str = c1181200gqM.LIZIZ;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            c1181200gqM2 = c1181200gqM.LIZJ;
        }
        if ((i & 8) != 0) {
            list = c1181200gqM.LIZLLL;
        }
        c1181200gqM.getClass();
        return new C1181200gqM(c1180920gpu, str, c1181200gqM2, list);
    }
}
