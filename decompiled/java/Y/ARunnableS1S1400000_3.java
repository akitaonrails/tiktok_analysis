package Y;

import X.C013C;
import X.C08KC;
import X.C09N5;
import X.C0VSJ;
import X.C0WZX;
import X.C1C7U;
import X.C2204961BRm;
import X.C2471909mP;
import X.C2472609mW;
import X.C259800zU;
import X.InterfaceC2286808xe;
import android.net.Uri;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ARunnableS1S1400000_3 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((C013C) this.l1).element) {
            return;
        }
        ((C2472609mW) this.l2).cancel();
        String strLIZ = C09N5.LIZ(C2471909mP.LIZ.LJII(), (Uri) this.l3);
        if (strLIZ == null || strLIZ.length() == 0) {
            LruCache<String, Boolean> lruCache = C2471909mP.LJIIJ;
            String str = this.s0;
            Boolean bool = Boolean.FALSE;
            lruCache.put(str, bool);
            ((InterfaceC2286808xe) this.l4).LIZ(bool);
            return;
        }
        InterfaceC2286808xe interfaceC2286808xe = (InterfaceC2286808xe) this.l4;
        Boolean boolValueOf = Boolean.valueOf(new C0VSJ(strLIZ).exists());
        C2471909mP.LJIIJ.put(this.s0, Boolean.valueOf(boolValueOf.booleanValue()));
        interfaceC2286808xe.LIZ(boolValueOf);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.String] */
    public static final void run$0(ARunnableS1S1400000_3 aRunnableS1S1400000_3) throws Throwable {
        BufferedReader bufferedReader;
        URL url = (URL) aRunnableS1S1400000_3.l1;
        C259800zU c259800zU = (C259800zU) aRunnableS1S1400000_3.l2;
        String str = aRunnableS1S1400000_3.s0;
        ReentrantLock reentrantLock = (ReentrantLock) aRunnableS1S1400000_3.l3;
        Condition condition = (Condition) aRunnableS1S1400000_3.l4;
        C1C7U.LIZ("OidcSecurityUtil@e468.getRawKeyFromEndPoint$1L");
        URLConnection uRLConnectionE0 = C2204961BRm.e0(url, new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXilqCc7nS0JW+Si2ZMJVQ5lhQJE89mlS2xNkM=", new String[]{"019e5"}));
        if (uRLConnectionE0 != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionE0;
            try {
                try {
                    Reader inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream(), Charsets.UTF_8);
                    if (inputStreamReader instanceof BufferedReader) {
                        bufferedReader = (BufferedReader) inputStreamReader;
                    } else {
                        bufferedReader = new BufferedReader(inputStreamReader, 8192);
                    }
                    String strLIZJ = C08KC.LIZJ(bufferedReader);
                    httpURLConnection.getInputStream().close();
                    c259800zU.element = new JSONObject(strLIZJ).optString(str);
                    httpURLConnection.disconnect();
                    reentrantLock.lock();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.getMessage();
                    httpURLConnection.disconnect();
                    reentrantLock.lock();
                    try {
                        condition.signal();
                    } finally {
                    }
                }
                try {
                    condition.signal();
                    reentrantLock.unlock();
                    C1C7U.LIZIZ("OidcSecurityUtil@e468.getRawKeyFromEndPoint$1L");
                    return;
                } finally {
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    reentrantLock.unlock();
                    throw th;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                    reentrantLock.unlock();
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }

    public static final void run$1(ARunnableS1S1400000_3 aRunnableS1S1400000_3) {
        boolean zLIZ;
        C1C7U.LIZ("FileAdapterUtils@6392.isMediaUriExist$5");
        try {
            aRunnableS1S1400000_3.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FileAdapterUtils@6392.isMediaUriExist$5");
    }

    public ARunnableS1S1400000_3(Object obj, Object obj2, String str, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
        this.l3 = obj3;
        this.l4 = obj4;
    }
}
