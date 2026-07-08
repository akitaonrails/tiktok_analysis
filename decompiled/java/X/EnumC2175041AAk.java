package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2175041AAk {
    public static final EnumC2175041AAk COLD_START;
    public static final EnumC2175041AAk EXIT_PULL_OPT;
    public static final EnumC2175041AAk HIGHLIGHT_TO_LIVE;
    public static final /* synthetic */ EnumC2175041AAk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2175041AAk OTHERS;
    public static final EnumC2175041AAk PRE_PULL;
    public static final EnumC2175041AAk PRE_PULL_AFTER_HIGHLIGHT;
    public static final EnumC2175041AAk REFRESH_PULL_STREAM;
    public static final EnumC2175041AAk RESUME_FEED_PLAY;
    public static final EnumC2175041AAk SELECT;
    public static final EnumC2175041AAk STARTER_MONITOR;

    public static InterfaceC2044707zh<EnumC2175041AAk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2175041AAk enumC2175041AAk = new EnumC2175041AAk("RESUME_FEED_PLAY", 0);
        RESUME_FEED_PLAY = enumC2175041AAk;
        EnumC2175041AAk enumC2175041AAk2 = new EnumC2175041AAk("SELECT", 1);
        SELECT = enumC2175041AAk2;
        EnumC2175041AAk enumC2175041AAk3 = new EnumC2175041AAk("PRE_PULL", 2);
        PRE_PULL = enumC2175041AAk3;
        EnumC2175041AAk enumC2175041AAk4 = new EnumC2175041AAk("OTHERS", 3);
        OTHERS = enumC2175041AAk4;
        EnumC2175041AAk enumC2175041AAk5 = new EnumC2175041AAk("COLD_START", 4);
        COLD_START = enumC2175041AAk5;
        EnumC2175041AAk enumC2175041AAk6 = new EnumC2175041AAk("EXIT_PULL_OPT", 5);
        EXIT_PULL_OPT = enumC2175041AAk6;
        EnumC2175041AAk enumC2175041AAk7 = new EnumC2175041AAk("REFRESH_PULL_STREAM", 6);
        REFRESH_PULL_STREAM = enumC2175041AAk7;
        EnumC2175041AAk enumC2175041AAk8 = new EnumC2175041AAk("PRE_PULL_AFTER_HIGHLIGHT", 7);
        PRE_PULL_AFTER_HIGHLIGHT = enumC2175041AAk8;
        EnumC2175041AAk enumC2175041AAk9 = new EnumC2175041AAk("HIGHLIGHT_TO_LIVE", 8);
        HIGHLIGHT_TO_LIVE = enumC2175041AAk9;
        EnumC2175041AAk enumC2175041AAk10 = new EnumC2175041AAk("STARTER_MONITOR", 9);
        STARTER_MONITOR = enumC2175041AAk10;
        EnumC2175041AAk[] enumC2175041AAkArr = {enumC2175041AAk, enumC2175041AAk2, enumC2175041AAk3, enumC2175041AAk4, enumC2175041AAk5, enumC2175041AAk6, enumC2175041AAk7, enumC2175041AAk8, enumC2175041AAk9, enumC2175041AAk10};
        LL = enumC2175041AAkArr;
        LLILLJJLI = new C2254308sP(enumC2175041AAkArr);
    }

    public static EnumC2175041AAk[] values() {
        return (EnumC2175041AAk[]) LL.clone();
    }

    public static EnumC2175041AAk valueOf(String str) {
        return (EnumC2175041AAk) C08FF.LIZ(EnumC2175041AAk.class, str);
    }

    public EnumC2175041AAk(String str, int i) {
    }
}
