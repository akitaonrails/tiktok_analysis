package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1CuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2245291CuN {
    public static final /* synthetic */ EnumC2245291CuN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2245291CuN ON_ASYNC_API;
    public static final EnumC2245291CuN ON_BEFORE_GET_POSTROLL;
    public static final EnumC2245291CuN ON_COMPLETED_PLAY;
    public static final EnumC2245291CuN ON_DISLIKE;
    public static final EnumC2245291CuN ON_GET_POSTROLL;
    public static final EnumC2245291CuN ON_LOAD_MORE;
    public static final EnumC2245291CuN ON_REPORT;
    public static final EnumC2245291CuN ON_SELECTED;
    public static final EnumC2245291CuN ON_SHOW_POSTROLL;
    public static final EnumC2245291CuN ON_TIMER_TASK;

    public static InterfaceC2044707zh<EnumC2245291CuN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2245291CuN enumC2245291CuN = new EnumC2245291CuN("ON_SELECTED", 0);
        ON_SELECTED = enumC2245291CuN;
        EnumC2245291CuN enumC2245291CuN2 = new EnumC2245291CuN("ON_COMPLETED_PLAY", 1);
        ON_COMPLETED_PLAY = enumC2245291CuN2;
        EnumC2245291CuN enumC2245291CuN3 = new EnumC2245291CuN("ON_TIMER_TASK", 2);
        ON_TIMER_TASK = enumC2245291CuN3;
        EnumC2245291CuN enumC2245291CuN4 = new EnumC2245291CuN("ON_LOAD_MORE", 3);
        ON_LOAD_MORE = enumC2245291CuN4;
        EnumC2245291CuN enumC2245291CuN5 = new EnumC2245291CuN("ON_ASYNC_API", 4);
        ON_ASYNC_API = enumC2245291CuN5;
        EnumC2245291CuN enumC2245291CuN6 = new EnumC2245291CuN("ON_BEFORE_GET_POSTROLL", 5);
        ON_BEFORE_GET_POSTROLL = enumC2245291CuN6;
        EnumC2245291CuN enumC2245291CuN7 = new EnumC2245291CuN("ON_GET_POSTROLL", 6);
        ON_GET_POSTROLL = enumC2245291CuN7;
        EnumC2245291CuN enumC2245291CuN8 = new EnumC2245291CuN("ON_SHOW_POSTROLL", 7);
        ON_SHOW_POSTROLL = enumC2245291CuN8;
        EnumC2245291CuN enumC2245291CuN9 = new EnumC2245291CuN("ON_DISLIKE", 8);
        ON_DISLIKE = enumC2245291CuN9;
        EnumC2245291CuN enumC2245291CuN10 = new EnumC2245291CuN("ON_REPORT", 9);
        ON_REPORT = enumC2245291CuN10;
        EnumC2245291CuN[] enumC2245291CuNArr = {enumC2245291CuN, enumC2245291CuN2, enumC2245291CuN3, enumC2245291CuN4, enumC2245291CuN5, enumC2245291CuN6, enumC2245291CuN7, enumC2245291CuN8, enumC2245291CuN9, enumC2245291CuN10};
        LL = enumC2245291CuNArr;
        LLILLJJLI = new C2254308sP(enumC2245291CuNArr);
    }

    public static EnumC2245291CuN[] values() {
        return (EnumC2245291CuN[]) LL.clone();
    }

    public static EnumC2245291CuN valueOf(String str) {
        return (EnumC2245291CuN) C08FF.LIZ(EnumC2245291CuN.class, str);
    }

    public EnumC2245291CuN(String str, int i) {
    }
}
