package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC681560QoM {
    public static final EnumC681560QoM HISTORY;
    public static final /* synthetic */ EnumC681560QoM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC681560QoM TRENDING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC681560QoM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC681560QoM enumC681560QoM = new EnumC681560QoM("HISTORY", 0, "processGlobalData");
        HISTORY = enumC681560QoM;
        EnumC681560QoM enumC681560QoM2 = new EnumC681560QoM("TRENDING", 1, "processGuessSearchData");
        TRENDING = enumC681560QoM2;
        EnumC681560QoM[] enumC681560QoMArr = {enumC681560QoM, enumC681560QoM2};
        LLILLJJLI = enumC681560QoMArr;
        LLILLL = new C2254308sP(enumC681560QoMArr);
    }

    public static EnumC681560QoM[] values() {
        return (EnumC681560QoM[]) LLILLJJLI.clone();
    }

    public final String getProcessorName() {
        return this.LL;
    }

    public static EnumC681560QoM valueOf(String str) {
        return (EnumC681560QoM) C08FF.LIZ(EnumC681560QoM.class, str);
    }

    public EnumC681560QoM(String str, int i, String str2) {
        this.LL = str2;
    }
}
