package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N6I, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N6I {
    public static final /* synthetic */ C0N6I[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N6I PHOTO;
    public static final C0N6I VIDEO;

    public static InterfaceC2044707zh<C0N6I> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N6I c0n6i = new C0N6I("VIDEO", 0);
        VIDEO = c0n6i;
        C0N6I c0n6i2 = new C0N6I("PHOTO", 1);
        PHOTO = c0n6i2;
        C0N6I[] c0n6iArr = {c0n6i, c0n6i2};
        LL = c0n6iArr;
        LLILLJJLI = new C2254308sP(c0n6iArr);
    }

    public static C0N6I[] values() {
        return (C0N6I[]) LL.clone();
    }

    public static C0N6I valueOf(String str) {
        return (C0N6I) C08FF.LIZ(C0N6I.class, str);
    }

    public C0N6I(String str, int i) {
    }
}
