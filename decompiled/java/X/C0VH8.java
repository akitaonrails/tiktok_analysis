package X;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: X.0VH8, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VH8 implements InterfaceC795090VGx, C0VHB {
    public final Context LLILLJJLI;
    public final C0VHM LLILLL;
    public final InterfaceC787600Uv0 LLILZ;
    public final WorkDatabase LLILZIL;
    public final List<C0VHP> LLIZLLLIL;
    public final Map<String, C0VHL> LLIZ = new HashMap();
    public final Map<String, C0VHL> LLILZLL = new HashMap();
    public final Set<String> LLJ = new HashSet();
    public final List<InterfaceC795090VGx> LLJI = new ArrayList();
    public PowerManager.WakeLock LL = null;
    public final Object LLJIJIL = new Object();

    static {
        C0VI8.LIZIZ("Processor");
    }

    public final void LJIIIIZZ() {
        synchronized (this.LLJIJIL) {
            try {
                if (!(!((HashMap) this.LLILZLL).isEmpty())) {
                    Intent intent = new Intent(this.LLILLJJLI, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        C786410Ut5.s3(this.LLILLJJLI, intent);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C0VI8.LIZ().getClass();
                    }
                    PowerManager.WakeLock wakeLock = this.LL;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.LL = null;
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void LIZ(InterfaceC795090VGx interfaceC795090VGx) {
        synchronized (this.LLJIJIL) {
            try {
                ((ArrayList) this.LLJI).add(interfaceC795090VGx);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LIZJ(String str) {
        boolean zContains;
        synchronized (this.LLJIJIL) {
            try {
                zContains = ((HashSet) this.LLJ).contains(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zContains;
    }

    public final boolean LJ(String str) {
        boolean z;
        synchronized (this.LLJIJIL) {
            try {
                if (!((HashMap) this.LLIZ).containsKey(str) && !((HashMap) this.LLILZLL).containsKey(str)) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final void LJFF(InterfaceC795090VGx interfaceC795090VGx) {
        synchronized (this.LLJIJIL) {
            try {
                ((ArrayList) this.LLJI).remove(interfaceC795090VGx);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJIIIZ(String str) {
        boolean zLIZIZ;
        synchronized (this.LLJIJIL) {
            try {
                C0VI8 c0vi8LIZ = C0VI8.LIZ();
                C786410Ut5.j4("Processor stopping foreground work %s", new Object[]{str});
                c0vi8LIZ.getClass();
                zLIZIZ = LIZIZ(str, (C0VHL) ((HashMap) this.LLILZLL).remove(str));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zLIZIZ;
    }

    public final boolean LJIIJ(String str) {
        boolean zLIZIZ;
        synchronized (this.LLJIJIL) {
            try {
                C0VI8 c0vi8LIZ = C0VI8.LIZ();
                C786410Ut5.j4("Processor stopping background work %s", new Object[]{str});
                c0vi8LIZ.getClass();
                zLIZIZ = LIZIZ(str, (C0VHL) ((HashMap) this.LLIZ).remove(str));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return zLIZIZ;
    }

    public static boolean LIZIZ(String str, C0VHL c0vhl) {
        boolean zIsDone;
        if (c0vhl != null) {
            c0vhl.LLJJIJI = true;
            c0vhl.LJIIJ();
            ListenableFuture<AbstractC795160VHe> listenableFuture = c0vhl.LLJJIII;
            if (listenableFuture != null) {
                zIsDone = listenableFuture.isDone();
                c0vhl.LLJJIII.cancel(true);
            } else {
                zIsDone = false;
            }
            ListenableWorker listenableWorker = c0vhl.LLILZIL;
            if (listenableWorker != null && !zIsDone) {
                listenableWorker.LJI();
            } else {
                C786410Ut5.j4("WorkSpec %s is already done. Not interrupting.", new Object[]{c0vhl.LLILZ});
                C0VI8.LIZ().getClass();
            }
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("WorkerWrapper interrupted for %s", new Object[]{str});
            c0vi8LIZ.getClass();
            return true;
        }
        C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
        C786410Ut5.j4("WorkerWrapper could not be found for %s", new Object[]{str});
        c0vi8LIZ2.getClass();
        return false;
    }

    @Override // X.InterfaceC795090VGx
    public final void LIZLLL(String str, boolean z) {
        synchronized (this.LLJIJIL) {
            try {
                ((HashMap) this.LLIZ).remove(str);
                C0VI8 c0vi8LIZ = C0VI8.LIZ();
                C786410Ut5.j4("%s %s executed; reschedule = %s", new Object[]{C0VH8.class.getSimpleName(), str, Boolean.valueOf(z)});
                c0vi8LIZ.getClass();
                Iterator it2 = ((ArrayList) this.LLJI).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC795090VGx) it2.next()).LIZLLL(str, z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJI(String str, C788790Uwv c788790Uwv) {
        synchronized (this.LLJIJIL) {
            try {
                C0VI8 c0vi8LIZ = C0VI8.LIZ();
                C786410Ut5.j4("Moving WorkSpec (%s) to the foreground", new Object[]{str});
                c0vi8LIZ.getClass();
                C0VHL c0vhl = (C0VHL) ((HashMap) this.LLIZ).remove(str);
                if (c0vhl != null) {
                    if (this.LL == null) {
                        PowerManager.WakeLock wakeLockLIZ = C789740UyS.LIZ(this.LLILLJJLI, "ProcessorForegroundLck");
                        this.LL = wakeLockLIZ;
                        wakeLockLIZ.acquire();
                    }
                    ((HashMap) this.LLILZLL).put(str, c0vhl);
                    C838410Wul.LJIIIZ(this.LLILLJJLI, C794950VGj.LIZIZ(this.LLILLJJLI, str, c788790Uwv));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJII(final String str, C0VHE c0vhe) {
        synchronized (this.LLJIJIL) {
            try {
                if (LJ(str)) {
                    C0VI8 c0vi8LIZ = C0VI8.LIZ();
                    C786410Ut5.j4("Work %s is already enqueued for processing", new Object[]{str});
                    c0vi8LIZ.getClass();
                    return false;
                }
                C0VHA c0vha = new C0VHA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this, this.LLILZIL, str);
                c0vha.LJI = this.LLIZLLLIL;
                if (c0vhe != null) {
                    c0vha.LJII = c0vhe;
                }
                C0VHL c0vhl = new C0VHL(c0vha);
                final C134N<Boolean> c134n = c0vhl.LLJJI;
                c134n.LJIIJJI(new Runnable(this, str, c134n) { // from class: X.0VH9
                    public final InterfaceC795090VGx LL;
                    public final String LLILLJJLI;
                    public final ListenableFuture<Boolean> LLILLL;

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zBooleanValue;
                        try {
                            try {
                                zBooleanValue = this.LLILLL.get().booleanValue();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (!C2179971ATj.LIZ(th)) {
                                    throw th;
                                }
                                return;
                            }
                        } catch (InterruptedException | ExecutionException e) {
                            TryCatchGuardChecker.doCheck(e);
                            zBooleanValue = true;
                        }
                        this.LL.LIZLLL(this.LLILLJJLI, zBooleanValue);
                    }

                    {
                        this.LL = this;
                        this.LLILLJJLI = str;
                        this.LLILLL = c134n;
                    }
                }, ((C0VG9) this.LLILZ).LIZJ);
                ((HashMap) this.LLIZ).put(str, c0vhl);
                ((C0VG9) this.LLILZ).LIZ.execute(c0vhl);
                C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
                C786410Ut5.j4("%s: processing %s", new Object[]{C0VH8.class.getSimpleName(), str});
                c0vi8LIZ2.getClass();
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C0VH8(Context context, C0VHM c0vhm, C0VG9 c0vg9, WorkDatabase workDatabase, List list) {
        this.LLILLJJLI = context;
        this.LLILLL = c0vhm;
        this.LLILZ = c0vg9;
        this.LLILZIL = workDatabase;
        this.LLIZLLLIL = list;
    }
}
