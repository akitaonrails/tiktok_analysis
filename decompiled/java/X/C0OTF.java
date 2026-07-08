package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OTF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OTF {
    public static final C0OTF LL;
    public static final C0OTF LLILLJJLI;
    public static final C0OTF LLILLL;
    public static final C0OTF LLILZ;
    public static final C0OTF LLILZIL;
    public static final /* synthetic */ C0OTF[] LLILZLL;

    static {
        C0OTF c0otf = new C0OTF("IDLE", 0);
        LL = c0otf;
        C0OTF c0otf2 = new C0OTF("LOADING", 1);
        LLILLJJLI = c0otf2;
        C0OTF c0otf3 = new C0OTF("LOADED", 2);
        LLILLL = c0otf3;
        C0OTF c0otf4 = new C0OTF("FAILED", 3);
        LLILZ = c0otf4;
        C0OTF c0otf5 = new C0OTF("FINISH", 4);
        LLILZIL = c0otf5;
        C0OTF[] c0otfArr = {c0otf, c0otf2, c0otf3, c0otf4, c0otf5};
        LLILZLL = c0otfArr;
        new C2254308sP(c0otfArr);
    }

    public static C0OTF[] values() {
        return (C0OTF[]) LLILZLL.clone();
    }

    public static C0OTF valueOf(String str) {
        return (C0OTF) C08FF.LIZ(C0OTF.class, str);
    }

    public C0OTF(String str, int i) {
    }
}
