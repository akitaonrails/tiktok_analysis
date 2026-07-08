package X;

import X.C05YF;
import java.util.UUID;
import kotlin.jvm.internal.AwS181S0101000_25;

/* JADX INFO: renamed from: X.0tQP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1664830tQP<API_COMPONENT extends C05YF, STATE, ACTION> extends AbstractC1664470tPp<API_COMPONENT, STATE, ACTION> {
    public static final int LLILZIL = 8;
    public final C19A3 LLILLL;
    public final String LLILZ;

    public abstract void v3(STATE state, ACTION action, InterfaceC1680500tpg interfaceC1680500tpg, int i);

    public AbstractC1664830tQP(C19A3 c19a3) {
        this.LLILLL = c19a3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComposeComponent#");
        sbLIZ.append(getClass().getName());
        sbLIZ.append('#');
        sbLIZ.append(UUID.randomUUID());
        this.LLILZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B3(InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1671735618);
        C05P0 c05p0LIZIZ = C1667710tV3.LIZIZ(G2(), c13zcLJIIJ, 8);
        v3(c05p0LIZIZ.getValue(), w2().invoke(), c13zcLJIIJ, 512);
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(this, i, 50);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T extends X.AbstractC1664490tPr<STATE, ACTION>> void q3(int r20, java.lang.Class<T> r21, ACTION r22, X.InterfaceC1685750ty9 r23, int r24, int r25, X.InterfaceC1680500tpg r26, int r27, int r28) {
        /*
            r19 = this;
            r9 = r25
            r8 = r24
            r7 = r23
            r0 = -938053161(0xffffffffc81671d7, float:-154055.36)
            r1 = r26
            X.13ZC r1 = r1.LJIIJ(r0)
            r11 = r28
            r0 = r11 & 8
            if (r0 == 0) goto L17
            X.0tyA r7 = X.InterfaceC1685750ty9.LIZ
        L17:
            r0 = r11 & 16
            r2 = 0
            if (r0 == 0) goto L1d
            r8 = 0
        L1d:
            r0 = r11 & 32
            if (r0 == 0) goto L22
            r9 = 0
        L22:
            r4 = r20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0 = 1157296644(0x44faf204, float:2007.563)
            r1.LJJIJIIJIL(r0)
            boolean r0 = r1.LJJIIJ(r3)
            java.lang.Object r3 = r1.LJJ()
            if (r0 != 0) goto L41
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r3 != r0) goto L4a
        L41:
            kotlin.jvm.internal.AwS37S0001000_25 r3 = new kotlin.jvm.internal.AwS37S0001000_25
            r0 = 4
            r3.<init>(r4, r0)
            r1.LJJIJIIJI(r3)
        L4a:
            r1.LJJJJL(r2)
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            r17 = 0
            r10 = r27
            int r0 = r10 >> 6
            r12 = r0 & 112(0x70, float:1.57E-43)
            r13 = 4
            r15 = r7
            r16 = r3
            r14 = r1
            X.C20084413iE.LIZ(r12, r13, r14, r15, r16, r17)
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r1.LJJIJIIJIL(r0)
            java.lang.Object r13 = r1.LJJ()
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            r5 = r21
            if (r13 != r0) goto L7d
            java.lang.Object r13 = r5.newInstance()
            X.0tPr r13 = (X.AbstractC1664490tPr) r13
            r1.LJJIJIIJI(r13)
        L7d:
            r1.LJJJJL(r2)
            X.0tPr r13 = (X.AbstractC1664490tPr) r13
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            X.0tQM r12 = new X.0tQM
            r6 = r22
            r3 = r19
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r4
            r18 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.C1680540tpk.LIZIZ(r0, r12, r1)
            X.13Ys r0 = r1.LJJJJZI()
            if (r0 == 0) goto La5
            X.0tQO r2 = new X.0tQO
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.LIZLLL = r2
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1664830tQP.q3(int, java.lang.Class, java.lang.Object, X.0ty9, int, int, X.0tpg, int, int):void");
    }
}
