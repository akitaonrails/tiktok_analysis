package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1597060rf6 {
    public static final EnumC1597060rf6 ACTIVE_STATUS;
    public static final EnumC1597060rf6 FRIENDS;
    public static final EnumC1597060rf6 HIGHLIGHT;
    public static final EnumC1597060rf6 LIVE;
    public static final EnumC1597060rf6 LIVE_EVENT;
    public static final /* synthetic */ EnumC1597060rf6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1597060rf6 ON_THIS_DAY;
    public static final EnumC1597060rf6 STORY;
    public static final EnumC1597060rf6 STORY_CELEBRATION;
    public static final EnumC1597060rf6 STORY_WIDGET;
    public static final EnumC1597060rf6 THOUGHT;

    public static InterfaceC2044707zh<EnumC1597060rf6> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1597060rf6 enumC1597060rf6 = new EnumC1597060rf6("STORY", 0);
        STORY = enumC1597060rf6;
        EnumC1597060rf6 enumC1597060rf62 = new EnumC1597060rf6("LIVE", 1);
        LIVE = enumC1597060rf62;
        EnumC1597060rf6 enumC1597060rf63 = new EnumC1597060rf6("HIGHLIGHT", 2);
        HIGHLIGHT = enumC1597060rf63;
        EnumC1597060rf6 enumC1597060rf64 = new EnumC1597060rf6("ACTIVE_STATUS", 3);
        ACTIVE_STATUS = enumC1597060rf64;
        EnumC1597060rf6 enumC1597060rf65 = new EnumC1597060rf6("FRIENDS", 4);
        FRIENDS = enumC1597060rf65;
        EnumC1597060rf6 enumC1597060rf66 = new EnumC1597060rf6("ON_THIS_DAY", 5);
        ON_THIS_DAY = enumC1597060rf66;
        EnumC1597060rf6 enumC1597060rf67 = new EnumC1597060rf6("STORY_CELEBRATION", 6);
        STORY_CELEBRATION = enumC1597060rf67;
        EnumC1597060rf6 enumC1597060rf68 = new EnumC1597060rf6("LIVE_EVENT", 7);
        LIVE_EVENT = enumC1597060rf68;
        EnumC1597060rf6 enumC1597060rf69 = new EnumC1597060rf6("STORY_WIDGET", 8);
        STORY_WIDGET = enumC1597060rf69;
        EnumC1597060rf6 enumC1597060rf610 = new EnumC1597060rf6("THOUGHT", 9);
        THOUGHT = enumC1597060rf610;
        EnumC1597060rf6[] enumC1597060rf6Arr = {enumC1597060rf6, enumC1597060rf62, enumC1597060rf63, enumC1597060rf64, enumC1597060rf65, enumC1597060rf66, enumC1597060rf67, enumC1597060rf68, enumC1597060rf69, enumC1597060rf610};
        LL = enumC1597060rf6Arr;
        LLILLJJLI = new C2254308sP(enumC1597060rf6Arr);
    }

    public static EnumC1597060rf6[] values() {
        return (EnumC1597060rf6[]) LL.clone();
    }

    public static EnumC1597060rf6 valueOf(String str) {
        return (EnumC1597060rf6) C08FF.LIZ(EnumC1597060rf6.class, str);
    }

    public EnumC1597060rf6(String str, int i) {
    }
}
