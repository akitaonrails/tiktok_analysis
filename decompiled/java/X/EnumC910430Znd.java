package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Znd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC910430Znd {
    public static final EnumC910430Znd CONTENT;
    public static final /* synthetic */ EnumC910430Znd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC910430Znd RECEIVER;
    public static final EnumC910430Znd SENDER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC910430Znd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC910430Znd enumC910430Znd = new EnumC910430Znd("RECEIVER", 0, 18);
        RECEIVER = enumC910430Znd;
        EnumC910430Znd enumC910430Znd2 = new EnumC910430Znd("SENDER", 1, 18);
        SENDER = enumC910430Znd2;
        EnumC910430Znd enumC910430Znd3 = new EnumC910430Znd("CONTENT", 2, 130);
        CONTENT = enumC910430Znd3;
        EnumC910430Znd[] enumC910430ZndArr = {enumC910430Znd, enumC910430Znd2, enumC910430Znd3};
        LLILLJJLI = enumC910430ZndArr;
        LLILLL = new C2254308sP(enumC910430ZndArr);
    }

    public static EnumC910430Znd[] values() {
        return (EnumC910430Znd[]) LLILLJJLI.clone();
    }

    public final int getMaxLength() {
        return this.LL;
    }

    public static EnumC910430Znd valueOf(String str) {
        return (EnumC910430Znd) C08FF.LIZ(EnumC910430Znd.class, str);
    }

    public EnumC910430Znd(String str, int i, int i2) {
        this.LL = i2;
    }
}
