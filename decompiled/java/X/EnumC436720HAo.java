package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC436720HAo {
    public static final EnumC436720HAo CREATION_PANEL;
    public static final /* synthetic */ EnumC436720HAo[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC436720HAo TEXT_EDITOR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC436720HAo> getEntries() {
        return LLILLL;
    }

    static {
        EnumC436720HAo enumC436720HAo = new EnumC436720HAo("CREATION_PANEL", 0, "creation_panel");
        CREATION_PANEL = enumC436720HAo;
        EnumC436720HAo enumC436720HAo2 = new EnumC436720HAo("TEXT_EDITOR", 1, "text_editor");
        TEXT_EDITOR = enumC436720HAo2;
        EnumC436720HAo[] enumC436720HAoArr = {enumC436720HAo, enumC436720HAo2};
        LLILLJJLI = enumC436720HAoArr;
        LLILLL = new C2254308sP(enumC436720HAoArr);
    }

    public static EnumC436720HAo[] values() {
        return (EnumC436720HAo[]) LLILLJJLI.clone();
    }

    public final String getParam() {
        return this.LL;
    }

    public static EnumC436720HAo valueOf(String str) {
        return (EnumC436720HAo) C08FF.LIZ(EnumC436720HAo.class, str);
    }

    public EnumC436720HAo(String str, int i, String str2) {
        this.LL = str2;
    }
}
