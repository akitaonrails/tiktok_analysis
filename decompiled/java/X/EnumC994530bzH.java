package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994530bzH {
    public static final EnumC994530bzH LL;
    public static final EnumC994530bzH LLILLJJLI;
    public static final /* synthetic */ EnumC994530bzH[] LLILLL;

    static {
        EnumC994530bzH enumC994530bzH = new EnumC994530bzH("NORMAL", 0);
        LL = enumC994530bzH;
        EnumC994530bzH enumC994530bzH2 = new EnumC994530bzH("COUNTDOWN", 1);
        LLILLJJLI = enumC994530bzH2;
        EnumC994530bzH[] enumC994530bzHArr = {enumC994530bzH, enumC994530bzH2};
        LLILLL = enumC994530bzHArr;
        new C2254308sP(enumC994530bzHArr);
    }

    public static EnumC994530bzH[] values() {
        return (EnumC994530bzH[]) LLILLL.clone();
    }

    public static EnumC994530bzH valueOf(String str) {
        return (EnumC994530bzH) C08FF.LIZ(EnumC994530bzH.class, str);
    }

    public EnumC994530bzH(String str, int i) {
    }
}
