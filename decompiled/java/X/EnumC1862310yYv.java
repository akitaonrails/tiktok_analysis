package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1862310yYv {
    public static final EnumC1862310yYv DIALOG_WITH_TOS;
    public static final EnumC1862310yYv FULL_SCREEN_VIEW;
    public static final /* synthetic */ EnumC1862310yYv[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1862310yYv PINNED_MESSAGE;

    public static InterfaceC2044707zh<EnumC1862310yYv> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1862310yYv enumC1862310yYv = new EnumC1862310yYv("DIALOG_WITH_TOS", 0);
        DIALOG_WITH_TOS = enumC1862310yYv;
        EnumC1862310yYv enumC1862310yYv2 = new EnumC1862310yYv("PINNED_MESSAGE", 1);
        PINNED_MESSAGE = enumC1862310yYv2;
        EnumC1862310yYv enumC1862310yYv3 = new EnumC1862310yYv("FULL_SCREEN_VIEW", 2);
        FULL_SCREEN_VIEW = enumC1862310yYv3;
        EnumC1862310yYv[] enumC1862310yYvArr = {enumC1862310yYv, enumC1862310yYv2, enumC1862310yYv3};
        LL = enumC1862310yYvArr;
        LLILLJJLI = new C2254308sP(enumC1862310yYvArr);
    }

    public static EnumC1862310yYv[] values() {
        return (EnumC1862310yYv[]) LL.clone();
    }

    public static EnumC1862310yYv valueOf(String str) {
        return (EnumC1862310yYv) C08FF.LIZ(EnumC1862310yYv.class, str);
    }

    public EnumC1862310yYv(String str, int i) {
    }
}
