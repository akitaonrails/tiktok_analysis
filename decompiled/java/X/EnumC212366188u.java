package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.188u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class EnumC212366188u {
    public static final EnumC212366188u CHANGE_COLOR;
    public static final EnumC212366188u ENABLE;
    public static final EnumC212366188u GENERATE_TOAST;
    public static final /* synthetic */ EnumC212366188u[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC212366188u PROMPT_TOAST;
    public static final EnumC212366188u RESET_ALPHA;
    public static final EnumC212366188u STOPPING_TOAST;

    public static InterfaceC2044707zh<EnumC212366188u> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC212366188u enumC212366188u = new EnumC212366188u("ENABLE", 0);
        ENABLE = enumC212366188u;
        EnumC212366188u enumC212366188u2 = new EnumC212366188u("RESET_ALPHA", 1);
        RESET_ALPHA = enumC212366188u2;
        EnumC212366188u enumC212366188u3 = new EnumC212366188u("CHANGE_COLOR", 2);
        CHANGE_COLOR = enumC212366188u3;
        EnumC212366188u enumC212366188u4 = new EnumC212366188u("PROMPT_TOAST", 3);
        PROMPT_TOAST = enumC212366188u4;
        EnumC212366188u enumC212366188u5 = new EnumC212366188u("GENERATE_TOAST", 4);
        GENERATE_TOAST = enumC212366188u5;
        EnumC212366188u enumC212366188u6 = new EnumC212366188u("STOPPING_TOAST", 5);
        STOPPING_TOAST = enumC212366188u6;
        EnumC212366188u[] enumC212366188uArr = {enumC212366188u, enumC212366188u2, enumC212366188u3, enumC212366188u4, enumC212366188u5, enumC212366188u6};
        LL = enumC212366188uArr;
        LLILLJJLI = new C2254308sP(enumC212366188uArr);
    }

    public static EnumC212366188u[] values() {
        return (EnumC212366188u[]) LL.clone();
    }

    public static EnumC212366188u valueOf(String str) {
        return (EnumC212366188u) C08FF.LIZ(EnumC212366188u.class, str);
    }

    public EnumC212366188u(String str, int i) {
    }
}
