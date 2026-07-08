package X;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0TsB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C760370TsB extends C0KYM {
    public static final /* synthetic */ int LIZLLL = 0;

    @Override // X.C0KYM
    public final C0KYM LJI(String str) {
        throw null;
    }

    public final void LJIIJJI() {
        super.LJFF(false);
    }

    @Override // X.C0KYM
    public final C0KYM LJFF(boolean z) {
        super.LJFF(z);
        return this;
    }

    public final void LJIIIIZZ(String str) {
        ((HashMap) this.LIZ).put("gravity", str);
    }

    public final void LJIIL(int i) {
        ((HashMap) this.LIZ).put("keyboard_adjust", String.valueOf(i));
    }

    public final void LJIILIIL(String str) {
        ((HashMap) this.LIZ).put("landscape_gravity", str);
    }

    public final void LJIILL(String str) {
        ((HashMap) this.LIZ).put("landscape_transition_animation", str);
    }

    public final void LJIJ(EnumC760350Ts9 enumC760350Ts9) {
        int i = C760360TsA.LIZ[enumC760350Ts9.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(10);
                    sbLIZ.append("rpx");
                    ((HashMap) this.LIZ).put("min_margin_top", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                throw new C1954807lC();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(10);
            sbLIZ2.append('%');
            ((HashMap) this.LIZ).put("min_margin_top", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        ((HashMap) this.LIZ).put("min_margin_top", String.valueOf(10));
    }

    public final void LJIJJLI(String str) {
        ((HashMap) this.LIZ).put("transition_animation", str);
    }

    public final void LJIL(String str) {
        super.LJI(str);
    }

    public final void LJJII(Map map) {
        ((HashMap) this.LIZ).putAll(map);
    }

    @Override // X.C0KYM
    public final void LJII(String str, String str2) {
        super.LJII("is_powered_by_mix_lynx_card", "1");
    }

    public final C760370TsB LJIIIZ(int i, EnumC760350Ts9 enumC760350Ts9) {
        int i2 = C760360TsA.LIZ[enumC760350Ts9.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i);
                    sbLIZ.append("rpx");
                    ((HashMap) this.LIZ).put("height", C2188811AlT.LIZIZ(sbLIZ));
                    return this;
                }
                throw new C1954807lC();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append('%');
            ((HashMap) this.LIZ).put("height", C2188811AlT.LIZIZ(sbLIZ2));
            return this;
        }
        ((HashMap) this.LIZ).put("height", String.valueOf(i));
        return this;
    }

    public final C760370TsB LJIILJJIL(int i, EnumC760350Ts9 enumC760350Ts9) {
        int i2 = C760360TsA.LIZ[enumC760350Ts9.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i);
                    sbLIZ.append("rpx");
                    ((HashMap) this.LIZ).put("landscape_height", C2188811AlT.LIZIZ(sbLIZ));
                    return this;
                }
                throw new C1954807lC();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append('%');
            ((HashMap) this.LIZ).put("landscape_height", C2188811AlT.LIZIZ(sbLIZ2));
            return this;
        }
        ((HashMap) this.LIZ).put("landscape_height", String.valueOf(i));
        return this;
    }

    public final C760370TsB LJIILLIIL(int i, EnumC760350Ts9 enumC760350Ts9) {
        int i2 = C760360TsA.LIZ[enumC760350Ts9.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i);
                    sbLIZ.append("rpx");
                    ((HashMap) this.LIZ).put("landscape_width", C2188811AlT.LIZIZ(sbLIZ));
                    return this;
                }
                throw new C1954807lC();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append('%');
            ((HashMap) this.LIZ).put("landscape_width", C2188811AlT.LIZIZ(sbLIZ2));
            return this;
        }
        ((HashMap) this.LIZ).put("landscape_width", String.valueOf(i));
        return this;
    }

    public final C760370TsB LJIJI(int i, EnumC760350Ts9 enumC760350Ts9) {
        int i2 = C760360TsA.LIZ[enumC760350Ts9.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i);
                    sbLIZ.append("rpx");
                    ((HashMap) this.LIZ).put("radius", C2188811AlT.LIZIZ(sbLIZ));
                    return this;
                }
                throw new C1954807lC();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append('%');
            ((HashMap) this.LIZ).put("radius", C2188811AlT.LIZIZ(sbLIZ2));
            return this;
        }
        ((HashMap) this.LIZ).put("radius", String.valueOf(i));
        return this;
    }

    public final C760370TsB LJJ(int i, EnumC760350Ts9 enumC760350Ts9) {
        int i2 = C760360TsA.LIZ[enumC760350Ts9.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(i);
                    sbLIZ.append("rpx");
                    ((HashMap) this.LIZ).put("width", C2188811AlT.LIZIZ(sbLIZ));
                    return this;
                }
                throw new C1954807lC();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append('%');
            ((HashMap) this.LIZ).put("width", C2188811AlT.LIZIZ(sbLIZ2));
            return this;
        }
        ((HashMap) this.LIZ).put("width", String.valueOf(i));
        return this;
    }

    public final void LJJIFFI(String str, String str2) {
        super.LJII(str, str2);
    }
}
