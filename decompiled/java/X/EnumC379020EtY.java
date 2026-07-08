package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EtY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC379020EtY {
    public static final EnumC379020EtY GENERATE;
    public static final EnumC379020EtY GENERATE_FAIL;
    public static final /* synthetic */ EnumC379020EtY[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC379020EtY PANEL_SHOW;
    public static final EnumC379020EtY PRE_FETCH;
    public static final EnumC379020EtY REGENERATE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC379020EtY> getEntries() {
        return LLILLL;
    }

    static {
        EnumC379020EtY enumC379020EtY = new EnumC379020EtY("GENERATE", 0, "generate");
        GENERATE = enumC379020EtY;
        EnumC379020EtY enumC379020EtY2 = new EnumC379020EtY("GENERATE_FAIL", 1, "generate_fail");
        GENERATE_FAIL = enumC379020EtY2;
        EnumC379020EtY enumC379020EtY3 = new EnumC379020EtY("REGENERATE", 2, "regenerate");
        REGENERATE = enumC379020EtY3;
        EnumC379020EtY enumC379020EtY4 = new EnumC379020EtY("PANEL_SHOW", 3, "panel_show");
        PANEL_SHOW = enumC379020EtY4;
        EnumC379020EtY enumC379020EtY5 = new EnumC379020EtY("PRE_FETCH", 4, "pre_fetch");
        PRE_FETCH = enumC379020EtY5;
        EnumC379020EtY[] enumC379020EtYArr = {enumC379020EtY, enumC379020EtY2, enumC379020EtY3, enumC379020EtY4, enumC379020EtY5};
        LLILLJJLI = enumC379020EtYArr;
        LLILLL = new C2254308sP(enumC379020EtYArr);
    }

    public static EnumC379020EtY[] values() {
        return (EnumC379020EtY[]) LLILLJJLI.clone();
    }

    public final String getSceneName() {
        return this.LL;
    }

    public static EnumC379020EtY valueOf(String str) {
        return (EnumC379020EtY) C08FF.LIZ(EnumC379020EtY.class, str);
    }

    public EnumC379020EtY(String str, int i, String str2) {
        this.LL = str2;
    }
}
