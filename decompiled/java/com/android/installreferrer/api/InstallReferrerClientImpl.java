package com.android.installreferrer.api;

import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import X.InterfaceC19859712n5;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClientImpl;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: loaded from: classes31.dex */
public class InstallReferrerClientImpl extends InstallReferrerClient {
    public int clientState;
    public final Context mApplicationContext;
    public InterfaceC19859712n5 service;
    public ServiceConnection serviceConnection;

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.clientState = 3;
        if (this.serviceConnection != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.mApplicationContext.unbindService(this.serviceConnection);
            this.serviceConnection = null;
        }
        this.service = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.clientState != 2 || this.service == null || this.serviceConnection == null) ? false : true;
    }

    private boolean isPlayStoreCompatible() {
        try {
            return C786410Ut5.Y3(this.mApplicationContext.getPackageManager(), "com.android.vending", 128).versionCode >= 80837300;
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() throws RemoteException {
        if (!isReady()) {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("package_name", this.mApplicationContext.getPackageName(), bundle);
        try {
            return new ReferrerDetails(this.service.LLJJIJIIJIL(bundle));
        } catch (RemoteException e) {
            TryCatchGuardChecker.doCheck(e);
            InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
            this.clientState = 0;
            throw e;
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.mApplicationContext = C786410Ut5.N3(context);
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void startConnection(final InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (isReady()) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.clientState;
        if (i == 1) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        if (i == 3) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
            return;
        }
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Starting install referrer service setup.");
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        List<ResolveInfo> listQueryIntentServices = this.mApplicationContext.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty() && (serviceInfo = ((ResolveInfo) ListProtector.get(listQueryIntentServices, 0)).serviceInfo) != null) {
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if ("com.android.vending".equals(str) && str2 != null && isPlayStoreCompatible()) {
                Intent intent2 = new Intent(intent);
                ServiceConnection serviceConnection = new ServiceConnection(installReferrerStateListener) { // from class: X.12n4
                    public final InstallReferrerStateListener LL;

                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName componentName) {
                        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
                        this.LLILLJJLI.service = null;
                        this.LLILLJJLI.clientState = 0;
                        this.LL.onInstallReferrerServiceDisconnected();
                    }

                    {
                        if (installReferrerStateListener != null) {
                            this.LL = installReferrerStateListener;
                            return;
                        }
                        throw new RuntimeException("Please specify a listener to know when setup is done.");
                    }

                    @Override // android.content.ServiceConnection
                    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
                        IBinder iBinder2 = iBinder;
                        InterfaceC19859712n5 c19859912n7 = null;
                        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/android/installreferrer/api/InstallReferrerClientImpl$InstallReferrerServiceConnection", "onServiceConnected", this, new Object[]{componentName, iBinder2}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgM0W9jTXFNvTByXcm5Cx/qQX4e5jfQy1kKzmFCkU2tmY8Nv7exDiQsUuWFYz+Fr3jPyT5H6", null)));
                        if (c0wsuLIZIZ.LIZ) {
                            return;
                        }
                        Object[] objArr = c0wsuLIZIZ.LIZJ;
                        if (objArr != null) {
                            Object obj = objArr[0];
                            Object obj2 = objArr[1];
                            if (obj2 != null) {
                                iBinder2 = (IBinder) obj2;
                            }
                        }
                        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
                        InstallReferrerClientImpl installReferrerClientImpl = this.LLILLJJLI;
                        if (iBinder2 != null) {
                            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                            if (iInterfaceQueryLocalInterface instanceof InterfaceC19859712n5) {
                                c19859912n7 = (InterfaceC19859712n5) iInterfaceQueryLocalInterface;
                            } else {
                                c19859912n7 = new C19859912n7(iBinder2);
                            }
                        }
                        installReferrerClientImpl.service = c19859912n7;
                        this.LLILLJJLI.clientState = 2;
                        this.LL.onInstallReferrerSetupFinished(0);
                    }
                };
                this.serviceConnection = serviceConnection;
                if (C2204961BRm.LJJJJ(this.mApplicationContext, intent2, serviceConnection, 1, new C0WZX("dzBzEgM0W9jTXFNvTByXcm5Cx/qQX4e5jfQy1kKzmFCkU2tmY8Nv7exDiQsUuWFYz+Fr3jPyT5H6", null))) {
                    InstallReferrerCommons.logVerbose("InstallReferrerClient", "Service was bonded successfully.");
                    return;
                }
                InstallReferrerCommons.logWarn("InstallReferrerClient", "Connection to service is blocked.");
                this.clientState = 0;
                installReferrerStateListener.onInstallReferrerSetupFinished(1);
                return;
            }
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
            this.clientState = 0;
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
            return;
        }
        this.clientState = 0;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service unavailable on device.");
        installReferrerStateListener.onInstallReferrerSetupFinished(2);
    }
}
