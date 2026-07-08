package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rFT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581170rFT implements InterfaceC1891350zJl {
    public final Aweme LL;
    public final boolean LLILLJJLI;
    public final long LLILLL;
    public final int LLILZ;
    public final LogPbBean LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1581170rFT)) {
            return false;
        }
        C1581170rFT c1581170rFT = (C1581170rFT) obj;
        return Intrinsics.LJFF(this.LL, c1581170rFT.LL) && this.LLILLJJLI == c1581170rFT.LLILLJJLI && this.LLILLL == c1581170rFT.LLILLL && this.LLILZ == c1581170rFT.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1581170rFT.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + this.LLILZ) * 31;
        LogPbBean logPbBean = this.LLILZIL;
        return iHashCode + (logPbBean == null ? 0 : logPbBean.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchoolPostItem(aweme=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", userDigged=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", time=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", logPbBean=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0040 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f A[PHI: r2
      0x004f: PHI (r2v1 boolean) = (r2v0 boolean), (r2v3 boolean), (r2v3 boolean), (r2v3 boolean), (r2v3 boolean) binds: [B:30:0x004c, B:13:0x001d, B:15:0x0023, B:17:0x0029, B:22:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0054 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    @Override // X.InterfaceC1891350zJl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areContentsTheSame(X.InterfaceC1891350zJl r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1581170rFT
            r3 = 0
            if (r0 == 0) goto L51
            X.0rFT r7 = (X.C1581170rFT) r7
            if (r7 == 0) goto L52
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.LL
        Lb:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r5 = 1
            if (r0 == 0) goto L4b
            boolean r1 = r7.LLILLJJLI
            boolean r0 = r6.LLILLJJLI
            if (r1 != r0) goto L4b
            r2 = 1
        L1b:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r7.LL
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r1 = r0.getPlayAddr()
            if (r1 == 0) goto L4f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LL
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L37
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r3 = r0.getPlayAddr()
        L37:
            boolean r0 = r1.equals(r3)
            if (r0 != r5) goto L4f
            r0 = 1
        L3e:
            if (r2 == 0) goto L54
            if (r0 == 0) goto L54
            long r3 = r6.LLILLL
            long r1 = r7.LLILLL
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L54
            return r5
        L4b:
            r2 = 0
            if (r7 == 0) goto L4f
            goto L1b
        L4f:
            r0 = 0
            goto L3e
        L51:
            r7 = r3
        L52:
            r1 = r3
            goto Lb
        L54:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1581170rFT.areContentsTheSame(X.0zJl):boolean");
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1581170rFT c1581170rFT;
        Aweme aweme;
        String aid = null;
        if (interfaceC1891350zJl instanceof C1581170rFT) {
            c1581170rFT = (C1581170rFT) interfaceC1891350zJl;
        } else {
            c1581170rFT = null;
        }
        String aid2 = this.LL.getAid();
        if (c1581170rFT != null && (aweme = c1581170rFT.LL) != null) {
            aid = aweme.getAid();
        }
        if (Intrinsics.LJFF(aid2, aid) && this.LLILLL == c1581170rFT.LLILLL) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1581170rFT) && ((C1581170rFT) interfaceC1891350zJl).LLILLJJLI != this.LLILLJJLI) {
            return new Object() { // from class: X.0rFU
            };
        }
        return null;
    }

    public C1581170rFT(Aweme aweme, boolean z, long j, int i, LogPbBean logPbBean) {
        this.LL = aweme;
        this.LLILLJJLI = z;
        this.LLILLL = j;
        this.LLILZ = i;
        this.LLILZIL = logPbBean;
    }
}
