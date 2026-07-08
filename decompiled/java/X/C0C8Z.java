package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8Z, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8Z {
    public static final C0C8Z COMMON;
    public static final /* synthetic */ C0C8Z[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0C8Z VISUAL_TAG;
    public final String LL;

    public static InterfaceC2044707zh<C0C8Z> getEntries() {
        return LLILLL;
    }

    static {
        C0C8Z c0c8z = new C0C8Z("COMMON", 0, "visual_search_about");
        COMMON = c0c8z;
        C0C8Z c0c8z2 = new C0C8Z("VISUAL_TAG", 1, "visualSearch");
        VISUAL_TAG = c0c8z2;
        C0C8Z[] c0c8zArr = {c0c8z, c0c8z2};
        LLILLJJLI = c0c8zArr;
        LLILLL = new C2254308sP(c0c8zArr);
    }

    public static C0C8Z[] values() {
        return (C0C8Z[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0C8Z valueOf(String str) {
        return (C0C8Z) C08FF.LIZ(C0C8Z.class, str);
    }

    public C0C8Z(String str, int i, String str2) {
        this.LL = str2;
    }
}
