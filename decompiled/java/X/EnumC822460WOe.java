package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC822460WOe {
    public static final EnumC822460WOe CCT_DOWN_GRADE_SPARK_THIRD;
    public static final EnumC822460WOe CCT_DOWN_GRADE_SYSTEM_BROWSER;
    public static final /* synthetic */ EnumC822460WOe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC822460WOe OLD_CONTAINER;
    public static final EnumC822460WOe SPARK_THIRD;
    public static final EnumC822460WOe SPARK_THIRD_LIVE_REDIRECT;
    public static final EnumC822460WOe SPARK_THIRD_REDIRECT;
    public static final EnumC822460WOe UNKNOWN;

    public static InterfaceC2044707zh<EnumC822460WOe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC822460WOe enumC822460WOe = new EnumC822460WOe("SPARK_THIRD", 0);
        SPARK_THIRD = enumC822460WOe;
        EnumC822460WOe enumC822460WOe2 = new EnumC822460WOe("SPARK_THIRD_REDIRECT", 1);
        SPARK_THIRD_REDIRECT = enumC822460WOe2;
        EnumC822460WOe enumC822460WOe3 = new EnumC822460WOe("SPARK_THIRD_LIVE_REDIRECT", 2);
        SPARK_THIRD_LIVE_REDIRECT = enumC822460WOe3;
        EnumC822460WOe enumC822460WOe4 = new EnumC822460WOe("CCT_DOWN_GRADE_SPARK_THIRD", 3);
        CCT_DOWN_GRADE_SPARK_THIRD = enumC822460WOe4;
        EnumC822460WOe enumC822460WOe5 = new EnumC822460WOe("CCT_DOWN_GRADE_SYSTEM_BROWSER", 4);
        CCT_DOWN_GRADE_SYSTEM_BROWSER = enumC822460WOe5;
        EnumC822460WOe enumC822460WOe6 = new EnumC822460WOe("OLD_CONTAINER", 5);
        OLD_CONTAINER = enumC822460WOe6;
        EnumC822460WOe enumC822460WOe7 = new EnumC822460WOe("UNKNOWN", 6);
        UNKNOWN = enumC822460WOe7;
        EnumC822460WOe[] enumC822460WOeArr = {enumC822460WOe, enumC822460WOe2, enumC822460WOe3, enumC822460WOe4, enumC822460WOe5, enumC822460WOe6, enumC822460WOe7};
        LL = enumC822460WOeArr;
        LLILLJJLI = new C2254308sP(enumC822460WOeArr);
    }

    public static EnumC822460WOe[] values() {
        return (EnumC822460WOe[]) LL.clone();
    }

    public static EnumC822460WOe valueOf(String str) {
        return (EnumC822460WOe) C08FF.LIZ(EnumC822460WOe.class, str);
    }

    public EnumC822460WOe(String str, int i) {
    }
}
