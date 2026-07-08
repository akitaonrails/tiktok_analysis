package X;

import com.bytedance.retrofit2.mime.DigestUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C815620Vz6 {
    public static final String LIZ(C0VSJ c0vsj) {
        Object c098200Yq;
        if (!c0vsj.exists()) {
            return "";
        }
        try {
            c098200Yq = DigestUtil.md5Hex(new C0VSP(c0vsj));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str = (String) c098200Yq;
        if (str == null) {
            return "";
        }
        return str;
    }
}
