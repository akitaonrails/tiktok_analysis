package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wQ8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779980wQ8 {
    public static final /* synthetic */ EnumC1779980wQ8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779980wQ8 SMALL;
    public static final EnumC1779980wQ8 X_SMALL;

    public static InterfaceC2044707zh<EnumC1779980wQ8> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779980wQ8 enumC1779980wQ8 = new EnumC1779980wQ8("SMALL", 0);
        SMALL = enumC1779980wQ8;
        EnumC1779980wQ8 enumC1779980wQ82 = new EnumC1779980wQ8("X_SMALL", 1);
        X_SMALL = enumC1779980wQ82;
        EnumC1779980wQ8[] enumC1779980wQ8Arr = {enumC1779980wQ8, enumC1779980wQ82};
        LL = enumC1779980wQ8Arr;
        LLILLJJLI = new C2254308sP(enumC1779980wQ8Arr);
    }

    public static EnumC1779980wQ8[] values() {
        return (EnumC1779980wQ8[]) LL.clone();
    }

    public static EnumC1779980wQ8 valueOf(String str) {
        return (EnumC1779980wQ8) C08FF.LIZ(EnumC1779980wQ8.class, str);
    }

    public EnumC1779980wQ8(String str, int i) {
    }
}
