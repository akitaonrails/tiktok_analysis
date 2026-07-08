package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g92, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154340g92 {
    public static final EnumC1154340g92 ADS_SCROLL;
    public static final EnumC1154340g92 LIFECYCLE;
    public static final /* synthetic */ EnumC1154340g92[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1154340g92> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1154340g92 enumC1154340g92 = new EnumC1154340g92("ADS_SCROLL", 0);
        ADS_SCROLL = enumC1154340g92;
        EnumC1154340g92 enumC1154340g922 = new EnumC1154340g92("LIFECYCLE", 1);
        LIFECYCLE = enumC1154340g922;
        EnumC1154340g92[] enumC1154340g92Arr = {enumC1154340g92, enumC1154340g922};
        LL = enumC1154340g92Arr;
        LLILLJJLI = new C2254308sP(enumC1154340g92Arr);
    }

    public static EnumC1154340g92[] values() {
        return (EnumC1154340g92[]) LL.clone();
    }

    public static EnumC1154340g92 valueOf(String str) {
        return (EnumC1154340g92) C08FF.LIZ(EnumC1154340g92.class, str);
    }

    public EnumC1154340g92(String str, int i) {
    }
}
