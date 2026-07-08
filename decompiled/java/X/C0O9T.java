package X;

/* JADX INFO: renamed from: X.0O9T, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O9T implements InterfaceC613740O5k<C0O9V> {
    public final int LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O9T)) {
            return false;
        }
        C0O9T c0o9t = (C0O9T) obj;
        return this.LIZ == c0o9t.LIZ && this.LIZIZ == c0o9t.LIZIZ && this.LIZJ == c0o9t.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GetPickVideoListQuery(videoType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", count=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC613730O5j
    public final C613690O5f LIZ() {
        return C613700O5g.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    @Override // X.InterfaceC613730O5j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C0O8O r11, X.InterfaceC1364105Vn<? super X.C0O9V> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C0O9U
            if (r0 == 0) goto L48
            r9 = r12
            X.0O9U r9 = (X.C0O9U) r9
            int r2 = r9.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L48
            int r2 = r2 - r1
            r9.LLILLL = r2
        L12:
            java.lang.Object r1 = r9.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L4e
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.aweme.music.model.FanSpotlightPickVideoResponse r1 = (com.ss.android.ugc.aweme.music.model.FanSpotlightPickVideoResponse) r1
            X.0O9V r0 = new X.0O9V
            r0.<init>(r1)
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            X.0O3U r1 = X.C0O7F.LIZLLL(r11)
            java.lang.Class<X.0O9Z> r0 = X.C0O9Z.class
            java.lang.Object r4 = r1.create(r0)
            X.0O9Z r4 = (X.C0O9Z) r4
            int r5 = r10.LIZ
            long r6 = r10.LIZIZ
            int r8 = r10.LIZJ
            r9.LLILLL = r2
            java.lang.Object r1 = r4.LIZJ(r5, r6, r8, r9)
            if (r1 != r3) goto L22
            return r3
        L48:
            X.0O9U r9 = new X.0O9U
            r9.<init>(r10, r12)
            goto L12
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0O9T.LIZIZ(X.0O8O, X.05Vn):java.lang.Object");
    }

    public C0O9T(int i, long j, int i2) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = i2;
    }
}
