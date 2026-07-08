package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.01xN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC501501xN {
    public static final EnumC501501xN Destructive;
    public static final /* synthetic */ EnumC501501xN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC501501xN Primary;

    public static InterfaceC2044707zh<EnumC501501xN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC501501xN enumC501501xN = new EnumC501501xN("Primary", 0);
        Primary = enumC501501xN;
        EnumC501501xN enumC501501xN2 = new EnumC501501xN("Destructive", 1);
        Destructive = enumC501501xN2;
        EnumC501501xN[] enumC501501xNArr = {enumC501501xN, enumC501501xN2};
        LL = enumC501501xNArr;
        LLILLJJLI = new C2254308sP(enumC501501xNArr);
    }

    public static EnumC501501xN[] values() {
        return (EnumC501501xN[]) LL.clone();
    }

    public static EnumC501501xN valueOf(String str) {
        return (EnumC501501xN) C08FF.LIZ(EnumC501501xN.class, str);
    }

    public EnumC501501xN(String str, int i) {
    }
}
