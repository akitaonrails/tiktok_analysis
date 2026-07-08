package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iZQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1247580iZQ {
    public static final EnumC1247580iZQ FANS;
    public static final EnumC1247580iZQ FOLLOWING;
    public static final /* synthetic */ EnumC1247580iZQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1247580iZQ OTHER_FANS;
    public static final EnumC1247580iZQ OTHER_FOLLOWING;
    public static final EnumC1247580iZQ UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1247580iZQ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1247580iZQ enumC1247580iZQ = new EnumC1247580iZQ("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC1247580iZQ;
        EnumC1247580iZQ enumC1247580iZQ2 = new EnumC1247580iZQ("FANS", 1, "fans");
        FANS = enumC1247580iZQ2;
        EnumC1247580iZQ enumC1247580iZQ3 = new EnumC1247580iZQ("FOLLOWING", 2, "following");
        FOLLOWING = enumC1247580iZQ3;
        EnumC1247580iZQ enumC1247580iZQ4 = new EnumC1247580iZQ("OTHER_FANS", 3, "other_fans");
        OTHER_FANS = enumC1247580iZQ4;
        EnumC1247580iZQ enumC1247580iZQ5 = new EnumC1247580iZQ("OTHER_FOLLOWING", 4, "other_following");
        OTHER_FOLLOWING = enumC1247580iZQ5;
        EnumC1247580iZQ[] enumC1247580iZQArr = {enumC1247580iZQ, enumC1247580iZQ2, enumC1247580iZQ3, enumC1247580iZQ4, enumC1247580iZQ5};
        LLILLJJLI = enumC1247580iZQArr;
        LLILLL = new C2254308sP(enumC1247580iZQArr);
    }

    public static EnumC1247580iZQ[] values() {
        return (EnumC1247580iZQ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1247580iZQ valueOf(String str) {
        return (EnumC1247580iZQ) C08FF.LIZ(EnumC1247580iZQ.class, str);
    }

    public EnumC1247580iZQ(String str, int i, String str2) {
        this.LL = str2;
    }
}
