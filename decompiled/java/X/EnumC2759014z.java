package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.014z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2759014z {
    public static final EnumC2759014z ACCEPT_AND_SHOW;
    public static final EnumC2759014z DELETE_AND_HIDE;
    public static final EnumC2759014z IGNORE_AND_SHOW_PREVIOUS;
    public static final /* synthetic */ EnumC2759014z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2759014z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2759014z enumC2759014z = new EnumC2759014z("ACCEPT_AND_SHOW", 0);
        ACCEPT_AND_SHOW = enumC2759014z;
        EnumC2759014z enumC2759014z2 = new EnumC2759014z("DELETE_AND_HIDE", 1);
        DELETE_AND_HIDE = enumC2759014z2;
        EnumC2759014z enumC2759014z3 = new EnumC2759014z("IGNORE_AND_SHOW_PREVIOUS", 2);
        IGNORE_AND_SHOW_PREVIOUS = enumC2759014z3;
        EnumC2759014z[] enumC2759014zArr = {enumC2759014z, enumC2759014z2, enumC2759014z3};
        LL = enumC2759014zArr;
        LLILLJJLI = new C2254308sP(enumC2759014zArr);
    }

    public static EnumC2759014z[] values() {
        return (EnumC2759014z[]) LL.clone();
    }

    public static EnumC2759014z valueOf(String str) {
        return (EnumC2759014z) C08FF.LIZ(EnumC2759014z.class, str);
    }

    public EnumC2759014z(String str, int i) {
    }
}
