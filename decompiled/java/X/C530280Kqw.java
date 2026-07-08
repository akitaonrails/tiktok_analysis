package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Kqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530280Kqw implements InterfaceC524480Kha {
    public final long LIZ = 60499;
    public final C0L9R LIZIZ;

    public C530280Kqw() {
        int i = C578540Mma.LIZ().uploadWidthThreshold + 1;
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(C540010LFv.LIZLLL(i)));
        this.LIZIZ = new C0L9R(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
    }

    @Override // X.InterfaceC524480Kha
    public final boolean LIZIZ(MediaModel mediaModel) {
        if (mediaModel.LJIILJJIL()) {
            long j = this.LIZ;
            if (j != -1 && mediaModel.duration >= j) {
                return false;
            }
        }
        if (mediaModel.LJIILJJIL() && !(!new C0L9R(mediaModel.width, mediaModel.height).isLargeOrEqualThan(this.LIZIZ, C0L9P.ANY_DIMENSION))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    @Override // X.InterfaceC524480Kha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(android.content.Context r9, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel r10) {
        /*
            r8 = this;
            boolean r0 = r10.LJIILJJIL()
            r7 = 0
            r4 = 1
            if (r0 == 0) goto L35
            long r2 = r8.LIZ
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 == 0) goto L35
            long r0 = r10.duration
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L35
            r0 = 0
        L17:
            r3 = 9003(0x232b, float:1.2616E-41)
            if (r0 != 0) goto L37
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131828259(0x7f111e23, float:1.9289454E38)
            java.lang.String r1 = r1.getString(r0)
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r0 = new com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder
            r0.<init>()
            r0.message(r1)
            r0.isTuxToastLegacy(r4)
            X.C1390380mHk.LIZJ(r9, r3, r0)
            return r4
        L35:
            r0 = 1
            goto L17
        L37:
            boolean r0 = r10.LJIILJJIL()
            if (r0 == 0) goto L6c
            X.0L9R r2 = new X.0L9R
            int r1 = r10.width
            int r0 = r10.height
            r2.<init>(r1, r0)
            X.0L9R r1 = r8.LIZIZ
            X.0L9P r0 = X.C0L9P.ANY_DIMENSION
            boolean r0 = r2.isLargeOrEqualThan(r1, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L6c
            android.content.res.Resources r1 = r9.getResources()
            r0 = 2131828262(0x7f111e26, float:1.928946E38)
            java.lang.String r1 = r1.getString(r0)
            com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder r0 = new com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder
            r0.<init>()
            r0.message(r1)
            r0.isTuxToastLegacy(r4)
            X.C1390380mHk.LIZJ(r9, r3, r0)
            return r4
        L6c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C530280Kqw.LIZ(android.content.Context, com.ss.android.ugc.aweme.mediachoose.helper.MediaModel):boolean");
    }
}
