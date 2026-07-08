package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zhe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1906160zhe {
    public static final EnumC1906160zhe AVATAR;
    public static final EnumC1906160zhe CELL;
    public static final /* synthetic */ EnumC1906160zhe[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1906160zhe USERNAME;

    public static InterfaceC2044707zh<EnumC1906160zhe> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1906160zhe enumC1906160zhe = new EnumC1906160zhe("CELL", 0);
        CELL = enumC1906160zhe;
        EnumC1906160zhe enumC1906160zhe2 = new EnumC1906160zhe("AVATAR", 1);
        AVATAR = enumC1906160zhe2;
        EnumC1906160zhe enumC1906160zhe3 = new EnumC1906160zhe("USERNAME", 2);
        USERNAME = enumC1906160zhe3;
        EnumC1906160zhe[] enumC1906160zheArr = {enumC1906160zhe, enumC1906160zhe2, enumC1906160zhe3};
        LL = enumC1906160zheArr;
        LLILLJJLI = new C2254308sP(enumC1906160zheArr);
    }

    public static EnumC1906160zhe[] values() {
        return (EnumC1906160zhe[]) LL.clone();
    }

    public static EnumC1906160zhe valueOf(String str) {
        return (EnumC1906160zhe) C08FF.LIZ(EnumC1906160zhe.class, str);
    }

    public EnumC1906160zhe(String str, int i) {
    }
}
