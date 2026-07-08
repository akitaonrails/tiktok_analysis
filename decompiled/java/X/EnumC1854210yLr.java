package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1854210yLr {
    public static final EnumC1854210yLr AUTO;
    public static final /* synthetic */ EnumC1854210yLr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1854210yLr OFF;
    public static final EnumC1854210yLr ON;

    public static InterfaceC2044707zh<EnumC1854210yLr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1854210yLr enumC1854210yLr = new EnumC1854210yLr("OFF", 0);
        OFF = enumC1854210yLr;
        EnumC1854210yLr enumC1854210yLr2 = new EnumC1854210yLr("ON", 1);
        ON = enumC1854210yLr2;
        EnumC1854210yLr enumC1854210yLr3 = new EnumC1854210yLr("AUTO", 2);
        AUTO = enumC1854210yLr3;
        EnumC1854210yLr[] enumC1854210yLrArr = {enumC1854210yLr, enumC1854210yLr2, enumC1854210yLr3};
        LL = enumC1854210yLrArr;
        LLILLJJLI = new C2254308sP(enumC1854210yLrArr);
    }

    public static EnumC1854210yLr[] values() {
        return (EnumC1854210yLr[]) LL.clone();
    }

    public static EnumC1854210yLr valueOf(String str) {
        return (EnumC1854210yLr) C08FF.LIZ(EnumC1854210yLr.class, str);
    }

    public EnumC1854210yLr(String str, int i) {
    }
}
