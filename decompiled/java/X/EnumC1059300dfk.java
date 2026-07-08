package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dfk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1059300dfk {
    public static final EnumC1059300dfk AD;
    public static final EnumC1059300dfk DM;
    public static final /* synthetic */ EnumC1059300dfk[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1059300dfk TTOP;

    public static InterfaceC2044707zh<EnumC1059300dfk> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1059300dfk enumC1059300dfk = new EnumC1059300dfk("AD", 0);
        AD = enumC1059300dfk;
        EnumC1059300dfk enumC1059300dfk2 = new EnumC1059300dfk("TTOP", 1);
        TTOP = enumC1059300dfk2;
        EnumC1059300dfk enumC1059300dfk3 = new EnumC1059300dfk("DM", 2);
        DM = enumC1059300dfk3;
        EnumC1059300dfk[] enumC1059300dfkArr = {enumC1059300dfk, enumC1059300dfk2, enumC1059300dfk3};
        LL = enumC1059300dfkArr;
        LLILLJJLI = new C2254308sP(enumC1059300dfkArr);
    }

    public static EnumC1059300dfk[] values() {
        return (EnumC1059300dfk[]) LL.clone();
    }

    public static EnumC1059300dfk valueOf(String str) {
        return (EnumC1059300dfk) C08FF.LIZ(EnumC1059300dfk.class, str);
    }

    public EnumC1059300dfk(String str, int i) {
    }
}
