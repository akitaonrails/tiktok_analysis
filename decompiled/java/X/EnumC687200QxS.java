package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QxS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC687200QxS {
    public static final EnumC687200QxS BACK_PRESS;
    public static final EnumC687200QxS CLICK_BACK;
    public static final EnumC687200QxS CLOSE;
    public static final EnumC687200QxS FINISH_TASK;
    public static final /* synthetic */ EnumC687200QxS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC687200QxS NEXT;
    public static final EnumC687200QxS NO_GLIDE;
    public static final EnumC687200QxS SWITCH_TAB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC687200QxS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC687200QxS enumC687200QxS = new EnumC687200QxS("NEXT", 0, "next");
        NEXT = enumC687200QxS;
        EnumC687200QxS enumC687200QxS2 = new EnumC687200QxS("NO_GLIDE", 1, "no_glide");
        NO_GLIDE = enumC687200QxS2;
        EnumC687200QxS enumC687200QxS3 = new EnumC687200QxS("CLICK_BACK", 2, "click_back");
        CLICK_BACK = enumC687200QxS3;
        EnumC687200QxS enumC687200QxS4 = new EnumC687200QxS("BACK_PRESS", 3, "back_press");
        BACK_PRESS = enumC687200QxS4;
        EnumC687200QxS enumC687200QxS5 = new EnumC687200QxS("SWITCH_TAB", 4, "switch_tab");
        SWITCH_TAB = enumC687200QxS5;
        EnumC687200QxS enumC687200QxS6 = new EnumC687200QxS("CLOSE", 5, "close");
        CLOSE = enumC687200QxS6;
        EnumC687200QxS enumC687200QxS7 = new EnumC687200QxS("FINISH_TASK", 6, "finish_task");
        FINISH_TASK = enumC687200QxS7;
        EnumC687200QxS[] enumC687200QxSArr = {enumC687200QxS, enumC687200QxS2, enumC687200QxS3, enumC687200QxS4, enumC687200QxS5, enumC687200QxS6, enumC687200QxS7};
        LLILLJJLI = enumC687200QxSArr;
        LLILLL = new C2254308sP(enumC687200QxSArr);
    }

    public static EnumC687200QxS[] values() {
        return (EnumC687200QxS[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC687200QxS valueOf(String str) {
        return (EnumC687200QxS) C08FF.LIZ(EnumC687200QxS.class, str);
    }

    public EnumC687200QxS(String str, int i, String str2) {
        this.LL = str2;
    }
}
