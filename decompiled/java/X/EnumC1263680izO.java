package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0izO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1263680izO {
    public static final EnumC1263680izO ALL_AUTH;
    public static final EnumC1263680izO CONTACT_ONLY;
    public static final EnumC1263680izO FACEBOOK_ONLY;
    public static final /* synthetic */ EnumC1263680izO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1263680izO ZERO_AUTH;

    public static InterfaceC2044707zh<EnumC1263680izO> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1263680izO enumC1263680izO = new EnumC1263680izO("ZERO_AUTH", 0);
        ZERO_AUTH = enumC1263680izO;
        EnumC1263680izO enumC1263680izO2 = new EnumC1263680izO("CONTACT_ONLY", 1);
        CONTACT_ONLY = enumC1263680izO2;
        EnumC1263680izO enumC1263680izO3 = new EnumC1263680izO("FACEBOOK_ONLY", 2);
        FACEBOOK_ONLY = enumC1263680izO3;
        EnumC1263680izO enumC1263680izO4 = new EnumC1263680izO("ALL_AUTH", 3);
        ALL_AUTH = enumC1263680izO4;
        EnumC1263680izO[] enumC1263680izOArr = {enumC1263680izO, enumC1263680izO2, enumC1263680izO3, enumC1263680izO4};
        LL = enumC1263680izOArr;
        LLILLJJLI = new C2254308sP(enumC1263680izOArr);
    }

    public static EnumC1263680izO[] values() {
        return (EnumC1263680izO[]) LL.clone();
    }

    public static EnumC1263680izO valueOf(String str) {
        return (EnumC1263680izO) C08FF.LIZ(EnumC1263680izO.class, str);
    }

    public EnumC1263680izO(String str, int i) {
    }
}
