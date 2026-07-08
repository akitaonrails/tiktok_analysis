package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1221200hss {
    public static final /* synthetic */ EnumC1221200hss[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1221200hss MULTIPLE_HORIZONTAL;
    public static final EnumC1221200hss MULTIPLE_VERTICAL;
    public static final EnumC1221200hss SINGLE;

    public static InterfaceC2044707zh<EnumC1221200hss> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1221200hss enumC1221200hss = new EnumC1221200hss("SINGLE", 0);
        SINGLE = enumC1221200hss;
        EnumC1221200hss enumC1221200hss2 = new EnumC1221200hss("MULTIPLE_HORIZONTAL", 1);
        MULTIPLE_HORIZONTAL = enumC1221200hss2;
        EnumC1221200hss enumC1221200hss3 = new EnumC1221200hss("MULTIPLE_VERTICAL", 2);
        MULTIPLE_VERTICAL = enumC1221200hss3;
        EnumC1221200hss[] enumC1221200hssArr = {enumC1221200hss, enumC1221200hss2, enumC1221200hss3};
        LL = enumC1221200hssArr;
        LLILLJJLI = new C2254308sP(enumC1221200hssArr);
    }

    public static EnumC1221200hss[] values() {
        return (EnumC1221200hss[]) LL.clone();
    }

    public static EnumC1221200hss valueOf(String str) {
        return (EnumC1221200hss) C08FF.LIZ(EnumC1221200hss.class, str);
    }

    public EnumC1221200hss(String str, int i) {
    }
}
