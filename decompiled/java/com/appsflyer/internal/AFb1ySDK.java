package com.appsflyer.internal;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2204961BRm;
import X.C786410Ut5;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.appsflyer.AFLogger;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes14.dex */
public final class AFb1ySDK {

    public static final class AFa1tSDK implements IInterface {
        public final IBinder AFInAppEventType;

        public final String AFInAppEventParameterName() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.AFInAppEventType.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                String string = parcelObtain2.readString();
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return string;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }

        public final boolean AFKeystoreWrapper() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(1);
                this.AFInAppEventType.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                boolean z = parcelObtain2.readInt() != 0;
                parcelObtain2.recycle();
                parcelObtain.recycle();
                return z;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                parcelObtain2.recycle();
                parcelObtain.recycle();
                throw th;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.AFInAppEventType;
        }

        public AFa1tSDK(IBinder iBinder) {
            this.AFInAppEventType = iBinder;
        }
    }

    public static final class AFa1zSDK implements ServiceConnection {
        public boolean AFInAppEventType;
        public final LinkedBlockingQueue<IBinder> values;

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public AFa1zSDK() {
            this.values = new LinkedBlockingQueue<>(1);
            this.AFInAppEventType = false;
        }

        public /* synthetic */ AFa1zSDK(byte b) {
            this();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
            C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "com/appsflyer/internal/AFb1ySDK$AFa1zSDK", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bdsceleyw==", new String[]{"01c45"})));
            if (c0wsuLIZIZ.LIZ) {
                return;
            }
            Object[] objArr = c0wsuLIZIZ.LIZJ;
            Object obj = iBinder;
            if (objArr != null) {
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                obj = iBinder;
                if (obj3 != null) {
                    obj = obj3;
                }
            }
            try {
                this.values.put((IBinder) obj);
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
                AFLogger.afErrorLogForExcManagerOnly("onServiceConnected Interrupted", e);
            }
        }
    }

    public static final class AFa1uSDK {
        public final String AFKeystoreWrapper;
        public final boolean valueOf;

        public final boolean valueOf() {
            return this.valueOf;
        }

        public AFa1uSDK(String str, boolean z) {
            this.AFKeystoreWrapper = str;
            this.valueOf = z;
        }
    }

    public static AFa1uSDK values(Context context) throws IOException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            C786410Ut5.Y3(context.getPackageManager(), "com.android.vending", 0);
            AFa1zSDK aFa1zSDK = new AFa1zSDK((byte) 0);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (C2204961BRm.LJJJJ(context, intent, aFa1zSDK, 1, new C0WZX("dzBzEgMqT9naWU4kV1yNaEAr35CqUcZV5bdsceleyw==", new String[]{"01c45"}))) {
                    if (!aFa1zSDK.AFInAppEventType) {
                        aFa1zSDK.AFInAppEventType = true;
                        IBinder iBinderPoll = aFa1zSDK.values.poll(10L, TimeUnit.SECONDS);
                        if (iBinderPoll != null) {
                            AFa1tSDK aFa1tSDK = new AFa1tSDK(iBinderPoll);
                            AFa1uSDK aFa1uSDK = new AFa1uSDK(aFa1tSDK.AFInAppEventParameterName(), aFa1tSDK.AFKeystoreWrapper());
                            context.unbindService(aFa1zSDK);
                            return aFa1uSDK;
                        }
                        throw new TimeoutException("Timed out waiting for the service connection");
                    }
                    throw new IllegalStateException("Cannot call get on this connection more than once");
                }
                context.unbindService(aFa1zSDK);
                throw new IOException("Google Play connection failed");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                context.unbindService(aFa1zSDK);
                throw th;
            }
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }
}
