package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AEI, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AEI {
    public static final C1AEI LL;
    public static final C1AEI LLILLJJLI;
    public static final C1AEI LLILLL;
    public static final /* synthetic */ C1AEI[] LLILZ;

    static {
        C1AEI c1aei = new C1AEI("DISABLED", 0);
        LL = c1aei;
        C1AEI c1aei2 = new C1AEI("PLAYING_ONLY", 1);
        LLILLJJLI = c1aei2;
        C1AEI c1aei3 = new C1AEI("STRICT", 2);
        LLILLL = c1aei3;
        C1AEI[] c1aeiArr = {c1aei, c1aei2, c1aei3};
        LLILZ = c1aeiArr;
        new C2254308sP(c1aeiArr);
    }

    public static C1AEI[] values() {
        return (C1AEI[]) LLILZ.clone();
    }

    public static C1AEI valueOf(String str) {
        return (C1AEI) C08FF.LIZ(C1AEI.class, str);
    }

    public C1AEI(String str, int i) {
    }
}
