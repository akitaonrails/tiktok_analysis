package X;

import android.net.Uri;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import okhttp3.Request;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X0S, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X0S implements InterfaceC841900X0y, InterfaceC841910X0z, C0X0V {
    public static String LIZ;
    public static final Keva LIZIZ = KevaImpl.getRepo("x-tt-cmpl-token", 1);

    @Override // X.InterfaceC841910X0z
    public final C841880X0w<Request, C0XLY> LIZ(C841880X0w<Request, C0XLY> c841880X0w) {
        return c841880X0w;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[PHI: r7
      0x0058: PHI (r7v4 java.lang.String) = (r7v2 java.lang.String), (r7v0 java.lang.String) binds: [B:20:0x0056, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJII() {
        /*
            r10 = this;
            java.lang.String r0 = X.C0X0S.LIZ
            if (r0 == 0) goto La
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 == 0) goto L67
        La:
            com.bytedance.keva.Keva r2 = X.C0X0S.LIZIZ
            java.lang.String r3 = ""
            java.lang.String r0 = LJ(r3)
            java.lang.String r7 = r2.getString(r0, r3)
            if (r7 == 0) goto L1e
            boolean r0 = kotlin.text.a0.LJJJIL(r7)
            if (r0 == 0) goto L58
        L1e:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r0 = com.ss.android.ugc.aweme.framework.services.IUserService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.ss.android.ugc.aweme.framework.services.IUserService) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurrentUser()
            java.lang.String r1 = r0.getUid()
            if (r1 == 0) goto L67
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 != 0) goto L67
            r0 = 0
            r7 = 0
            if (r0 != 0) goto L67
            java.lang.String r1 = LJ(r1)
            boolean r0 = r2.contains(r1)
            if (r0 == 0) goto L4c
            java.lang.String r7 = r2.getString(r1, r3)
        L4c:
            java.lang.String r5 = "keva"
            r6 = 0
            r9 = 10
            r4 = r10
            r8 = r6
            LJIIIZ(r4, r5, r6, r7, r8, r9)
            if (r7 == 0) goto L67
        L58:
            boolean r0 = kotlin.text.a0.LJJJIL(r7)
            if (r0 != 0) goto L67
            X.C0X0S.LIZ = r7
            java.lang.String r0 = LJ(r3)
            r2.storeString(r0, r7)
        L67:
            java.lang.String r0 = X.C0X0S.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X0S.LJII():java.lang.String");
    }

    public static String LJ(String str) {
        if (a0.LJJJIL(str)) {
            return "x-tt-cmpl-token";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("x-tt-cmpl-token_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LJIIIIZZ(String str) {
        String host;
        if (str == null || a0.LJJJIL(str)) {
            return false;
        }
        Uri uri = UriProtector.parse(str);
        if (uri != null) {
            host = uri.getHost();
        } else {
            host = null;
        }
        C844470XAv.LIZ.getClass();
        List<String> listLJ = C1493400oxu.LJIIJ(C844470XAv.LIZ()).LJ(host);
        if (host != null && !a0.LJJJIL(host) && listLJ != null && !((CopyOnWriteArrayList) listLJ).isEmpty()) {
            Iterator it2 = ((CopyOnWriteArrayList) listLJ).iterator();
            while (it2.hasNext()) {
                if (u.LJIIZILJ(host, (String) it2.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [Q, com.bytedance.retrofit2.client.Request] */
    @Override // X.InterfaceC841900X0y
    public final C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> LIZIZ(C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> c841880X0w) {
        ArrayList arrayList;
        com.bytedance.retrofit2.client.Request request = c841880X0w.LIZ;
        if (request != null) {
            String url = request.getUrl();
            if (request != null && LJIIIIZZ(url)) {
                List<C080U> headers = request.getHeaders();
                if (headers != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C080U c080u : headers) {
                        if (!Intrinsics.LJFF(c080u.LIZ, "x-tt-cmpl-token")) {
                            arrayList2.add(c080u);
                        }
                    }
                    arrayList = new ArrayList(arrayList2);
                } else {
                    arrayList = new ArrayList();
                }
                StringBuilder sb = new StringBuilder();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("login=");
                sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() ? 1 : 0);
                sbLIZ.append(';');
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ct=");
                C01GW<C1916120zxi> c01gw = C1916120zxi.LIZLLL;
                sbLIZ2.append(C1916110zxh.LIZLLL() ? 1 : 0);
                sbLIZ2.append(';');
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("rt=");
                sbLIZ3.append(C1916110zxh.LIZIZ());
                sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                arrayList.add(new C080U("x-tt-dm-status", sb.toString()));
                String strLJII = LJII();
                if (strLJII != null && !a0.LJJJIL(strLJII)) {
                    arrayList.add(new C080U("x-tt-cmpl-token", strLJII));
                } else {
                    LJIIIZ(this, "no token", url, null, "2", 4);
                }
                C0XMB c0xmbNewBuilder = request.newBuilder();
                c0xmbNewBuilder.LIZJ = arrayList;
                c841880X0w.LIZ = c0xmbNewBuilder.LIZ();
            }
        }
        return c841880X0w;
    }

    @Override // X.InterfaceC841910X0z
    public final C841880X0w<Request, C0XLY> LJFF(C841880X0w<Request, C0XLY> c841880X0w) {
        String str;
        C0X1U c0x1u;
        Request request = c841880X0w.LIZ;
        if (request != null) {
            C0XLQ c0xlqUrl = request.url();
            if (c0xlqUrl != null) {
                str = c0xlqUrl.LJIIIIZZ;
            } else {
                str = null;
            }
            if (request != null && LJIIIIZZ(str)) {
                String strLJII = LJII();
                if (strLJII != null && !a0.LJJJIL(strLJII)) {
                    C0X1V c0x1vHeaders = request.headers();
                    if (c0x1vHeaders != null) {
                        c0x1u = c0x1vHeaders.LJI();
                    } else {
                        c0x1u = new C0X1U();
                    }
                    c0x1u.LJ("x-tt-cmpl-token", strLJII);
                    C0X33 c0x33NewBuilder = request.newBuilder();
                    C0X1V c0x1v = new C0X1V(c0x1u);
                    c0x33NewBuilder.getClass();
                    c0x33NewBuilder.LIZLLL = c0x1v.LJI();
                } else {
                    LJIIIZ(this, "no token", str, null, "4", 4);
                    return c841880X0w;
                }
            }
        }
        return c841880X0w;
    }

    @Override // X.InterfaceC841900X0y
    public final C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> LJI(C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> c841880X0w) {
        String url;
        C0X52<?> c0x52;
        List<C080U> list;
        C080U next;
        String str;
        com.bytedance.retrofit2.client.Request request = c841880X0w.LIZ;
        if (request != null) {
            url = request.getUrl();
        } else {
            url = null;
        }
        if (LJIIIIZZ(url) && (c0x52 = c841880X0w.LIZIZ) != null && (list = c0x52.LIZ.LIZLLL) != null) {
            Iterator<C080U> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZ.toLowerCase(Locale.ROOT), "x-tt-cmpl-token")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C080U c080u = next;
            if (c080u != null && (str = c080u.LIZIZ) != null && !a0.LJJJIL(str)) {
                LIZ = str;
                LIZIZ.storeString(LJ(""), str);
            }
        }
        return c841880X0w;
    }

    public static void LJIIIZ(C0X0S c0x0s, String str, String str2, String str3, String str4, int i) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        c0x0s.getClass();
        try {
            String uid = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("op", str);
            jSONObject.put("uid", uid);
            if (str2 != null) {
                jSONObject.put("url", str2);
            }
            if (str3 != null) {
                jSONObject.put("value", str3);
            }
            if (str4 != null) {
                jSONObject.put("netType", str4);
            }
            C793770VBv.LJ(EnumC841820X0q.PENETRATE_HEADER_LOG.getLogType(), jSONObject);
            C786410Ut5.J3(jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
