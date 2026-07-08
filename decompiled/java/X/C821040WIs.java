package X;

import android.os.Environment;
import android.os.StatFs;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0WIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821040WIs {
    public static Pair LIZ(long j) {
        boolean z;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long jLLFF = C2204961BRm.LLFF(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkjb1xjMDJbziwSj8JOcgeWu8HltEXRVAXMlG5WT6bb7xTDvKYlfjDrrXjXujbg==", null)) * C2204961BRm.LLIFFJFJJ(statFs, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkjb1xjMDJbziwSj8JOcgeWu8HltEXRVAXMlG5WT6bb7xTDvKYlfjDrrXjXujbg==", null));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("availableSpace: ");
        sbLIZ.append(jLLFF);
        sbLIZ.append(", needSpace: ");
        sbLIZ.append(j);
        C0WJO.LIZ("MigrateSpaceUtils", C2188811AlT.LIZIZ(sbLIZ));
        if (jLLFF > j) {
            z = true;
        } else {
            z = false;
        }
        return new Pair(Boolean.valueOf(z), Long.valueOf(jLLFF));
    }
}
