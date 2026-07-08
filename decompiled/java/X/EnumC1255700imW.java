package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0imW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1255700imW {
    public static final EnumC1255700imW GRANTED;
    public static final /* synthetic */ EnumC1255700imW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1255700imW PERMANENT_DENY;
    public static final EnumC1255700imW TEMPORAL_DENY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1255700imW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1255700imW enumC1255700imW = new EnumC1255700imW("GRANTED", 0, 0);
        GRANTED = enumC1255700imW;
        EnumC1255700imW enumC1255700imW2 = new EnumC1255700imW("TEMPORAL_DENY", 1, 1);
        TEMPORAL_DENY = enumC1255700imW2;
        EnumC1255700imW enumC1255700imW3 = new EnumC1255700imW("PERMANENT_DENY", 2, 2);
        PERMANENT_DENY = enumC1255700imW3;
        EnumC1255700imW[] enumC1255700imWArr = {enumC1255700imW, enumC1255700imW2, enumC1255700imW3};
        LLILLJJLI = enumC1255700imWArr;
        LLILLL = new C2254308sP(enumC1255700imWArr);
    }

    public static EnumC1255700imW[] values() {
        return (EnumC1255700imW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1255700imW valueOf(String str) {
        return (EnumC1255700imW) C08FF.LIZ(EnumC1255700imW.class, str);
    }

    public EnumC1255700imW(String str, int i, int i2) {
        this.LL = i2;
    }
}
