package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0h4A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1189760h4A {
    public static final EnumC1189760h4A GUIDE_ANIMATION;
    public static final EnumC1189760h4A HISTORY_ICON;
    public static final EnumC1189760h4A LIBRARY_BUTTON;
    public static final EnumC1189760h4A LIBRARY_BUTTON_WITH_TEXT;
    public static final /* synthetic */ EnumC1189760h4A[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1189760h4A ONLINE;

    public static InterfaceC2044707zh<EnumC1189760h4A> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1189760h4A enumC1189760h4A = new EnumC1189760h4A("ONLINE", 0);
        ONLINE = enumC1189760h4A;
        EnumC1189760h4A enumC1189760h4A2 = new EnumC1189760h4A("LIBRARY_BUTTON_WITH_TEXT", 1);
        LIBRARY_BUTTON_WITH_TEXT = enumC1189760h4A2;
        EnumC1189760h4A enumC1189760h4A3 = new EnumC1189760h4A("LIBRARY_BUTTON", 2);
        LIBRARY_BUTTON = enumC1189760h4A3;
        EnumC1189760h4A enumC1189760h4A4 = new EnumC1189760h4A("HISTORY_ICON", 3);
        HISTORY_ICON = enumC1189760h4A4;
        EnumC1189760h4A enumC1189760h4A5 = new EnumC1189760h4A("GUIDE_ANIMATION", 4);
        GUIDE_ANIMATION = enumC1189760h4A5;
        EnumC1189760h4A[] enumC1189760h4AArr = {enumC1189760h4A, enumC1189760h4A2, enumC1189760h4A3, enumC1189760h4A4, enumC1189760h4A5};
        LL = enumC1189760h4AArr;
        LLILLJJLI = new C2254308sP(enumC1189760h4AArr);
    }

    public static EnumC1189760h4A[] values() {
        return (EnumC1189760h4A[]) LL.clone();
    }

    public static EnumC1189760h4A valueOf(String str) {
        return (EnumC1189760h4A) C08FF.LIZ(EnumC1189760h4A.class, str);
    }

    public EnumC1189760h4A(String str, int i) {
    }
}
