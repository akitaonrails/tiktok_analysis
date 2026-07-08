package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0M9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC563950M9x {
    public static final EnumC563950M9x GENERAL_STYLE;
    public static final /* synthetic */ EnumC563950M9x[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC563950M9x STORY_STYLE;

    public static InterfaceC2044707zh<EnumC563950M9x> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC563950M9x enumC563950M9x = new EnumC563950M9x("STORY_STYLE", 0);
        STORY_STYLE = enumC563950M9x;
        EnumC563950M9x enumC563950M9x2 = new EnumC563950M9x("GENERAL_STYLE", 1);
        GENERAL_STYLE = enumC563950M9x2;
        EnumC563950M9x[] enumC563950M9xArr = {enumC563950M9x, enumC563950M9x2};
        LL = enumC563950M9xArr;
        LLILLJJLI = new C2254308sP(enumC563950M9xArr);
    }

    public static EnumC563950M9x[] values() {
        return (EnumC563950M9x[]) LL.clone();
    }

    public static EnumC563950M9x valueOf(String str) {
        return (EnumC563950M9x) C08FF.LIZ(EnumC563950M9x.class, str);
    }

    public EnumC563950M9x(String str, int i) {
    }
}
