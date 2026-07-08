package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LE3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LE3 {
    public static final C0LE3 AI_LIVE_PROMPT;
    public static final /* synthetic */ C0LE3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0LE3 RECORD;
    public static final C0LE3 SELECT_MATERIAL;

    public static InterfaceC2044707zh<C0LE3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0LE3 c0le3 = new C0LE3("RECORD", 0);
        RECORD = c0le3;
        C0LE3 c0le32 = new C0LE3("SELECT_MATERIAL", 1);
        SELECT_MATERIAL = c0le32;
        C0LE3 c0le33 = new C0LE3("AI_LIVE_PROMPT", 2);
        AI_LIVE_PROMPT = c0le33;
        C0LE3[] c0le3Arr = {c0le3, c0le32, c0le33};
        LL = c0le3Arr;
        LLILLJJLI = new C2254308sP(c0le3Arr);
    }

    public static C0LE3[] values() {
        return (C0LE3[]) LL.clone();
    }

    public static C0LE3 valueOf(String str) {
        return (C0LE3) C08FF.LIZ(C0LE3.class, str);
    }

    public C0LE3(String str, int i) {
    }
}
