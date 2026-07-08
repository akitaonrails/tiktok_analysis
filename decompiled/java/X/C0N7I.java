package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N7I, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N7I {
    public static final C0N7I CONSUME_EFFECT_MESSAGE;
    public static final C0N7I CONSUME_MESSAGE;
    public static final /* synthetic */ C0N7I[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0N7I LOAD_RESOURCE_SUCCESS;
    public static final C0N7I PLAYCONTROLLER_END;
    public static final C0N7I PLAYCONTROLLER_RECEIVE;
    public static final C0N7I PLAYCONTROLLER_START;
    public static final C0N7I RECEIVE_MESSAGE;

    public static InterfaceC2044707zh<C0N7I> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0N7I c0n7i = new C0N7I("RECEIVE_MESSAGE", 0);
        RECEIVE_MESSAGE = c0n7i;
        C0N7I c0n7i2 = new C0N7I("CONSUME_MESSAGE", 1);
        CONSUME_MESSAGE = c0n7i2;
        C0N7I c0n7i3 = new C0N7I("LOAD_RESOURCE_SUCCESS", 2);
        LOAD_RESOURCE_SUCCESS = c0n7i3;
        C0N7I c0n7i4 = new C0N7I("CONSUME_EFFECT_MESSAGE", 3);
        CONSUME_EFFECT_MESSAGE = c0n7i4;
        C0N7I c0n7i5 = new C0N7I("PLAYCONTROLLER_RECEIVE", 4);
        PLAYCONTROLLER_RECEIVE = c0n7i5;
        C0N7I c0n7i6 = new C0N7I("PLAYCONTROLLER_START", 5);
        PLAYCONTROLLER_START = c0n7i6;
        C0N7I c0n7i7 = new C0N7I("PLAYCONTROLLER_END", 6);
        PLAYCONTROLLER_END = c0n7i7;
        C0N7I[] c0n7iArr = {c0n7i, c0n7i2, c0n7i3, c0n7i4, c0n7i5, c0n7i6, c0n7i7};
        LL = c0n7iArr;
        LLILLJJLI = new C2254308sP(c0n7iArr);
    }

    public static C0N7I[] values() {
        return (C0N7I[]) LL.clone();
    }

    public static C0N7I valueOf(String str) {
        return (C0N7I) C08FF.LIZ(C0N7I.class, str);
    }

    public C0N7I(String str, int i) {
    }
}
