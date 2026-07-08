package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15DC, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15DC {
    public static final C15DC EMOJI;
    public static final /* synthetic */ C15DC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C15DC MIDDLE;
    public static final C15DC SHOCK;
    public static final C15DC STRONG;
    public static final C15DC WEAK;

    public static InterfaceC2044707zh<C15DC> getEntries() {
        return LLILLJJLI;
    }

    static {
        C15DC c15dc = new C15DC("MIDDLE", 0);
        MIDDLE = c15dc;
        C15DC c15dc2 = new C15DC("WEAK", 1);
        WEAK = c15dc2;
        C15DC c15dc3 = new C15DC("STRONG", 2);
        STRONG = c15dc3;
        C15DC c15dc4 = new C15DC("EMOJI", 3);
        EMOJI = c15dc4;
        C15DC c15dc5 = new C15DC("SHOCK", 4);
        SHOCK = c15dc5;
        C15DC[] c15dcArr = {c15dc, c15dc2, c15dc3, c15dc4, c15dc5};
        LL = c15dcArr;
        LLILLJJLI = new C2254308sP(c15dcArr);
    }

    public static C15DC[] values() {
        return (C15DC[]) LL.clone();
    }

    public static C15DC valueOf(String str) {
        return (C15DC) C08FF.LIZ(C15DC.class, str);
    }

    public C15DC(String str, int i) {
    }
}
