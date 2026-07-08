package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TET, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TET {
    public static final /* synthetic */ C0TET[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0TET WIRED;
    public static final C0TET WIRELESS;

    public static InterfaceC2044707zh<C0TET> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0TET c0tet = new C0TET("WIRELESS", 0);
        WIRELESS = c0tet;
        C0TET c0tet2 = new C0TET("WIRED", 1);
        WIRED = c0tet2;
        C0TET[] c0tetArr = {c0tet, c0tet2};
        LL = c0tetArr;
        LLILLJJLI = new C2254308sP(c0tetArr);
    }

    public static C0TET[] values() {
        return (C0TET[]) LL.clone();
    }

    public static C0TET valueOf(String str) {
        return (C0TET) C08FF.LIZ(C0TET.class, str);
    }

    public C0TET(String str, int i) {
    }
}
