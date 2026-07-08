package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1Asd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2193251Asd {
    public static final EnumC2193251Asd DELETE_POST;
    public static final EnumC2193251Asd DISLIKE;
    public static final EnumC2193251Asd DRAFT_DELETED;
    public static final EnumC2193251Asd DRAFT_SAVED;
    public static final EnumC2193251Asd FLAG;
    public static final EnumC2193251Asd INTERVAL;
    public static final /* synthetic */ EnumC2193251Asd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2193251Asd PUBLISH;
    public static final EnumC2193251Asd PULL_REFRESH;
    public static final EnumC2193251Asd SHOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2193251Asd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2193251Asd enumC2193251Asd = new EnumC2193251Asd("PUBLISH", 0, "publish");
        PUBLISH = enumC2193251Asd;
        EnumC2193251Asd enumC2193251Asd2 = new EnumC2193251Asd("DELETE_POST", 1, "delete_post");
        DELETE_POST = enumC2193251Asd2;
        EnumC2193251Asd enumC2193251Asd3 = new EnumC2193251Asd("DRAFT_SAVED", 2, "draft_saved");
        DRAFT_SAVED = enumC2193251Asd3;
        EnumC2193251Asd enumC2193251Asd4 = new EnumC2193251Asd("DRAFT_DELETED", 3, "draft_deleted");
        DRAFT_DELETED = enumC2193251Asd4;
        EnumC2193251Asd enumC2193251Asd5 = new EnumC2193251Asd("FLAG", 4, "flag");
        FLAG = enumC2193251Asd5;
        EnumC2193251Asd enumC2193251Asd6 = new EnumC2193251Asd("DISLIKE", 5, "dislike");
        DISLIKE = enumC2193251Asd6;
        EnumC2193251Asd enumC2193251Asd7 = new EnumC2193251Asd("SHOWN", 6, "shown");
        SHOWN = enumC2193251Asd7;
        EnumC2193251Asd enumC2193251Asd8 = new EnumC2193251Asd("PULL_REFRESH", 7, "pull_refresh");
        PULL_REFRESH = enumC2193251Asd8;
        EnumC2193251Asd enumC2193251Asd9 = new EnumC2193251Asd("INTERVAL", 8, "interval");
        INTERVAL = enumC2193251Asd9;
        EnumC2193251Asd[] enumC2193251AsdArr = {enumC2193251Asd, enumC2193251Asd2, enumC2193251Asd3, enumC2193251Asd4, enumC2193251Asd5, enumC2193251Asd6, enumC2193251Asd7, enumC2193251Asd8, enumC2193251Asd9};
        LLILLJJLI = enumC2193251AsdArr;
        LLILLL = new C2254308sP(enumC2193251AsdArr);
    }

    public static EnumC2193251Asd[] values() {
        return (EnumC2193251Asd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2193251Asd valueOf(String str) {
        return (EnumC2193251Asd) C08FF.LIZ(EnumC2193251Asd.class, str);
    }

    public EnumC2193251Asd(String str, int i, String str2) {
        this.LL = str2;
    }
}
