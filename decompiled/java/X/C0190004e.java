package X;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.004e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0190004e {
    public static final List<String> LIZ = Collections.singletonList("OldAppLogDataMigrator");
    public static volatile int LIZIZ = 10;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("select _id from queue order by _id asc limit ");
        sbLIZ.append(LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
