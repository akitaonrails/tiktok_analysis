package com.appsflyer.internal;

import X.C098200Yq;
import X.C1527930prb;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes24.dex */
public final class AFj1wSDK implements AFj1zSDK {
    @Override // com.appsflyer.internal.AFj1zSDK
    public final String AFInAppEventType() {
        Object c098200Yq;
        Object obj;
        try {
            Field declaredField = C1527930prb.class.getDeclaredField("LIZ");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        c098200Yq = (String) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = "";
        }
        return (String) c098200Yq;
    }
}
