package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X1D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X1D {
    public static final C0X1D CHILD_OTHERS;
    public static final C0X1D CHILD_US;
    public static final C0X1G Companion;
    public static final /* synthetic */ C0X1D[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0X1D NORMAL;
    public static final C0X1D NOT_LOGIN;
    public static final C0X1D UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<C0X1D> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0X1G] */
    static {
        C0X1D c0x1d = new C0X1D("NOT_LOGIN", 0, "-1");
        NOT_LOGIN = c0x1d;
        C0X1D c0x1d2 = new C0X1D("NORMAL", 1, CardStruct.IStatusCode.DEFAULT);
        NORMAL = c0x1d2;
        C0X1D c0x1d3 = new C0X1D("CHILD_US", 2, "1");
        CHILD_US = c0x1d3;
        C0X1D c0x1d4 = new C0X1D("CHILD_OTHERS", 3, "2");
        CHILD_OTHERS = c0x1d4;
        C0X1D c0x1d5 = new C0X1D("UNKNOWN", 4, "");
        UNKNOWN = c0x1d5;
        C0X1D[] c0x1dArr = {c0x1d, c0x1d2, c0x1d3, c0x1d4, c0x1d5};
        LLILLJJLI = c0x1dArr;
        LLILLL = new C2254308sP(c0x1dArr);
        Companion = new Object() { // from class: X.0X1G
        };
    }

    public static C0X1D[] values() {
        return (C0X1D[]) LLILLJJLI.clone();
    }

    public final String getUserType() {
        return this.LL;
    }

    public static C0X1D valueOf(String str) {
        return (C0X1D) C08FF.LIZ(C0X1D.class, str);
    }

    public C0X1D(String str, int i, String str2) {
        this.LL = str2;
    }
}
