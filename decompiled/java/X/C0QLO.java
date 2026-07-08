package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QLO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QLO {
    public static final C0QLO HOMEPAGE_MALL;
    public static final /* synthetic */ C0QLO[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QLO MALL;
    public static final C0QLO NO_MALL;

    public static InterfaceC2044707zh<C0QLO> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QLO c0qlo = new C0QLO("MALL", 0);
        MALL = c0qlo;
        C0QLO c0qlo2 = new C0QLO("HOMEPAGE_MALL", 1);
        HOMEPAGE_MALL = c0qlo2;
        C0QLO c0qlo3 = new C0QLO("NO_MALL", 2);
        NO_MALL = c0qlo3;
        C0QLO[] c0qloArr = {c0qlo, c0qlo2, c0qlo3};
        LL = c0qloArr;
        LLILLJJLI = new C2254308sP(c0qloArr);
    }

    public static C0QLO[] values() {
        return (C0QLO[]) LL.clone();
    }

    public static C0QLO valueOf(String str) {
        return (C0QLO) C08FF.LIZ(C0QLO.class, str);
    }

    public C0QLO(String str, int i) {
    }
}
