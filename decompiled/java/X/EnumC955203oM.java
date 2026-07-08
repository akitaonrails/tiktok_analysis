package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03oM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC955203oM {
    public static final /* synthetic */ EnumC955203oM[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC955203oM TTF;
    public static final EnumC955203oM TTS;
    public final String LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC955203oM> getEntries() {
        return LLILZ;
    }

    static {
        EnumC955203oM enumC955203oM = new EnumC955203oM("TTS", 0, "tts", 0);
        TTS = enumC955203oM;
        EnumC955203oM enumC955203oM2 = new EnumC955203oM("TTF", 1, "ttf", 2);
        TTF = enumC955203oM2;
        EnumC955203oM[] enumC955203oMArr = {enumC955203oM, enumC955203oM2};
        LLILLL = enumC955203oMArr;
        LLILZ = new C2254308sP(enumC955203oMArr);
    }

    public static EnumC955203oM[] values() {
        return (EnumC955203oM[]) LLILLL.clone();
    }

    public final String getBizName() {
        return this.LL;
    }

    public final int getBizType() {
        return this.LLILLJJLI;
    }

    public static EnumC955203oM valueOf(String str) {
        return (EnumC955203oM) C08FF.LIZ(EnumC955203oM.class, str);
    }

    public EnumC955203oM(String str, int i, String str2, int i2) {
        this.LL = str2;
        this.LLILLJJLI = i2;
    }
}
