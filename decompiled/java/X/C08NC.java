package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.08NC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08NC {
    public static volatile boolean LIZ;
    public static List<C08ND> LIZIZ = new ArrayList();
    public static final Lock LIZJ;
    public static final Lock LIZLLL;

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        LIZJ = reentrantReadWriteLock.readLock();
        LIZLLL = reentrantReadWriteLock.writeLock();
    }

    public static String LIZ(URI uri) {
        boolean z;
        try {
            LIZJ.lock();
            Iterator<C08ND> it2 = LIZIZ.iterator();
            while (true) {
                if (it2.hasNext()) {
                    try {
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (it2.next().LIZ(uri)) {
                        LIZJ.unlock();
                        z = true;
                        break;
                    }
                } else {
                    LIZJ.unlock();
                    z = false;
                    break;
                }
            }
            if (z) {
                return UUID.randomUUID().toString();
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZJ.unlock();
            throw th;
        }
    }

    public static void LIZIZ(JSONArray jSONArray, int i) {
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String strOptString = jSONArray.optString(i2);
                    if (!TextUtils.isEmpty(strOptString)) {
                        C08ND c08nd = new C08ND();
                        try {
                            c08nd.LIZ = PatternProtector.compile(strOptString);
                            arrayList.add(c08nd);
                        } catch (PatternSyntaxException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
                try {
                    Lock lock = LIZLLL;
                    lock.lock();
                    LIZIZ = arrayList;
                    lock.unlock();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    LIZLLL.unlock();
                    throw th;
                }
            }
            LIZ = true;
            return;
        }
        LIZ = false;
    }
}
