package X;

import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.GraphRequest;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.1BJ8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BJ8 extends PthreadAsyncTask<Void, Void, List<? extends C0WVK>> {
    public final HttpURLConnection LIZ = null;
    public final C1BJ9 LIZIZ;
    public Exception LIZJ;

    public final List LIZ() {
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            if (C807660VmG.LIZ(this)) {
                return null;
            }
            try {
                try {
                    if (C807660VmG.LIZ(this)) {
                        return null;
                    }
                    try {
                        HttpURLConnection httpURLConnection = this.LIZ;
                        if (httpURLConnection != null) {
                            String str = GraphRequest.LJIIIIZZ;
                            return C1BJA.LIZJ(this.LIZIZ, httpURLConnection);
                        }
                        C1BJ9 c1bj9 = this.LIZIZ;
                        c1bj9.getClass();
                        String str2 = GraphRequest.LJIIIIZZ;
                        return C1BJA.LIZIZ(c1bj9);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZJ = e;
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
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            if (C807660VmG.LIZ(this)) {
                return;
            }
            try {
                if (C807660VmG.LIZ(this)) {
                    return;
                }
                try {
                    super.onPreExecute();
                    if (this.LIZIZ.LL == null) {
                        this.LIZIZ.LL = C786410Ut5.u3() instanceof HandlerThread ? new BPEAHandler() : new BPEAHandler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{RequestAsyncTask: ");
        sbLIZ.append(" connection: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requests: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1BJ8(C1BJ9 c1bj9) {
        this.LIZIZ = c1bj9;
    }

    public final void LIZIZ(List<C0WVK> list) {
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return;
        }
        if (C807660VmG.LIZ(this)) {
            return;
        }
        try {
            super.onPostExecute(list);
            Exception exc = this.LIZJ;
            if (exc != null) {
                C786410Ut5.j4("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                return;
            }
            return;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            return;
        }
        TryCatchGuardChecker.doCheck(th2);
        return;
        TryCatchGuardChecker.doCheck(th);
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
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
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
                if (C807660VmG.LIZ(this)) {
                    return;
                }
                try {
                    LIZIZ((List) obj);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }
}
