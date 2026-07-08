package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.creatortools.AdAuthorizationApi;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TGH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TGH {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(178));

    public static n LIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                ((p) LIZ.getValue()).getClass();
                return p.LIZJ(str).LJIILIIL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        }
        return null;
    }

    public static void LIZIZ(final Context context, final boolean z, final C0TGI c0tgi, boolean z2) {
        HashMap map = new HashMap();
        map.put("ad_authorization", Boolean.valueOf(z));
        map.put("confirmed", Boolean.valueOf(z2));
        if (c0tgi != null) {
            c0tgi.onLoading();
        }
        AdAuthorizationApi.LIZ.getClass();
        C742580TAy.LIZIZ.requestAdAuthorization(map).enqueue(new InterfaceC594300NSq<String>() { // from class: X.0TGJ
            @Override // X.InterfaceC594300NSq
            public final void onFailure(C0X9S<String> c0x9s, Throwable th) {
                C0TGI c0tgi2 = c0tgi;
                if (c0tgi2 != null) {
                    c0tgi2.onFailed();
                }
                C1389890mGx c1389890mGx = new C1389890mGx(C1388190mED.LIZ(context));
                c1389890mGx.LJIIJ("Request Failed");
                c1389890mGx.LJIIJJI();
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0026 A[Catch: UnsupportedOperationException -> 0x00a2, PHI: r2
              0x0026: PHI (r2v5 java.lang.String) = (r2v0 java.lang.String), (r2v6 java.lang.String) binds: [B:12:0x0020, B:14:0x0024] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {UnsupportedOperationException -> 0x00a2, blocks: (B:9:0x0014, B:11:0x001c, B:15:0x0026, B:17:0x002e, B:19:0x0034, B:21:0x003a), top: B:58:0x0014 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0041 A[PHI: r2
              0x0041: PHI (r2v1 java.lang.String) = (r2v5 java.lang.String), (r2v5 java.lang.String), (r2v5 java.lang.String), (r2v6 java.lang.String) binds: [B:16:0x002c, B:18:0x0032, B:20:0x0038, B:14:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC594300NSq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onResponse(X.C0X9S<java.lang.String> r8, X.C0X52<java.lang.String> r9) {
                /*
                    Method dump skipped, instruction units count: 218
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0TGJ.onResponse(X.0X9S, X.0X52):void");
            }
        });
    }
}
