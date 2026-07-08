package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0H7J, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H7J {
    public static final C0H7J ALBUM;
    public static final /* synthetic */ C0H7J[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL = "album";

    public static InterfaceC2044707zh<C0H7J> getEntries() {
        return LLILLL;
    }

    static {
        C0H7J c0h7j = new C0H7J();
        ALBUM = c0h7j;
        C0H7J[] c0h7jArr = {c0h7j};
        LLILLJJLI = c0h7jArr;
        LLILLL = new C2254308sP(c0h7jArr);
    }

    public static C0H7J[] values() {
        return (C0H7J[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0H7J valueOf(String str) {
        return (C0H7J) C08FF.LIZ(C0H7J.class, str);
    }
}
