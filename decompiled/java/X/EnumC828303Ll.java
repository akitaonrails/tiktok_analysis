package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03Ll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC828303Ll {
    public static final /* synthetic */ EnumC828303Ll[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC828303Ll POLL_CANCEL_SUCCESS;
    public static final EnumC828303Ll POLL_FAIL;
    public static final EnumC828303Ll POLL_SUCCESS;
    public static final EnumC828303Ll POLL_TIMEOUT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC828303Ll> getEntries() {
        return LLILLL;
    }

    static {
        EnumC828303Ll enumC828303Ll = new EnumC828303Ll("POLL_SUCCESS", 0, 0);
        POLL_SUCCESS = enumC828303Ll;
        EnumC828303Ll enumC828303Ll2 = new EnumC828303Ll("POLL_FAIL", 1, 1);
        POLL_FAIL = enumC828303Ll2;
        EnumC828303Ll enumC828303Ll3 = new EnumC828303Ll("POLL_TIMEOUT", 2, 2);
        POLL_TIMEOUT = enumC828303Ll3;
        EnumC828303Ll enumC828303Ll4 = new EnumC828303Ll("POLL_CANCEL_SUCCESS", 3, 3);
        POLL_CANCEL_SUCCESS = enumC828303Ll4;
        EnumC828303Ll[] enumC828303LlArr = {enumC828303Ll, enumC828303Ll2, enumC828303Ll3, enumC828303Ll4};
        LLILLJJLI = enumC828303LlArr;
        LLILLL = new C2254308sP(enumC828303LlArr);
    }

    public static EnumC828303Ll[] values() {
        return (EnumC828303Ll[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC828303Ll valueOf(String str) {
        return (EnumC828303Ll) C08FF.LIZ(EnumC828303Ll.class, str);
    }

    public EnumC828303Ll(String str, int i, int i2) {
        this.LL = i2;
    }
}
