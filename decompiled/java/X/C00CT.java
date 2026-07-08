package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CT {
    public static final /* synthetic */ C00CT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00CT landscape;
    public static final C00CT portrait;

    public static InterfaceC2044707zh<C00CT> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00CT c00ct = new C00CT("landscape", 0);
        landscape = c00ct;
        C00CT c00ct2 = new C00CT("portrait", 1);
        portrait = c00ct2;
        C00CT[] c00ctArr = {c00ct, c00ct2};
        LL = c00ctArr;
        LLILLJJLI = new C2254308sP(c00ctArr);
    }

    public static C00CT[] values() {
        return (C00CT[]) LL.clone();
    }

    public static C00CT valueOf(String str) {
        return (C00CT) C08FF.LIZ(C00CT.class, str);
    }

    public C00CT(String str, int i) {
    }
}
