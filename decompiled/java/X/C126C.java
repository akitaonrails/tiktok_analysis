package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.126C, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C126C {
    public static final C126D Companion;
    public static final C126C LINEAR;
    public static final /* synthetic */ C126C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL = 0;

    public static InterfaceC2044707zh<C126C> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.126D] */
    static {
        C126C c126c = new C126C();
        LINEAR = c126c;
        C126C[] c126cArr = {c126c};
        LLILLJJLI = c126cArr;
        LLILLL = new C2254308sP(c126cArr);
        Companion = new Object() { // from class: X.126D
        };
    }

    public static C126C[] values() {
        return (C126C[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C126C valueOf(String str) {
        return (C126C) C08FF.LIZ(C126C.class, str);
    }
}
