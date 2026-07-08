package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07uR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2012107uR {
    public static final EnumC2012107uR BUTTON;
    public static final EnumC2012107uR ICON;
    public static final /* synthetic */ EnumC2012107uR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC2012107uR> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2012107uR enumC2012107uR = new EnumC2012107uR("ICON", 0);
        ICON = enumC2012107uR;
        EnumC2012107uR enumC2012107uR2 = new EnumC2012107uR("BUTTON", 1);
        BUTTON = enumC2012107uR2;
        EnumC2012107uR[] enumC2012107uRArr = {enumC2012107uR, enumC2012107uR2};
        LL = enumC2012107uRArr;
        LLILLJJLI = new C2254308sP(enumC2012107uRArr);
    }

    public static EnumC2012107uR[] values() {
        return (EnumC2012107uR[]) LL.clone();
    }

    public static EnumC2012107uR valueOf(String str) {
        return (EnumC2012107uR) C08FF.LIZ(EnumC2012107uR.class, str);
    }

    public EnumC2012107uR(String str, int i) {
    }
}
