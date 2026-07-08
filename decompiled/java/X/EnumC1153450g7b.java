package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1153450g7b {
    public static final EnumC1153450g7b CELL;
    public static final /* synthetic */ EnumC1153450g7b[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1153450g7b SENSOR;
    public static final EnumC1153450g7b WIFI;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1153450g7b> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1153450g7b enumC1153450g7b = new EnumC1153450g7b("WIFI", 0, "wifi");
        WIFI = enumC1153450g7b;
        EnumC1153450g7b enumC1153450g7b2 = new EnumC1153450g7b("CELL", 1, "cell");
        CELL = enumC1153450g7b2;
        EnumC1153450g7b enumC1153450g7b3 = new EnumC1153450g7b("SENSOR", 2, "sensor");
        SENSOR = enumC1153450g7b3;
        EnumC1153450g7b[] enumC1153450g7bArr = {enumC1153450g7b, enumC1153450g7b2, enumC1153450g7b3};
        LLILLJJLI = enumC1153450g7bArr;
        LLILLL = new C2254308sP(enumC1153450g7bArr);
    }

    public static EnumC1153450g7b[] values() {
        return (EnumC1153450g7b[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC1153450g7b valueOf(String str) {
        return (EnumC1153450g7b) C08FF.LIZ(EnumC1153450g7b.class, str);
    }

    public EnumC1153450g7b(String str, int i, String str2) {
        this.LL = str2;
    }
}
