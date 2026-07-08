package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Y97, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y97 {
    public static final C0Y97 ALL;
    public static final /* synthetic */ C0Y97[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0Y97 READ;
    public static final C0Y97 UNREAD;

    public static InterfaceC2044707zh<C0Y97> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0Y97 c0y97 = new C0Y97("ALL", 0);
        ALL = c0y97;
        C0Y97 c0y972 = new C0Y97("UNREAD", 1);
        UNREAD = c0y972;
        C0Y97 c0y973 = new C0Y97("READ", 2);
        READ = c0y973;
        C0Y97[] c0y97Arr = {c0y97, c0y972, c0y973};
        LL = c0y97Arr;
        LLILLJJLI = new C2254308sP(c0y97Arr);
    }

    public static C0Y97[] values() {
        return (C0Y97[]) LL.clone();
    }

    public static C0Y97 valueOf(String str) {
        return (C0Y97) C08FF.LIZ(C0Y97.class, str);
    }

    public C0Y97(String str, int i) {
    }
}
