package Y;

import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;

/* JADX INFO: loaded from: classes15.dex */
public class AgS85S0110000_14 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS85S0110000_14(InterfaceC346701Wf interfaceC346701Wf, boolean z, int i) {
        this.$t = i;
        this.l0 = interfaceC346701Wf;
        this.z1 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS85S0110000_14 r8, java.lang.Object r9, X.InterfaceC1364105Vn r10) {
        /*
            boolean r0 = r10 instanceof X.C890880YxC
            if (r0 == 0) goto L63
            r7 = r10
            X.0YxC r7 = (X.C890880YxC) r7
            int r2 = r7.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r7.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 != r5) goto L69
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r4 = r8.l0
            X.01Wf r4 = (X.InterfaceC346701Wf) r4
            X.0Y8T r9 = (X.C0Y8T) r9
            r3 = 0
            if (r9 == 0) goto L61
            boolean r2 = X.C882340YjQ.LJ(r9)
        L35:
            boolean r0 = r8.z1
            if (r0 == 0) goto L5f
            if (r9 == 0) goto L5f
            boolean r1 = X.C879070Ye9.LJ(r9, r3)
        L3f:
            X.06QI r0 = com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature.LIZ
            com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature r0 = r0.LIZ()
            if (r0 == 0) goto L52
            boolean r0 = r0.LIZLLL()
            if (r0 != r5) goto L52
            if (r2 != 0) goto L52
            if (r1 != 0) goto L52
            r3 = 1
        L52:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r7.LLILLJJLI = r5
            java.lang.Object r0 = r4.emit(r0, r7)
            if (r0 != r6) goto L22
            return r6
        L5f:
            r1 = 0
            goto L3f
        L61:
            r2 = 0
            goto L35
        L63:
            X.0YxC r7 = new X.0YxC
            r7.<init>(r8, r10)
            goto L12
        L69:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS85S0110000_14.emit$0(Y.AgS85S0110000_14, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS85S0110000_14 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C0Z1F
            if (r0 == 0) goto L51
            r6 = r9
            X.0Z1F r6 = (X.C0Z1F) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L25
            if (r0 != r4) goto L57
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            X.0Y8T r8 = (X.C0Y8T) r8
            boolean r2 = X.C904330Zdn.LIZ(r8)
            boolean r0 = r7.z1
            r1 = 0
            if (r0 == 0) goto L4f
            if (r8 == 0) goto L4f
            boolean r0 = X.C879070Ye9.LJ(r8, r1)
        L3d:
            if (r2 == 0) goto L42
            if (r0 != 0) goto L42
            r1 = 1
        L42:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.LLILLJJLI = r4
            java.lang.Object r0 = r3.emit(r0, r6)
            if (r0 != r5) goto L22
            return r5
        L4f:
            r0 = 0
            goto L3d
        L51:
            X.0Z1F r6 = new X.0Z1F
            r6.<init>(r7, r9)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS85S0110000_14.emit$1(Y.AgS85S0110000_14, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
