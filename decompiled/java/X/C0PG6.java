package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PG6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PG6 {
    public static final /* synthetic */ C0PG6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0PG6 OTHER;
    public static final C0PG6 PHOTO;
    public static final C0PG6 USER;
    public static final C0PG6 VIDEO;

    public static InterfaceC2044707zh<C0PG6> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0PG6 c0pg6 = new C0PG6("VIDEO", 0);
        VIDEO = c0pg6;
        C0PG6 c0pg62 = new C0PG6("USER", 1);
        USER = c0pg62;
        C0PG6 c0pg63 = new C0PG6("PHOTO", 2);
        PHOTO = c0pg63;
        C0PG6 c0pg64 = new C0PG6("OTHER", 3);
        OTHER = c0pg64;
        C0PG6[] c0pg6Arr = {c0pg6, c0pg62, c0pg63, c0pg64};
        LL = c0pg6Arr;
        LLILLJJLI = new C2254308sP(c0pg6Arr);
    }

    public static C0PG6[] values() {
        return (C0PG6[]) LL.clone();
    }

    public static C0PG6 valueOf(String str) {
        return (C0PG6) C08FF.LIZ(C0PG6.class, str);
    }

    public C0PG6(String str, int i) {
    }
}
