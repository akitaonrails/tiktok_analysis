package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FHH, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FHH {
    public static final C0FHH ATTACHED;
    public static final C0FHH DETACHED;
    public static final C0FHH HIDDEN;
    public static final /* synthetic */ C0FHH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0FHH VISIBLE;

    public static InterfaceC2044707zh<C0FHH> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FHH c0fhh = new C0FHH("DETACHED", 0);
        DETACHED = c0fhh;
        C0FHH c0fhh2 = new C0FHH("ATTACHED", 1);
        ATTACHED = c0fhh2;
        C0FHH c0fhh3 = new C0FHH("VISIBLE", 2);
        VISIBLE = c0fhh3;
        C0FHH c0fhh4 = new C0FHH("HIDDEN", 3);
        HIDDEN = c0fhh4;
        C0FHH[] c0fhhArr = {c0fhh, c0fhh2, c0fhh3, c0fhh4};
        LL = c0fhhArr;
        LLILLJJLI = new C2254308sP(c0fhhArr);
    }

    public static C0FHH[] values() {
        return (C0FHH[]) LL.clone();
    }

    public static C0FHH valueOf(String str) {
        return (C0FHH) C08FF.LIZ(C0FHH.class, str);
    }

    public C0FHH(String str, int i) {
    }
}
