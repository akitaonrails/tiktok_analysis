package X;

import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.12wb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19918712wb {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Map<String, AnonymousClass1301> LIZ;

    static {
        Logger.getLogger(C19918712wb.class.getName());
    }

    public C19918712wb(Map<String, AnonymousClass1301> map) {
        this.LIZ = map;
    }

    public final AnonymousClass1301 LIZ(String str) throws C19926612xs {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length > 1) {
            return this.LIZ.get(strArrSplit[strArrSplit.length - 1]);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Invalid type url found: ");
        sbLIZ.append(str);
        throw new C19926612xs(C2188811AlT.LIZIZ(sbLIZ));
    }
}
