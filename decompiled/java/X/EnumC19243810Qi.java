package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Qi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19243810Qi {
    public static final C19244310Qn Companion;
    public static final EnumC19243810Qi FOLLOW_LIVE;
    public static final /* synthetic */ EnumC19243810Qi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19243810Qi LONG_PRESS_COMMENT;
    public static final EnumC19243810Qi NOW_GUIDE;
    public static final EnumC19243810Qi POST_NOW;
    public static final EnumC19243810Qi SEARCH_HOT_BUBBLE;
    public static final EnumC19243810Qi SEARCH_TASK_BUBBLE;
    public static final EnumC19243810Qi STORY_GUIDE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19243810Qi> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.10Qn] */
    static {
        EnumC19243810Qi enumC19243810Qi = new EnumC19243810Qi("FOLLOW_LIVE", 0, 1);
        FOLLOW_LIVE = enumC19243810Qi;
        EnumC19243810Qi enumC19243810Qi2 = new EnumC19243810Qi("LONG_PRESS_COMMENT", 1, 2);
        LONG_PRESS_COMMENT = enumC19243810Qi2;
        EnumC19243810Qi enumC19243810Qi3 = new EnumC19243810Qi("NOW_GUIDE", 2, 3);
        NOW_GUIDE = enumC19243810Qi3;
        EnumC19243810Qi enumC19243810Qi4 = new EnumC19243810Qi("SEARCH_TASK_BUBBLE", 3, 4);
        SEARCH_TASK_BUBBLE = enumC19243810Qi4;
        EnumC19243810Qi enumC19243810Qi5 = new EnumC19243810Qi("SEARCH_HOT_BUBBLE", 4, 5);
        SEARCH_HOT_BUBBLE = enumC19243810Qi5;
        EnumC19243810Qi enumC19243810Qi6 = new EnumC19243810Qi("POST_NOW", 5, 6);
        POST_NOW = enumC19243810Qi6;
        EnumC19243810Qi enumC19243810Qi7 = new EnumC19243810Qi("STORY_GUIDE", 6, 7);
        STORY_GUIDE = enumC19243810Qi7;
        EnumC19243810Qi[] enumC19243810QiArr = {enumC19243810Qi, enumC19243810Qi2, enumC19243810Qi3, enumC19243810Qi4, enumC19243810Qi5, enumC19243810Qi6, enumC19243810Qi7};
        LLILLJJLI = enumC19243810QiArr;
        LLILLL = new C2254308sP(enumC19243810QiArr);
        Companion = new Object() { // from class: X.10Qn
        };
    }

    public static EnumC19243810Qi[] values() {
        return (EnumC19243810Qi[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19243810Qi valueOf(String str) {
        return (EnumC19243810Qi) C08FF.LIZ(EnumC19243810Qi.class, str);
    }

    public EnumC19243810Qi(String str, int i, int i2) {
        this.LL = i2;
    }
}
