package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340820kzo implements InterfaceC1891350zJl {
    public final int LL;
    public final String LLILLJJLI;
    public int LLILLL;
    public final C1340830kzp LLILZ;
    public final boolean LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1340820kzo)) {
            return false;
        }
        C1340820kzo c1340820kzo = (C1340820kzo) obj;
        return this.LL == c1340820kzo.LL && Intrinsics.LJFF(this.LLILLJJLI, c1340820kzo.LLILLJJLI) && this.LLILLL == c1340820kzo.LLILLL && Intrinsics.LJFF(this.LLILZ, c1340820kzo.LLILZ) && this.LLILZIL == c1340820kzo.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZ() {
        /*
            r9 = this;
            int r1 = r9.LLILLL
            r0 = 3
            if (r1 == r0) goto L4e
            r5 = 4
            if (r1 == r5) goto L4e
            int r6 = r9.LL
            X.0kzp r4 = r9.LLILZ
            int r3 = r4.LIZ
            if (r6 != r3) goto L16
            long r1 = r4.LJ
            int r0 = (int) r1
            if (r0 != r3) goto L16
        L15:
            return r5
        L16:
            if (r6 == r3) goto L4c
            java.util.List<com.ss.android.ugc.aweme.comment.model.Comment> r0 = r4.LIZIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            X.0kzp r6 = r9.LLILZ
            int r0 = r6.LIZ
            int r1 = r1 + r0
            int r8 = r9.LL
            if (r1 >= r8) goto L4c
            boolean r7 = r6.LJIIIIZZ
            if (r7 == 0) goto L38
            long r3 = (long) r8
            long r1 = r6.LJ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L4a
            boolean r0 = r6.LJIIIZ
            if (r0 == 0) goto L15
        L38:
            long r3 = (long) r8
            long r1 = r6.LJ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L4a
            if (r7 != 0) goto L15
            long r3 = (long) r8
            long r1 = r6.LJ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L15
            r5 = 2
            return r5
        L4a:
            r5 = 1
            return r5
        L4c:
            r5 = 0
            return r5
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1340820kzo.LIZ():int");
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentMoreItem(expandingCommentCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(",commentId='");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append("', buttonStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", extraData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", batchManageMode=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1340820kzo)) {
            return false;
        }
        C1340820kzo c1340820kzo = (C1340820kzo) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILLJJLI, c1340820kzo.LLILLJJLI) || this.LL != c1340820kzo.LL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1340820kzo)) {
            return false;
        }
        return Intrinsics.LJFF(this.LLILLJJLI, ((C1340820kzo) interfaceC1891350zJl).LLILLJJLI);
    }

    public static C1340820kzo LIZIZ(C1340820kzo c1340820kzo, int i, int i2, int i3) {
        String str;
        boolean z;
        int i4 = i2;
        int i5 = i;
        if ((i3 & 1) != 0) {
            i5 = c1340820kzo.LL;
        }
        C1340830kzp c1340830kzp = null;
        if ((i3 & 2) != 0) {
            str = c1340820kzo.LLILLJJLI;
        } else {
            str = null;
        }
        if ((i3 & 4) != 0) {
            i4 = c1340820kzo.LLILLL;
        }
        if ((i3 & 8) != 0) {
            c1340830kzp = c1340820kzo.LLILZ;
        }
        if ((i3 & 16) != 0) {
            z = c1340820kzo.LLILZIL;
        } else {
            z = false;
        }
        c1340820kzo.getClass();
        return new C1340820kzo(i5, str, i4, c1340830kzp, z);
    }

    public C1340820kzo(int i, String str, int i2, C1340830kzp c1340830kzp, boolean z) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = i2;
        this.LLILZ = c1340830kzp;
        this.LLILZIL = z;
    }
}
