package X;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import net.openid.appauth.AuthorizationManagementActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AtG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2193641AtG {
    public final Context LIZ;
    public final C2193651AtH LIZIZ;
    public final C0WWJ LIZJ;
    public final C09RQ LIZLLL;
    public boolean LJ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0WWK] */
    public C2193641AtG(Context context) {
        C2193651AtH c2193651AtH = C2193651AtH.LIZJ;
        C09RQ c09rqLIZ = C0W02.LIZ(context, c2193651AtH.LIZ);
        final C0WWJ c0wwj = new C0WWJ(context);
        this.LIZ = context;
        this.LIZIZ = c2193651AtH;
        this.LIZJ = c0wwj;
        this.LIZLLL = c09rqLIZ;
        if (c09rqLIZ != null && c09rqLIZ.LIZLLL.booleanValue()) {
            String str = c09rqLIZ.LIZ;
            synchronized (c0wwj) {
                if (c0wwj.LIZLLL != null) {
                    return;
                }
                c0wwj.LIZLLL = new C0W50() { // from class: X.0WWK
                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName componentName) {
                        C0WWL.LIZ("CustomTabsService is disconnected", new Object[0]);
                        c0wwj.LIZIZ.set(null);
                        c0wwj.LIZJ.countDown();
                    }

                    @Override // X.C0W50
                    public final void onCustomTabsServiceConnected(ComponentName componentName, C817470W4z c817470W4z) {
                        C0WWL.LIZ("CustomTabsService is connected", new Object[0]);
                        c817470W4z.LIZLLL();
                        c0wwj.LIZIZ.set(c817470W4z);
                        c0wwj.LIZJ.countDown();
                    }
                };
                Context context2 = c0wwj.LIZ.get();
                if (context2 == null || !C817470W4z.LIZ(context2, str, c0wwj.LIZLLL)) {
                    C0WWL.LIZIZ().LIZJ(4, "Unable to bind custom tabs service", null, new Object[0]);
                    c0wwj.LIZJ.countDown();
                }
            }
        }
    }

    public final C0WWG LIZ(Uri... uriArr) {
        if (!this.LJ) {
            return this.LIZJ.LIZ(uriArr);
        }
        throw new IllegalStateException("Service has been disposed and rendered inoperable");
    }

    public final Intent LIZIZ(C2193461Asy c2193461Asy, C0WWF c0wwf) {
        Intent intent;
        if (!this.LJ) {
            if (this.LIZLLL != null) {
                Uri uriLIZJ = c2193461Asy.LIZJ();
                if (this.LIZLLL.LIZLLL.booleanValue()) {
                    intent = c0wwf.LIZ;
                } else {
                    intent = new Intent("android.intent.action.VIEW");
                }
                intent.setPackage(this.LIZLLL.LIZ);
                intent.setData(uriLIZJ);
                C0WWL.LIZ("Using %s as browser for auth, custom tab = %s", intent.getPackage(), this.LIZLLL.LIZLLL.toString());
                C0WWL.LIZ("Initiating authorization request to %s", c2193461Asy.LIZ.LIZ);
                Intent intent2 = new Intent(this.LIZ, (Class<?>) AuthorizationManagementActivity.class);
                intent2.putExtra("authIntent", intent);
                intent2.putExtra("authRequest", C786410Ut5.J3(c2193461Asy.LIZIZ()));
                intent2.putExtra("completeIntent", (Parcelable) null);
                intent2.putExtra("cancelIntent", (Parcelable) null);
                return intent2;
            }
            throw new ActivityNotFoundException();
        }
        throw new IllegalStateException("Service has been disposed and rendered inoperable");
    }

    public final void LIZJ(final C2193501At2 c2193501At2, final InterfaceC2193631AtF interfaceC2193631AtF) {
        if (!this.LJ) {
            C0WWL.LIZ("Initiating code exchange request to %s", c2193501At2.LIZ.LIZIZ);
            final InterfaceC20137113qj interfaceC20137113qj = this.LIZIZ.LIZIZ;
            C0WP3.LIZIZ(new PthreadAsyncTask<Void, Void, JSONObject>(c2193501At2, interfaceC20137113qj, interfaceC2193631AtF) { // from class: X.1AtA
                public final C2193501At2 LIZ;
                public final InterfaceC2190011AnP LIZIZ;
                public final InterfaceC20137113qj LIZJ;
                public final InterfaceC2193631AtF LIZLLL;
                public C2193571At9 LJ;

                public static void LIZ(URLConnection uRLConnection) {
                    if (TextUtils.isEmpty(uRLConnection.getRequestProperty("Accept"))) {
                        uRLConnection.setRequestProperty("Accept", "application/json");
                    }
                }

                /* JADX WARN: Not initialized variable reg: 3, insn: 0x00bf: MOVE (r7 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777407), block:B:28:0x00bf */
                @Override // android.os.AsyncTask
                public final Object doInBackground(Object[] objArr) throws Throwable {
                    InputStream inputStream;
                    InputStream errorStream;
                    InputStream inputStream2 = null;
                    try {
                        try {
                            try {
                                HttpURLConnection httpURLConnectionLIZ = C20137013qi.LIZ(this.LIZ.LIZ.LIZIZ);
                                httpURLConnectionLIZ.setRequestMethod("POST");
                                httpURLConnectionLIZ.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                                LIZ(httpURLConnectionLIZ);
                                httpURLConnectionLIZ.setDoOutput(true);
                                this.LIZIZ.getRequestHeaders();
                                Map<String, String> mapLIZ = this.LIZ.LIZ();
                                Map<String, String> mapLIZ2 = this.LIZIZ.LIZ(this.LIZ.LIZIZ);
                                if (mapLIZ2 != null) {
                                    ((HashMap) mapLIZ).putAll(mapLIZ2);
                                }
                                String strLIZIZ = C011U.LIZIZ(mapLIZ);
                                httpURLConnectionLIZ.setRequestProperty("Content-Length", String.valueOf(strLIZIZ.length()));
                                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnectionLIZ.getOutputStream());
                                outputStreamWriter.write(strLIZIZ);
                                outputStreamWriter.flush();
                                if (httpURLConnectionLIZ.getResponseCode() >= 200 && httpURLConnectionLIZ.getResponseCode() < 300) {
                                    errorStream = httpURLConnectionLIZ.getInputStream();
                                } else {
                                    errorStream = httpURLConnectionLIZ.getErrorStream();
                                }
                            } catch (Throwable th) {
                                th = th;
                                TryCatchGuardChecker.doCheck(th);
                                C08KB.LIZ(inputStream2);
                                throw th;
                            }
                        } catch (IOException e) {
                            e = e;
                            errorStream = null;
                        } catch (JSONException e2) {
                            e = e2;
                            errorStream = null;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject(C08KB.LIZIZ(errorStream));
                            C08KB.LIZ(errorStream);
                            return jSONObject;
                        } catch (IOException e3) {
                            e = e3;
                            TryCatchGuardChecker.doCheck(e);
                            C0WWL.LIZIZ().LIZJ(3, "Failed to complete exchange request", e, new Object[0]);
                            this.LJ = C2193571At9.fromTemplate(C2193621AtE.LIZLLL, e);
                            C08KB.LIZ(errorStream);
                            return null;
                        } catch (JSONException e4) {
                            e = e4;
                            TryCatchGuardChecker.doCheck(e);
                            C0WWL.LIZIZ().LIZJ(3, "Failed to complete exchange request", e, new Object[0]);
                            this.LJ = C2193571At9.fromTemplate(C2193621AtE.LJ, e);
                            C08KB.LIZ(errorStream);
                            return null;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = inputStream;
                    }
                }

                @Override // android.os.AsyncTask
                public final void onPostExecute(Object obj) {
                    C2193571At9 c2193571At9FromTemplate;
                    Uri uri;
                    JSONObject jSONObject = (JSONObject) obj;
                    C2193571At9 c2193571At9 = this.LJ;
                    if (c2193571At9 != null) {
                        this.LIZLLL.LIZ(null, c2193571At9);
                        return;
                    }
                    if (jSONObject.has("error")) {
                        try {
                            String string = JSONObjectProtectorUtils.getString(jSONObject, "error");
                            C2193571At9 c2193571At92 = C2193611AtD.LIZIZ.get(string);
                            if (c2193571At92 == null) {
                                c2193571At92 = C2193611AtD.LIZ;
                            }
                            String strOptString = jSONObject.optString("error_description", null);
                            String strOptString2 = jSONObject.optString("error_uri");
                            if (strOptString2 == null) {
                                uri = null;
                            } else {
                                uri = UriProtector.parse(strOptString2);
                            }
                            c2193571At9FromTemplate = C2193571At9.fromOAuthTemplate(c2193571At92, string, strOptString, uri);
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c2193571At9FromTemplate = C2193571At9.fromTemplate(C2193621AtE.LJ, e);
                        }
                        this.LIZLLL.LIZ(null, c2193571At9FromTemplate);
                        return;
                    }
                    try {
                        C2193481At0 c2193481At0 = new C2193481At0(this.LIZ);
                        c2193481At0.LIZ(jSONObject);
                        C2193491At1 c2193491At1 = new C2193491At1(c2193481At0.LIZ, c2193481At0.LIZIZ, c2193481At0.LIZJ, c2193481At0.LIZLLL, c2193481At0.LJ, c2193481At0.LJFF, c2193481At0.LJI, c2193481At0.LJII);
                        C0WWL.LIZ("Token exchange with %s completed", this.LIZ.LIZ.LIZIZ);
                        this.LIZLLL.LIZ(c2193491At1, null);
                    } catch (JSONException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        this.LIZLLL.LIZ(null, C2193571At9.fromTemplate(C2193621AtE.LJ, e2));
                    }
                }

                {
                    C2190111AnZ c2190111AnZ = new InterfaceC2190011AnP() { // from class: X.1AnZ
                        @Override // X.InterfaceC2190011AnP
                        public final void getRequestHeaders() {
                        }

                        @Override // X.InterfaceC2190011AnP
                        public final Map<String, String> LIZ(String str) {
                            return Collections.singletonMap("client_id", str);
                        }
                    };
                    this.LIZ = c2193501At2;
                    this.LIZIZ = c2190111AnZ;
                    this.LIZJ = interfaceC20137113qj;
                    this.LIZLLL = interfaceC2193631AtF;
                }
            }, new Void[0]);
            return;
        }
        throw new IllegalStateException("Service has been disposed and rendered inoperable");
    }
}
