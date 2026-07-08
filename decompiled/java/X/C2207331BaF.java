package X;

/* JADX INFO: renamed from: X.1BaF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2207331BaF implements Comparable {
    public final EnumC2207531BaZ LL;
    public EnumC2207601Bag LLILLJJLI;
    public long LLILLL;
    public C1ET4 LLILZ;
    public C2207411BaN LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public EnumC2207371BaJ LLIZLLLIL;
    public EnumC19848712lJ LLJ;
    public final long LLJI;
    public EnumC2207381BaK LLJIJIL;
    public C2207421BaO LLJILJIL;
    public long LLJILJILJ;
    public CallableC2207361BaI LLJILLL;
    public C2207301BaC LLJJ;
    public C2207451BaR LLJJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Request{type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", level=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", timeout=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", tid=");
        sbLIZ.append(0);
        sbLIZ.append(", priority=");
        sbLIZ.append(0);
        sbLIZ.append(", cluster=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", timeoutStrategy=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", updateStrategy=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", info=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", commitTime=");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", task=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long LIZJ() {
        long j = this.LLILLL - (this.LLJILJILJ - this.LLJI);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("real timeout:");
        sbLIZ.append(j);
        C2188811AlT.LIZIZ(sbLIZ);
        C2207231Ba5.LIZ(3);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2207331BaF(X.EnumC2207531BaZ r3) {
        /*
            r2 = this;
            r2.<init>()
            r2.LL = r3
            int[] r1 = X.C2207541Baa.LIZ
            int r0 = r3.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L33;
                case 2: goto L33;
                case 3: goto L33;
                case 4: goto L33;
                case 5: goto L33;
                case 6: goto L33;
                case 7: goto L33;
                case 8: goto L30;
                case 9: goto L30;
                case 10: goto L30;
                case 11: goto L30;
                case 12: goto L30;
                case 13: goto L2d;
                case 14: goto L2d;
                case 15: goto L2d;
                case 16: goto L2d;
                case 17: goto L2d;
                case 18: goto L33;
                default: goto L10;
            }
        L10:
            int r0 = r3.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L28;
                case 2: goto L28;
                case 3: goto L25;
                case 4: goto L25;
                case 5: goto L25;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L22;
                case 9: goto L22;
                case 10: goto L22;
                case 11: goto L22;
                case 12: goto L22;
                case 13: goto L22;
                case 14: goto L22;
                case 15: goto L22;
                case 16: goto L22;
                case 17: goto L22;
                default: goto L19;
            }
        L19:
            long r0 = java.lang.System.currentTimeMillis()
            r2.LLJILJILJ = r0
            r2.LLJI = r0
            return
        L22:
            X.1BaJ r0 = X.EnumC2207371BaJ.USE_OURS
            goto L2a
        L25:
            X.1BaJ r0 = X.EnumC2207371BaJ.USER_CANCEL
            goto L2a
        L28:
            X.1BaJ r0 = X.EnumC2207371BaJ.ONE_TIME
        L2a:
            r2.LLIZLLLIL = r0
            goto L19
        L2d:
            X.1BaK r0 = X.EnumC2207381BaK.LAGER
            goto L35
        L30:
            X.1BaK r0 = X.EnumC2207381BaK.SMALL
            goto L35
        L33:
            X.1BaK r0 = X.EnumC2207381BaK.FIFO
        L35:
            r2.LLJIJIL = r0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2207331BaF.<init>(X.1BaZ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ab  */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            X.1BaF r8 = (X.C2207331BaF) r8
            int[] r1 = X.C2207541Baa.LIZIZ
            X.1BaK r0 = r8.LLJIJIL
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r5 = 3
            r6 = 0
            r0 = 1
            if (r1 == r0) goto L6f
            r0 = 2
            if (r1 == r0) goto L44
            if (r1 == r5) goto L36
            r0 = 4
            if (r1 == r0) goto L2b
            r0 = 5
            X.C2207231Ba5.LIZ(r0)
            long r1 = r7.LLJI
            long r3 = r8.LLJI
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto Lab
            if (r0 != 0) goto La8
        L27:
            X.C2207231Ba5.LIZ(r5)
            return r6
        L2b:
            long r1 = r7.LLJI
            long r3 = r8.LLJI
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto Lab
            if (r0 != 0) goto La8
            goto L27
        L36:
            long r3 = r7.LLJI
            long r1 = r8.LLJI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L40
            r6 = 1
            goto L27
        L40:
            if (r0 == 0) goto La8
            r6 = -1
            goto L27
        L44:
            X.1Bag r0 = r7.LLILLJJLI
            int r1 = r0.ordinal()
            X.1Bag r0 = r8.LLILLJJLI
            int r0 = r0.ordinal()
            if (r1 <= r0) goto L54
            r6 = 1
            goto L27
        L54:
            X.1Bag r0 = r7.LLILLJJLI
            int r1 = r0.ordinal()
            X.1Bag r0 = r8.LLILLJJLI
            int r0 = r0.ordinal()
            if (r1 != r0) goto L6d
            long r3 = r7.LLJI
            long r1 = r8.LLJI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto Lab
            if (r0 != 0) goto La8
            goto L27
        L6d:
            r6 = -1
            goto L27
        L6f:
            X.1Bag r1 = r7.LLILLJJLI
            if (r1 == 0) goto Lb4
            X.1Bag r0 = r8.LLILLJJLI
            if (r0 == 0) goto Lb4
            int r1 = r1.ordinal()
            X.1Bag r0 = r8.LLILLJJLI
            int r0 = r0.ordinal()
            if (r1 < r0) goto Lb4
            X.1Bag r0 = r7.LLILLJJLI
            int r1 = r0.ordinal()
            X.1Bag r0 = r8.LLILLJJLI
            int r0 = r0.ordinal()
            if (r1 != r0) goto Lb1
            long r3 = r7.LLILLL
            long r1 = r8.LLILLL
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L9b
            r6 = 1
            goto L27
        L9b:
            if (r0 != 0) goto Lae
            long r3 = r7.LLJI
            long r1 = r8.LLJI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto Lab
            if (r0 != 0) goto La8
            goto L27
        La8:
            r6 = -1
            goto L27
        Lab:
            r6 = 1
            goto L27
        Lae:
            r6 = -1
            goto L27
        Lb1:
            r6 = -1
            goto L27
        Lb4:
            r6 = 1
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2207331BaF.compareTo(java.lang.Object):int");
    }
}
