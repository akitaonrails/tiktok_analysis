package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pKG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1507260pKG {
    public static final EnumC1507260pKG CLIENT_CONFIG;
    public static final EnumC1507260pKG GECKO_REMOTE_CONFIG;
    public static final EnumC1507260pKG INJECT_PREFIX;
    public static final /* synthetic */ EnumC1507260pKG[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1507260pKG SPARK_MANIFEST;
    public static final EnumC1507260pKG URL_QUERY;

    public static InterfaceC2044707zh<EnumC1507260pKG> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1507260pKG enumC1507260pKG = new EnumC1507260pKG("URL_QUERY", 0);
        URL_QUERY = enumC1507260pKG;
        EnumC1507260pKG enumC1507260pKG2 = new EnumC1507260pKG("CLIENT_CONFIG", 1);
        CLIENT_CONFIG = enumC1507260pKG2;
        EnumC1507260pKG enumC1507260pKG3 = new EnumC1507260pKG("INJECT_PREFIX", 2);
        INJECT_PREFIX = enumC1507260pKG3;
        EnumC1507260pKG enumC1507260pKG4 = new EnumC1507260pKG("SPARK_MANIFEST", 3);
        SPARK_MANIFEST = enumC1507260pKG4;
        EnumC1507260pKG enumC1507260pKG5 = new EnumC1507260pKG("GECKO_REMOTE_CONFIG", 4);
        GECKO_REMOTE_CONFIG = enumC1507260pKG5;
        EnumC1507260pKG[] enumC1507260pKGArr = {enumC1507260pKG, enumC1507260pKG2, enumC1507260pKG3, enumC1507260pKG4, enumC1507260pKG5};
        LL = enumC1507260pKGArr;
        LLILLJJLI = new C2254308sP(enumC1507260pKGArr);
    }

    public static EnumC1507260pKG[] values() {
        return (EnumC1507260pKG[]) LL.clone();
    }

    public static EnumC1507260pKG valueOf(String str) {
        return (EnumC1507260pKG) C08FF.LIZ(EnumC1507260pKG.class, str);
    }

    public EnumC1507260pKG(String str, int i) {
    }
}
