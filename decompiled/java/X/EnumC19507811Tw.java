package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.11Tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class EnumC19507811Tw {
    public static final EnumC19507811Tw BOTTOM;
    public static final /* synthetic */ EnumC19507811Tw[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC19507811Tw MIDDLE;
    public static final EnumC19507811Tw SINGLE;
    public static final EnumC19507811Tw TOP;

    public static InterfaceC2044707zh<EnumC19507811Tw> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19507811Tw enumC19507811Tw = new EnumC19507811Tw("TOP", 0);
        TOP = enumC19507811Tw;
        EnumC19507811Tw enumC19507811Tw2 = new EnumC19507811Tw("MIDDLE", 1);
        MIDDLE = enumC19507811Tw2;
        EnumC19507811Tw enumC19507811Tw3 = new EnumC19507811Tw("BOTTOM", 2);
        BOTTOM = enumC19507811Tw3;
        EnumC19507811Tw enumC19507811Tw4 = new EnumC19507811Tw("SINGLE", 3);
        SINGLE = enumC19507811Tw4;
        EnumC19507811Tw[] enumC19507811TwArr = {enumC19507811Tw, enumC19507811Tw2, enumC19507811Tw3, enumC19507811Tw4};
        LL = enumC19507811TwArr;
        LLILLJJLI = new C2254308sP(enumC19507811TwArr);
    }

    public static EnumC19507811Tw[] values() {
        return (EnumC19507811Tw[]) LL.clone();
    }

    public static EnumC19507811Tw valueOf(String str) {
        return (EnumC19507811Tw) C08FF.LIZ(EnumC19507811Tw.class, str);
    }

    public EnumC19507811Tw(String str, int i) {
    }
}
