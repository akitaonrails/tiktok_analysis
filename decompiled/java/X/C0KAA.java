package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KAA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KAA implements C0KAI {
    public static final /* synthetic */ C0KAA[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0KAA PLAN_CHANGE_SUCCESS;
    public static final C0KAA RESUBSCRIBE_SUCCESS;
    public static final C0KAA SUBSCRIBE_SUCCESS;

    public static InterfaceC2044707zh<C0KAA> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0KAA c0kaa = new C0KAA("SUBSCRIBE_SUCCESS", 0);
        SUBSCRIBE_SUCCESS = c0kaa;
        C0KAA c0kaa2 = new C0KAA("RESUBSCRIBE_SUCCESS", 1);
        RESUBSCRIBE_SUCCESS = c0kaa2;
        C0KAA c0kaa3 = new C0KAA("PLAN_CHANGE_SUCCESS", 2);
        PLAN_CHANGE_SUCCESS = c0kaa3;
        C0KAA[] c0kaaArr = {c0kaa, c0kaa2, c0kaa3};
        LL = c0kaaArr;
        LLILLJJLI = new C2254308sP(c0kaaArr);
    }

    public static C0KAA[] values() {
        return (C0KAA[]) LL.clone();
    }

    public static C0KAA valueOf(String str) {
        return (C0KAA) C08FF.LIZ(C0KAA.class, str);
    }

    public C0KAA(String str, int i) {
    }
}
