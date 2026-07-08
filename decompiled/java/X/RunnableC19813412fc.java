package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12fc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class RunnableC19813412fc implements Runnable {
    public final URL LL;
    public final InterfaceC19801112dd LLILLJJLI;
    public final /* synthetic */ C19810012f4 LLILLL;

    public final void LIZ() throws Throwable {
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> headerFields;
        this.LLILLL.LIZ.LJIIL().LJIJI();
        int responseCode = 0;
        try {
            URL url = this.LL;
            int i = AbstractC19813612fe.LIZ;
            synchronized (AbstractC19813612fe.class) {
            }
            int i2 = AbstractC19813612fe.LIZ;
            URLConnection uRLConnectionE0 = C2204961BRm.e0(url, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz1cEJOnFpNPfGz/D+qAVxNrfF00hvBxNen", new String[]{"016a9"}));
            if (!(uRLConnectionE0 instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionE0;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(C538540LAe.LLJJJIL);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                responseCode = httpURLConnection.getResponseCode();
                headerFields = httpURLConnection.getHeaderFields();
                try {
                    byte[] bArrLJIIIIZZ = C19810012f4.LJIIIIZZ(httpURLConnection);
                    httpURLConnection.disconnect();
                    LIZIZ(responseCode, null, bArrLJIIIIZZ, headerFields);
                } catch (IOException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    LIZIZ(responseCode, e, null, headerFields);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    LIZIZ(responseCode, null, null, headerFields);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                headerFields = null;
            } catch (Throwable th2) {
                th = th2;
                headerFields = null;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnection = null;
            headerFields = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
            headerFields = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zzkp@3966.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zzkp@3966.run");
    }

    public RunnableC19813412fc(C19810012f4 c19810012f4, String str, URL url, C19801012dc c19801012dc) {
        this.LLILLL = c19810012f4;
        C0W3J.LJI(str);
        this.LL = url;
        this.LLILLJJLI = c19801012dc;
    }

    public final void LIZIZ(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.LLILLL.LJIIL().LJIILL(new Runnable() { // from class: X.12dz
            public final void LIZ() throws Throwable {
                RunnableC19813412fc runnableC19813412fc = this.LL;
                int i2 = i;
                Exception exc2 = exc;
                byte[] bArr2 = bArr;
                C19804712eD c19804712eD = ((C19801012dc) runnableC19813412fc.LLILLJJLI).LIZ;
                c19804712eD.getClass();
                if ((i2 != 200 && i2 != 204 && i2 != 304) || exc2 != null) {
                    c19804712eD.LJIILJJIL().LJIIIIZZ.LIZIZ(Integer.valueOf(i2), "Network Request for Deferred Deep Link failed. response, exception", exc2);
                    return;
                }
                c19804712eD.LJIIJJI().LJIJJ.LIZ(true);
                if (bArr2 == null || bArr2.length == 0) {
                    c19804712eD.LJIILJJIL().LJIIL.LIZJ("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr2));
                    String strOptString = jSONObject.optString("deeplink", "");
                    if (TextUtils.isEmpty(strOptString)) {
                        c19804712eD.LJIILJJIL().LJIIL.LIZJ("Deferred Deep Link is empty.");
                        return;
                    }
                    String strOptString2 = jSONObject.optString("gclid", "");
                    String strOptString3 = jSONObject.optString("gbraid", "");
                    String strOptString4 = jSONObject.optString("gad_source", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    Bundle bundle = new Bundle();
                    if (C19814712fp.LIZ() && c19804712eD.LJI.LJIJI(null, C19817012gC.LJLLL)) {
                        if (!c19804712eD.LJIILLIIL().LJJLL(strOptString)) {
                            c19804712eD.LJIILJJIL().LJIIIIZZ.LIZLLL("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                            return;
                        }
                        if (!TextUtils.isEmpty(strOptString3)) {
                            C786410Ut5.LJJJI("gbraid", strOptString3, bundle);
                        }
                        if (!TextUtils.isEmpty(strOptString4)) {
                            C786410Ut5.LJJJI("gad_source", strOptString4, bundle);
                        }
                        long jLongValue = Double.valueOf(dOptDouble).longValue();
                        if (jLongValue > 0) {
                            bundle.putLong("click_timestamp", jLongValue);
                        }
                    } else if (!c19804712eD.LJIILLIIL().LJJLL(strOptString)) {
                        c19804712eD.LJIILJJIL().LJIIIIZZ.LIZIZ(strOptString2, "Deferred Deep Link validation failed. gclid, deep link", strOptString);
                        return;
                    }
                    if (C19814712fp.LIZ()) {
                        c19804712eD.LJI.LJIIIIZZ(C19817012gC.LJLLL);
                    }
                    C786410Ut5.LJJJI("gclid", strOptString2, bundle);
                    C786410Ut5.LJJJI("_cis", "ddp", bundle);
                    c19804712eD.LJIILL.LJJJIL("auto", "_cmp", bundle);
                    C19803112dx c19803112dxLJIILLIIL = c19804712eD.LJIILLIIL();
                    if (TextUtils.isEmpty(strOptString) || !c19803112dxLJIILLIIL.LJJJ(dOptDouble, strOptString)) {
                        return;
                    }
                    C2204961BRm.LJJJJI(c19803112dxLJIILLIIL.LIZ.LIZ, new Intent("android.google.analytics.action.DEEPLINK_ACTION"), new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yzxe1dYm0ZJPLqwOID9zPVdd3eEmUDB28iW", new String[]{"016a9"}));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c19804712eD.LJIILJJIL().LJFF.LIZ(e, "Failed to parse the Deferred Deep Link response. exception");
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zzko@3965.run");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zzko@3965.run");
            }
        });
    }
}
