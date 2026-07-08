package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0gn3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179150gn3 {
    public static final Integer LIZ(Context context, String str) {
        Object c098200Yq;
        try {
            c098200Yq = C2248361CzK.LJ(context, str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num == null) {
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_COLOR_UNAVAILABLE;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, str, null, null);
        }
        return num;
    }

    public static final C698190Ra5 LIZIZ(Context context, String str) {
        Object c098200Yq;
        try {
            c098200Yq = C2248361CzK.LJFF(context, str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C698190Ra5 c698190Ra5 = (C698190Ra5) c098200Yq;
        if (c698190Ra5 == null) {
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_ICON_UNAVAILABLE;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, str, null, null);
        }
        return c698190Ra5;
    }
}
