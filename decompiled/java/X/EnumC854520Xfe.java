package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xfe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC854520Xfe {
    public static final EnumC854520Xfe DIGITAL_0;
    public static final EnumC854520Xfe DIGITAL_1;
    public static final /* synthetic */ EnumC854520Xfe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC854520Xfe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC854520Xfe enumC854520Xfe = new EnumC854520Xfe("DIGITAL_0", 0, 0);
        DIGITAL_0 = enumC854520Xfe;
        EnumC854520Xfe enumC854520Xfe2 = new EnumC854520Xfe("DIGITAL_1", 1, 1);
        DIGITAL_1 = enumC854520Xfe2;
        EnumC854520Xfe[] enumC854520XfeArr = {enumC854520Xfe, enumC854520Xfe2};
        LLILLJJLI = enumC854520XfeArr;
        LLILLL = new C2254308sP(enumC854520XfeArr);
    }

    public static EnumC854520Xfe[] values() {
        return (EnumC854520Xfe[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC854520Xfe valueOf(String str) {
        return (EnumC854520Xfe) C08FF.LIZ(EnumC854520Xfe.class, str);
    }

    public EnumC854520Xfe(String str, int i, int i2) {
        this.LL = i2;
    }
}
