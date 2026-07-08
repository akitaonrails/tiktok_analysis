package X;

import kotlin.jvm.internal.AwS469S0200000_34;

/* JADX INFO: renamed from: X.1ClV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239791ClV extends AbstractRunnableC2239851Clb {
    public final C2239811ClX LLILLL;
    public final int LLILZ;
    public final /* synthetic */ C2239781ClU LLILZIL;

    public final void LIZ() {
        if (this.LLILLL.LJI.contains(Integer.valueOf(this.LLILZ))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PhotoPreloadTask repeat not run ");
            sbLIZ.append(this);
            C2344809Gs.LIZLLL(6, "DetailBufferPreload", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZIL.LJIIL().remove(this);
            return;
        }
        C1EE2 c1ee2 = C1EE2.LIZIZ;
        C1499070p73 c1499070p73 = this.LLILZIL.LJIIIIZZ;
        String str = c1499070p73 != null ? c1499070p73.LIZIZ : null;
        C844470XAv.LIZ.getClass();
        c1ee2.LJJIIZ(str, C844470XAv.LIZ(), this.LLILLL.LIZ, this.LLILZ, EnumC1334360kpO.MEDIUM, null, new AwS469S0200000_34(this.LLILZIL, this, 0));
        this.LLILLL.LJI.add(Integer.valueOf(this.LLILZ));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DetailBufferPhotoStrategy$PhotoPreloadTask@8da3.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DetailBufferPhotoStrategy$PhotoPreloadTask@8da3.run");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadTask[priority: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", indexInList: ");
        sbLIZ.append(this.LLILLL.LIZIZ);
        sbLIZ.append(", preloadIndex: ");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", aid: ");
        sbLIZ.append(this.LLILLL.LIZ.getAid());
        sbLIZ.append(", failCount: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2239791ClV(C2239781ClU c2239781ClU, C2239811ClX c2239811ClX, int i) {
        this.LLILZIL = c2239781ClU;
        this.LLILLL = c2239811ClX;
        this.LLILZ = i;
    }
}
