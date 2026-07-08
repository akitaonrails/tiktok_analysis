package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0WJ1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WJ1 {
    public static final C0WJ1 FAILED;
    public static final C0WJ1 FAILED_BY_UID;
    public static final C0WJ1 FAILED_BY_VERSION;
    public static final /* synthetic */ C0WJ1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0WJ1 NOT_EXIST;
    public static final C0WJ1 NOT_READY;
    public static final C0WJ1 SUCCESS;
    public final String LL;

    public static InterfaceC2044707zh<C0WJ1> getEntries() {
        return LLILLL;
    }

    static {
        C0WJ1 c0wj1 = new C0WJ1("NOT_READY", 0, CardStruct.IStatusCode.DEFAULT);
        NOT_READY = c0wj1;
        C0WJ1 c0wj12 = new C0WJ1("SUCCESS", 1, "1");
        SUCCESS = c0wj12;
        C0WJ1 c0wj13 = new C0WJ1("FAILED", 2, "2");
        FAILED = c0wj13;
        C0WJ1 c0wj14 = new C0WJ1("NOT_EXIST", 3, "3");
        NOT_EXIST = c0wj14;
        C0WJ1 c0wj15 = new C0WJ1("FAILED_BY_VERSION", 4, "4");
        FAILED_BY_VERSION = c0wj15;
        C0WJ1 c0wj16 = new C0WJ1("FAILED_BY_UID", 5, "5");
        FAILED_BY_UID = c0wj16;
        C0WJ1[] c0wj1Arr = {c0wj1, c0wj12, c0wj13, c0wj14, c0wj15, c0wj16};
        LLILLJJLI = c0wj1Arr;
        LLILLL = new C2254308sP(c0wj1Arr);
    }

    public static C0WJ1[] values() {
        return (C0WJ1[]) LLILLJJLI.clone();
    }

    public final String getState() {
        return this.LL;
    }

    public static C0WJ1 valueOf(String str) {
        return (C0WJ1) C08FF.LIZ(C0WJ1.class, str);
    }

    public C0WJ1(String str, int i, String str2) {
        this.LL = str2;
    }
}
