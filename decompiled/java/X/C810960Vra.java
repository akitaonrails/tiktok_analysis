package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0Vra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810960Vra {
    public final SharedPreferences LIZ;
    public final Executor LJ;
    public final ArrayDeque<String> LIZLLL = new ArrayDeque<>();
    public final String LIZIZ = "topic_operation_queue";
    public final String LIZJ = ",";

    public final String LIZIZ() {
        String strPeek;
        synchronized (this.LIZLLL) {
            try {
                strPeek = this.LIZLLL.peek();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return strPeek;
    }

    public final boolean LIZJ(Object obj) {
        boolean zRemove;
        synchronized (this.LIZLLL) {
            try {
                zRemove = this.LIZLLL.remove(obj);
                if (zRemove) {
                    this.LJ.execute(new Runnable() { // from class: X.0Vrb
                        @Override // java.lang.Runnable
                        public final void run() {
                            C810960Vra c810960Vra = this.LL;
                            C1C7U.LIZ("SharedPreferencesQueue@d01a.syncStateAsync$1L");
                            synchronized (c810960Vra.LIZLLL) {
                                try {
                                    SharedPreferences.Editor editorEdit = c810960Vra.LIZ.edit();
                                    String str = c810960Vra.LIZIZ;
                                    StringBuilder sb = new StringBuilder();
                                    Iterator<String> it2 = c810960Vra.LIZLLL.iterator();
                                    while (it2.hasNext()) {
                                        sb.append(it2.next());
                                        sb.append(c810960Vra.LIZJ);
                                    }
                                    editorEdit.putString(str, sb.toString()).commit();
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            C1C7U.LIZIZ("SharedPreferencesQueue@d01a.syncStateAsync$1L");
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zRemove;
    }

    public C810960Vra(SharedPreferences sharedPreferences, Executor executor) {
        this.LIZ = sharedPreferences;
        this.LJ = executor;
    }

    public static C810960Vra LIZ(SharedPreferences sharedPreferences, Executor executor) {
        C810960Vra c810960Vra = new C810960Vra(sharedPreferences, executor);
        synchronized (c810960Vra.LIZLLL) {
            try {
                c810960Vra.LIZLLL.clear();
                String string = c810960Vra.LIZ.getString(c810960Vra.LIZIZ, "");
                if (!TextUtils.isEmpty(string) && string.contains(c810960Vra.LIZJ)) {
                    String[] strArrSplit = string.split(c810960Vra.LIZJ, -1);
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            c810960Vra.LIZLLL.add(str);
                        }
                    }
                    return c810960Vra;
                }
                return c810960Vra;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
