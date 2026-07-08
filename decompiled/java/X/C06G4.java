package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06G4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06G4 {
    public static final C06G4 CONVERSATION;
    public static final C06GN Companion;
    public static final /* synthetic */ C06G4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06G4 UNKNOWN;
    public static final C06G4 USER;
    public final int LL;

    public static InterfaceC2044707zh<C06G4> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.06GN] */
    static {
        C06G4 c06g4 = new C06G4("UNKNOWN", 0, 0);
        UNKNOWN = c06g4;
        C06G4 c06g42 = new C06G4("USER", 1, 1);
        USER = c06g42;
        C06G4 c06g43 = new C06G4("CONVERSATION", 2, 2);
        CONVERSATION = c06g43;
        C06G4[] c06g4Arr = {c06g4, c06g42, c06g43};
        LLILLJJLI = c06g4Arr;
        LLILLL = new C2254308sP(c06g4Arr);
        Companion = new Object() { // from class: X.06GN
        };
    }

    public static C06G4[] values() {
        return (C06G4[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C06G4 valueOf(String str) {
        return (C06G4) C08FF.LIZ(C06G4.class, str);
    }

    public C06G4(String str, int i, int i2) {
        this.LL = i2;
    }
}
