package X;

import android.os.Handler;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0C8O, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8O {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final Map<String, Long> LIZLLL;
    public static long LJ;
    public static int LJFF;
    public static final C01GW LJI;
    public static final C0C8M LJII;

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        LIZ = C452501pT.LIZ(enumC452301pR, new C297060Bke());
        LIZIZ = C452501pT.LIZ(enumC452301pR, new C0C8N());
        LIZJ = C452501pT.LIZ(enumC452301pR, new C303720BvO());
        LIZLLL = new LinkedHashMap();
        LJI = C452501pT.LIZIZ(new C0C2G());
        LJII = C0C8M.LL;
    }

    public static int LIZIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static void LIZLLL() {
        LJ = System.currentTimeMillis();
        C786410Ut5.LJLIIL(((Number) LIZIZ.getValue()).longValue(), (Handler) LJI.getValue(), LJII);
    }

    public static boolean LIZ(Request request) {
        if (LIZIZ() != 0) {
            if (!C13LQ.LJIILLIIL(request.getPath(), (Object[]) LIZJ.getValue())) {
                boolean z = false;
                if (Intrinsics.LJFF("GET", request.getMethod())) {
                    return false;
                }
                if (!Intrinsics.LJFF("POST", request.getMethod())) {
                    return true;
                }
                String strMimeType = request.getBody().mimeType();
                if (a0.LJJIIZI(strMimeType, "application/x-www-form-urlencoded", false) || a0.LJJIIZI(strMimeType, "application/json", false)) {
                    z = true;
                }
                return !z;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.String] */
    public static void LIZJ(final Request request, C0X52 c0x52, final long j, final String str) {
        TypedOutput body;
        String strMd5Stub;
        for (C080U c080u : c0x52.LIZ.LIZLLL) {
            if (Intrinsics.LJFF("x-tt-logid", c080u.LIZ)) {
                final String str2 = c080u.LIZIZ;
                final C259800zU c259800zU = new C259800zU();
                c259800zU.element = request.getUrl();
                if (Intrinsics.LJFF(request.getMethod(), "POST") && (body = request.getBody()) != null && (strMd5Stub = body.md5Stub()) != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) c259800zU.element);
                    sbLIZ.append("&postbodymd5=");
                    sbLIZ.append(strMd5Stub);
                    c259800zU.element = C2188811AlT.LIZIZ(sbLIZ);
                }
                C786410Ut5.LJJZZIII((Handler) LJI.getValue(), new Runnable() { // from class: X.0C8P
                    public final void LIZ() {
                        C01GW c01gw = C0C8O.LIZ;
                        String str3 = c259800zU.element;
                        String path = request.getPath();
                        String method = request.getMethod();
                        long j2 = j;
                        String str4 = str2;
                        String str5 = str;
                        Map<String, Long> map = C0C8O.LIZLLL;
                        Long l = (Long) ((LinkedHashMap) map).get(str3);
                        if (l != null) {
                            long jLongValue = j2 - l.longValue();
                            if (jLongValue < C0C8O.LIZIZ()) {
                                C793770VBv.LJII("repeat_request_quickly", new JSONObject().put("limitTime", C0C8O.LIZIZ()).put("urlPath", path).put("method", method).put("activityName", str5), new JSONObject().put("passTime", (int) jLongValue), new JSONObject().put("logId", str4));
                            }
                        }
                        map.put(str3, Long.valueOf(j2));
                        C0C8O.LIZLLL();
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("RepeatRequestQuicklyMob@5bda.mob$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("RepeatRequestQuicklyMob@5bda.mob$1");
                    }
                });
                return;
            }
        }
    }
}
