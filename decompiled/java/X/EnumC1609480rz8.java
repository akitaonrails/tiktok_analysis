package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1609480rz8 {
    public static final EnumC1609480rz8 LARGE_MEDIUM_THUMB;
    public static final /* synthetic */ EnumC1609480rz8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1609480rz8 MEDIUM_THUMB_LARGE;
    public static final EnumC1609480rz8 THUMB_MEDIUM_LARGE;

    public static InterfaceC2044707zh<EnumC1609480rz8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1609480rz8 enumC1609480rz8 = new EnumC1609480rz8("MEDIUM_THUMB_LARGE", 0);
        MEDIUM_THUMB_LARGE = enumC1609480rz8;
        EnumC1609480rz8 enumC1609480rz82 = new EnumC1609480rz8("LARGE_MEDIUM_THUMB", 1);
        LARGE_MEDIUM_THUMB = enumC1609480rz82;
        EnumC1609480rz8 enumC1609480rz83 = new EnumC1609480rz8("THUMB_MEDIUM_LARGE", 2);
        THUMB_MEDIUM_LARGE = enumC1609480rz83;
        EnumC1609480rz8[] enumC1609480rz8Arr = {enumC1609480rz8, enumC1609480rz82, enumC1609480rz83};
        LL = enumC1609480rz8Arr;
        LLILLJJLI = new C2254308sP(enumC1609480rz8Arr);
    }

    public static EnumC1609480rz8[] values() {
        return (EnumC1609480rz8[]) LL.clone();
    }

    public static EnumC1609480rz8 valueOf(String str) {
        return (EnumC1609480rz8) C08FF.LIZ(EnumC1609480rz8.class, str);
    }

    public EnumC1609480rz8(String str, int i) {
    }
}
