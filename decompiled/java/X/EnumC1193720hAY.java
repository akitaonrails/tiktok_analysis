package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hAY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1193720hAY {
    public static final EnumC1193720hAY BUSINESS_MANUALLY;
    public static final EnumC1193720hAY COMPONENT_RELEASE;
    public static final EnumC1193720hAY EXCEPTION;
    public static final /* synthetic */ EnumC1193720hAY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1193720hAY RENDER_FINISH;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1193720hAY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1193720hAY enumC1193720hAY = new EnumC1193720hAY("RENDER_FINISH", 0, "trigger_by_render_finish");
        RENDER_FINISH = enumC1193720hAY;
        EnumC1193720hAY enumC1193720hAY2 = new EnumC1193720hAY("BUSINESS_MANUALLY", 1, "trigger_by_business_manually");
        BUSINESS_MANUALLY = enumC1193720hAY2;
        EnumC1193720hAY enumC1193720hAY3 = new EnumC1193720hAY("COMPONENT_RELEASE", 2, "trigger_by_component_release");
        COMPONENT_RELEASE = enumC1193720hAY3;
        EnumC1193720hAY enumC1193720hAY4 = new EnumC1193720hAY("EXCEPTION", 3, "trigger_by_exception");
        EXCEPTION = enumC1193720hAY4;
        EnumC1193720hAY[] enumC1193720hAYArr = {enumC1193720hAY, enumC1193720hAY2, enumC1193720hAY3, enumC1193720hAY4};
        LLILLJJLI = enumC1193720hAYArr;
        LLILLL = new C2254308sP(enumC1193720hAYArr);
    }

    public static EnumC1193720hAY[] values() {
        return (EnumC1193720hAY[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1193720hAY valueOf(String str) {
        return (EnumC1193720hAY) C08FF.LIZ(EnumC1193720hAY.class, str);
    }

    public EnumC1193720hAY(String str, int i, String str2) {
        this.LL = str2;
    }
}
