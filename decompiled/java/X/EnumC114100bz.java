package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00bz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC114100bz {
    public static final EnumC114100bz BUTTON_ARROW;
    public static final EnumC114100bz BUTTON_CTA;
    public static final /* synthetic */ EnumC114100bz[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC114100bz> getEntries() {
        return LLILLL;
    }

    static {
        EnumC114100bz enumC114100bz = new EnumC114100bz("BUTTON_ARROW", 0, 1);
        BUTTON_ARROW = enumC114100bz;
        EnumC114100bz enumC114100bz2 = new EnumC114100bz("BUTTON_CTA", 1, 2);
        BUTTON_CTA = enumC114100bz2;
        EnumC114100bz[] enumC114100bzArr = {enumC114100bz, enumC114100bz2};
        LLILLJJLI = enumC114100bzArr;
        LLILLL = new C2254308sP(enumC114100bzArr);
    }

    public static EnumC114100bz[] values() {
        return (EnumC114100bz[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC114100bz valueOf(String str) {
        return (EnumC114100bz) C08FF.LIZ(EnumC114100bz.class, str);
    }

    public EnumC114100bz(String str, int i, int i2) {
        this.LL = i2;
    }
}
