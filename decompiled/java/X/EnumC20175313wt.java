package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.13wt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC20175313wt {
    public static final EnumC20175313wt FAIL;
    public static final /* synthetic */ EnumC20175313wt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20175313wt START;
    public static final EnumC20175313wt SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC20175313wt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20175313wt enumC20175313wt = new EnumC20175313wt("START", 0, 0);
        START = enumC20175313wt;
        EnumC20175313wt enumC20175313wt2 = new EnumC20175313wt("SUCCESS", 1, 1);
        SUCCESS = enumC20175313wt2;
        EnumC20175313wt enumC20175313wt3 = new EnumC20175313wt("FAIL", 2, 2);
        FAIL = enumC20175313wt3;
        EnumC20175313wt[] enumC20175313wtArr = {enumC20175313wt, enumC20175313wt2, enumC20175313wt3};
        LLILLJJLI = enumC20175313wtArr;
        LLILLL = new C2254308sP(enumC20175313wtArr);
    }

    public static EnumC20175313wt[] values() {
        return (EnumC20175313wt[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC20175313wt valueOf(String str) {
        return (EnumC20175313wt) C08FF.LIZ(EnumC20175313wt.class, str);
    }

    public EnumC20175313wt(String str, int i, int i2) {
        this.LL = i2;
    }
}
