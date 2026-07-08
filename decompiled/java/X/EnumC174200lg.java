package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC174200lg {
    public static final /* synthetic */ EnumC174200lg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC174200lg LONG_PRESS;
    public final String LL = "long_press";

    public static InterfaceC2044707zh<EnumC174200lg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC174200lg enumC174200lg = new EnumC174200lg();
        LONG_PRESS = enumC174200lg;
        EnumC174200lg[] enumC174200lgArr = {enumC174200lg};
        LLILLJJLI = enumC174200lgArr;
        LLILLL = new C2254308sP(enumC174200lgArr);
    }

    public static EnumC174200lg[] values() {
        return (EnumC174200lg[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC174200lg valueOf(String str) {
        return (EnumC174200lg) C08FF.LIZ(EnumC174200lg.class, str);
    }
}
