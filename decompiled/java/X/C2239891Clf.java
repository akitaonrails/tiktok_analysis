package X;

import kotlin.jvm.internal.AwS469S0200000_34;

/* JADX INFO: renamed from: X.1Clf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239891Clf extends AbstractRunnableC2239851Clb {
    public final C2239911Clh LLILLL;
    public final int LLILZ;
    public final /* synthetic */ C2239861Clc LLILZIL;

    public final void LIZ() {
        if (this.LLILLL.LJI.contains(Integer.valueOf(this.LLILZ))) {
            this.LLILZIL.LJIIL().remove(this);
            return;
        }
        C1EE2 c1ee2 = C1EE2.LIZIZ;
        C1499070p73 c1499070p73 = this.LLILZIL.LIZ;
        if (c1499070p73 == null) {
            c1499070p73 = null;
        }
        String str = c1499070p73.LIZIZ;
        C844470XAv.LIZ.getClass();
        c1ee2.LJJIIZ(str, C844470XAv.LIZ(), this.LLILLL.LIZ, this.LLILZ, EnumC1334360kpO.MEDIUM, null, new AwS469S0200000_34(this.LLILZIL, this, 1));
        this.LLILLL.LJI.add(Integer.valueOf(this.LLILZ));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("PhotoStrategy$PhotoPreloadTask@64b6.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoStrategy$PhotoPreloadTask@64b6.run");
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
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2239891Clf(C2239861Clc c2239861Clc, C2239911Clh c2239911Clh, int i) {
        this.LLILZIL = c2239861Clc;
        this.LLILLL = c2239911Clh;
        this.LLILZ = i;
    }
}
