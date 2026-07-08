package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C613250O3n implements InterfaceC613720O5i<C613230O3l> {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C613250O3n) && Intrinsics.LJFF(this.LIZ, ((C613250O3n) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollectBookMutation(bookId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return new C613690O5f(3, 3000L, true);
    }

    public C613250O3n(String str) {
        this.LIZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r6, X.InterfaceC1364105Vn<? super X.C613230O3l> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C613260O3o
            if (r0 == 0) goto L44
            r4 = r7
            X.0O3o r4 = (X.C613260O3o) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L44
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L4a
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.base.api.BaseResponse r1 = (com.ss.android.ugc.aweme.base.api.BaseResponse) r1
            X.0O3l r0 = new X.0O3l
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r6)
            java.lang.Class<com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailApi> r0 = com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailApi.class
            java.lang.Object r1 = r1.create(r0)
            com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailApi r1 = (com.ss.android.ugc.aweme.topic.book.detail.api.BookDetailApi) r1
            java.lang.String r0 = r5.LIZ
            r4.LLILLL = r2
            java.lang.Object r1 = r1.collectBook(r0, r4)
            if (r1 != r3) goto L22
            return r3
        L44:
            X.0O3o r4 = new X.0O3o
            r4.<init>(r5, r7)
            goto L12
        L4a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C613250O3n.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }
}
