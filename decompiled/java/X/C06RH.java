package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06RH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06RH {
    public static final C06RH CHAT_NOTICE;
    public static final C06RH CONTROLLER;
    public static final /* synthetic */ C06RH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C06RH ROOM;
    public static final C06RH SDK;
    public static final C06RH SHARED;
    public final String LL;

    public static InterfaceC2044707zh<C06RH> getEntries() {
        return LLILLL;
    }

    static {
        C06RH c06rh = new C06RH("SHARED", 0, "Shared");
        SHARED = c06rh;
        C06RH c06rh2 = new C06RH("CONTROLLER", 1, "Controller");
        CONTROLLER = c06rh2;
        C06RH c06rh3 = new C06RH("ROOM", 2, "Room");
        ROOM = c06rh3;
        C06RH c06rh4 = new C06RH("SDK", 3, "SDK");
        SDK = c06rh4;
        C06RH c06rh5 = new C06RH("CHAT_NOTICE", 4, "Chat Notice");
        CHAT_NOTICE = c06rh5;
        C06RH[] c06rhArr = {c06rh, c06rh2, c06rh3, c06rh4, c06rh5};
        LLILLJJLI = c06rhArr;
        LLILLL = new C2254308sP(c06rhArr);
    }

    public static C06RH[] values() {
        return (C06RH[]) LLILLJJLI.clone();
    }

    public final String getTitle() {
        return this.LL;
    }

    public static C06RH valueOf(String str) {
        return (C06RH) C08FF.LIZ(C06RH.class, str);
    }

    public C06RH(String str, int i, String str2) {
        this.LL = str2;
    }
}
