package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iOr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1241030iOr {
    public static final EnumC1241030iOr ADD;
    public static final /* synthetic */ EnumC1241030iOr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1241030iOr REPLACE;
    public static final EnumC1241030iOr UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1241030iOr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1241030iOr enumC1241030iOr = new EnumC1241030iOr("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC1241030iOr;
        EnumC1241030iOr enumC1241030iOr2 = new EnumC1241030iOr("ADD", 1, "add");
        ADD = enumC1241030iOr2;
        EnumC1241030iOr enumC1241030iOr3 = new EnumC1241030iOr("REPLACE", 2, "replace");
        REPLACE = enumC1241030iOr3;
        EnumC1241030iOr[] enumC1241030iOrArr = {enumC1241030iOr, enumC1241030iOr2, enumC1241030iOr3};
        LLILLJJLI = enumC1241030iOrArr;
        LLILLL = new C2254308sP(enumC1241030iOrArr);
    }

    public static EnumC1241030iOr[] values() {
        return (EnumC1241030iOr[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1241030iOr valueOf(String str) {
        return (EnumC1241030iOr) C08FF.LIZ(EnumC1241030iOr.class, str);
    }

    public EnumC1241030iOr(String str, int i, String str2) {
        this.LL = str2;
    }
}
