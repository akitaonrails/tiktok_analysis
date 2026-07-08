package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC934000aPe {
    public static final EnumC934000aPe ANCHOR;
    public static final EnumC934000aPe AUDIENCE;
    public static final EnumC934000aPe GUEST;
    public static final /* synthetic */ EnumC934000aPe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC934000aPe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC934000aPe enumC934000aPe = new EnumC934000aPe("ANCHOR", 0);
        ANCHOR = enumC934000aPe;
        EnumC934000aPe enumC934000aPe2 = new EnumC934000aPe("GUEST", 1);
        GUEST = enumC934000aPe2;
        EnumC934000aPe enumC934000aPe3 = new EnumC934000aPe("AUDIENCE", 2);
        AUDIENCE = enumC934000aPe3;
        EnumC934000aPe[] enumC934000aPeArr = {enumC934000aPe, enumC934000aPe2, enumC934000aPe3};
        LL = enumC934000aPeArr;
        LLILLJJLI = new C2254308sP(enumC934000aPeArr);
    }

    public static EnumC934000aPe[] values() {
        return (EnumC934000aPe[]) LL.clone();
    }

    public static EnumC934000aPe valueOf(String str) {
        return (EnumC934000aPe) C08FF.LIZ(EnumC934000aPe.class, str);
    }

    public EnumC934000aPe(String str, int i) {
    }
}
