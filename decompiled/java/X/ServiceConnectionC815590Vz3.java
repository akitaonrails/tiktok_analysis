package X;

import android.app.Notification;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0Vz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class ServiceConnectionC815590Vz3 implements Handler.Callback, ServiceConnection {
    public final Context LL;
    public final Handler LLILLJJLI;
    public final Map<ComponentName, C815600Vz4> LLILLL = new HashMap();
    public Set<String> LLILZ = new HashSet();

    public ServiceConnectionC815590Vz3(Context context) {
        this.LL = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.LLILLJJLI = new Handler(C786410Ut5.W2(handlerThread), this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C815600Vz4 r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.util.ArrayDeque<X.0Vyz> r0 = r6.LIZLLL
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            boolean r0 = r6.LIZIZ
            if (r0 != 0) goto L3a
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r0 = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
            r1.<init>(r0)
            android.content.ComponentName r0 = r6.LIZ
            android.content.Intent r4 = r1.setComponent(r0)
            android.content.Context r3 = r5.LL
            X.0WZX r2 = new X.0WZX
            java.lang.String r0 = "01789"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            java.lang.String r0 = "dTF6Tg0zW9KSVlgzQFyFdgkXMsP73xEph7vNgaWnm5hBdJGVvPFThvqGGw=="
            r2.<init>(r0, r1)
            r0 = 33
            boolean r0 = X.C2204961BRm.LJJJJ(r3, r4, r5, r0, r2)
            r6.LIZIZ = r0
            if (r0 == 0) goto L42
            r0 = 0
            r6.LJ = r0
        L36:
            boolean r0 = r6.LIZIZ
            if (r0 == 0) goto L3e
        L3a:
            X.0Vz0 r0 = r6.LIZJ
            if (r0 != 0) goto L48
        L3e:
            r5.LIZIZ(r6)
            return
        L42:
            android.content.Context r0 = r5.LL
            r0.unbindService(r5)
            goto L36
        L48:
            java.util.ArrayDeque<X.0Vyz> r0 = r6.LIZLLL
            java.lang.Object r1 = r0.peek()
            X.0Vyz r1 = (X.InterfaceC815550Vyz) r1
            if (r1 == 0) goto L66
            X.0Vz0 r0 = r6.LIZJ     // Catch: android.os.DeadObjectException -> L5d android.os.RemoteException -> L62
            r1.LIZ(r0)     // Catch: android.os.DeadObjectException -> L5d android.os.RemoteException -> L62
            java.util.ArrayDeque<X.0Vyz> r0 = r6.LIZLLL     // Catch: android.os.DeadObjectException -> L5d android.os.RemoteException -> L62
            r0.remove()     // Catch: android.os.DeadObjectException -> L5d android.os.RemoteException -> L62
            goto L48
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L66
        L62:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L66:
            java.util.ArrayDeque<X.0Vyz> r0 = r6.LIZLLL
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L71
            r5.LIZIZ(r6)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ServiceConnectionC815590Vz3.LIZ(X.0Vz4):void");
    }

    public final void LIZIZ(C815600Vz4 c815600Vz4) {
        if (this.LLILLJJLI.hasMessages(3, c815600Vz4.LIZ)) {
            return;
        }
        int i = c815600Vz4.LJ + 1;
        c815600Vz4.LJ = i;
        if (i > 6) {
            c815600Vz4.LIZLLL.clear();
            return;
        }
        C786410Ut5.LJLJLJ(this.LLILLJJLI, this.LLILLJJLI.obtainMessage(3, c815600Vz4.LIZ), (1 << (i - 1)) * LSPassThroughRecordSizeConfig.DEFAULT);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String strLLIIIL;
        Set<String> set;
        int i = message.what;
        InterfaceC815560Vz0 interfaceC815560Vz0 = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    C815600Vz4 c815600Vz4 = (C815600Vz4) ((HashMap) this.LLILLL).get(message.obj);
                    if (c815600Vz4 != null) {
                        LIZ(c815600Vz4);
                    }
                    return true;
                }
                C815600Vz4 c815600Vz42 = (C815600Vz4) ((HashMap) this.LLILLL).get(message.obj);
                if (c815600Vz42 != null) {
                    if (c815600Vz42.LIZIZ) {
                        this.LL.unbindService(this);
                        c815600Vz42.LIZIZ = false;
                    }
                    c815600Vz42.LIZJ = null;
                }
                return true;
            }
            C815610Vz5 c815610Vz5 = (C815610Vz5) message.obj;
            ComponentName componentName = c815610Vz5.LIZ;
            final IBinder iBinder = c815610Vz5.LIZIZ;
            C815600Vz4 c815600Vz43 = (C815600Vz4) ((HashMap) this.LLILLL).get(componentName);
            if (c815600Vz43 != null) {
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC815560Vz0.LJJZ);
                    if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof InterfaceC815560Vz0)) {
                        interfaceC815560Vz0 = (InterfaceC815560Vz0) iInterfaceQueryLocalInterface;
                    } else {
                        interfaceC815560Vz0 = new InterfaceC815560Vz0(iBinder) { // from class: X.0Vz2
                            public final IBinder LL;

                            @Override // android.os.IInterface
                            public final IBinder asBinder() {
                                return this.LL;
                            }

                            {
                                this.LL = iBinder;
                            }

                            @Override // X.InterfaceC815560Vz0
                            public final void LLLLLZIL(int i2, Notification notification, String str, String str2) {
                                Parcel parcelObtain = Parcel.obtain();
                                try {
                                    parcelObtain.writeInterfaceToken(InterfaceC815560Vz0.LJJZ);
                                    parcelObtain.writeString(str);
                                    parcelObtain.writeInt(i2);
                                    parcelObtain.writeString(str2);
                                    if (notification != null) {
                                        parcelObtain.writeInt(1);
                                        notification.writeToParcel(parcelObtain, 0);
                                    } else {
                                        parcelObtain.writeInt(0);
                                    }
                                    this.LL.transact(1, parcelObtain, null, 1);
                                    parcelObtain.recycle();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    parcelObtain.recycle();
                                    throw th;
                                }
                            }
                        };
                    }
                }
                c815600Vz43.LIZJ = interfaceC815560Vz0;
                c815600Vz43.LJ = 0;
                LIZ(c815600Vz43);
            }
            return true;
        }
        Object obj = message.obj;
        ContentResolver contentResolver = this.LL.getContentResolver();
        if (TextUtils.equals("enabled_notification_listeners", "android_id")) {
            if (C10EU.LJIILIIL() && C20123713oZ.LIZ()) {
                strLLIIIL = "";
            } else {
                if (TextUtils.isEmpty(C20123713oZ.LIZ)) {
                    C20123713oZ.LIZ = C2204961BRm.LLIIIL(contentResolver, "enabled_notification_listeners", new C0WZX("dTF6Tg0zW9KSVlgzQFyFdgkXMsP73xEph7vNgaWnm5hBdJGVvPFThvqGGw==", new String[]{"01789"}));
                }
                strLLIIIL = C20123713oZ.LIZ;
            }
        } else {
            strLLIIIL = C2204961BRm.LLIIIL(contentResolver, "enabled_notification_listeners", new C0WZX("dTF6Tg0zW9KSVlgzQFyFdgkXMsP73xEph7vNgaWnm5hBdJGVvPFThvqGGw==", new String[]{"01789"}));
        }
        synchronized (C815520Vyw.LIZJ) {
            if (strLLIIIL != null) {
                try {
                    if (!strLLIIIL.equals(C815520Vyw.LIZLLL)) {
                        String[] strArrSplit = strLLIIIL.split(":", -1);
                        HashSet hashSet = new HashSet(strArrSplit.length);
                        for (String str : strArrSplit) {
                            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                            if (componentNameUnflattenFromString != null) {
                                hashSet.add(C2204961BRm.LJJIJIL(componentNameUnflattenFromString, new C0WZX("dTF6Tg0zW9KSVlgzQFyFdgkXMsP73xEph7vNgaWnm5hBdJGVvPFThvqGGw==", new String[]{"01789"})));
                            }
                        }
                        C815520Vyw.LJ = hashSet;
                        C815520Vyw.LIZLLL = strLLIIIL;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            set = C815520Vyw.LJ;
        }
        if (!set.equals(this.LLILZ)) {
            this.LLILZ = set;
            List<ResolveInfo> listQueryIntentServices = this.LL.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet2 = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (((HashSet) set).contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission == null) {
                        hashSet2.add(componentName2);
                    }
                }
            }
            for (ComponentName componentName3 : hashSet2) {
                if (!((HashMap) this.LLILLL).containsKey(componentName3)) {
                    ((HashMap) this.LLILLL).put(componentName3, new C815600Vz4(componentName3));
                }
            }
            Iterator it2 = ((HashMap) this.LLILLL).entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet2.contains(entry.getKey())) {
                    C815600Vz4 c815600Vz44 = (C815600Vz4) entry.getValue();
                    if (c815600Vz44.LIZIZ) {
                        this.LL.unbindService(this);
                        c815600Vz44.LIZIZ = false;
                    }
                    c815600Vz44.LIZJ = null;
                    it2.remove();
                }
            }
        }
        for (C815600Vz4 c815600Vz45 : ((HashMap) this.LLILLL).values()) {
            c815600Vz45.LIZLLL.add((InterfaceC815550Vyz) obj);
            LIZ(c815600Vz45);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.LLILLJJLI.obtainMessage(2, componentName).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws Throwable {
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11064, "androidx/core/app/NotificationManagerCompat$SideChannelManager", "onServiceConnected", this, new Object[]{componentName, iBinder}, "void", new C0WZW(false, "(Landroid/content/ComponentName;Landroid/os/IBinder;)V", new C0WZX("dTF6Tg0zW9KSVlgzQFyFdgkXMsP73xEph7vNgaWnm5hBdJGVvPFThvqGGw==", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            if (obj != null) {
                componentName = (ComponentName) obj;
            }
            Object obj2 = objArr[1];
            if (obj2 != null) {
                iBinder = (IBinder) obj2;
            }
        }
        this.LLILLJJLI.obtainMessage(1, new C815610Vz5(componentName, iBinder)).sendToTarget();
    }
}
