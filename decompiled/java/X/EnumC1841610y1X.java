package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0y1X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1841610y1X {
    public static final /* synthetic */ EnumC1841610y1X[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1841610y1X PIN;
    public static final EnumC1841610y1X UNPIN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1841610y1X> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1841610y1X enumC1841610y1X = new EnumC1841610y1X("PIN", 0, "pin");
        PIN = enumC1841610y1X;
        EnumC1841610y1X enumC1841610y1X2 = new EnumC1841610y1X("UNPIN", 1, "unpin");
        UNPIN = enumC1841610y1X2;
        EnumC1841610y1X[] enumC1841610y1XArr = {enumC1841610y1X, enumC1841610y1X2};
        LLILLJJLI = enumC1841610y1XArr;
        LLILLL = new C2254308sP(enumC1841610y1XArr);
    }

    public static EnumC1841610y1X[] values() {
        return (EnumC1841610y1X[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1841610y1X valueOf(String str) {
        return (EnumC1841610y1X) C08FF.LIZ(EnumC1841610y1X.class, str);
    }

    public EnumC1841610y1X(String str, int i, String str2) {
        this.LL = str2;
    }
}
