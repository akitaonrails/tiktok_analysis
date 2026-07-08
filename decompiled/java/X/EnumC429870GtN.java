package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0GtN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC429870GtN {
    public static final /* synthetic */ EnumC429870GtN[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC429870GtN NONE;
    public static final EnumC429870GtN NOTE_GUIDE;
    public static final EnumC429870GtN REAL_NOTE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC429870GtN> getEntries() {
        return LLILLL;
    }

    static {
        EnumC429870GtN enumC429870GtN = new EnumC429870GtN("NONE", 0, 0);
        NONE = enumC429870GtN;
        EnumC429870GtN enumC429870GtN2 = new EnumC429870GtN("REAL_NOTE", 1, 1);
        REAL_NOTE = enumC429870GtN2;
        EnumC429870GtN enumC429870GtN3 = new EnumC429870GtN("NOTE_GUIDE", 2, 2);
        NOTE_GUIDE = enumC429870GtN3;
        EnumC429870GtN[] enumC429870GtNArr = {enumC429870GtN, enumC429870GtN2, enumC429870GtN3};
        LLILLJJLI = enumC429870GtNArr;
        LLILLL = new C2254308sP(enumC429870GtNArr);
    }

    public static EnumC429870GtN[] values() {
        return (EnumC429870GtN[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC429870GtN valueOf(String str) {
        return (EnumC429870GtN) C08FF.LIZ(EnumC429870GtN.class, str);
    }

    public EnumC429870GtN(String str, int i, int i2) {
        this.LL = i2;
    }
}
