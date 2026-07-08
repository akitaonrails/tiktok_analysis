package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Sug, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC736440Sug {
    public static final EnumC736440Sug ELSE;
    public static final /* synthetic */ EnumC736440Sug[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC736440Sug MUTUAL;
    public static final EnumC736440Sug SINGLE_FOLLOWED_FRIEND;
    public static final EnumC736440Sug SINGLE_FOLLOWED_NOT_FRIEND;
    public static final EnumC736440Sug SINGLE_FOLLOWING_FRIEND;
    public static final EnumC736440Sug SINGLE_FOLLOWING_NO_FRIEND;
    public static final EnumC736440Sug UNFOLLOW_FRIEND;
    public static final EnumC736440Sug UNFOLLOW_NOT_FRIEND;
    public final int LL;

    public static InterfaceC2044707zh<EnumC736440Sug> getEntries() {
        return LLILLL;
    }

    static {
        EnumC736440Sug enumC736440Sug = new EnumC736440Sug("MUTUAL", 0, 1);
        MUTUAL = enumC736440Sug;
        EnumC736440Sug enumC736440Sug2 = new EnumC736440Sug("SINGLE_FOLLOWING_FRIEND", 1, 2);
        SINGLE_FOLLOWING_FRIEND = enumC736440Sug2;
        EnumC736440Sug enumC736440Sug3 = new EnumC736440Sug("SINGLE_FOLLOWING_NO_FRIEND", 2, 3);
        SINGLE_FOLLOWING_NO_FRIEND = enumC736440Sug3;
        EnumC736440Sug enumC736440Sug4 = new EnumC736440Sug("SINGLE_FOLLOWED_FRIEND", 3, 4);
        SINGLE_FOLLOWED_FRIEND = enumC736440Sug4;
        EnumC736440Sug enumC736440Sug5 = new EnumC736440Sug("SINGLE_FOLLOWED_NOT_FRIEND", 4, 5);
        SINGLE_FOLLOWED_NOT_FRIEND = enumC736440Sug5;
        EnumC736440Sug enumC736440Sug6 = new EnumC736440Sug("UNFOLLOW_FRIEND", 5, 6);
        UNFOLLOW_FRIEND = enumC736440Sug6;
        EnumC736440Sug enumC736440Sug7 = new EnumC736440Sug("UNFOLLOW_NOT_FRIEND", 6, 7);
        UNFOLLOW_NOT_FRIEND = enumC736440Sug7;
        EnumC736440Sug enumC736440Sug8 = new EnumC736440Sug("ELSE", 7, 8);
        ELSE = enumC736440Sug8;
        EnumC736440Sug[] enumC736440SugArr = {enumC736440Sug, enumC736440Sug2, enumC736440Sug3, enumC736440Sug4, enumC736440Sug5, enumC736440Sug6, enumC736440Sug7, enumC736440Sug8};
        LLILLJJLI = enumC736440SugArr;
        LLILLL = new C2254308sP(enumC736440SugArr);
    }

    public static EnumC736440Sug[] values() {
        return (EnumC736440Sug[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC736440Sug valueOf(String str) {
        return (EnumC736440Sug) C08FF.LIZ(EnumC736440Sug.class, str);
    }

    public EnumC736440Sug(String str, int i, int i2) {
        this.LL = i2;
    }
}
