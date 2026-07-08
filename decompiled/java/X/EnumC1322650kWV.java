package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kWV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1322650kWV {
    public static final /* synthetic */ EnumC1322650kWV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1322650kWV NUMBER;
    public static final EnumC1322650kWV PERCENTAGE;

    public static InterfaceC2044707zh<EnumC1322650kWV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1322650kWV enumC1322650kWV = new EnumC1322650kWV("NUMBER", 0);
        NUMBER = enumC1322650kWV;
        EnumC1322650kWV enumC1322650kWV2 = new EnumC1322650kWV("PERCENTAGE", 1);
        PERCENTAGE = enumC1322650kWV2;
        EnumC1322650kWV[] enumC1322650kWVArr = {enumC1322650kWV, enumC1322650kWV2};
        LL = enumC1322650kWVArr;
        LLILLJJLI = new C2254308sP(enumC1322650kWVArr);
    }

    public static EnumC1322650kWV[] values() {
        return (EnumC1322650kWV[]) LL.clone();
    }

    public static EnumC1322650kWV valueOf(String str) {
        return (EnumC1322650kWV) C08FF.LIZ(EnumC1322650kWV.class, str);
    }

    public EnumC1322650kWV(String str, int i) {
    }
}
