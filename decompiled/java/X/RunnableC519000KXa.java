package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.text.CharsKt__CharJVMKt;

/* JADX INFO: renamed from: X.0KXa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class RunnableC519000KXa implements Runnable {
    public final String LL;
    public final String LLILLJJLI;
    public final Runnable LLILLL;
    public final C00GH LLILZ;
    public final Set<Integer> LLILZIL;
    public final long LLILZLL;
    public int LLIZ;
    public final boolean LLIZLLLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PTFTask@488a.run");
        try {
            this.LLILLL.run();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PTFTask@488a.run");
    }

    public final String toString() {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PTFTask[");
        StringBuilder sb = new StringBuilder();
        int iHashCode = hashCode();
        CharsKt__CharJVMKt.checkRadix(16);
        String string = Integer.toString(iHashCode, 16);
        int i = 0;
        do {
            if (i < string.length()) {
                sb.append(string.charAt(i));
            } else {
                sb.append('0');
            }
            i++;
        } while (i < 5);
        sbLIZ.append(sb.toString());
        sbLIZ.append("](bizKey=");
        String str = this.LLILLJJLI;
        if (str == null || str.length() == 0) {
            strLIZIZ = this.LL;
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LL);
            sbLIZ2.append('_');
            sbLIZ2.append(this.LLILLJJLI);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public RunnableC519000KXa(String str, String str2, Runnable runnable) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = runnable;
        new ArrayList();
        this.LLILZ = C00GH.MEDIUM;
        this.LLILZIL = new LinkedHashSet();
        this.LLILZLL = Mp4ScreenVideoLoadTimeout.CONTROL;
    }

    public RunnableC519000KXa(String str, String str2, boolean z, long j, Runnable runnable) {
        this(str, str2, runnable);
        this.LLIZLLLIL = z;
        this.LLILZLL = j;
    }
}
