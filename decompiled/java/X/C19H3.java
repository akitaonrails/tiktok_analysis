package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.19H3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19H3 {
    public static final C19H3 DISABLE;
    public static final C19H3 ENABLE;
    public static final /* synthetic */ C19H3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C19H3 SAMPLE;

    public static InterfaceC2044707zh<C19H3> getEntries() {
        return LLILLJJLI;
    }

    static {
        C19H3 c19h3 = new C19H3("SAMPLE", 0);
        SAMPLE = c19h3;
        C19H3 c19h32 = new C19H3("ENABLE", 1);
        ENABLE = c19h32;
        C19H3 c19h33 = new C19H3("DISABLE", 2);
        DISABLE = c19h33;
        C19H3[] c19h3Arr = {c19h3, c19h32, c19h33};
        LL = c19h3Arr;
        LLILLJJLI = new C2254308sP(c19h3Arr);
    }

    public static C19H3[] values() {
        return (C19H3[]) LL.clone();
    }

    public static C19H3 valueOf(String str) {
        return (C19H3) C08FF.LIZ(C19H3.class, str);
    }

    public C19H3(String str, int i) {
    }
}
