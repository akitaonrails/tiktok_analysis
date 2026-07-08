package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06RF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06RF {
    public static final /* synthetic */ C06RF[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C06RF MESSAGE_GET;
    public static final C06RF MESSAGE_SEND;

    public static InterfaceC2044707zh<C06RF> getEntries() {
        return LLILLJJLI;
    }

    static {
        C06RF c06rf = new C06RF("MESSAGE_SEND", 0);
        MESSAGE_SEND = c06rf;
        C06RF c06rf2 = new C06RF("MESSAGE_GET", 1);
        MESSAGE_GET = c06rf2;
        C06RF[] c06rfArr = {c06rf, c06rf2};
        LL = c06rfArr;
        LLILLJJLI = new C2254308sP(c06rfArr);
    }

    public static C06RF[] values() {
        return (C06RF[]) LL.clone();
    }

    public static C06RF valueOf(String str) {
        return (C06RF) C08FF.LIZ(C06RF.class, str);
    }

    public C06RF(String str, int i) {
    }
}
