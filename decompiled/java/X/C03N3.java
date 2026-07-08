package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03N3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03N3 {
    public static final /* synthetic */ C03N3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03N3 LYNX_POPUP_SCENE;
    public static final C03N3 NATIVE_SCENE;
    public final int LL;

    public static InterfaceC2044707zh<C03N3> getEntries() {
        return LLILLL;
    }

    static {
        C03N3 c03n3 = new C03N3("NATIVE_SCENE", 0, 0);
        NATIVE_SCENE = c03n3;
        C03N3 c03n32 = new C03N3("LYNX_POPUP_SCENE", 1, 1);
        LYNX_POPUP_SCENE = c03n32;
        C03N3[] c03n3Arr = {c03n3, c03n32};
        LLILLJJLI = c03n3Arr;
        LLILLL = new C2254308sP(c03n3Arr);
    }

    public static C03N3[] values() {
        return (C03N3[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03N3 valueOf(String str) {
        return (C03N3) C08FF.LIZ(C03N3.class, str);
    }

    public C03N3(String str, int i, int i2) {
        this.LL = i2;
    }
}
