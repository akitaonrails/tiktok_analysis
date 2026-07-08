package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.017X, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C017X {
    public static final C017X ACTIVITY_IS_NULL;
    public static final C017X ACTIVITY_STATUS_ERROR;
    public static final /* synthetic */ C017X[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C017X NETWORK_ERROR;
    public static final C017X SUCCESS;
    public static final C017X UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<C017X> getEntries() {
        return LLILLL;
    }

    static {
        C017X c017x = new C017X("UNKNOWN", 0, "100");
        UNKNOWN = c017x;
        C017X c017x2 = new C017X("SUCCESS", 1, CardStruct.IStatusCode.DEFAULT);
        SUCCESS = c017x2;
        C017X c017x3 = new C017X("ACTIVITY_IS_NULL", 2, "1");
        ACTIVITY_IS_NULL = c017x3;
        C017X c017x4 = new C017X("ACTIVITY_STATUS_ERROR", 3, "2");
        ACTIVITY_STATUS_ERROR = c017x4;
        C017X c017x5 = new C017X("NETWORK_ERROR", 4, "3");
        NETWORK_ERROR = c017x5;
        C017X[] c017xArr = {c017x, c017x2, c017x3, c017x4, c017x5};
        LLILLJJLI = c017xArr;
        LLILLL = new C2254308sP(c017xArr);
    }

    public static C017X[] values() {
        return (C017X[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C017X valueOf(String str) {
        return (C017X) C08FF.LIZ(C017X.class, str);
    }

    public C017X(String str, int i, String str2) {
        this.LL = str2;
    }
}
