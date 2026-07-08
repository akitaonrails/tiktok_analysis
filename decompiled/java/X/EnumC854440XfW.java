package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC854440XfW {
    public static final EnumC854440XfW DIGITAL_0;
    public static final EnumC854440XfW DIGITAL_1;
    public static final /* synthetic */ EnumC854440XfW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC854440XfW> getEntries() {
        return LLILLL;
    }

    static {
        EnumC854440XfW enumC854440XfW = new EnumC854440XfW("DIGITAL_0", 0, 0);
        DIGITAL_0 = enumC854440XfW;
        EnumC854440XfW enumC854440XfW2 = new EnumC854440XfW("DIGITAL_1", 1, 1);
        DIGITAL_1 = enumC854440XfW2;
        EnumC854440XfW[] enumC854440XfWArr = {enumC854440XfW, enumC854440XfW2};
        LLILLJJLI = enumC854440XfWArr;
        LLILLL = new C2254308sP(enumC854440XfWArr);
    }

    public static EnumC854440XfW[] values() {
        return (EnumC854440XfW[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC854440XfW valueOf(String str) {
        return (EnumC854440XfW) C08FF.LIZ(EnumC854440XfW.class, str);
    }

    public EnumC854440XfW(String str, int i, int i2) {
        this.LL = i2;
    }
}
