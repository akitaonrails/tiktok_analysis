package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bw9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992590bw9 {
    public static final EnumC992590bw9 BlockStickerInfoHandlerPriority;
    public static final EnumC992590bw9 CommerceStickerInfoHandlerPriority;
    public static final EnumC992590bw9 DPlusStickerInfoHandlerPriority;
    public static final EnumC992590bw9 DesignerInfoHandlerPriority;
    public static final /* synthetic */ EnumC992590bw9[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992590bw9 NormalStickerInfoHandlerPriority;

    public static InterfaceC2044707zh<EnumC992590bw9> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992590bw9 enumC992590bw9 = new EnumC992590bw9("BlockStickerInfoHandlerPriority", 0);
        BlockStickerInfoHandlerPriority = enumC992590bw9;
        EnumC992590bw9 enumC992590bw92 = new EnumC992590bw9("DesignerInfoHandlerPriority", 1);
        DesignerInfoHandlerPriority = enumC992590bw92;
        EnumC992590bw9 enumC992590bw93 = new EnumC992590bw9("CommerceStickerInfoHandlerPriority", 2);
        CommerceStickerInfoHandlerPriority = enumC992590bw93;
        EnumC992590bw9 enumC992590bw94 = new EnumC992590bw9("DPlusStickerInfoHandlerPriority", 3);
        DPlusStickerInfoHandlerPriority = enumC992590bw94;
        EnumC992590bw9 enumC992590bw95 = new EnumC992590bw9("NormalStickerInfoHandlerPriority", 4);
        NormalStickerInfoHandlerPriority = enumC992590bw95;
        EnumC992590bw9[] enumC992590bw9Arr = {enumC992590bw9, enumC992590bw92, enumC992590bw93, enumC992590bw94, enumC992590bw95};
        LL = enumC992590bw9Arr;
        LLILLJJLI = new C2254308sP(enumC992590bw9Arr);
    }

    public static EnumC992590bw9[] values() {
        return (EnumC992590bw9[]) LL.clone();
    }

    public static EnumC992590bw9 valueOf(String str) {
        return (EnumC992590bw9) C08FF.LIZ(EnumC992590bw9.class, str);
    }

    public EnumC992590bw9(String str, int i) {
    }
}
