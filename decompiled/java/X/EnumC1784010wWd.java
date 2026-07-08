package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1784010wWd {
    public static final EnumC1784010wWd EDIT;
    public static final /* synthetic */ EnumC1784010wWd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1784010wWd MANAGE;
    public static final EnumC1784010wWd NORMAL;

    public static InterfaceC2044707zh<EnumC1784010wWd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1784010wWd enumC1784010wWd = new EnumC1784010wWd("NORMAL", 0);
        NORMAL = enumC1784010wWd;
        EnumC1784010wWd enumC1784010wWd2 = new EnumC1784010wWd("EDIT", 1);
        EDIT = enumC1784010wWd2;
        EnumC1784010wWd enumC1784010wWd3 = new EnumC1784010wWd("MANAGE", 2);
        MANAGE = enumC1784010wWd3;
        EnumC1784010wWd[] enumC1784010wWdArr = {enumC1784010wWd, enumC1784010wWd2, enumC1784010wWd3};
        LL = enumC1784010wWdArr;
        LLILLJJLI = new C2254308sP(enumC1784010wWdArr);
    }

    public static EnumC1784010wWd[] values() {
        return (EnumC1784010wWd[]) LL.clone();
    }

    public static EnumC1784010wWd valueOf(String str) {
        return (EnumC1784010wWd) C08FF.LIZ(EnumC1784010wWd.class, str);
    }

    public EnumC1784010wWd(String str, int i) {
    }
}
