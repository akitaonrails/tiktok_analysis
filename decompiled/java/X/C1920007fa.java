package X;

import com.bytedance.i18n.location.api.Address;
import com.bytedance.i18n.location.api.internal.GsonHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;

/* JADX INFO: renamed from: X.07fa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1920007fa {
    public static Address LIZ(String str) {
        Object c098200Yq;
        try {
            c098200Yq = (Address) ((Gson) GsonHelper.LIZ.getValue()).LJII(str, Address.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        return (Address) c098200Yq;
    }
}
