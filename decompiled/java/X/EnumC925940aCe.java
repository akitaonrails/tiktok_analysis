package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aCe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC925940aCe {
    public static final EnumC925940aCe LINKED;
    public static final /* synthetic */ EnumC925940aCe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC925940aCe UNKNOWN;
    public static final EnumC925940aCe WAITING_APPLY;

    public static InterfaceC2044707zh<EnumC925940aCe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC925940aCe enumC925940aCe = new EnumC925940aCe("UNKNOWN", 0);
        UNKNOWN = enumC925940aCe;
        EnumC925940aCe enumC925940aCe2 = new EnumC925940aCe("LINKED", 1);
        LINKED = enumC925940aCe2;
        EnumC925940aCe enumC925940aCe3 = new EnumC925940aCe("WAITING_APPLY", 2);
        WAITING_APPLY = enumC925940aCe3;
        EnumC925940aCe[] enumC925940aCeArr = {enumC925940aCe, enumC925940aCe2, enumC925940aCe3};
        LL = enumC925940aCeArr;
        LLILLJJLI = new C2254308sP(enumC925940aCeArr);
    }

    public static EnumC925940aCe[] values() {
        return (EnumC925940aCe[]) LL.clone();
    }

    public static EnumC925940aCe valueOf(String str) {
        return (EnumC925940aCe) C08FF.LIZ(EnumC925940aCe.class, str);
    }

    public EnumC925940aCe(String str, int i) {
    }
}
