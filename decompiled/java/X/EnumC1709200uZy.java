package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uZy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1709200uZy {
    public static final EnumC1709200uZy CONTINUE;
    public static final /* synthetic */ EnumC1709200uZy[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1709200uZy PAY_NOW;

    public static InterfaceC2044707zh<EnumC1709200uZy> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1709200uZy enumC1709200uZy = new EnumC1709200uZy("CONTINUE", 0);
        CONTINUE = enumC1709200uZy;
        EnumC1709200uZy enumC1709200uZy2 = new EnumC1709200uZy("PAY_NOW", 1);
        PAY_NOW = enumC1709200uZy2;
        EnumC1709200uZy[] enumC1709200uZyArr = {enumC1709200uZy, enumC1709200uZy2};
        LL = enumC1709200uZyArr;
        LLILLJJLI = new C2254308sP(enumC1709200uZyArr);
    }

    public static EnumC1709200uZy[] values() {
        return (EnumC1709200uZy[]) LL.clone();
    }

    public static EnumC1709200uZy valueOf(String str) {
        return (EnumC1709200uZy) C08FF.LIZ(EnumC1709200uZy.class, str);
    }

    public EnumC1709200uZy(String str, int i) {
    }
}
