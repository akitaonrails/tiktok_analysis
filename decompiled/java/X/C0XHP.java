package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XHP, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XHP {
    public static final C0XHP FAILURE;
    public static final /* synthetic */ C0XHP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0XHP NOT_READY;
    public static final C0XHP READY;

    public static InterfaceC2044707zh<C0XHP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0XHP c0xhp = new C0XHP("NOT_READY", 0);
        NOT_READY = c0xhp;
        C0XHP c0xhp2 = new C0XHP("READY", 1);
        READY = c0xhp2;
        C0XHP c0xhp3 = new C0XHP("FAILURE", 2);
        FAILURE = c0xhp3;
        C0XHP[] c0xhpArr = {c0xhp, c0xhp2, c0xhp3};
        LL = c0xhpArr;
        LLILLJJLI = new C2254308sP(c0xhpArr);
    }

    public static C0XHP[] values() {
        return (C0XHP[]) LL.clone();
    }

    public static C0XHP valueOf(String str) {
        return (C0XHP) C08FF.LIZ(C0XHP.class, str);
    }

    public C0XHP(String str, int i) {
    }
}
