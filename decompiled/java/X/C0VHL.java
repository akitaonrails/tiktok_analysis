package X;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0VHL, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VHL implements Runnable {
    public static final /* synthetic */ int LLJJIJIIJIL = 0;
    public final Context LL;
    public final String LLILLJJLI;
    public final List<C0VHP> LLILLL;
    public C0VIG LLILZ;
    public final InterfaceC787600Uv0 LLILZLL;
    public final C0VHM LLIZLLLIL;
    public final C0VHB LLJ;
    public final WorkDatabase LLJI;
    public final InterfaceC794970VGl LLJIJIL;
    public final InterfaceC795120VHa LLJILJIL;
    public final InterfaceC795140VHc LLJILJILJ;
    public List<String> LLJILLL;
    public String LLJJ;
    public volatile boolean LLJJIJI;
    public AbstractC795160VHe LLIZ = new C795170VHf();
    public final C134N<Boolean> LLJJI = new C134N<>();
    public ListenableFuture<AbstractC795160VHe> LLJJIII = null;
    public ListenableWorker LLILZIL = null;

    static {
        C0VI8.LIZIZ("WorkerWrapper");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VHL.LIZ():void");
    }

    public final void LJ() {
        this.LLJI.beginTransaction();
        try {
            ((C0VIH) this.LLJIJIL).LJIILLIIL(C0VIP.ENQUEUED, this.LLILLJJLI);
            ((C0VIH) this.LLJIJIL).LJIILL(System.currentTimeMillis(), this.LLILLJJLI);
            ((C0VIH) this.LLJIJIL).LJIIL(-1L, this.LLILLJJLI);
            this.LLJI.setTransactionSuccessful();
            this.LLJI.endTransaction();
            LJII(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJI.endTransaction();
            LJII(true);
            throw th;
        }
    }

    public final void LJFF() {
        this.LLJI.beginTransaction();
        try {
            ((C0VIH) this.LLJIJIL).LJIILL(System.currentTimeMillis(), this.LLILLJJLI);
            ((C0VIH) this.LLJIJIL).LJIILLIIL(C0VIP.ENQUEUED, this.LLILLJJLI);
            ((C0VIH) this.LLJIJIL).LJIILIIL(this.LLILLJJLI);
            ((C0VIH) this.LLJIJIL).LJIIL(-1L, this.LLILLJJLI);
            this.LLJI.setTransactionSuccessful();
            this.LLJI.endTransaction();
            LJII(false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJI.endTransaction();
            LJII(false);
            throw th;
        }
    }

    public final void LJIIIIZZ() {
        C0VIP c0vipLJFF = ((C0VIH) this.LLJIJIL).LJFF(this.LLILLJJLI);
        if (c0vipLJFF == C0VIP.RUNNING) {
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.LLILLJJLI});
            c0vi8LIZ.getClass();
            LJII(true);
            return;
        }
        C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
        C786410Ut5.j4("Status for %s is %s; not doing any work", new Object[]{this.LLILLJJLI, c0vipLJFF});
        c0vi8LIZ2.getClass();
        LJII(false);
    }

    public final void LJIIIZ() {
        this.LLJI.beginTransaction();
        try {
            LIZJ(this.LLILLJJLI);
            C795380VIa c795380VIa = ((C795170VHf) this.LLIZ).LIZ;
            ((C0VIH) this.LLJIJIL).LJIILJJIL(this.LLILLJJLI, c795380VIa);
            this.LLJI.setTransactionSuccessful();
            this.LLJI.endTransaction();
            LJII(false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLJI.endTransaction();
            LJII(false);
            throw th;
        }
    }

    public final boolean LJIIJ() {
        if (!this.LLJJIJI) {
            return false;
        }
        C0VI8 c0vi8LIZ = C0VI8.LIZ();
        C786410Ut5.j4("Work interrupted for %s", new Object[]{this.LLJJ});
        c0vi8LIZ.getClass();
        if (((C0VIH) this.LLJIJIL).LJFF(this.LLILLJJLI) == null) {
            LJII(false);
            return true;
        }
        LJII(!r0.isFinished());
        return true;
    }

    public final void LIZLLL() {
        if (!LJIIJ()) {
            this.LLJI.beginTransaction();
            try {
                C0VIP c0vipLJFF = ((C0VIH) this.LLJIJIL).LJFF(this.LLILLJJLI);
                ((C0VIF) this.LLJI.LJI()).LIZ(this.LLILLJJLI);
                if (c0vipLJFF == null) {
                    LJII(false);
                } else if (c0vipLJFF == C0VIP.RUNNING) {
                    LIZIZ(this.LLIZ);
                } else if (!c0vipLJFF.isFinished()) {
                    LJ();
                }
                this.LLJI.setTransactionSuccessful();
                this.LLJI.endTransaction();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLJI.endTransaction();
                throw th;
            }
        }
        List<C0VHP> list = this.LLILLL;
        if (list != null) {
            Iterator<C0VHP> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIIJ(this.LLILLJJLI);
            }
            C0VHR.LIZ(this.LLIZLLLIL, this.LLJI, this.LLILLL);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public C0VHL(C0VHA c0vha) {
        this.LL = c0vha.LIZ;
        this.LLILZLL = c0vha.LIZJ;
        this.LLJ = c0vha.LIZIZ;
        this.LLILLJJLI = c0vha.LJFF;
        this.LLILLL = c0vha.LJI;
        this.LLIZLLLIL = c0vha.LIZLLL;
        WorkDatabase workDatabase = c0vha.LJ;
        this.LLJI = workDatabase;
        this.LLJIJIL = workDatabase.LJIIIIZZ();
        this.LLJILJIL = workDatabase.LIZ();
        this.LLJILJILJ = workDatabase.LJIIIZ();
    }

    public final void LIZIZ(AbstractC795160VHe abstractC795160VHe) {
        if (abstractC795160VHe instanceof C795180VHg) {
            C0VI8 c0vi8LIZ = C0VI8.LIZ();
            C786410Ut5.j4("Worker result SUCCESS for %s", new Object[]{this.LLJJ});
            c0vi8LIZ.getClass();
            if (this.LLILZ.LIZJ()) {
                LJFF();
                return;
            }
            this.LLJI.beginTransaction();
            try {
                ((C0VIH) this.LLJIJIL).LJIILLIIL(C0VIP.SUCCEEDED, this.LLILLJJLI);
                ((C0VIH) this.LLJIJIL).LJIILJJIL(this.LLILLJJLI, ((C795180VHg) this.LLIZ).LIZ);
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (String str : (ArrayList) ((C795190VHh) this.LLJILJIL).LIZ(this.LLILLJJLI)) {
                    if (((C0VIH) this.LLJIJIL).LJFF(str) == C0VIP.BLOCKED && ((C795190VHh) this.LLJILJIL).LIZIZ(str)) {
                        C0VI8 c0vi8LIZ2 = C0VI8.LIZ();
                        C786410Ut5.j4("Setting status to enqueued for %s", new Object[]{str});
                        c0vi8LIZ2.getClass();
                        ((C0VIH) this.LLJIJIL).LJIILLIIL(C0VIP.ENQUEUED, str);
                        ((C0VIH) this.LLJIJIL).LJIILL(jCurrentTimeMillis, str);
                    }
                }
                this.LLJI.setTransactionSuccessful();
                this.LLJI.endTransaction();
                LJII(false);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLJI.endTransaction();
                LJII(false);
                throw th;
            }
        }
        if (abstractC795160VHe instanceof C795150VHd) {
            C0VI8 c0vi8LIZ3 = C0VI8.LIZ();
            C786410Ut5.j4("Worker result RETRY for %s", new Object[]{this.LLJJ});
            c0vi8LIZ3.getClass();
            LJ();
            return;
        }
        C0VI8 c0vi8LIZ4 = C0VI8.LIZ();
        C786410Ut5.j4("Worker result FAILURE for %s", new Object[]{this.LLJJ});
        c0vi8LIZ4.getClass();
        if (this.LLILZ.LIZJ()) {
            LJFF();
        } else {
            LJIIIZ();
        }
    }

    public final void LIZJ(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((C0VIH) this.LLJIJIL).LJFF(str2) != C0VIP.CANCELLED) {
                ((C0VIH) this.LLJIJIL).LJIILLIIL(C0VIP.FAILED, str2);
            }
            linkedList.addAll(((C795190VHh) this.LLJILJIL).LIZ(str2));
        }
    }

    public final void LJII(boolean z) {
        ListenableWorker listenableWorker;
        this.LLJI.beginTransaction();
        try {
            if (!((C0VIH) this.LLJI.LJIIIIZZ()).LJIIJ()) {
                C2455509jl.LIZ(this.LL, RescheduleReceiver.class, false);
            }
            if (z) {
                ((C0VIH) this.LLJIJIL).LJIILLIIL(C0VIP.ENQUEUED, this.LLILLJJLI);
                ((C0VIH) this.LLJIJIL).LJIIL(-1L, this.LLILLJJLI);
            }
            if (this.LLILZ != null && (listenableWorker = this.LLILZIL) != null && listenableWorker.LIZIZ()) {
                C0VHB c0vhb = this.LLJ;
                String str = this.LLILLJJLI;
                C0VH8 c0vh8 = (C0VH8) c0vhb;
                synchronized (c0vh8.LLJIJIL) {
                    try {
                        ((HashMap) c0vh8.LLILZLL).remove(str);
                        c0vh8.LJIIIIZZ();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            this.LLJI.setTransactionSuccessful();
            this.LLJI.endTransaction();
            this.LLJJI.LJIIIZ(Boolean.valueOf(z));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LLJI.endTransaction();
            throw th2;
        }
    }
}
