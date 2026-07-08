package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0a3w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC920540a3w {
    public static final EnumC920540a3w APPLY;
    public static final EnumC920540a3w INVITE;
    public static final /* synthetic */ EnumC920540a3w[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC920540a3w QUICK_LINKMIC;
    public final String LL;

    public static InterfaceC2044707zh<EnumC920540a3w> getEntries() {
        return LLILLL;
    }

    static {
        EnumC920540a3w enumC920540a3w = new EnumC920540a3w("INVITE", 0, "invite");
        INVITE = enumC920540a3w;
        EnumC920540a3w enumC920540a3w2 = new EnumC920540a3w("APPLY", 1, "apply");
        APPLY = enumC920540a3w2;
        EnumC920540a3w enumC920540a3w3 = new EnumC920540a3w("QUICK_LINKMIC", 2, "quick_linkmic");
        QUICK_LINKMIC = enumC920540a3w3;
        EnumC920540a3w[] enumC920540a3wArr = {enumC920540a3w, enumC920540a3w2, enumC920540a3w3};
        LLILLJJLI = enumC920540a3wArr;
        LLILLL = new C2254308sP(enumC920540a3wArr);
    }

    public static EnumC920540a3w[] values() {
        return (EnumC920540a3w[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC920540a3w valueOf(String str) {
        return (EnumC920540a3w) C08FF.LIZ(EnumC920540a3w.class, str);
    }

    public EnumC920540a3w(String str, int i, String str2) {
        this.LL = str2;
    }
}
