package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07sH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1998707sH {
    public static final EnumC1998707sH CLEAR_FOR_AI_ALIVE;
    public static final EnumC1998707sH CLEAR_FOR_AI_ALIVE_CANCEL_OR_REAPPLY;
    public static final /* synthetic */ EnumC1998707sH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1998707sH NORMAL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1998707sH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1998707sH enumC1998707sH = new EnumC1998707sH("NORMAL", 0, "normal");
        NORMAL = enumC1998707sH;
        EnumC1998707sH enumC1998707sH2 = new EnumC1998707sH("CLEAR_FOR_AI_ALIVE", 1, "clear_for_ai_alive");
        CLEAR_FOR_AI_ALIVE = enumC1998707sH2;
        EnumC1998707sH enumC1998707sH3 = new EnumC1998707sH("CLEAR_FOR_AI_ALIVE_CANCEL_OR_REAPPLY", 2, "clear_for_ai_alive_cancel_or_reapply");
        CLEAR_FOR_AI_ALIVE_CANCEL_OR_REAPPLY = enumC1998707sH3;
        EnumC1998707sH[] enumC1998707sHArr = {enumC1998707sH, enumC1998707sH2, enumC1998707sH3};
        LLILLJJLI = enumC1998707sHArr;
        LLILLL = new C2254308sP(enumC1998707sHArr);
    }

    public static EnumC1998707sH[] values() {
        return (EnumC1998707sH[]) LLILLJJLI.clone();
    }

    public final String getDescription() {
        return this.LL;
    }

    public static EnumC1998707sH valueOf(String str) {
        return (EnumC1998707sH) C08FF.LIZ(EnumC1998707sH.class, str);
    }

    public EnumC1998707sH(String str, int i, String str2) {
        this.LL = str2;
    }
}
