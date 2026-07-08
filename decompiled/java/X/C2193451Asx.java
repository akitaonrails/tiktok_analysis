package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Asx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193451Asx {
    public final Uri LIZ;
    public final Uri LIZIZ;
    public final Uri LIZJ;
    public final C2190591AoL LIZLLL;

    public C2193451Asx() {
        throw null;
    }

    public final JSONObject LIZIZ() {
        JSONObject jSONObject = new JSONObject();
        C2191471Apl.LJIIIIZZ("authorizationEndpoint", this.LIZ.toString(), jSONObject);
        C2191471Apl.LJIIIIZZ("tokenEndpoint", this.LIZIZ.toString(), jSONObject);
        Uri uri = this.LIZJ;
        if (uri != null) {
            C2191471Apl.LJIIIIZZ("registrationEndpoint", uri.toString(), jSONObject);
        }
        C2190591AoL c2190591AoL = this.LIZLLL;
        if (c2190591AoL != null) {
            C2191471Apl.LJIIIZ("discoveryDoc", jSONObject, c2190591AoL.LIZ);
        }
        return jSONObject;
    }

    public C2193451Asx(C2190591AoL c2190591AoL) {
        this.LIZLLL = c2190591AoL;
        this.LIZ = (Uri) c2190591AoL.LIZ(C2190591AoL.LIZIZ);
        this.LIZIZ = (Uri) c2190591AoL.LIZ(C2190591AoL.LIZJ);
        this.LIZJ = (Uri) c2190591AoL.LIZ(C2190591AoL.LIZLLL);
    }

    public static void LIZ(Uri uri, final C1742010vQt c1742010vQt) {
        final Uri uriBuild = uri.buildUpon().appendPath(".well-known").appendPath("openid-configuration").build();
        C20137213qk.LIZJ(uriBuild, "openIDConnectDiscoveryUri cannot be null");
        C0WP3.LIZIZ(new PthreadAsyncTask<Void, Void, C2193451Asx>(uriBuild, c1742010vQt) { // from class: X.1AtB
            public final Uri LIZ;
            public final InterfaceC20137113qj LIZIZ;
            public final InterfaceC1742020vQu LIZJ;
            public C2193571At9 LIZLLL;

            /* JADX WARN: Not initialized variable reg: 5, insn: 0x0089: MOVE (r7 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:16777353), block:B:25:0x0089 */
            @Override // android.os.AsyncTask
            public final Object doInBackground(Object[] objArr) throws Throwable {
                InputStream inputStream;
                InputStream inputStream2;
                InputStream inputStream3 = null;
                try {
                    try {
                        try {
                            HttpURLConnection httpURLConnectionLIZ = C20137013qi.LIZ(this.LIZ);
                            httpURLConnectionLIZ.setRequestMethod("GET");
                            httpURLConnectionLIZ.setDoInput(true);
                            httpURLConnectionLIZ.connect();
                            inputStream = httpURLConnectionLIZ.getInputStream();
                            try {
                                C2193451Asx c2193451Asx = new C2193451Asx(new C2190591AoL(new JSONObject(C08KB.LIZIZ(inputStream))));
                                C08KB.LIZ(inputStream);
                                return c2193451Asx;
                            } catch (C2190241Anm e) {
                                e = e;
                                TryCatchGuardChecker.doCheck(e);
                                C0WWL.LIZIZ().LIZJ(6, "Malformed discovery document", e, new Object[0]);
                                this.LIZLLL = C2193571At9.fromTemplate(C2193621AtE.LIZ, e);
                                C08KB.LIZ(inputStream);
                                return null;
                            } catch (IOException e2) {
                                e = e2;
                                TryCatchGuardChecker.doCheck(e);
                                C0WWL.LIZIZ().LIZJ(6, "Network error when retrieving discovery document", e, new Object[0]);
                                this.LIZLLL = C2193571At9.fromTemplate(C2193621AtE.LIZLLL, e);
                                C08KB.LIZ(inputStream);
                                return null;
                            } catch (JSONException e3) {
                                e = e3;
                                TryCatchGuardChecker.doCheck(e);
                                C0WWL.LIZIZ().LIZJ(6, "Error parsing discovery document", e, new Object[0]);
                                this.LIZLLL = C2193571At9.fromTemplate(C2193621AtE.LJ, e);
                                C08KB.LIZ(inputStream);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            inputStream3 = inputStream2;
                            TryCatchGuardChecker.doCheck(th);
                            C08KB.LIZ(inputStream3);
                            throw th;
                        }
                    } catch (C2190241Anm e4) {
                        e = e4;
                        inputStream = null;
                    } catch (IOException e5) {
                        e = e5;
                        inputStream = null;
                    } catch (JSONException e6) {
                        e = e6;
                        inputStream = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }

            @Override // android.os.AsyncTask
            public final void onPostExecute(Object obj) {
                C2193451Asx c2193451Asx = (C2193451Asx) obj;
                if (this.LIZLLL != null) {
                    this.LIZJ.getClass();
                } else {
                    ((C1742010vQt) this.LIZJ).LIZ.LIZ = c2193451Asx;
                }
            }

            {
                C20137013qi c20137013qi = C20137013qi.LIZ;
                this.LIZ = uriBuild;
                this.LIZIZ = c20137013qi;
                this.LIZJ = c1742010vQt;
            }
        }, new Void[0]);
    }

    public C2193451Asx(Uri uri, Uri uri2, Uri uri3) {
        uri.getClass();
        this.LIZ = uri;
        uri2.getClass();
        this.LIZIZ = uri2;
        this.LIZJ = uri3;
        this.LIZLLL = null;
    }
}
