package X;

/* JADX INFO: Add missing generic type declarations: [K] */
/* JADX INFO: renamed from: X.12qH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19879512qH<K> extends AbstractC19877812q0<K> {
    public final K LL;
    public int LLILLJJLI;
    public final /* synthetic */ C19878412q6 LLILLL;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // X.InterfaceC19878012q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getCount() {
        /*
            r5 = this;
            int r4 = r5.LLILLJJLI
            r3 = -1
            if (r4 == r3) goto L17
            X.12q6 r2 = r5.LLILLL
            int r0 = r2.LIZJ
            if (r4 >= r0) goto L17
            K r1 = r5.LL
            java.lang.Object[] r0 = r2.LIZ
            r0 = r0[r4]
            boolean r0 = X.C19837412jU.LIZ(r1, r0)
            if (r0 != 0) goto L21
        L17:
            X.12q6 r1 = r5.LLILLL
            K r0 = r5.LL
            int r0 = r1.LIZJ(r0)
            r5.LLILLJJLI = r0
        L21:
            int r1 = r5.LLILLJJLI
            if (r1 != r3) goto L27
            r0 = 0
            return r0
        L27:
            X.12q6 r0 = r5.LLILLL
            int[] r0 = r0.LIZIZ
            r0 = r0[r1]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19879512qH.getCount():int");
    }

    @Override // X.InterfaceC19878012q2
    public final K getElement() {
        return this.LL;
    }

    public C19879512qH(C19878412q6 c19878412q6, int i) {
        this.LLILLL = c19878412q6;
        this.LL = (K) c19878412q6.LIZ[i];
        this.LLILLJJLI = i;
    }
}
