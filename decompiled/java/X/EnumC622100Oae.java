package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC622100Oae {
    public static final EnumC622100Oae BULLETIN_BOARD_ID;
    public static final C622380Ob6 Companion;
    public static final EnumC622100Oae EDIT_QUOTA;
    public static final EnumC622100Oae EXTRA_DATA;
    public static final /* synthetic */ EnumC622100Oae[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC622100Oae PLUS_POST_ORDERS;
    public static final EnumC622100Oae PUBLISH_QUOTA;
    public static final EnumC622100Oae QUICK_POST_ORDERS;
    public static final EnumC622100Oae REOPEN_DEADLINE_TIME;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC622100Oae> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0Ob6] */
    static {
        EnumC622100Oae enumC622100Oae = new EnumC622100Oae("BULLETIN_BOARD_ID", 0, "bulletin_board_id", "TEXT PRIMARY KEY");
        BULLETIN_BOARD_ID = enumC622100Oae;
        EnumC622100Oae enumC622100Oae2 = new EnumC622100Oae("REOPEN_DEADLINE_TIME", 1, "reopen_deadline_time", "INTEGER");
        REOPEN_DEADLINE_TIME = enumC622100Oae2;
        EnumC622100Oae enumC622100Oae3 = new EnumC622100Oae("PUBLISH_QUOTA", 2, "publish_quota", "INTEGER NOT NULL DEFAULT 0");
        PUBLISH_QUOTA = enumC622100Oae3;
        EnumC622100Oae enumC622100Oae4 = new EnumC622100Oae("EDIT_QUOTA", 3, "edit_quota", "INTEGER NOT NULL DEFAULT 0");
        EDIT_QUOTA = enumC622100Oae4;
        EnumC622100Oae enumC622100Oae5 = new EnumC622100Oae("QUICK_POST_ORDERS", 4, "quick_post_orders", "TEXT");
        QUICK_POST_ORDERS = enumC622100Oae5;
        EnumC622100Oae enumC622100Oae6 = new EnumC622100Oae("PLUS_POST_ORDERS", 5, "plus_post_orders", "TEXT");
        PLUS_POST_ORDERS = enumC622100Oae6;
        EnumC622100Oae enumC622100Oae7 = new EnumC622100Oae("EXTRA_DATA", 6, "extra_data", "TEXT");
        EXTRA_DATA = enumC622100Oae7;
        EnumC622100Oae[] enumC622100OaeArr = {enumC622100Oae, enumC622100Oae2, enumC622100Oae3, enumC622100Oae4, enumC622100Oae5, enumC622100Oae6, enumC622100Oae7};
        LLILLL = enumC622100OaeArr;
        LLILZ = new C2254308sP(enumC622100OaeArr);
        Companion = new Object() { // from class: X.0Ob6
        };
    }

    public static EnumC622100Oae[] values() {
        return (EnumC622100Oae[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC622100Oae valueOf(String str) {
        return (EnumC622100Oae) C08FF.LIZ(EnumC622100Oae.class, str);
    }

    public EnumC622100Oae(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
