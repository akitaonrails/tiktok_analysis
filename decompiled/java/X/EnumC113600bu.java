package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC113600bu {
    public static final EnumC113600bu HIDE;
    public static final /* synthetic */ EnumC113600bu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC113600bu SHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC113600bu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC113600bu enumC113600bu = new EnumC113600bu("HIDE", 0, 0);
        HIDE = enumC113600bu;
        EnumC113600bu enumC113600bu2 = new EnumC113600bu("SHOW", 1, 1);
        SHOW = enumC113600bu2;
        EnumC113600bu[] enumC113600buArr = {enumC113600bu, enumC113600bu2};
        LLILLJJLI = enumC113600buArr;
        LLILLL = new C2254308sP(enumC113600buArr);
    }

    public static EnumC113600bu[] values() {
        return (EnumC113600bu[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC113600bu valueOf(String str) {
        return (EnumC113600bu) C08FF.LIZ(EnumC113600bu.class, str);
    }

    public EnumC113600bu(String str, int i, int i2) {
        this.LL = i2;
    }
}
