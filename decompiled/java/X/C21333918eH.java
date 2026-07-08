package X;

import android.graphics.RenderNode;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18eH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21333918eH {
    public static volatile C21333918eH LIZ;

    public static C21333918eH LIZIZ() {
        if (LIZ == null) {
            synchronized (C21333918eH.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C21333918eH();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static C21338318ez LIZ(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            C21338318ez c21338318ez = new C21338318ez();
            if (str != null) {
                c21338318ez.LIZ = str;
            }
            try {
                String str2 = c21338318ez.LIZ;
                if (str2 == null) {
                    str2 = "MynaRenderNode";
                }
                c21338318ez.LIZIZ = new RenderNode(str2);
                return c21338318ez;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException("Failed to initialize RenderNode via renderNodeCompat", e);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RenderNode is not supported on API ");
        sbLIZ.append(i);
        sbLIZ.append(". Minimum required API is ");
        sbLIZ.append(21);
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
