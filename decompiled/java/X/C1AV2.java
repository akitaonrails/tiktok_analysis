package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AV2, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AV2 {
    public static final /* synthetic */ int LJII = 0;
    public final EnumC2180541AVo LIZ;
    public String LIZIZ;
    public Object LIZJ;
    public final boolean LIZLLL;
    public final Boolean LJ;
    public int LJFF;
    public boolean LJI;

    public final String toString() {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.getId());
        sbLIZ.append('/');
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('/');
        sbLIZ.append(this.LIZJ);
        if (Intrinsics.LJFF(this.LJ, Boolean.TRUE)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('/');
            sbLIZ2.append(this.LJFF);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(String str) {
        if (str != null && str.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append('_');
            sbLIZ.append(str);
            this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public /* synthetic */ C1AV2(EnumC2180541AVo enumC2180541AVo, String str, boolean z, Boolean bool, int i) {
        this(enumC2180541AVo, str, "?", (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : bool, 0, false);
    }

    public static C1AV2 LIZIZ(C1AV2 c1av2, EnumC2180541AVo enumC2180541AVo, Boolean bool, boolean z, int i) {
        String str;
        boolean z2;
        int i2;
        boolean z3 = z;
        Boolean bool2 = bool;
        EnumC2180541AVo enumC2180541AVo2 = enumC2180541AVo;
        if ((i & 1) != 0) {
            enumC2180541AVo2 = c1av2.LIZ;
        }
        Object obj = null;
        if ((i & 2) != 0) {
            str = c1av2.LIZIZ;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            obj = c1av2.LIZJ;
        }
        if ((i & 8) != 0) {
            z2 = c1av2.LIZLLL;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            bool2 = c1av2.LJ;
        }
        if ((i & 32) != 0) {
            i2 = c1av2.LJFF;
        } else {
            i2 = 0;
        }
        if ((i & 64) != 0) {
            z3 = c1av2.LJI;
        }
        c1av2.getClass();
        return new C1AV2(enumC2180541AVo2, str, obj, z2, bool2, i2, z3);
    }

    public C1AV2(EnumC2180541AVo enumC2180541AVo, String str, Object obj, boolean z, Boolean bool, int i, boolean z2) {
        this.LIZ = enumC2180541AVo;
        this.LIZIZ = str;
        this.LIZJ = obj;
        this.LIZLLL = z;
        this.LJ = bool;
        this.LJFF = i;
        this.LJI = z2;
    }
}
