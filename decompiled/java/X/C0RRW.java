package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RRW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RRW {
    public static final C0RRW BOTTOM;
    public static final C0RRW DISABLED;
    public static final /* synthetic */ C0RRW[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0RRW TOP;

    public static InterfaceC2044707zh<C0RRW> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0RRW c0rrw = new C0RRW("TOP", 0);
        TOP = c0rrw;
        C0RRW c0rrw2 = new C0RRW("BOTTOM", 1);
        BOTTOM = c0rrw2;
        C0RRW c0rrw3 = new C0RRW("DISABLED", 2);
        DISABLED = c0rrw3;
        C0RRW[] c0rrwArr = {c0rrw, c0rrw2, c0rrw3};
        LL = c0rrwArr;
        LLILLJJLI = new C2254308sP(c0rrwArr);
    }

    public static C0RRW[] values() {
        return (C0RRW[]) LL.clone();
    }

    public static C0RRW valueOf(String str) {
        return (C0RRW) C08FF.LIZ(C0RRW.class, str);
    }

    public C0RRW(String str, int i) {
    }
}
