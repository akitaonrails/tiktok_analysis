package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XVZ {
    public static final C0XVZ FORCE_BIND;
    public static final /* synthetic */ C0XVZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0XVZ SKIPPABLE_BIND_PROMPT;
    public static final C0XVZ SKIPPABLE_LOGOUT_PROMPT;

    public static InterfaceC2044707zh<C0XVZ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0XVZ c0xvz = new C0XVZ("FORCE_BIND", 0);
        FORCE_BIND = c0xvz;
        C0XVZ c0xvz2 = new C0XVZ("SKIPPABLE_BIND_PROMPT", 1);
        SKIPPABLE_BIND_PROMPT = c0xvz2;
        C0XVZ c0xvz3 = new C0XVZ("SKIPPABLE_LOGOUT_PROMPT", 2);
        SKIPPABLE_LOGOUT_PROMPT = c0xvz3;
        C0XVZ[] c0xvzArr = {c0xvz, c0xvz2, c0xvz3};
        LL = c0xvzArr;
        LLILLJJLI = new C2254308sP(c0xvzArr);
    }

    public static C0XVZ[] values() {
        return (C0XVZ[]) LL.clone();
    }

    public static C0XVZ valueOf(String str) {
        return (C0XVZ) C08FF.LIZ(C0XVZ.class, str);
    }

    public C0XVZ(String str, int i) {
    }
}
