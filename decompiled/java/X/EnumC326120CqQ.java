package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CqQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC326120CqQ {
    public static final EnumC326120CqQ LEADERBOARD;
    public static final /* synthetic */ EnumC326120CqQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC326120CqQ MOVIE_TOK;
    public static final EnumC326120CqQ SPOTLIGHT_IP;
    public static final EnumC326120CqQ UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC326120CqQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC326120CqQ enumC326120CqQ = new EnumC326120CqQ("UNKNOWN", 0, 0);
        UNKNOWN = enumC326120CqQ;
        EnumC326120CqQ enumC326120CqQ2 = new EnumC326120CqQ("LEADERBOARD", 1, 3);
        LEADERBOARD = enumC326120CqQ2;
        EnumC326120CqQ enumC326120CqQ3 = new EnumC326120CqQ("SPOTLIGHT_IP", 2, 2);
        SPOTLIGHT_IP = enumC326120CqQ3;
        EnumC326120CqQ enumC326120CqQ4 = new EnumC326120CqQ("MOVIE_TOK", 3, 1);
        MOVIE_TOK = enumC326120CqQ4;
        EnumC326120CqQ[] enumC326120CqQArr = {enumC326120CqQ, enumC326120CqQ2, enumC326120CqQ3, enumC326120CqQ4};
        LLILLJJLI = enumC326120CqQArr;
        LLILLL = new C2254308sP(enumC326120CqQArr);
    }

    public static EnumC326120CqQ[] values() {
        return (EnumC326120CqQ[]) LLILLJJLI.clone();
    }

    public final int getCollectionItemType() {
        return this.LL;
    }

    public static EnumC326120CqQ valueOf(String str) {
        return (EnumC326120CqQ) C08FF.LIZ(EnumC326120CqQ.class, str);
    }

    public EnumC326120CqQ(String str, int i, int i2) {
        this.LL = i2;
    }
}
