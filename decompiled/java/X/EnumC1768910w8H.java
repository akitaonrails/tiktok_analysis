package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1768910w8H {
    public static final EnumC1768910w8H HIDE;
    public static final /* synthetic */ EnumC1768910w8H[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1768910w8H SHOW;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1768910w8H> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1768910w8H enumC1768910w8H = new EnumC1768910w8H("SHOW", 0, 0);
        SHOW = enumC1768910w8H;
        EnumC1768910w8H enumC1768910w8H2 = new EnumC1768910w8H("HIDE", 1, 1);
        HIDE = enumC1768910w8H2;
        EnumC1768910w8H[] enumC1768910w8HArr = {enumC1768910w8H, enumC1768910w8H2};
        LLILLJJLI = enumC1768910w8HArr;
        LLILLL = new C2254308sP(enumC1768910w8HArr);
    }

    public static EnumC1768910w8H[] values() {
        return (EnumC1768910w8H[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1768910w8H valueOf(String str) {
        return (EnumC1768910w8H) C08FF.LIZ(EnumC1768910w8H.class, str);
    }

    public EnumC1768910w8H(String str, int i, int i2) {
        this.LL = i2;
    }
}
