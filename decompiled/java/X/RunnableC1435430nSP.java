package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0nSP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class RunnableC1435430nSP implements Runnable {
    public final C1404610meh LL;
    public final String LLILLJJLI;
    public C1434740nRI LLILLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PublishWatermarkScheduler$PublishTask@c68c.run");
        try {
            LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishWatermarkScheduler$PublishTask@c68c.run");
    }

    public final void LIZIZ() {
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Scheduler] PublishTask run start publishId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" queueSize=");
        sbLIZ.append(C1435440nSQ.LIZIZ.size());
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
        C1435440nSQ c1435440nSQ = C1435440nSQ.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Detached Watermark Task start: ");
        sbLIZ2.append(this.LLILLJJLI);
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ2));
        C1435440nSQ.LIZLLL = this;
        C1434740nRI c1434740nRI = new C1434740nRI(this.LL, new C1434310nQb(), C1435440nSQ.LIZJ);
        this.LLILLL = c1434740nRI;
        try {
            c1434740nRI.LJIIZILJ(new AbstractC1433570nPP() { // from class: X.0nST
                @Override // X.AbstractC1433570nPP
                public final void onProgress(int i, Object obj) {
                    C1435440nSQ c1435440nSQ2 = C1435440nSQ.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("progress: ");
                    sbLIZ3.append(i);
                    sbLIZ3.append(" publishId=");
                    sbLIZ3.append(this.LIZ.LLILLJJLI);
                    C2188811AlT.LIZIZ(sbLIZ3);
                }

                @Override // X.AbstractC1433570nPP
                public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
                    boolean z = abstractC1433460nPE instanceof C492390JSr;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[Scheduler] PublishTask onFinish publishId=");
                    sbLIZ3.append(this.LIZ.LLILLJJLI);
                    sbLIZ3.append(" success=");
                    sbLIZ3.append(z);
                    C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ3));
                    C1435440nSQ c1435440nSQ2 = C1435440nSQ.LIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Detached Watermark Task finish: ");
                    sbLIZ4.append(this.LIZ.LLILLJJLI);
                    sbLIZ4.append(" success=");
                    sbLIZ4.append(z);
                    C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ4));
                    if (C1435440nSQ.LIZLLL == this.LIZ) {
                        C1435440nSQ.LIZLLL = null;
                    }
                }

                @Override // X.AbstractC1433570nPP
                public final void onStageUpdate(String str, AbstractC1433380nP6 abstractC1433380nP6, Object obj) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[Scheduler] PublishTask onStageUpdate publishId=");
                    sbLIZ3.append(this.LIZ.LLILLJJLI);
                    sbLIZ3.append(" stage=");
                    sbLIZ3.append(str);
                    sbLIZ3.append(" state=");
                    sbLIZ3.append(abstractC1433380nP6);
                    C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ3));
                }
            });
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[Scheduler] PublishTask run FAILED publishId=");
            sbLIZ3.append(this.LLILLJJLI);
            sbLIZ3.append(" error=");
            sbLIZ3.append(thM5exceptionOrNullimpl.getMessage());
            C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ3));
            C1435440nSQ c1435440nSQ2 = C1435440nSQ.LIZ;
            C201955140j.LJI("DetachWaterMark", thM5exceptionOrNullimpl);
            C1AF0.LJ(thM5exceptionOrNullimpl);
            if (C1435440nSQ.LIZLLL == this) {
                C1435440nSQ.LIZLLL = null;
            }
        }
    }

    public final void LIZ(String str) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Scheduler] PublishTask cancel publishId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" cause=");
        sbLIZ.append(str);
        sbLIZ.append(" hasPublisher=");
        if (this.LLILLL != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
        C1434740nRI c1434740nRI = this.LLILLL;
        if (c1434740nRI != null) {
            c1434740nRI.LJIILL(new C1433230nOr(str, null, 6));
        }
    }

    public RunnableC1435430nSP(C1404610meh c1404610meh, String str) {
        this.LL = c1404610meh;
        this.LLILLJJLI = str;
    }
}
