package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Sc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC724870Sc1 {
    public static final EnumC724870Sc1 ACTIVITY;
    public static final EnumC724870Sc1 ASSEM;
    public static final EnumC724870Sc1 ASSEMBLE_COMPONENT;
    public static final EnumC724870Sc1 FRAGMENT;
    public static final /* synthetic */ EnumC724870Sc1[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC724870Sc1 REUSED_ASSEM;
    public static final EnumC724870Sc1 REUSED_UIASSEM;
    public static final EnumC724870Sc1 UI_ASSEM;

    public static InterfaceC2044707zh<EnumC724870Sc1> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC724870Sc1 enumC724870Sc1 = new EnumC724870Sc1("ACTIVITY", 0);
        ACTIVITY = enumC724870Sc1;
        EnumC724870Sc1 enumC724870Sc12 = new EnumC724870Sc1("FRAGMENT", 1);
        FRAGMENT = enumC724870Sc12;
        EnumC724870Sc1 enumC724870Sc13 = new EnumC724870Sc1("ASSEM", 2);
        ASSEM = enumC724870Sc13;
        EnumC724870Sc1 enumC724870Sc14 = new EnumC724870Sc1("REUSED_ASSEM", 3);
        REUSED_ASSEM = enumC724870Sc14;
        EnumC724870Sc1 enumC724870Sc15 = new EnumC724870Sc1("REUSED_UIASSEM", 4);
        REUSED_UIASSEM = enumC724870Sc15;
        EnumC724870Sc1 enumC724870Sc16 = new EnumC724870Sc1("ASSEMBLE_COMPONENT", 5);
        ASSEMBLE_COMPONENT = enumC724870Sc16;
        EnumC724870Sc1 enumC724870Sc17 = new EnumC724870Sc1("UI_ASSEM", 6);
        UI_ASSEM = enumC724870Sc17;
        EnumC724870Sc1[] enumC724870Sc1Arr = {enumC724870Sc1, enumC724870Sc12, enumC724870Sc13, enumC724870Sc14, enumC724870Sc15, enumC724870Sc16, enumC724870Sc17};
        LL = enumC724870Sc1Arr;
        LLILLJJLI = new C2254308sP(enumC724870Sc1Arr);
    }

    public static EnumC724870Sc1[] values() {
        return (EnumC724870Sc1[]) LL.clone();
    }

    public static EnumC724870Sc1 valueOf(String str) {
        return (EnumC724870Sc1) C08FF.LIZ(EnumC724870Sc1.class, str);
    }

    public EnumC724870Sc1(String str, int i) {
    }
}
