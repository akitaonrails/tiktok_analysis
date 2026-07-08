package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zid, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1906770zid {
    public static final EnumC1906770zid ACTIVITY;
    public static final EnumC1906770zid AGGREGATE;
    public static final EnumC1906770zid FOLLOWER;
    public static final EnumC1906770zid INBOX;
    public static final /* synthetic */ EnumC1906770zid[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1906770zid OTHER;
    public static final EnumC1906770zid SEARCH;
    public static final EnumC1906770zid SYSTEM;
    public static final EnumC1906770zid THIRD_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1906770zid> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1906770zid enumC1906770zid = new EnumC1906770zid("ACTIVITY", 0, "activity");
        ACTIVITY = enumC1906770zid;
        EnumC1906770zid enumC1906770zid2 = new EnumC1906770zid("FOLLOWER", 1, "follower");
        FOLLOWER = enumC1906770zid2;
        EnumC1906770zid enumC1906770zid3 = new EnumC1906770zid("SYSTEM", 2, "system");
        SYSTEM = enumC1906770zid3;
        EnumC1906770zid enumC1906770zid4 = new EnumC1906770zid("INBOX", 3, "inbox");
        INBOX = enumC1906770zid4;
        EnumC1906770zid enumC1906770zid5 = new EnumC1906770zid("SEARCH", 4, "search");
        SEARCH = enumC1906770zid5;
        EnumC1906770zid enumC1906770zid6 = new EnumC1906770zid("THIRD_PAGE", 5, "third_page");
        THIRD_PAGE = enumC1906770zid6;
        EnumC1906770zid enumC1906770zid7 = new EnumC1906770zid("AGGREGATE", 6, "aggregate");
        AGGREGATE = enumC1906770zid7;
        EnumC1906770zid enumC1906770zid8 = new EnumC1906770zid("OTHER", 7, "other");
        OTHER = enumC1906770zid8;
        EnumC1906770zid[] enumC1906770zidArr = {enumC1906770zid, enumC1906770zid2, enumC1906770zid3, enumC1906770zid4, enumC1906770zid5, enumC1906770zid6, enumC1906770zid7, enumC1906770zid8};
        LLILLJJLI = enumC1906770zidArr;
        LLILLL = new C2254308sP(enumC1906770zidArr);
    }

    public static EnumC1906770zid[] values() {
        return (EnumC1906770zid[]) LLILLJJLI.clone();
    }

    public final String getAvatarSceneTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("-avatar");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getCoverSceneTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("-cover");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getIconSceneTag() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("-icon");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getScene() {
        return this.LL;
    }

    public static EnumC1906770zid valueOf(String str) {
        return (EnumC1906770zid) C08FF.LIZ(EnumC1906770zid.class, str);
    }

    public EnumC1906770zid(String str, int i, String str2) {
        this.LL = str2;
    }
}
