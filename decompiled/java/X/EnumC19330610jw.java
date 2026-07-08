package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10jw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19330610jw {
    public static final EnumC19330610jw BAN_BY_FREQ;
    public static final EnumC19330610jw BAN_BY_IAP;
    public static final EnumC19330610jw BAN_BY_PSORT_ALGO;
    public static final EnumC19330610jw BAN_BY_SOCIAL_SORT;
    public static final /* synthetic */ EnumC19330610jw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC19330610jw PASS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC19330610jw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC19330610jw enumC19330610jw = new EnumC19330610jw("PASS", 0, 0);
        PASS = enumC19330610jw;
        EnumC19330610jw enumC19330610jw2 = new EnumC19330610jw("BAN_BY_IAP", 1, 1);
        BAN_BY_IAP = enumC19330610jw2;
        EnumC19330610jw enumC19330610jw3 = new EnumC19330610jw("BAN_BY_SOCIAL_SORT", 2, 2);
        BAN_BY_SOCIAL_SORT = enumC19330610jw3;
        EnumC19330610jw enumC19330610jw4 = new EnumC19330610jw("BAN_BY_FREQ", 3, 3);
        BAN_BY_FREQ = enumC19330610jw4;
        EnumC19330610jw enumC19330610jw5 = new EnumC19330610jw("BAN_BY_PSORT_ALGO", 4, 4);
        BAN_BY_PSORT_ALGO = enumC19330610jw5;
        EnumC19330610jw[] enumC19330610jwArr = {enumC19330610jw, enumC19330610jw2, enumC19330610jw3, enumC19330610jw4, enumC19330610jw5};
        LLILLJJLI = enumC19330610jwArr;
        LLILLL = new C2254308sP(enumC19330610jwArr);
    }

    public static EnumC19330610jw[] values() {
        return (EnumC19330610jw[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC19330610jw valueOf(String str) {
        return (EnumC19330610jw) C08FF.LIZ(EnumC19330610jw.class, str);
    }

    public EnumC19330610jw(String str, int i, int i2) {
        this.LL = i2;
    }
}
