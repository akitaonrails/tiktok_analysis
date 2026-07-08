package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0WDC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WDC implements InterfaceC819390WCj {
    public final C819940WEm LIZ;
    public final ConnectivityManager LIZIZ;
    public final Context LIZJ;
    public final URL LIZLLL;
    public final C0WC2 LJ;
    public final C0WC2 LJFF;
    public final int LJI;

    public static URL LIZJ(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid url: ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0287, code lost:
    
        r2.LJFF = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x028b, code lost:
    
        if (r2.LIZ != null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x028d, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append("");
        r1.append(" requestTimeMs");
        r6 = X.C2188811AlT.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x029f, code lost:
    
        if (r2.LIZIZ != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x02a1, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(r6);
        r1.append(" requestUptimeMs");
        r6 = X.C2188811AlT.LIZIZ(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02b5, code lost:
    
        if (r6.isEmpty() == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x02b7, code lost:
    
        r3.add(new X.C0WEH(r2.LIZ.longValue(), r2.LIZIZ.longValue(), r2.LIZJ, r2.LIZLLL, r2.LJ, r2.LJFF, r2.LJI));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x02f7, code lost:
    
        r0 = X.C2188811AlT.LIZ();
        r0.append("Missing required properties:");
        r0.append(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x030a, code lost:
    
        throw new java.lang.IllegalStateException(X.C2188811AlT.LIZIZ(r0));
     */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0WDD] */
    @Override // X.InterfaceC819390WCj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C819300WCa LIZ(X.C819470WCr r32) {
        /*
            Method dump skipped, instruction units count: 930
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WDC.LIZ(X.0WCr):X.0WCa");
    }

    @Override // X.InterfaceC819390WCj
    public final C0WCF LIZIZ(C0WCG c0wcg) throws Throwable {
        int iLJLLILLLL;
        int iLJLL;
        NetworkInfo networkInfoLJIJ = C786410Ut5.LJIJ(this.LIZIZ);
        C819250WBv c819250WBvLJIIIIZZ = c0wcg.LJIIIIZZ();
        int i = Build.VERSION.SDK_INT;
        Map<String, String> map = c819250WBvLJIIIIZZ.LJFF;
        if (map != null) {
            map.put("sdk-version", String.valueOf(i));
            c819250WBvLJIIIIZZ.LIZ("model", Build.MODEL);
            c819250WBvLJIIIIZZ.LIZ("hardware", Build.HARDWARE);
            c819250WBvLJIIIIZZ.LIZ("device", Build.DEVICE);
            c819250WBvLJIIIIZZ.LIZ("product", Build.PRODUCT);
            c819250WBvLJIIIIZZ.LIZ("os-uild", Build.ID);
            c819250WBvLJIIIIZZ.LIZ("manufacturer", Build.MANUFACTURER);
            c819250WBvLJIIIIZZ.LIZ("fingerprint", Build.FINGERPRINT);
            Calendar.getInstance();
            long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / LSPassThroughRecordSizeConfig.DEFAULT;
            Map<String, String> map2 = c819250WBvLJIIIIZZ.LJFF;
            if (map2 != null) {
                map2.put("tz-offset", String.valueOf(offset));
                if (networkInfoLJIJ == null) {
                    iLJLLILLLL = C0WDE.NONE.getValue();
                } else {
                    iLJLLILLLL = C2204961BRm.LJLLILLLL(networkInfoLJIJ, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz50+GPobFdFnURDI6vGJGz7JkgqDVSdRUutPmGhNVjxSSrxjJ0=", new String[]{"016a9"}));
                }
                Map<String, String> map3 = c819250WBvLJIIIIZZ.LJFF;
                if (map3 != null) {
                    map3.put("net-type", String.valueOf(iLJLLILLLL));
                    int i2 = -1;
                    if (networkInfoLJIJ == null) {
                        iLJLL = C0V99.UNKNOWN_MOBILE_SUBTYPE.getValue();
                    } else {
                        iLJLL = C2204961BRm.LJLL(networkInfoLJIJ, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz50+GPobFdFnURDI6vGJGz7JkgqDVSdRUutPmGhNVjxSSrxjJ0=", new String[]{"016a9"}));
                        if (iLJLL == -1) {
                            iLJLL = C0V99.COMBINED.getValue();
                        } else if (C0V99.forNumber(iLJLL) == null) {
                            iLJLL = 0;
                        }
                    }
                    Map<String, String> map4 = c819250WBvLJIIIIZZ.LJFF;
                    if (map4 != null) {
                        map4.put("mobile-subtype", String.valueOf(iLJLL));
                        c819250WBvLJIIIIZZ.LIZ("country", C2204961BRm.g0(Locale.getDefault(), new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz50+GPobFdFnURDI6vGJGz7JkgqDVSdRUutPmGhNVjxSSrxjJ0=", new String[]{"016a9"})));
                        c819250WBvLJIIIIZZ.LIZ("locale", C786410Ut5.t2(Locale.getDefault()));
                        c819250WBvLJIIIIZZ.LIZ("mcc_mnc", C2204961BRm.LLIL((TelephonyManager) C786410Ut5.H2(this.LIZJ, "phone"), new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz50+GPobFdFnURDI6vGJGz7JkgqDVSdRUutPmGhNVjxSSrxjJ0=", new String[]{"016a9"})));
                        Context context = this.LIZJ;
                        try {
                            i2 = C786410Ut5.Y3(context.getPackageManager(), context.getPackageName(), 0).versionCode;
                        } catch (PackageManager.NameNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1894007bO.LIZ("CctTransportBackend");
                        }
                        c819250WBvLJIIIIZZ.LIZ("application_build", Integer.toString(i2));
                        return c819250WBvLJIIIIZZ.LIZIZ();
                    }
                    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                }
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public C0WDC(Context context, C0WC2 c0wc2, C0WC2 c0wc22) {
        C819930WEl c819930WEl = new C819930WEl();
        C0WER.LIZ(c819930WEl);
        c819930WEl.LIZLLL = true;
        this.LIZ = new C819940WEm(c819930WEl);
        this.LIZJ = context;
        this.LIZIZ = (ConnectivityManager) C786410Ut5.H2(context, "connectivity");
        this.LIZLLL = LIZJ(C819190WBp.LIZJ);
        this.LJ = c0wc22;
        this.LJFF = c0wc2;
        this.LJI = 130000;
    }
}
