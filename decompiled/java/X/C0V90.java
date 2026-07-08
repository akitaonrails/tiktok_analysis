package X;

import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import ms.bd.o.a;
import ms.bd.o.b;
import ms.bd.o.g3;
import ms.bd.o.i3;
import ms.bd.o.k;
import ms.bd.o.l3;
import ms.bd.o.m3;
import ms.bd.o.p2;
import ms.bd.o.q2;
import ms.bd.o.r2;
import ms.bd.o.t2;
import ms.bd.o.v2;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V90, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V90 {
    public static final i3 LIZ;
    public static final g3 LIZIZ;

    static {
        i3 i3Var = new i3();
        LIZ = i3Var;
        LIZIZ = new g3(i3Var);
    }

    public static void LIZ() {
        b.LIZ(268435457, new b.a() { // from class: X.08Xd
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                try {
                    Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(a.LIZIZ.LIZ, "window"), new C0WZX("dzBzEgAjS8/YVFkiQFyJaZoGNs0pA7UvP+XqyessBjBq", null));
                    Point point = new Point();
                    displayLLILZIL.getRealSize(point);
                    p2.LIZ = point.x;
                    p2.LIZIZ = point.y;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                return p2.LIZ + "*" + p2.LIZIZ;
            }
        });
        b.LIZ(268435462, new b.a() { // from class: X.0V97
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                String str2 = v2.LIZ;
                JSONObject jSONObject = new JSONObject();
                try {
                    HashMap<String, String> mapLIZLLL = v2.LIZLLL();
                    jSONObject.put(v2.LJIIIIZZ, v2.LIZ());
                    jSONObject.put(v2.LIZLLL, v2.LIZJ(v2.LIZ, mapLIZLLL));
                    jSONObject.put(v2.LJ, v2.LIZJ(v2.LIZIZ, mapLIZLLL));
                    jSONObject.put(v2.LJI, v2.LIZIZ((String) k.a(16777217, 0, 0L, "c0966b", new byte[]{61, 33, 83, 81, 70, 113, 101, 7, 97, 101, 119, 33, 5, 81, 16, 102, 116, 20, 101, 41, 113, 34, 95, 13, 10, 101, 117, 65, 39, 101, 98, 39, 76, 80, 12, 100, 47, 18, 120, 115, 123, 60, 76, 77, 54, 120, 97, 9, 87, 96, 96, 55, 91})));
                    jSONObject.put(v2.LJII, v2.LIZIZ((String) k.a(16777217, 0, 0L, "eb9c34", new byte[]{59, 115, 83, 4, 67, 39, 99, 85, 97, 48, 113, 115, 5, 4, 21, 48, 114, 70, 101, 124, 119, 112, 95, 88, 15, 51, 115, 19, 39, 48, 100, 117, 76, 5, 9, 50, 41, 64, 120, 38, 125, 110, 76, 24, 51, 46, 111, 77, 87, 53, 102, 101, 91})));
                    jSONObject.put(v2.LJFF, v2.LIZJ(v2.LIZJ, mapLIZLLL));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                String strJ3 = C786410Ut5.J3(jSONObject);
                if (TextUtils.isEmpty(strJ3)) {
                    return k.a(16777217, 0, 0L, "a674c4", new byte[]{107, 41});
                }
                return strJ3.trim();
            }
        });
        b.LIZ(268435467, new b.a() { // from class: X.0V91
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                int[] iArr = {0, 0};
                try {
                    r2 r2VarLIZ = r2.LIZ(a.LIZIZ.LIZ);
                    return new int[]{r2VarLIZ.LIZ, r2VarLIZ.LIZIZ};
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    k.a(16777217, 0, 0L, "62ab1c", new byte[]{14, 30, 59, 34, 78, 115, 48, 7, 112, 55, 63, 51, 23, 6, 26, 125, 58, 29});
                    return iArr;
                }
            }
        });
        b.LIZ(268435474, new b.a() { // from class: X.0V92
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                a aVar = a.LIZIZ;
                Context context = aVar.LIZ;
                String strReplace = str.replace((String) k.a(16777217, 0, 0L, "e5ccc4", new byte[]{63}), (String) k.a(16777217, 0, 0L, "6c180b", new byte[]{106})).replace((String) k.a(16777217, 0, 0L, "450c75", new byte[]{106}), (String) k.a(16777217, 0, 0L, "d894a0", new byte[]{74}));
                Context context2 = aVar.LIZ;
                if (context2 == null) {
                    return null;
                }
                r2.LIZ(context).LIZIZ(context2, strReplace, j);
                return null;
            }
        });
        b.LIZ(268435468, new b.a() { // from class: X.08XX
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                String str2;
                Context context = a.LIZIZ.LIZ;
                String[] strArr = q2.LIZ;
                AudioManager audioManager = (AudioManager) C786410Ut5.H2(context, (String) k.a(16777217, 0, 0L, "bed22b", new byte[]{114, 114, 19, 79, 2}));
                ArrayList arrayList = new ArrayList();
                try {
                    AudioDeviceInfo[] devices = audioManager.getDevices(1);
                    for (AudioDeviceInfo audioDeviceInfo : devices) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(audioDeviceInfo.getType());
                        sb.append((String) k.a(16777217, 0, 0L, "68f9a2", new byte[]{24}));
                        int type = audioDeviceInfo.getType();
                        String[] strArr2 = q2.LIZ;
                        if (type < strArr2.length) {
                            str2 = strArr2[type];
                        } else {
                            str2 = (String) k.a(16777217, 0, 0L, "422fdc", new byte[]{17, 9, 113, 55, 100, 65, 25, 56, 77, 25, 18, 30});
                        }
                        sb.append(str2);
                        arrayList.add(sb.toString());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                return arrayList.toArray();
            }
        });
        b.LIZ(268435469, new b.a() { // from class: X.0V8y
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                l3 l3VarLIZJ = l3.LIZJ(a.LIZIZ.LIZ);
                l3VarLIZJ.getClass();
                try {
                    if (((ReentrantLock) l3VarLIZJ.LLILZLL).tryLock(5L, TimeUnit.SECONDS)) {
                        if (l3VarLIZJ.LLILZIL.size() >= l3.LLJILJILJ) {
                            synchronized (l3VarLIZJ) {
                                try {
                                    l3VarLIZJ.LJFF();
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }
                        Object[] objArrLIZLLL = l3VarLIZJ.LIZLLL(new JSONArray());
                        l3VarLIZJ.LJI();
                        return objArrLIZLLL;
                    }
                } catch (Throwable th) {
                }
                l3VarLIZJ.LJI();
                return null;
            }
        });
        b.LIZ(268435477, new b.a() { // from class: X.0V8w
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                l3 l3VarLIZJ = l3.LIZJ(a.LIZIZ.LIZ);
                l3VarLIZJ.getClass();
                try {
                    if (((ReentrantLock) l3VarLIZJ.LLILZLL).tryLock(5L, TimeUnit.SECONDS)) {
                        if (l3VarLIZJ.LLILZIL.size() >= l3.LLJILJILJ) {
                            synchronized (l3VarLIZJ) {
                                try {
                                    l3VarLIZJ.LJFF();
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                        }
                        JSONArray jSONArray = new JSONArray();
                        l3VarLIZJ.LIZLLL(jSONArray);
                        String string = jSONArray.toString();
                        l3VarLIZJ.LJI();
                        return string;
                    }
                } catch (Throwable th) {
                }
                l3VarLIZJ.LJI();
                return null;
            }
        });
        b.LIZ(268435470, new b.a() { // from class: X.0V8v
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                Context context = a.LIZIZ.LIZ;
                l3 l3VarLIZJ = l3.LIZJ(context);
                Application application = (Application) context;
                synchronized (l3VarLIZJ) {
                    try {
                        if (!l3VarLIZJ.LLILLJJLI) {
                            l3VarLIZJ.LLILLJJLI = true;
                            l3VarLIZJ.LLJ = application;
                            application.registerActivityLifecycleCallbacks(l3VarLIZJ);
                            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new m3(l3VarLIZJ, application));
                        }
                    } finally {
                    }
                }
                if (!l3VarLIZJ.LL && application != null) {
                    synchronized (l3VarLIZJ) {
                        try {
                            if (!l3VarLIZJ.LL) {
                                l3VarLIZJ.LL = true;
                                l3VarLIZJ.LLIZ = false;
                                l3.LLJILJILJ = i;
                            }
                        } finally {
                        }
                    }
                }
                if (((ReentrantLock) l3VarLIZJ.LLILZLL).tryLock()) {
                    l3VarLIZJ.LLILZIL.clear();
                    l3VarLIZJ.LLJIJIL.LIZIZ(l3VarLIZJ.LLILZIL);
                    l3VarLIZJ.LJI();
                    return null;
                }
                return null;
            }
        });
        b.LIZ(268435471, new b.a() { // from class: X.0V8x
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                boolean z;
                l3 l3VarLIZJ = l3.LIZJ(a.LIZIZ.LIZ);
                l3VarLIZJ.getClass();
                try {
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (((ReentrantLock) l3VarLIZJ.LLILZLL).tryLock(5L, TimeUnit.SECONDS)) {
                    if (l3VarLIZJ.LLILZIL.size() >= l3.LLJILJILJ && !l3VarLIZJ.LLIZ) {
                        l3VarLIZJ.LLIZ = true;
                        l3VarLIZJ.LJI();
                        z = true;
                    } else {
                        l3VarLIZJ.LLJIJIL.LIZJ(l3VarLIZJ.LLILZIL);
                        l3VarLIZJ.LJI();
                        z = l3VarLIZJ.LLIZ;
                    }
                } else {
                    l3VarLIZJ.LJI();
                    z = l3VarLIZJ.LLIZ;
                }
                if (z) {
                    return k.a(16777217, 0, 0L, "9e3e4d", new byte[]{121});
                }
                return null;
            }
        });
        b.LIZ(268435472, new b.a() { // from class: X.0V95
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                l3.LIZJ(a.LIZIZ.LIZ).LJFF();
                return null;
            }
        });
        b.LIZ(268435479, new b.a() { // from class: X.0V93
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                l3.LIZJ(a.LIZIZ.LIZ).LLJIJIL.LIZ();
                return null;
            }
        });
        b.LIZ(268435473, new b.a() { // from class: X.08XA
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                return t2.LIZ(a.LIZIZ.LIZ).LIZIZ(i);
            }
        });
        b.LIZ(268435478, new b.a() { // from class: X.08X9
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                Object[] objArrLIZIZ = t2.LIZ(a.LIZIZ.LIZ).LIZIZ(i);
                if (objArrLIZIZ == null) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray();
                for (Object obj2 : objArrLIZIZ) {
                    String[] strArrSplit = ((String) obj2).split((String) k.a(16777217, 0, 0L, "e93780", new byte[]{56}));
                    if (strArrSplit.length >= 2) {
                        Long lValueOf = CastLongProtector.valueOf(strArrSplit[0]);
                        Integer numValueOf = CastIntegerProtector.valueOf(strArrSplit[1]);
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(lValueOf);
                        jSONArray2.put(numValueOf);
                        jSONArray.put(jSONArray2);
                    }
                }
                return jSONArray.toString();
            }
        });
        b.LIZ(268435480, new b.a() { // from class: X.08XB
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                t2.LIZ(a.LIZIZ.LIZ).LIZJ.LIZ();
                return null;
            }
        });
        b.LIZ(268435481, new b.a() { // from class: X.0V94
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                Context context = a.LIZIZ.LIZ;
                if (context != null) {
                    C0V90.LIZIZ.LIZ((Application) context);
                    return null;
                }
                return null;
            }
        });
        b.LIZ(268435482, new b.a() { // from class: X.0V8z
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                Context context = a.LIZIZ.LIZ;
                if (context != null) {
                    Application application = (Application) context;
                    g3 g3Var = C0V90.LIZIZ;
                    synchronized (g3Var) {
                        try {
                            if (g3Var.LL) {
                                g3Var.LL = false;
                                application.unregisterActivityLifecycleCallbacks(g3Var);
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    return null;
                }
                return null;
            }
        });
        b.LIZ(268435483, new b.a() { // from class: X.0V96
            @Override // ms.bd.o.b.a
            public final Object LIZIZ(long j, int i, String str, Object obj) {
                LinkedList linkedList;
                i3 i3Var = C0V90.LIZ;
                synchronized (i3Var) {
                    linkedList = new LinkedList();
                    linkedList.addAll(i3Var.LL);
                }
                return linkedList;
            }
        });
    }
}
