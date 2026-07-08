package X;

import android.graphics.Typeface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O50, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O50 {
    public static final C0O50 LIZ = new C0O50();
    public static boolean LIZIZ;

    public static void LIZ() {
        File[] fileArrListFiles;
        try {
            String strLIZLLL = C1552050qUV.LIZLLL("comment_activity_font");
            if (strLIZLLL == null || strLIZLLL.length() == 0) {
                return;
            }
            C0VSJ c0vsj = new C0VSJ(strLIZLLL);
            if (c0vsj.exists() && c0vsj.isDirectory() && (fileArrListFiles = c0vsj.listFiles()) != null) {
                for (File file : fileArrListFiles) {
                    Typeface typefaceW4 = C786410Ut5.w4(file);
                    if (!Intrinsics.LJFF(typefaceW4, Typeface.DEFAULT) && C123100dR.LIZ(file.getName())) {
                        ((ConcurrentHashMap) C0O52.LIZ.getValue()).put(file.getName(), typefaceW4);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof RuntimeException) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("runtime");
                sbLIZ.append(e.getMessage());
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }
}
