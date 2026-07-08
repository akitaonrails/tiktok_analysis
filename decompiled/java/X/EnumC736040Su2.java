package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Su2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC736040Su2 {
    public static final EnumC736040Su2 INVALID_ZONE;
    public static final EnumC736040Su2 LEFT_HOT_ZONE;
    public static final /* synthetic */ EnumC736040Su2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC736040Su2 RIGHT_HOT_ZONE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC736040Su2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC736040Su2 enumC736040Su2 = new EnumC736040Su2("LEFT_HOT_ZONE", 0, "click_left_edge");
        LEFT_HOT_ZONE = enumC736040Su2;
        EnumC736040Su2 enumC736040Su22 = new EnumC736040Su2("RIGHT_HOT_ZONE", 1, "click_right_edge");
        RIGHT_HOT_ZONE = enumC736040Su22;
        EnumC736040Su2 enumC736040Su23 = new EnumC736040Su2("INVALID_ZONE", 2, "");
        INVALID_ZONE = enumC736040Su23;
        EnumC736040Su2[] enumC736040Su2Arr = {enumC736040Su2, enumC736040Su22, enumC736040Su23};
        LLILLJJLI = enumC736040Su2Arr;
        LLILLL = new C2254308sP(enumC736040Su2Arr);
    }

    public static EnumC736040Su2[] values() {
        return (EnumC736040Su2[]) LLILLJJLI.clone();
    }

    public final String getMethod() {
        return this.LL;
    }

    public static EnumC736040Su2 valueOf(String str) {
        return (EnumC736040Su2) C08FF.LIZ(EnumC736040Su2.class, str);
    }

    public EnumC736040Su2(String str, int i, String str2) {
        this.LL = str2;
    }
}
