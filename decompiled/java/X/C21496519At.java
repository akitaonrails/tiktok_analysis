package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.19At, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21496519At {
    public final BPEAHandler LIZ = new BPEAHandler(Looper.getMainLooper());
    public final LinkedList<AbstractRunnableC21499319Bv> LIZIZ = new LinkedList<>();
    public boolean LIZJ = false;
    public RunnableC1906640ziQ LIZLLL = null;
    public int LJ = 0;
    public final RunnableC21497119Az LJFF = new Runnable() { // from class: X.19Az
        @Override // java.lang.Runnable
        public final void run() {
            C21496519At c21496519At;
            C1C7U.LIZ("NavigationMessageQueue@1552.<field>$1");
            this.LL.getClass();
            while (true) {
                c21496519At = this.LL;
                if (c21496519At.LJ <= 0) {
                    break;
                }
                C786410Ut5.LJJZZIII(c21496519At.LIZ, this);
                C21496519At c21496519At2 = this.LL;
                c21496519At2.LJ--;
            }
            AbstractRunnableC21499319Bv abstractRunnableC21499319BvPoll = c21496519At.LIZIZ.poll();
            if (abstractRunnableC21499319BvPoll == null) {
                C21494919Ad.LIZIZ.LIZIZ("NavigationMessageQueue", "empty return");
                C1C7U.LIZIZ("NavigationMessageQueue@1552.<field>$1");
                return;
            }
            C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mSceneNavigationTask run task start ");
            sbLIZ.append(abstractRunnableC21499319BvPoll.toString());
            c21494919Ad.LIZIZ("NavigationMessageQueue", C2188811AlT.LIZIZ(sbLIZ));
            abstractRunnableC21499319BvPoll.run();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("mSceneNavigationTask run task finish ");
            sbLIZ2.append(abstractRunnableC21499319BvPoll.toString());
            c21494919Ad.LIZIZ("NavigationMessageQueue", C2188811AlT.LIZIZ(sbLIZ2));
            C1C7U.LIZIZ("NavigationMessageQueue@1552.<field>$1");
        }
    };

    public final void LIZ() {
        while (true) {
            RunnableC1906640ziQ runnableC1906640ziQ = this.LIZLLL;
            this.LIZLLL = null;
            if (runnableC1906640ziQ == null) {
                return;
            }
            if (runnableC1906640ziQ.LLILZ) {
                runnableC1906640ziQ.LLILZ = false;
                runnableC1906640ziQ.LL.removeCallbacks(runnableC1906640ziQ);
            } else if (!runnableC1906640ziQ.LLILLL) {
                return;
            }
            if (runnableC1906640ziQ.LLILLL) {
                runnableC1906640ziQ.LLILLL = false;
                Looper.myQueue().removeIdleHandler(runnableC1906640ziQ);
            }
            runnableC1906640ziQ.LLILLJJLI.run();
        }
    }

    public final void LIZIZ(AbstractRunnableC21499319Bv abstractRunnableC21499319Bv) {
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("postAsync submit ");
        sbLIZ.append(abstractRunnableC21499319Bv.toString());
        c21494919Ad.LIZIZ("NavigationMessageQueue", C2188811AlT.LIZIZ(sbLIZ));
        C12WP.LIZ();
        LIZ();
        this.LIZIZ.add(abstractRunnableC21499319Bv);
        C786410Ut5.LJJZZIII(this.LIZ, this.LJFF);
    }

    public final void LIZJ(AbstractRunnableC21499319Bv abstractRunnableC21499319Bv) {
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("postAsyncAtHead submit ");
        sbLIZ.append(abstractRunnableC21499319Bv.toString());
        c21494919Ad.LIZIZ("NavigationMessageQueue", C2188811AlT.LIZIZ(sbLIZ));
        LIZ();
        this.LIZIZ.add(0, abstractRunnableC21499319Bv);
        C786410Ut5.LJJZZIII(this.LIZ, this.LJFF);
    }

    public final void LIZLLL(Runnable runnable) {
        C21494919Ad.LIZIZ.LIZIZ("NavigationMessageQueue", "postSync start");
        C12WP.LIZ();
        if (!this.LIZJ) {
            this.LIZJ = true;
            try {
                LIZ();
                while (true) {
                    AbstractRunnableC21499319Bv abstractRunnableC21499319BvPoll = this.LIZIZ.poll();
                    if (abstractRunnableC21499319BvPoll == null) {
                        this.LIZ.removeCallbacks(this.LJFF);
                        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("postSync run current task start ");
                        sbLIZ.append(runnable.toString());
                        c21494919Ad.LIZIZ("NavigationMessageQueue", C2188811AlT.LIZIZ(sbLIZ));
                        runnable.run();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("postSync run current task finish ");
                        sbLIZ2.append(runnable.toString());
                        c21494919Ad.LIZIZ("NavigationMessageQueue", C2188811AlT.LIZIZ(sbLIZ2));
                        this.LIZJ = false;
                        c21494919Ad.LIZIZ("NavigationMessageQueue", "postSync finish");
                        return;
                    }
                    C21494919Ad c21494919Ad2 = C21494919Ad.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("postSync run previous pending task start ");
                    sbLIZ3.append(abstractRunnableC21499319BvPoll.toString());
                    c21494919Ad2.LIZIZ("NavigationMessageQueue", C2188811AlT.LIZIZ(sbLIZ3));
                    abstractRunnableC21499319BvPoll.run();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("postSync run previous pending task finish ");
                    sbLIZ4.append(abstractRunnableC21499319BvPoll.toString());
                    c21494919Ad2.LIZIZ("NavigationMessageQueue", C2188811AlT.LIZIZ(sbLIZ4));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZJ = false;
                throw th;
            }
        } else {
            throw new C214826195k("Can't execute postSync nested.");
        }
    }

    public final void LJ(AbstractRunnableC21499319Bv abstractRunnableC21499319Bv) {
        C21494919Ad c21494919Ad = C21494919Ad.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("postUrgentAtHead submit ");
        sbLIZ.append(abstractRunnableC21499319Bv.toString());
        c21494919Ad.LIZIZ("NavigationMessageQueue", C2188811AlT.LIZIZ(sbLIZ));
        LIZ();
        this.LIZIZ.add(0, abstractRunnableC21499319Bv);
        C786410Ut5.LJL(this.LIZ, this.LJFF);
    }
}
