package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0n2H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1419230n2H {
    public static final /* synthetic */ EnumC1419230n2H[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1419230n2H OFFICIAL;
    public static final EnumC1419230n2H UGC;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1419230n2H> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1419230n2H enumC1419230n2H = new EnumC1419230n2H("OFFICIAL", 0, "official");
        OFFICIAL = enumC1419230n2H;
        EnumC1419230n2H enumC1419230n2H2 = new EnumC1419230n2H("UGC", 1, "ugc");
        UGC = enumC1419230n2H2;
        EnumC1419230n2H[] enumC1419230n2HArr = {enumC1419230n2H, enumC1419230n2H2};
        LLILLJJLI = enumC1419230n2HArr;
        LLILLL = new C2254308sP(enumC1419230n2HArr);
    }

    public static EnumC1419230n2H[] values() {
        return (EnumC1419230n2H[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1419230n2H valueOf(String str) {
        return (EnumC1419230n2H) C08FF.LIZ(EnumC1419230n2H.class, str);
    }

    public EnumC1419230n2H(String str, int i, String str2) {
        this.LL = str2;
    }
}
