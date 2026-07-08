package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0k6y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1306820k6y {
    public static final EnumC1306820k6y COLD_START;
    public static final /* synthetic */ EnumC1306820k6y[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1306820k6y START_LIVE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1306820k6y> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1306820k6y enumC1306820k6y = new EnumC1306820k6y("COLD_START", 0, "cold_start");
        COLD_START = enumC1306820k6y;
        EnumC1306820k6y enumC1306820k6y2 = new EnumC1306820k6y("START_LIVE", 1, "start_live");
        START_LIVE = enumC1306820k6y2;
        EnumC1306820k6y[] enumC1306820k6yArr = {enumC1306820k6y, enumC1306820k6y2};
        LLILLJJLI = enumC1306820k6yArr;
        LLILLL = new C2254308sP(enumC1306820k6yArr);
    }

    public static EnumC1306820k6y[] values() {
        return (EnumC1306820k6y[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1306820k6y valueOf(String str) {
        return (EnumC1306820k6y) C08FF.LIZ(EnumC1306820k6y.class, str);
    }

    public EnumC1306820k6y(String str, int i, String str2) {
        this.LL = str2;
    }
}
