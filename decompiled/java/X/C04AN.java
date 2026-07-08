package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.04AN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04AN {
    public static final /* synthetic */ C04AN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C04AN all;
    public static final C04AN half;
    public static final C04AN none;

    public static InterfaceC2044707zh<C04AN> getEntries() {
        return LLILLJJLI;
    }

    static {
        C04AN c04an = new C04AN("all", 0);
        all = c04an;
        C04AN c04an2 = new C04AN("half", 1);
        half = c04an2;
        C04AN c04an3 = new C04AN("none", 2);
        none = c04an3;
        C04AN[] c04anArr = {c04an, c04an2, c04an3};
        LL = c04anArr;
        LLILLJJLI = new C2254308sP(c04anArr);
    }

    public static C04AN[] values() {
        return (C04AN[]) LL.clone();
    }

    public static C04AN valueOf(String str) {
        return (C04AN) C08FF.LIZ(C04AN.class, str);
    }

    public C04AN(String str, int i) {
    }
}
