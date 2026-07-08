package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Dxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC356180Dxo {
    public static final EnumC356180Dxo FAIL_TO_ADD_PIP;
    public static final EnumC356180Dxo FAIL_TO_SPLIT;
    public static final EnumC356180Dxo FILE_IS_EMPTY;
    public static final /* synthetic */ EnumC356180Dxo[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC356180Dxo NOT_SELECT_SLOT;
    public static final EnumC356180Dxo SUCCESS;

    public static InterfaceC2044707zh<EnumC356180Dxo> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC356180Dxo enumC356180Dxo = new EnumC356180Dxo("SUCCESS", 0);
        SUCCESS = enumC356180Dxo;
        EnumC356180Dxo enumC356180Dxo2 = new EnumC356180Dxo("NOT_SELECT_SLOT", 1);
        NOT_SELECT_SLOT = enumC356180Dxo2;
        EnumC356180Dxo enumC356180Dxo3 = new EnumC356180Dxo("FILE_IS_EMPTY", 2);
        FILE_IS_EMPTY = enumC356180Dxo3;
        EnumC356180Dxo enumC356180Dxo4 = new EnumC356180Dxo("FAIL_TO_SPLIT", 3);
        FAIL_TO_SPLIT = enumC356180Dxo4;
        EnumC356180Dxo enumC356180Dxo5 = new EnumC356180Dxo("FAIL_TO_ADD_PIP", 4);
        FAIL_TO_ADD_PIP = enumC356180Dxo5;
        EnumC356180Dxo[] enumC356180DxoArr = {enumC356180Dxo, enumC356180Dxo2, enumC356180Dxo3, enumC356180Dxo4, enumC356180Dxo5};
        LL = enumC356180DxoArr;
        LLILLJJLI = new C2254308sP(enumC356180DxoArr);
    }

    public static EnumC356180Dxo[] values() {
        return (EnumC356180Dxo[]) LL.clone();
    }

    public static EnumC356180Dxo valueOf(String str) {
        return (EnumC356180Dxo) C08FF.LIZ(EnumC356180Dxo.class, str);
    }

    public EnumC356180Dxo(String str, int i) {
    }
}
