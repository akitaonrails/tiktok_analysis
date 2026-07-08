package X;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0X33, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0X33 {
    public C0XLQ LIZ;
    public C0XLQ LIZIZ;
    public String LIZJ;
    public C0X1U LIZLLL;
    public AbstractC842530X3j LJ;
    public Map<Class<?>, Object> LJFF;

    public final Request LIZIZ() {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(400208, "okhttp3/Request$Builder", "build", this, new Object[0], "okhttp3.Request", new C0WZW(false, "()Lokhttp3/Request;", new C0WZX("ezR2SBYqDITuUEY0QAGQ", null)));
        if (c0wsuLIZIZ.LIZ) {
            return (Request) c0wsuLIZIZ.LIZIZ;
        }
        if (this.LIZ != null) {
            return new Request(this);
        }
        throw new IllegalStateException("url == null");
    }

    public C0X33() {
        this.LJFF = Collections.emptyMap();
        this.LIZJ = "GET";
        this.LIZLLL = new C0X1U();
    }

    public C0X33(Request request) {
        Map<Class<?>, Object> linkedHashMap;
        this.LJFF = Collections.emptyMap();
        this.LIZ = request.url;
        this.LIZJ = request.method;
        this.LJ = request.body;
        if (request.tags.isEmpty()) {
            linkedHashMap = Collections.emptyMap();
        } else {
            linkedHashMap = new LinkedHashMap<>(request.tags);
        }
        this.LJFF = linkedHashMap;
        this.LIZLLL = request.headers.LJI();
        this.LIZIZ = request.originUrl;
    }

    public final void LJ(String str) {
        String strLIZIZ = str;
        if (strLIZIZ != null) {
            if (strLIZIZ.regionMatches(true, 0, "ws:", 0, 3)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("http:");
                sbLIZ.append(strLIZIZ.substring(3));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else if (strLIZIZ.regionMatches(true, 0, "wss:", 0, 4)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("https:");
                sbLIZ2.append(strLIZIZ.substring(4));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            this.LIZIZ = C0XLQ.LJIIIZ(strLIZIZ);
            return;
        }
        throw new NullPointerException("url == null");
    }

    public final void LJFF(String str) {
        this.LIZLLL.LIZLLL(str);
    }

    public final void LJII(String str) {
        String strLIZIZ = str;
        if (strLIZIZ != null) {
            if (strLIZIZ.regionMatches(true, 0, "ws:", 0, 3)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("http:");
                sbLIZ.append(strLIZIZ.substring(3));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else if (strLIZIZ.regionMatches(true, 0, "wss:", 0, 4)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("https:");
                sbLIZ2.append(strLIZIZ.substring(4));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            LJIIIIZZ(C0XLQ.LJIIIZ(strLIZIZ));
            return;
        }
        throw new NullPointerException("url == null");
    }

    public final void LJIIIIZZ(C0XLQ c0xlq) {
        if (c0xlq != null) {
            this.LIZ = c0xlq;
            return;
        }
        throw new NullPointerException("url == null");
    }

    public final void LIZ(String str, String str2) {
        this.LIZLLL.LIZ(str, str2);
    }

    public final void LIZJ(String str, String str2) {
        this.LIZLLL.LJ(str, str2);
    }

    public final void LIZLLL(String str, AbstractC842530X3j abstractC842530X3j) {
        if (str != null) {
            if (str.length() != 0) {
                if (abstractC842530X3j != null) {
                    if (!C0X34.LIZ(str)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("method ");
                        sbLIZ.append(str);
                        sbLIZ.append(" must not have a request body.");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("method ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" must have a request body.");
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                this.LIZJ = str;
                this.LJ = abstractC842530X3j;
                return;
            }
            throw new IllegalArgumentException("method.length() == 0");
        }
        throw new NullPointerException("method == null");
    }

    public final void LJI(Class cls, Object obj) {
        if (cls != null) {
            if (obj == null) {
                this.LJFF.remove(cls);
                return;
            }
            if (this.LJFF.isEmpty()) {
                this.LJFF = new LinkedHashMap();
            }
            this.LJFF.put(cls, cls.cast(obj));
            return;
        }
        throw new NullPointerException("type == null");
    }
}
