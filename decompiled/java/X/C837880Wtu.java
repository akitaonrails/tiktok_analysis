package X;

import android.util.LruCache;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wtu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837880Wtu {
    public static final Cert LIZ = CertProviderManagerKt.findCert("bpea-get_country_carrier", 1476440065);
    public static final Cert LIZIZ = CertProviderManagerKt.findCert("bpea-get_gaid", 1476444161);

    public static final Object LIZ(LruCache lruCache, Object obj, Function0 function0) {
        Object obj2;
        boolean z;
        try {
            Object obj3 = lruCache.get(obj);
            Object obj4 = null;
            if (obj3 == null) {
                obj3 = null;
            }
            if (obj3 == null) {
                try {
                    Object objInvoke = function0.invoke();
                    if (obj != null && objInvoke != null) {
                        lruCache.put(obj, objInvoke);
                    }
                    if (objInvoke != null) {
                        obj4 = objInvoke;
                    }
                } catch (C838130WuJ e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                obj4 = obj3;
            }
            if (obj4 == null) {
                obj2 = "";
            } else {
                obj2 = obj4;
            }
            C0VE0 c0ve0 = C837910Wtx.LJ;
            if (c0ve0 != null) {
                if (obj4 == null) {
                    z = true;
                } else {
                    z = false;
                }
                c0ve0.LIZ(z, obj);
            }
            return obj2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0VE0 c0ve02 = C837910Wtx.LJ;
            if (c0ve02 != null) {
                c0ve02.LIZIZ(obj, th);
            }
            throw th;
        }
    }
}
