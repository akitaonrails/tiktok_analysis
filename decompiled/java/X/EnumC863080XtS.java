package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC863080XtS {
    public static final EnumC863080XtS CARD_RENDER_ERROR;
    public static final /* synthetic */ EnumC863080XtS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC863080XtS REFRESH_ERROR;

    public static InterfaceC2044707zh<EnumC863080XtS> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC863080XtS enumC863080XtS = new EnumC863080XtS("REFRESH_ERROR", 0);
        REFRESH_ERROR = enumC863080XtS;
        EnumC863080XtS enumC863080XtS2 = new EnumC863080XtS("CARD_RENDER_ERROR", 1);
        CARD_RENDER_ERROR = enumC863080XtS2;
        EnumC863080XtS[] enumC863080XtSArr = {enumC863080XtS, enumC863080XtS2};
        LL = enumC863080XtSArr;
        LLILLJJLI = new C2254308sP(enumC863080XtSArr);
    }

    public static EnumC863080XtS[] values() {
        return (EnumC863080XtS[]) LL.clone();
    }

    public static EnumC863080XtS valueOf(String str) {
        return (EnumC863080XtS) C08FF.LIZ(EnumC863080XtS.class, str);
    }

    public EnumC863080XtS(String str, int i) {
    }
}
