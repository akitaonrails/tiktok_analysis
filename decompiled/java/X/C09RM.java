package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09RM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09RM {
    public static final C09RM HIGH;
    public static final /* synthetic */ C09RM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C09RM LOW;

    public static InterfaceC2044707zh<C09RM> getEntries() {
        return LLILLJJLI;
    }

    static {
        C09RM c09rm = new C09RM("HIGH", 0);
        HIGH = c09rm;
        C09RM c09rm2 = new C09RM("LOW", 1);
        LOW = c09rm2;
        C09RM[] c09rmArr = {c09rm, c09rm2};
        LL = c09rmArr;
        LLILLJJLI = new C2254308sP(c09rmArr);
    }

    public static C09RM[] values() {
        return (C09RM[]) LL.clone();
    }

    public static C09RM valueOf(String str) {
        return (C09RM) C08FF.LIZ(C09RM.class, str);
    }

    public C09RM(String str, int i) {
    }
}
