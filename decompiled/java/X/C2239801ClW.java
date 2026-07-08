package X;

import java.util.LinkedList;
import kotlin.jvm.internal.AwS648S0100000_34;

/* JADX INFO: renamed from: X.1ClW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239801ClW extends AbstractRunnableC2239851Clb {
    public final C2239741ClQ LLILLL;
    public final int LLILZ;
    public final LinkedList<C2239801ClW> LLILZIL;
    public boolean LLILZLL;

    public final void LIZ() {
        if (!this.LLILLL.LJI.contains(Integer.valueOf(this.LLILZ)) || this.LLILZLL) {
            this.LLILLL.LJI.add(Integer.valueOf(this.LLILZ));
            if (this.LLILZLL) {
                C1EE2.LIZIZ.LJJJJZ("homepage_hot", this.LLILLL.LIZ, this.LLILZ, new AwS648S0100000_34(this, 5));
                return;
            }
            C1EE2 c1ee2 = C1EE2.LIZIZ;
            C844470XAv.LIZ.getClass();
            c1ee2.LJJIIZ("homepage_hot", C844470XAv.LIZ(), this.LLILLL.LIZ, this.LLILZ, EnumC1334360kpO.MEDIUM, null, new AwS648S0100000_34(this, 6));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PhotoSplitLoadStrategy$PhotoPreloadTask@8d56.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoSplitLoadStrategy$PhotoPreloadTask@8d56.run");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadTask[priority: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", indexInList: ");
        sbLIZ.append(this.LLILLL.LIZIZ);
        sbLIZ.append(", preloadIndex: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", failCount: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", toBitmap: ");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2239801ClW(C2239741ClQ c2239741ClQ, int i, LinkedList<C2239801ClW> linkedList) {
        this.LLILLL = c2239741ClQ;
        this.LLILZ = i;
        this.LLILZIL = linkedList;
    }
}
