package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZrG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC912680ZrG {
    public static final C908790Zkz Companion;
    public static final /* synthetic */ EnumC912680ZrG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC912680ZrG MUTUAL_FEED_SCENE_GROUP;
    public static final EnumC912680ZrG MUTUAL_FEED_SCENE_PRIVATE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC912680ZrG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC912680ZrG enumC912680ZrG = new EnumC912680ZrG("MUTUAL_FEED_SCENE_PRIVATE", 0, 0);
        MUTUAL_FEED_SCENE_PRIVATE = enumC912680ZrG;
        EnumC912680ZrG enumC912680ZrG2 = new EnumC912680ZrG("MUTUAL_FEED_SCENE_GROUP", 1, 1);
        MUTUAL_FEED_SCENE_GROUP = enumC912680ZrG2;
        EnumC912680ZrG[] enumC912680ZrGArr = {enumC912680ZrG, enumC912680ZrG2};
        LLILLJJLI = enumC912680ZrGArr;
        LLILLL = new C2254308sP(enumC912680ZrGArr);
        Companion = new C908790Zkz();
    }

    public static EnumC912680ZrG[] values() {
        return (EnumC912680ZrG[]) LLILLJJLI.clone();
    }

    public final boolean isGroup() {
        return this == MUTUAL_FEED_SCENE_GROUP;
    }

    public final boolean isPrivate() {
        return this == MUTUAL_FEED_SCENE_PRIVATE;
    }

    public final String sharedFeedType() {
        return isPrivate() ? "private_shared_feed" : "group_shared_feed";
    }

    public final String stringValue() {
        return isPrivate() ? "private" : "group";
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC912680ZrG valueOf(String str) {
        return (EnumC912680ZrG) C08FF.LIZ(EnumC912680ZrG.class, str);
    }

    public EnumC912680ZrG(String str, int i, int i2) {
        this.LL = i2;
    }
}
