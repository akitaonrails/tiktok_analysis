package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1414610mup {
    public static final EnumC1414610mup AI_ALIVE;
    public static final EnumC1414610mup EDITING_ASSETS;
    public static final /* synthetic */ EnumC1414610mup[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1414610mup> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1414610mup enumC1414610mup = new EnumC1414610mup("EDITING_ASSETS", 0, "editing_assets");
        EDITING_ASSETS = enumC1414610mup;
        EnumC1414610mup enumC1414610mup2 = new EnumC1414610mup("AI_ALIVE", 1, "ai_alive_template");
        AI_ALIVE = enumC1414610mup2;
        EnumC1414610mup[] enumC1414610mupArr = {enumC1414610mup, enumC1414610mup2};
        LLILLJJLI = enumC1414610mupArr;
        LLILLL = new C2254308sP(enumC1414610mupArr);
    }

    public static EnumC1414610mup[] values() {
        return (EnumC1414610mup[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1414610mup valueOf(String str) {
        return (EnumC1414610mup) C08FF.LIZ(EnumC1414610mup.class, str);
    }

    public EnumC1414610mup(String str, int i, String str2) {
        this.LL = str2;
    }
}
