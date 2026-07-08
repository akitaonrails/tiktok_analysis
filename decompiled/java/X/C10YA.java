package X;

import android.net.Uri;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.IDeepLinkApi;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.tiktok.kmp.deeplink.IKMPDeeplinkService;
import java.util.List;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10YA, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10YA {
    public static final C10YA LIZ = new C10YA();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(679));

    public static IKMPDeeplinkService LIZ() {
        return (IKMPDeeplinkService) LIZIZ.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return "";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.util.List r4) {
        /*
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1f
            java.lang.Object r3 = r4.next()
            X.080U r3 = (X.C080U) r3
            java.lang.String r2 = r3.LIZ
            r1 = 1
            java.lang.String r0 = "Location"
            boolean r0 = kotlin.text.u.LJIJI(r0, r2, r1)
            if (r0 == 0) goto L4
            java.lang.String r0 = r3.LIZIZ
            if (r0 != 0) goto L21
        L1f:
            java.lang.String r0 = ""
        L21:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10YA.LIZIZ(java.util.List):java.lang.String");
    }

    public static boolean LIZJ(Uri uri) {
        if (C19262710Xp.LIZIZ(uri) || (!Intrinsics.LJFF("link.e.tiktok.com", uri.getHost()))) {
            return true;
        }
        return false;
    }

    public static String LIZLLL(String str) {
        C2175508fh c2175508fh;
        int i;
        String strLIZIZ = "";
        boolean z = true;
        try {
            C1493620oyG c1493620oyG = new C1493620oyG();
            c1493620oyG.LJIILLIIL = false;
            c1493620oyG.LJIIIZ = true;
            C0X9S<TypedInput> c0x9sFetchLongUrl = ((IDeepLinkApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(str).create(IDeepLinkApi.class)).fetchLongUrl(str, c1493620oyG);
            C0X52<TypedInput> c0x52Execute = c0x9sFetchLongUrl.execute();
            if (c0x52Execute != null && (i = (c2175508fh = c0x52Execute.LIZ).LIZIZ) >= 300 && i < 400) {
                C10YA c10ya = LIZ;
                List<C080U> list = c2175508fh.LIZLLL;
                c10ya.getClass();
                strLIZIZ = LIZIZ(list);
                c0x9sFetchLongUrl.cancel();
                return strLIZIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (((Boolean) C275880Ara.LIZ.getValue()).booleanValue()) {
                if (str.length() <= 0) {
                    z = false;
                }
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("transUrlByRedirect: ");
                    sbLIZ.append(str);
                    C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        return strLIZIZ;
    }

    public static String LJ(String str) {
        boolean z;
        try {
            C10YM.LIZ.getClass();
            return C10YM.LIZIZ.transUrlCall(str).execute().LIZIZ.longUrl;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (((Boolean) C275880Ara.LIZ.getValue()).booleanValue()) {
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("transUrlByShareLinkApi: ");
                    sbLIZ.append(str);
                    C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
                    return "";
                }
                return "";
            }
            return "";
        }
    }

    public static void LJFF(Uri uri, String str, boolean z) {
        if (z) {
            return;
        }
        boolean z2 = C19264310Yf.LIZ().isEnable;
        IKMPDeeplinkService iKMPDeeplinkServiceLIZ = LIZ();
        if (iKMPDeeplinkServiceLIZ != null) {
            iKMPDeeplinkServiceLIZ.LIZJ();
            C10ZO c10zo = C10ZO.LIZ;
            C10ZO.LJIIIIZZ(z2);
        }
        if (!z2) {
            return;
        }
        long j = C19264310Yf.LIZ().maxTimeLimit;
        int i = C19264310Yf.LIZ().maxRecordSize;
        IKMPDeeplinkService iKMPDeeplinkServiceLIZ2 = LIZ();
        if (iKMPDeeplinkServiceLIZ2 != null) {
            iKMPDeeplinkServiceLIZ2.LIZJ();
            C10ZO c10zo2 = C10ZO.LIZ;
            C10ZO.LJIIIZ(i, uri.toString(), j, str);
        }
    }
}
