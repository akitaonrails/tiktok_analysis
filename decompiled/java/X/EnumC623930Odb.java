package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Odb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC623930Odb {
    public static final EnumC623930Odb EMPTY_RESULT;
    public static final EnumC623930Odb ERROR;
    public static final /* synthetic */ EnumC623930Odb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC623930Odb LOADING;
    public static final EnumC623930Odb SUCCESS;

    public static InterfaceC2044707zh<EnumC623930Odb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC623930Odb enumC623930Odb = new EnumC623930Odb("LOADING", 0);
        LOADING = enumC623930Odb;
        EnumC623930Odb enumC623930Odb2 = new EnumC623930Odb("SUCCESS", 1);
        SUCCESS = enumC623930Odb2;
        EnumC623930Odb enumC623930Odb3 = new EnumC623930Odb("EMPTY_RESULT", 2);
        EMPTY_RESULT = enumC623930Odb3;
        EnumC623930Odb enumC623930Odb4 = new EnumC623930Odb("ERROR", 3);
        ERROR = enumC623930Odb4;
        EnumC623930Odb[] enumC623930OdbArr = {enumC623930Odb, enumC623930Odb2, enumC623930Odb3, enumC623930Odb4};
        LL = enumC623930OdbArr;
        LLILLJJLI = new C2254308sP(enumC623930OdbArr);
    }

    public static EnumC623930Odb[] values() {
        return (EnumC623930Odb[]) LL.clone();
    }

    public static EnumC623930Odb valueOf(String str) {
        return (EnumC623930Odb) C08FF.LIZ(EnumC623930Odb.class, str);
    }

    public EnumC623930Odb(String str, int i) {
    }
}
