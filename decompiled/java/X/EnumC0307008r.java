package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0307008r {
    public static final EnumC0307008r HISTORY;
    public static final EnumC0307008r HISTORY_AND_GUESS;
    public static final /* synthetic */ EnumC0307008r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC0307008r> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC0307008r enumC0307008r = new EnumC0307008r("HISTORY", 0);
        HISTORY = enumC0307008r;
        EnumC0307008r enumC0307008r2 = new EnumC0307008r("HISTORY_AND_GUESS", 1);
        HISTORY_AND_GUESS = enumC0307008r2;
        EnumC0307008r[] enumC0307008rArr = {enumC0307008r, enumC0307008r2};
        LL = enumC0307008rArr;
        LLILLJJLI = new C2254308sP(enumC0307008rArr);
    }

    public static EnumC0307008r[] values() {
        return (EnumC0307008r[]) LL.clone();
    }

    public static EnumC0307008r valueOf(String str) {
        return (EnumC0307008r) C08FF.LIZ(EnumC0307008r.class, str);
    }

    public EnumC0307008r(String str, int i) {
    }
}
