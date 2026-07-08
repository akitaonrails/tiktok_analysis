package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Tgt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC753370Tgt {
    public static final EnumC753370Tgt FUN_KIT_DIALOG;
    public static final /* synthetic */ EnumC753370Tgt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC753370Tgt SETTING_DIALOG;

    public static InterfaceC2044707zh<EnumC753370Tgt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC753370Tgt enumC753370Tgt = new EnumC753370Tgt("SETTING_DIALOG", 0);
        SETTING_DIALOG = enumC753370Tgt;
        EnumC753370Tgt enumC753370Tgt2 = new EnumC753370Tgt("FUN_KIT_DIALOG", 1);
        FUN_KIT_DIALOG = enumC753370Tgt2;
        EnumC753370Tgt[] enumC753370TgtArr = {enumC753370Tgt, enumC753370Tgt2};
        LL = enumC753370TgtArr;
        LLILLJJLI = new C2254308sP(enumC753370TgtArr);
    }

    public static EnumC753370Tgt[] values() {
        return (EnumC753370Tgt[]) LL.clone();
    }

    public static EnumC753370Tgt valueOf(String str) {
        return (EnumC753370Tgt) C08FF.LIZ(EnumC753370Tgt.class, str);
    }

    public EnumC753370Tgt(String str, int i) {
    }
}
