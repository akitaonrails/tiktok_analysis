package X;

import X.AbstractC20016313Tl;
import X.ServiceConnectionC20016413Tm;
import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: renamed from: X.13Tl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20016313Tl<INTERFACE> {
    public final Context LL;
    public final String LLILLJJLI;
    public final ComponentName LLILLL;
    public final InterfaceC20016613To<INTERFACE> LLILZ;
    public ServiceConnectionC20016413Tm<INTERFACE> LLILZIL;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final kotlin.jvm.functions.Function1<? super INTERFACE, kotlin.Unit> r8) {
        /*
            r7 = this;
            X.13Tm<INTERFACE> r0 = r7.LLILZIL
            r4 = 0
            if (r0 != 0) goto L6c
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = r7.LLILLJJLI
            r5.<init>(r0)
            android.content.ComponentName r0 = r7.LLILLL
            r5.setComponent(r0)
            android.content.Context r0 = r7.LL
            java.lang.String r0 = r0.getPackageName()
            r5.setPackage(r0)
            android.content.Context r0 = r7.LL
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r6 = 0
            java.util.List r3 = r0.queryIntentServices(r5, r6)
            int r0 = r3.size()
            if (r0 <= 0) goto L81
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r6)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ServiceInfo r0 = r0.serviceInfo
            java.lang.String r1 = r0.packageName
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r6)
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
            android.content.pm.ServiceInfo r0 = r0.serviceInfo
            java.lang.String r0 = r0.name
            r2.<init>(r1, r0)
            r5.setComponent(r2)
            android.content.ComponentName r0 = r5.getComponent()
            java.util.Objects.toString(r0)
            X.13Tm r3 = new X.13Tm
            androidx.lifecycle.MutableLiveData r1 = new androidx.lifecycle.MutableLiveData
            r1.<init>()
            X.13To<INTERFACE> r0 = r7.LLILZ
            r3.<init>(r1, r0)
            android.content.Context r2 = r7.LL
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFgmb6SJYYz92SDNGWi3WmEKPSRd"
            r1.<init>(r0, r4)
            r0 = 1
            boolean r0 = X.C2204961BRm.LJJJJ(r2, r5, r3, r0, r1)
            if (r0 == 0) goto L81
        L6a:
            r7.LLILZIL = r3
        L6c:
            X.13Tm<INTERFACE> r0 = r7.LLILZIL
            if (r0 == 0) goto L7b
            androidx.lifecycle.MutableLiveData<INTERFACE> r1 = r0.LL
            X.13Tn r0 = new X.13Tn
            r0.<init>(r8)
            r1.observeForever(r0)
        L7a:
            return
        L7b:
            if (r8 == 0) goto L7a
            r8.invoke(r4)
            return
        L81:
            r3 = r4
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20016313Tl.LIZIZ(kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC20016313Tl(Context context, ComponentName componentName) {
        C20016713Tp c20016713Tp = new InterfaceC20016613To<InterfaceC559830LxV>() { // from class: X.13Tp
            @Override // X.InterfaceC20016613To
            public final InterfaceC559830LxV LIZ(IBinder iBinder) {
                if (iBinder instanceof InterfaceC559830LxV) {
                    return (InterfaceC559830LxV) iBinder;
                }
                return null;
            }
        };
        this.LL = context;
        this.LLILLJJLI = "com.ss.android.ugc.cut_ui.image.LOADER";
        this.LLILLL = componentName;
        this.LLILZ = c20016713Tp;
        if (context instanceof LifecycleOwner) {
            ((LifecycleOwner) context).getLifecycle().addObserver(new GenericLifecycleObserver(this) { // from class: com.ss.android.ugc.cut_ui.AbsServiceClient$1
                public final /* synthetic */ AbstractC20016313Tl<Object> LL;

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_CREATE) {
                        onCreate();
                    } else if (event == Lifecycle.Event.ON_DESTROY) {
                        onDestroy();
                    }
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
                public final void onCreate() {
                    this.LL.LIZIZ(null);
                }

                @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
                public final void onDestroy() {
                    AbstractC20016313Tl<Object> abstractC20016313Tl = this.LL;
                    ServiceConnectionC20016413Tm<Object> serviceConnectionC20016413Tm = abstractC20016313Tl.LLILZIL;
                    if (serviceConnectionC20016413Tm != null) {
                        abstractC20016313Tl.LL.unbindService(serviceConnectionC20016413Tm);
                        serviceConnectionC20016413Tm.LL.setValue(null);
                    }
                    abstractC20016313Tl.LLILZIL = null;
                }

                {
                    this.LL = this;
                }
            });
        }
    }
}
