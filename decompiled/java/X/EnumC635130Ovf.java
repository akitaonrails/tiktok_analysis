package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ovf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC635130Ovf {
    public static final /* synthetic */ EnumC635130Ovf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC635130Ovf SUBSCRIBE;
    public static final EnumC635130Ovf UNSUBSCRIBE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC635130Ovf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC635130Ovf enumC635130Ovf = new EnumC635130Ovf("UNSUBSCRIBE", 0, 0);
        UNSUBSCRIBE = enumC635130Ovf;
        EnumC635130Ovf enumC635130Ovf2 = new EnumC635130Ovf("SUBSCRIBE", 1, 1);
        SUBSCRIBE = enumC635130Ovf2;
        EnumC635130Ovf[] enumC635130OvfArr = {enumC635130Ovf, enumC635130Ovf2};
        LLILLJJLI = enumC635130OvfArr;
        LLILLL = new C2254308sP(enumC635130OvfArr);
    }

    public static EnumC635130Ovf[] values() {
        return (EnumC635130Ovf[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC635130Ovf valueOf(String str) {
        return (EnumC635130Ovf) C08FF.LIZ(EnumC635130Ovf.class, str);
    }

    public EnumC635130Ovf(String str, int i, int i2) {
        this.LL = i2;
    }
}
