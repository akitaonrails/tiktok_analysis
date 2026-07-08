package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009Y, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009Y {
    public static final /* synthetic */ C009Y[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C009Y MDL;

    public static InterfaceC2044707zh<C009Y> getEntries() {
        return LLILLJJLI;
    }

    static {
        C009Y c009y = new C009Y();
        MDL = c009y;
        C009Y[] c009yArr = {c009y};
        LL = c009yArr;
        LLILLJJLI = new C2254308sP(c009yArr);
    }

    public static C009Y[] values() {
        return (C009Y[]) LL.clone();
    }

    public static C009Y valueOf(String str) {
        return (C009Y) C08FF.LIZ(C009Y.class, str);
    }
}
