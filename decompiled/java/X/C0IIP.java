package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IIP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IIP {
    public static final C0IIP CAPTION;
    public static final /* synthetic */ C0IIP[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0IIP ROOM_DISABLE_RECORD;
    public static final C0IIP STREAM_TRANSLATION;

    public static InterfaceC2044707zh<C0IIP> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IIP c0iip = new C0IIP("ROOM_DISABLE_RECORD", 0);
        ROOM_DISABLE_RECORD = c0iip;
        C0IIP c0iip2 = new C0IIP("CAPTION", 1);
        CAPTION = c0iip2;
        C0IIP c0iip3 = new C0IIP("STREAM_TRANSLATION", 2);
        STREAM_TRANSLATION = c0iip3;
        C0IIP[] c0iipArr = {c0iip, c0iip2, c0iip3};
        LL = c0iipArr;
        LLILLJJLI = new C2254308sP(c0iipArr);
    }

    public static C0IIP[] values() {
        return (C0IIP[]) LL.clone();
    }

    public static C0IIP valueOf(String str) {
        return (C0IIP) C08FF.LIZ(C0IIP.class, str);
    }

    public C0IIP(String str, int i) {
    }
}
