package X;

import X.C830490Whz;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12j4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19834812j4 implements InterfaceC19834212iy {
    public static final C830490Whz LJII = new C830490Whz();
    public static final String[] LJIIIIZZ = {"key", "value"};
    public final ContentResolver LIZ;
    public final Uri LIZIZ;
    public final Runnable LIZJ;
    public final C19835112j7 LIZLLL;
    public final Object LJ;
    public volatile Map<String, String> LJFF;
    public final List<InterfaceC19835312j9> LJI;

    public static synchronized void LIZJ() {
        for (C19834812j4 c19834812j4 : (C830490Whz.e) LJII.values()) {
            c19834812j4.LIZ.unregisterContentObserver(c19834812j4.LIZLLL);
        }
        LJII.clear();
    }

    public final Map<String, String> LIZIZ() {
        Map<String, String> map = this.LJFF;
        if (map == null) {
            synchronized (this.LJ) {
                try {
                    map = this.LJFF;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            try {
                                map = (Map) C836540Wrk.LIZ(new InterfaceC836550Wrl() { // from class: X.12j6
                                    @Override // X.InterfaceC836550Wrl
                                    public final Object zza() throws Throwable {
                                        C19834812j4 c19834812j4 = this.LIZ;
                                        Cursor cursorLJJJ = C2204961BRm.LJJJ(c19834812j4.LIZ, c19834812j4.LIZIZ, C19834812j4.LJIIIIZZ, null, null, null, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz1cEJOnFpNPfGz/D+qAVxNrfF00hvBxNO+", new String[]{"016a9"}));
                                        if (cursorLJJJ == null) {
                                            return Collections.emptyMap();
                                        }
                                        try {
                                            int count = cursorLJJJ.getCount();
                                            if (count == 0) {
                                                Map mapEmptyMap = Collections.emptyMap();
                                                cursorLJJJ.close();
                                                return mapEmptyMap;
                                            }
                                            Map c830490Whz = count <= 256 ? new C830490Whz(count) : new HashMap(count, 1.0f);
                                            while (cursorLJJJ.moveToNext()) {
                                                c830490Whz.put(cursorLJJJ.getString(0), cursorLJJJ.getString(1));
                                            }
                                            cursorLJJJ.close();
                                            return c830490Whz;
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            cursorLJJJ.close();
                                            throw th;
                                        }
                                    }
                                });
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th;
                            }
                        } catch (SQLiteException | IllegalStateException | SecurityException e) {
                            TryCatchGuardChecker.doCheck(e);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = null;
                        }
                        this.LJFF = map;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    @Override // X.InterfaceC19834212iy
    public final /* synthetic */ Object LJIIIIZZ(String str) {
        return LIZIZ().get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.12j7, android.database.ContentObserver] */
    public C19834812j4(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        ?? r1 = new ContentObserver() { // from class: X.12j7
            {
                super(null);
            }

            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                C19834812j4 c19834812j4 = this.LIZ;
                synchronized (c19834812j4.LJ) {
                    try {
                        c19834812j4.LJFF = null;
                        c19834812j4.LIZJ.run();
                    } finally {
                    }
                }
                synchronized (c19834812j4) {
                    try {
                        Iterator it2 = ((ArrayList) c19834812j4.LJI).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC19835312j9) it2.next()).zza();
                        }
                    } finally {
                    }
                }
            }
        };
        this.LIZLLL = r1;
        this.LJ = new Object();
        this.LJI = new ArrayList();
        contentResolver.getClass();
        uri.getClass();
        this.LIZ = contentResolver;
        this.LIZIZ = uri;
        this.LIZJ = runnable;
        contentResolver.registerContentObserver(uri, false, r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C19834812j4 LIZ(ContentResolver contentResolver, Uri uri, Runnable runnable) {
        C19834812j4 c19834812j4;
        synchronized (C19834812j4.class) {
            try {
                C830490Whz c830490Whz = LJII;
                c19834812j4 = (C19834812j4) c830490Whz.get(uri);
                if (c19834812j4 == null) {
                    try {
                        C19834812j4 c19834812j42 = new C19834812j4(contentResolver, uri, runnable);
                        try {
                            c830490Whz.put(uri, c19834812j42);
                            c19834812j4 = c19834812j42;
                        } catch (SecurityException e) {
                            e = e;
                            c19834812j4 = c19834812j42;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return c19834812j4;
    }
}
