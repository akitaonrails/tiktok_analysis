package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0s96, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1615660s96 {
    public static final /* synthetic */ EnumC1615660s96[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1615660s96 SMALL;
    public static final EnumC1615660s96 X_SMALL;

    public static InterfaceC2044707zh<EnumC1615660s96> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1615660s96 enumC1615660s96 = new EnumC1615660s96("SMALL", 0);
        SMALL = enumC1615660s96;
        EnumC1615660s96 enumC1615660s962 = new EnumC1615660s96("X_SMALL", 1);
        X_SMALL = enumC1615660s962;
        EnumC1615660s96[] enumC1615660s96Arr = {enumC1615660s96, enumC1615660s962};
        LL = enumC1615660s96Arr;
        LLILLJJLI = new C2254308sP(enumC1615660s96Arr);
    }

    public static EnumC1615660s96[] values() {
        return (EnumC1615660s96[]) LL.clone();
    }

    public static EnumC1615660s96 valueOf(String str) {
        return (EnumC1615660s96) C08FF.LIZ(EnumC1615660s96.class, str);
    }

    public EnumC1615660s96(String str, int i) {
    }
}
