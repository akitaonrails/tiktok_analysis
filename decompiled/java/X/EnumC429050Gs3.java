package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gs3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429050Gs3 {
    public static final /* synthetic */ EnumC429050Gs3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC429050Gs3 Large;
    public static final EnumC429050Gs3 Small;

    public static InterfaceC2044707zh<EnumC429050Gs3> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429050Gs3 enumC429050Gs3 = new EnumC429050Gs3("Small", 0);
        Small = enumC429050Gs3;
        EnumC429050Gs3 enumC429050Gs32 = new EnumC429050Gs3("Large", 1);
        Large = enumC429050Gs32;
        EnumC429050Gs3[] enumC429050Gs3Arr = {enumC429050Gs3, enumC429050Gs32};
        LL = enumC429050Gs3Arr;
        LLILLJJLI = new C2254308sP(enumC429050Gs3Arr);
    }

    public static EnumC429050Gs3[] values() {
        return (EnumC429050Gs3[]) LL.clone();
    }

    public static EnumC429050Gs3 valueOf(String str) {
        return (EnumC429050Gs3) C08FF.LIZ(EnumC429050Gs3.class, str);
    }

    public EnumC429050Gs3(String str, int i) {
    }
}
