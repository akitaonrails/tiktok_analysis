package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0zi8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C1906460zi8 {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final String LIZ;
    public final EnumC1584360rKc LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final EnumC1619300sEy LJ;
    public final Map<String, String> LJFF;
    public boolean LJI;
    public EnumC992730bwN LJII = EnumC992730bwN.DISMISS_ON_UNSPECIFIED;

    static {
        new Object() { // from class: X.0ziI
        };
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HomeTabBubble: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public Map<String, String> LIZ() {
        return this.LJFF;
    }

    public C1906460zi8(String str, EnumC1584360rKc enumC1584360rKc, boolean z, long j, EnumC1619300sEy enumC1619300sEy, Map map) {
        this.LIZ = str;
        this.LIZIZ = enumC1584360rKc;
        this.LIZJ = z;
        this.LIZLLL = j;
        this.LJ = enumC1619300sEy;
        this.LJFF = map;
    }
}
