package X;

import Y.AComparatorS33S0000000_14;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AwS105S1200000_22;
import kotlin.jvm.internal.AwS129S0101000_22;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nPJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433510nPJ extends AbstractC1433570nPP {
    public volatile AbstractC1433190nOn LIZ;
    public final /* synthetic */ C1433500nPI LIZIZ;

    public C1433510nPJ(C1433500nPI c1433500nPI) {
        this.LIZIZ = c1433500nPI;
    }

    public final boolean LIZ(AbstractC1433190nOn abstractC1433190nOn, String str) {
        if ((abstractC1433190nOn instanceof C1433490nPH) || (abstractC1433190nOn instanceof C1433200nOo)) {
            return true;
        }
        C1433500nPI c1433500nPI = this.LIZIZ;
        c1433500nPI.getClass();
        if ((abstractC1433190nOn instanceof C1433210nOp) && Intrinsics.LJFF(((C1433210nOp) abstractC1433190nOn).LIZ, C1433600nPS.LIZ)) {
            return false;
        }
        C1433350nP3 c1433350nP3 = c1433500nPI.LLILZLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", require cancel, but state:");
        sbLIZ.append(abstractC1433190nOn);
        c1433350nP3.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }

    @Override // X.AbstractC1433570nPP
    public final void onProgress(final int i, final Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishParallel PublishTask(");
        sbLIZ.append(this.LIZIZ.LLILZIL.LIZIZ);
        sbLIZ.append(") onProgress ");
        sbLIZ.append(i);
        sbLIZ.append(" callbackList size ");
        sbLIZ.append(this.LIZIZ.LLIZLLLIL.size());
        C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        final C1433500nPI c1433500nPI = this.LIZIZ;
        c1433500nPI.LLILZ.execute(new Runnable() { // from class: X.0nPM
            public final void LIZ() {
                C1433510nPJ c1433510nPJ = this.LL;
                AbstractC1433190nOn abstractC1433190nOn = c1433500nPI.LLILZIL.LIZLLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("progress:");
                sbLIZ2.append(i);
                sbLIZ2.append(" on no running");
                if (c1433510nPJ.LIZ(abstractC1433190nOn, C2188811AlT.LIZIZ(sbLIZ2)) && !(c1433500nPI.LLILZIL.LIZLLL instanceof C1433200nOo)) {
                    c1433500nPI.LLILZIL.LIZ(new C1433490nPH(i, obj));
                    c1433500nPI.LIZ(new AwS129S0101000_22(i, obj, 5));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PublishTask@7c51.run$1$onProgress$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PublishTask@7c51.run$1$onProgress$1");
            }
        });
    }

    @Override // X.AbstractC1433570nPP
    public final void onFinish(final AbstractC1433460nPE abstractC1433460nPE, final Object obj, final PublishModel publishModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishParallel PublishTask(");
        sbLIZ.append(this.LIZIZ.LLILZIL.LIZIZ);
        sbLIZ.append(") onFinish ");
        sbLIZ.append(abstractC1433460nPE);
        sbLIZ.append(" callbackList size ");
        sbLIZ.append(((ArrayList) this.LIZIZ.LLIZLLLIL).size());
        C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!(abstractC1433460nPE instanceof C492390JSr) && !(abstractC1433460nPE instanceof C1433630nPV)) {
            if (abstractC1433460nPE instanceof C1433450nPD) {
                C1433500nPI c1433500nPI = this.LIZIZ;
                c1433500nPI.LLILLL.LJIIIZ(c1433500nPI.LLILZIL);
            } else if (!(abstractC1433460nPE instanceof C1433410nP9) && !this.LIZIZ.LLJIJIL) {
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("PublishTask PublishCallback  onFinish=Cancel publishid=");
                sbLIZ2.append(this.LIZIZ.LLILZIL.LIZIZ);
                C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ2));
                C1433500nPI c1433500nPI2 = this.LIZIZ;
                c1433500nPI2.LLILLL.LJIIIZ(c1433500nPI2.LLILZIL);
            } else {
                C1433500nPI c1433500nPI3 = this.LIZIZ;
                c1433500nPI3.LLILLL.LJIIIZ(c1433500nPI3.LLILZIL);
            }
        } else {
            C1433500nPI c1433500nPI4 = this.LIZIZ;
            c1433500nPI4.LLILLL.LJIIIZ(c1433500nPI4.LLILZIL);
        }
        final C1433500nPI c1433500nPI5 = this.LIZIZ;
        c1433500nPI5.LLILZ.execute(new Runnable() { // from class: X.0nPK
            public final void LIZ() {
                if (!this.LL.LIZ(c1433500nPI5.LLILZIL.LIZLLL, "finish on no running")) {
                    AbstractC1433190nOn abstractC1433190nOn = c1433500nPI5.LLILZIL.LIZLLL;
                    if ((abstractC1433190nOn instanceof C1433490nPH) || (abstractC1433190nOn instanceof C1433200nOo)) {
                        return;
                    }
                    c1433500nPI5.LIZ(new AwS231S0300000_22(abstractC1433460nPE, obj, publishModel, 38));
                    return;
                }
                C1433530nPL c1433530nPL = c1433500nPI5.LLILZIL;
                AbstractC1433460nPE abstractC1433460nPE2 = abstractC1433460nPE;
                Object obj2 = obj;
                c1433530nPL.getClass();
                c1433530nPL.LIZ(new C1433210nOp(abstractC1433460nPE2, obj2));
                c1433530nPL.LJFF = SystemClock.uptimeMillis();
                c1433530nPL.LJI = null;
                C1433660nPY c1433660nPY = c1433500nPI5.LLILLJJLI;
                synchronized (c1433660nPY) {
                    Collection<C1433530nPL> collectionValues = c1433660nPY.LJ.values();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : collectionValues) {
                        if (((C1433530nPL) obj3).LIZLLL instanceof C1433210nOp) {
                            arrayList.add(obj3);
                        }
                    }
                    Iterator it2 = C13LP.LJJJJJ(1, C13LP.LJLLLL(new AComparatorS33S0000000_14(22), arrayList)).iterator();
                    while (it2.hasNext()) {
                        c1433660nPY.LJ.remove(((C1433530nPL) it2.next()).LIZIZ);
                    }
                }
                c1433500nPI5.LIZ(new AwS231S0300000_22(abstractC1433460nPE, obj, publishModel, 39));
                ((ArrayList) c1433500nPI5.LLIZLLLIL).clear();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PublishTask@7c51.run$1$onFinish$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PublishTask@7c51.run$1$onFinish$1");
            }
        });
    }

    @Override // X.AbstractC1433570nPP
    public final void onStageUpdate(String str, AbstractC1433380nP6 abstractC1433380nP6, Object obj) {
        AbstractC1433190nOn abstractC1433190nOn = null;
        if (Intrinsics.LJFF(str, "STAGE_SYNTHETIC_PAUSE")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PublishParallel PublishTask(");
            sbLIZ.append(this.LIZIZ.LLILZIL.LIZIZ);
            sbLIZ.append(") paused");
            C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            AbstractC1433190nOn abstractC1433190nOn2 = this.LIZIZ.LLILZIL.LIZLLL;
            C1433200nOo c1433200nOo = C1433200nOo.LIZ;
            if (!Intrinsics.LJFF(abstractC1433190nOn2, c1433200nOo)) {
                abstractC1433190nOn = abstractC1433190nOn2;
            }
            this.LIZ = abstractC1433190nOn;
            this.LIZIZ.LLILZIL.LIZ(c1433200nOo);
        } else if (Intrinsics.LJFF(str, "STAGE_SYNTHETIC_RESUME")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PublishParallel PublishTask(");
            sbLIZ2.append(this.LIZIZ.LLILZIL.LIZIZ);
            sbLIZ2.append(") resumed");
            C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            C1433530nPL c1433530nPL = this.LIZIZ.LLILZIL;
            AbstractC1433190nOn c1433490nPH = this.LIZ;
            if (c1433490nPH == null) {
                c1433490nPH = new C1433490nPH(0, null);
            }
            c1433530nPL.LIZ(c1433490nPH);
            this.LIZ = null;
        }
        this.LIZIZ.LIZ(new AwS105S1200000_22(str, abstractC1433380nP6, obj, 10));
    }
}
