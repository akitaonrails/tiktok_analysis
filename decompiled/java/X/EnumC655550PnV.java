package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PnV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC655550PnV {
    public static final EnumC655550PnV ICON;
    public static final EnumC655550PnV ICON_COUNT;
    public static final /* synthetic */ EnumC655550PnV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC655550PnV> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC655550PnV enumC655550PnV = new EnumC655550PnV("ICON", 0);
        ICON = enumC655550PnV;
        EnumC655550PnV enumC655550PnV2 = new EnumC655550PnV("ICON_COUNT", 1);
        ICON_COUNT = enumC655550PnV2;
        EnumC655550PnV[] enumC655550PnVArr = {enumC655550PnV, enumC655550PnV2};
        LL = enumC655550PnVArr;
        LLILLJJLI = new C2254308sP(enumC655550PnVArr);
    }

    public static EnumC655550PnV[] values() {
        return (EnumC655550PnV[]) LL.clone();
    }

    public static EnumC655550PnV valueOf(String str) {
        return (EnumC655550PnV) C08FF.LIZ(EnumC655550PnV.class, str);
    }

    public EnumC655550PnV(String str, int i) {
    }
}
