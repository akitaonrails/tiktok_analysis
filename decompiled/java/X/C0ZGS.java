package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZGS, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZGS {
    public static final C0ZGS EMOJI;
    public static final /* synthetic */ C0ZGS[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0ZGS NONE;
    public static final C0ZGS STICKER;

    public static InterfaceC2044707zh<C0ZGS> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZGS c0zgs = new C0ZGS("NONE", 0);
        NONE = c0zgs;
        C0ZGS c0zgs2 = new C0ZGS("EMOJI", 1);
        EMOJI = c0zgs2;
        C0ZGS c0zgs3 = new C0ZGS("STICKER", 2);
        STICKER = c0zgs3;
        C0ZGS[] c0zgsArr = {c0zgs, c0zgs2, c0zgs3};
        LL = c0zgsArr;
        LLILLJJLI = new C2254308sP(c0zgsArr);
    }

    public static C0ZGS[] values() {
        return (C0ZGS[]) LL.clone();
    }

    public final boolean isQuickReply() {
        return this != NONE;
    }

    public static C0ZGS valueOf(String str) {
        return (C0ZGS) C08FF.LIZ(C0ZGS.class, str);
    }

    public C0ZGS(String str, int i) {
    }
}
