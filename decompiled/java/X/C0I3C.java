package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I3C, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I3C {
    public static final C0I3C DRAFT;
    public static final /* synthetic */ C0I3C[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0I3C LONG_CLICK;
    public static final C0I3C PUSH_NOTIFICATION;
    public static final C0I3C REPLY_ICON;
    public static final C0I3C STORY_VIEWER_LIST_REPLY;
    public static final C0I3C SWIPE_TO_REPLY;
    public static final C0I3C THOUGHT_BUBBLE;

    public static InterfaceC2044707zh<C0I3C> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I3C c0i3c = new C0I3C("PUSH_NOTIFICATION", 0);
        PUSH_NOTIFICATION = c0i3c;
        C0I3C c0i3c2 = new C0I3C("LONG_CLICK", 1);
        LONG_CLICK = c0i3c2;
        C0I3C c0i3c3 = new C0I3C("REPLY_ICON", 2);
        REPLY_ICON = c0i3c3;
        C0I3C c0i3c4 = new C0I3C("SWIPE_TO_REPLY", 3);
        SWIPE_TO_REPLY = c0i3c4;
        C0I3C c0i3c5 = new C0I3C("DRAFT", 4);
        DRAFT = c0i3c5;
        C0I3C c0i3c6 = new C0I3C("STORY_VIEWER_LIST_REPLY", 5);
        STORY_VIEWER_LIST_REPLY = c0i3c6;
        C0I3C c0i3c7 = new C0I3C("THOUGHT_BUBBLE", 6);
        THOUGHT_BUBBLE = c0i3c7;
        C0I3C[] c0i3cArr = {c0i3c, c0i3c2, c0i3c3, c0i3c4, c0i3c5, c0i3c6, c0i3c7};
        LL = c0i3cArr;
        LLILLJJLI = new C2254308sP(c0i3cArr);
    }

    public static C0I3C[] values() {
        return (C0I3C[]) LL.clone();
    }

    public static C0I3C valueOf(String str) {
        return (C0I3C) C08FF.LIZ(C0I3C.class, str);
    }

    public C0I3C(String str, int i) {
    }
}
