package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DZ2, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DZ2 {
    public static final C0DZ2 CONSUMPTION_OTHERS;
    public static final C0DZ2 CONSUMPTION_SELF;
    public static final C0DZ2 CREATION;
    public static final /* synthetic */ C0DZ2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0DZ2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0DZ2 c0dz2 = new C0DZ2("CREATION", 0);
        CREATION = c0dz2;
        C0DZ2 c0dz22 = new C0DZ2("CONSUMPTION_OTHERS", 1);
        CONSUMPTION_OTHERS = c0dz22;
        C0DZ2 c0dz23 = new C0DZ2("CONSUMPTION_SELF", 2);
        CONSUMPTION_SELF = c0dz23;
        C0DZ2[] c0dz2Arr = {c0dz2, c0dz22, c0dz23};
        LL = c0dz2Arr;
        LLILLJJLI = new C2254308sP(c0dz2Arr);
    }

    public static C0DZ2[] values() {
        return (C0DZ2[]) LL.clone();
    }

    public static C0DZ2 valueOf(String str) {
        return (C0DZ2) C08FF.LIZ(C0DZ2.class, str);
    }

    public C0DZ2(String str, int i) {
    }
}
