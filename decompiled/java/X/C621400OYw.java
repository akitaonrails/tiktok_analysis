package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621400OYw implements InterfaceC111300bX {
    public final int LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final C0OJU LLILZLL;
    public final C618680OOk LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C621400OYw)) {
            return false;
        }
        C621400OYw c621400OYw = (C621400OYw) obj;
        return this.LL == c621400OYw.LL && this.LLILLJJLI == c621400OYw.LLILLJJLI && this.LLILLL == c621400OYw.LLILLL && this.LLILZ == c621400OYw.LLILZ && this.LLILZIL == c621400OYw.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c621400OYw.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c621400OYw.LLIZ);
    }

    public final int hashCode() {
        int iY2 = ((((((((this.LL * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + C786410Ut5.Y2(this.LLILZIL)) * 31;
        C0OJU c0oju = this.LLILZLL;
        int iHashCode = (iY2 + (c0oju == null ? 0 : c0oju.hashCode())) * 31;
        C618680OOk c618680OOk = this.LLIZ;
        return iHashCode + (c618680OOk != null ? c618680OOk.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPollVoteDetailCommonData(identityType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bbId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", bbItemId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pollId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", optionId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", listUpdateAbility=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", currentItem=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C621400OYw(int i, long j, long j2, long j3, long j4, C0OJU c0oju, C618680OOk c618680OOk) {
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = j3;
        this.LLILZIL = j4;
        this.LLILZLL = c0oju;
        this.LLIZ = c618680OOk;
    }
}
