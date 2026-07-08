package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11Uf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19508711Uf {
    public static final EnumC19508711Uf LL;
    public static final EnumC19508711Uf LLILLJJLI;
    public static final EnumC19508711Uf LLILLL;
    public static final EnumC19508711Uf LLILZ;
    public static final /* synthetic */ EnumC19508711Uf[] LLILZIL;

    static {
        EnumC19508711Uf enumC19508711Uf = new EnumC19508711Uf("UNKNOWN", 0);
        LL = enumC19508711Uf;
        EnumC19508711Uf enumC19508711Uf2 = new EnumC19508711Uf("DOWNLOADING", 1);
        LLILLJJLI = enumC19508711Uf2;
        EnumC19508711Uf enumC19508711Uf3 = new EnumC19508711Uf("DOWNLOADED", 2);
        LLILLL = enumC19508711Uf3;
        EnumC19508711Uf enumC19508711Uf4 = new EnumC19508711Uf("INSTALLED", 3);
        LLILZ = enumC19508711Uf4;
        EnumC19508711Uf[] enumC19508711UfArr = {enumC19508711Uf, enumC19508711Uf2, enumC19508711Uf3, enumC19508711Uf4};
        LLILZIL = enumC19508711UfArr;
        new C2254308sP(enumC19508711UfArr);
    }

    public static EnumC19508711Uf[] values() {
        return (EnumC19508711Uf[]) LLILZIL.clone();
    }

    public static EnumC19508711Uf valueOf(String str) {
        return (EnumC19508711Uf) C08FF.LIZ(EnumC19508711Uf.class, str);
    }

    public EnumC19508711Uf(String str, int i) {
    }
}
