package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20542915Zz {
    public static final C20543515a5 Companion;
    public static final EnumC20542915Zz EXPLORE_BUTTON_FIRST;
    public static final EnumC20542915Zz FIFTEEN_MIN_BUTTON;
    public static final /* synthetic */ EnumC20542915Zz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20542915Zz RETURN_BUTTON_FIRST;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20542915Zz> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.15a5] */
    static {
        EnumC20542915Zz enumC20542915Zz = new EnumC20542915Zz("RETURN_BUTTON_FIRST", 0, 0);
        RETURN_BUTTON_FIRST = enumC20542915Zz;
        EnumC20542915Zz enumC20542915Zz2 = new EnumC20542915Zz("EXPLORE_BUTTON_FIRST", 1, 1);
        EXPLORE_BUTTON_FIRST = enumC20542915Zz2;
        EnumC20542915Zz enumC20542915Zz3 = new EnumC20542915Zz("FIFTEEN_MIN_BUTTON", 2, 2);
        FIFTEEN_MIN_BUTTON = enumC20542915Zz3;
        EnumC20542915Zz[] enumC20542915ZzArr = {enumC20542915Zz, enumC20542915Zz2, enumC20542915Zz3};
        LLILLJJLI = enumC20542915ZzArr;
        LLILLL = new C2254308sP(enumC20542915ZzArr);
        Companion = new Object() { // from class: X.15a5
        };
    }

    public static EnumC20542915Zz[] values() {
        return (EnumC20542915Zz[]) LLILLJJLI.clone();
    }

    public final int getI() {
        return this.LL;
    }

    public static EnumC20542915Zz valueOf(String str) {
        return (EnumC20542915Zz) C08FF.LIZ(EnumC20542915Zz.class, str);
    }

    public EnumC20542915Zz(String str, int i, int i2) {
        this.LL = i2;
    }
}
