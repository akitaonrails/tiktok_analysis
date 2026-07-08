package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC538450L9v {
    public static final EnumC538450L9v GUIDING;
    public static final EnumC538450L9v HIDING;
    public static final /* synthetic */ EnumC538450L9v[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC538450L9v NONE;
    public static final EnumC538450L9v SHOWING;

    public static InterfaceC2044707zh<EnumC538450L9v> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC538450L9v enumC538450L9v = new EnumC538450L9v("HIDING", 0);
        HIDING = enumC538450L9v;
        EnumC538450L9v enumC538450L9v2 = new EnumC538450L9v("SHOWING", 1);
        SHOWING = enumC538450L9v2;
        EnumC538450L9v enumC538450L9v3 = new EnumC538450L9v("GUIDING", 2);
        GUIDING = enumC538450L9v3;
        EnumC538450L9v enumC538450L9v4 = new EnumC538450L9v("NONE", 3);
        NONE = enumC538450L9v4;
        EnumC538450L9v[] enumC538450L9vArr = {enumC538450L9v, enumC538450L9v2, enumC538450L9v3, enumC538450L9v4};
        LL = enumC538450L9vArr;
        LLILLJJLI = new C2254308sP(enumC538450L9vArr);
    }

    public static EnumC538450L9v[] values() {
        return (EnumC538450L9v[]) LL.clone();
    }

    public static EnumC538450L9v valueOf(String str) {
        return (EnumC538450L9v) C08FF.LIZ(EnumC538450L9v.class, str);
    }

    public EnumC538450L9v(String str, int i) {
    }
}
