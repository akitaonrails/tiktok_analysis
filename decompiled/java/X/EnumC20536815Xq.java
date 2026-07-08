package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15Xq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20536815Xq implements C15YM {
    public static final /* synthetic */ EnumC20536815Xq[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC20536815Xq TODAY_USED_TIME;
    public static final EnumC20536815Xq USER_DETAIL_INFO;
    public final String LL;
    public final EnumC20106513ln LLILLJJLI;

    public static InterfaceC2044707zh<EnumC20536815Xq> getEntries() {
        return LLILZ;
    }

    static {
        EnumC20536815Xq enumC20536815Xq = new EnumC20536815Xq("USER_DETAIL_INFO", 0, "user_detail_info", EnumC20106513ln.DATA);
        USER_DETAIL_INFO = enumC20536815Xq;
        EnumC20536815Xq enumC20536815Xq2 = new EnumC20536815Xq("TODAY_USED_TIME", 1, "today_used_time", EnumC20106513ln.LONG);
        TODAY_USED_TIME = enumC20536815Xq2;
        EnumC20536815Xq[] enumC20536815XqArr = {enumC20536815Xq, enumC20536815Xq2};
        LLILLL = enumC20536815XqArr;
        LLILZ = new C2254308sP(enumC20536815XqArr);
    }

    public static EnumC20536815Xq[] values() {
        return (EnumC20536815Xq[]) LLILLL.clone();
    }

    @Override // X.C15YM
    public String getKey() {
        return this.LL;
    }

    @Override // X.C15YM
    public EnumC20106513ln getType() {
        return this.LLILLJJLI;
    }

    public static EnumC20536815Xq valueOf(String str) {
        return (EnumC20536815Xq) C08FF.LIZ(EnumC20536815Xq.class, str);
    }

    public EnumC20536815Xq(String str, int i, String str2, EnumC20106513ln enumC20106513ln) {
        this.LL = str2;
        this.LLILLJJLI = enumC20106513ln;
    }
}
