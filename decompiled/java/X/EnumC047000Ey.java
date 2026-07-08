package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Ey, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC047000Ey {
    public static final EnumC047000Ey ASK_TAKO_CARD;
    public static final /* synthetic */ EnumC047000Ey[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC047000Ey TOP1_SUG_CARD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC047000Ey> getEntries() {
        return LLILLL;
    }

    static {
        EnumC047000Ey enumC047000Ey = new EnumC047000Ey("ASK_TAKO_CARD", 0, "ask_tako_card");
        ASK_TAKO_CARD = enumC047000Ey;
        EnumC047000Ey enumC047000Ey2 = new EnumC047000Ey("TOP1_SUG_CARD", 1, "top1_sug_card");
        TOP1_SUG_CARD = enumC047000Ey2;
        EnumC047000Ey[] enumC047000EyArr = {enumC047000Ey, enumC047000Ey2};
        LLILLJJLI = enumC047000EyArr;
        LLILLL = new C2254308sP(enumC047000EyArr);
    }

    public static EnumC047000Ey[] values() {
        return (EnumC047000Ey[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC047000Ey valueOf(String str) {
        return (EnumC047000Ey) C08FF.LIZ(EnumC047000Ey.class, str);
    }

    public EnumC047000Ey(String str, int i, String str2) {
        this.LL = str2;
    }
}
