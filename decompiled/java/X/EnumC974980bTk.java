package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bTk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC974980bTk {
    public static final EnumC974980bTk INVITE;
    public static final /* synthetic */ EnumC974980bTk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC974980bTk OVER_TIME;
    public static final EnumC974980bTk REJECT;
    public static final EnumC974980bTk WITHDRAW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC974980bTk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC974980bTk enumC974980bTk = new EnumC974980bTk("INVITE", 0, "invite");
        INVITE = enumC974980bTk;
        EnumC974980bTk enumC974980bTk2 = new EnumC974980bTk("WITHDRAW", 1, "withdraw");
        WITHDRAW = enumC974980bTk2;
        EnumC974980bTk enumC974980bTk3 = new EnumC974980bTk("REJECT", 2, "reject");
        REJECT = enumC974980bTk3;
        EnumC974980bTk enumC974980bTk4 = new EnumC974980bTk("OVER_TIME", 3, "over_time");
        OVER_TIME = enumC974980bTk4;
        EnumC974980bTk[] enumC974980bTkArr = {enumC974980bTk, enumC974980bTk2, enumC974980bTk3, enumC974980bTk4};
        LLILLJJLI = enumC974980bTkArr;
        LLILLL = new C2254308sP(enumC974980bTkArr);
    }

    public static EnumC974980bTk[] values() {
        return (EnumC974980bTk[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC974980bTk valueOf(String str) {
        return (EnumC974980bTk) C08FF.LIZ(EnumC974980bTk.class, str);
    }

    public EnumC974980bTk(String str, int i, String str2) {
        this.LL = str2;
    }
}
