package X;

import X.InterfaceC551900Lki;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.AIGCWorkflowNodeConfig;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LmJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552890LmJ<CTX extends InterfaceC551900Lki<CFG>, CFG extends Serializable, IN, OUT> {
    public final String LIZ;
    public final CFG LIZIZ;
    public final AIGCWorkflowNodeConfig LIZJ;
    public final InterfaceC552790Lm9<CTX, CFG, IN, OUT> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C552890LmJ)) {
            return false;
        }
        C552890LmJ c552890LmJ = (C552890LmJ) obj;
        return Intrinsics.LJFF(this.LIZ, c552890LmJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c552890LmJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c552890LmJ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c552890LmJ.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        CFG cfg = this.LIZIZ;
        return ((((iHashCode + (cfg == null ? 0 : cfg.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowNodeSpec(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", config=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nodeConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", node=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C552890LmJ(String str, CFG cfg, AIGCWorkflowNodeConfig aIGCWorkflowNodeConfig, InterfaceC552790Lm9<CTX, CFG, IN, OUT> interfaceC552790Lm9) {
        this.LIZ = str;
        this.LIZIZ = cfg;
        this.LIZJ = aIGCWorkflowNodeConfig;
        this.LIZLLL = interfaceC552790Lm9;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et> r9, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> r10, X.InterfaceC551900Lki<CFG> r11, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, ? extends X.InterfaceC1406105et>> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C552950LmP
            if (r0 == 0) goto L28
            r4 = r12
            X.0LmP r4 = (X.C552950LmP) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r7 = r4.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r3 = 3
            r2 = 2
            r5 = 1
            if (r0 == 0) goto L42
            if (r0 == r5) goto L3d
            if (r0 == r2) goto L3a
            if (r0 != r3) goto L32
            kotlin.jvm.functions.Function1 r10 = r4.LL
            goto L2e
        L28:
            X.0LmP r4 = new X.0LmP
            r4.<init>(r8, r12)
            goto L12
        L2e:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L87
            return r7
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L3a:
            kotlin.jvm.functions.Function1 r10 = r4.LL
            goto L72
        L3d:
            X.0Lki r11 = r4.LLILLJJLI
            kotlin.jvm.functions.Function1 r10 = r4.LL
            goto L5f
        L42:
            X.C155000ia.LIZIZ(r7)
            if (r11 != 0) goto L4c
            X.0LmN r11 = new X.0LmN
            r11.<init>(r8, r10)
        L4c:
            X.0Lm9<CTX extends X.0Lki<CFG>, CFG extends java.io.Serializable, IN, OUT> r0 = r8.LIZLLL     // Catch: java.lang.Throwable -> L87
            X.0Lje r0 = r0.LIZ()     // Catch: java.lang.Throwable -> L87
            r4.LL = r10     // Catch: java.lang.Throwable -> L87
            r4.LLILLJJLI = r11     // Catch: java.lang.Throwable -> L87
            r4.LLILZIL = r5     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = r0.LIZ(r9, r4)     // Catch: java.lang.Throwable -> L87
            if (r7 != r6) goto L62
            return r6
        L5f:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L87
        L62:
            X.0Lm9<CTX extends X.0Lki<CFG>, CFG extends java.io.Serializable, IN, OUT> r1 = r8.LIZLLL     // Catch: java.lang.Throwable -> L87
            r4.LL = r10     // Catch: java.lang.Throwable -> L87
            r0 = 0
            r4.LLILLJJLI = r0     // Catch: java.lang.Throwable -> L87
            r4.LLILZIL = r2     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = r1.LIZIZ(r11, r7, r4)     // Catch: java.lang.Throwable -> L87
            if (r7 != r6) goto L75
            return r6
        L72:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L87
        L75:
            X.0Lm9<CTX extends X.0Lki<CFG>, CFG extends java.io.Serializable, IN, OUT> r0 = r8.LIZLLL     // Catch: java.lang.Throwable -> L87
            X.0LmH r0 = r0.LJ()     // Catch: java.lang.Throwable -> L87
            r4.LL = r10     // Catch: java.lang.Throwable -> L87
            r4.LLILZIL = r3     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = r0.LIZ(r7, r4)     // Catch: java.lang.Throwable -> L87
            if (r7 != r6) goto L86
            return r6
        L86:
            return r7
        L87:
            r4 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            kotlin.Pair[] r3 = new kotlin.Pair[r2]
            java.lang.String r2 = r4.getMessage()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "error"
            r1.<init>(r0, r2)
            r0 = 0
            r3[r0] = r1
            X.0Lm9<CTX extends X.0Lki<CFG>, CFG extends java.io.Serializable, IN, OUT> r0 = r8.LIZLLL
            java.lang.String r2 = r0.getNodeName()
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "node"
            r1.<init>(r0, r2)
            r3[r5] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
            r10.invoke(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C552890LmJ.LIZ(java.util.Map, kotlin.jvm.functions.Function1, X.0Lki, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(java.util.Map r9, kotlin.jvm.internal.AwS587S0100000_8 r10, X.C555540Lqa r11, X.InterfaceC1364105Vn r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C552910LmL
            if (r0 == 0) goto L74
            r5 = r12
            X.0LmL r5 = (X.C552910LmL) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r7 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r4 = 3
            r3 = 2
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L47
            if (r0 == r3) goto L5f
            if (r0 != r4) goto L7a
            X.C155000ia.LIZIZ(r7)
        L29:
            return r7
        L2a:
            X.C155000ia.LIZIZ(r7)
            if (r11 != 0) goto L34
            X.0LmN r11 = new X.0LmN
            r11.<init>(r8, r10)
        L34:
            X.0Lm9<CTX extends X.0Lki<CFG>, CFG extends java.io.Serializable, IN, OUT> r0 = r8.LIZLLL
            X.0Lje r0 = r0.LIZ()
            r5.LL = r9
            r5.LLILLJJLI = r11
            r5.LLILZIL = r2
            java.lang.Object r7 = r0.LIZ(r9, r5)
            if (r7 != r6) goto L50
            return r6
        L47:
            X.0Lki r11 = r5.LLILLJJLI
            java.lang.Object r9 = r5.LL
            java.util.Map r9 = (java.util.Map) r9
            X.C155000ia.LIZIZ(r7)
        L50:
            X.0Lm9<CTX extends X.0Lki<CFG>, CFG extends java.io.Serializable, IN, OUT> r0 = r8.LIZLLL
            r5.LL = r1
            r5.LLILLJJLI = r1
            r5.LLILZIL = r3
            java.lang.Object r7 = r0.LIZJ(r11, r7, r9, r5)
            if (r7 != r6) goto L62
            return r6
        L5f:
            X.C155000ia.LIZIZ(r7)
        L62:
            if (r7 != 0) goto L65
            return r1
        L65:
            X.0Lm9<CTX extends X.0Lki<CFG>, CFG extends java.io.Serializable, IN, OUT> r0 = r8.LIZLLL
            X.0LmH r0 = r0.LJ()
            r5.LLILZIL = r4
            java.lang.Object r7 = r0.LIZ(r7, r5)
            if (r7 != r6) goto L29
            return r6
        L74:
            X.0LmL r5 = new X.0LmL
            r5.<init>(r8, r12)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C552890LmJ.LIZIZ(java.util.Map, kotlin.jvm.internal.AwS587S0100000_8, X.0Lqa, X.05Vn):java.lang.Object");
    }
}
