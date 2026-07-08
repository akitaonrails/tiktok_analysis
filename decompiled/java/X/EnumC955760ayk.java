package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ayk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC955760ayk {
    public static final EnumC955760ayk DESCRIPTION;
    public static final EnumC955760ayk EDUCATION;
    public static final /* synthetic */ EnumC955760ayk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC955760ayk NONE;

    public static InterfaceC2044707zh<EnumC955760ayk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC955760ayk enumC955760ayk = new EnumC955760ayk("EDUCATION", 0);
        EDUCATION = enumC955760ayk;
        EnumC955760ayk enumC955760ayk2 = new EnumC955760ayk("DESCRIPTION", 1);
        DESCRIPTION = enumC955760ayk2;
        EnumC955760ayk enumC955760ayk3 = new EnumC955760ayk("NONE", 2);
        NONE = enumC955760ayk3;
        EnumC955760ayk[] enumC955760aykArr = {enumC955760ayk, enumC955760ayk2, enumC955760ayk3};
        LL = enumC955760aykArr;
        LLILLJJLI = new C2254308sP(enumC955760aykArr);
    }

    public static EnumC955760ayk[] values() {
        return (EnumC955760ayk[]) LL.clone();
    }

    public static EnumC955760ayk valueOf(String str) {
        return (EnumC955760ayk) C08FF.LIZ(EnumC955760ayk.class, str);
    }

    public EnumC955760ayk(String str, int i) {
    }
}
