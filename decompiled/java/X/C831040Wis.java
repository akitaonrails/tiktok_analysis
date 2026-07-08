package X;

import X.C830490Whz;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.internal.base.zaq;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0Wis, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831040Wis implements Handler.Callback {
    public static final Status LLJJI = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status LLJJIII = new Status(4, "The user must be signed in to make this API call.");
    public static final Object LLJJIJI = new Object();
    public static C831040Wis LLJJIJIIJIL;
    public boolean LLILLJJLI;
    public TelemetryData LLILLL;
    public C832500WlE LLILZ;
    public final Context LLILZIL;
    public final GoogleApiAvailability LLILZLL;
    public final C831220WjA LLIZ;
    public final zaq LLJILLL;
    public volatile boolean LLJJ;
    public long LL = 10000;
    public final AtomicInteger LLIZLLLIL = new AtomicInteger(1);
    public final AtomicInteger LLJ = new AtomicInteger(0);
    public final Map<C831420WjU<?>, C831140Wj2<?>> LLJI = new ConcurrentHashMap(5, 0.75f, 1);
    public C831050Wit LLJIJIL = null;
    public final C835410Wpv LLJILJIL = new C835410Wpv();
    public final C835410Wpv LLJILJILJ = new C835410Wpv();

    public static void LIZ() {
        synchronized (LLJJIJI) {
            try {
                C831040Wis c831040Wis = LLJJIJIIJIL;
                if (c831040Wis != null) {
                    c831040Wis.LLJ.incrementAndGet();
                    zaq zaqVar = c831040Wis.LLJILLL;
                    C786410Ut5.LJLJJLL(zaqVar, zaqVar.obtainMessage(10));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LIZJ() {
        if (this.LLILLJJLI) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration = C831020Wiq.LIZ().LIZ;
        if (rootTelemetryConfiguration != null && !rootTelemetryConfiguration.zzb) {
            return false;
        }
        int i = this.LLIZ.LIZ.get(203400000, -1);
        return i == -1 || i == 0;
    }

    public static C831040Wis LJI(Context context) {
        C831040Wis c831040Wis;
        synchronized (LLJJIJI) {
            try {
                if (LLJJIJIIJIL == null) {
                    LLJJIJIIJIL = new C831040Wis(C786410Ut5.N3(context), C786410Ut5.W2(AbstractC832430Wl7.LIZIZ()), GoogleApiAvailability.getInstance());
                }
                c831040Wis = LLJJIJIIJIL;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c831040Wis;
    }

    public final void LIZIZ(C831050Wit c831050Wit) {
        synchronized (LLJJIJI) {
            try {
                if (this.LLJIJIL != c831050Wit) {
                    this.LLJIJIL = c831050Wit;
                    this.LLJILJIL.clear();
                }
                this.LLJILJIL.addAll(c831050Wit.LLILZLL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C831140Wj2<?> LJ(AbstractC831380WjQ<?> abstractC831380WjQ) {
        Object apiKey = abstractC831380WjQ.getApiKey();
        C831140Wj2<?> c831140Wj2 = (C831140Wj2) ((ConcurrentHashMap) this.LLJI).get(apiKey);
        if (c831140Wj2 == null) {
            c831140Wj2 = new C831140Wj2<>(this, abstractC831380WjQ);
            ((ConcurrentHashMap) this.LLJI).put(apiKey, c831140Wj2);
        }
        if (c831140Wj2.LLILLJJLI.requiresSignIn()) {
            this.LLJILJILJ.add(apiKey);
        }
        c831140Wj2.LJIILIIL();
        return c831140Wj2;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [X.0WlE] */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.0WlE] */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.0WlE] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Feature[] featureArrLJI;
        Status status;
        long j = 300000;
        switch (message.what) {
            case 1:
                if (true == ((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue()) {
                    j = 10000;
                }
                this.LL = j;
                this.LLJILLL.removeMessages(12);
                for (Object obj : ((ConcurrentHashMap) this.LLJI).keySet()) {
                    zaq zaqVar = this.LLJILLL;
                    C786410Ut5.LJLJLJ(zaqVar, zaqVar.obtainMessage(12, obj), this.LL);
                }
                return true;
            case 2:
                C829290Wg3 c829290Wg3 = (C829290Wg3) HandlerHook.getMessageObj(message.obj);
                Iterator it2 = ((C830490Whz.c) c829290Wg3.LIZ.keySet()).iterator();
                while (true) {
                    AbstractC1322040kVW abstractC1322040kVW = (AbstractC1322040kVW) it2;
                    if (abstractC1322040kVW.hasNext()) {
                        C831420WjU<?> c831420WjU = (C831420WjU) abstractC1322040kVW.next();
                        C831140Wj2 c831140Wj2 = (C831140Wj2) ((ConcurrentHashMap) this.LLJI).get(c831420WjU);
                        if (c831140Wj2 == null) {
                            c829290Wg3.LIZ(c831420WjU, new ConnectionResult(13), null);
                        } else if (c831140Wj2.LLILLJJLI.isConnected()) {
                            c829290Wg3.LIZ(c831420WjU, ConnectionResult.RESULT_SUCCESS, c831140Wj2.LLILLJJLI.getEndpointPackageName());
                        } else {
                            C0W3J.LIZJ(c831140Wj2.LLJILJILJ.LLJILLL);
                            ConnectionResult connectionResult = c831140Wj2.LLJIJIL;
                            if (connectionResult != null) {
                                c829290Wg3.LIZ(c831420WjU, connectionResult, null);
                            } else {
                                C0W3J.LIZJ(c831140Wj2.LLJILJILJ.LLJILLL);
                                ((HashSet) c831140Wj2.LLILZIL).add(c829290Wg3);
                                c831140Wj2.LJIILIIL();
                            }
                        }
                    }
                }
                return true;
            case 3:
                for (C831140Wj2 c831140Wj22 : ((ConcurrentHashMap) this.LLJI).values()) {
                    C0W3J.LIZJ(c831140Wj22.LLJILJILJ.LLJILLL);
                    c831140Wj22.LLJIJIL = null;
                    c831140Wj22.LJIILIIL();
                }
                return true;
            case 4:
            case 8:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                C831100Wiy c831100Wiy = (C831100Wiy) HandlerHook.getMessageObj(message.obj);
                C831140Wj2<?> c831140Wj2LJ = (C831140Wj2) ((ConcurrentHashMap) this.LLJI).get(c831100Wiy.LIZJ.getApiKey());
                if (c831140Wj2LJ == null) {
                    c831140Wj2LJ = LJ(c831100Wiy.LIZJ);
                }
                if (c831140Wj2LJ.LLILLJJLI.requiresSignIn() && this.LLJ.get() != c831100Wiy.LIZIZ) {
                    c831100Wiy.LIZ.LIZ(LLJJI);
                    c831140Wj2LJ.LJIILLIIL();
                    return true;
                }
                c831140Wj2LJ.LJIILJJIL(c831100Wiy.LIZ);
                return true;
            case 5:
                int i = message.arg1;
                ConnectionResult connectionResult2 = (ConnectionResult) HandlerHook.getMessageObj(message.obj);
                for (C831140Wj2 c831140Wj23 : ((ConcurrentHashMap) this.LLJI).values()) {
                    if (c831140Wj23.LLIZ == i) {
                        if (connectionResult2.zzb == 13) {
                            String errorString = this.LLILZLL.getErrorString(connectionResult2.zzb);
                            String str = connectionResult2.zzd;
                            StringBuilder sb = new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(str).length());
                            sb.append("Error resolution was canceled by the user, original error message: ");
                            sb.append(errorString);
                            sb.append(": ");
                            sb.append(str);
                            c831140Wj23.LIZJ(new Status(17, sb.toString()));
                            return true;
                        }
                        c831140Wj23.LIZJ(LIZLLL(c831140Wj23.LLILLL, connectionResult2));
                        return true;
                    }
                }
                StringBuilder sb2 = new StringBuilder(76);
                sb2.append("Could not find API instance ");
                sb2.append(i);
                sb2.append(" while trying to fail enqueued calls.");
                Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                return true;
            case 6:
                if (C786410Ut5.N3(this.LLILZIL) instanceof Application) {
                    ComponentCallbacks2C818900WAm.LIZJ((Application) C786410Ut5.N3(this.LLILZIL));
                    ComponentCallbacks2C818900WAm componentCallbacks2C818900WAm = ComponentCallbacks2C818900WAm.LLILZIL;
                    componentCallbacks2C818900WAm.LIZ(new C0WB1() { // from class: X.0WXx
                        @Override // X.C0WB1
                        public final void LIZ(boolean z) {
                            zaq zaqVar2 = this.LIZ.LLJILLL;
                            C786410Ut5.LJLJJL(zaqVar2, zaqVar2.obtainMessage(1, Boolean.valueOf(z)));
                        }
                    });
                    if (!componentCallbacks2C818900WAm.LLILLJJLI.get()) {
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!componentCallbacks2C818900WAm.LLILLJJLI.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            componentCallbacks2C818900WAm.LL.set(true);
                        }
                    }
                    if (!componentCallbacks2C818900WAm.LL.get()) {
                        this.LL = 300000L;
                        return true;
                    }
                }
                return true;
            case 7:
                LJ((AbstractC831380WjQ) HandlerHook.getMessageObj(message.obj));
                return true;
            case BdTuring.TYPE_ECAF /* 9 */:
                if (((ConcurrentHashMap) this.LLJI).containsKey(HandlerHook.getMessageObj(message.obj))) {
                    C831140Wj2 c831140Wj24 = (C831140Wj2) ((ConcurrentHashMap) this.LLJI).get(HandlerHook.getMessageObj(message.obj));
                    C0W3J.LIZJ(c831140Wj24.LLJILJILJ.LLJILLL);
                    if (c831140Wj24.LLJ) {
                        c831140Wj24.LJIILIIL();
                        return true;
                    }
                }
                return true;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C835410Wpv c835410Wpv = this.LLJILJILJ;
                c835410Wpv.getClass();
                C835430Wpx c835430Wpx = new C835430Wpx(c835410Wpv);
                while (c835430Wpx.hasNext()) {
                    C831140Wj2 c831140Wj25 = (C831140Wj2) ((ConcurrentHashMap) this.LLJI).remove(c835430Wpx.next());
                    if (c831140Wj25 != null) {
                        c831140Wj25.LJIILLIIL();
                    }
                }
                this.LLJILJILJ.clear();
                return true;
            case BdTuring.TYPE_EMAIL /* 11 */:
                if (((ConcurrentHashMap) this.LLJI).containsKey(HandlerHook.getMessageObj(message.obj))) {
                    C831140Wj2 c831140Wj26 = (C831140Wj2) ((ConcurrentHashMap) this.LLJI).get(HandlerHook.getMessageObj(message.obj));
                    C0W3J.LIZJ(c831140Wj26.LLJILJILJ.LLJILLL);
                    if (c831140Wj26.LLJ) {
                        c831140Wj26.LJIIIZ();
                        C831040Wis c831040Wis = c831140Wj26.LLJILJILJ;
                        if (C786410Ut5.b4(c831040Wis.LLILZLL, c831040Wis.LLILZIL) == 18) {
                            status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
                        } else {
                            status = new Status(22, "API failed to connect while resuming due to an unknown error.");
                        }
                        c831140Wj26.LIZJ(status);
                        c831140Wj26.LLILLJJLI.disconnect("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                if (((ConcurrentHashMap) this.LLJI).containsKey(HandlerHook.getMessageObj(message.obj))) {
                    ((C831140Wj2) ((ConcurrentHashMap) this.LLJI).get(HandlerHook.getMessageObj(message.obj))).LJIIL(true);
                    return true;
                }
                return true;
            case 14:
                C831090Wix c831090Wix = (C831090Wix) HandlerHook.getMessageObj(message.obj);
                C831420WjU<?> c831420WjU2 = c831090Wix.LIZ;
                if (!((ConcurrentHashMap) this.LLJI).containsKey(c831420WjU2)) {
                    c831090Wix.LIZIZ.LIZIZ(Boolean.FALSE);
                    return true;
                }
                c831090Wix.LIZIZ.LIZIZ(Boolean.valueOf(((C831140Wj2) ((ConcurrentHashMap) this.LLJI).get(c831420WjU2)).LJIIL(false)));
                return true;
            case 15:
                C831060Wiu c831060Wiu = (C831060Wiu) HandlerHook.getMessageObj(message.obj);
                if (((ConcurrentHashMap) this.LLJI).containsKey(c831060Wiu.LIZ)) {
                    C831140Wj2 c831140Wj27 = (C831140Wj2) ((ConcurrentHashMap) this.LLJI).get(c831060Wiu.LIZ);
                    if (((ArrayList) c831140Wj27.LLJI).contains(c831060Wiu) && !c831140Wj27.LLJ) {
                        if (!c831140Wj27.LLILLJJLI.isConnected()) {
                            c831140Wj27.LJIILIIL();
                            return true;
                        }
                        c831140Wj27.LJ();
                        return true;
                    }
                }
                return true;
            case 16:
                C831060Wiu c831060Wiu2 = (C831060Wiu) HandlerHook.getMessageObj(message.obj);
                if (((ConcurrentHashMap) this.LLJI).containsKey(c831060Wiu2.LIZ)) {
                    C831140Wj2<?> c831140Wj28 = (C831140Wj2) ((ConcurrentHashMap) this.LLJI).get(c831060Wiu2.LIZ);
                    if (((ArrayList) c831140Wj28.LLJI).remove(c831060Wiu2)) {
                        c831140Wj28.LLJILJILJ.LLJILLL.removeMessages(15, c831060Wiu2);
                        c831140Wj28.LLJILJILJ.LLJILLL.removeMessages(16, c831060Wiu2);
                        Feature feature = c831060Wiu2.LIZIZ;
                        ArrayList arrayList = new ArrayList(((LinkedList) c831140Wj28.LL).size());
                        for (AbstractC831170Wj5 abstractC831170Wj5 : c831140Wj28.LL) {
                            if ((abstractC831170Wj5 instanceof AbstractC831260WjE) && (featureArrLJI = ((AbstractC831260WjE) abstractC831170Wj5).LJI(c831140Wj28)) != null) {
                                int length = featureArrLJI.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= length) {
                                    }
                                    if (C0W0T.LIZIZ(featureArrLJI[i2], feature)) {
                                        if (i2 >= 0) {
                                            arrayList.add(abstractC831170Wj5);
                                        }
                                    } else {
                                        i2++;
                                    }
                                    break;
                                }
                            }
                        }
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            AbstractC831170Wj5 abstractC831170Wj52 = (AbstractC831170Wj5) ListProtector.get(arrayList, i3);
                            ((LinkedList) c831140Wj28.LL).remove(abstractC831170Wj52);
                            abstractC831170Wj52.LIZIZ(new C831120Wj0(feature));
                        }
                    }
                }
                return true;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                TelemetryData telemetryData = this.LLILLL;
                if (telemetryData != null) {
                    if (telemetryData.zaa > 0 || LIZJ()) {
                        if (this.LLILZ == null) {
                            final Context context = this.LLILZIL;
                            this.LLILZ = new AbstractC831380WjQ<C832670WlV>(context) { // from class: X.0WlE
                                public static final C832010WkR<C832670WlV> LIZ = new C832010WkR<>("ClientTelemetry.API", new AbstractC831970WkN<C832620WlQ, C832670WlV>() { // from class: X.0WlP
                                    @Override // X.AbstractC831970WkN
                                    public final /* synthetic */ InterfaceC831160Wj4 buildClient(Context context2, Looper looper, C831470WjZ c831470WjZ, C832670WlV c832670WlV, InterfaceC832280Wks interfaceC832280Wks, InterfaceC832890Wlr interfaceC832890Wlr) {
                                        return new AbstractC832400Wl4<C832790Wlh>(context2, looper, c831470WjZ, c832670WlV, interfaceC832280Wks, interfaceC832890Wlr) { // from class: X.0WlQ
                                            public final C832670WlV LL;

                                            @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                                            public final int getMinApkVersion() {
                                                return 203400000;
                                            }

                                            @Override // X.AbstractC832390Wl3
                                            public final String getServiceDescriptor() {
                                                return "com.google.android.gms.common.internal.service.IClientTelemetryService";
                                            }

                                            @Override // X.AbstractC832390Wl3
                                            public final String getStartServiceAction() {
                                                return "com.google.android.gms.common.telemetry.service.START";
                                            }

                                            @Override // X.AbstractC832390Wl3
                                            public final boolean getUseDynamicLookup() {
                                                return true;
                                            }

                                            @Override // X.AbstractC832390Wl3
                                            public final Bundle getGetServiceRequestExtraArgs() {
                                                C832670WlV c832670WlV2 = this.LL;
                                                c832670WlV2.getClass();
                                                Bundle bundle = new Bundle();
                                                String str2 = c832670WlV2.LL;
                                                if (str2 != null) {
                                                    C786410Ut5.LJJJI("api", str2, bundle);
                                                }
                                                return bundle;
                                            }

                                            @Override // X.AbstractC832390Wl3
                                            public final Feature[] getApiFeatures() {
                                                return C832800Wli.LIZIZ;
                                            }

                                            @Override // X.AbstractC832390Wl3
                                            public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
                                                if (iBinder == null) {
                                                    return null;
                                                }
                                                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
                                                if (iInterfaceQueryLocalInterface instanceof C832790Wlh) {
                                                    return iInterfaceQueryLocalInterface;
                                                }
                                                return new C832590WlN(iBinder) { // from class: X.0Wlh
                                                };
                                            }

                                            {
                                                this.LL = c832670WlV;
                                            }
                                        };
                                    }
                                }, new C832160Wkg());

                                {
                                    C832670WlV c832670WlV = C832670WlV.LLILLJJLI;
                                    C832010WkR<C832670WlV> c832010WkR = LIZ;
                                    C831490Wjb c831490Wjb = C831490Wjb.LIZJ;
                                }

                                public final AbstractC835450Wpz<Void> LIZLLL(final TelemetryData telemetryData2) {
                                    C832510WlF c832510WlF = new C832510WlF();
                                    c832510WlF.LIZJ = new Feature[]{C832800Wli.LIZ};
                                    c832510WlF.LIZIZ = false;
                                    c832510WlF.LIZ = new InterfaceC831290WjH() { // from class: X.0WlD
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // X.InterfaceC831290WjH
                                        public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj2) {
                                            TelemetryData telemetryData3 = telemetryData2;
                                            C835520Wq6 c835520Wq6 = (C835520Wq6) obj2;
                                            C832590WlN c832590WlN = (C832590WlN) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                                            c832590WlN.getClass();
                                            Parcel parcelObtain = Parcel.obtain();
                                            parcelObtain.writeInterfaceToken(c832590WlN.LLILLJJLI);
                                            if (telemetryData3 == null) {
                                                parcelObtain.writeInt(0);
                                            } else {
                                                parcelObtain.writeInt(1);
                                                telemetryData3.writeToParcel(parcelObtain, 0);
                                            }
                                            try {
                                                c832590WlN.LL.transact(1, parcelObtain, null, 1);
                                                parcelObtain.recycle();
                                                c835520Wq6.LIZIZ(null);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                parcelObtain.recycle();
                                                throw th;
                                            }
                                        }
                                    };
                                    return doBestEffortWrite(c832510WlF.LIZ());
                                }
                            };
                        }
                        LIZLLL(telemetryData);
                    }
                    this.LLILLL = null;
                    return true;
                }
                return true;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                C831030Wir c831030Wir = (C831030Wir) HandlerHook.getMessageObj(message.obj);
                if (c831030Wir.LIZJ == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(c831030Wir.LIZIZ, Arrays.asList(c831030Wir.LIZ));
                    if (this.LLILZ == null) {
                        final Context context2 = this.LLILZIL;
                        this.LLILZ = new AbstractC831380WjQ<C832670WlV>(context2) { // from class: X.0WlE
                            public static final C832010WkR<C832670WlV> LIZ = new C832010WkR<>("ClientTelemetry.API", new AbstractC831970WkN<C832620WlQ, C832670WlV>() { // from class: X.0WlP
                                @Override // X.AbstractC831970WkN
                                public final /* synthetic */ InterfaceC831160Wj4 buildClient(Context context22, Looper looper, C831470WjZ c831470WjZ, C832670WlV c832670WlV, InterfaceC832280Wks interfaceC832280Wks, InterfaceC832890Wlr interfaceC832890Wlr) {
                                    return new AbstractC832400Wl4<C832790Wlh>(context22, looper, c831470WjZ, c832670WlV, interfaceC832280Wks, interfaceC832890Wlr) { // from class: X.0WlQ
                                        public final C832670WlV LL;

                                        @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                                        public final int getMinApkVersion() {
                                            return 203400000;
                                        }

                                        @Override // X.AbstractC832390Wl3
                                        public final String getServiceDescriptor() {
                                            return "com.google.android.gms.common.internal.service.IClientTelemetryService";
                                        }

                                        @Override // X.AbstractC832390Wl3
                                        public final String getStartServiceAction() {
                                            return "com.google.android.gms.common.telemetry.service.START";
                                        }

                                        @Override // X.AbstractC832390Wl3
                                        public final boolean getUseDynamicLookup() {
                                            return true;
                                        }

                                        @Override // X.AbstractC832390Wl3
                                        public final Bundle getGetServiceRequestExtraArgs() {
                                            C832670WlV c832670WlV2 = this.LL;
                                            c832670WlV2.getClass();
                                            Bundle bundle = new Bundle();
                                            String str2 = c832670WlV2.LL;
                                            if (str2 != null) {
                                                C786410Ut5.LJJJI("api", str2, bundle);
                                            }
                                            return bundle;
                                        }

                                        @Override // X.AbstractC832390Wl3
                                        public final Feature[] getApiFeatures() {
                                            return C832800Wli.LIZIZ;
                                        }

                                        @Override // X.AbstractC832390Wl3
                                        public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
                                            if (iBinder == null) {
                                                return null;
                                            }
                                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
                                            if (iInterfaceQueryLocalInterface instanceof C832790Wlh) {
                                                return iInterfaceQueryLocalInterface;
                                            }
                                            return new C832590WlN(iBinder) { // from class: X.0Wlh
                                            };
                                        }

                                        {
                                            this.LL = c832670WlV;
                                        }
                                    };
                                }
                            }, new C832160Wkg());

                            {
                                C832670WlV c832670WlV = C832670WlV.LLILLJJLI;
                                C832010WkR<C832670WlV> c832010WkR = LIZ;
                                C831490Wjb c831490Wjb = C831490Wjb.LIZJ;
                            }

                            public final AbstractC835450Wpz<Void> LIZLLL(final TelemetryData telemetryData22) {
                                C832510WlF c832510WlF = new C832510WlF();
                                c832510WlF.LIZJ = new Feature[]{C832800Wli.LIZ};
                                c832510WlF.LIZIZ = false;
                                c832510WlF.LIZ = new InterfaceC831290WjH() { // from class: X.0WlD
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // X.InterfaceC831290WjH
                                    public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj2) {
                                        TelemetryData telemetryData3 = telemetryData22;
                                        C835520Wq6 c835520Wq6 = (C835520Wq6) obj2;
                                        C832590WlN c832590WlN = (C832590WlN) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                                        c832590WlN.getClass();
                                        Parcel parcelObtain = Parcel.obtain();
                                        parcelObtain.writeInterfaceToken(c832590WlN.LLILLJJLI);
                                        if (telemetryData3 == null) {
                                            parcelObtain.writeInt(0);
                                        } else {
                                            parcelObtain.writeInt(1);
                                            telemetryData3.writeToParcel(parcelObtain, 0);
                                        }
                                        try {
                                            c832590WlN.LL.transact(1, parcelObtain, null, 1);
                                            parcelObtain.recycle();
                                            c835520Wq6.LIZIZ(null);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            parcelObtain.recycle();
                                            throw th;
                                        }
                                    }
                                };
                                return doBestEffortWrite(c832510WlF.LIZ());
                            }
                        };
                    }
                    LIZLLL(telemetryData2);
                    return true;
                }
                TelemetryData telemetryData3 = this.LLILLL;
                if (telemetryData3 != null) {
                    List<MethodInvocation> list = telemetryData3.zab;
                    if (telemetryData3.zaa != c831030Wir.LIZIZ || (list != null && list.size() >= c831030Wir.LIZLLL)) {
                        this.LLJILLL.removeMessages(17);
                        TelemetryData telemetryData4 = this.LLILLL;
                        if (telemetryData4 != null) {
                            if (telemetryData4.zaa > 0 || LIZJ()) {
                                if (this.LLILZ == null) {
                                    final Context context3 = this.LLILZIL;
                                    this.LLILZ = new AbstractC831380WjQ<C832670WlV>(context3) { // from class: X.0WlE
                                        public static final C832010WkR<C832670WlV> LIZ = new C832010WkR<>("ClientTelemetry.API", new AbstractC831970WkN<C832620WlQ, C832670WlV>() { // from class: X.0WlP
                                            @Override // X.AbstractC831970WkN
                                            public final /* synthetic */ InterfaceC831160Wj4 buildClient(Context context22, Looper looper, C831470WjZ c831470WjZ, C832670WlV c832670WlV, InterfaceC832280Wks interfaceC832280Wks, InterfaceC832890Wlr interfaceC832890Wlr) {
                                                return new AbstractC832400Wl4<C832790Wlh>(context22, looper, c831470WjZ, c832670WlV, interfaceC832280Wks, interfaceC832890Wlr) { // from class: X.0WlQ
                                                    public final C832670WlV LL;

                                                    @Override // X.AbstractC832390Wl3, X.InterfaceC831160Wj4
                                                    public final int getMinApkVersion() {
                                                        return 203400000;
                                                    }

                                                    @Override // X.AbstractC832390Wl3
                                                    public final String getServiceDescriptor() {
                                                        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
                                                    }

                                                    @Override // X.AbstractC832390Wl3
                                                    public final String getStartServiceAction() {
                                                        return "com.google.android.gms.common.telemetry.service.START";
                                                    }

                                                    @Override // X.AbstractC832390Wl3
                                                    public final boolean getUseDynamicLookup() {
                                                        return true;
                                                    }

                                                    @Override // X.AbstractC832390Wl3
                                                    public final Bundle getGetServiceRequestExtraArgs() {
                                                        C832670WlV c832670WlV2 = this.LL;
                                                        c832670WlV2.getClass();
                                                        Bundle bundle = new Bundle();
                                                        String str2 = c832670WlV2.LL;
                                                        if (str2 != null) {
                                                            C786410Ut5.LJJJI("api", str2, bundle);
                                                        }
                                                        return bundle;
                                                    }

                                                    @Override // X.AbstractC832390Wl3
                                                    public final Feature[] getApiFeatures() {
                                                        return C832800Wli.LIZIZ;
                                                    }

                                                    @Override // X.AbstractC832390Wl3
                                                    public final /* synthetic */ IInterface createServiceInterface(final IBinder iBinder) {
                                                        if (iBinder == null) {
                                                            return null;
                                                        }
                                                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
                                                        if (iInterfaceQueryLocalInterface instanceof C832790Wlh) {
                                                            return iInterfaceQueryLocalInterface;
                                                        }
                                                        return new C832590WlN(iBinder) { // from class: X.0Wlh
                                                        };
                                                    }

                                                    {
                                                        this.LL = c832670WlV;
                                                    }
                                                };
                                            }
                                        }, new C832160Wkg());

                                        {
                                            C832670WlV c832670WlV = C832670WlV.LLILLJJLI;
                                            C832010WkR<C832670WlV> c832010WkR = LIZ;
                                            C831490Wjb c831490Wjb = C831490Wjb.LIZJ;
                                        }

                                        public final AbstractC835450Wpz<Void> LIZLLL(final TelemetryData telemetryData22) {
                                            C832510WlF c832510WlF = new C832510WlF();
                                            c832510WlF.LIZJ = new Feature[]{C832800Wli.LIZ};
                                            c832510WlF.LIZIZ = false;
                                            c832510WlF.LIZ = new InterfaceC831290WjH() { // from class: X.0WlD
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // X.InterfaceC831290WjH
                                                public final void LIZ(InterfaceC831160Wj4 interfaceC831160Wj4, Object obj2) {
                                                    TelemetryData telemetryData32 = telemetryData22;
                                                    C835520Wq6 c835520Wq6 = (C835520Wq6) obj2;
                                                    C832590WlN c832590WlN = (C832590WlN) ((AbstractC832390Wl3) interfaceC831160Wj4).getService();
                                                    c832590WlN.getClass();
                                                    Parcel parcelObtain = Parcel.obtain();
                                                    parcelObtain.writeInterfaceToken(c832590WlN.LLILLJJLI);
                                                    if (telemetryData32 == null) {
                                                        parcelObtain.writeInt(0);
                                                    } else {
                                                        parcelObtain.writeInt(1);
                                                        telemetryData32.writeToParcel(parcelObtain, 0);
                                                    }
                                                    try {
                                                        c832590WlN.LL.transact(1, parcelObtain, null, 1);
                                                        parcelObtain.recycle();
                                                        c835520Wq6.LIZIZ(null);
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        parcelObtain.recycle();
                                                        throw th;
                                                    }
                                                }
                                            };
                                            return doBestEffortWrite(c832510WlF.LIZ());
                                        }
                                    };
                                }
                                LIZLLL(telemetryData4);
                            }
                            this.LLILLL = null;
                        }
                    } else {
                        TelemetryData telemetryData5 = this.LLILLL;
                        MethodInvocation methodInvocation = c831030Wir.LIZ;
                        if (telemetryData5.zab == null) {
                            telemetryData5.zab = new ArrayList();
                        }
                        telemetryData5.zab.add(methodInvocation);
                    }
                }
                if (this.LLILLL == null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(c831030Wir.LIZ);
                    this.LLILLL = new TelemetryData(c831030Wir.LIZIZ, arrayList2);
                    zaq zaqVar2 = this.LLJILLL;
                    C786410Ut5.LJLJLJ(zaqVar2, zaqVar2.obtainMessage(17), c831030Wir.LIZJ);
                    return true;
                }
                return true;
            case 19:
                this.LLILLJJLI = false;
                return true;
            default:
                return false;
        }
    }

    public static Status LIZLLL(C831420WjU<?> c831420WjU, ConnectionResult connectionResult) {
        String str = c831420WjU.LIZIZ.LIZJ;
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(1, 17, sb.toString(), connectionResult.zzc, connectionResult);
    }

    public final void LJIIIIZZ(ConnectionResult connectionResult, int i) {
        if (!this.LLILZLL.zah(this.LLILZIL, connectionResult, i)) {
            zaq zaqVar = this.LLJILLL;
            C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(5, i, 0, connectionResult));
        }
    }

    public C831040Wis(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.LLJJ = true;
        this.LLILZIL = context;
        zaq zaqVar = new zaq(looper, this);
        this.LLJILLL = zaqVar;
        this.LLILZLL = googleApiAvailability;
        this.LLIZ = new C831220WjA(googleApiAvailability);
        PackageManager packageManager = context.getPackageManager();
        if (C829120Wfm.LIZLLL == null) {
            C829120Wfm.LIZLLL = Boolean.valueOf(C811660Vsi.LIZ() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (C829120Wfm.LIZLLL.booleanValue()) {
            this.LLJJ = false;
        }
        C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(6));
    }

    public final <T> void LJFF(C835520Wq6<T> c835520Wq6, final int i, AbstractC831380WjQ abstractC831380WjQ) {
        final long jCurrentTimeMillis;
        final long jElapsedRealtime;
        if (i != 0) {
            final C831420WjU apiKey = abstractC831380WjQ.getApiKey();
            if (LIZJ()) {
                RootTelemetryConfiguration rootTelemetryConfiguration = C831020Wiq.LIZ().LIZ;
                boolean z = true;
                if (rootTelemetryConfiguration != null) {
                    if (rootTelemetryConfiguration.zzb) {
                        z = rootTelemetryConfiguration.zzc;
                        C831140Wj2 c831140Wj2 = (C831140Wj2) ((ConcurrentHashMap) this.LLJI).get(apiKey);
                        if (c831140Wj2 != null) {
                            Object obj = c831140Wj2.LLILLJJLI;
                            if (obj instanceof AbstractC832390Wl3) {
                                AbstractC832390Wl3 abstractC832390Wl3 = (AbstractC832390Wl3) obj;
                                if (abstractC832390Wl3.hasConnectionInfo() && !abstractC832390Wl3.isConnecting()) {
                                    ConnectionTelemetryConfiguration connectionTelemetryConfigurationLIZIZ = C831010Wip.LIZIZ(c831140Wj2, abstractC832390Wl3, i);
                                    if (connectionTelemetryConfigurationLIZIZ != null) {
                                        c831140Wj2.LLJILJIL++;
                                        z = connectionTelemetryConfigurationLIZIZ.zzc;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (z) {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jCurrentTimeMillis = 0;
                    jElapsedRealtime = 0;
                }
                InterfaceC834580Woa<T> interfaceC834580Woa = new InterfaceC834580Woa<T>(this, i, apiKey, jCurrentTimeMillis, jElapsedRealtime) { // from class: X.0Wip
                    public final C831040Wis LL;
                    public final int LLILLJJLI;
                    public final C831420WjU<?> LLILLL;
                    public final long LLILZ;
                    public final long LLILZIL;

                    {
                        this.LL = this;
                        this.LLILLJJLI = i;
                        this.LLILLL = apiKey;
                        this.LLILZ = jCurrentTimeMillis;
                        this.LLILZIL = jElapsedRealtime;
                    }

                    @Override // X.InterfaceC834580Woa
                    public final void LIZ(AbstractC835450Wpz<T> abstractC835450Wpz) {
                        boolean z2;
                        int i2;
                        int i3;
                        int i4;
                        int i5;
                        int i6;
                        long jCurrentTimeMillis2;
                        long j;
                        int iElapsedRealtime;
                        if (!this.LL.LIZJ()) {
                            return;
                        }
                        RootTelemetryConfiguration rootTelemetryConfiguration2 = C831020Wiq.LIZ().LIZ;
                        if (rootTelemetryConfiguration2 != null && !rootTelemetryConfiguration2.zzb) {
                            return;
                        }
                        C831140Wj2 c831140Wj22 = (C831140Wj2) ((ConcurrentHashMap) this.LL.LLJI).get(this.LLILLL);
                        if (c831140Wj22 != null) {
                            Object obj2 = c831140Wj22.LLILLJJLI;
                            if (obj2 instanceof AbstractC832390Wl3) {
                                AbstractC832390Wl3 abstractC832390Wl32 = (AbstractC832390Wl3) obj2;
                                boolean z3 = true;
                                if (this.LLILZ > 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                int i7 = abstractC832390Wl32.zzy;
                                if (rootTelemetryConfiguration2 != null) {
                                    z2 &= rootTelemetryConfiguration2.zzc;
                                    i4 = rootTelemetryConfiguration2.zzd;
                                    i3 = rootTelemetryConfiguration2.zze;
                                    i2 = rootTelemetryConfiguration2.zza;
                                    if (abstractC832390Wl32.hasConnectionInfo() && !abstractC832390Wl32.isConnecting()) {
                                        ConnectionTelemetryConfiguration connectionTelemetryConfigurationLIZIZ2 = LIZIZ(c831140Wj22, abstractC832390Wl32, this.LLILLJJLI);
                                        if (connectionTelemetryConfigurationLIZIZ2 == null) {
                                            return;
                                        }
                                        if (!connectionTelemetryConfigurationLIZIZ2.zzc || this.LLILZ <= 0) {
                                            z3 = false;
                                        }
                                        i3 = connectionTelemetryConfigurationLIZIZ2.zze;
                                        z2 = z3;
                                    }
                                } else {
                                    i2 = 0;
                                    i3 = 100;
                                    i4 = 5000;
                                }
                                C831040Wis c831040Wis = this.LL;
                                if (abstractC835450Wpz.LJIILJJIL()) {
                                    i5 = 0;
                                    i6 = 0;
                                } else {
                                    if (abstractC835450Wpz.LJIIL()) {
                                        i5 = 100;
                                    } else {
                                        Exception excLJIIIZ = abstractC835450Wpz.LJIIIZ();
                                        if (excLJIIIZ instanceof C0W4V) {
                                            Status status = ((C0W4V) excLJIIIZ).getStatus();
                                            i5 = status.zzd;
                                            ConnectionResult connectionResult = status.zzg;
                                            if (connectionResult == null) {
                                                i6 = -1;
                                            } else {
                                                i6 = connectionResult.zzb;
                                            }
                                        } else {
                                            i5 = 101;
                                        }
                                    }
                                    i6 = -1;
                                }
                                if (z2) {
                                    j = this.LLILZ;
                                    jCurrentTimeMillis2 = System.currentTimeMillis();
                                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.LLILZIL);
                                } else {
                                    jCurrentTimeMillis2 = 0;
                                    j = 0;
                                    iElapsedRealtime = -1;
                                }
                                zaq zaqVar = c831040Wis.LLJILLL;
                                C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(18, new C831030Wir(new MethodInvocation(this.LLILLJJLI, i5, i6, j, jCurrentTimeMillis2, null, null, i7, iElapsedRealtime), i2, i4, i3)));
                            }
                        }
                    }

                    public static ConnectionTelemetryConfiguration LIZIZ(C831140Wj2<?> c831140Wj22, AbstractC832390Wl3<?> abstractC832390Wl32, int i2) {
                        ConnectionTelemetryConfiguration telemetryConfiguration = abstractC832390Wl32.getTelemetryConfiguration();
                        if (telemetryConfiguration != null && telemetryConfiguration.zzb) {
                            int[] iArr = telemetryConfiguration.zzd;
                            if (iArr == null) {
                                int[] iArr2 = telemetryConfiguration.zzf;
                                if (iArr2 != null) {
                                    for (int i3 : iArr2) {
                                        if (i3 == i2) {
                                            return null;
                                        }
                                    }
                                }
                            } else {
                                for (int i4 : iArr) {
                                    if (i4 != i2) {
                                    }
                                }
                                return null;
                            }
                            if (c831140Wj22.LLJILJIL < telemetryConfiguration.zze) {
                                return telemetryConfiguration;
                            }
                            return null;
                        }
                        return null;
                    }
                };
                C835510Wq5<T> c835510Wq5 = c835520Wq6.LIZ;
                final zaq zaqVar = this.LLJILLL;
                zaqVar.getClass();
                c835510Wq5.LIZJ(new Executor() { // from class: X.0Wiz
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        C786410Ut5.LJJZZIII(zaqVar, runnable);
                    }
                }, interfaceC834580Woa);
            }
        }
    }

    public final C835510Wq5 LJII(AbstractC831380WjQ abstractC831380WjQ, AbstractC831310WjJ abstractC831310WjJ, AbstractC831510Wjd abstractC831510Wjd, Runnable runnable) {
        final C835520Wq6 c835520Wq6 = new C835520Wq6();
        LJFF(c835520Wq6, abstractC831310WjJ.LIZLLL, abstractC831380WjQ);
        final C831270WjF c831270WjF = new C831270WjF(abstractC831310WjJ, abstractC831510Wjd, runnable);
        AbstractC831200Wj8<Void> abstractC831200Wj8 = new AbstractC831200Wj8<Void>(c831270WjF, c835520Wq6) { // from class: X.0Wj6
            public final C831270WjF LIZJ;

            @Override // X.AbstractC831170Wj5
            public final /* bridge */ /* synthetic */ void LIZLLL(C831150Wj3 c831150Wj3, boolean z) {
            }

            @Override // X.AbstractC831260WjE
            public final boolean LJFF(C831140Wj2<?> c831140Wj2) {
                return this.LIZJ.LIZ.LIZJ;
            }

            @Override // X.AbstractC831260WjE
            public final Feature[] LJI(C831140Wj2<?> c831140Wj2) {
                return this.LIZJ.LIZ.LIZIZ;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.AbstractC831200Wj8
            public final void LJII(C831140Wj2<?> c831140Wj2) {
                AbstractC831310WjJ<Object, ?> abstractC831310WjJ2 = this.LIZJ.LIZ;
                ((C831300WjI) abstractC831310WjJ2).LJ.LIZ.LIZ(c831140Wj2.LLILLJJLI, this.LIZIZ);
                C831450WjX<?> c831450WjX = this.LIZJ.LIZ.LIZ.LIZIZ;
                if (c831450WjX != null) {
                    ((HashMap) c831140Wj2.LLILZLL).put(c831450WjX, this.LIZJ);
                }
            }

            {
                super(3, c835520Wq6);
                this.LIZJ = c831270WjF;
            }
        };
        zaq zaqVar = this.LLJILLL;
        C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(8, new C831100Wiy(abstractC831200Wj8, this.LLJ.get(), abstractC831380WjQ)));
        return c835520Wq6.LIZ;
    }
}
