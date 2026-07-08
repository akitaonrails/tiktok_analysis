package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15qA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20643215qA {
    public static final EnumC20643215qA ACCOUNT_LOGIN;
    public static final EnumC20643215qA COLD_START;
    public static final EnumC20643215qA FRONTIER;
    public static final EnumC20643215qA HOT_START;
    public static final EnumC20643215qA INBOX_BADGE_UPDATE;
    public static final /* synthetic */ EnumC20643215qA[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC20643215qA POLL;
    public static final EnumC20643215qA SKIP_VIDEO;
    public static final EnumC20643215qA WARM_START;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC20643215qA> getEntries() {
        return LLILZ;
    }

    static {
        EnumC20643215qA enumC20643215qA = new EnumC20643215qA("COLD_START", 0, 1, "cold_launch");
        COLD_START = enumC20643215qA;
        EnumC20643215qA enumC20643215qA2 = new EnumC20643215qA("WARM_START", 1, 2, "warm_start");
        WARM_START = enumC20643215qA2;
        EnumC20643215qA enumC20643215qA3 = new EnumC20643215qA("HOT_START", 2, 3, "hot_start");
        HOT_START = enumC20643215qA3;
        EnumC20643215qA enumC20643215qA4 = new EnumC20643215qA("ACCOUNT_LOGIN", 3, 4, "switch_account");
        ACCOUNT_LOGIN = enumC20643215qA4;
        EnumC20643215qA enumC20643215qA5 = new EnumC20643215qA("FRONTIER", 4, 5, "");
        FRONTIER = enumC20643215qA5;
        EnumC20643215qA enumC20643215qA6 = new EnumC20643215qA("INBOX_BADGE_UPDATE", 5, 6, "");
        INBOX_BADGE_UPDATE = enumC20643215qA6;
        EnumC20643215qA enumC20643215qA7 = new EnumC20643215qA("POLL", 6, 7, "");
        POLL = enumC20643215qA7;
        EnumC20643215qA enumC20643215qA8 = new EnumC20643215qA("SKIP_VIDEO", 7, 8, "skip_video");
        SKIP_VIDEO = enumC20643215qA8;
        EnumC20643215qA[] enumC20643215qAArr = {enumC20643215qA, enumC20643215qA2, enumC20643215qA3, enumC20643215qA4, enumC20643215qA5, enumC20643215qA6, enumC20643215qA7, enumC20643215qA8};
        LLILLL = enumC20643215qAArr;
        LLILZ = new C2254308sP(enumC20643215qAArr);
    }

    public static EnumC20643215qA[] values() {
        return (EnumC20643215qA[]) LLILLL.clone();
    }

    public final String getEventType() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20643215qA valueOf(String str) {
        return (EnumC20643215qA) C08FF.LIZ(EnumC20643215qA.class, str);
    }

    public EnumC20643215qA(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
