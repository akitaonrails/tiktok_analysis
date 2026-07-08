package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hI2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1198360hI2 {
    public static final EnumC1198360hI2 COMPLETED;
    public static final EnumC1198360hI2 ERROR;
    public static final EnumC1198360hI2 GENERATING;
    public static final /* synthetic */ EnumC1198360hI2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1198360hI2> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1198360hI2 enumC1198360hI2 = new EnumC1198360hI2("GENERATING", 0);
        GENERATING = enumC1198360hI2;
        EnumC1198360hI2 enumC1198360hI22 = new EnumC1198360hI2("COMPLETED", 1);
        COMPLETED = enumC1198360hI22;
        EnumC1198360hI2 enumC1198360hI23 = new EnumC1198360hI2("ERROR", 2);
        ERROR = enumC1198360hI23;
        EnumC1198360hI2[] enumC1198360hI2Arr = {enumC1198360hI2, enumC1198360hI22, enumC1198360hI23};
        LL = enumC1198360hI2Arr;
        LLILLJJLI = new C2254308sP(enumC1198360hI2Arr);
    }

    public static EnumC1198360hI2[] values() {
        return (EnumC1198360hI2[]) LL.clone();
    }

    public static EnumC1198360hI2 valueOf(String str) {
        return (EnumC1198360hI2) C08FF.LIZ(EnumC1198360hI2.class, str);
    }

    public EnumC1198360hI2(String str, int i) {
    }
}
