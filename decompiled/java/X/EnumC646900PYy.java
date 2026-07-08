package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC646900PYy {
    public static final EnumC646900PYy AWEME_COLLECT_STATE;
    public static final EnumC646900PYy BLOCK_STATE;
    public static final EnumC646900PYy DIGG_STATE;
    public static final EnumC646900PYy FOLLOW_STATE;
    public static final /* synthetic */ EnumC646900PYy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC646900PYy MUSIC_COLLECT_STATE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC646900PYy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC646900PYy enumC646900PYy = new EnumC646900PYy("FOLLOW_STATE", 0, "changeFollowState");
        FOLLOW_STATE = enumC646900PYy;
        EnumC646900PYy enumC646900PYy2 = new EnumC646900PYy("BLOCK_STATE", 1, "changeBlockState");
        BLOCK_STATE = enumC646900PYy2;
        EnumC646900PYy enumC646900PYy3 = new EnumC646900PYy("MUSIC_COLLECT_STATE", 2, "changeMusicCollectState");
        MUSIC_COLLECT_STATE = enumC646900PYy3;
        EnumC646900PYy enumC646900PYy4 = new EnumC646900PYy("AWEME_COLLECT_STATE", 3, "changeCollectStatus");
        AWEME_COLLECT_STATE = enumC646900PYy4;
        EnumC646900PYy enumC646900PYy5 = new EnumC646900PYy("DIGG_STATE", 4, "changeDiggState");
        DIGG_STATE = enumC646900PYy5;
        EnumC646900PYy[] enumC646900PYyArr = {enumC646900PYy, enumC646900PYy2, enumC646900PYy3, enumC646900PYy4, enumC646900PYy5};
        LLILLJJLI = enumC646900PYyArr;
        LLILLL = new C2254308sP(enumC646900PYyArr);
    }

    public static EnumC646900PYy[] values() {
        return (EnumC646900PYy[]) LLILLJJLI.clone();
    }

    public final String getLynxEventName() {
        return this.LL;
    }

    public static EnumC646900PYy valueOf(String str) {
        return (EnumC646900PYy) C08FF.LIZ(EnumC646900PYy.class, str);
    }

    public EnumC646900PYy(String str, int i, String str2) {
        this.LL = str2;
    }
}
