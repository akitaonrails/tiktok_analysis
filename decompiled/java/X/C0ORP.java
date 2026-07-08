package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ORP, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ORP {
    public static final C0ORP ARCHIVE;
    public static final C0ORP CLEAR_UNREAD;
    public static final C0ORP DELETE;
    public static final /* synthetic */ C0ORP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0ORP MUTE;
    public static final C0ORP NONE;
    public static final C0ORP PIN;
    public final int LL;

    public static InterfaceC2044707zh<C0ORP> getEntries() {
        return LLILLL;
    }

    static {
        C0ORP c0orp = new C0ORP("NONE", 0, 0);
        NONE = c0orp;
        C0ORP c0orp2 = new C0ORP("PIN", 1, 1);
        PIN = c0orp2;
        C0ORP c0orp3 = new C0ORP("DELETE", 2, 2);
        DELETE = c0orp3;
        C0ORP c0orp4 = new C0ORP("MUTE", 3, 3);
        MUTE = c0orp4;
        C0ORP c0orp5 = new C0ORP("ARCHIVE", 4, 4);
        ARCHIVE = c0orp5;
        C0ORP c0orp6 = new C0ORP("CLEAR_UNREAD", 5, 99);
        CLEAR_UNREAD = c0orp6;
        C0ORP[] c0orpArr = {c0orp, c0orp2, c0orp3, c0orp4, c0orp5, c0orp6};
        LLILLJJLI = c0orpArr;
        LLILLL = new C2254308sP(c0orpArr);
    }

    public static C0ORP[] values() {
        return (C0ORP[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0ORP valueOf(String str) {
        return (C0ORP) C08FF.LIZ(C0ORP.class, str);
    }

    public C0ORP(String str, int i, int i2) {
        this.LL = i2;
    }
}
