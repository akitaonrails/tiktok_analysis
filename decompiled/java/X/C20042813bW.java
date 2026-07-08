package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: renamed from: X.13bW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20042813bW implements InterfaceC20041513bJ, InterfaceC20043013bY {
    public static final /* synthetic */ int LIZLLL = 0;
    public final InterfaceC20041513bJ LIZ;
    public final InterfaceC20043013bY LIZIZ;
    public final C19994113Kx<Object> LIZJ = C13X4.LIZ();

    @Override // X.InterfaceC20041513bJ
    public final boolean LIZ(Object obj) {
        return this.LIZ.LIZ(obj);
    }

    @Override // X.InterfaceC20041513bJ
    public final InterfaceC20041313bH LIZIZ(String str, Function0<? extends Object> function0) {
        return this.LIZ.LIZIZ(str, function0);
    }

    @Override // X.InterfaceC20041513bJ
    public final Object LIZJ(String str) {
        return this.LIZ.LIZJ(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    @Override // X.InterfaceC20041513bJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.util.List<java.lang.Object>> g4() {
        /*
            r15 = this;
            X.13Kx<java.lang.Object> r0 = r15.LIZJ
            java.lang.Object[] r10 = r0.LIZIZ
            long[] r9 = r0.LIZ
            int r0 = r9.length
            int r8 = r0 + (-2)
            if (r8 < 0) goto L46
            r7 = 0
        Lc:
            r2 = r9[r7]
            long r0 = ~r2
            r4 = 7
            long r0 = r0 << r4
            long r0 = r0 & r2
            r5 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r5
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 == 0) goto L41
            int r0 = r7 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r6 = 0
        L26:
            if (r6 >= r11) goto L3f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r2
            r4 = 128(0x80, double:6.3E-322)
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L3b
            int r0 = r7 << 3
            int r0 = r0 + r6
            r1 = r10[r0]
            X.13bY r0 = r15.LIZIZ
            r0.LJ(r1)
        L3b:
            long r2 = r2 >> r12
            int r6 = r6 + 1
            goto L26
        L3f:
            if (r11 != r12) goto L46
        L41:
            if (r7 == r8) goto L46
            int r7 = r7 + 1
            goto Lc
        L46:
            X.13bJ r0 = r15.LIZ
            java.util.Map r0 = r0.g4()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20042813bW.g4():java.util.Map");
    }

    @Override // X.InterfaceC20043013bY
    public final void LJ(Object obj) {
        this.LIZIZ.LJ(obj);
    }

    public C20042813bW(InterfaceC20041513bJ interfaceC20041513bJ, Map<String, ? extends List<? extends Object>> map, InterfaceC20043013bY interfaceC20043013bY) {
        this.LIZ = new C182900n5(map, new AwS609S0100000_30(interfaceC20041513bJ, 290));
        this.LIZIZ = interfaceC20043013bY;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    @Override // X.InterfaceC20043013bY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.Object r4, kotlin.jvm.functions.Function2<? super X.InterfaceC1680500tpg, ? super java.lang.Integer, kotlin.Unit> r5, X.InterfaceC1680500tpg r6, int r7) {
        /*
            r3 = this;
            r0 = -697180401(0xffffffffd671df0f, float:-6.6485083E13)
            r6.LJJIIJZLJL(r0)
            X.13bY r2 = r3.LIZIZ
            r1 = r7 & 14
            r0 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            r2.LIZLLL(r4, r5, r6, r0)
            boolean r2 = r6.LJII(r3)
            boolean r0 = r6.LJII(r4)
            r2 = r2 | r0
            java.lang.Object r1 = r6.LJJ()
            if (r2 != 0) goto L28
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L32
        L28:
            kotlin.jvm.internal.AwS396S0200000_30 r1 = new kotlin.jvm.internal.AwS396S0200000_30
            r0 = 64
            r1.<init>(r3, r4, r0)
            r6.LJJIJIIJI(r1)
        L32:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            X.C1680540tpk.LIZIZ(r4, r1, r6)
            r6.LJ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20042813bW.LIZLLL(java.lang.Object, kotlin.jvm.functions.Function2, X.0tpg, int):void");
    }
}
