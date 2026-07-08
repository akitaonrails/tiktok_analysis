package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ixP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1262450ixP {
    public static final C1262460ixQ Companion;
    public static final /* synthetic */ EnumC1262450ixP[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1262450ixP TT_INBOX_NEW_FOLLOWER;
    public static final EnumC1262450ixP TT_NOW;
    public static final EnumC1262450ixP TT_NOW_INVITE_FRIEND;
    public static final EnumC1262450ixP TT_PUBLISH_VISIBILITY_PAGE;
    public static final EnumC1262450ixP TT_RELATION_PAGE;
    public static final EnumC1262450ixP TT_SSH_FRIEND;
    public static final EnumC1262450ixP UNKNOWN;
    public final int LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1262450ixP> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0ixQ] */
    static {
        EnumC1262450ixP enumC1262450ixP = new EnumC1262450ixP("TT_NOW", 0, 1, true);
        TT_NOW = enumC1262450ixP;
        EnumC1262450ixP enumC1262450ixP2 = new EnumC1262450ixP("TT_NOW_INVITE_FRIEND", 1, 4, true);
        TT_NOW_INVITE_FRIEND = enumC1262450ixP2;
        EnumC1262450ixP enumC1262450ixP3 = new EnumC1262450ixP("TT_INBOX_NEW_FOLLOWER", 2, 5, true);
        TT_INBOX_NEW_FOLLOWER = enumC1262450ixP3;
        EnumC1262450ixP enumC1262450ixP4 = new EnumC1262450ixP("TT_RELATION_PAGE", 3, 6, true);
        TT_RELATION_PAGE = enumC1262450ixP4;
        EnumC1262450ixP enumC1262450ixP5 = new EnumC1262450ixP("TT_SSH_FRIEND", 4, 8, false);
        TT_SSH_FRIEND = enumC1262450ixP5;
        EnumC1262450ixP enumC1262450ixP6 = new EnumC1262450ixP("TT_PUBLISH_VISIBILITY_PAGE", 5, 9, false);
        TT_PUBLISH_VISIBILITY_PAGE = enumC1262450ixP6;
        EnumC1262450ixP enumC1262450ixP7 = new EnumC1262450ixP("UNKNOWN", 6, -1, true);
        UNKNOWN = enumC1262450ixP7;
        EnumC1262450ixP[] enumC1262450ixPArr = {enumC1262450ixP, enumC1262450ixP2, enumC1262450ixP3, enumC1262450ixP4, enumC1262450ixP5, enumC1262450ixP6, enumC1262450ixP7};
        LLILLL = enumC1262450ixPArr;
        LLILZ = new C2254308sP(enumC1262450ixPArr);
        Companion = new Object() { // from class: X.0ixQ
        };
    }

    public static EnumC1262450ixP[] values() {
        return (EnumC1262450ixP[]) LLILLL.clone();
    }

    public final boolean getRecommendedCardEnabled() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1262450ixP valueOf(String str) {
        return (EnumC1262450ixP) C08FF.LIZ(EnumC1262450ixP.class, str);
    }

    public EnumC1262450ixP(String str, int i, int i2, boolean z) {
        this.LL = i2;
        this.LLILLJJLI = z;
    }
}
