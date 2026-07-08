package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VRM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VRM {
    public static final C0VRM CONTRAST;
    public static final C0VRM CURRENT;
    public static final /* synthetic */ C0VRM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0VRM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0VRM c0vrm = new C0VRM("CONTRAST", 0);
        CONTRAST = c0vrm;
        C0VRM c0vrm2 = new C0VRM("CURRENT", 1);
        CURRENT = c0vrm2;
        C0VRM[] c0vrmArr = {c0vrm, c0vrm2};
        LL = c0vrmArr;
        LLILLJJLI = new C2254308sP(c0vrmArr);
    }

    public static C0VRM[] values() {
        return (C0VRM[]) LL.clone();
    }

    public static C0VRM valueOf(String str) {
        return (C0VRM) C08FF.LIZ(C0VRM.class, str);
    }

    public C0VRM(String str, int i) {
    }
}
