package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00FF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FF {
    public static final C00FF CONNECTED;
    public static final C00FF DISCONNECTED;
    public static final /* synthetic */ C00FF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C00FF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00FF c00ff = new C00FF("CONNECTED", 0);
        CONNECTED = c00ff;
        C00FF c00ff2 = new C00FF("DISCONNECTED", 1);
        DISCONNECTED = c00ff2;
        C00FF[] c00ffArr = {c00ff, c00ff2};
        LL = c00ffArr;
        LLILLJJLI = new C2254308sP(c00ffArr);
    }

    public static C00FF[] values() {
        return (C00FF[]) LL.clone();
    }

    public static C00FF valueOf(String str) {
        return (C00FF) C08FF.LIZ(C00FF.class, str);
    }

    public C00FF(String str, int i) {
    }
}
