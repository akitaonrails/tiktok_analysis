package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.gamora.celebration.PreloadConfig;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0gCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156540gCa {
    public static final C1156540gCa LIZ = new C1156540gCa();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(24));

    public static PreloadConfig LIZ(String str) {
        boolean z;
        Object c098200Yq;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        Object obj = null;
        if (z) {
            return null;
        }
        try {
            c098200Yq = (PreloadConfig) ((Gson) LIZIZ.getValue()).LJII(str, PreloadConfig.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (PreloadConfig) obj;
    }
}
