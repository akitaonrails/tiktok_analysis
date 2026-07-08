package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FHF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FHF {
    public static final C0FHF CLICK;
    public static final /* synthetic */ C0FHF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0FHF SLIDE;
    public final String LL;

    public static InterfaceC2044707zh<C0FHF> getEntries() {
        return LLILLL;
    }

    static {
        C0FHF c0fhf = new C0FHF("CLICK", 0, "click");
        CLICK = c0fhf;
        C0FHF c0fhf2 = new C0FHF("SLIDE", 1, "slide");
        SLIDE = c0fhf2;
        C0FHF[] c0fhfArr = {c0fhf, c0fhf2};
        LLILLJJLI = c0fhfArr;
        LLILLL = new C2254308sP(c0fhfArr);
    }

    public static C0FHF[] values() {
        return (C0FHF[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0FHF valueOf(String str) {
        return (C0FHF) C08FF.LIZ(C0FHF.class, str);
    }

    public C0FHF(String str, int i, String str2) {
        this.LL = str2;
    }
}
