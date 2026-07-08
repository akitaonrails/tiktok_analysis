package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QET, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QET implements InterfaceC19882712qn<Object, String> {
    public static final C0QET LL;
    public static final /* synthetic */ C0QET[] LLILLJJLI;

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.toStringFunction()";
    }

    static {
        C0QET c0qet = new C0QET();
        LL = c0qet;
        LLILLJJLI = new C0QET[]{c0qet};
    }

    public static C0QET[] values() {
        return (C0QET[]) LLILLJJLI.clone();
    }

    public static C0QET valueOf(String str) {
        return (C0QET) C08FF.LIZ(C0QET.class, str);
    }

    @Override // X.InterfaceC19882712qn
    public final String apply(Object obj) {
        obj.getClass();
        return obj.toString();
    }
}
