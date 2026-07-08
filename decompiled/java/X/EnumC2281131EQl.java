package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.1EQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public enum EnumC2281131EQl {
    Undefine(0),
    Standard(1),
    High(2),
    SuperHigh(3),
    ExtremelyHigh(4),
    FourK(5),
    HDR(6),
    Auto(7),
    L_Standard(8),
    H_High(9),
    TwoK(10),
    ExtremelyHigh_50F(11),
    TwoK_50F(12),
    FourK_50F(13),
    ExtremelyHigh_60F(14),
    TwoK_60F(15),
    FourK_60F(16),
    ExtremelyHigh_120F(17),
    TwoK_120F(18),
    FourK_120F(19);

    public static final Map<EnumC2281141EQm, EnumC2281131EQl> LLILLJJLI = new HashMap();
    public final EnumC2281141EQm LL;

    static {
        for (EnumC2281131EQl enumC2281131EQl : values()) {
            LLILLJJLI.put(enumC2281131EQl.getResolution(), enumC2281131EQl);
        }
    }

    public static EnumC2281131EQl[] getAllResolution() {
        try {
            return new EnumC2281131EQl[]{Undefine, L_Standard, Standard, High, H_High, SuperHigh, ExtremelyHigh, ExtremelyHigh_50F, ExtremelyHigh_60F, ExtremelyHigh_120F, HDR, TwoK, TwoK_50F, TwoK_60F, TwoK_120F, FourK, FourK_50F, FourK_60F, FourK_120F};
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new EnumC2281131EQl[0];
        }
    }

    public int getIndex() {
        return ordinal();
    }

    public EnumC2281141EQm getResolution() {
        return this.LL;
    }

    public static EnumC2281131EQl from(EnumC2281141EQm enumC2281141EQm) {
        EnumC2281131EQl enumC2281131EQl = (EnumC2281131EQl) ((HashMap) LLILLJJLI).get(enumC2281141EQm);
        if (enumC2281131EQl == null) {
            return Undefine;
        }
        return enumC2281131EQl;
    }

    public static EnumC2281131EQl valueOf(int i) {
        EnumC2281131EQl enumC2281131EQl = Undefine;
        if (i >= enumC2281131EQl.ordinal() && i <= FourK_120F.ordinal()) {
            return values()[i];
        }
        return enumC2281131EQl;
    }

    public static EnumC2281131EQl valueOf(String str) {
        return (EnumC2281131EQl) C08FF.LIZ(EnumC2281131EQl.class, str);
    }

    EnumC2281131EQl(int i) {
        this.LL = enumC2281141EQm;
    }
}
