package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356110Dxh {
    public static final EnumC356110Dxh CHANGE_COLOR;
    public static final EnumC356110Dxh ERASER;
    public static final EnumC356110Dxh HIGHLIGHT;
    public static final /* synthetic */ EnumC356110Dxh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356110Dxh NORMAL;

    public static InterfaceC2044707zh<EnumC356110Dxh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356110Dxh enumC356110Dxh = new EnumC356110Dxh("CHANGE_COLOR", 0);
        CHANGE_COLOR = enumC356110Dxh;
        EnumC356110Dxh enumC356110Dxh2 = new EnumC356110Dxh("NORMAL", 1);
        NORMAL = enumC356110Dxh2;
        EnumC356110Dxh enumC356110Dxh3 = new EnumC356110Dxh("HIGHLIGHT", 2);
        HIGHLIGHT = enumC356110Dxh3;
        EnumC356110Dxh enumC356110Dxh4 = new EnumC356110Dxh("ERASER", 3);
        ERASER = enumC356110Dxh4;
        EnumC356110Dxh[] enumC356110DxhArr = {enumC356110Dxh, enumC356110Dxh2, enumC356110Dxh3, enumC356110Dxh4};
        LL = enumC356110DxhArr;
        LLILLJJLI = new C2254308sP(enumC356110DxhArr);
    }

    public static EnumC356110Dxh[] values() {
        return (EnumC356110Dxh[]) LL.clone();
    }

    public static EnumC356110Dxh valueOf(String str) {
        return (EnumC356110Dxh) C08FF.LIZ(EnumC356110Dxh.class, str);
    }

    public EnumC356110Dxh(String str, int i) {
    }
}
