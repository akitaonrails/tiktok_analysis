package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wP9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779370wP9 {
    public static final EnumC1779370wP9 ALL_JSON_OBJECTS;
    public static final /* synthetic */ EnumC1779370wP9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1779370wP9 NONE;
    public static final EnumC1779370wP9 POLYMORPHIC;

    public static InterfaceC2044707zh<EnumC1779370wP9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1779370wP9 enumC1779370wP9 = new EnumC1779370wP9("NONE", 0);
        NONE = enumC1779370wP9;
        EnumC1779370wP9 enumC1779370wP92 = new EnumC1779370wP9("ALL_JSON_OBJECTS", 1);
        ALL_JSON_OBJECTS = enumC1779370wP92;
        EnumC1779370wP9 enumC1779370wP93 = new EnumC1779370wP9("POLYMORPHIC", 2);
        POLYMORPHIC = enumC1779370wP93;
        EnumC1779370wP9[] enumC1779370wP9Arr = {enumC1779370wP9, enumC1779370wP92, enumC1779370wP93};
        LL = enumC1779370wP9Arr;
        LLILLJJLI = new C2254308sP(enumC1779370wP9Arr);
    }

    public static EnumC1779370wP9[] values() {
        return (EnumC1779370wP9[]) LL.clone();
    }

    public static EnumC1779370wP9 valueOf(String str) {
        return (EnumC1779370wP9) C08FF.LIZ(EnumC1779370wP9.class, str);
    }

    public EnumC1779370wP9(String str, int i) {
    }
}
