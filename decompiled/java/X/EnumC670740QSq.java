package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC670740QSq {
    public static final EnumC670740QSq CANCEL;
    public static final /* synthetic */ EnumC670740QSq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC670740QSq NOT_INTERESTED;
    public static final EnumC670740QSq NOT_RELEVANT;
    public static final EnumC670740QSq REPORT;
    public static final EnumC670740QSq TEXTUAL_MISTAKES;
    public final String LL;

    public static InterfaceC2044707zh<EnumC670740QSq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC670740QSq enumC670740QSq = new EnumC670740QSq("REPORT", 0, "report");
        REPORT = enumC670740QSq;
        EnumC670740QSq enumC670740QSq2 = new EnumC670740QSq("NOT_INTERESTED", 1, "not_interested");
        NOT_INTERESTED = enumC670740QSq2;
        EnumC670740QSq enumC670740QSq3 = new EnumC670740QSq("TEXTUAL_MISTAKES", 2, "textual_mistakes");
        TEXTUAL_MISTAKES = enumC670740QSq3;
        EnumC670740QSq enumC670740QSq4 = new EnumC670740QSq("CANCEL", 3, "cancel");
        CANCEL = enumC670740QSq4;
        EnumC670740QSq enumC670740QSq5 = new EnumC670740QSq("NOT_RELEVANT", 4, "not_relevant");
        NOT_RELEVANT = enumC670740QSq5;
        EnumC670740QSq[] enumC670740QSqArr = {enumC670740QSq, enumC670740QSq2, enumC670740QSq3, enumC670740QSq4, enumC670740QSq5};
        LLILLJJLI = enumC670740QSqArr;
        LLILLL = new C2254308sP(enumC670740QSqArr);
    }

    public static EnumC670740QSq[] values() {
        return (EnumC670740QSq[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC670740QSq valueOf(String str) {
        return (EnumC670740QSq) C08FF.LIZ(EnumC670740QSq.class, str);
    }

    public EnumC670740QSq(String str, int i, String str2) {
        this.LL = str2;
    }
}
