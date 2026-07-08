package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462420IBk implements InterfaceC461380I7k {
    public final Long LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final C0IB0 LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C462420IBk)) {
            return false;
        }
        C462420IBk c462420IBk = (C462420IBk) obj;
        return Intrinsics.LJFF(this.LL, c462420IBk.LL) && this.LLILLJJLI == c462420IBk.LLILLJJLI && this.LLILLL == c462420IBk.LLILLL && Intrinsics.LJFF(this.LLILZ, c462420IBk.LLILZ);
    }

    public final int hashCode() {
        Long l = this.LL;
        return ((((((l == null ? 0 : l.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGroupShotCardData(indexOfTaskId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAddingPhotoLoadingState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isHideCard=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", skeletonLayoutData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C461450I7r.LIZ(this, interfaceC1891350zJl);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    @Override // X.InterfaceC1891350zJl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getChangePayload(X.InterfaceC1891350zJl r7) {
        /*
            r6 = this;
            X.0I7z r5 = X.C461450I7r.LIZIZ(r6, r7)
            r4 = 0
            if (r5 != 0) goto L8
            return r4
        L8:
            boolean r0 = r7 instanceof X.C462420IBk
            if (r0 == 0) goto L58
            X.0IB0 r0 = r6.LLILZ
            X.06XP r0 = r0.LIZ
            X.0Y9l r0 = r0.LIZ
            okio.ByteString r1 = r0.getContentPB()
            r0 = r7
            X.0I7k r0 = (X.InterfaceC461380I7k) r0
            X.0Y9l r0 = X.C0I6Y.LIZ(r0)
            okio.ByteString r0 = r0.getContentPB()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L52
            boolean r1 = r6.LLILLJJLI
            X.0IBk r7 = (X.C462420IBk) r7
            boolean r0 = r7.LLILLJJLI
            if (r1 != r0) goto L52
            java.lang.Long r1 = r6.LL
            java.lang.Long r0 = r7.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4c
            boolean r1 = r6.LLILLL
            boolean r0 = r7.LLILLL
            if (r1 != r0) goto L4c
            X.0IBl r1 = new X.0IBl
            r1.<init>(r2, r2)
        L46:
            r0 = 5
            X.0I7z r5 = X.C461530I7z.LIZIZ(r5, r4, r1, r0)
            return r5
        L4c:
            X.0IBl r1 = new X.0IBl
            r1.<init>(r2, r3)
            goto L46
        L52:
            X.0IBl r1 = new X.0IBl
            r1.<init>(r3, r2)
            goto L46
        L58:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C462420IBk.getChangePayload(X.0zJl):java.lang.Object");
    }

    public C462420IBk(Long l, boolean z, boolean z2, C0IB0 c0ib0) {
        this.LL = l;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = c0ib0;
    }
}
