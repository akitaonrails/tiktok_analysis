package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zjO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1907240zjO {
    public static final EnumC1907240zjO CONTENT_WITH_LINK;
    public static final /* synthetic */ EnumC1907240zjO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1907240zjO NONE_CONTENT;
    public static final EnumC1907240zjO NORMAL_CONTENT;
    public static final EnumC1907240zjO TITLE_WITH_CONTENT;

    public static InterfaceC2044707zh<EnumC1907240zjO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1907240zjO enumC1907240zjO = new EnumC1907240zjO("NORMAL_CONTENT", 0);
        NORMAL_CONTENT = enumC1907240zjO;
        EnumC1907240zjO enumC1907240zjO2 = new EnumC1907240zjO("CONTENT_WITH_LINK", 1);
        CONTENT_WITH_LINK = enumC1907240zjO2;
        EnumC1907240zjO enumC1907240zjO3 = new EnumC1907240zjO("NONE_CONTENT", 2);
        NONE_CONTENT = enumC1907240zjO3;
        EnumC1907240zjO enumC1907240zjO4 = new EnumC1907240zjO("TITLE_WITH_CONTENT", 3);
        TITLE_WITH_CONTENT = enumC1907240zjO4;
        EnumC1907240zjO[] enumC1907240zjOArr = {enumC1907240zjO, enumC1907240zjO2, enumC1907240zjO3, enumC1907240zjO4};
        LL = enumC1907240zjOArr;
        LLILLJJLI = new C2254308sP(enumC1907240zjOArr);
    }

    public static EnumC1907240zjO[] values() {
        return (EnumC1907240zjO[]) LL.clone();
    }

    public static EnumC1907240zjO valueOf(String str) {
        return (EnumC1907240zjO) C08FF.LIZ(EnumC1907240zjO.class, str);
    }

    public EnumC1907240zjO(String str, int i) {
    }
}
