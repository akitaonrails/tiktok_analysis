package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IJW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IJW {
    public static final C0IJW LL;
    public static final C0IJW LLILLJJLI;
    public static final C0IJW LLILLL;
    public static final C0IJW LLILZ;
    public static final C0IJW LLILZIL;
    public static final C0IJW LLILZLL;
    public static final /* synthetic */ C0IJW[] LLIZ;

    static {
        C0IJW c0ijw = new C0IJW("INIT", 0);
        C0IJW c0ijw2 = new C0IJW("HOST_VISIBILITY_CHANGED", 1);
        LL = c0ijw2;
        C0IJW c0ijw3 = new C0IJW("LEGACY_SHOW_ANIM_END", 2);
        LLILLJJLI = c0ijw3;
        C0IJW c0ijw4 = new C0IJW("PROGRESS_SETTLE_SHOWN", 3);
        LLILLL = c0ijw4;
        C0IJW c0ijw5 = new C0IJW("PROGRESS_SETTLE_HIDDEN", 4);
        LLILZ = c0ijw5;
        C0IJW c0ijw6 = new C0IJW("BACK_TO_FEED", 5);
        LLILZIL = c0ijw6;
        C0IJW c0ijw7 = new C0IJW("RELEASE_OR_DELETE", 6);
        LLILZLL = c0ijw7;
        C0IJW[] c0ijwArr = {c0ijw, c0ijw2, c0ijw3, c0ijw4, c0ijw5, c0ijw6, c0ijw7};
        LLIZ = c0ijwArr;
        new C2254308sP(c0ijwArr);
    }

    public static C0IJW[] values() {
        return (C0IJW[]) LLIZ.clone();
    }

    public static C0IJW valueOf(String str) {
        return (C0IJW) C08FF.LIZ(C0IJW.class, str);
    }

    public C0IJW(String str, int i) {
    }
}
