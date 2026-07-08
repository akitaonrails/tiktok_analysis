package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC040300Cj {
    public static final /* synthetic */ EnumC040300Cj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC040300Cj LYNX;
    public static final EnumC040300Cj NATIVE;
    public static final EnumC040300Cj WEB;

    public static InterfaceC2044707zh<EnumC040300Cj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC040300Cj enumC040300Cj = new EnumC040300Cj("NATIVE", 0);
        NATIVE = enumC040300Cj;
        EnumC040300Cj enumC040300Cj2 = new EnumC040300Cj("WEB", 1);
        WEB = enumC040300Cj2;
        EnumC040300Cj enumC040300Cj3 = new EnumC040300Cj("LYNX", 2);
        LYNX = enumC040300Cj3;
        EnumC040300Cj[] enumC040300CjArr = {enumC040300Cj, enumC040300Cj2, enumC040300Cj3};
        LL = enumC040300CjArr;
        LLILLJJLI = new C2254308sP(enumC040300CjArr);
    }

    public static EnumC040300Cj[] values() {
        return (EnumC040300Cj[]) LL.clone();
    }

    public static EnumC040300Cj valueOf(String str) {
        return (EnumC040300Cj) C08FF.LIZ(EnumC040300Cj.class, str);
    }

    public EnumC040300Cj(String str, int i) {
    }
}
