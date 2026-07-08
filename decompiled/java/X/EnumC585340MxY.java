package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC585340MxY {
    public static final /* synthetic */ EnumC585340MxY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC585340MxY TYPE_IMAGE;
    public static final EnumC585340MxY TYPE_LOADING;
    public static final EnumC585340MxY TYPE_PROMPT;

    public static InterfaceC2044707zh<EnumC585340MxY> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC585340MxY enumC585340MxY = new EnumC585340MxY("TYPE_IMAGE", 0);
        TYPE_IMAGE = enumC585340MxY;
        EnumC585340MxY enumC585340MxY2 = new EnumC585340MxY("TYPE_PROMPT", 1);
        TYPE_PROMPT = enumC585340MxY2;
        EnumC585340MxY enumC585340MxY3 = new EnumC585340MxY("TYPE_LOADING", 2);
        TYPE_LOADING = enumC585340MxY3;
        EnumC585340MxY[] enumC585340MxYArr = {enumC585340MxY, enumC585340MxY2, enumC585340MxY3};
        LL = enumC585340MxYArr;
        LLILLJJLI = new C2254308sP(enumC585340MxYArr);
    }

    public static EnumC585340MxY[] values() {
        return (EnumC585340MxY[]) LL.clone();
    }

    public static EnumC585340MxY valueOf(String str) {
        return (EnumC585340MxY) C08FF.LIZ(EnumC585340MxY.class, str);
    }

    public EnumC585340MxY(String str, int i) {
    }
}
