package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WQO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WQO {
    public static final C0WQO HIGH;
    public static final C0WQO IMMEDIATE;
    public static final /* synthetic */ C0WQO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0WQO LOW;
    public static final C0WQO NORMAL;

    public static InterfaceC2044707zh<C0WQO> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0WQO c0wqo = new C0WQO("LOW", 0);
        LOW = c0wqo;
        C0WQO c0wqo2 = new C0WQO("NORMAL", 1);
        NORMAL = c0wqo2;
        C0WQO c0wqo3 = new C0WQO("HIGH", 2);
        HIGH = c0wqo3;
        C0WQO c0wqo4 = new C0WQO("IMMEDIATE", 3);
        IMMEDIATE = c0wqo4;
        C0WQO[] c0wqoArr = {c0wqo, c0wqo2, c0wqo3, c0wqo4};
        LL = c0wqoArr;
        LLILLJJLI = new C2254308sP(c0wqoArr);
    }

    public static C0WQO[] values() {
        return (C0WQO[]) LL.clone();
    }

    public static C0WQO valueOf(String str) {
        return (C0WQO) C08FF.LIZ(C0WQO.class, str);
    }

    public C0WQO(String str, int i) {
    }
}
