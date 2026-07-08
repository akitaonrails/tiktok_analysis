package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ucd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC776210Ucd {
    public static final EnumC776210Ucd LL;
    public static final EnumC776210Ucd LLILLJJLI;
    public static final EnumC776210Ucd LLILLL;
    public static final /* synthetic */ EnumC776210Ucd[] LLILZ;

    static {
        EnumC776210Ucd enumC776210Ucd = new EnumC776210Ucd("ENTER_PAGE", 0);
        LL = enumC776210Ucd;
        EnumC776210Ucd enumC776210Ucd2 = new EnumC776210Ucd("GO_ON_LIVE", 1);
        LLILLJJLI = enumC776210Ucd2;
        EnumC776210Ucd enumC776210Ucd3 = new EnumC776210Ucd("END_LIVE", 2);
        LLILLL = enumC776210Ucd3;
        EnumC776210Ucd[] enumC776210UcdArr = {enumC776210Ucd, enumC776210Ucd2, enumC776210Ucd3};
        LLILZ = enumC776210UcdArr;
        new C2254308sP(enumC776210UcdArr);
    }

    public static EnumC776210Ucd[] values() {
        return (EnumC776210Ucd[]) LLILZ.clone();
    }

    public static EnumC776210Ucd valueOf(String str) {
        return (EnumC776210Ucd) C08FF.LIZ(EnumC776210Ucd.class, str);
    }

    public EnumC776210Ucd(String str, int i) {
    }
}
