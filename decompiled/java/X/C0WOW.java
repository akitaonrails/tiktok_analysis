package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WOW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WOW {
    public static final /* synthetic */ C0WOW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0WOW SPARK;
    public static final C0WOW SPARK_LITE;

    public static InterfaceC2044707zh<C0WOW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0WOW c0wow = new C0WOW("SPARK", 0);
        SPARK = c0wow;
        C0WOW c0wow2 = new C0WOW("SPARK_LITE", 1);
        SPARK_LITE = c0wow2;
        C0WOW[] c0wowArr = {c0wow, c0wow2};
        LL = c0wowArr;
        LLILLJJLI = new C2254308sP(c0wowArr);
    }

    public static C0WOW[] values() {
        return (C0WOW[]) LL.clone();
    }

    public static C0WOW valueOf(String str) {
        return (C0WOW) C08FF.LIZ(C0WOW.class, str);
    }

    public C0WOW(String str, int i) {
    }
}
