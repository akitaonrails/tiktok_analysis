package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OI8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OI8 {
    public static final /* synthetic */ C0OI8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0OI8 PROPOSE;
    public static final C0OI8 SET;

    public static InterfaceC2044707zh<C0OI8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OI8 c0oi8 = new C0OI8("SET", 0);
        SET = c0oi8;
        C0OI8 c0oi82 = new C0OI8("PROPOSE", 1);
        PROPOSE = c0oi82;
        C0OI8[] c0oi8Arr = {c0oi8, c0oi82};
        LL = c0oi8Arr;
        LLILLJJLI = new C2254308sP(c0oi8Arr);
    }

    public static C0OI8[] values() {
        return (C0OI8[]) LL.clone();
    }

    public static C0OI8 valueOf(String str) {
        return (C0OI8) C08FF.LIZ(C0OI8.class, str);
    }

    public C0OI8(String str, int i) {
    }
}
