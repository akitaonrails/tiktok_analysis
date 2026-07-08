package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U0I, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U0I {
    public static final C0U0I ADD_FAV;
    public static final C0U0I ADD_TO_QUEUE;
    public static final C0U0I CANCEL_REQUEST_FOR_SELF;
    public static final C0U0I HANDLE_SINGER_REQUEST;
    public static final /* synthetic */ C0U0I[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0U0I PINTOP;
    public static final C0U0I REMOVE_FAV;
    public static final C0U0I REMOVE_FROM_QUEUE;
    public static final C0U0I REQUEST;
    public static final C0U0I REQUEST_FOR_SELF;

    public static InterfaceC2044707zh<C0U0I> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0U0I c0u0i = new C0U0I("ADD_FAV", 0);
        ADD_FAV = c0u0i;
        C0U0I c0u0i2 = new C0U0I("REMOVE_FAV", 1);
        REMOVE_FAV = c0u0i2;
        C0U0I c0u0i3 = new C0U0I("REQUEST", 2);
        REQUEST = c0u0i3;
        C0U0I c0u0i4 = new C0U0I("ADD_TO_QUEUE", 3);
        ADD_TO_QUEUE = c0u0i4;
        C0U0I c0u0i5 = new C0U0I("REMOVE_FROM_QUEUE", 4);
        REMOVE_FROM_QUEUE = c0u0i5;
        C0U0I c0u0i6 = new C0U0I("PINTOP", 5);
        PINTOP = c0u0i6;
        C0U0I c0u0i7 = new C0U0I("REQUEST_FOR_SELF", 6);
        REQUEST_FOR_SELF = c0u0i7;
        C0U0I c0u0i8 = new C0U0I("CANCEL_REQUEST_FOR_SELF", 7);
        CANCEL_REQUEST_FOR_SELF = c0u0i8;
        C0U0I c0u0i9 = new C0U0I("HANDLE_SINGER_REQUEST", 8);
        HANDLE_SINGER_REQUEST = c0u0i9;
        C0U0I[] c0u0iArr = {c0u0i, c0u0i2, c0u0i3, c0u0i4, c0u0i5, c0u0i6, c0u0i7, c0u0i8, c0u0i9};
        LL = c0u0iArr;
        LLILLJJLI = new C2254308sP(c0u0iArr);
    }

    public static C0U0I[] values() {
        return (C0U0I[]) LL.clone();
    }

    public static C0U0I valueOf(String str) {
        return (C0U0I) C08FF.LIZ(C0U0I.class, str);
    }

    public C0U0I(String str, int i) {
    }
}
