package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992700bwK {
    public static final EnumC992700bwK ATU;
    public static final EnumC992700bwK BUY;
    public static final /* synthetic */ EnumC992700bwK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC992700bwK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992700bwK enumC992700bwK = new EnumC992700bwK("BUY", 0, "buy");
        BUY = enumC992700bwK;
        EnumC992700bwK enumC992700bwK2 = new EnumC992700bwK("ATU", 1, "autoTopUp");
        ATU = enumC992700bwK2;
        EnumC992700bwK[] enumC992700bwKArr = {enumC992700bwK, enumC992700bwK2};
        LLILLJJLI = enumC992700bwKArr;
        LLILLL = new C2254308sP(enumC992700bwKArr);
    }

    public static EnumC992700bwK[] values() {
        return (EnumC992700bwK[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC992700bwK valueOf(String str) {
        return (EnumC992700bwK) C08FF.LIZ(EnumC992700bwK.class, str);
    }

    public EnumC992700bwK(String str, int i, String str2) {
        this.LL = str2;
    }
}
