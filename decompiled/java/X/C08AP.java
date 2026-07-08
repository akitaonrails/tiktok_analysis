package X;

import android.content.SharedPreferences;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sp.QueuedWork;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: X.08AP, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08AP implements SharedPreferences {
    public static int LJIIJJI;
    public static final Object LJIIL = new Object();
    public final File LIZ;
    public final String LIZIZ;
    public final C0VSJ LIZJ;
    public final Object LIZLLL;
    public final Object LJ;
    public Map<String, Object> LJFF;
    public int LJI;
    public boolean LJII;
    public final WeakHashMap<SharedPreferences.OnSharedPreferenceChangeListener, Object> LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;

    public final void LIZ() {
        if (!this.LJII) {
            C08AS.LIZIZ.get().LIZ();
        }
        while (!this.LJII) {
            try {
                this.LIZLLL.wait();
            } catch (InterruptedException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        synchronized (this.LIZLLL) {
            try {
                LIZ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return new C08AM(this);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        HashMap map;
        synchronized (this.LIZLLL) {
            try {
                LIZ();
                map = new HashMap(this.LJFF);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() throws java.lang.Throwable {
        /*
            r8 = this;
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = r8.LIZLLL
            monitor-enter(r2)
            boolean r0 = r8.LJII     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto Ld
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc0
            return
        Ld:
            X.0VSJ r0 = r8.LIZJ     // Catch: java.lang.Throwable -> Lc0
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Lc0
            if (r0 == 0) goto L21
            java.io.File r0 = r8.LIZ     // Catch: java.lang.Throwable -> Lc0
            r0.delete()     // Catch: java.lang.Throwable -> Lc0
            X.0VSJ r1 = r8.LIZJ     // Catch: java.lang.Throwable -> Lc0
            java.io.File r0 = r8.LIZ     // Catch: java.lang.Throwable -> Lc0
            r1.renameTo(r0)     // Catch: java.lang.Throwable -> Lc0
        L21:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc0
            r3 = 0
            java.io.File r0 = r8.LIZ     // Catch: java.lang.Exception -> L68
            boolean r0 = r0.canRead()     // Catch: java.lang.Exception -> L68
            if (r0 == 0) goto L6c
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            X.0VSP r1 = new X.0VSP     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.io.File r0 = r8.LIZ     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r0 = 16384(0x4000, float:2.2959E-41)
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.util.HashMap r3 = X.C20154513tX.LIZ(r2)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L49
            goto L5f
        L3e:
            r0 = move-exception
            goto L45
        L40:
            r1 = move-exception
            r2 = r3
            goto L4a
        L43:
            r0 = move-exception
            r2 = r3
        L45:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L49
            goto L5d
        L49:
            r1 = move-exception
        L4a:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r1 = move-exception
            goto L4a
        L50:
            if (r2 == 0) goto L5a
            r2.close()     // Catch: java.io.IOException -> L56 java.lang.Exception -> L5b
            goto L5a
        L56:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L5b
        L5a:
            throw r1     // Catch: java.lang.Exception -> L5b
        L5b:
            r0 = move-exception
            goto L69
        L5d:
            if (r2 == 0) goto L6c
        L5f:
            r2.close()     // Catch: java.io.IOException -> L63 java.lang.Exception -> L68
            goto L6c
        L63:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Exception -> L68
            goto L6c
        L68:
            r0 = move-exception
        L69:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L6c:
            java.lang.Object r1 = r8.LIZLLL
            monitor-enter(r1)
            r0 = 1
            r8.LJII = r0     // Catch: java.lang.Throwable -> Lba
            if (r3 == 0) goto L77
            r8.LJFF = r3     // Catch: java.lang.Throwable -> Lba
            goto L7e
        L77:
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lba
            r0.<init>()     // Catch: java.lang.Throwable -> Lba
            r8.LJFF = r0     // Catch: java.lang.Throwable -> Lba
        L7e:
            java.lang.Object r0 = r8.LIZLLL     // Catch: java.lang.Throwable -> Lba
            r0.notifyAll()     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            long r4 = java.lang.Math.abs(r0)
            r1 = 400(0x190, double:1.976E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto Lb9
            java.lang.String r7 = r8.LIZIZ
            java.io.File r0 = r8.LIZ
            long r1 = r0.length()
            java.lang.String r6 = "sp_init_cost"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb5
            r3.<init>()     // Catch: java.lang.Exception -> Lb5
            java.lang.String r0 = "sp_init_cost_time"
            r3.put(r0, r4)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r0 = "sp_file_name"
            r3.put(r0, r7)     // Catch: java.lang.Exception -> Lb5
            java.lang.String r0 = "sp_file_size"
            r3.put(r0, r1)     // Catch: java.lang.Exception -> Lb5
            X.C794240VDq.LIZIZ(r6, r6, r3)     // Catch: java.lang.Exception -> Lb5
            return
        Lb5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lb9:
            return
        Lba:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lba
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lba
            throw r0
        Lc0:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lc0
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08AP.LIZLLL():void");
    }

    public static C0VSV LIZIZ(File file) {
        try {
            return new C0VSV(file);
        } catch (FileNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            if (!file.getParentFile().mkdir()) {
                return null;
            }
            try {
                return new C0VSV(file);
            } catch (FileNotFoundException e2) {
                TryCatchGuardChecker.doCheck(e2);
                return null;
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        boolean zContainsKey;
        synchronized (this.LIZLLL) {
            try {
                LIZ();
                zContainsKey = this.LJFF.containsKey(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zContainsKey;
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.LIZLLL) {
            try {
                this.LJIIIIZZ.put(onSharedPreferenceChangeListener, LJIIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.LIZLLL) {
            try {
                this.LJIIIIZZ.remove(onSharedPreferenceChangeListener);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C08AP(String str, File file) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj = new Object();
        this.LIZLLL = obj;
        this.LJ = new Object();
        this.LJI = 0;
        this.LJII = false;
        this.LJIIIIZZ = new WeakHashMap<>();
        this.LIZ = file;
        this.LIZIZ = str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(file.getPath());
        sbLIZ.append(".bak");
        this.LIZJ = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LJII = false;
        this.LJFF = null;
        int i = LJIIJJI;
        if (i != 0) {
            z = true;
            if (Looper.getMainLooper() == Looper.myLooper()) {
                z2 = true;
            } else {
                z2 = false;
                if ((i & 1) == 1) {
                    z3 = true;
                }
                z = z3;
            }
            z3 = false;
            if (!z2 || (i & 2) != 2) {
                z = z3;
            }
        } else {
            z = false;
        }
        synchronized (obj) {
            try {
                this.LJII = false;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            LIZLLL();
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SharedPreferencesImpl-load-");
        sbLIZ2.append(str);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        new BPEAThread(strLIZIZ) { // from class: X.08AQ
            @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("SharedPreferencesImpl@ab.startLoadFromDisk$3");
                boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
                try {
                    this.LL.LIZLLL();
                } finally {
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("SharedPreferencesImpl@ab.startLoadFromDisk$3");
            }
        }.start();
    }

    public final void LJ(C08AO c08ao, boolean z) {
        boolean z2;
        boolean zExists = this.LIZ.exists();
        System.currentTimeMillis();
        if (zExists) {
            try {
                if (this.LJIIJ < c08ao.LIZ) {
                    if (!z) {
                        synchronized (this.LIZLLL) {
                            try {
                                if (this.LJIIIZ == c08ao.LIZ) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } finally {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        if (!z2) {
                        }
                    }
                    if (!this.LIZJ.exists()) {
                        if (!this.LIZ.renameTo(this.LIZJ)) {
                            c08ao.LJFF = false;
                            c08ao.LJ.countDown();
                            System.currentTimeMillis();
                            return;
                        }
                    } else {
                        this.LIZ.delete();
                    }
                }
                c08ao.LJFF = true;
                c08ao.LJ.countDown();
                System.currentTimeMillis();
                return;
            } catch (Throwable th) {
                System.currentTimeMillis();
                throw th;
            }
        }
        try {
            C0VSV c0vsvLIZIZ = LIZIZ(this.LIZ);
            if (c0vsvLIZIZ == null) {
                c08ao.LJFF = false;
                c08ao.LJ.countDown();
                System.currentTimeMillis();
                return;
            }
            C20154513tX.LIZJ(c08ao.LIZLLL, c0vsvLIZIZ);
            if (!QueuedWork.LIZIZ()) {
                try {
                    c0vsvLIZIZ.getFD().sync();
                } catch (Exception th2) {
                }
            }
            c0vsvLIZIZ.close();
            this.LIZJ.delete();
            this.LJIIJ = c08ao.LIZ;
            c08ao.LJFF = true;
            c08ao.LJ.countDown();
            System.currentTimeMillis();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.delete();
            c08ao.LJFF = false;
            c08ao.LJ.countDown();
            System.currentTimeMillis();
        } catch (XmlPullParserException e2) {
            TryCatchGuardChecker.doCheck(e2);
            this.LIZ.delete();
            c08ao.LJFF = false;
            c08ao.LJ.countDown();
            System.currentTimeMillis();
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        synchronized (this.LIZLLL) {
            try {
                LIZ();
                try {
                    Boolean bool = (Boolean) this.LJFF.get(str);
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        synchronized (this.LIZLLL) {
            try {
                LIZ();
                try {
                    Float f2 = (Float) this.LJFF.get(str);
                    if (f2 != null) {
                        f = f2.floatValue();
                    }
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        synchronized (this.LIZLLL) {
            try {
                LIZ();
                try {
                    Integer num = (Integer) this.LJFF.get(str);
                    if (num != null) {
                        i = num.intValue();
                    }
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        synchronized (this.LIZLLL) {
            try {
                LIZ();
                try {
                    Long l = (Long) this.LJFF.get(str);
                    if (l != null) {
                        j = l.longValue();
                    }
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        String str3;
        synchronized (this.LIZLLL) {
            try {
                LIZ();
                try {
                    str3 = (String) this.LJFF.get(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    str3 = null;
                }
                if (str3 != null) {
                    str2 = str3;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        Set<String> set2;
        synchronized (this.LIZLLL) {
            try {
                LIZ();
                try {
                    set2 = (Set) this.LJFF.get(str);
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                    set2 = null;
                }
                if (set2 != null) {
                    set = set2;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return set;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.08AN] */
    public final void LIZJ(final C08AO c08ao, final C08AK c08ak, final List list) {
        final boolean z;
        boolean z2 = false;
        if (c08ak == null) {
            z = true;
        } else {
            z = false;
        }
        ?? r4 = new Runnable() { // from class: X.08AN
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SharedPreferencesImpl@ab.enqueueDiskWrite$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SharedPreferencesImpl@ab.enqueueDiskWrite$1");
            }

            public final void LIZ() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                synchronized (this.LLILZIL.LJ) {
                    try {
                        this.LLILZIL.LJ(c08ao, z);
                    } finally {
                    }
                }
                synchronized (this.LLILZIL.LIZLLL) {
                    try {
                        C08AP c08ap = this.LLILZIL;
                        c08ap.LJI--;
                    } finally {
                    }
                }
                Runnable runnable = c08ak;
                if (runnable != null) {
                    runnable.run();
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (jCurrentTimeMillis2 > 100) {
                    String str = this.LLILZIL.LIZIZ;
                    if (list != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("sp_apply_cost_time", jCurrentTimeMillis2);
                            jSONObject.put("sp_file_name", str);
                            C794240VDq.LIZIZ("sp_apply_cost", "sp_apply_cost", jSONObject);
                        } catch (Exception e) {
                        }
                    }
                }
            }
        };
        if (z) {
            synchronized (this.LIZLLL) {
                try {
                    if (this.LJI == 1) {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z2) {
                r4.run();
                return;
            }
        }
        QueuedWork.LIZJ(r4, !z);
    }
}
