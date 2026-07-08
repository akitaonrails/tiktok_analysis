package X;

import android.util.Log;
import com.bytedance.crash.AttachUserData;
import com.bytedance.crash.CrashType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.085c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20598085c implements AttachUserData {
    public static String LIZ = "";
    public static final List<Exception> LIZIZ = new ArrayList();
    public static final List<Exception> LIZJ = new ArrayList();
    public static final List<Exception> LIZLLL = new ArrayList();
    public static final List<Exception> LJ = new ArrayList();

    public static String LIZ(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = ((ArrayList) list).iterator();
        while (it2.hasNext()) {
            sb.append("\n------- new line -------\n" + Log.getStackTraceString((Throwable) it2.next()) + "\n------- new line -------\n");
        }
        return sb.toString();
    }

    @Override // com.bytedance.crash.AttachUserData
    public final Map<? extends String, ? extends String> getUserData(CrashType crashType) {
        return C2097608Jq.LJIIJ(new Pair("hox_crash_message", LIZ + LIZ(LIZIZ) + LIZ(LIZJ) + LIZ(LIZLLL) + LIZ(LJ)));
    }
}
