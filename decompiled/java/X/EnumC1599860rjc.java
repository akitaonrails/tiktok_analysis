package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rjc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1599860rjc {
    public static final EnumC1599860rjc COLLAPSED;
    public static final EnumC1599860rjc COLLAPSING;
    public static final EnumC1599860rjc EXPANDED;
    public static final EnumC1599860rjc EXPANDING;
    public static final /* synthetic */ EnumC1599860rjc[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1599860rjc POPUP_DISMISSING;
    public static final EnumC1599860rjc POPUP_SHOWING;

    public static InterfaceC2044707zh<EnumC1599860rjc> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1599860rjc enumC1599860rjc = new EnumC1599860rjc("COLLAPSED", 0);
        COLLAPSED = enumC1599860rjc;
        EnumC1599860rjc enumC1599860rjc2 = new EnumC1599860rjc("EXPANDING", 1);
        EXPANDING = enumC1599860rjc2;
        EnumC1599860rjc enumC1599860rjc3 = new EnumC1599860rjc("EXPANDED", 2);
        EXPANDED = enumC1599860rjc3;
        EnumC1599860rjc enumC1599860rjc4 = new EnumC1599860rjc("COLLAPSING", 3);
        COLLAPSING = enumC1599860rjc4;
        EnumC1599860rjc enumC1599860rjc5 = new EnumC1599860rjc("POPUP_SHOWING", 4);
        POPUP_SHOWING = enumC1599860rjc5;
        EnumC1599860rjc enumC1599860rjc6 = new EnumC1599860rjc("POPUP_DISMISSING", 5);
        POPUP_DISMISSING = enumC1599860rjc6;
        EnumC1599860rjc[] enumC1599860rjcArr = {enumC1599860rjc, enumC1599860rjc2, enumC1599860rjc3, enumC1599860rjc4, enumC1599860rjc5, enumC1599860rjc6};
        LL = enumC1599860rjcArr;
        LLILLJJLI = new C2254308sP(enumC1599860rjcArr);
    }

    public static EnumC1599860rjc[] values() {
        return (EnumC1599860rjc[]) LL.clone();
    }

    public static EnumC1599860rjc valueOf(String str) {
        return (EnumC1599860rjc) C08FF.LIZ(EnumC1599860rjc.class, str);
    }

    public EnumC1599860rjc(String str, int i) {
    }
}
