package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1609840rzi {
    public static final EnumC1609840rzi APPLICATION_ATTACH;
    public static final EnumC1609840rzi APPLICATION_CREATE;
    public static final /* synthetic */ EnumC1609840rzi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1609840rzi MAIN_CREATE;
    public static final EnumC1609840rzi MAIN_FRAME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1609840rzi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1609840rzi enumC1609840rzi = new EnumC1609840rzi("APPLICATION_ATTACH", 0, "app_attach");
        APPLICATION_ATTACH = enumC1609840rzi;
        EnumC1609840rzi enumC1609840rzi2 = new EnumC1609840rzi("APPLICATION_CREATE", 1, "app_create");
        APPLICATION_CREATE = enumC1609840rzi2;
        EnumC1609840rzi enumC1609840rzi3 = new EnumC1609840rzi("MAIN_CREATE", 2, "main_create");
        MAIN_CREATE = enumC1609840rzi3;
        EnumC1609840rzi enumC1609840rzi4 = new EnumC1609840rzi("MAIN_FRAME", 3, "main_frame");
        MAIN_FRAME = enumC1609840rzi4;
        EnumC1609840rzi[] enumC1609840rziArr = {enumC1609840rzi, enumC1609840rzi2, enumC1609840rzi3, enumC1609840rzi4};
        LLILLJJLI = enumC1609840rziArr;
        LLILLL = new C2254308sP(enumC1609840rziArr);
    }

    public static EnumC1609840rzi[] values() {
        return (EnumC1609840rzi[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1609840rzi valueOf(String str) {
        return (EnumC1609840rzi) C08FF.LIZ(EnumC1609840rzi.class, str);
    }

    public EnumC1609840rzi(String str, int i, String str2) {
        this.LL = str2;
    }
}
