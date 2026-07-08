package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2007707tj {
    public static final EnumC2007707tj HAVE_ICON;
    public static final /* synthetic */ EnumC2007707tj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2007707tj NO_ICON;

    public static InterfaceC2044707zh<EnumC2007707tj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2007707tj enumC2007707tj = new EnumC2007707tj("HAVE_ICON", 0);
        HAVE_ICON = enumC2007707tj;
        EnumC2007707tj enumC2007707tj2 = new EnumC2007707tj("NO_ICON", 1);
        NO_ICON = enumC2007707tj2;
        EnumC2007707tj[] enumC2007707tjArr = {enumC2007707tj, enumC2007707tj2};
        LL = enumC2007707tjArr;
        LLILLJJLI = new C2254308sP(enumC2007707tjArr);
    }

    public static EnumC2007707tj[] values() {
        return (EnumC2007707tj[]) LL.clone();
    }

    public static EnumC2007707tj valueOf(String str) {
        return (EnumC2007707tj) C08FF.LIZ(EnumC2007707tj.class, str);
    }

    public EnumC2007707tj(String str, int i) {
    }
}
