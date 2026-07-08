package X;

import Y.ARunnableS82S0200000_13;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0VHG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VHG implements C0VHP, C0VGX, InterfaceC795090VGx {
    public final Context LL;
    public final C0VI1 LLILLJJLI;
    public final C0VGY LLILLL;
    public final C0VHH LLILZIL;
    public boolean LLILZLL;
    public Boolean LLIZLLLIL;
    public final Set<C0VIG> LLILZ = new HashSet();
    public final Object LLIZ = new Object();

    @Override // X.C0VHP
    public final boolean LIZIZ() {
        return false;
    }

    static {
        C0VI8.LIZIZ("GreedyScheduler");
    }

    @Override // X.C0VHP
    public final void LIZ(C0VIG... c0vigArr) {
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = Boolean.valueOf(C08NT.LIZ(this.LL, this.LLILLJJLI.LIZIZ));
        }
        if (!this.LLIZLLLIL.booleanValue()) {
            C0VI8.LIZ().getClass();
            return;
        }
        if (!this.LLILZLL) {
            this.LLILLJJLI.LJFF.LIZ(this);
            this.LLILZLL = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C0VIG c0vig : c0vigArr) {
            long jLIZ = c0vig.LIZ();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c0vig.LIZIZ == C0VIP.ENQUEUED) {
                if (jCurrentTimeMillis < jLIZ) {
                    C0VHH c0vhh = this.LLILZIL;
                    if (c0vhh != null) {
                        Runnable runnable = (Runnable) ((HashMap) c0vhh.LIZJ).remove(c0vig.LIZ);
                        if (runnable != null) {
                            ((C0VHJ) c0vhh.LIZIZ).LIZ.removeCallbacks(runnable);
                        }
                        ARunnableS82S0200000_13 aRunnableS82S0200000_13 = new ARunnableS82S0200000_13(c0vhh, c0vig, 60);
                        ((HashMap) c0vhh.LIZJ).put(c0vig.LIZ, aRunnableS82S0200000_13);
                        C786410Ut5.LJLIIL(c0vig.LIZ() - System.currentTimeMillis(), ((C0VHJ) c0vhh.LIZIZ).LIZ, aRunnableS82S0200000_13);
                    }
                } else if (c0vig.LIZIZ()) {
                    C0VIK c0vik = c0vig.LJIIIZ;
                    if (c0vik.LIZJ) {
                        C0VI8 c0vi8LIZ = C0VI8.LIZ();
                        C786410Ut5.j4("Ignoring WorkSpec %s, Requires device idle.", new Object[]{c0vig});
                        c0vi8LIZ.getClass();
                    } else if (Build.VERSION.SDK_INT >= 24 && ((HashSet) c0vik.LJII.LIZ).size() > 0) {
                        C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
                        C786410Ut5.j4("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{c0vig});
                        c0vi8LIZ2.getClass();
                    } else {
                        hashSet.add(c0vig);
                        hashSet2.add(c0vig.LIZ);
                    }
                } else {
                    C0VI8 c0vi8LIZ3 = C0VI8.LIZ();
                    C786410Ut5.j4("Starting work for %s", new Object[]{c0vig.LIZ});
                    c0vi8LIZ3.getClass();
                    this.LLILLJJLI.LJIIJJI(c0vig.LIZ, null);
                }
            }
        }
        synchronized (this.LLIZ) {
            try {
                if (!hashSet.isEmpty()) {
                    C0VI8 c0vi8LIZ4 = C0VI8.LIZ();
                    C786410Ut5.j4("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)});
                    c0vi8LIZ4.getClass();
                    this.LLILZ.addAll(hashSet);
                    this.LLILLL.LIZJ(this.LLILZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.C0VGX
    public final void LIZJ(List<String> list) {
        for (String str : list) {
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("Constraints not met: Cancelling work ID %s", new Object[]{str});
            c0vi8LIZ.getClass();
            this.LLILLJJLI.LJIIL(str);
        }
    }

    @Override // X.C0VGX
    public final void LJ(List<String> list) {
        for (String str : (ArrayList) list) {
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("Constraints met: Scheduling work ID %s", new Object[]{str});
            c0vi8LIZ.getClass();
            this.LLILLJJLI.LJIIJJI(str, null);
        }
    }

    @Override // X.C0VHP
    public final void LJJIIJ(String str) {
        Runnable runnable;
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = Boolean.valueOf(C08NT.LIZ(this.LL, this.LLILLJJLI.LIZIZ));
        }
        if (!this.LLIZLLLIL.booleanValue()) {
            C0VI8.LIZ().getClass();
            return;
        }
        if (!this.LLILZLL) {
            this.LLILLJJLI.LJFF.LIZ(this);
            this.LLILZLL = true;
        }
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("Cancelling work ID %s", new Object[]{str});
        c0vi8LIZ.getClass();
        C0VHH c0vhh = this.LLILZIL;
        if (c0vhh != null && (runnable = (Runnable) ((HashMap) c0vhh.LIZJ).remove(str)) != null) {
            ((C0VHJ) c0vhh.LIZIZ).LIZ.removeCallbacks(runnable);
        }
        this.LLILLJJLI.LJIIL(str);
    }

    @Override // X.InterfaceC795090VGx
    public final void LIZLLL(String str, boolean z) {
        synchronized (this.LLIZ) {
            try {
                Iterator it2 = ((HashSet) this.LLILZ).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0VIG c0vig = (C0VIG) it2.next();
                    if (c0vig.LIZ.equals(str)) {
                        C0VI8 c0vi8LIZ = C0VI8.LIZ();
                        C786410Ut5.j4("Stopping tracking for %s", new Object[]{str});
                        c0vi8LIZ.getClass();
                        ((HashSet) this.LLILZ).remove(c0vig);
                        this.LLILLL.LIZJ(this.LLILZ);
                        break;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C0VHG(Context context, C0VHM c0vhm, C0VG9 c0vg9, C0VI1 c0vi1) {
        this.LL = context;
        this.LLILLJJLI = c0vi1;
        this.LLILLL = new C0VGY(context, c0vg9, this);
        this.LLILZIL = new C0VHH(this, c0vhm.LJ);
    }
}
