package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC571110Mab {
    public static final EnumC571110Mab DISABLED;
    public static final EnumC571110Mab FAILED;
    public static final /* synthetic */ EnumC571110Mab[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC571110Mab PASSED;
    public static final EnumC571110Mab SKIPPED;

    public static InterfaceC2044707zh<EnumC571110Mab> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC571110Mab enumC571110Mab = new EnumC571110Mab("PASSED", 0);
        PASSED = enumC571110Mab;
        EnumC571110Mab enumC571110Mab2 = new EnumC571110Mab("FAILED", 1);
        FAILED = enumC571110Mab2;
        EnumC571110Mab enumC571110Mab3 = new EnumC571110Mab("SKIPPED", 2);
        SKIPPED = enumC571110Mab3;
        EnumC571110Mab enumC571110Mab4 = new EnumC571110Mab("DISABLED", 3);
        DISABLED = enumC571110Mab4;
        EnumC571110Mab[] enumC571110MabArr = {enumC571110Mab, enumC571110Mab2, enumC571110Mab3, enumC571110Mab4};
        LL = enumC571110MabArr;
        LLILLJJLI = new C2254308sP(enumC571110MabArr);
    }

    public static EnumC571110Mab[] values() {
        return (EnumC571110Mab[]) LL.clone();
    }

    public static EnumC571110Mab valueOf(String str) {
        return (EnumC571110Mab) C08FF.LIZ(EnumC571110Mab.class, str);
    }

    public EnumC571110Mab(String str, int i) {
    }
}
