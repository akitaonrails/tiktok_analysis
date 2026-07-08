package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QIs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC668160QIs {
    public static final EnumC668160QIs FINISHED;
    public static final EnumC668160QIs INIT;
    public static final /* synthetic */ EnumC668160QIs[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC668160QIs LOADING;

    public static InterfaceC2044707zh<EnumC668160QIs> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC668160QIs enumC668160QIs = new EnumC668160QIs("INIT", 0);
        INIT = enumC668160QIs;
        EnumC668160QIs enumC668160QIs2 = new EnumC668160QIs("LOADING", 1);
        LOADING = enumC668160QIs2;
        EnumC668160QIs enumC668160QIs3 = new EnumC668160QIs("FINISHED", 2);
        FINISHED = enumC668160QIs3;
        EnumC668160QIs[] enumC668160QIsArr = {enumC668160QIs, enumC668160QIs2, enumC668160QIs3};
        LL = enumC668160QIsArr;
        LLILLJJLI = new C2254308sP(enumC668160QIsArr);
    }

    public static EnumC668160QIs[] values() {
        return (EnumC668160QIs[]) LL.clone();
    }

    public static EnumC668160QIs valueOf(String str) {
        return (EnumC668160QIs) C08FF.LIZ(EnumC668160QIs.class, str);
    }

    public EnumC668160QIs(String str, int i) {
    }
}
