package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779750wPl {
    public static final EnumC1779750wPl AVATAR_LOAD;
    public static final EnumC1779750wPl COVER_LOAD;
    public static final EnumC1779750wPl DATA_LOAD;
    public static final /* synthetic */ EnumC1779750wPl[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1779750wPl> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779750wPl enumC1779750wPl = new EnumC1779750wPl("DATA_LOAD", 0, "data_load");
        DATA_LOAD = enumC1779750wPl;
        EnumC1779750wPl enumC1779750wPl2 = new EnumC1779750wPl("COVER_LOAD", 1, "cover_load");
        COVER_LOAD = enumC1779750wPl2;
        EnumC1779750wPl enumC1779750wPl3 = new EnumC1779750wPl("AVATAR_LOAD", 2, "avatar_load");
        AVATAR_LOAD = enumC1779750wPl3;
        EnumC1779750wPl[] enumC1779750wPlArr = {enumC1779750wPl, enumC1779750wPl2, enumC1779750wPl3};
        LLILLJJLI = enumC1779750wPlArr;
        LLILLL = new C2254308sP(enumC1779750wPlArr);
    }

    public static EnumC1779750wPl[] values() {
        return (EnumC1779750wPl[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1779750wPl valueOf(String str) {
        return (EnumC1779750wPl) C08FF.LIZ(EnumC1779750wPl.class, str);
    }

    public EnumC1779750wPl(String str, int i, String str2) {
        this.LL = str2;
    }
}
