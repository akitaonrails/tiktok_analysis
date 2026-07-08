package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06kh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1696906kh {
    public static final EnumC1696906kh CONVERSATION;
    public static final EnumC1696906kh INVALID;
    public static final /* synthetic */ EnumC1696906kh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1696906kh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1696906kh enumC1696906kh = new EnumC1696906kh("INVALID", 0, "???_");
        INVALID = enumC1696906kh;
        EnumC1696906kh enumC1696906kh2 = new EnumC1696906kh("CONVERSATION", 1, "con_");
        CONVERSATION = enumC1696906kh2;
        EnumC1696906kh[] enumC1696906khArr = {enumC1696906kh, enumC1696906kh2};
        LLILLJJLI = enumC1696906khArr;
        LLILLL = new C2254308sP(enumC1696906khArr);
    }

    public static EnumC1696906kh[] values() {
        return (EnumC1696906kh[]) LLILLJJLI.clone();
    }

    public final String getExitLabel() {
        return this.LL;
    }

    public static EnumC1696906kh valueOf(String str) {
        return (EnumC1696906kh) C08FF.LIZ(EnumC1696906kh.class, str);
    }

    public EnumC1696906kh(String str, int i, String str2) {
        this.LL = str2;
    }
}
