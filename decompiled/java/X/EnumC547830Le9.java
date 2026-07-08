package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Le9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC547830Le9 {
    public static final EnumC547830Le9 AUTO_CREATE;
    public static final EnumC547830Le9 FOLLOW_CREATE;
    public static final EnumC547830Le9 ID_INPUT;
    public static final EnumC547830Le9 IM_CREATE;
    public static final /* synthetic */ EnumC547830Le9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC547830Le9 MAIN_CREATE;
    public static final EnumC547830Le9 RE_CREATE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC547830Le9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC547830Le9 enumC547830Le9 = new EnumC547830Le9("ID_INPUT", 0, "id_input");
        ID_INPUT = enumC547830Le9;
        EnumC547830Le9 enumC547830Le92 = new EnumC547830Le9("MAIN_CREATE", 1, "main_create");
        MAIN_CREATE = enumC547830Le92;
        EnumC547830Le9 enumC547830Le93 = new EnumC547830Le9("RE_CREATE", 2, "re_create");
        RE_CREATE = enumC547830Le93;
        EnumC547830Le9 enumC547830Le94 = new EnumC547830Le9("IM_CREATE", 3, "im_create");
        IM_CREATE = enumC547830Le94;
        EnumC547830Le9 enumC547830Le95 = new EnumC547830Le9("FOLLOW_CREATE", 4, "follow_create");
        FOLLOW_CREATE = enumC547830Le95;
        EnumC547830Le9 enumC547830Le96 = new EnumC547830Le9("AUTO_CREATE", 5, "auto_create");
        AUTO_CREATE = enumC547830Le96;
        EnumC547830Le9[] enumC547830Le9Arr = {enumC547830Le9, enumC547830Le92, enumC547830Le93, enumC547830Le94, enumC547830Le95, enumC547830Le96};
        LLILLJJLI = enumC547830Le9Arr;
        LLILLL = new C2254308sP(enumC547830Le9Arr);
    }

    public static EnumC547830Le9[] values() {
        return (EnumC547830Le9[]) LLILLJJLI.clone();
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC547830Le9 valueOf(String str) {
        return (EnumC547830Le9) C08FF.LIZ(EnumC547830Le9.class, str);
    }

    public EnumC547830Le9(String str, int i, String str2) {
        this.LL = str2;
    }
}
