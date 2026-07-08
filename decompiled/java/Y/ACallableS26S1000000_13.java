package Y;

import X.C0XHH;
import X.C1C7U;
import X.C848040XOo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes14.dex */
public class ACallableS26S1000000_13 implements Callable {
    public final int $t;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[PHI: r6
      0x007d: PHI (r6v1 java.util.List<java.lang.String>) = 
      (r6v0 java.util.List<java.lang.String>)
      (r6v2 java.util.List<java.lang.String>)
      (r6v2 java.util.List<java.lang.String>)
     binds: [B:27:0x0079, B:16:0x003d, B:18:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$0(Y.ACallableS26S1000000_13 r8) {
        /*
            java.lang.String r7 = "CookieMonitor@73a5.checkCookie$1"
            X.C1C7U.LIZ(r7)
            java.lang.String r1 = r8.s0
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L26
            java.lang.String r0 = "http://"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r1, r0, r2)
            if (r0 != r3) goto L26
            r0 = 1
        L14:
            r5 = 0
            if (r0 != 0) goto L23
            java.lang.String r1 = r8.s0
            if (r1 == 0) goto L74
            java.lang.String r0 = "https://"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r1, r0, r2)
            if (r0 != r3) goto L74
        L23:
            boolean r0 = X.C0X2N.LIZ
            goto L28
        L26:
            r0 = 0
            goto L14
        L28:
            X.0XAv r0 = X.C844470XAv.LIZ     // Catch: java.lang.Exception -> L78
            r0.getClass()     // Catch: java.lang.Exception -> L78
            android.content.Context r0 = X.C844470XAv.LIZ()     // Catch: java.lang.Exception -> L78
            X.0oxu r1 = X.C1493400oxu.LJIIJ(r0)     // Catch: java.lang.Exception -> L78
            java.lang.String r0 = com.ss.android.common.util.NetworkUtils.getShareCookieHost()     // Catch: java.lang.Exception -> L78
            java.util.List r6 = r1.LJ(r0)     // Catch: java.lang.Exception -> L78
            if (r6 == 0) goto L7d
            r1 = r6
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L7d
            java.lang.String r0 = r8.s0
            java.net.URI r4 = java.net.URI.create(r0)
            java.lang.String r0 = r4.getHost()
            java.lang.String r0 = X.C0X2N.LIZJ(r0)
            if (r0 == 0) goto L74
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L74
            android.webkit.CookieManager r3 = X.C786410Ut5.A2()
            java.lang.String r2 = r4.getHost()
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOapbZzLyHyz5tMRGHPcDmMRzptrEI9h6C0U0bY="
            r1.<init>(r0, r5)
            java.lang.String r0 = X.C2204961BRm.LLIZ(r3, r2, r1)
            X.C0X2N.LIZ(r4, r6, r0)
        L74:
            X.C1C7U.LIZIZ(r7)
            return r5
        L78:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            r6 = r5
        L7d:
            X.C0X2N.LJ()
            java.lang.String r0 = r8.s0
            java.lang.String r0 = X.C0X2N.LIZLLL(r0)
            X.C0X2N.LJFF(r0, r5, r6)
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS26S1000000_13.call$0(Y.ACallableS26S1000000_13):java.lang.Object");
    }

    public static final Object call$1(ACallableS26S1000000_13 aCallableS26S1000000_13) {
        C1C7U.LIZ("UserApiPresenter@8386.removeVerification$1");
        String str = C0XHH.LIZ;
        String str2 = aCallableS26S1000000_13.s0;
        String str3 = C0XHH.LIZJ;
        HashMap map = new HashMap();
        map.put("username", str2);
        map.put("process_type", "1");
        C848040XOo.LIZ.getClass();
        NetworkProxyAccount networkProxyAccount = (NetworkProxyAccount) C848040XOo.LIZJ;
        networkProxyAccount.getClass();
        String str4 = networkProxyAccount.LJFF(str3, map, new ArrayList()).LIZIZ;
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.status_code = -1;
        try {
            baseResponse = (BaseResponse) ((NetworkProxyAccount) C848040XOo.LIZJ).LJII().LJII(str4, BaseResponse.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("UserApiPresenter@8386.removeVerification$1");
        return baseResponse;
    }

    public ACallableS26S1000000_13(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
