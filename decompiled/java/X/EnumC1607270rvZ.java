package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rvZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1607270rvZ {
    public static final EnumC1607270rvZ ACTIVE;
    public static final EnumC1607270rvZ FEED_INDICATOR;
    public static final EnumC1607270rvZ FOLLOW;
    public static final EnumC1607270rvZ INTERACTION;
    public static final EnumC1607270rvZ LIVE;
    public static final /* synthetic */ EnumC1607270rvZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1607270rvZ PERSON;
    public static final EnumC1607270rvZ SIMPLE_STORY;
    public static final EnumC1607270rvZ STORY;
    public static final EnumC1607270rvZ STORY_CELEBRATION;
    public static final EnumC1607270rvZ STORY_RELATION;
    public static final EnumC1607270rvZ STORY_REVEAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1607270rvZ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1607270rvZ enumC1607270rvZ = new EnumC1607270rvZ("LIVE", 0, "live");
        LIVE = enumC1607270rvZ;
        EnumC1607270rvZ enumC1607270rvZ2 = new EnumC1607270rvZ("STORY", 1, "story");
        STORY = enumC1607270rvZ2;
        EnumC1607270rvZ enumC1607270rvZ3 = new EnumC1607270rvZ("PERSON", 2, "person");
        PERSON = enumC1607270rvZ3;
        EnumC1607270rvZ enumC1607270rvZ4 = new EnumC1607270rvZ("ACTIVE", 3, "active");
        ACTIVE = enumC1607270rvZ4;
        EnumC1607270rvZ enumC1607270rvZ5 = new EnumC1607270rvZ("FOLLOW", 4, "follow");
        FOLLOW = enumC1607270rvZ5;
        EnumC1607270rvZ enumC1607270rvZ6 = new EnumC1607270rvZ("INTERACTION", 5, "interaction");
        INTERACTION = enumC1607270rvZ6;
        EnumC1607270rvZ enumC1607270rvZ7 = new EnumC1607270rvZ("SIMPLE_STORY", 6, "simple_story");
        SIMPLE_STORY = enumC1607270rvZ7;
        EnumC1607270rvZ enumC1607270rvZ8 = new EnumC1607270rvZ("FEED_INDICATOR", 7, "feed_indicator");
        FEED_INDICATOR = enumC1607270rvZ8;
        EnumC1607270rvZ enumC1607270rvZ9 = new EnumC1607270rvZ("STORY_RELATION", 8, "story_relation");
        STORY_RELATION = enumC1607270rvZ9;
        EnumC1607270rvZ enumC1607270rvZ10 = new EnumC1607270rvZ("STORY_CELEBRATION", 9, "story_celebration");
        STORY_CELEBRATION = enumC1607270rvZ10;
        EnumC1607270rvZ enumC1607270rvZ11 = new EnumC1607270rvZ("STORY_REVEAL", 10, "story_reveal");
        STORY_REVEAL = enumC1607270rvZ11;
        EnumC1607270rvZ[] enumC1607270rvZArr = {enumC1607270rvZ, enumC1607270rvZ2, enumC1607270rvZ3, enumC1607270rvZ4, enumC1607270rvZ5, enumC1607270rvZ6, enumC1607270rvZ7, enumC1607270rvZ8, enumC1607270rvZ9, enumC1607270rvZ10, enumC1607270rvZ11};
        LLILLJJLI = enumC1607270rvZArr;
        LLILLL = new C2254308sP(enumC1607270rvZArr);
    }

    public static EnumC1607270rvZ[] values() {
        return (EnumC1607270rvZ[]) LLILLJJLI.clone();
    }

    public final String getString() {
        return this.LL;
    }

    public static EnumC1607270rvZ valueOf(String str) {
        return (EnumC1607270rvZ) C08FF.LIZ(EnumC1607270rvZ.class, str);
    }

    public EnumC1607270rvZ(String str, int i, String str2) {
        this.LL = str2;
    }
}
