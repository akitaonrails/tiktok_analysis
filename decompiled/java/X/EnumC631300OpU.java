package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OpU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC631300OpU {
    public static final /* synthetic */ EnumC631300OpU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC631300OpU TT_TO_DSP;
    public final int LL = 1;

    public static InterfaceC2044707zh<EnumC631300OpU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC631300OpU enumC631300OpU = new EnumC631300OpU();
        TT_TO_DSP = enumC631300OpU;
        EnumC631300OpU[] enumC631300OpUArr = {enumC631300OpU};
        LLILLJJLI = enumC631300OpUArr;
        LLILLL = new C2254308sP(enumC631300OpUArr);
    }

    public static EnumC631300OpU[] values() {
        return (EnumC631300OpU[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC631300OpU valueOf(String str) {
        return (EnumC631300OpU) C08FF.LIZ(EnumC631300OpU.class, str);
    }
}
