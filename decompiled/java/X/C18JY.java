package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18JY, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18JY {
    public static final C18JY CLICK;
    public static final C18JY DISAPPEAR;
    public static final /* synthetic */ C18JY[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C18JY RECEIVE;
    public static final C18JY SHOW;

    public static InterfaceC2044707zh<C18JY> getEntries() {
        return LLILLJJLI;
    }

    static {
        C18JY c18jy = new C18JY("SHOW", 0);
        SHOW = c18jy;
        C18JY c18jy2 = new C18JY("CLICK", 1);
        CLICK = c18jy2;
        C18JY c18jy3 = new C18JY("DISAPPEAR", 2);
        DISAPPEAR = c18jy3;
        C18JY c18jy4 = new C18JY("RECEIVE", 3);
        RECEIVE = c18jy4;
        C18JY[] c18jyArr = {c18jy, c18jy2, c18jy3, c18jy4};
        LL = c18jyArr;
        LLILLJJLI = new C2254308sP(c18jyArr);
    }

    public static C18JY[] values() {
        return (C18JY[]) LL.clone();
    }

    public static C18JY valueOf(String str) {
        return (C18JY) C08FF.LIZ(C18JY.class, str);
    }

    public C18JY(String str, int i) {
    }
}
