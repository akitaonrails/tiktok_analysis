package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0uiR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1714450uiR {
    public static final EnumC1714450uiR FULL_PAGE;
    public static final EnumC1714450uiR HALF_PAGE;
    public static final /* synthetic */ EnumC1714450uiR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1714450uiR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1714450uiR enumC1714450uiR = new EnumC1714450uiR("FULL_PAGE", 0);
        FULL_PAGE = enumC1714450uiR;
        EnumC1714450uiR enumC1714450uiR2 = new EnumC1714450uiR("HALF_PAGE", 1);
        HALF_PAGE = enumC1714450uiR2;
        EnumC1714450uiR[] enumC1714450uiRArr = {enumC1714450uiR, enumC1714450uiR2};
        LL = enumC1714450uiRArr;
        LLILLJJLI = new C2254308sP(enumC1714450uiRArr);
    }

    public static EnumC1714450uiR[] values() {
        return (EnumC1714450uiR[]) LL.clone();
    }

    public static EnumC1714450uiR valueOf(String str) {
        return (EnumC1714450uiR) C08FF.LIZ(EnumC1714450uiR.class, str);
    }

    public EnumC1714450uiR(String str, int i) {
    }
}
