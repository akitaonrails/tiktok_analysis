package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eju, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1100320eju {
    public static final EnumC1100320eju COLLAPSE;
    public static final EnumC1100320eju EXPAND;
    public static final /* synthetic */ EnumC1100320eju[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1100320eju> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1100320eju enumC1100320eju = new EnumC1100320eju("EXPAND", 0);
        EXPAND = enumC1100320eju;
        EnumC1100320eju enumC1100320eju2 = new EnumC1100320eju("COLLAPSE", 1);
        COLLAPSE = enumC1100320eju2;
        EnumC1100320eju[] enumC1100320ejuArr = {enumC1100320eju, enumC1100320eju2};
        LL = enumC1100320ejuArr;
        LLILLJJLI = new C2254308sP(enumC1100320ejuArr);
    }

    public static EnumC1100320eju[] values() {
        return (EnumC1100320eju[]) LL.clone();
    }

    public static EnumC1100320eju valueOf(String str) {
        return (EnumC1100320eju) C08FF.LIZ(EnumC1100320eju.class, str);
    }

    public EnumC1100320eju(String str, int i) {
    }
}
