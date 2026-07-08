package X;

import android.text.TextUtils;
import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VBd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793590VBd {
    public static final ConcurrentHashMap<String, C793590VBd> LJI = new ConcurrentHashMap<>();
    public static String LJII;
    public static String LJIIIIZZ;
    public static long LJIIIZ;
    public static long LJIIJ;
    public final String LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public long LJFF;

    public final synchronized boolean LJI() {
        if (!this.LIZIZ) {
            return false;
        }
        if (LJFF()) {
            return true;
        }
        return LIZJ();
    }

    public final boolean LIZJ() {
        IHttpService iHttpService;
        String str = TextUtils.isEmpty(LJIIIIZZ) ? LJII : LJIIIIZZ;
        long j = LJIIIZ;
        if (j <= 0) {
            j = LJIIJ;
        }
        if (!TextUtils.isEmpty(str) && j != 0 && (iHttpService = (IHttpService) C792600V7i.LIZ(IHttpService.class)) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("aid", Long.valueOf(j));
                jSONObject.put("os", "Android");
                jSONObject.put("path", this.LIZ);
                C2403609bO c2403609bODoPost = iHttpService.doPost(str, C786410Ut5.J3(jSONObject).getBytes(), null);
                if ((c2403609bODoPost != null) & (c2403609bODoPost.LIZJ != null)) {
                    String strOptString = new JSONObject(new String(c2403609bODoPost.LIZJ)).optString("quota_status");
                    if (TextUtils.isEmpty(strOptString)) {
                        this.LIZIZ = false;
                        this.LIZJ = false;
                        this.LIZLLL = 0;
                        this.LJ = 0;
                        this.LJFF = 0L;
                        return false;
                    }
                    if (!TextUtils.equals(strOptString, "long escape")) {
                        LJII();
                        return true;
                    }
                    this.LIZIZ = false;
                    this.LIZJ = false;
                    this.LIZLLL = 0;
                    this.LJ = 0;
                    this.LJFF = 0L;
                    LJII();
                    return false;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }

    public final void LJII() {
        int i = this.LIZLLL;
        if (i < 6) {
            this.LIZLLL = i + 1;
        }
        this.LJFF = Math.max(System.currentTimeMillis() + (((long) this.LIZLLL) * 5 * 60000), this.LJFF);
    }

    public final boolean LJFF() {
        return System.currentTimeMillis() <= this.LJFF;
    }

    public C793590VBd(String str) {
        this.LIZ = str;
    }

    public static C793590VBd LJ(String str) {
        ConcurrentHashMap<String, C793590VBd> concurrentHashMap = LJI;
        if (concurrentHashMap.get(str) == null) {
            synchronized (C793590VBd.class) {
                try {
                    if (concurrentHashMap.get(str) == null) {
                        concurrentHashMap.put(str, new C793590VBd(str));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return concurrentHashMap.get(str);
    }

    public final synchronized boolean LIZ(C2403609bO c2403609bO) {
        if (c2403609bO != null) {
            int i = c2403609bO.LIZ;
            if (i > 0) {
                if (500 <= i) {
                    if (i <= 600) {
                        if (this.LIZJ) {
                            LJII();
                        }
                        this.LIZJ = true;
                        return true;
                    }
                } else {
                    if (i != 200) {
                    }
                    return false;
                }
                this.LIZJ = true;
                return false;
            }
        }
        if (this.LIZJ) {
            int i2 = this.LJ;
            if (i2 < 5) {
                this.LJ = i2 + 1;
            }
            this.LJFF = Math.max(System.currentTimeMillis() + (((long) ((int) Math.pow(2.0d, this.LJ))) * 15 * 1000), this.LJFF);
        }
        this.LIZJ = true;
        return true;
    }

    public final synchronized boolean LIZIZ(String str) {
        if ("drop data".equals(str)) {
            this.LIZIZ = true;
            LJII();
            return true;
        }
        this.LIZIZ = false;
        this.LIZJ = false;
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJFF = 0L;
        return false;
    }

    public final synchronized void LIZLLL(long j) {
        this.LJFF = Math.max(this.LJFF, System.currentTimeMillis() + (j * 1000));
    }
}
