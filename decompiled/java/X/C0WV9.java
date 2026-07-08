package X;

import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.internal.WebDialog;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WV9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WV9 extends PthreadAsyncTask<Void, Void, String[]> {
    public final String LIZ;
    public final Bundle LIZIZ;
    public Exception[] LIZJ = new Exception[0];
    public final /* synthetic */ WebDialog LIZLLL;

    /* JADX WARN: Type inference failed for: r0v21, types: [X.0WVA] */
    public final String[] LIZ() {
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            if (C807660VmG.LIZ(this)) {
                return null;
            }
            try {
                String[] stringArray = this.LIZIZ.getStringArray("media");
                if (stringArray == null) {
                    return null;
                }
                final String[] strArr = new String[stringArray.length];
                this.LIZJ = new Exception[stringArray.length];
                final CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                AccessToken.Companion.getClass();
                AccessToken accessTokenLIZIZ = C2202721BIw.LIZIZ();
                try {
                    int length = stringArray.length - 1;
                    if (length >= 0) {
                        final int i = 0;
                        while (true) {
                            int i2 = i + 1;
                            if (!isCancelled()) {
                                Uri uri = Uri.parse(stringArray[i]);
                                if (C0W7Q.LJIILLIIL(uri)) {
                                    strArr[i] = uri.toString();
                                    countDownLatch.countDown();
                                } else {
                                    concurrentLinkedQueue.add(C0WV7.LIZ(accessTokenLIZIZ, uri, new C0WV8() { // from class: X.0WVA
                                        @Override // X.C0WV8
                                        public final void LIZIZ(final C0WVK c0wvk) {
                                            FacebookRequestError facebookRequestError;
                                            final String str;
                                            String[] strArr2 = strArr;
                                            int i3 = i;
                                            C0WV9 c0wv9 = this;
                                            CountDownLatch countDownLatch2 = countDownLatch;
                                            try {
                                                facebookRequestError = c0wvk.LIZJ;
                                                str = "Error staging photo.";
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                c0wv9.LIZJ[i3] = e;
                                            }
                                            if (facebookRequestError != null) {
                                                String strLIZ = facebookRequestError.LIZ();
                                                if (strLIZ != null) {
                                                    str = strLIZ;
                                                }
                                                throw new C1BJO(c0wvk, str) { // from class: X.0WVD
                                                    public final C0WVK LL;

                                                    @Override // X.C1BJO, java.lang.Throwable
                                                    public String toString() {
                                                        C0WVK c0wvk2 = this.LL;
                                                        FacebookRequestError facebookRequestError2 = c0wvk2 == null ? null : c0wvk2.LIZJ;
                                                        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
                                                        String message = getMessage();
                                                        if (message != null) {
                                                            sb.append(message);
                                                            sb.append(" ");
                                                        }
                                                        if (facebookRequestError2 != null) {
                                                            sb.append("httpResponseCode: ");
                                                            sb.append(facebookRequestError2.requestStatusCode);
                                                            sb.append(", facebookErrorCode: ");
                                                            sb.append(facebookRequestError2.errorCode);
                                                            sb.append(", facebookErrorType: ");
                                                            sb.append(facebookRequestError2.errorType);
                                                            sb.append(", message: ");
                                                            sb.append(facebookRequestError2.LIZ());
                                                            sb.append("}");
                                                        }
                                                        return sb.toString();
                                                    }

                                                    public final C0WVK getGraphResponse() {
                                                        return this.LL;
                                                    }

                                                    {
                                                        super(str);
                                                        this.LL = c0wvk;
                                                    }
                                                };
                                            }
                                            JSONObject jSONObject = c0wvk.LIZIZ;
                                            if (jSONObject != null) {
                                                String strOptString = jSONObject.optString("uri");
                                                if (strOptString != null) {
                                                    strArr2[i3] = strOptString;
                                                    countDownLatch2.countDown();
                                                    return;
                                                }
                                                throw new C1BJO("Error staging photo.");
                                            }
                                            throw new C1BJO("Error staging photo.");
                                        }
                                    }).LIZLLL());
                                }
                                if (i2 > length) {
                                    break;
                                }
                                i = i2;
                            } else {
                                Iterator it2 = concurrentLinkedQueue.iterator();
                                while (it2.hasNext()) {
                                    ((C1BJ8) it2.next()).cancel(true);
                                }
                                return null;
                            }
                        }
                    }
                    countDownLatch.await();
                    return strArr;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    Iterator it3 = concurrentLinkedQueue.iterator();
                    while (it3.hasNext()) {
                        ((C1BJ8) it3.next()).cancel(true);
                    }
                    return null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return null;
        }
    }

    public final void LIZIZ(String[] strArr) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            if (C807660VmG.LIZ(this)) {
                return;
            }
            try {
                ProgressDialog progressDialog = this.LIZLLL.LLILZIL;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    C785410UrT.LIZ(progressDialog);
                }
                Exception[] excArr = this.LIZJ;
                int length = excArr.length;
                int i = 0;
                while (i < length) {
                    Exception exc = excArr[i];
                    i++;
                    if (exc != null) {
                        this.LIZLLL.LJJLJLI(exc);
                        return;
                    }
                }
                if (strArr == null) {
                    this.LIZLLL.LJJLJLI(new C1BJO("Failed to stage photos for web dialog"));
                    return;
                }
                List listAsList = Arrays.asList(strArr);
                if (listAsList.contains(null)) {
                    this.LIZLLL.LJJLJLI(new C1BJO("Failed to stage photos for web dialog"));
                    return;
                }
                C0W7Q.LJIJI(this.LIZIZ, new JSONArray((Collection) listAsList));
                String strLIZ = C0WVB.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C786410Ut5.D2());
                sbLIZ.append("/dialog/");
                sbLIZ.append(this.LIZ);
                Uri uriLIZ = C0W7Q.LIZ(strLIZ, C2188811AlT.LIZIZ(sbLIZ), this.LIZIZ);
                this.LIZLLL.LL = uriLIZ.toString();
                ImageView imageView = this.LIZLLL.LLILZLL;
                if (imageView != null) {
                    this.LIZLLL.LJJLL((imageView.getDrawable().getIntrinsicWidth() / 2) + 1);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalStateException("Required value was null.");
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            if (C807660VmG.LIZ(this)) {
                return null;
            }
            try {
                return LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return null;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            if (C807660VmG.LIZ(this)) {
                return;
            }
            try {
                LIZIZ((String[]) obj);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
    }

    public C0WV9(WebDialog webDialog, String str, Bundle bundle) {
        this.LIZLLL = webDialog;
        this.LIZ = str;
        this.LIZIZ = bundle;
    }
}
