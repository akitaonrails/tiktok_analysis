package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ISO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0ISO {
    public static final C0ISO HOMEPAGE_HOT;
    public static final C0ISO INNER_FEED;
    public static final /* synthetic */ C0ISO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0ISO> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ISO c0iso = new C0ISO("INNER_FEED", 0);
        INNER_FEED = c0iso;
        C0ISO c0iso2 = new C0ISO("HOMEPAGE_HOT", 1);
        HOMEPAGE_HOT = c0iso2;
        C0ISO[] c0isoArr = {c0iso, c0iso2};
        LL = c0isoArr;
        LLILLJJLI = new C2254308sP(c0isoArr);
    }

    public static C0ISO[] values() {
        return (C0ISO[]) LL.clone();
    }

    public static C0ISO valueOf(String str) {
        return (C0ISO) C08FF.LIZ(C0ISO.class, str);
    }

    public C0ISO(String str, int i) {
    }
}
