package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N07, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N07 {
    public static final C0N07 EMPTY_STATE;
    public static final C0N07 LAST_ITEM;
    public static final /* synthetic */ C0N07[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C0N07> getEntries() {
        return LLILLL;
    }

    static {
        C0N07 c0n07 = new C0N07("EMPTY_STATE", 0, 0);
        EMPTY_STATE = c0n07;
        C0N07 c0n072 = new C0N07("LAST_ITEM", 1, 1);
        LAST_ITEM = c0n072;
        C0N07[] c0n07Arr = {c0n07, c0n072};
        LLILLJJLI = c0n07Arr;
        LLILLL = new C2254308sP(c0n07Arr);
    }

    public static C0N07[] values() {
        return (C0N07[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0N07 valueOf(String str) {
        return (C0N07) C08FF.LIZ(C0N07.class, str);
    }

    public C0N07(String str, int i, int i2) {
        this.LL = i2;
    }
}
