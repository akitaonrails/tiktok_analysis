package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18JV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18JV {
    public static final C18JV BACK;
    public static final C18JV CLICK_CANCEL;
    public static final C18JV CLICK_PREVIEW;
    public static final /* synthetic */ C18JV[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C18JV SAVE;
    public static final C18JV SAVE_AND_POST;
    public static final C18JV SHOW;

    public static InterfaceC2044707zh<C18JV> getEntries() {
        return LLILLJJLI;
    }

    static {
        C18JV c18jv = new C18JV("SHOW", 0);
        SHOW = c18jv;
        C18JV c18jv2 = new C18JV("CLICK_CANCEL", 1);
        CLICK_CANCEL = c18jv2;
        C18JV c18jv3 = new C18JV("CLICK_PREVIEW", 2);
        CLICK_PREVIEW = c18jv3;
        C18JV c18jv4 = new C18JV("SAVE", 3);
        SAVE = c18jv4;
        C18JV c18jv5 = new C18JV("SAVE_AND_POST", 4);
        SAVE_AND_POST = c18jv5;
        C18JV c18jv6 = new C18JV("BACK", 5);
        BACK = c18jv6;
        C18JV[] c18jvArr = {c18jv, c18jv2, c18jv3, c18jv4, c18jv5, c18jv6};
        LL = c18jvArr;
        LLILLJJLI = new C2254308sP(c18jvArr);
    }

    public static C18JV[] values() {
        return (C18JV[]) LL.clone();
    }

    public static C18JV valueOf(String str) {
        return (C18JV) C08FF.LIZ(C18JV.class, str);
    }

    public C18JV(String str, int i) {
    }
}
