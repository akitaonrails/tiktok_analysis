package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1581260rFc {
    public static final EnumC1581260rFc COLLAPSED;
    public static final EnumC1581260rFc EXPANDED;
    public static final /* synthetic */ EnumC1581260rFc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1581260rFc OVERLAY;

    public static InterfaceC2044707zh<EnumC1581260rFc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1581260rFc enumC1581260rFc = new EnumC1581260rFc("COLLAPSED", 0);
        COLLAPSED = enumC1581260rFc;
        EnumC1581260rFc enumC1581260rFc2 = new EnumC1581260rFc("EXPANDED", 1);
        EXPANDED = enumC1581260rFc2;
        EnumC1581260rFc enumC1581260rFc3 = new EnumC1581260rFc("OVERLAY", 2);
        OVERLAY = enumC1581260rFc3;
        EnumC1581260rFc[] enumC1581260rFcArr = {enumC1581260rFc, enumC1581260rFc2, enumC1581260rFc3};
        LL = enumC1581260rFcArr;
        LLILLJJLI = new C2254308sP(enumC1581260rFcArr);
    }

    public static EnumC1581260rFc[] values() {
        return (EnumC1581260rFc[]) LL.clone();
    }

    public static EnumC1581260rFc valueOf(String str) {
        return (EnumC1581260rFc) C08FF.LIZ(EnumC1581260rFc.class, str);
    }

    public EnumC1581260rFc(String str, int i) {
    }
}
