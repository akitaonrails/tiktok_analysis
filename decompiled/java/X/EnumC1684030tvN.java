package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0tvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1684030tvN {
    public static final EnumC1684030tvN Horizontal;
    public static final /* synthetic */ EnumC1684030tvN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1684030tvN Vertical;

    public static InterfaceC2044707zh<EnumC1684030tvN> getEntries() {
        return LLILLJJLI;
    }

    public static EnumC1684030tvN valueOf(String str) {
        return (EnumC1684030tvN) C08FF.LIZ(EnumC1684030tvN.class, str);
    }

    public static EnumC1684030tvN[] values() {
        return (EnumC1684030tvN[]) LL.clone();
    }

    static {
        EnumC1684030tvN enumC1684030tvN = new EnumC1684030tvN("Vertical", 0);
        Vertical = enumC1684030tvN;
        EnumC1684030tvN enumC1684030tvN2 = new EnumC1684030tvN("Horizontal", 1);
        Horizontal = enumC1684030tvN2;
        EnumC1684030tvN[] enumC1684030tvNArr = {enumC1684030tvN, enumC1684030tvN2};
        LL = enumC1684030tvNArr;
        LLILLJJLI = new C2254308sP(enumC1684030tvNArr);
    }

    public EnumC1684030tvN(String str, int i) {
    }
}
