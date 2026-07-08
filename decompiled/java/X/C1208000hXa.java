package X;

import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0hXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1208000hXa {
    public static final C1208000hXa LJ;
    public static final C1208000hXa LJFF;
    public final EnumC1207930hXT LIZ;
    public final EnumC1207420hWe LIZIZ;
    public final C1207220hWK LIZJ;
    public final List<Pair<String, EnumC1207930hXT>> LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PermissionResultData(resultType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", results=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC1207930hXT enumC1207930hXT = EnumC1207930hXT.Granted;
        EnumC1207420hWe enumC1207420hWe = EnumC1207420hWe.InApp;
        LJ = new C1208000hXa(enumC1207930hXT, enumC1207420hWe, null, 0 == true ? 1 : 0, 12);
        LJFF = new C1208000hXa(EnumC1207930hXT.Denied, enumC1207420hWe, null, 0 == true ? 1 : 0, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1208000hXa(EnumC1207930hXT enumC1207930hXT, EnumC1207420hWe enumC1207420hWe, C1207220hWK c1207220hWK, List<? extends Pair<String, ? extends EnumC1207930hXT>> list) {
        this.LIZ = enumC1207930hXT;
        this.LIZIZ = enumC1207420hWe;
        this.LIZJ = c1207220hWK;
        this.LIZLLL = list;
    }

    public /* synthetic */ C1208000hXa(EnumC1207930hXT enumC1207930hXT, EnumC1207420hWe enumC1207420hWe, C1207220hWK c1207220hWK, List list, int i) {
        this(enumC1207930hXT, enumC1207420hWe, (i & 4) != 0 ? null : c1207220hWK, (i & 8) != 0 ? null : list);
    }
}
