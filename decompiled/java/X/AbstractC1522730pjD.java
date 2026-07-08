package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pjD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1522730pjD {
    public static final List<Integer> LJII = C1697810uHb.LJIIJJI(408, 503, 504);
    public final int LIZ;
    public final Map<String, String> LIZIZ;
    public AbstractC1522680pj8 LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final Integer LJFF;
    public final C1522740pjE LJI;

    public abstract InputStream LIZIZ();

    public JSONObject LIZLLL() {
        return null;
    }

    public JSONObject LJI() {
        return null;
    }

    public JSONObject LJII() {
        return null;
    }

    public final void close() {
        Unit unit;
        try {
            C189200o6.m2constructorimpl(Boolean.valueOf(this.LIZJ.cancel()));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            InputStream inputStreamLIZIZ = LIZIZ();
            if (inputStreamLIZIZ != null) {
                inputStreamLIZIZ.close();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public final boolean LJFF(Map<String, String> map) {
        Long lLJIILIIL;
        long jLongValue;
        Long lLJIILIIL2;
        if (this.LIZ != 304) {
            if (map != null) {
                String str = map.get("content-md5");
                if (str == null || !Intrinsics.LJFF(str, this.LIZIZ.get("content-md5"))) {
                    String str2 = map.get("last-modified");
                    if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                        long jLongValue2 = lLJIILIIL.longValue();
                        String str3 = this.LIZIZ.get("last-modified");
                        if (str3 != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str3)) != null) {
                            jLongValue = lLJIILIIL2.longValue();
                        } else {
                            jLongValue = Long.MAX_VALUE;
                        }
                        if (jLongValue2 >= jLongValue) {
                            return true;
                        }
                    }
                    String str4 = map.get("etag");
                    if (str4 != null && Intrinsics.LJFF(str4, this.LIZIZ.get("etag"))) {
                        return true;
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0pjE] */
    public AbstractC1522730pjD(int i, Map<String, String> map, AbstractC1522680pj8 abstractC1522680pj8, String str) {
        Integer numLJIIJJI;
        this.LIZ = i;
        this.LIZIZ = map;
        this.LIZJ = abstractC1522680pj8;
        this.LIZLLL = str;
        C1529710puT.LIZ.getClass();
        boolean z = true;
        if (200 <= i && i < 301 && i != 206 && !Intrinsics.LJFF(map.get("vary"), "*") && !map.containsKey("range")) {
            String str2 = map.get("cache-control");
            if (str2 != null) {
                Iterator<String> it2 = C1529710puT.LIZIZ.iterator();
                while (it2.hasNext()) {
                    if (a0.LJJIIZI(str2, it2.next(), false)) {
                        z = false;
                        break;
                    }
                }
            }
        } else {
            z = false;
            break;
        }
        this.LJ = z;
        String str3 = this.LIZIZ.get("content-length");
        if (str3 != null) {
            numLJIIJJI = C2095008Iq.LJIIJJI(str3);
        } else {
            numLJIIJJI = null;
        }
        this.LJFF = numLJIIJJI;
        this.LJI = new AbstractC1528710psr() { // from class: X.0pjE
            public volatile boolean LL;

            @Override // X.AbstractC1528710psr, X.AbstractC1533800q14
            public final String toString() {
                return "ForestNetProvider";
            }

            @Override // X.AbstractC1533800q14
            public final Integer LIZIZ() {
                return this.LLILLJJLI.LJFF;
            }

            @Override // X.AbstractC1533800q14
            public final boolean LJI() {
                return !this.LL;
            }

            @Override // X.AbstractC1533800q14
            public final InputStream LJIILLIIL() {
                if (this.LL) {
                    return null;
                }
                this.LL = true;
                return this.LLILLJJLI.LIZIZ();
            }
        };
    }
}
