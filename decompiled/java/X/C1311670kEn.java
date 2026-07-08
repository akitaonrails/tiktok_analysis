package X;

import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxFlattenUI;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0kEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1311670kEn {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public C1311670kEn() {
        throw null;
    }

    public InterfaceC1210760hc2 LIZ() {
        return null;
    }

    public LynxFlattenUI LIZIZ(s sVar) {
        return null;
    }

    public InterfaceC1311940kFE LIZLLL(s sVar) {
        return null;
    }

    public ShadowNode LJ() {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.e);
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(" - ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public LynxUI LJFF(s sVar) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" is a virtual node, do not have real ui!");
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public LynxFlattenUI LIZJ(s sVar, Object obj) {
        return LIZIZ(sVar);
    }

    public LynxUI LJI(s sVar, Object obj) {
        return LJFF(sVar);
    }

    public C1311670kEn(String str, boolean z, boolean z2, boolean z3) {
        this(str, z, z2, z3, false);
    }

    public C1311670kEn(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
    }
}
