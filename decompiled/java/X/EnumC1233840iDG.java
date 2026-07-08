package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iDG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1233840iDG {
    public static final EnumC1233840iDG EMAIL;
    public static final /* synthetic */ EnumC1233840iDG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1233840iDG PASSWORD;
    public static final EnumC1233840iDG SMS;
    public static final EnumC1233840iDG TOTP;

    public static InterfaceC2044707zh<EnumC1233840iDG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1233840iDG enumC1233840iDG = new EnumC1233840iDG("SMS", 0);
        SMS = enumC1233840iDG;
        EnumC1233840iDG enumC1233840iDG2 = new EnumC1233840iDG("EMAIL", 1);
        EMAIL = enumC1233840iDG2;
        EnumC1233840iDG enumC1233840iDG3 = new EnumC1233840iDG("TOTP", 2);
        TOTP = enumC1233840iDG3;
        EnumC1233840iDG enumC1233840iDG4 = new EnumC1233840iDG("PASSWORD", 3);
        PASSWORD = enumC1233840iDG4;
        EnumC1233840iDG[] enumC1233840iDGArr = {enumC1233840iDG, enumC1233840iDG2, enumC1233840iDG3, enumC1233840iDG4};
        LL = enumC1233840iDGArr;
        LLILLJJLI = new C2254308sP(enumC1233840iDGArr);
    }

    public static EnumC1233840iDG[] values() {
        return (EnumC1233840iDG[]) LL.clone();
    }

    public static EnumC1233840iDG valueOf(String str) {
        return (EnumC1233840iDG) C08FF.LIZ(EnumC1233840iDG.class, str);
    }

    public EnumC1233840iDG(String str, int i) {
    }
}
