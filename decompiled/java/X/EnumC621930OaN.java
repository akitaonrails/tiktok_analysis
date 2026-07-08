package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC621930OaN {
    public static final EnumC621930OaN BULLETIN_BOARD_ID;
    public static final EnumC621930OaN CREATE_TIME;
    public static final C622400Ob8 Companion;
    public static final EnumC621930OaN HAS_READ;
    public static final EnumC621930OaN ITEM_ID;
    public static final EnumC621930OaN LAST_UPDATE_TIME;
    public static final /* synthetic */ EnumC621930OaN[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC621930OaN PUBLISH_USER_ID;
    public static final EnumC621930OaN STATUS;
    public static final EnumC621930OaN STYLE_ID;
    public static final EnumC621930OaN TTL;
    public static final EnumC621930OaN TYPE;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC621930OaN> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.0Ob8] */
    static {
        EnumC621930OaN enumC621930OaN = new EnumC621930OaN("ITEM_ID", 0, "item_id", "TEXT PRIMARY KEY");
        ITEM_ID = enumC621930OaN;
        EnumC621930OaN enumC621930OaN2 = new EnumC621930OaN("BULLETIN_BOARD_ID", 1, "bulletin_board_id", "TEXT NOT NULL");
        BULLETIN_BOARD_ID = enumC621930OaN2;
        EnumC621930OaN enumC621930OaN3 = new EnumC621930OaN("LAST_UPDATE_TIME", 2, "last_update_time", "INTEGER NOT NULL DEFAULT 0");
        LAST_UPDATE_TIME = enumC621930OaN3;
        EnumC621930OaN enumC621930OaN4 = new EnumC621930OaN("CREATE_TIME", 3, "create_time", "INTEGER NOT NULL DEFAULT 0");
        CREATE_TIME = enumC621930OaN4;
        EnumC621930OaN enumC621930OaN5 = new EnumC621930OaN("PUBLISH_USER_ID", 4, "publish_user_id", "TEXT");
        PUBLISH_USER_ID = enumC621930OaN5;
        EnumC621930OaN enumC621930OaN6 = new EnumC621930OaN("TYPE", 5, "type", "INTEGER NOT NULL");
        TYPE = enumC621930OaN6;
        EnumC621930OaN enumC621930OaN7 = new EnumC621930OaN("HAS_READ", 6, "has_read", "INTEGER NOT NULL DEFAULT 0");
        HAS_READ = enumC621930OaN7;
        EnumC621930OaN enumC621930OaN8 = new EnumC621930OaN("TTL", 7, "ttl", "INTEGER NOT NULL DEFAULT 0");
        TTL = enumC621930OaN8;
        EnumC621930OaN enumC621930OaN9 = new EnumC621930OaN("STATUS", 8, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "INTEGER NOT NULL DEFAULT 0");
        STATUS = enumC621930OaN9;
        EnumC621930OaN enumC621930OaN10 = new EnumC621930OaN("STYLE_ID", 9, "style_id", "TEXT");
        STYLE_ID = enumC621930OaN10;
        EnumC621930OaN[] enumC621930OaNArr = {enumC621930OaN, enumC621930OaN2, enumC621930OaN3, enumC621930OaN4, enumC621930OaN5, enumC621930OaN6, enumC621930OaN7, enumC621930OaN8, enumC621930OaN9, enumC621930OaN10};
        LLILLL = enumC621930OaNArr;
        LLILZ = new C2254308sP(enumC621930OaNArr);
        Companion = new Object() { // from class: X.0Ob8
        };
    }

    public static EnumC621930OaN[] values() {
        return (EnumC621930OaN[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC621930OaN valueOf(String str) {
        return (EnumC621930OaN) C08FF.LIZ(EnumC621930OaN.class, str);
    }

    public EnumC621930OaN(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
