package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Gs4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429060Gs4 {
    public static final EnumC429060Gs4 FIRST_ON_TOP;
    public static final EnumC429060Gs4 LAST_ON_TOP;
    public static final /* synthetic */ EnumC429060Gs4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC429060Gs4> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC429060Gs4 enumC429060Gs4 = new EnumC429060Gs4("LAST_ON_TOP", 0);
        LAST_ON_TOP = enumC429060Gs4;
        EnumC429060Gs4 enumC429060Gs42 = new EnumC429060Gs4("FIRST_ON_TOP", 1);
        FIRST_ON_TOP = enumC429060Gs42;
        EnumC429060Gs4[] enumC429060Gs4Arr = {enumC429060Gs4, enumC429060Gs42};
        LL = enumC429060Gs4Arr;
        LLILLJJLI = new C2254308sP(enumC429060Gs4Arr);
    }

    public static EnumC429060Gs4[] values() {
        return (EnumC429060Gs4[]) LL.clone();
    }

    public static EnumC429060Gs4 valueOf(String str) {
        return (EnumC429060Gs4) C08FF.LIZ(EnumC429060Gs4.class, str);
    }

    public EnumC429060Gs4(String str, int i) {
    }
}
