package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0aBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC925350aBh {
    public static final EnumC925350aBh JOIN_DIRECT_DIALOG;
    public static final EnumC925350aBh LINE_UP_IN_MICROOM;
    public static final /* synthetic */ EnumC925350aBh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC925350aBh NORMAL;
    public static final EnumC925350aBh RANDOM_MATCH_JOIN_DIRECT;

    public static InterfaceC2044707zh<EnumC925350aBh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC925350aBh enumC925350aBh = new EnumC925350aBh("NORMAL", 0);
        NORMAL = enumC925350aBh;
        EnumC925350aBh enumC925350aBh2 = new EnumC925350aBh("JOIN_DIRECT_DIALOG", 1);
        JOIN_DIRECT_DIALOG = enumC925350aBh2;
        EnumC925350aBh enumC925350aBh3 = new EnumC925350aBh("LINE_UP_IN_MICROOM", 2);
        LINE_UP_IN_MICROOM = enumC925350aBh3;
        EnumC925350aBh enumC925350aBh4 = new EnumC925350aBh("RANDOM_MATCH_JOIN_DIRECT", 3);
        RANDOM_MATCH_JOIN_DIRECT = enumC925350aBh4;
        EnumC925350aBh[] enumC925350aBhArr = {enumC925350aBh, enumC925350aBh2, enumC925350aBh3, enumC925350aBh4};
        LL = enumC925350aBhArr;
        LLILLJJLI = new C2254308sP(enumC925350aBhArr);
    }

    public static EnumC925350aBh[] values() {
        return (EnumC925350aBh[]) LL.clone();
    }

    public static EnumC925350aBh valueOf(String str) {
        return (EnumC925350aBh) C08FF.LIZ(EnumC925350aBh.class, str);
    }

    public EnumC925350aBh(String str, int i) {
    }
}
