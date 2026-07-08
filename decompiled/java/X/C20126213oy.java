package X;

import android.net.TrafficStats;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.13oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20126213oy implements InterfaceC812420Vtw {
    public static final Object LJIIL = new Object();
    public static final C086K LJIILIIL = new ThreadFactory() { // from class: X.086K
        public final AtomicInteger LL = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new BPEAThread(runnable, C786410Ut5.j4("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.LL.getAndIncrement())}));
        }
    };
    public final C818880WAk LIZ;
    public final C20125313op LIZIZ;
    public final C20126313oz LIZJ;
    public final C20127213p8 LIZLLL;
    public final C821440WKg LJ;
    public final C2105108Mn LJFF;
    public final Object LJI;
    public final ExecutorService LJII;
    public final C822650WOx LJIIIIZZ;
    public String LJIIIZ;
    public final Set<InterfaceC20128813pO> LJIIJ;
    public final List<InterfaceC20128413pK> LJIIJJI;

    public final void LJFF() {
        C818880WAk c818880WAk = this.LIZ;
        c818880WAk.LIZ();
        C0W3J.LJFF("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", c818880WAk.LIZJ.LIZIZ);
        C818880WAk c818880WAk2 = this.LIZ;
        c818880WAk2.LIZ();
        C0W3J.LJFF("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", c818880WAk2.LIZJ.LJI);
        C818880WAk c818880WAk3 = this.LIZ;
        c818880WAk3.LIZ();
        C0W3J.LJFF("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", c818880WAk3.LIZJ.LIZ);
        C818880WAk c818880WAk4 = this.LIZ;
        c818880WAk4.LIZ();
        String str = c818880WAk4.LIZJ.LIZIZ;
        Pattern pattern = C20127213p8.LIZJ;
        C0W3J.LIZ("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        C818880WAk c818880WAk5 = this.LIZ;
        c818880WAk5.LIZ();
        C0W3J.LIZ("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", C20127213p8.LIZJ.matcher(c818880WAk5.LIZJ.LIZ).matches());
    }

    @Override // X.InterfaceC812420Vtw
    public final C835510Wq5 getId() {
        String str;
        LJFF();
        synchronized (this) {
            str = this.LJIIIZ;
        }
        if (str != null) {
            return C835460Wq0.LJ(str);
        }
        final C835520Wq6 c835520Wq6 = new C835520Wq6();
        LIZIZ(new InterfaceC20128413pK(c835520Wq6) { // from class: X.13pA
            public final C835520Wq6<String> LIZ;

            @Override // X.InterfaceC20128413pK
            public final boolean LIZ(Exception exc) {
                return false;
            }

            {
                this.LIZ = c835520Wq6;
            }

            @Override // X.InterfaceC20128413pK
            public final boolean LIZIZ(C20126713p3 c20126713p3) {
                if (c20126713p3.LJFF() != EnumC20127313p9.UNREGISTERED && c20126713p3.LJFF() != EnumC20127313p9.REGISTERED && c20126713p3.LJFF() != EnumC20127313p9.REGISTER_ERROR) {
                    return false;
                }
                this.LIZ.LIZLLL(c20126713p3.LIZIZ);
                return true;
            }
        });
        C835510Wq5<TResult> c835510Wq5 = c835520Wq6.LIZ;
        this.LJII.execute(new Runnable() { // from class: X.13pD
            @Override // java.lang.Runnable
            public final void run() {
                C20126213oy c20126213oy = this.LL;
                c20126213oy.getClass();
                C1C7U.LIZ("FirebaseInstallations@98b8.getId$1L");
                c20126213oy.LIZJ(false);
                C1C7U.LIZIZ("FirebaseInstallations@98b8.getId$1L");
            }
        });
        return c835510Wq5;
    }

    @Override // X.InterfaceC812420Vtw
    public final C835510Wq5 getToken() {
        LJFF();
        final C835520Wq6 c835520Wq6 = new C835520Wq6();
        final C20127213p8 c20127213p8 = this.LIZLLL;
        LIZIZ(new InterfaceC20128413pK(c20127213p8, c835520Wq6) { // from class: X.13p1
            public final C20127213p8 LIZ;
            public final C835520Wq6<AbstractC20128113pH> LIZIZ;

            @Override // X.InterfaceC20128413pK
            public final boolean LIZ(Exception exc) {
                this.LIZIZ.LIZJ(exc);
                return true;
            }

            @Override // X.InterfaceC20128413pK
            public final boolean LIZIZ(C20126713p3 c20126713p3) {
                if (c20126713p3.LJFF() != EnumC20127313p9.REGISTERED || this.LIZ.LIZ(c20126713p3)) {
                    return false;
                }
                C835520Wq6<AbstractC20128113pH> c835520Wq62 = this.LIZIZ;
                C20128013pG c20128013pG = new C20128013pG();
                String str = c20126713p3.LIZLLL;
                if (str != null) {
                    c20128013pG.LIZ = str;
                    c20128013pG.LIZIZ = Long.valueOf(c20126713p3.LJFF);
                    c20128013pG.LIZJ = Long.valueOf(c20126713p3.LJI);
                    String strLIZIZ = "";
                    if (c20128013pG.LIZ == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("");
                        sbLIZ.append(" token");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    if (c20128013pG.LIZIZ == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(strLIZIZ);
                        sbLIZ2.append(" tokenExpirationTimestamp");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                    if (c20128013pG.LIZJ == null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ);
                        sbLIZ3.append(" tokenCreationTimestamp");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    }
                    if (strLIZIZ.isEmpty()) {
                        final String str2 = c20128013pG.LIZ;
                        final long jLongValue = c20128013pG.LIZIZ.longValue();
                        final long jLongValue2 = c20128013pG.LIZJ.longValue();
                        c835520Wq62.LIZIZ(new AbstractC20128113pH(str2, jLongValue, jLongValue2) { // from class: X.13pB
                            public final String LIZ;
                            public final long LIZIZ;
                            public final long LIZJ;

                            public final int hashCode() {
                                int iHashCode = (this.LIZ.hashCode() ^ 1000003) * 1000003;
                                long j = this.LIZIZ;
                                int i = (iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
                                long j2 = this.LIZJ;
                                return i ^ ((int) (j2 ^ (j2 >>> 32)));
                            }

                            public final String toString() {
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("InstallationTokenResult{token=");
                                sbLIZ4.append(this.LIZ);
                                sbLIZ4.append(", tokenExpirationTimestamp=");
                                sbLIZ4.append(this.LIZIZ);
                                sbLIZ4.append(", tokenCreationTimestamp=");
                                sbLIZ4.append(this.LIZJ);
                                sbLIZ4.append("}");
                                return C2188811AlT.LIZIZ(sbLIZ4);
                            }

                            @Override // X.AbstractC20128113pH
                            public final String LIZ() {
                                return this.LIZ;
                            }

                            @Override // X.AbstractC20128113pH
                            public final long LIZIZ() {
                                return this.LIZJ;
                            }

                            @Override // X.AbstractC20128113pH
                            public final long LIZJ() {
                                return this.LIZIZ;
                            }

                            public final boolean equals(Object obj) {
                                if (obj == this) {
                                    return true;
                                }
                                if (!(obj instanceof AbstractC20128113pH)) {
                                    return false;
                                }
                                AbstractC20128113pH abstractC20128113pH = (AbstractC20128113pH) obj;
                                if (this.LIZ.equals(abstractC20128113pH.LIZ()) && this.LIZIZ == abstractC20128113pH.LIZJ() && this.LIZJ == abstractC20128113pH.LIZIZ()) {
                                    return true;
                                }
                                return false;
                            }

                            {
                                this.LIZ = str2;
                                this.LIZIZ = jLongValue;
                                this.LIZJ = jLongValue2;
                            }
                        });
                        return true;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Missing required properties:");
                    sbLIZ4.append(strLIZIZ);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4));
                }
                throw new NullPointerException("Null token");
            }

            {
                this.LIZ = c20127213p8;
                this.LIZIZ = c835520Wq6;
            }
        });
        C835510Wq5<TResult> c835510Wq5 = c835520Wq6.LIZ;
        this.LJII.execute(new Runnable() { // from class: X.13pE
            public final /* synthetic */ boolean LLILLJJLI = false;

            @Override // java.lang.Runnable
            public final void run() {
                C20126213oy c20126213oy = this.LL;
                boolean z = this.LLILLJJLI;
                c20126213oy.getClass();
                C1C7U.LIZ("FirebaseInstallations@98b8.getToken$1L");
                c20126213oy.LIZJ(z);
                C1C7U.LIZIZ("FirebaseInstallations@98b8.getToken$1L");
            }
        });
        return c835510Wq5;
    }

    public final void LIZIZ(InterfaceC20128413pK interfaceC20128413pK) {
        synchronized (this.LJI) {
            try {
                ((ArrayList) this.LJIIJJI).add(interfaceC20128413pK);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(final boolean z) {
        C20126713p3 c20126713p3LIZLLL;
        synchronized (LJIIL) {
            try {
                C818880WAk c818880WAk = this.LIZ;
                c818880WAk.LIZ();
                C08Q9 c08q9LIZIZ = C08Q9.LIZIZ(c818880WAk.LIZ);
                try {
                    c20126713p3LIZLLL = this.LIZJ.LIZLLL();
                    EnumC20127313p9 enumC20127313p9 = c20126713p3LIZLLL.LIZJ;
                    if (enumC20127313p9 == EnumC20127313p9.NOT_GENERATED || enumC20127313p9 == EnumC20127313p9.ATTEMPT_MIGRATION) {
                        String strLJI = LJI(c20126713p3LIZLLL);
                        C20126313oz c20126313oz = this.LIZJ;
                        C20126613p2 c20126613p2 = new C20126613p2(c20126713p3LIZLLL);
                        c20126613p2.LIZ = strLJI;
                        c20126613p2.LIZIZ(EnumC20127313p9.UNREGISTERED);
                        c20126713p3LIZLLL = c20126613p2.LIZ();
                        c20126313oz.LIZJ(c20126713p3LIZLLL);
                    }
                    if (c08q9LIZIZ != null) {
                        c08q9LIZIZ.LIZJ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (c08q9LIZIZ != null) {
                        c08q9LIZIZ.LIZJ();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        if (z) {
            C20126613p2 c20126613p22 = new C20126613p2(c20126713p3LIZLLL);
            c20126613p22.LIZJ = null;
            c20126713p3LIZLLL = c20126613p22.LIZ();
        }
        LJIIIIZZ(c20126713p3LIZLLL);
        this.LJIIIIZZ.execute(new Runnable() { // from class: X.13p0
            @Override // java.lang.Runnable
            public final void run() {
                C20126713p3 c20126713p3LIZLLL2;
                C20126713p3 c20126713p3LJIIIIZZ;
                C20126213oy c20126213oy = this.LL;
                boolean z2 = z;
                c20126213oy.getClass();
                C1C7U.LIZ("FirebaseInstallations@98b8.doRegistrationOrRefresh$1L");
                synchronized (C20126213oy.LJIIL) {
                    try {
                        C818880WAk c818880WAk2 = c20126213oy.LIZ;
                        c818880WAk2.LIZ();
                        C08Q9 c08q9LIZIZ2 = C08Q9.LIZIZ(c818880WAk2.LIZ);
                        try {
                            c20126713p3LIZLLL2 = c20126213oy.LIZJ.LIZLLL();
                            if (c08q9LIZIZ2 != null) {
                                c08q9LIZIZ2.LIZJ();
                            }
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            if (c08q9LIZIZ2 != null) {
                                c08q9LIZIZ2.LIZJ();
                            }
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        TryCatchGuardChecker.doCheck(th4);
                        throw th4;
                    }
                }
                try {
                } catch (C20128213pI e) {
                    TryCatchGuardChecker.doCheck(e);
                    c20126213oy.LJII(e);
                }
                if (c20126713p3LIZLLL2.LJFF() != EnumC20127313p9.REGISTER_ERROR && c20126713p3LIZLLL2.LJFF() != EnumC20127313p9.UNREGISTERED) {
                    if (z2 || c20126213oy.LIZLLL.LIZ(c20126713p3LIZLLL2)) {
                        c20126713p3LJIIIIZZ = c20126213oy.LIZLLL(c20126713p3LIZLLL2);
                    }
                    C1C7U.LIZIZ("FirebaseInstallations@98b8.doRegistrationOrRefresh$1L");
                }
                try {
                    c20126713p3LJIIIIZZ = C20126213oy.LIZ(c20126213oy, c20126713p3LIZLLL2);
                } catch (NullPointerException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    e2.printStackTrace();
                    c20126713p3LJIIIIZZ = c20126713p3LIZLLL2.LJIIIIZZ();
                }
                c20126213oy.LJ(c20126713p3LJIIIIZZ);
                c20126213oy.LJIIJ(c20126713p3LIZLLL2, c20126713p3LJIIIIZZ);
                if (c20126713p3LJIIIIZZ.LJFF() == EnumC20127313p9.REGISTERED) {
                    c20126213oy.LJIIIZ(c20126713p3LJIIIIZZ.LIZIZ);
                }
                if (c20126713p3LJIIIIZZ.LJFF() == EnumC20127313p9.REGISTER_ERROR) {
                    c20126213oy.LJII(new C20128213pI(EnumC20125813ou.BAD_CONFIG));
                } else {
                    EnumC20127313p9 enumC20127313p92 = c20126713p3LJIIIIZZ.LIZJ;
                    if (enumC20127313p92 == EnumC20127313p9.NOT_GENERATED || enumC20127313p92 == EnumC20127313p9.ATTEMPT_MIGRATION) {
                        c20126213oy.LJII(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    } else {
                        c20126213oy.LJIIIIZZ(c20126713p3LJIIIIZZ);
                    }
                }
                C1C7U.LIZIZ("FirebaseInstallations@98b8.doRegistrationOrRefresh$1L");
            }
        });
    }

    public final C20126713p3 LIZLLL(C20126713p3 c20126713p3) throws C20128213pI {
        int responseCode;
        C20127013p6 c20127013p6LIZ;
        boolean zLJI = MethodIDManager.LJI(138047);
        C20125313op c20125313op = this.LIZIZ;
        C818880WAk c818880WAk = this.LIZ;
        c818880WAk.LIZ();
        String str = c818880WAk.LIZJ.LIZ;
        String str2 = c20126713p3.LIZIZ;
        C818880WAk c818880WAk2 = this.LIZ;
        c818880WAk2.LIZ();
        String str3 = c818880WAk2.LIZJ.LJI;
        String str4 = c20126713p3.LJ;
        c20125313op.getClass();
        boolean zLJI2 = MethodIDManager.LJI(138048);
        if (!c20125313op.LIZJ.LIZIZ()) {
            C20128213pI c20128213pI = new C20128213pI("Firebase Installations Service is unavailable. Please try again later.", EnumC20125813ou.UNAVAILABLE);
            if (zLJI2) {
                MethodIDManager.LJ();
                throw c20128213pI;
            }
            throw c20128213pI;
        }
        URL urlLIZ = C20125313op.LIZ(C786410Ut5.j4("projects/%s/installations/%s/authTokens:generate", new Object[]{str3, str2}));
        int i = 0;
        do {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionLIZJ = c20125313op.LIZJ(str, urlLIZ);
            try {
                try {
                    httpURLConnectionLIZJ.setRequestMethod("POST");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FIS_v2 ");
                    sbLIZ.append(str4);
                    httpURLConnectionLIZJ.addRequestProperty("Authorization", C2188811AlT.LIZIZ(sbLIZ));
                    httpURLConnectionLIZJ.setDoOutput(true);
                    C20125313op.LJII(httpURLConnectionLIZJ);
                    responseCode = httpURLConnectionLIZJ.getResponseCode();
                    c20125313op.LIZJ.LIZLLL(responseCode);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    httpURLConnectionLIZJ.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    if (zLJI2) {
                        MethodIDManager.LJ();
                    }
                    throw th;
                }
            } catch (IOException | AssertionError e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (responseCode >= 200 && responseCode < 300) {
                c20127013p6LIZ = C20125313op.LJFF(httpURLConnectionLIZJ);
                httpURLConnectionLIZJ.disconnect();
                TrafficStats.clearThreadStatsTag();
                if (zLJI2) {
                    MethodIDManager.LJ();
                }
            } else {
                C20125313op.LIZIZ(httpURLConnectionLIZJ);
                if (responseCode != 401 && responseCode != 404) {
                    if (responseCode == 429) {
                        C20128213pI c20128213pI2 = new C20128213pI("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", EnumC20125813ou.TOO_MANY_REQUESTS);
                        if (zLJI2) {
                            MethodIDManager.LJ();
                            throw c20128213pI2;
                        }
                        throw c20128213pI2;
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        C20125413oq c20125413oq = new C20125413oq();
                        c20125413oq.LIZIZ = 0L;
                        c20125413oq.LIZJ = EnumC20126113ox.BAD_CONFIG;
                        c20127013p6LIZ = c20125413oq.LIZ();
                        httpURLConnectionLIZJ.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        if (zLJI2) {
                            MethodIDManager.LJ();
                        }
                    }
                    httpURLConnectionLIZJ.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i++;
                } else {
                    C20125413oq c20125413oq2 = new C20125413oq();
                    c20125413oq2.LIZIZ = 0L;
                    c20125413oq2.LIZJ = EnumC20126113ox.AUTH_ERROR;
                    c20127013p6LIZ = c20125413oq2.LIZ();
                    httpURLConnectionLIZJ.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    if (zLJI2) {
                        MethodIDManager.LJ();
                    }
                }
            }
            int i2 = C20126013ow.LIZIZ[c20127013p6LIZ.LIZJ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        C20128213pI c20128213pI3 = new C20128213pI("Firebase Installations Service is unavailable. Please try again later.", EnumC20125813ou.UNAVAILABLE);
                        if (zLJI) {
                            MethodIDManager.LJ();
                            throw c20128213pI3;
                        }
                        throw c20128213pI3;
                    }
                    LJIIIZ(null);
                    C20126613p2 c20126613p2 = new C20126613p2(c20126713p3);
                    c20126613p2.LIZIZ(EnumC20127313p9.NOT_GENERATED);
                    C20126713p3 c20126713p3LIZ = c20126613p2.LIZ();
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return c20126713p3LIZ;
                }
                C20126713p3 c20126713p3LJIIIIZZ = c20126713p3.LJIIIIZZ();
                if (zLJI) {
                    MethodIDManager.LJ();
                }
                return c20126713p3LJIIIIZZ;
            }
            String str5 = c20127013p6LIZ.LIZ;
            long j = c20127013p6LIZ.LIZIZ;
            C20127213p8 c20127213p8 = this.LIZLLL;
            c20127213p8.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c20127213p8.LIZ.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            C20126613p2 c20126613p22 = new C20126613p2(c20126713p3);
            c20126613p22.LIZJ = str5;
            c20126613p22.LJ = Long.valueOf(j);
            c20126613p22.LJFF = Long.valueOf(seconds);
            C20126713p3 c20126713p3LIZ2 = c20126613p22.LIZ();
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return c20126713p3LIZ2;
        } while (i <= 1);
        C20128213pI c20128213pI4 = new C20128213pI("Firebase Installations Service is unavailable. Please try again later.", EnumC20125813ou.UNAVAILABLE);
        if (zLJI2) {
            MethodIDManager.LJ();
            throw c20128213pI4;
        }
        throw c20128213pI4;
    }

    public final void LJ(C20126713p3 c20126713p3) {
        synchronized (LJIIL) {
            try {
                C818880WAk c818880WAk = this.LIZ;
                c818880WAk.LIZ();
                C08Q9 c08q9LIZIZ = C08Q9.LIZIZ(c818880WAk.LIZ);
                try {
                    this.LIZJ.LIZJ(c20126713p3);
                    if (c08q9LIZIZ != null) {
                        c08q9LIZIZ.LIZJ();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (c08q9LIZIZ != null) {
                        c08q9LIZIZ.LIZJ();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJI(X.C20126713p3 r4) {
        /*
            r3 = this;
            X.0WAk r0 = r3.LIZ
            r0.LIZ()
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = "CHIME_ANDROID_SDK"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1e
            X.0WAk r0 = r3.LIZ
            r0.LIZ()
            java.lang.String r1 = r0.LIZIZ
            java.lang.String r0 = "[DEFAULT]"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L52
        L1e:
            X.13p9 r1 = r4.LIZJ
            X.13p9 r0 = X.EnumC20127313p9.ATTEMPT_MIGRATION
            if (r1 != r0) goto L2d
            r0 = 1
        L25:
            if (r0 == 0) goto L52
            X.0WKg r0 = r3.LJ
            android.content.SharedPreferences r2 = r0.LIZ
            monitor-enter(r2)
            goto L2f
        L2d:
            r0 = 0
            goto L25
        L2f:
            java.lang.String r1 = r0.LIZ()     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L37
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            goto L3c
        L37:
            java.lang.String r1 = r0.LIZIZ()     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
        L3c:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L4b
            X.08Mn r0 = r3.LJFF
            r0.getClass()
            java.lang.String r1 = X.C2105108Mn.LIZ()
        L4b:
            return r1
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4c
            throw r0
        L52:
            X.08Mn r0 = r3.LJFF
            r0.getClass()
            java.lang.String r0 = X.C2105108Mn.LIZ()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20126213oy.LJI(X.13p3):java.lang.String");
    }

    public final void LJII(Exception exc) {
        synchronized (this.LJI) {
            try {
                Iterator it2 = ((ArrayList) this.LJIIJJI).iterator();
                while (it2.hasNext()) {
                    if (((InterfaceC20128413pK) it2.next()).LIZ(exc)) {
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIIIZZ(C20126713p3 c20126713p3) {
        synchronized (this.LJI) {
            try {
                Iterator it2 = ((ArrayList) this.LJIIJJI).iterator();
                while (it2.hasNext()) {
                    if (((InterfaceC20128413pK) it2.next()).LIZIZ(c20126713p3)) {
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final synchronized void LJIIIZ(String str) {
        this.LJIIIZ = str;
    }

    public C20126213oy(C818880WAk c818880WAk, InterfaceC812380Vts<C0W4J> interfaceC812380Vts) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        C086K c086k = LJIILIIL;
        C822650WOx c822650WOx = new C822650WOx(0, 1, 30L, timeUnit, linkedBlockingQueue, c086k);
        c818880WAk.LIZ();
        C20125313op c20125313op = new C20125313op(c818880WAk.LIZ, interfaceC812380Vts);
        C20126313oz c20126313oz = new C20126313oz(c818880WAk);
        if (C20128713pN.LIZ == null) {
            C20128713pN.LIZ = new C20128713pN();
        }
        C20128713pN c20128713pN = C20128713pN.LIZ;
        if (C20127213p8.LIZLLL == null) {
            C20127213p8.LIZLLL = new C20127213p8(c20128713pN);
        }
        C20127213p8 c20127213p8 = C20127213p8.LIZLLL;
        C821440WKg c821440WKg = new C821440WKg(c818880WAk);
        C2105108Mn c2105108Mn = new C2105108Mn();
        this.LJI = new Object();
        this.LJIIJ = new HashSet();
        this.LJIIJJI = new ArrayList();
        this.LIZ = c818880WAk;
        this.LIZIZ = c20125313op;
        this.LIZJ = c20126313oz;
        this.LIZLLL = c20127213p8;
        this.LJ = c821440WKg;
        this.LJFF = c2105108Mn;
        this.LJII = c822650WOx;
        this.LJIIIIZZ = new C822650WOx(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), c086k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r2.startsWith("{") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r8 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getString(new org.json.JSONObject(r2), "token");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
    
        if (r13 < 600) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a0  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20126713p3 LIZ(X.C20126213oy r17, X.C20126713p3 r18) throws X.C20128213pI {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20126213oy.LIZ(X.13oy, X.13p3):X.13p3");
    }

    public final synchronized void LJIIJ(C20126713p3 c20126713p3, C20126713p3 c20126713p32) {
        if (((HashSet) this.LJIIJ).size() != 0 && !c20126713p3.LIZIZ.equals(c20126713p32.LIZIZ)) {
            Iterator it2 = ((HashSet) this.LJIIJ).iterator();
            while (it2.hasNext()) {
                ((InterfaceC20128813pO) it2.next()).LIZ();
            }
        }
    }
}
