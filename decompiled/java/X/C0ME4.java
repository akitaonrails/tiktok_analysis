package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ME4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0ME4 {
    public static final C0ME4 AI_LIVE_PROGRESS_CHANGE;
    public static final /* synthetic */ C0ME4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "ai_alive_progress_change";

    public static InterfaceC2044707zh<C0ME4> getEntries() {
        return LLILLL;
    }

    static {
        C0ME4 c0me4 = new C0ME4();
        AI_LIVE_PROGRESS_CHANGE = c0me4;
        C0ME4[] c0me4Arr = {c0me4};
        LLILLJJLI = c0me4Arr;
        LLILLL = new C2254308sP(c0me4Arr);
    }

    public static C0ME4[] values() {
        return (C0ME4[]) LLILLJJLI.clone();
    }

    public final String getDescription() {
        return this.LL;
    }

    public static C0ME4 valueOf(String str) {
        return (C0ME4) C08FF.LIZ(C0ME4.class, str);
    }
}
