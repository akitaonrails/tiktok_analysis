package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yG6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1850640yG6 {
    public static final EnumC1850640yG6 APPLY;
    public static final EnumC1850640yG6 BACK;
    public static final EnumC1850640yG6 GREENSCREEN_TUTORIAL;
    public static final /* synthetic */ EnumC1850640yG6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1850640yG6 NONE;
    public static final EnumC1850640yG6 PHOTO;
    public static final EnumC1850640yG6 REAL_SHOT;

    public static InterfaceC2044707zh<EnumC1850640yG6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1850640yG6 enumC1850640yG6 = new EnumC1850640yG6("NONE", 0);
        NONE = enumC1850640yG6;
        EnumC1850640yG6 enumC1850640yG62 = new EnumC1850640yG6("BACK", 1);
        BACK = enumC1850640yG62;
        EnumC1850640yG6 enumC1850640yG63 = new EnumC1850640yG6("APPLY", 2);
        APPLY = enumC1850640yG63;
        EnumC1850640yG6 enumC1850640yG64 = new EnumC1850640yG6("GREENSCREEN_TUTORIAL", 3);
        GREENSCREEN_TUTORIAL = enumC1850640yG64;
        EnumC1850640yG6 enumC1850640yG65 = new EnumC1850640yG6("REAL_SHOT", 4);
        REAL_SHOT = enumC1850640yG65;
        EnumC1850640yG6 enumC1850640yG66 = new EnumC1850640yG6("PHOTO", 5);
        PHOTO = enumC1850640yG66;
        EnumC1850640yG6[] enumC1850640yG6Arr = {enumC1850640yG6, enumC1850640yG62, enumC1850640yG63, enumC1850640yG64, enumC1850640yG65, enumC1850640yG66};
        LL = enumC1850640yG6Arr;
        LLILLJJLI = new C2254308sP(enumC1850640yG6Arr);
    }

    public static EnumC1850640yG6[] values() {
        return (EnumC1850640yG6[]) LL.clone();
    }

    public static EnumC1850640yG6 valueOf(String str) {
        return (EnumC1850640yG6) C08FF.LIZ(EnumC1850640yG6.class, str);
    }

    public EnumC1850640yG6(String str, int i) {
    }
}
