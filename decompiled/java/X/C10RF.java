package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10RF, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10RF {
    public static final /* synthetic */ C10RF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C10RF NEW_UI;
    public static final C10RF ONLINE;
    public static final C10RF TOPIC;

    public static InterfaceC2044707zh<C10RF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C10RF c10rf = new C10RF("ONLINE", 0);
        ONLINE = c10rf;
        C10RF c10rf2 = new C10RF("TOPIC", 1);
        TOPIC = c10rf2;
        C10RF c10rf3 = new C10RF("NEW_UI", 2);
        NEW_UI = c10rf3;
        C10RF[] c10rfArr = {c10rf, c10rf2, c10rf3};
        LL = c10rfArr;
        LLILLJJLI = new C2254308sP(c10rfArr);
    }

    public static C10RF[] values() {
        return (C10RF[]) LL.clone();
    }

    public static C10RF valueOf(String str) {
        return (C10RF) C08FF.LIZ(C10RF.class, str);
    }

    public C10RF(String str, int i) {
    }
}
