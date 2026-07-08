package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fse, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1144180fse {
    public static final EnumC1144180fse COMPLETED;
    public static final EnumC1144180fse CURRENT;
    public static final /* synthetic */ EnumC1144180fse[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1144180fse UPCOMING;

    public static InterfaceC2044707zh<EnumC1144180fse> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1144180fse enumC1144180fse = new EnumC1144180fse("COMPLETED", 0);
        COMPLETED = enumC1144180fse;
        EnumC1144180fse enumC1144180fse2 = new EnumC1144180fse("CURRENT", 1);
        CURRENT = enumC1144180fse2;
        EnumC1144180fse enumC1144180fse3 = new EnumC1144180fse("UPCOMING", 2);
        UPCOMING = enumC1144180fse3;
        EnumC1144180fse[] enumC1144180fseArr = {enumC1144180fse, enumC1144180fse2, enumC1144180fse3};
        LL = enumC1144180fseArr;
        LLILLJJLI = new C2254308sP(enumC1144180fseArr);
    }

    public static EnumC1144180fse[] values() {
        return (EnumC1144180fse[]) LL.clone();
    }

    public static EnumC1144180fse valueOf(String str) {
        return (EnumC1144180fse) C08FF.LIZ(EnumC1144180fse.class, str);
    }

    public EnumC1144180fse(String str, int i) {
    }
}
