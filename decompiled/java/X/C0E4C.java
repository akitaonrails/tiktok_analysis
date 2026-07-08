package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E4C, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E4C {
    public static final /* synthetic */ C0E4C[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0E4C VIBRATE_IMPACT_LIGHT;
    public static final C0E4C VIBRATE_NOTIFICATION_ERROR;

    public static InterfaceC2044707zh<C0E4C> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0E4C c0e4c = new C0E4C("VIBRATE_IMPACT_LIGHT", 0);
        VIBRATE_IMPACT_LIGHT = c0e4c;
        C0E4C c0e4c2 = new C0E4C("VIBRATE_NOTIFICATION_ERROR", 1);
        VIBRATE_NOTIFICATION_ERROR = c0e4c2;
        C0E4C[] c0e4cArr = {c0e4c, c0e4c2};
        LL = c0e4cArr;
        LLILLJJLI = new C2254308sP(c0e4cArr);
    }

    public static C0E4C[] values() {
        return (C0E4C[]) LL.clone();
    }

    public static C0E4C valueOf(String str) {
        return (C0E4C) C08FF.LIZ(C0E4C.class, str);
    }

    public C0E4C(String str, int i) {
    }
}
