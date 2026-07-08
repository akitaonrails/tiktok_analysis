package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05Im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1330205Im {
    public static final EnumC1330205Im EXTERNAL;
    public static final EnumC1330205Im INTERNAL;
    public static final /* synthetic */ EnumC1330205Im[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1330205Im> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1330205Im enumC1330205Im = new EnumC1330205Im("EXTERNAL", 0, 0);
        EXTERNAL = enumC1330205Im;
        EnumC1330205Im enumC1330205Im2 = new EnumC1330205Im("INTERNAL", 1, 1);
        INTERNAL = enumC1330205Im2;
        EnumC1330205Im[] enumC1330205ImArr = {enumC1330205Im, enumC1330205Im2};
        LLILLJJLI = enumC1330205ImArr;
        LLILLL = new C2254308sP(enumC1330205ImArr);
    }

    public static EnumC1330205Im[] values() {
        return (EnumC1330205Im[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1330205Im valueOf(String str) {
        return (EnumC1330205Im) C08FF.LIZ(EnumC1330205Im.class, str);
    }

    public EnumC1330205Im(String str, int i, int i2) {
        this.LL = i2;
    }
}
