package X;

import android.graphics.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS124S0201000_25;

/* JADX INFO: renamed from: X.0tmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678350tmD implements InterfaceC1664980tQe<C1678290tm7, InterfaceC1461640o8g<C1678290tm7>>, InterfaceC1661910tLh {
    public final Rect LIZ = new Rect();

    @Override // X.InterfaceC1661910tLh
    public final void LIZIZ(Function1<? super Rect, Unit> function1) {
        function1.invoke(this.LIZ);
    }

    @Override // X.InterfaceC1664980tQe
    public final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1765791252);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            C1665970tSF.LIZJ((i2 << 3) & 112, 0, c13zcLJIIJ, interfaceC1685750ty9, C0MBB.LIZIZ(2131849973, c13zcLJIIJ));
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, interfaceC1685750ty9, i, 106);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // X.InterfaceC1664980tQe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.InterfaceC1461640o8g<X.C1678290tm7> r15, X.InterfaceC1685750ty9 r16, X.InterfaceC1680500tpg r17, int r18) {
        /*
            r14 = this;
            r0 = 1238476(0x12e5cc, float:1.735475E-39)
            r1 = r17
            X.13ZC r6 = r1.LJIIJ(r0)
            r12 = r18
            r0 = r12 & 48
            r11 = r16
            if (r0 != 0) goto L85
            boolean r0 = r6.LJJIIJ(r11)
            if (r0 == 0) goto L82
            r1 = 32
        L19:
            r1 = r1 | r12
        L1a:
            r0 = r12 & 384(0x180, float:5.38E-43)
            r9 = r14
            if (r0 != 0) goto L28
            boolean r0 = r6.LJII(r9)
            if (r0 == 0) goto L7f
            r0 = 256(0x100, float:3.59E-43)
        L27:
            r1 = r1 | r0
        L28:
            r1 = r1 & 145(0x91, float:2.03E-43)
            r0 = 144(0x90, float:2.02E-43)
            if (r1 != r0) goto L48
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L48
            r6.LIZJ()
        L37:
            X.13Ys r0 = r6.LJJJJZI()
            if (r0 == 0) goto L47
            kotlin.jvm.internal.AwS62S0301000_25 r8 = new kotlin.jvm.internal.AwS62S0301000_25
            r13 = 43
            r10 = r15
            r8.<init>(r9, r10, r11, r12, r13)
            r0.LIZLLL = r8
        L47:
            return
        L48:
            X.0tWw r2 = X.C1669660tYC.LJLLJ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r6.LJJIIJZLJL(r0)
            boolean r0 = r6.LJII(r9)
            java.lang.Object r1 = r6.LJJ()
            if (r0 != 0) goto L63
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L6d
        L63:
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 902(0x386, float:1.264E-42)
            r1.<init>(r9, r0)
            r6.LJJIJIIJI(r1)
        L6d:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r5 = 0
            r6.LJJJJL(r5)
            X.0ty9 r3 = X.C1685330txT.LIZ(r11, r1)
            r4 = 0
            r8 = 12
            r7 = r5
            X.C1665970tSF.LIZ(r2, r3, r4, r5, r6, r7, r8)
            goto L37
        L7f:
            r0 = 128(0x80, float:1.8E-43)
            goto L27
        L82:
            r1 = 16
            goto L19
        L85:
            r1 = r12
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1678350tmD.LIZJ(X.0o8g, X.0ty9, X.0tpg, int):void");
    }
}
