package Y;

import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;

/* JADX INFO: loaded from: classes13.dex */
public class AgS84S0110000_12 implements InterfaceC346701Wf {
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

    public AgS84S0110000_12(InterfaceC346701Wf interfaceC346701Wf, boolean z, int i) {
        this.$t = i;
        this.l0 = interfaceC346701Wf;
        this.z1 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS84S0110000_12 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C775990UcH
            if (r0 == 0) goto L50
            r5 = r8
            X.0UcH r5 = (X.C775990UcH) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L56
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r1 = r7
            com.bytedance.android.live.broadcast.stablemode.ModuleDecision r1 = (com.bytedance.android.live.broadcast.stablemode.ModuleDecision) r1
            boolean r0 = r6.z1
            if (r0 != 0) goto L45
            com.bytedance.android.live.broadcast.stablemode.DowngradeInfo r0 = r1.LIZ
            if (r0 == 0) goto L4e
            java.lang.String r1 = r0.changeType
        L39:
            X.0Uc7 r0 = X.EnumC775890Uc7.CHANGE
            java.lang.String r0 = r0.getChangeTypeName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
        L45:
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L4e:
            r1 = 0
            goto L39
        L50:
            X.0UcH r5 = new X.0UcH
            r5.<init>(r6, r8)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS84S0110000_12.emit$0(Y.AgS84S0110000_12, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS84S0110000_12 r6, java.lang.Object r7, X.InterfaceC1364105Vn r8) {
        /*
            boolean r0 = r8 instanceof X.C775960UcE
            if (r0 == 0) goto L50
            r5 = r8
            X.0UcE r5 = (X.C775960UcE) r5
            int r2 = r5.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r5.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLJJLI
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 != r3) goto L56
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r2 = r6.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            r1 = r7
            com.bytedance.android.live.broadcast.stablemode.ModuleDecision r1 = (com.bytedance.android.live.broadcast.stablemode.ModuleDecision) r1
            boolean r0 = r6.z1
            if (r0 != 0) goto L45
            com.bytedance.android.live.broadcast.stablemode.DowngradeInfo r0 = r1.LIZ
            if (r0 == 0) goto L4e
            java.lang.String r1 = r0.changeType
        L39:
            X.0Uc7 r0 = X.EnumC775890Uc7.CHANGE
            java.lang.String r0 = r0.getChangeTypeName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L22
        L45:
            r5.LLILLJJLI = r3
            java.lang.Object r0 = r2.emit(r7, r5)
            if (r0 != r4) goto L22
            return r4
        L4e:
            r1 = 0
            goto L39
        L50:
            X.0UcE r5 = new X.0UcE
            r5.<init>(r6, r8)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS84S0110000_12.emit$1(Y.AgS84S0110000_12, java.lang.Object, X.05Vn):java.lang.Object");
    }
}
