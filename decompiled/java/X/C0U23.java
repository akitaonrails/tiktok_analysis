package X;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: X.0U23, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0U23 {
    public final long LIZ;
    public final C0U3A LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final List<String> LJFF;
    public final Bundle LJI = new Bundle();

    public String toString() {
        return this.LIZJ;
    }

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC771350UNp.LIVE_KARAOKE.getFullPath());
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0U23(long j, C0U3A c0u3a, String str, String str2, long j2, List<String> list) {
        this.LIZ = j;
        this.LIZIZ = c0u3a;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = j2;
        this.LJFF = list;
    }
}
