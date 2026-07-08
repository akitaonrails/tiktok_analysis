package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0pmQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1524720pmQ {
    public static final C1525250pnH LL;
    public static final EnumC1524720pmQ LLILLJJLI;
    public static final EnumC1524720pmQ LLILLL;
    public static final EnumC1524720pmQ LLILZ;
    public static final /* synthetic */ EnumC1524720pmQ[] LLILZIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0pnH] */
    static {
        EnumC1524720pmQ enumC1524720pmQ = new EnumC1524720pmQ("SEND", 0, "send");
        LLILLJJLI = enumC1524720pmQ;
        EnumC1524720pmQ enumC1524720pmQ2 = new EnumC1524720pmQ("CLOSE", 1, "close");
        LLILLL = enumC1524720pmQ2;
        EnumC1524720pmQ enumC1524720pmQ3 = new EnumC1524720pmQ("UNKNOWN", 2, "unknown");
        LLILZ = enumC1524720pmQ3;
        EnumC1524720pmQ[] enumC1524720pmQArr = {enumC1524720pmQ, enumC1524720pmQ2, enumC1524720pmQ3};
        LLILZIL = enumC1524720pmQArr;
        new C2254308sP(enumC1524720pmQArr);
        LL = new Object() { // from class: X.0pnH
        };
    }

    public static EnumC1524720pmQ[] values() {
        return (EnumC1524720pmQ[]) LLILZIL.clone();
    }

    public static EnumC1524720pmQ valueOf(String str) {
        return (EnumC1524720pmQ) C08FF.LIZ(EnumC1524720pmQ.class, str);
    }

    public EnumC1524720pmQ(String str, int i, String str2) {
    }
}
