package X;

import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Vz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815630Vz7 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C0VSJ c0vsj) {
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SUQzBAAAAAAAIlRTU0UAAAAOAAADTGF2ZjYxLjcuMTAwAAAAAAAAAAAAAAD/8+jAAAAAAAAAAAAASW5mbwAAAA8AAAAeAABXMAAQEBAYGBghISEpKSkpMTExOTk5QkJCQkpKSlJSUlpaWlpjY2Nra2tzc3Nze3t7hISEjIyMjJSUlJycnKWlpaWtra21tbW9vb29xsbGzs7O1tbW1t7e3ufn5+/v7+/39/f///8AAAAATGF2YzYxLjE5AAAAAAAAAAAAAAAAJALAAAAAAAAAVzC/3Lc5");
            sbLIZ.append(u.LJJ(734, "A"));
            sbLIZ.append('D');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("/8+jEAAAAA0gAAAAATEFNRTMuMTAw");
            sbLIZ2.append(u.LJJ(611, "V"));
            sbLIZ2.append("MQU1FMy4xMDB");
            sbLIZ2.append(u.LJJ(307, "V"));
            sb2.append(C2188811AlT.LIZIZ(sbLIZ2));
            String string = sb2.toString();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(string);
            sbLIZ3.append('X');
            sb.append(u.LJJ(29, C2188811AlT.LIZIZ(sbLIZ3)));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(string);
            sbLIZ4.append("U=");
            sb.append(C2188811AlT.LIZIZ(sbLIZ4));
            C09BH.LJIIIIZZ(c0vsj, Base64.decode(sb.toString(), 0));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
