package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gEv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1157990gEv {
    public static final /* synthetic */ EnumC1157990gEv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1157990gEv PENDING;
    public static final EnumC1157990gEv PURCHASED;
    public static final EnumC1157990gEv UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1157990gEv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1157990gEv enumC1157990gEv = new EnumC1157990gEv("PENDING", 0, 2);
        PENDING = enumC1157990gEv;
        EnumC1157990gEv enumC1157990gEv2 = new EnumC1157990gEv("PURCHASED", 1, 1);
        PURCHASED = enumC1157990gEv2;
        EnumC1157990gEv enumC1157990gEv3 = new EnumC1157990gEv("UNKNOWN", 2, -1);
        UNKNOWN = enumC1157990gEv3;
        EnumC1157990gEv[] enumC1157990gEvArr = {enumC1157990gEv, enumC1157990gEv2, enumC1157990gEv3};
        LLILLJJLI = enumC1157990gEvArr;
        LLILLL = new C2254308sP(enumC1157990gEvArr);
    }

    public static EnumC1157990gEv[] values() {
        return (EnumC1157990gEv[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1157990gEv valueOf(String str) {
        return (EnumC1157990gEv) C08FF.LIZ(EnumC1157990gEv.class, str);
    }

    public EnumC1157990gEv(String str, int i, int i2) {
        this.LL = i2;
    }
}
