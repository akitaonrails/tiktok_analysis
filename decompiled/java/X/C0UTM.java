package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UTM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UTM {
    public static final C0UTM DAILY_INSTANCE_TASK_TYPE;
    public static final /* synthetic */ C0UTM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0UTM WEEKLY_INSTANCE_TASK_TYPE;
    public final int LL;

    public static InterfaceC2044707zh<C0UTM> getEntries() {
        return LLILLL;
    }

    static {
        C0UTM c0utm = new C0UTM("WEEKLY_INSTANCE_TASK_TYPE", 0, 0);
        WEEKLY_INSTANCE_TASK_TYPE = c0utm;
        C0UTM c0utm2 = new C0UTM("DAILY_INSTANCE_TASK_TYPE", 1, 1);
        DAILY_INSTANCE_TASK_TYPE = c0utm2;
        C0UTM[] c0utmArr = {c0utm, c0utm2};
        LLILLJJLI = c0utmArr;
        LLILLL = new C2254308sP(c0utmArr);
    }

    public static C0UTM[] values() {
        return (C0UTM[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0UTM valueOf(String str) {
        return (C0UTM) C08FF.LIZ(C0UTM.class, str);
    }

    public C0UTM(String str, int i, int i2) {
        this.LL = i2;
    }
}
