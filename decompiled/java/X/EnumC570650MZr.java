package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MZr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC570650MZr {
    public static final EnumC570650MZr FILE_OPERATION;
    public static final /* synthetic */ EnumC570650MZr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC570650MZr POST_RESTORE;
    public static final EnumC570650MZr POST_SAVE;
    public static final EnumC570650MZr PRE_RESTORE;
    public static final EnumC570650MZr PRE_SAVE;
    public static final EnumC570650MZr RESOURCE_RESTORE;

    public static InterfaceC2044707zh<EnumC570650MZr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC570650MZr enumC570650MZr = new EnumC570650MZr("PRE_SAVE", 0);
        PRE_SAVE = enumC570650MZr;
        EnumC570650MZr enumC570650MZr2 = new EnumC570650MZr("FILE_OPERATION", 1);
        FILE_OPERATION = enumC570650MZr2;
        EnumC570650MZr enumC570650MZr3 = new EnumC570650MZr("POST_SAVE", 2);
        POST_SAVE = enumC570650MZr3;
        EnumC570650MZr enumC570650MZr4 = new EnumC570650MZr("PRE_RESTORE", 3);
        PRE_RESTORE = enumC570650MZr4;
        EnumC570650MZr enumC570650MZr5 = new EnumC570650MZr("RESOURCE_RESTORE", 4);
        RESOURCE_RESTORE = enumC570650MZr5;
        EnumC570650MZr enumC570650MZr6 = new EnumC570650MZr("POST_RESTORE", 5);
        POST_RESTORE = enumC570650MZr6;
        EnumC570650MZr[] enumC570650MZrArr = {enumC570650MZr, enumC570650MZr2, enumC570650MZr3, enumC570650MZr4, enumC570650MZr5, enumC570650MZr6};
        LL = enumC570650MZrArr;
        LLILLJJLI = new C2254308sP(enumC570650MZrArr);
    }

    public static EnumC570650MZr[] values() {
        return (EnumC570650MZr[]) LL.clone();
    }

    public static EnumC570650MZr valueOf(String str) {
        return (EnumC570650MZr) C08FF.LIZ(EnumC570650MZr.class, str);
    }

    public EnumC570650MZr(String str, int i) {
    }
}
