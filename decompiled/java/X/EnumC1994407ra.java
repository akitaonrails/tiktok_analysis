package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1994407ra {
    public static final EnumC1994407ra FRIEND_ONLY;
    public static final /* synthetic */ EnumC1994407ra[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1994407ra NORMAL;
    public static final EnumC1994407ra STORY_EXPIRED;
    public static final EnumC1994407ra UNAVAILABLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1994407ra> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1994407ra enumC1994407ra = new EnumC1994407ra("NORMAL", 0, 0);
        NORMAL = enumC1994407ra;
        EnumC1994407ra enumC1994407ra2 = new EnumC1994407ra("UNAVAILABLE", 1, 1);
        UNAVAILABLE = enumC1994407ra2;
        EnumC1994407ra enumC1994407ra3 = new EnumC1994407ra("STORY_EXPIRED", 2, 2);
        STORY_EXPIRED = enumC1994407ra3;
        EnumC1994407ra enumC1994407ra4 = new EnumC1994407ra("FRIEND_ONLY", 3, 3);
        FRIEND_ONLY = enumC1994407ra4;
        EnumC1994407ra[] enumC1994407raArr = {enumC1994407ra, enumC1994407ra2, enumC1994407ra3, enumC1994407ra4};
        LLILLJJLI = enumC1994407raArr;
        LLILLL = new C2254308sP(enumC1994407raArr);
    }

    public static EnumC1994407ra[] values() {
        return (EnumC1994407ra[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1994407ra valueOf(String str) {
        return (EnumC1994407ra) C08FF.LIZ(EnumC1994407ra.class, str);
    }

    public EnumC1994407ra(String str, int i, int i2) {
        this.LL = i2;
    }
}
