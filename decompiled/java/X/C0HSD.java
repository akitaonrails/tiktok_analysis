package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HSD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HSD {
    public static final C0HSD DEFAULT;
    public static final /* synthetic */ C0HSD[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0HSD> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0HSD c0hsd = new C0HSD();
        DEFAULT = c0hsd;
        C0HSD[] c0hsdArr = {c0hsd};
        LL = c0hsdArr;
        LLILLJJLI = new C2254308sP(c0hsdArr);
    }

    public static C0HSD[] values() {
        return (C0HSD[]) LL.clone();
    }

    public static C0HSD valueOf(String str) {
        return (C0HSD) C08FF.LIZ(C0HSD.class, str);
    }
}
