package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356100Dxg {
    public static final EnumC356100Dxg EMPTY_HIGHLIGHT_RESULT;
    public static final /* synthetic */ EnumC356100Dxg[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC356100Dxg NULL_HIGHLIGHT_RESULT;
    public static final EnumC356100Dxg NULL_NLE_SESSION;
    public static final EnumC356100Dxg USER_CANCEL;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC356100Dxg> getEntries() {
        return LLILZ;
    }

    static {
        EnumC356100Dxg enumC356100Dxg = new EnumC356100Dxg("NULL_NLE_SESSION", 0, -30000, "editorContext nleSession value is null");
        NULL_NLE_SESSION = enumC356100Dxg;
        EnumC356100Dxg enumC356100Dxg2 = new EnumC356100Dxg("NULL_HIGHLIGHT_RESULT", 1, -30001, "highLightResult value is null");
        NULL_HIGHLIGHT_RESULT = enumC356100Dxg2;
        EnumC356100Dxg enumC356100Dxg3 = new EnumC356100Dxg("EMPTY_HIGHLIGHT_RESULT", 2, -30002, "highLightResult value is empty");
        EMPTY_HIGHLIGHT_RESULT = enumC356100Dxg3;
        EnumC356100Dxg enumC356100Dxg4 = new EnumC356100Dxg("USER_CANCEL", 3, -30003, "user click cancel smart trim");
        USER_CANCEL = enumC356100Dxg4;
        EnumC356100Dxg[] enumC356100DxgArr = {enumC356100Dxg, enumC356100Dxg2, enumC356100Dxg3, enumC356100Dxg4};
        LLILLL = enumC356100DxgArr;
        LLILZ = new C2254308sP(enumC356100DxgArr);
    }

    public static EnumC356100Dxg[] values() {
        return (EnumC356100Dxg[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMsg() {
        return this.LLILLJJLI;
    }

    public static EnumC356100Dxg valueOf(String str) {
        return (EnumC356100Dxg) C08FF.LIZ(EnumC356100Dxg.class, str);
    }

    public EnumC356100Dxg(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
