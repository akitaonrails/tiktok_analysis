package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I60, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I60 {
    public static final C0I60 END;
    public static final /* synthetic */ C0I60[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0I60 START;

    public static InterfaceC2044707zh<C0I60> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I60 c0i60 = new C0I60("START", 0);
        START = c0i60;
        C0I60 c0i602 = new C0I60("END", 1);
        END = c0i602;
        C0I60[] c0i60Arr = {c0i60, c0i602};
        LL = c0i60Arr;
        LLILLJJLI = new C2254308sP(c0i60Arr);
    }

    public static C0I60[] values() {
        return (C0I60[]) LL.clone();
    }

    public static C0I60 valueOf(String str) {
        return (C0I60) C08FF.LIZ(C0I60.class, str);
    }

    public C0I60(String str, int i) {
    }
}
