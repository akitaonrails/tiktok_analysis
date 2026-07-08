package X;

import android.content.Context;
import android.os.Build;
import android.util.Base64OutputStream;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W4C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W4C implements C0W4J, InterfaceC812410Vtv {
    public static final ThreadFactoryC589790NBh LJFF = new ThreadFactory() { // from class: X.0NBh
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new BPEAThread(runnable, "heartbeat-information-executor");
        }
    };
    public final InterfaceC812380Vts<C0W4G> LIZ;
    public final Context LIZIZ;
    public final InterfaceC812380Vts<InterfaceC812430Vtx> LIZJ;
    public final Set<C0WBO> LIZLLL;
    public final Executor LJ;

    public C0W4C() {
        throw null;
    }

    @Override // X.InterfaceC812410Vtv
    public final synchronized EnumC812320Vtm LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0W4G c0w4g = this.LIZ.get();
        if (!c0w4g.LJIIIIZZ(jCurrentTimeMillis)) {
            return EnumC812320Vtm.NONE;
        }
        c0w4g.LJI();
        return EnumC812320Vtm.GLOBAL;
    }

    @Override // X.C0W4J
    public final C835510Wq5 LIZIZ() {
        return (Build.VERSION.SDK_INT < 24 || !(C0W4B.LIZ(this.LIZIZ) ^ true)) ? C835460Wq0.LIZJ(this.LJ, new Callable() { // from class: X.0W4F
            /* JADX WARN: Finally extract failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                C0W4C c0w4c = this.LL;
                c0w4c.getClass();
                C1C7U.LIZ("DefaultHeartBeatController@727e.getHeartBeatsHeader$1L");
                synchronized (c0w4c) {
                    try {
                        C0W4G c0w4g = c0w4c.LIZ.get();
                        List<C0W4I> listLIZJ = c0w4g.LIZJ();
                        c0w4g.LIZIZ();
                        JSONArray jSONArray = new JSONArray();
                        int i = 0;
                        while (true) {
                            ArrayList arrayList = (ArrayList) listLIZJ;
                            if (i < arrayList.size()) {
                                C0W4I c0w4i = (C0W4I) arrayList.get(i);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("agent", c0w4i.LIZIZ());
                                jSONObject.put("dates", new JSONArray((Collection) c0w4i.LIZ()));
                                jSONArray.put(jSONObject);
                                i++;
                            } else {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("heartbeats", jSONArray);
                                jSONObject2.put("version", "2");
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                                try {
                                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                                    try {
                                        gZIPOutputStream.write(C786410Ut5.J3(jSONObject2).getBytes("UTF-8"));
                                        gZIPOutputStream.close();
                                        base64OutputStream.close();
                                        string = byteArrayOutputStream.toString("UTF-8");
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        try {
                                            gZIPOutputStream.close();
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    try {
                                        base64OutputStream.close();
                                    } catch (Throwable th4) {
                                        TryCatchGuardChecker.doCheck(th4);
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                        throw th5;
                    }
                }
                C1C7U.LIZIZ("DefaultHeartBeatController@727e.getHeartBeatsHeader$1L");
                return string;
            }
        }) : C835460Wq0.LJ("");
    }

    public final void LIZJ() {
        if (this.LIZLLL.size() <= 0) {
            C835460Wq0.LJ(null);
            return;
        }
        Context context = this.LIZIZ;
        if (Build.VERSION.SDK_INT < 24 || !(!C0W4B.LIZ(context))) {
            C835460Wq0.LIZJ(this.LJ, new Callable() { // from class: X.0W4D
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C0W4C c0w4c = this.LL;
                    c0w4c.getClass();
                    C1C7U.LIZ("DefaultHeartBeatController@727e.registerHeartBeat$1L");
                    synchronized (c0w4c) {
                        try {
                            c0w4c.LIZ.get().LJIIJ(System.currentTimeMillis(), c0w4c.LIZJ.get().getUserAgent());
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    C1C7U.LIZIZ("DefaultHeartBeatController@727e.registerHeartBeat$1L");
                    return null;
                }
            });
        } else {
            C835460Wq0.LJ(null);
        }
    }

    public C0W4C(final Context context, final String str, Set<C0WBO> set, InterfaceC812380Vts<InterfaceC812430Vtx> interfaceC812380Vts) {
        InterfaceC812380Vts<C0W4G> interfaceC812380Vts2 = new InterfaceC812380Vts() { // from class: X.0W4E
            @Override // X.InterfaceC812380Vts
            public final Object get() {
                return new C0W4G(context, str);
            }
        };
        C822650WOx c822650WOx = new C822650WOx(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), LJFF);
        this.LIZ = interfaceC812380Vts2;
        this.LIZLLL = set;
        this.LJ = c822650WOx;
        this.LIZJ = interfaceC812380Vts;
        this.LIZIZ = context;
    }
}
