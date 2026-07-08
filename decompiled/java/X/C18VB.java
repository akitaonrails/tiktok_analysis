package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18VB, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18VB {
    public static final C18VB COPY_TEXT;
    public static final C18VB DELETE_MESSAGE;
    public static final C18VB DISMISS;
    public static final /* synthetic */ C18VB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C18VB POST_IMAGE;
    public static final C18VB SAVE_IMAGE;
    public static final C18VB SEND_IMAGE_TO;

    public static InterfaceC2044707zh<C18VB> getEntries() {
        return LLILLJJLI;
    }

    static {
        C18VB c18vb = new C18VB("POST_IMAGE", 0);
        POST_IMAGE = c18vb;
        C18VB c18vb2 = new C18VB("SEND_IMAGE_TO", 1);
        SEND_IMAGE_TO = c18vb2;
        C18VB c18vb3 = new C18VB("SAVE_IMAGE", 2);
        SAVE_IMAGE = c18vb3;
        C18VB c18vb4 = new C18VB("COPY_TEXT", 3);
        COPY_TEXT = c18vb4;
        C18VB c18vb5 = new C18VB("DELETE_MESSAGE", 4);
        DELETE_MESSAGE = c18vb5;
        C18VB c18vb6 = new C18VB("DISMISS", 5);
        DISMISS = c18vb6;
        C18VB[] c18vbArr = {c18vb, c18vb2, c18vb3, c18vb4, c18vb5, c18vb6};
        LL = c18vbArr;
        LLILLJJLI = new C2254308sP(c18vbArr);
    }

    public static C18VB[] values() {
        return (C18VB[]) LL.clone();
    }

    /* JADX INFO: renamed from: getDismiss, reason: merged with bridge method [inline-methods] */
    public C18VB m99getDismiss() {
        return DISMISS;
    }

    public static C18VB valueOf(String str) {
        return (C18VB) C08FF.LIZ(C18VB.class, str);
    }

    public C18VB(String str, int i) {
    }
}
