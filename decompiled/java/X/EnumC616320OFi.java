package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OFi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC616320OFi {
    public static final /* synthetic */ EnumC616320OFi[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC616320OFi OFFLINE_MODE_PANEL;
    public static final EnumC616320OFi OFFLINE_MODE_SETTING_PANEL;

    public static InterfaceC2044707zh<EnumC616320OFi> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC616320OFi enumC616320OFi = new EnumC616320OFi("OFFLINE_MODE_PANEL", 0);
        OFFLINE_MODE_PANEL = enumC616320OFi;
        EnumC616320OFi enumC616320OFi2 = new EnumC616320OFi("OFFLINE_MODE_SETTING_PANEL", 1);
        OFFLINE_MODE_SETTING_PANEL = enumC616320OFi2;
        EnumC616320OFi[] enumC616320OFiArr = {enumC616320OFi, enumC616320OFi2};
        LL = enumC616320OFiArr;
        LLILLJJLI = new C2254308sP(enumC616320OFiArr);
    }

    public static EnumC616320OFi[] values() {
        return (EnumC616320OFi[]) LL.clone();
    }

    public static EnumC616320OFi valueOf(String str) {
        return (EnumC616320OFi) C08FF.LIZ(EnumC616320OFi.class, str);
    }

    public EnumC616320OFi(String str, int i) {
    }
}
