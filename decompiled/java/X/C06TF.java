package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06TF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06TF {
    public static final /* synthetic */ C06TF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06TF LOADED;
    public static final C06TF NOT_LOADED;

    public static InterfaceC2044707zh<C06TF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06TF c06tf = new C06TF("NOT_LOADED", 0);
        NOT_LOADED = c06tf;
        C06TF c06tf2 = new C06TF("LOADED", 1);
        LOADED = c06tf2;
        C06TF[] c06tfArr = {c06tf, c06tf2};
        LL = c06tfArr;
        LLILLJJLI = new C2254308sP(c06tfArr);
    }

    public static C06TF[] values() {
        return (C06TF[]) LL.clone();
    }

    public static C06TF valueOf(String str) {
        return (C06TF) C08FF.LIZ(C06TF.class, str);
    }

    public C06TF(String str, int i) {
    }
}
