package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QnA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC680820QnA {
    public static final EnumC680820QnA EMOJI;
    public static final /* synthetic */ EnumC680820QnA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC680820QnA TEXT;
    public static final EnumC680820QnA TEXT_EMOJI;
    public final String LL;

    public static InterfaceC2044707zh<EnumC680820QnA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC680820QnA enumC680820QnA = new EnumC680820QnA("TEXT", 0, "text");
        TEXT = enumC680820QnA;
        EnumC680820QnA enumC680820QnA2 = new EnumC680820QnA("EMOJI", 1, "emoji");
        EMOJI = enumC680820QnA2;
        EnumC680820QnA enumC680820QnA3 = new EnumC680820QnA("TEXT_EMOJI", 2, "text_emoji");
        TEXT_EMOJI = enumC680820QnA3;
        EnumC680820QnA[] enumC680820QnAArr = {enumC680820QnA, enumC680820QnA2, enumC680820QnA3};
        LLILLJJLI = enumC680820QnAArr;
        LLILLL = new C2254308sP(enumC680820QnAArr);
    }

    public static EnumC680820QnA[] values() {
        return (EnumC680820QnA[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC680820QnA valueOf(String str) {
        return (EnumC680820QnA) C08FF.LIZ(EnumC680820QnA.class, str);
    }

    public EnumC680820QnA(String str, int i, String str2) {
        this.LL = str2;
    }
}
