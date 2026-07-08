package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Itk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC481060Itk {
    public static final /* synthetic */ EnumC481060Itk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC481060Itk NONE;
    public static final EnumC481060Itk REFRESH;

    public static InterfaceC2044707zh<EnumC481060Itk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC481060Itk enumC481060Itk = new EnumC481060Itk("REFRESH", 0);
        REFRESH = enumC481060Itk;
        EnumC481060Itk enumC481060Itk2 = new EnumC481060Itk("NONE", 1);
        NONE = enumC481060Itk2;
        EnumC481060Itk[] enumC481060ItkArr = {enumC481060Itk, enumC481060Itk2};
        LL = enumC481060ItkArr;
        LLILLJJLI = new C2254308sP(enumC481060ItkArr);
    }

    public static EnumC481060Itk[] values() {
        return (EnumC481060Itk[]) LL.clone();
    }

    public static EnumC481060Itk valueOf(String str) {
        return (EnumC481060Itk) C08FF.LIZ(EnumC481060Itk.class, str);
    }

    public EnumC481060Itk(String str, int i) {
    }
}
