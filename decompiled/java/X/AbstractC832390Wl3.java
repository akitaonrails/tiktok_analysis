package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.common.internal.zzj;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Wl3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC832390Wl3<T extends IInterface> {
    public volatile String zzA;
    public ConnectionResult zzB;
    public boolean zzC;
    public volatile zzj zzD;
    public C832840Wlm zza;
    public final Handler zzb;
    public InterfaceC832240Wko zzc;
    public AtomicInteger zzd;
    public int zzf;
    public long zzg;
    public long zzh;
    public int zzi;
    public long zzj;
    public volatile String zzk;
    public final Context zzl;
    public final Looper zzm;
    public final AbstractC832430Wl7 zzn;
    public final C829100Wfk zzo;
    public final Object zzp;
    public final Object zzq;
    public InterfaceC832810Wlj zzr;
    public IInterface zzs;
    public final ArrayList zzt;
    public ServiceConnectionC832420Wl6 zzu;
    public int zzv;
    public final InterfaceC832770Wlf zzw;
    public final InterfaceC832830Wll zzx;
    public final int zzy;
    public final String zzz;
    public static final Feature[] zze = new Feature[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public abstract T createServiceInterface(IBinder iBinder);

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return zze;
    }

    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.zzD;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.LLILLJJLI;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract String getServiceDescriptor();

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.zzD;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.LLILZ;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public void checkAvailabilityAndConnect() {
        int iIsGooglePlayServicesAvailable = this.zzo.isGooglePlayServicesAvailable(this.zzl, getMinApkVersion());
        if (iIsGooglePlayServicesAvailable == 0) {
            connect(new C832560WlK(this));
        } else {
            zzp(1, null);
            triggerNotAvailable(new C832560WlK(this), iIsGooglePlayServicesAvailable, null);
        }
    }

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i = 0; i < size; i++) {
                    ((AbstractC832580WlM) this.zzt.get(i)).LIZJ();
                }
                this.zzt.clear();
            } finally {
            }
        }
        synchronized (this.zzq) {
            try {
                this.zzr = null;
            } finally {
            }
        }
        zzp(1, null);
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public final T getService() {
        T t;
        synchronized (this.zzp) {
            try {
                if (this.zzv == 5) {
                    throw new DeadObjectException();
                }
                checkConnected();
                t = (T) this.zzs;
                C0W3J.LJIIIZ(t, "Client is connected but service is null");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return t;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC832810Wlj interfaceC832810Wlj = this.zzr;
                if (interfaceC832810Wlj == null) {
                    return null;
                }
                return interfaceC832810Wlj.asBinder();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public boolean isConnected() {
        boolean z;
        synchronized (this.zzp) {
            try {
                z = this.zzv == 4;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public boolean isConnecting() {
        boolean z;
        synchronized (this.zzp) {
            try {
                int i = this.zzv;
                z = true;
                if (i != 2 && i != 3) {
                    z = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public String getEndpointPackageName() {
        C832840Wlm c832840Wlm;
        if (!isConnected() || (c832840Wlm = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return c832840Wlm.LIZIZ;
    }

    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public int getMinApkVersion() {
        return C829100Wfk.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public static /* bridge */ /* synthetic */ boolean zzo(AbstractC832390Wl3 abstractC832390Wl3) {
        boolean z = false;
        if (!abstractC832390Wl3.zzC && !TextUtils.isEmpty(abstractC832390Wl3.getServiceDescriptor()) && !TextUtils.isEmpty(abstractC832390Wl3.getLocalStartServiceAction())) {
            try {
                Class.forName(abstractC832390Wl3.getServiceDescriptor());
                z = true;
                return true;
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return z;
    }

    public void connect(InterfaceC832240Wko interfaceC832240Wko) {
        C0W3J.LJIIIZ(interfaceC832240Wko, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC832240Wko;
        zzp(2, null);
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    public void onConnectedLocked(T t) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzi = connectionResult.zzb;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i) {
        this.zzf = i;
        this.zzg = System.currentTimeMillis();
    }

    public void onUserSignOut(InterfaceC829570WgV interfaceC829570WgV) {
        final C831590Wjl c831590Wjl = (C831590Wjl) interfaceC829570WgV;
        C786410Ut5.LJJZZIII(c831590Wjl.LIZ.LLJILJILJ.LLJILLL, new Runnable() { // from class: X.0WjW
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("zabo@ecb.run");
                try {
                    InterfaceC831160Wj4 interfaceC831160Wj4 = c831590Wjl.LIZ.LLILLJJLI;
                    interfaceC831160Wj4.disconnect(interfaceC831160Wj4.getClass().getName().concat(" disconnecting because it was signed out."));
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("zabo@ecb.run");
            }
        });
    }

    public void triggerConnectionSuspended(int i) {
        Handler handler = this.zzb;
        C786410Ut5.LJLJJL(handler, handler.obtainMessage(6, this.zzd.get(), i));
    }

    public static void zzj(AbstractC832390Wl3 abstractC832390Wl3, zzj zzjVar) {
        RootTelemetryConfiguration rootTelemetryConfiguration;
        abstractC832390Wl3.zzD = zzjVar;
        if (abstractC832390Wl3.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.LLILZ;
            C831020Wiq c831020WiqLIZ = C831020Wiq.LIZ();
            if (connectionTelemetryConfiguration == null) {
                rootTelemetryConfiguration = null;
            } else {
                rootTelemetryConfiguration = connectionTelemetryConfiguration.zza;
            }
            synchronized (c831020WiqLIZ) {
                if (rootTelemetryConfiguration == null) {
                    rootTelemetryConfiguration = C831020Wiq.LIZJ;
                } else {
                    RootTelemetryConfiguration rootTelemetryConfiguration2 = c831020WiqLIZ.LIZ;
                    if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.zza < rootTelemetryConfiguration.zza) {
                    }
                }
                c831020WiqLIZ.LIZ = rootTelemetryConfiguration;
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(AbstractC832390Wl3 abstractC832390Wl3, int i) {
        int i2;
        int i3;
        synchronized (abstractC832390Wl3.zzp) {
            try {
                i2 = abstractC832390Wl3.zzv;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (i2 == 3) {
            abstractC832390Wl3.zzC = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = abstractC832390Wl3.zzb;
        C786410Ut5.LJLJJL(handler, handler.obtainMessage(i3, abstractC832390Wl3.zzd.get(), 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(int i, IInterface iInterface) {
        boolean z;
        boolean z2;
        boolean z3;
        C832840Wlm c832840Wlm;
        C832840Wlm c832840Wlm2;
        if (i != 4) {
            z = false;
        } else {
            z = true;
        }
        if (iInterface == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0W3J.LIZIZ(z3);
        synchronized (this.zzp) {
            try {
                this.zzv = i;
                this.zzs = iInterface;
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        if (i == 4) {
                            C0W3J.LJIIIIZZ(iInterface);
                            onConnectedLocked(iInterface);
                        }
                    } else {
                        ServiceConnectionC832420Wl6 serviceConnectionC832420Wl6 = this.zzu;
                        if (serviceConnectionC832420Wl6 != null && (c832840Wlm2 = this.zza) != null) {
                            String str = c832840Wlm2.LIZ;
                            AbstractC832430Wl7 abstractC832430Wl7 = this.zzn;
                            C0W3J.LJIIIIZZ(str);
                            String str2 = this.zza.LIZIZ;
                            zze();
                            abstractC832430Wl7.LIZJ(str, str2, 4225, serviceConnectionC832420Wl6, this.zza.LIZJ);
                            this.zzd.incrementAndGet();
                        }
                        ServiceConnectionC832420Wl6 serviceConnectionC832420Wl62 = new ServiceConnectionC832420Wl6(this, this.zzd.get());
                        this.zzu = serviceConnectionC832420Wl62;
                        if (this.zzv == 3 && getLocalStartServiceAction() != null) {
                            c832840Wlm = new C832840Wlm(this.zzl.getPackageName(), getLocalStartServiceAction(), false);
                        } else {
                            c832840Wlm = new C832840Wlm(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup());
                        }
                        this.zza = c832840Wlm;
                        if (c832840Wlm.LIZJ && getMinApkVersion() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.LIZ)));
                        }
                        AbstractC832430Wl7 abstractC832430Wl72 = this.zzn;
                        String str3 = this.zza.LIZ;
                        C0W3J.LJIIIIZZ(str3);
                        String str4 = this.zza.LIZIZ;
                        if (!abstractC832430Wl72.LIZLLL(new C0W7T(4225, str3, str4, this.zza.LIZJ), serviceConnectionC832420Wl62, zze(), getBindServiceExecutor())) {
                            zzl(16, null, this.zzd.get());
                        }
                    }
                } else {
                    ServiceConnectionC832420Wl6 serviceConnectionC832420Wl63 = this.zzu;
                    if (serviceConnectionC832420Wl63 != null) {
                        AbstractC832430Wl7 abstractC832430Wl73 = this.zzn;
                        String str5 = this.zza.LIZ;
                        C0W3J.LJIIIIZZ(str5);
                        String str6 = this.zza.LIZIZ;
                        zze();
                        abstractC832430Wl73.LIZJ(str5, str6, 4225, serviceConnectionC832420Wl63, this.zza.LIZJ);
                        this.zzu = null;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void getRemoteService(InterfaceC828880WfO interfaceC828880WfO, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        int i = this.zzy;
        String str = this.zzA;
        int i2 = C829100Wfk.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        Scope[] scopeArr = GetServiceRequest.LLJILJILJ;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.LLJILLL;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.LLILZ = this.zzl.getPackageName();
        getServiceRequest.zzi = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.LLILZLL = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.LLIZ = account;
            if (interfaceC828880WfO != null) {
                getServiceRequest.LLILZIL = interfaceC828880WfO.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.LLIZ = getAccount();
        }
        getServiceRequest.LLIZLLLIL = zze;
        getServiceRequest.LLJ = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.LLJILJIL = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    InterfaceC832810Wlj interfaceC832810Wlj = this.zzr;
                    if (interfaceC832810Wlj != null) {
                        interfaceC832810Wlj.Z(new BinderC829070Wfh(this, this.zzd.get()), getServiceRequest);
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e) {
            TryCatchGuardChecker.doCheck(e);
            triggerConnectionSuspended(3);
        } catch (RemoteException e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException th) {
            throw th;
        } catch (RuntimeException e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public void triggerNotAvailable(InterfaceC832240Wko interfaceC832240Wko, int i, PendingIntent pendingIntent) {
        C0W3J.LJIIIZ(interfaceC832240Wko, "Connection progress callbacks cannot be null.");
        this.zzc = interfaceC832240Wko;
        Handler handler = this.zzb;
        C786410Ut5.LJLJJL(handler, handler.obtainMessage(3, this.zzd.get(), i, pendingIntent));
    }

    public final void zzl(final int i, Bundle bundle, int i2) {
        Handler handler = this.zzb;
        C786410Ut5.LJLJJL(handler, handler.obtainMessage(7, i2, -1, new AbstractC832570WlL(i) { // from class: X.0WlJ
            @Override // X.AbstractC832570WlL
            public final boolean LJFF() {
                this.LJI.zzc.LIZ(ConnectionResult.RESULT_SUCCESS);
                return true;
            }

            @Override // X.AbstractC832570WlL
            public final void LJ(ConnectionResult connectionResult) {
                if (this.LJI.enableLocalFallback() && AbstractC832390Wl3.zzo(this.LJI)) {
                    AbstractC832390Wl3.zzk(this.LJI, 16);
                } else {
                    this.LJI.zzc.LIZ(connectionResult);
                    this.LJI.onConnectionFailed(connectionResult);
                }
            }
        }));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(AbstractC832390Wl3 abstractC832390Wl3, int i, int i2, IInterface iInterface) {
        synchronized (abstractC832390Wl3.zzp) {
            try {
                if (abstractC832390Wl3.zzv != i) {
                    return false;
                }
                abstractC832390Wl3.zzp(i2, iInterface);
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        InterfaceC832810Wlj interfaceC832810Wlj;
        synchronized (this.zzp) {
            try {
                i = this.zzv;
                iInterface = this.zzs;
            } finally {
            }
        }
        synchronized (this.zzq) {
            try {
                interfaceC832810Wlj = this.zzr;
            } finally {
            }
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            printWriter.print("UNKNOWN");
                        } else {
                            printWriter.print("DISCONNECTING");
                        }
                    } else {
                        printWriter.print("CONNECTED");
                    }
                } else {
                    printWriter.print("LOCAL_CONNECTING");
                }
            } else {
                printWriter.print("REMOTE_CONNECTING");
            }
        } else {
            printWriter.print("DISCONNECTED");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append(e3.g).append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC832810Wlj == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC832810Wlj.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j = this.zzh;
            printWriterAppend.println(j + " " + simpleDateFormat.format(new Date(j)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i2 = this.zzf;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        printWriter.append((CharSequence) String.valueOf(i2));
                    } else {
                        printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    }
                } else {
                    printWriter.append("CAUSE_NETWORK_LOST");
                }
            } else {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            }
            PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.zzg;
            printWriterAppend2.println(j2 + " " + simpleDateFormat.format(new Date(j2)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) C829300Wg4.LIZ(this.zzi));
            PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
            long j3 = this.zzj;
            printWriterAppend3.println(j3 + " " + simpleDateFormat.format(new Date(j3)));
        }
    }

    public void onPostInitHandler(final int i, final IBinder iBinder, final Bundle bundle, int i2) {
        Handler handler = this.zzb;
        C786410Ut5.LJLJJL(handler, handler.obtainMessage(1, i2, -1, new AbstractC832570WlL(i, iBinder, bundle) { // from class: X.0WlC
            public final IBinder LJI;

            @Override // X.AbstractC832570WlL
            public final boolean LJFF() {
                try {
                    IBinder iBinder2 = this.LJI;
                    C0W3J.LJIIIIZZ(iBinder2);
                    if (!this.LJII.getServiceDescriptor().equals(iBinder2.getInterfaceDescriptor())) {
                        this.LJII.getServiceDescriptor();
                        return false;
                    }
                    IInterface iInterfaceCreateServiceInterface = this.LJII.createServiceInterface(this.LJI);
                    if (iInterfaceCreateServiceInterface == null) {
                        return false;
                    }
                    if (!AbstractC832390Wl3.zzn(this.LJII, 2, 4, iInterfaceCreateServiceInterface) && !AbstractC832390Wl3.zzn(this.LJII, 3, 4, iInterfaceCreateServiceInterface)) {
                        return false;
                    }
                    this.LJII.zzB = null;
                    Bundle connectionHint = this.LJII.getConnectionHint();
                    AbstractC832390Wl3 abstractC832390Wl3 = this.LJII;
                    if (abstractC832390Wl3.zzw != null) {
                        abstractC832390Wl3.zzw.zk(connectionHint);
                    }
                    return true;
                } catch (RemoteException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return false;
                }
            }

            @Override // X.AbstractC832570WlL
            public final void LJ(ConnectionResult connectionResult) {
                if (this.LJII.zzx != null) {
                    this.LJII.zzx.LJJJZ(connectionResult);
                }
                this.LJII.onConnectionFailed(connectionResult);
            }

            {
                this.LJI = iBinder;
            }
        }));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC832390Wl3(Context context, Looper looper, int i, InterfaceC832770Wlf interfaceC832770Wlf, InterfaceC832830Wll interfaceC832830Wll, String str) {
        C832440Wl8 c832440Wl8LIZ = AbstractC832430Wl7.LIZ(context);
        C829100Wfk c829100Wfk = C829100Wfk.getInstance();
        C0W3J.LJIIIIZZ(interfaceC832770Wlf);
        C0W3J.LJIIIIZZ(interfaceC832830Wll);
        this(context, looper, c832440Wl8LIZ, c829100Wfk, i, interfaceC832770Wlf, interfaceC832830Wll, str);
    }

    public AbstractC832390Wl3(Context context, Handler handler, AbstractC832430Wl7 abstractC832430Wl7, C829100Wfk c829100Wfk, int i, InterfaceC832770Wlf interfaceC832770Wlf, InterfaceC832830Wll interfaceC832830Wll) {
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        C0W3J.LJIIIZ(context, "Context must not be null");
        this.zzl = context;
        C0W3J.LJIIIZ(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        C0W3J.LJIIIZ(abstractC832430Wl7, "Supervisor must not be null");
        this.zzn = abstractC832430Wl7;
        C0W3J.LJIIIZ(c829100Wfk, "API availability must not be null");
        this.zzo = c829100Wfk;
        this.zzy = i;
        this.zzw = interfaceC832770Wlf;
        this.zzx = interfaceC832830Wll;
        this.zzz = null;
    }

    public AbstractC832390Wl3(Context context, Looper looper, AbstractC832430Wl7 abstractC832430Wl7, C829100Wfk c829100Wfk, int i, InterfaceC832770Wlf interfaceC832770Wlf, InterfaceC832830Wll interfaceC832830Wll, String str) {
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        C0W3J.LJIIIZ(context, "Context must not be null");
        this.zzl = context;
        C0W3J.LJIIIZ(looper, "Looper must not be null");
        this.zzm = looper;
        C0W3J.LJIIIZ(abstractC832430Wl7, "Supervisor must not be null");
        this.zzn = abstractC832430Wl7;
        C0W3J.LJIIIZ(c829100Wfk, "API availability must not be null");
        this.zzo = c829100Wfk;
        this.zzb = new zzb(this, looper);
        this.zzy = i;
        this.zzw = interfaceC832770Wlf;
        this.zzx = interfaceC832830Wll;
        this.zzz = str;
    }
}
