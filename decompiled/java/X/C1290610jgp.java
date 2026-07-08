package X;

import Y.ACallableS425S0100000_20;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.JsonReader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: X.0jgp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1290610jgp {
    public static final Map<String, C1290520jgg<C1291600jiQ>> LIZ = new ConcurrentHashMap();

    static {
        new ComponentCallbacks2() { // from class: X.0jgv
            @Override // android.content.ComponentCallbacks
            public final void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public final void onLowMemory() {
                boolean z = C1291380ji4.LIZ;
            }

            @Override // android.content.ComponentCallbacks2
            public final void onTrimMemory(int i) {
                if (i != 5 && i != 10 && i != 40) {
                    return;
                }
                boolean z = C1291380ji4.LIZ;
            }
        };
    }

    public static boolean LIZIZ(C1291600jiQ c1291600jiQ) {
        if (c1291600jiQ == null) {
            return false;
        }
        Iterator<Map.Entry<String, C1290800jh8>> it2 = c1291600jiQ.LIZLLL.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().LJI == null) {
                return false;
            }
        }
        return true;
    }

    public static C1290520jgg<C1291600jiQ> LIZ(final String str, Callable<C1290500jge<C1291600jiQ>> callable) {
        if (str != null) {
            C1291600jiQ c1291600jiQLIZ = C1291320jhy.LIZIZ.LIZ(str);
            if (c1291600jiQLIZ != null) {
                return new C1290520jgg<>(new ACallableS425S0100000_20(c1291600jiQLIZ, 5));
            }
            if (str != null) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) LIZ;
                if (concurrentHashMap.containsKey(str)) {
                    return (C1290520jgg) concurrentHashMap.get(str);
                }
            }
        }
        C1290520jgg<C1291600jiQ> c1290520jgg = new C1290520jgg<>(callable);
        if (str != null) {
            c1290520jgg.LIZIZ(new InterfaceC1290510jgf<C1291600jiQ>() { // from class: X.0jgk
                @Override // X.InterfaceC1290510jgf
                public final void onResult(C1291600jiQ c1291600jiQ) {
                    ((ConcurrentHashMap) C1290610jgp.LIZ).remove(str);
                }
            });
            c1290520jgg.LIZ(new InterfaceC1290510jgf<Throwable>() { // from class: X.0jgl
                @Override // X.InterfaceC1290510jgf
                public final void onResult(Throwable th) {
                    ((ConcurrentHashMap) C1290610jgp.LIZ).remove(str);
                }
            });
            ((ConcurrentHashMap) LIZ).put(str, c1290520jgg);
        }
        return c1290520jgg;
    }

    public static C1290500jge<C1291600jiQ> LIZJ(Context context, String str) {
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("asset_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (str.endsWith(".zip")) {
                ZipInputStream zipInputStream = new ZipInputStream(context.getAssets().open(str));
                try {
                    C1290500jge<C1291600jiQ> c1290500jgeLJII = LJII(zipInputStream, strLIZIZ);
                    C1293420jlM.LIZJ(zipInputStream);
                    return c1290500jgeLJII;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1293420jlM.LIZJ(zipInputStream);
                    throw th;
                }
            }
            return LJFF(context.getAssets().open(str), strLIZIZ, true);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return new C1290500jge<>((Throwable) e);
        }
    }

    public static C1290500jge<C1291600jiQ> LJII(ZipInputStream zipInputStream, String str) {
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            C1291600jiQ c1291600jiQ = null;
            while (nextEntry != null) {
                if (nextEntry.getName().contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    c1291600jiQ = LJFF(zipInputStream, str, false).LIZ;
                } else if (nextEntry.getName().contains(".png")) {
                    map.put(nextEntry.getName().split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (c1291600jiQ == null) {
                return new C1290500jge<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Iterator<C1290800jh8> it2 = c1291600jiQ.LIZLLL.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C1290800jh8 next = it2.next();
                        if (next.LIZLLL.equals(key)) {
                            next.LJI = (Bitmap) entry.getValue();
                            break;
                        }
                    }
                }
            }
            for (Map.Entry<String, C1290800jh8> entry2 : c1291600jiQ.LIZLLL.entrySet()) {
                if (entry2.getValue().LJI == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("There is no image for ");
                    sbLIZ.append(entry2.getValue().LIZLLL);
                    return new C1290500jge<>((Throwable) new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
                }
            }
            C1291320jhy.LIZIZ.LIZIZ(c1291600jiQ, str);
            return new C1290500jge<>(c1291600jiQ);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return new C1290500jge<>((Throwable) e);
        }
    }

    public static void LJ(final String str, final InterfaceC1290690jgx interfaceC1290690jgx, final InterfaceC1290680jgw interfaceC1290680jgw) {
        C1291600jiQ c1291600jiQLIZ = C1291320jhy.LIZIZ.LIZ(null);
        if (LIZIZ(c1291600jiQLIZ)) {
            interfaceC1290680jgw.LIZIZ(c1291600jiQLIZ);
        } else {
            C1290520jgg.LJI.execute(new AbstractRunnableC1290590jgn(interfaceC1290680jgw, interfaceC1290690jgx) { // from class: X.0jgm
                public final /* synthetic */ String LLILZIL = null;

                public final void LIZ() {
                    String str2 = str;
                    final String str3 = this.LLILZIL;
                    WeakReference<InterfaceC1290690jgx> weakReference = this.LL;
                    WeakReference<InterfaceC1290680jgw> weakReference2 = this.LLILLJJLI;
                    if (weakReference.get() == null || weakReference2.get() == null) {
                        return;
                    }
                    InterfaceC1290690jgx interfaceC1290690jgx2 = weakReference.get();
                    final InterfaceC1290680jgw interfaceC1290680jgw2 = weakReference2.get();
                    try {
                        C1291600jiQ c1291600jiQ = C1290610jgp.LJFF(new C0VSP(new C0VSJ(str2)), str3, true).LIZ;
                        if (c1291600jiQ == null) {
                            interfaceC1290680jgw2.LIZ("fromJsonFileAsyncInternal Unable to parse composition and composition is null");
                        } else {
                            C1290610jgp.LJIIIIZZ(c1291600jiQ, interfaceC1290690jgx2, new InterfaceC1290680jgw() { // from class: X.0jgr
                                @Override // X.InterfaceC1290680jgw
                                public final void LIZ(String str4) {
                                    interfaceC1290680jgw2.LIZ(str4);
                                }

                                @Override // X.InterfaceC1290680jgw
                                public final void LIZIZ(C1291600jiQ c1291600jiQ2) {
                                    C1291320jhy.LIZIZ.LIZIZ(c1291600jiQ2, str3);
                                    interfaceC1290680jgw2.LIZIZ(c1291600jiQ2);
                                }
                            });
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fromJsonFileAsyncInternal Unable to parse composition. Error msg is ");
                        sbLIZ.append(e.toString());
                        interfaceC1290680jgw2.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LottieCompositionFactory@fe8.fromJsonFileAsync$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LottieCompositionFactory@fe8.fromJsonFileAsync$1");
                }
            });
        }
    }

    public static C1290500jge<C1291600jiQ> LJFF(InputStream inputStream, String str, boolean z) {
        C1290500jge<C1291600jiQ> c1290500jge;
        try {
            try {
                C1291600jiQ c1291600jiQLIZ = C1292910jkX.LIZ(new JsonReader(new InputStreamReader(inputStream)));
                C1291320jhy.LIZIZ.LIZIZ(c1291600jiQLIZ, str);
                c1290500jge = new C1290500jge<>(c1291600jiQLIZ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c1290500jge = new C1290500jge<>(e);
            }
            if (z) {
                C1293420jlM.LIZJ(inputStream);
            }
            return c1290500jge;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (z) {
                C1293420jlM.LIZJ(inputStream);
            }
            throw th;
        }
    }

    public static void LJI(final String str, final InterfaceC1290690jgx interfaceC1290690jgx, final InterfaceC1290680jgw interfaceC1290680jgw) {
        C1291600jiQ c1291600jiQLIZ = C1291320jhy.LIZIZ.LIZ(null);
        if (LIZIZ(c1291600jiQLIZ)) {
            interfaceC1290680jgw.LIZIZ(c1291600jiQLIZ);
        } else {
            C1290520jgg.LJI.execute(new AbstractRunnableC1290590jgn(interfaceC1290680jgw, interfaceC1290690jgx) { // from class: X.0jgq
                public final /* synthetic */ String LLILZIL = null;

                public final void LIZ() {
                    String str2 = str;
                    final String str3 = this.LLILZIL;
                    WeakReference<InterfaceC1290690jgx> weakReference = this.LL;
                    WeakReference<InterfaceC1290680jgw> weakReference2 = this.LLILLJJLI;
                    if (weakReference.get() == null || weakReference2.get() == null) {
                        return;
                    }
                    final InterfaceC1290680jgw interfaceC1290680jgw2 = weakReference2.get();
                    InterfaceC1290690jgx interfaceC1290690jgx2 = weakReference.get();
                    JsonReader jsonReader = new JsonReader(new StringReader(str2));
                    try {
                        C1290610jgp.LJIIIIZZ(C1292910jkX.LIZ(jsonReader), interfaceC1290690jgx2, new InterfaceC1290680jgw() { // from class: X.0jgu
                            @Override // X.InterfaceC1290680jgw
                            public final void LIZ(String str4) {
                                interfaceC1290680jgw2.LIZ(str4);
                            }

                            @Override // X.InterfaceC1290680jgw
                            public final void LIZIZ(C1291600jiQ c1291600jiQ) {
                                C1291320jhy.LIZIZ.LIZIZ(c1291600jiQ, str3);
                                interfaceC1290680jgw2.LIZIZ(c1291600jiQ);
                            }
                        });
                    } finally {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                    C1293420jlM.LIZJ(jsonReader);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LottieCompositionFactory@fe8.fromJsonStringAsync$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LottieCompositionFactory@fe8.fromJsonStringAsync$1");
                }
            });
        }
    }

    public static void LJIIIIZZ(C1291600jiQ c1291600jiQ, InterfaceC1290690jgx interfaceC1290690jgx, InterfaceC1290680jgw interfaceC1290680jgw) {
        Map<String, C1290800jh8> map = c1291600jiQ.LIZLLL;
        if (map != null && map.size() != 0) {
            if (c1291600jiQ.LIZLLL != null) {
                AtomicInteger atomicInteger = new AtomicInteger(c1291600jiQ.LIZLLL.size());
                for (Map.Entry<String, C1290800jh8> entry : c1291600jiQ.LIZLLL.entrySet()) {
                    if (interfaceC1290690jgx != null) {
                        C1290800jh8 value = entry.getValue();
                        if ("%s".equals(value.LIZLLL)) {
                            c1291600jiQ.LJIILIIL = true;
                            if (atomicInteger.decrementAndGet() == 0) {
                                c1291600jiQ.LJIIL = true;
                                interfaceC1290680jgw.LIZIZ(c1291600jiQ);
                            }
                        } else {
                            interfaceC1290690jgx.LJIJI(value, new C1290650jgt(value, atomicInteger, c1291600jiQ, interfaceC1290680jgw));
                        }
                    }
                }
                return;
            }
            return;
        }
        c1291600jiQ.LJIIL = true;
        interfaceC1290680jgw.LIZIZ(c1291600jiQ);
    }

    public static void LIZLLL(final Context context, final InterfaceC1290680jgw interfaceC1290680jgw, final InterfaceC1290690jgx interfaceC1290690jgx, final String str, final String str2) {
        C1291600jiQ c1291600jiQLIZ = C1291320jhy.LIZIZ.LIZ(str2);
        if (LIZIZ(c1291600jiQLIZ)) {
            interfaceC1290680jgw.LIZIZ(c1291600jiQLIZ);
        } else {
            C1290520jgg.LJI.execute(new AbstractRunnableC1290590jgn(context, interfaceC1290680jgw, interfaceC1290690jgx) { // from class: X.0jgo
                public final void LIZ() {
                    WeakReference<Context> weakReference = this.LLILLL;
                    String str3 = str;
                    final String str4 = str2;
                    WeakReference<InterfaceC1290690jgx> weakReference2 = this.LL;
                    WeakReference<InterfaceC1290680jgw> weakReference3 = this.LLILLJJLI;
                    if (weakReference.get() == null || weakReference2.get() == null || weakReference3.get() == null) {
                        return;
                    }
                    Context context2 = weakReference.get();
                    final InterfaceC1290680jgw interfaceC1290680jgw2 = weakReference3.get();
                    InterfaceC1290690jgx interfaceC1290690jgx2 = weakReference2.get();
                    try {
                        C1291600jiQ c1291600jiQ = C1290610jgp.LIZJ(context2, str3).LIZ;
                        if (c1291600jiQ == null) {
                            interfaceC1290680jgw2.LIZ("fromJsonAssetSyncInternal Unable to parse composition and composition is null");
                        } else {
                            C1290610jgp.LJIIIIZZ(c1291600jiQ, interfaceC1290690jgx2, new InterfaceC1290680jgw() { // from class: X.0jgs
                                @Override // X.InterfaceC1290680jgw
                                public final void LIZ(String str5) {
                                    interfaceC1290680jgw2.LIZ(str5);
                                }

                                @Override // X.InterfaceC1290680jgw
                                public final void LIZIZ(C1291600jiQ c1291600jiQ2) {
                                    C1291320jhy.LIZIZ.LIZIZ(c1291600jiQ2, str4);
                                    interfaceC1290680jgw2.LIZIZ(c1291600jiQ2);
                                }
                            });
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("load composition failed from asset. ");
                        sbLIZ.append(e.getMessage());
                        interfaceC1290680jgw2.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LottieCompositionFactory@fe8.fromJsonAssetAsync$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LottieCompositionFactory@fe8.fromJsonAssetAsync$1");
                }
            });
        }
    }
}
