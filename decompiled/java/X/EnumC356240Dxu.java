package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356240Dxu {
    public static final EnumC356240Dxu EDIT;
    public static final EnumC356240Dxu EDITOR_PRO;
    public static final /* synthetic */ EnumC356240Dxu[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC356240Dxu> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356240Dxu enumC356240Dxu = new EnumC356240Dxu("EDIT", 0);
        EDIT = enumC356240Dxu;
        EnumC356240Dxu enumC356240Dxu2 = new EnumC356240Dxu("EDITOR_PRO", 1);
        EDITOR_PRO = enumC356240Dxu2;
        EnumC356240Dxu[] enumC356240DxuArr = {enumC356240Dxu, enumC356240Dxu2};
        LL = enumC356240DxuArr;
        LLILLJJLI = new C2254308sP(enumC356240DxuArr);
    }

    public static EnumC356240Dxu[] values() {
        return (EnumC356240Dxu[]) LL.clone();
    }

    public static EnumC356240Dxu valueOf(String str) {
        return (EnumC356240Dxu) C08FF.LIZ(EnumC356240Dxu.class, str);
    }

    public EnumC356240Dxu(String str, int i) {
    }
}
