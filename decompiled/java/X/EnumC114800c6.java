package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00c6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC114800c6 {
    public static final EnumC114800c6 CONTACT_MODULE;
    public static final /* synthetic */ EnumC114800c6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC114800c6 RELATION_MODEL;

    public static InterfaceC2044707zh<EnumC114800c6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC114800c6 enumC114800c6 = new EnumC114800c6("RELATION_MODEL", 0);
        RELATION_MODEL = enumC114800c6;
        EnumC114800c6 enumC114800c62 = new EnumC114800c6("CONTACT_MODULE", 1);
        CONTACT_MODULE = enumC114800c62;
        EnumC114800c6[] enumC114800c6Arr = {enumC114800c6, enumC114800c62};
        LL = enumC114800c6Arr;
        LLILLJJLI = new C2254308sP(enumC114800c6Arr);
    }

    public static EnumC114800c6[] values() {
        return (EnumC114800c6[]) LL.clone();
    }

    public static EnumC114800c6 valueOf(String str) {
        return (EnumC114800c6) C08FF.LIZ(EnumC114800c6.class, str);
    }

    public EnumC114800c6(String str, int i) {
    }
}
