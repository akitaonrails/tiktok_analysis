package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Fm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC048400Fm {
    public static final /* synthetic */ EnumC048400Fm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC048400Fm PLAY_FAILED;
    public static final EnumC048400Fm PLAY_SUCCESS;

    public static InterfaceC2044707zh<EnumC048400Fm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC048400Fm enumC048400Fm = new EnumC048400Fm("PLAY_SUCCESS", 0);
        PLAY_SUCCESS = enumC048400Fm;
        EnumC048400Fm enumC048400Fm2 = new EnumC048400Fm("PLAY_FAILED", 1);
        PLAY_FAILED = enumC048400Fm2;
        EnumC048400Fm[] enumC048400FmArr = {enumC048400Fm, enumC048400Fm2};
        LL = enumC048400FmArr;
        LLILLJJLI = new C2254308sP(enumC048400FmArr);
    }

    public static EnumC048400Fm[] values() {
        return (EnumC048400Fm[]) LL.clone();
    }

    public static EnumC048400Fm valueOf(String str) {
        return (EnumC048400Fm) C08FF.LIZ(EnumC048400Fm.class, str);
    }

    public EnumC048400Fm(String str, int i) {
    }
}
