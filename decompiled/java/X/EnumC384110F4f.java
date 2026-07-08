package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0F4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC384110F4f {
    public static final EnumC384110F4f EDIT_PRO;
    public static final /* synthetic */ EnumC384110F4f[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC384110F4f SWITCH_FILTER;

    public static InterfaceC2044707zh<EnumC384110F4f> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC384110F4f enumC384110F4f = new EnumC384110F4f("EDIT_PRO", 0);
        EDIT_PRO = enumC384110F4f;
        EnumC384110F4f enumC384110F4f2 = new EnumC384110F4f("SWITCH_FILTER", 1);
        SWITCH_FILTER = enumC384110F4f2;
        EnumC384110F4f[] enumC384110F4fArr = {enumC384110F4f, enumC384110F4f2};
        LL = enumC384110F4fArr;
        LLILLJJLI = new C2254308sP(enumC384110F4fArr);
    }

    public static EnumC384110F4f[] values() {
        return (EnumC384110F4f[]) LL.clone();
    }

    public static EnumC384110F4f valueOf(String str) {
        return (EnumC384110F4f) C08FF.LIZ(EnumC384110F4f.class, str);
    }

    public EnumC384110F4f(String str, int i) {
    }
}
