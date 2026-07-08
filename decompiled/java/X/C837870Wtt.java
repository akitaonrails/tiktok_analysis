package X;

import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;

/* JADX INFO: renamed from: X.0Wtt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C837870Wtt {
    public static AdvertisingIdClient.Info LIZIZ(Context context) {
        AdvertisingIdClient.Info infoLIZ = null;
        if (C837910Wtx.LIZIZ) {
            if (C837900Wtw.LIZIZ) {
                try {
                    infoLIZ = LIZ(context, C837880Wtu.LIZIZ);
                    return infoLIZ;
                } catch (C838130WuJ e) {
                    TryCatchGuardChecker.doCheck(e);
                    return infoLIZ;
                }
            }
            AdvertisingIdClient.Info info = C837900Wtw.LIZ;
            if (info != null) {
                return info;
            }
            try {
                infoLIZ = LIZ(context, C837880Wtu.LIZIZ);
            } catch (C838130WuJ e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C837900Wtw.LIZ = infoLIZ;
            return infoLIZ;
        }
        try {
            infoLIZ = LIZ(context, C837880Wtu.LIZIZ);
            return infoLIZ;
        } catch (C838130WuJ e3) {
            TryCatchGuardChecker.doCheck(e3);
            return infoLIZ;
        }
    }

    public static AdvertisingIdClient.Info LIZ(Context context, Cert cert) {
        C825940Wae c825940Wae = new C825940Wae(cert, "getAdvertisingIdInfo", new String[]{"gaid"}, Integer.valueOf(EnumC746240TPa.BPEA_ENTRY.getType()), "Collect", 103000);
        C837860Wts.LIZ(c825940Wae, "com/google/android/gms/ads/identifier/AdvertisingIdClient", "getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;", null);
        return (AdvertisingIdClient.Info) C838080WuE.LIZ(c825940Wae, new C820750WHp(context));
    }
}
