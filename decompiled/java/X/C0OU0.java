package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OU0, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OU0 {
    public static final /* synthetic */ C0OU0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0OU0 NONE;
    public static final C0OU0 PRE_CREATE;
    public static final C0OU0 PRE_LAYOUT;
    public static final C0OU0 PRE_RENDER;
    public final int LL;

    public static InterfaceC2044707zh<C0OU0> getEntries() {
        return LLILLL;
    }

    static {
        C0OU0 c0ou0 = new C0OU0("NONE", 0, 0);
        NONE = c0ou0;
        C0OU0 c0ou02 = new C0OU0("PRE_CREATE", 1, 1);
        PRE_CREATE = c0ou02;
        C0OU0 c0ou03 = new C0OU0("PRE_RENDER", 2, 2);
        PRE_RENDER = c0ou03;
        C0OU0 c0ou04 = new C0OU0("PRE_LAYOUT", 3, 3);
        PRE_LAYOUT = c0ou04;
        C0OU0[] c0ou0Arr = {c0ou0, c0ou02, c0ou03, c0ou04};
        LLILLJJLI = c0ou0Arr;
        LLILLL = new C2254308sP(c0ou0Arr);
    }

    public static C0OU0[] values() {
        return (C0OU0[]) LLILLJJLI.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public static C0OU0 valueOf(String str) {
        return (C0OU0) C08FF.LIZ(C0OU0.class, str);
    }

    public C0OU0(String str, int i, int i2) {
        this.LL = i2;
    }
}
