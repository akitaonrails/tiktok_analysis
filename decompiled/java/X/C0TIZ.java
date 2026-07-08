package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TIZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TIZ {
    public static final C0TIZ CODE;
    public static final /* synthetic */ C0TIZ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "code";

    public static InterfaceC2044707zh<C0TIZ> getEntries() {
        return LLILLL;
    }

    static {
        C0TIZ c0tiz = new C0TIZ();
        CODE = c0tiz;
        C0TIZ[] c0tizArr = {c0tiz};
        LLILLJJLI = c0tizArr;
        LLILLL = new C2254308sP(c0tizArr);
    }

    public static C0TIZ[] values() {
        return (C0TIZ[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0TIZ valueOf(String str) {
        return (C0TIZ) C08FF.LIZ(C0TIZ.class, str);
    }
}
