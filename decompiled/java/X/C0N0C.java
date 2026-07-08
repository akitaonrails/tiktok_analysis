package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N0C, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N0C {
    public static final /* synthetic */ C0N0C[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N0C SELECTED_LIST_NOT_EMPTY;

    public static InterfaceC2044707zh<C0N0C> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N0C c0n0c = new C0N0C();
        SELECTED_LIST_NOT_EMPTY = c0n0c;
        C0N0C[] c0n0cArr = {c0n0c};
        LL = c0n0cArr;
        LLILLJJLI = new C2254308sP(c0n0cArr);
    }

    public static C0N0C[] values() {
        return (C0N0C[]) LL.clone();
    }

    public static C0N0C valueOf(String str) {
        return (C0N0C) C08FF.LIZ(C0N0C.class, str);
    }
}
