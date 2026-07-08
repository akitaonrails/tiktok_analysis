package Y;

import X.C08RN;
import X.C098200Yq;
import X.C0VSJ;
import X.C0VSP;
import X.C0WIN;
import X.C0WIS;
import X.C0WIX;
import X.C0WIY;
import X.C0WSW;
import X.C0WSX;
import X.C0WZC;
import X.C1288950je9;
import X.C189200o6;
import X.C1C7U;
import X.C2097608Jq;
import X.C2179971ATj;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C820880WIc;
import X.C823470WSb;
import X.C825150WYn;
import X.C840750WyX;
import X.C846680XJi;
import X.C846690XJj;
import X.InterfaceC820920WIg;
import X.InterfaceC823460WSa;
import X.InterfaceC846700XJk;
import X.InterfaceC846710XJl;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.os.ResultReceiver;
import androidx.media.MediaBrowserServiceCompat;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.runtime.host.model.NetworkExceptionMonitor;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class ARunnableS5S1400000_13 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        final C0WIX c0wix = ((C820880WIc) this.l4).LIZ.LLILZ.get(((C0WIN) ((InterfaceC820920WIg) this.l1)).LIZ());
        if (c0wix == null) {
            return;
        }
        final MediaBrowserServiceCompat mediaBrowserServiceCompat = ((C820880WIc) this.l4).LIZ;
        final String str = this.s0;
        IBinder iBinder = (IBinder) this.l2;
        final Bundle bundle = (Bundle) this.l3;
        mediaBrowserServiceCompat.getClass();
        List<C0WIY<IBinder, Bundle>> arrayList = c0wix.LLILZIL.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (C0WIY<IBinder, Bundle> c0wiy : arrayList) {
            if (iBinder == c0wiy.LIZ) {
                Bundle bundle2 = c0wiy.LIZIZ;
                if (bundle == bundle2) {
                    return;
                }
                if (bundle == null) {
                    if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                        return;
                    }
                } else if (bundle2 == null) {
                    if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                        return;
                    }
                } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                    return;
                }
            }
        }
        arrayList.add(new C0WIY<>(iBinder, bundle));
        c0wix.LLILZIL.put(str, arrayList);
        C0WIS<List<MediaBrowserCompat.MediaItem>> c0wis = new C0WIS<List<MediaBrowserCompat.MediaItem>>(str) { // from class: X.0WIR
            public final /* synthetic */ Bundle LJIIIIZZ = null;

            @Override // X.C0WIS
            public final void LIZJ(List<MediaBrowserCompat.MediaItem> list) {
                List<MediaBrowserCompat.MediaItem> listLIZ = list;
                if (mediaBrowserServiceCompat.LLILZ.get(((C0WIN) c0wix.LLILZ).LIZ()) == c0wix) {
                    if ((this.LJ & 1) != 0) {
                        MediaBrowserServiceCompat mediaBrowserServiceCompat2 = mediaBrowserServiceCompat;
                        Bundle bundle3 = bundle;
                        mediaBrowserServiceCompat2.getClass();
                        listLIZ = MediaBrowserServiceCompat.LIZ(bundle3, listLIZ);
                    }
                    try {
                        ((C0WIN) c0wix.LLILZ).LIZIZ(str, listLIZ, bundle, this.LJIIIIZZ);
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        };
        if (bundle == null) {
            mediaBrowserServiceCompat.LIZJ(c0wis);
        } else {
            c0wis.LJ = 1;
            mediaBrowserServiceCompat.LIZJ(c0wis);
        }
        if (c0wis.LIZIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadChildren must call detach() or sendResult() before returning for package=");
        sbLIZ.append(c0wix.LL);
        sbLIZ.append(" id=");
        sbLIZ.append(str);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [X.0WIS, X.0WIb] */
    public final void LIZ$1() {
        if (((C820880WIc) this.l4).LIZ.LLILZ.get(((C0WIN) ((InterfaceC820920WIg) this.l1)).LIZ()) == null) {
            return;
        }
        MediaBrowserServiceCompat mediaBrowserServiceCompat = ((C820880WIc) this.l4).LIZ;
        final String str = this.s0;
        Bundle bundle = (Bundle) this.l2;
        final ResultReceiver resultReceiver = (ResultReceiver) this.l3;
        mediaBrowserServiceCompat.getClass();
        ?? r1 = new C0WIS<Bundle>(str) { // from class: X.0WIb
            public final void LJ() {
                resultReceiver.LIZIZ(-1, null);
            }

            @Override // X.C0WIS
            public final void LIZJ(Bundle bundle2) {
                resultReceiver.LIZIZ(0, bundle2);
            }
        };
        if (r1.LIZJ || r1.LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendError() called when either sendResult() or sendError() had already been called for: ");
            sbLIZ.append((Object) str);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        r1.LIZLLL = true;
        r1.LJ();
        if (r1.LIZIZ()) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
        sbLIZ2.append(str);
        sbLIZ2.append(" extras=");
        sbLIZ2.append(bundle);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LIZ$2() throws Throwable {
        C0VSJ c0vsj;
        Object obj;
        StringBuilder sb;
        byte[] bArr;
        if ((this.s0.startsWith("http://") || this.s0.startsWith("https://")) && this.s0.length() > 8) {
            C846680XJi c846680XJi = (C846680XJi) this.l4;
            C1288950je9 c1288950je9 = (C1288950je9) this.l1;
            InterfaceC846700XJk interfaceC846700XJk = (InterfaceC846700XJk) this.l2;
            c846680XJi.getClass();
            InterfaceC846710XJl resProvider = LynxEnv.inst().getResProvider();
            LynxLog.DCHECK(resProvider != null);
            if (resProvider != null) {
                resProvider.LIZ(c1288950je9, interfaceC846700XJk);
                return;
            }
            C846690XJj c846690XJj = new C846690XJj();
            c846690XJj.LIZIZ = "don't have ResProvider.Can't Get Resource.";
            interfaceC846700XJk.LIZIZ(c846690XJj);
            return;
        }
        Context applicationContext = null;
        inputStreamOpen = null;
        InputStream inputStreamOpen = null;
        numValueOf = null;
        numValueOf = null;
        Integer numValueOf = null;
        if (this.s0.startsWith("asset:///") && this.s0.length() > 9) {
            C846680XJi c846680XJi2 = (C846680XJi) this.l4;
            String str = this.s0;
            InterfaceC846700XJk interfaceC846700XJk2 = (InterfaceC846700XJk) this.l2;
            c846680XJi2.getClass();
            C846690XJj c846690XJj2 = new C846690XJj();
            try {
                try {
                    inputStreamOpen = LynxEnv.inst().getAppContext().getAssets().open(str.substring(9));
                    sb = new StringBuilder(inputStreamOpen.available());
                    bArr = new byte[1024];
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    c846690XJj2.LIZIZ = e.toString();
                    interfaceC846700XJk2.LIZIZ(c846690XJj2);
                    if (inputStreamOpen == null) {
                        return;
                    }
                }
                try {
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            sb.append(new String(bArr, 0, i));
                        }
                        inputStreamOpen.close();
                        return;
                    }
                    inputStreamOpen.close();
                    return;
                } catch (IOException e2) {
                    return;
                }
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(sb.toString().getBytes());
                c846690XJj2.LIZJ = byteArrayInputStream;
                interfaceC846700XJk2.LIZ(c846690XJj2);
                byteArrayInputStream.close();
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                        throw th;
                    } catch (IOException e3) {
                        throw th;
                    }
                }
                throw th;
            }
        } else {
            if (this.s0.startsWith("res:///") && this.s0.length() > 7) {
                C846680XJi c846680XJi3 = (C846680XJi) this.l4;
                String str2 = this.s0;
                InterfaceC846700XJk interfaceC846700XJk3 = (InterfaceC846700XJk) this.l2;
                c846680XJi3.getClass();
                Context appContext = LynxEnv.inst().getAppContext();
                String strSubstring = str2.substring(7);
                if (strSubstring != null && !strSubstring.isEmpty()) {
                    try {
                        numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(strSubstring));
                    } catch (NumberFormatException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                        String strReplace = strSubstring.toLowerCase().replace("-", "_");
                        Integer num = c846680XJi3.LIZ.get(strReplace);
                        if (num != null) {
                            numValueOf = num;
                        } else {
                            int iIndexOf = strReplace.indexOf(47);
                            if (iIndexOf > 0 && iIndexOf != strReplace.length() - 1) {
                                String strSubstring2 = strReplace.substring(0, iIndexOf);
                                String strSubstring3 = strReplace.substring(iIndexOf + 1);
                                int iLastIndexOf = strSubstring3.lastIndexOf(46);
                                if (iLastIndexOf > 0) {
                                    strSubstring3 = strSubstring3.substring(0, iLastIndexOf);
                                }
                                synchronized (c846680XJi3) {
                                    try {
                                        Integer num2 = c846680XJi3.LIZ.get(strReplace);
                                        if (num2 != null) {
                                            numValueOf = num2;
                                        } else {
                                            int iN3 = C786410Ut5.n3(appContext.getResources(), strSubstring3, strSubstring2, appContext.getPackageName());
                                            if (iN3 != 0) {
                                                c846680XJi3.LIZ.put(strReplace, Integer.valueOf(iN3));
                                                numValueOf = Integer.valueOf(iN3);
                                            }
                                        }
                                    } finally {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                            }
                        }
                    }
                }
                C846690XJj c846690XJj3 = new C846690XJj();
                if (numValueOf == null) {
                    c846690XJj3.LIZIZ = "resource not found!";
                    interfaceC846700XJk3.LIZIZ(c846690XJj3);
                    return;
                }
                InputStream inputStreamOpenRawResource = LynxEnv.inst().getAppContext().getResources().openRawResource(numValueOf.intValue());
                c846690XJj3.LIZJ = inputStreamOpenRawResource;
                interfaceC846700XJk3.LIZ(c846690XJj3);
                try {
                    inputStreamOpenRawResource.close();
                    return;
                } catch (IOException e5) {
                    return;
                }
            }
            if (!this.s0.startsWith("file://") || this.s0.length() <= 7) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("illegal url:");
                sbLIZ.append(this.s0);
                LynxLog.DTHROW(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
                C846690XJj c846690XJj4 = (C846690XJj) this.l3;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("url is illegal:");
                sbLIZ2.append(this.s0);
                c846690XJj4.LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                ((InterfaceC846700XJk) this.l2).LIZIZ((C846690XJj) this.l3);
                return;
            }
            C846680XJi c846680XJi4 = (C846680XJi) this.l4;
            String str3 = this.s0;
            InterfaceC846700XJk interfaceC846700XJk4 = (InterfaceC846700XJk) this.l2;
            c846680XJi4.getClass();
            String strSubstring4 = str3.substring(7);
            if (strSubstring4.startsWith("/")) {
                c0vsj = new C0VSJ(strSubstring4);
            } else {
                Context appContext2 = LynxEnv.inst().getAppContext();
                File file = C786450Ut9.LIZJ;
                if (file == null || !C786450Ut9.LJ) {
                    try {
                        C786450Ut9.LIZJ = appContext2.getFilesDir();
                    } catch (Throwable th2) {
                        try {
                            Class<?> cls = Class.forName("android.app.ActivityThread");
                            Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                            Field declaredField = cls.getDeclaredField("mInitialApplication");
                            declaredField.setAccessible(true);
                            obj = declaredField.get(objInvoke);
                        } catch (Exception e6) {
                            TryCatchGuardChecker.doCheck(e6);
                            PrintStream printStream = System.out;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("Error: ");
                            sbLIZ3.append(e6.getMessage());
                            printStream.println(C2188811AlT.LIZIZ(sbLIZ3));
                        }
                        if (!(obj instanceof Application)) {
                            System.out.println("Error: mInitialApplication is not an instance of Application");
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(th2.getMessage());
                            sbLIZ4.append(":");
                            sbLIZ4.append(C08RN.LIZJ());
                            sbLIZ4.append(" applicationContext is null");
                            throw new Throwable(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                        applicationContext = ((Application) obj).getApplicationContext();
                        PrintStream printStream2 = System.out;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("Application context obtained through ActivityThread: ");
                        sbLIZ5.append(applicationContext);
                        printStream2.println(C2188811AlT.LIZIZ(sbLIZ5));
                        if (applicationContext != null) {
                            C786450Ut9.LIZJ = applicationContext.getFilesDir();
                            C08RN.LIZ(applicationContext);
                        }
                        StringBuilder sbLIZ42 = C2188811AlT.LIZ();
                        sbLIZ42.append(th2.getMessage());
                        sbLIZ42.append(":");
                        sbLIZ42.append(C08RN.LIZJ());
                        sbLIZ42.append(" applicationContext is null");
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ42));
                    }
                    file = C786450Ut9.LIZJ;
                }
                c0vsj = new C0VSJ(file, strSubstring4);
            }
            C846690XJj c846690XJj5 = new C846690XJj();
            try {
                C0VSP c0vsp = new C0VSP(c0vsj);
                StringBuilder sb2 = new StringBuilder(c0vsp.available());
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i2 = c0vsp.read(bArr2);
                    if (i2 == -1) {
                        c846690XJj5.LIZJ = new ByteArrayInputStream(sb2.toString().getBytes());
                        interfaceC846700XJk4.LIZ(c846690XJj5);
                        c0vsp.close();
                        return;
                    }
                    sb2.append(new String(bArr2, 0, i2));
                }
            } catch (FileNotFoundException e7) {
                TryCatchGuardChecker.doCheck(e7);
                c846690XJj5.LIZIZ = "file not found!";
                interfaceC846700XJk4.LIZIZ(c846690XJj5);
            } catch (IOException e8) {
                TryCatchGuardChecker.doCheck(e8);
                c846690XJj5.LIZIZ = "IO failed";
                interfaceC846700XJk4.LIZIZ(c846690XJj5);
            }
        }
    }

    public static final void run$0(ARunnableS5S1400000_13 aRunnableS5S1400000_13) {
        try {
            aRunnableS5S1400000_13.LIZ$0();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$1(ARunnableS5S1400000_13 aRunnableS5S1400000_13) {
        try {
            aRunnableS5S1400000_13.LIZ$1();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$2(ARunnableS5S1400000_13 aRunnableS5S1400000_13) {
        boolean zLIZ;
        C1C7U.LIZ("ResManager@2baa.requestResource$1");
        try {
            aRunnableS5S1400000_13.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ResManager@2baa.requestResource$1");
    }

    public static final void run$3(ARunnableS5S1400000_13 aRunnableS5S1400000_13) {
        C0WZC c0wzc = (C0WZC) aRunnableS5S1400000_13.l1;
        String str = aRunnableS5S1400000_13.s0;
        JSONObject jSONObject = (JSONObject) aRunnableS5S1400000_13.l2;
        JSONObject jSONObject2 = (JSONObject) aRunnableS5S1400000_13.l3;
        JSONObject jSONObject3 = (JSONObject) aRunnableS5S1400000_13.l4;
        C1C7U.LIZ("EventReports@9ed8.report$1L");
        try {
            if (C825150WYn.LIZ) {
                Objects.toString(jSONObject);
                Objects.toString(jSONObject2);
                Objects.toString(jSONObject3);
            }
            c0wzc.LIZ(str, jSONObject, jSONObject2, jSONObject3);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        C1C7U.LIZIZ("EventReports@9ed8.report$1L");
    }

    public static final void run$4(ARunnableS5S1400000_13 aRunnableS5S1400000_13) {
        String str;
        Set<String> set = (Set) aRunnableS5S1400000_13.l1;
        C840750WyX c840750WyX = (C840750WyX) aRunnableS5S1400000_13.l2;
        String str2 = aRunnableS5S1400000_13.s0;
        InterfaceC823460WSa interfaceC823460WSa = (InterfaceC823460WSa) aRunnableS5S1400000_13.l3;
        Throwable th = (Throwable) aRunnableS5S1400000_13.l4;
        C1C7U.LIZ("LegacyStackEventHandler@57ec.handleEvent$1L");
        for (String str3 : set) {
            Uri uri = UriProtector.parse(str3);
            String str4 = (String) ListProtector.get(a0.LJJLIIIJILLIZJL(str3, new String[]{"?"}, 0, 6), 0);
            String scheme = uri.getScheme();
            String str5 = "null";
            if (scheme == null) {
                scheme = "null";
            }
            String host = uri.getHost();
            if (host == null) {
                host = "null";
            }
            String path = uri.getPath();
            if (path != null) {
                str5 = path;
            }
            Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("scheme", scheme), new Pair("domain", host), new Pair("path", str5), new Pair("url", str4), new Pair("apiId", String.valueOf(c840750WyX.LIZ)), new Pair("threadName", str2), new Pair("sdkVersion", "6.22.0.1-bugfix"), new Pair("currentPage", interfaceC823460WSa.LIZ().LJIIL), new Pair("EventType", "NetworkStack"));
            String str6 = NetworkComponent.INSTANCE.settingsVersionOrNull();
            if (str6 != null && !a0.LJJJIL(str6)) {
                mapLJIIJ.put("settingsVersion", str6);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(th.getClass().getName());
            sb.append(": ");
            sb.append(str4);
            sb.append('\n');
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("at ");
                sb.append(stackTraceElement.toString());
                sb.append('\n');
            }
            String string = sb.toString();
            NetworkExceptionMonitor networkExceptionMonitorExceptionMonitor = NetworkComponent.INSTANCE.exceptionMonitor();
            if (networkExceptionMonitorExceptionMonitor != null) {
                str = str4;
                networkExceptionMonitorExceptionMonitor.monitorThrowable(string, str4, "helios_log_type", "EnsureNotReachHere", str2, true, mapLJIIJ, mapLJIIJ);
            } else {
                str = str4;
            }
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("Helios:Network-Stack", new C823470WSb(c840750WyX, str2, str, mapLJIIJ), 4, th);
        }
        C1C7U.LIZIZ("LegacyStackEventHandler@57ec.handleEvent$1L");
    }

    public ARunnableS5S1400000_13(C0WZC c0wzc, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, int i) {
        this.$t = i;
        this.l1 = c0wzc;
        this.s0 = "pumbaa_standard_event";
        this.l2 = jSONObject;
        this.l3 = jSONObject2;
        this.l4 = jSONObject3;
    }

    public ARunnableS5S1400000_13(Object obj, Object obj2, String str, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l4 = obj;
        this.l1 = obj2;
        this.s0 = str;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
