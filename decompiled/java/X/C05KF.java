package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05KF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05KF {
    public static final C05KF INBOX_MODE_SWITCH;
    public static final /* synthetic */ C05KF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C05KF SWITCH_ACCOUNT;

    public static InterfaceC2044707zh<C05KF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C05KF c05kf = new C05KF("INBOX_MODE_SWITCH", 0);
        INBOX_MODE_SWITCH = c05kf;
        C05KF c05kf2 = new C05KF("SWITCH_ACCOUNT", 1);
        SWITCH_ACCOUNT = c05kf2;
        C05KF[] c05kfArr = {c05kf, c05kf2};
        LL = c05kfArr;
        LLILLJJLI = new C2254308sP(c05kfArr);
    }

    public static C05KF[] values() {
        return (C05KF[]) LL.clone();
    }

    public static C05KF valueOf(String str) {
        return (C05KF) C08FF.LIZ(C05KF.class, str);
    }

    public C05KF(String str, int i) {
    }
}
