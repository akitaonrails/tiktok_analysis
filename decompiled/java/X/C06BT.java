package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06BT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06BT {
    public static final C06BT FULL_ANIMATION;
    public static final /* synthetic */ C06BT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06BT REMIND_IN_APP_PUSH;
    public static final C06BT UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<C06BT> getEntries() {
        return LLILLL;
    }

    static {
        C06BT c06bt = new C06BT("UNKNOWN", 0, "streak_unknown");
        UNKNOWN = c06bt;
        C06BT c06bt2 = new C06BT("REMIND_IN_APP_PUSH", 1, "remind_in_app_push");
        REMIND_IN_APP_PUSH = c06bt2;
        C06BT c06bt3 = new C06BT("FULL_ANIMATION", 2, "full_animation");
        FULL_ANIMATION = c06bt3;
        C06BT[] c06btArr = {c06bt, c06bt2, c06bt3};
        LLILLJJLI = c06btArr;
        LLILLL = new C2254308sP(c06btArr);
    }

    public static C06BT[] values() {
        return (C06BT[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C06BT valueOf(String str) {
        return (C06BT) C08FF.LIZ(C06BT.class, str);
    }

    public C06BT(String str, int i, String str2) {
        this.LL = str2;
    }
}
