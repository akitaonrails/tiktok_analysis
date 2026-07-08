package com.appsflyer.internal;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class AFa1nSDK extends HashMap<Integer, String> {
    public static AFa1nSDK values;
    public final Object AFInAppEventParameterName = new Object();

    public static synchronized AFa1nSDK afErrorLog() {
        if (values == null) {
            values = new AFa1nSDK();
        }
        return values;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(Object obj) {
        String str;
        synchronized (this.AFInAppEventParameterName) {
            try {
                str = (String) super.remove(obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.AFInAppEventParameterName) {
            try {
                str2 = (String) super.put(num, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str2;
    }

    @Override // java.util.HashMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.AFInAppEventParameterName) {
            try {
                zRemove = super.remove(obj, obj2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zRemove;
    }
}
