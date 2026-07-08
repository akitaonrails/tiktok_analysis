package X;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u65, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690670u65 {
    public static final float LIZ = 56;
    public static final C1690660u64 LIZIZ = new C1690660u64(C13BV.INSTANCE, 0, 0, 0, EnumC1684030tvN.Horizontal, 0, 0, 0, C1675580thk.LIZ, new InterfaceC1690350u5Z() { // from class: X.0u6O
        public final Map<C115T, Integer> LIZ = C2097608Jq.LJ();

        @Override // X.InterfaceC1690350u5Z
        public final void LJIILLIIL() {
        }

        @Override // X.InterfaceC1690350u5Z
        public final /* synthetic */ Function1 LJIIZILJ() {
            return null;
        }

        @Override // X.InterfaceC1690350u5Z
        public final int getHeight() {
            return 0;
        }

        @Override // X.InterfaceC1690350u5Z
        public final int getWidth() {
            return 0;
        }

        @Override // X.InterfaceC1690350u5Z
        public final Map<C115T, Integer> LJIILL() {
            return this.LIZ;
        }
    }, C2296808zG.LIZ(C23271099x.INSTANCE));
    public static final C1690840u6M LIZJ = new InterfaceC1690500u5o() { // from class: X.0u6M
        @Override // X.InterfaceC1681050tqZ
        public final float LJJ() {
            return 1.0f;
        }

        @Override // X.InterfaceC1690500u5o
        public final float LJJJJLL(float f) {
            return f * 1.0f;
        }

        @Override // X.InterfaceC1690500u5o
        public final /* synthetic */ long LJJLIIIJLJLI(long j) {
            return C1682420tsm.LIZLLL(j, this);
        }

        @Override // X.InterfaceC1690500u5o
        public final /* synthetic */ long LJLI(long j) {
            return C1682420tsm.LIZIZ(j, this);
        }

        @Override // X.InterfaceC1681050tqZ
        public final /* synthetic */ long LJLJLJ(float f) {
            return C1685230txJ.LIZIZ(this, f);
        }

        @Override // X.InterfaceC1690500u5o
        public final /* synthetic */ int LJLLJ(float f) {
            return C1682420tsm.LIZ(f, this);
        }

        @Override // X.InterfaceC1690500u5o
        public final /* synthetic */ float LJLLL(long j) {
            return C1682420tsm.LIZJ(j, this);
        }

        @Override // X.InterfaceC1681050tqZ
        public final /* synthetic */ float LLI(long j) {
            return C1685230txJ.LIZ(this, j);
        }

        @Override // X.InterfaceC1690500u5o
        public final float getDensity() {
            return 1.0f;
        }

        @Override // X.InterfaceC1690500u5o
        public final float LJJI(int i) {
            return i / 1.0f;
        }

        @Override // X.InterfaceC1690500u5o
        public final float LLIIIJ(float f) {
            return f / 1.0f;
        }
    };

    public static final long LIZ(InterfaceC1690800u6I interfaceC1690800u6I, int i) {
        long j;
        long jLJI = (((((long) i) * ((long) (interfaceC1690800u6I.LJI() + interfaceC1690800u6I.LJFF()))) + ((long) interfaceC1690800u6I.LIZJ())) + ((long) interfaceC1690800u6I.LJ())) - ((long) interfaceC1690800u6I.LJI());
        EnumC1684030tvN orientation = interfaceC1690800u6I.getOrientation();
        EnumC1684030tvN enumC1684030tvN = EnumC1684030tvN.Horizontal;
        long jLIZ = interfaceC1690800u6I.LIZ();
        if (orientation == enumC1684030tvN) {
            j = jLIZ >> 32;
        } else {
            j = jLIZ & 4294967295L;
        }
        int i2 = (int) j;
        long jLJ = jLJI - ((long) (i2 - C13LZ.LJ(interfaceC1690800u6I.LJII().LIZJ(i2, interfaceC1690800u6I.LJFF(), interfaceC1690800u6I.LIZJ(), interfaceC1690800u6I.LJ()), 0, i2)));
        if (jLJ < 0) {
            return 0L;
        }
        return jLJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1386605bk LIZIZ(int r8, kotlin.jvm.functions.Function0 r9, X.InterfaceC1680500tpg r10, int r11) {
        /*
            r6 = 0
            java.lang.Object[] r5 = new java.lang.Object[r6]
            X.0u0K r4 = X.C1386605bk.LJJIJL
            r0 = r11 & 14
            r0 = r0 ^ 6
            r3 = 4
            if (r0 <= r3) goto L12
            boolean r0 = r10.LJIJI(r8)
            if (r0 != 0) goto L69
        L12:
            r0 = r11 & 6
            if (r0 == r3) goto L69
            r7 = 0
        L17:
            r0 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 0
            r1 = 32
            if (r0 <= r1) goto L26
            boolean r0 = r10.LJIJ(r2)
            if (r0 != 0) goto L67
        L26:
            r0 = r11 & 48
            if (r0 == r1) goto L67
            r0 = 0
        L2b:
            r7 = r7 | r0
            r0 = r11 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r1 = 256(0x100, float:3.59E-43)
            if (r0 <= r1) goto L3a
            boolean r0 = r10.LJJIIJ(r9)
            if (r0 != 0) goto L3e
        L3a:
            r0 = r11 & 384(0x180, float:5.38E-43)
            if (r0 != r1) goto L3f
        L3e:
            r6 = 1
        L3f:
            r7 = r7 | r6
            java.lang.Object r1 = r10.LJJ()
            if (r7 != 0) goto L4f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L57
        L4f:
            X.05bj r1 = new X.05bj
            r1.<init>(r8, r2, r9)
            r10.LJJIJIIJI(r1)
        L57:
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r1 = X.C20041813bM.LIZ(r5, r4, r1, r10, r3)
            X.05bk r1 = (X.C1386605bk) r1
            X.05P0<kotlin.jvm.functions.Function0<java.lang.Integer>> r0 = r1.LJJIJIL
            X.13FE r0 = (X.C13FE) r0
            r0.setValue(r9)
            return r1
        L67:
            r0 = 1
            goto L2b
        L69:
            r7 = 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690670u65.LIZIZ(int, kotlin.jvm.functions.Function0, X.0tpg, int):X.05bk");
    }
}
