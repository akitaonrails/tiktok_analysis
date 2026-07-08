package X;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: X.0wtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798190wtV {
    public final C818740W9w LIZ;
    public final C1798160wtS LIZIZ;

    public C1798190wtV(C818740W9w c818740W9w, C1798160wtS c1798160wtS) {
        this.LIZ = c818740W9w;
        this.LIZIZ = c1798160wtS;
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
    }

    public final void LIZ(int i, String str) {
        C818740W9w c818740W9w = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("push_count_");
        sbLIZ.append(str);
        c818740W9w.LIZ.edit().putInt(C2188811AlT.LIZIZ(sbLIZ), i).apply();
    }
}
