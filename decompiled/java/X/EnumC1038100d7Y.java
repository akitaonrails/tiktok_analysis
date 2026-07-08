package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0d7Y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1038100d7Y {
    public static final EnumC1038100d7Y EXIT_BUTTON;
    public static final /* synthetic */ EnumC1038100d7Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1038100d7Y OTHER_AREA;

    public static InterfaceC2044707zh<EnumC1038100d7Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1038100d7Y enumC1038100d7Y = new EnumC1038100d7Y("EXIT_BUTTON", 0);
        EXIT_BUTTON = enumC1038100d7Y;
        EnumC1038100d7Y enumC1038100d7Y2 = new EnumC1038100d7Y("OTHER_AREA", 1);
        OTHER_AREA = enumC1038100d7Y2;
        EnumC1038100d7Y[] enumC1038100d7YArr = {enumC1038100d7Y, enumC1038100d7Y2};
        LL = enumC1038100d7YArr;
        LLILLJJLI = new C2254308sP(enumC1038100d7YArr);
    }

    public static EnumC1038100d7Y[] values() {
        return (EnumC1038100d7Y[]) LL.clone();
    }

    public static EnumC1038100d7Y valueOf(String str) {
        return (EnumC1038100d7Y) C08FF.LIZ(EnumC1038100d7Y.class, str);
    }

    public EnumC1038100d7Y(String str, int i) {
    }
}
