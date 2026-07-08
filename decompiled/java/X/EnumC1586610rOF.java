package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rOF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1586610rOF {
    public static final EnumC1586610rOF FRIENDS_FEED;
    public static final EnumC1586610rOF FRIENDS_WATER_FALL;
    public static final /* synthetic */ EnumC1586610rOF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1586610rOF PURE_STORY;
    public static final EnumC1586610rOF REPOST_FEED;
    public static final EnumC1586610rOF UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1586610rOF> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1586610rOF enumC1586610rOF = new EnumC1586610rOF("UNKNOWN", 0, 0);
        UNKNOWN = enumC1586610rOF;
        EnumC1586610rOF enumC1586610rOF2 = new EnumC1586610rOF("FRIENDS_FEED", 1, 1);
        FRIENDS_FEED = enumC1586610rOF2;
        EnumC1586610rOF enumC1586610rOF3 = new EnumC1586610rOF("REPOST_FEED", 2, 5);
        REPOST_FEED = enumC1586610rOF3;
        EnumC1586610rOF enumC1586610rOF4 = new EnumC1586610rOF("PURE_STORY", 3, 6);
        PURE_STORY = enumC1586610rOF4;
        EnumC1586610rOF enumC1586610rOF5 = new EnumC1586610rOF("FRIENDS_WATER_FALL", 4, 7);
        FRIENDS_WATER_FALL = enumC1586610rOF5;
        EnumC1586610rOF[] enumC1586610rOFArr = {enumC1586610rOF, enumC1586610rOF2, enumC1586610rOF3, enumC1586610rOF4, enumC1586610rOF5};
        LLILLJJLI = enumC1586610rOFArr;
        LLILLL = new C2254308sP(enumC1586610rOFArr);
    }

    public static EnumC1586610rOF[] values() {
        return (EnumC1586610rOF[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1586610rOF valueOf(String str) {
        return (EnumC1586610rOF) C08FF.LIZ(EnumC1586610rOF.class, str);
    }

    public EnumC1586610rOF(String str, int i, int i2) {
        this.LL = i2;
    }
}
