package X;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.14hW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20334814hW {
    public final HashMap<String, Integer> LIZ;
    public final List<InterfaceC20334914hX> LIZIZ;
    public final EnumC587410N2d LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final long LJFF;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaveTaskGlobalConfig(initWorkTypeList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isDebug=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", reportOperatorError=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", checkTimeoutIntervalTime=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(")");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20334814hW(List list, long j, int i) {
        EnumC587410N2d enumC587410N2d;
        list = (i & 1) != 0 ? C13BV.INSTANCE : list;
        if ((i & 2) != 0) {
            enumC587410N2d = EnumC587410N2d.MODE_STRICT;
        } else {
            enumC587410N2d = null;
        }
        j = (i & 16) != 0 ? 0L : j;
        this.LIZIZ = list;
        this.LIZJ = enumC587410N2d;
        this.LIZLLL = false;
        this.LJ = false;
        this.LJFF = j;
        this.LIZ = new HashMap<>();
        for (InterfaceC20334914hX interfaceC20334914hX : list) {
            this.LIZ.put(interfaceC20334914hX.LIZIZ(), Integer.valueOf(interfaceC20334914hX.LIZ()));
        }
    }
}
