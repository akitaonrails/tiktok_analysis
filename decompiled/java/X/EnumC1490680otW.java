package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0otW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1490680otW {
    public static final /* synthetic */ EnumC1490680otW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1490680otW NOT_VULNERABLE;
    public static final EnumC1490680otW VULNERABLE;
    public static final EnumC1490680otW WHITE_LIST;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1490680otW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1490680otW enumC1490680otW = new EnumC1490680otW("NOT_VULNERABLE", 0, 0);
        NOT_VULNERABLE = enumC1490680otW;
        EnumC1490680otW enumC1490680otW2 = new EnumC1490680otW("VULNERABLE", 1, 1);
        VULNERABLE = enumC1490680otW2;
        EnumC1490680otW enumC1490680otW3 = new EnumC1490680otW("WHITE_LIST", 2, 2);
        WHITE_LIST = enumC1490680otW3;
        EnumC1490680otW[] enumC1490680otWArr = {enumC1490680otW, enumC1490680otW2, enumC1490680otW3};
        LLILLJJLI = enumC1490680otWArr;
        LLILLL = new C2254308sP(enumC1490680otWArr);
    }

    public static EnumC1490680otW[] values() {
        return (EnumC1490680otW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1490680otW valueOf(String str) {
        return (EnumC1490680otW) C08FF.LIZ(EnumC1490680otW.class, str);
    }

    public EnumC1490680otW(String str, int i, int i2) {
        this.LL = i2;
    }
}
