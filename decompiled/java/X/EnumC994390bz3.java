package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994390bz3 {
    public static final EnumC994390bz3 CLICK;
    public static final EnumC994390bz3 CLICK_OPTIONS;
    public static final /* synthetic */ EnumC994390bz3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC994390bz3 SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC994390bz3> getEntries() {
        return LLILLL;
    }

    static {
        EnumC994390bz3 enumC994390bz3 = new EnumC994390bz3("SHOW", 0, "show");
        SHOW = enumC994390bz3;
        EnumC994390bz3 enumC994390bz32 = new EnumC994390bz3("CLICK", 1, "click");
        CLICK = enumC994390bz32;
        EnumC994390bz3 enumC994390bz33 = new EnumC994390bz3("CLICK_OPTIONS", 2, "click_options");
        CLICK_OPTIONS = enumC994390bz33;
        EnumC994390bz3[] enumC994390bz3Arr = {enumC994390bz3, enumC994390bz32, enumC994390bz33};
        LLILLJJLI = enumC994390bz3Arr;
        LLILLL = new C2254308sP(enumC994390bz3Arr);
    }

    public static EnumC994390bz3[] values() {
        return (EnumC994390bz3[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC994390bz3 valueOf(String str) {
        return (EnumC994390bz3) C08FF.LIZ(EnumC994390bz3.class, str);
    }

    public EnumC994390bz3(String str, int i, String str2) {
        this.LL = str2;
    }
}
