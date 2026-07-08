package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00AT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AT {
    public static final /* synthetic */ C00AT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00AT PROFILE_SETTING;
    public static final C00AT PROFILE_USER;
    public static final C00AT SETTINGS_FEEDBACK;

    public static InterfaceC2044707zh<C00AT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00AT c00at = new C00AT("PROFILE_USER", 0);
        PROFILE_USER = c00at;
        C00AT c00at2 = new C00AT("PROFILE_SETTING", 1);
        PROFILE_SETTING = c00at2;
        C00AT c00at3 = new C00AT("SETTINGS_FEEDBACK", 2);
        SETTINGS_FEEDBACK = c00at3;
        C00AT[] c00atArr = {c00at, c00at2, c00at3};
        LL = c00atArr;
        LLILLJJLI = new C2254308sP(c00atArr);
    }

    public static C00AT[] values() {
        return (C00AT[]) LL.clone();
    }

    public static C00AT valueOf(String str) {
        return (C00AT) C08FF.LIZ(C00AT.class, str);
    }

    public C00AT(String str, int i) {
    }
}
