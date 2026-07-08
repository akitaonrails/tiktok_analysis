package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oaj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC622150Oaj {
    public static final /* synthetic */ EnumC622150Oaj[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC622150Oaj STYLE_ID;
    public static final EnumC622150Oaj STYLE_JSON;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC622150Oaj> getEntries() {
        return LLILZ;
    }

    static {
        EnumC622150Oaj enumC622150Oaj = new EnumC622150Oaj("STYLE_ID", 0, "style_id", "TEXT PRIMARY KEY");
        STYLE_ID = enumC622150Oaj;
        EnumC622150Oaj enumC622150Oaj2 = new EnumC622150Oaj("STYLE_JSON", 1, "style_json", "TEXT");
        STYLE_JSON = enumC622150Oaj2;
        EnumC622150Oaj[] enumC622150OajArr = {enumC622150Oaj, enumC622150Oaj2};
        LLILLL = enumC622150OajArr;
        LLILZ = new C2254308sP(enumC622150OajArr);
    }

    public static EnumC622150Oaj[] values() {
        return (EnumC622150Oaj[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC622150Oaj valueOf(String str) {
        return (EnumC622150Oaj) C08FF.LIZ(EnumC622150Oaj.class, str);
    }

    public EnumC622150Oaj(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
