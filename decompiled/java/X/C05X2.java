package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05X2, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05X2 {
    public static final C05X2 GOOGLE_ONETAP;
    public static final /* synthetic */ C05X2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C05X2 PASSKEY;
    public static final C05X2 PASSKEY_AND_GOOGLE_ONETAP;

    public static InterfaceC2044707zh<C05X2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C05X2 c05x2 = new C05X2("PASSKEY_AND_GOOGLE_ONETAP", 0);
        PASSKEY_AND_GOOGLE_ONETAP = c05x2;
        C05X2 c05x22 = new C05X2("PASSKEY", 1);
        PASSKEY = c05x22;
        C05X2 c05x23 = new C05X2("GOOGLE_ONETAP", 2);
        GOOGLE_ONETAP = c05x23;
        C05X2[] c05x2Arr = {c05x2, c05x22, c05x23};
        LL = c05x2Arr;
        LLILLJJLI = new C2254308sP(c05x2Arr);
    }

    public static C05X2[] values() {
        return (C05X2[]) LL.clone();
    }

    public static C05X2 valueOf(String str) {
        return (C05X2) C08FF.LIZ(C05X2.class, str);
    }

    public C05X2(String str, int i) {
    }
}
