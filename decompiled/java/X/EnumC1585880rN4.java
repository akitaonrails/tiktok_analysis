package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rN4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1585880rN4 {
    public static final EnumC1585880rN4 FIRST;
    public static final /* synthetic */ EnumC1585880rN4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1585880rN4 PRELOAD;
    public static final EnumC1585880rN4 UPDATE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1585880rN4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1585880rN4 enumC1585880rN4 = new EnumC1585880rN4("PRELOAD", 0, "preload");
        PRELOAD = enumC1585880rN4;
        EnumC1585880rN4 enumC1585880rN42 = new EnumC1585880rN4("FIRST", 1, "first");
        FIRST = enumC1585880rN42;
        EnumC1585880rN4 enumC1585880rN43 = new EnumC1585880rN4("UPDATE", 2, "update");
        UPDATE = enumC1585880rN43;
        EnumC1585880rN4[] enumC1585880rN4Arr = {enumC1585880rN4, enumC1585880rN42, enumC1585880rN43};
        LLILLJJLI = enumC1585880rN4Arr;
        LLILLL = new C2254308sP(enumC1585880rN4Arr);
    }

    public static EnumC1585880rN4[] values() {
        return (EnumC1585880rN4[]) LLILLJJLI.clone();
    }

    public final String getTypeStr() {
        return this.LL;
    }

    public static EnumC1585880rN4 valueOf(String str) {
        return (EnumC1585880rN4) C08FF.LIZ(EnumC1585880rN4.class, str);
    }

    public EnumC1585880rN4(String str, int i, String str2) {
        this.LL = str2;
    }
}
