package X;

import X.C830490Whz;
import android.content.SharedPreferences;
import android.os.StrictMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12j5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19834912j5 implements InterfaceC19834212iy {
    public static final C830490Whz LJI = new C830490Whz();
    public final SharedPreferences LIZ;
    public final Runnable LIZIZ;
    public final SharedPreferencesOnSharedPreferenceChangeListenerC19835212j8 LIZJ;
    public final Object LIZLLL;
    public volatile Map<String, ?> LJ;
    public final List<InterfaceC19835312j9> LJFF;

    public static synchronized void LIZ() {
        for (C19834912j5 c19834912j5 : (C830490Whz.e) LJI.values()) {
            c19834912j5.LIZ.unregisterOnSharedPreferenceChangeListener(c19834912j5.LIZJ);
        }
        LJI.clear();
    }

    @Override // X.InterfaceC19834212iy
    public final Object LJIIIIZZ(String str) {
        Map<String, ?> all = this.LJ;
        if (all == null) {
            synchronized (this.LIZLLL) {
                try {
                    all = this.LJ;
                    if (all == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            all = this.LIZ.getAll();
                            this.LJ = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        if (all != null) {
            return all.get(str);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.12j8, android.content.SharedPreferences$OnSharedPreferenceChangeListener] */
    public C19834912j5(SharedPreferences sharedPreferences, RunnableC1699490uKJ runnableC1699490uKJ) {
        ?? r1 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: X.12j8
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                C19834912j5 c19834912j5 = this.LL;
                synchronized (c19834912j5.LIZLLL) {
                    try {
                        c19834912j5.LJ = null;
                        c19834912j5.LIZIZ.run();
                    } finally {
                    }
                }
                synchronized (c19834912j5) {
                    try {
                        Iterator it2 = ((ArrayList) c19834912j5.LJFF).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC19835312j9) it2.next()).zza();
                        }
                    } finally {
                    }
                }
            }
        };
        this.LIZJ = r1;
        this.LIZLLL = new Object();
        this.LJFF = new ArrayList();
        this.LIZ = sharedPreferences;
        this.LIZIZ = runnableC1699490uKJ;
        sharedPreferences.registerOnSharedPreferenceChangeListener(r1);
    }
}
