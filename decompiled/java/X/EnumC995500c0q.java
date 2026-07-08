package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0c0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC995500c0q {
    public static final /* synthetic */ EnumC995500c0q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC995500c0q RETURN_IN_CURRENT_LIMIT;
    public static final EnumC995500c0q RETURN_IN_FIFTEEN;

    public static InterfaceC2044707zh<EnumC995500c0q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC995500c0q enumC995500c0q = new EnumC995500c0q("RETURN_IN_CURRENT_LIMIT", 0);
        RETURN_IN_CURRENT_LIMIT = enumC995500c0q;
        EnumC995500c0q enumC995500c0q2 = new EnumC995500c0q("RETURN_IN_FIFTEEN", 1);
        RETURN_IN_FIFTEEN = enumC995500c0q2;
        EnumC995500c0q[] enumC995500c0qArr = {enumC995500c0q, enumC995500c0q2};
        LL = enumC995500c0qArr;
        LLILLJJLI = new C2254308sP(enumC995500c0qArr);
    }

    public static EnumC995500c0q[] values() {
        return (EnumC995500c0q[]) LL.clone();
    }

    public static EnumC995500c0q valueOf(String str) {
        return (EnumC995500c0q) C08FF.LIZ(EnumC995500c0q.class, str);
    }

    public EnumC995500c0q(String str, int i) {
    }
}
