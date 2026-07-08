package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZY9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZY9 {
    public static final C0ZY9 CAMPUS_GROUP;
    public static final C0ZY9 FAN_GROUP;
    public static final C0ZY9 GROUP;
    public static final /* synthetic */ C0ZY9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0ZY9 PUBLIC_GROUP;
    public final String LL;

    public static InterfaceC2044707zh<C0ZY9> getEntries() {
        return LLILLL;
    }

    static {
        C0ZY9 c0zy9 = new C0ZY9("FAN_GROUP", 0, "fan_group");
        FAN_GROUP = c0zy9;
        C0ZY9 c0zy92 = new C0ZY9("CAMPUS_GROUP", 1, "campus_group");
        CAMPUS_GROUP = c0zy92;
        C0ZY9 c0zy93 = new C0ZY9("PUBLIC_GROUP", 2, "public_group");
        PUBLIC_GROUP = c0zy93;
        C0ZY9 c0zy94 = new C0ZY9("GROUP", 3, "group");
        GROUP = c0zy94;
        C0ZY9[] c0zy9Arr = {c0zy9, c0zy92, c0zy93, c0zy94};
        LLILLJJLI = c0zy9Arr;
        LLILLL = new C2254308sP(c0zy9Arr);
    }

    public static C0ZY9[] values() {
        return (C0ZY9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0ZY9 valueOf(String str) {
        return (C0ZY9) C08FF.LIZ(C0ZY9.class, str);
    }

    public C0ZY9(String str, int i, String str2) {
        this.LL = str2;
    }
}
